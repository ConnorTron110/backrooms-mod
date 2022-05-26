package io.github.backroomsmod.regstration;

import io.github.backroomsmod.BackroomsMod;
import io.github.backroomsmod.entity.level0kp.BacteriaEntity;
import io.github.backroomsmod.entity.level0kp.DeathMothEntity;
import io.github.backroomsmod.utils.Utils;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = BackroomsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntityTypes {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, BackroomsMod.MOD_ID);


    public static final RegistryObject<EntityType<BacteriaEntity>> BACTERIA =
            registerWithEgg("bacteria", EntityType.Builder.of(BacteriaEntity::new, MobCategory.CREATURE).sized(0.8F, 2F), 0x000000, 0x000000);

    public static final RegistryObject<EntityType<DeathMothEntity>> DEATHMOTH =
          registerWithEgg("deathmoth", EntityType.Builder.of( DeathMothEntity::new, MobCategory.CREATURE).sized(0.8F, 2F), 0x000000, 0x000000);

    @SubscribeEvent
    public static void onEntityAttributeCreation(EntityAttributeCreationEvent e) {
        e.put(BACTERIA.get(), createBaseAttributes(100, 1, 10, 0).build());
        e.put(DEATHMOTH.get(), createBaseAttributes(1, 0.5, 25, 0).add(Attributes.FLYING_SPEED, 100) .build());
    }

    /**
     * Base Attributes for all entities (mostly has attributes related to hostile entities)
     *
     * @param health          Max Health of the Entity
     * @param moveSpeed       Speed of the Entity
     * @param attackDamage    Damage that the entity gives
     * @param attackKnockback Knock-back that the entity gives
     * @return Builder to append more Attributes if needed
     **/

    private static AttributeSupplier.Builder createBaseAttributes(double health, double moveSpeed, double attackDamage, double attackKnockback) {
        return Mob.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, health)
                .add(Attributes.FOLLOW_RANGE, 32)
                .add(Attributes.MOVEMENT_SPEED, moveSpeed)
                .add(Attributes.ATTACK_DAMAGE, attackDamage)
                .add(Attributes.ATTACK_KNOCKBACK, attackKnockback);
    }


    private static <E extends Mob> RegistryObject<EntityType<E>> registerWithEgg(String name, EntityType.Builder<E> builder, int backgroundColor, int highlightColour) {
        RegistryObject<EntityType<E>> registryObject = register(name, builder);
        ItemReg.ITEMS.register(name + "_spawn_egg", () -> new ForgeSpawnEggItem(registryObject, backgroundColor, highlightColour, new Item.Properties().tab(ModItemGroup.ITEM_GROUP)));
        return registryObject;
    }

    private static <E extends Entity> RegistryObject<EntityType<E>> register(String name, EntityType.Builder<E> builder) {
        return ENTITY_TYPES.register(name, () -> builder.build(Utils.rl(name).toString()));
    }
}
