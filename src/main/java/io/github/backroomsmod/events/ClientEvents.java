package io.github.backroomsmod.events;

import io.github.backroomsmod.BackroomsMod;
import io.github.backroomsmod.client.model.level0kp.Bacteria;
import io.github.backroomsmod.client.model.level0kp.DeathMoth;
import io.github.backroomsmod.client.render.RendererGenericEntity;
import io.github.backroomsmod.regstration.ModEntityTypes;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Mob;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = BackroomsMod.MOD_ID)
public class ClientEvents {


    @Mod.EventBusSubscriber(value = Dist.CLIENT, modid = BackroomsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEvents {

        @SubscribeEvent
        public static void clientSetupEvent(FMLClientSetupEvent event) {
            setBlockLayers();
        }

        private static void setBlockLayers() {
        }

        @SubscribeEvent
        public static void registerEntityLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(Bacteria.LAYER_LOCATION, Bacteria::createBodyLayer);
            event.registerLayerDefinition(DeathMoth.LAYER_LOCATION, DeathMoth::createBodyLayer);
        }

        @SubscribeEvent
        public static void registerEntityRenderer(EntityRenderersEvent.RegisterRenderers event) {
            event.registerEntityRenderer(ModEntityTypes.BACTERIA.get(), context -> genericEntityRenderer(context, new Bacteria<>(context.bakeLayer(Bacteria.LAYER_LOCATION)), 0.6F, "textures/entity/bacteria.png"));
            event.registerEntityRenderer(ModEntityTypes.DEATHMOTH.get(), context -> genericEntityRenderer(context, new DeathMoth<>(context.bakeLayer(DeathMoth.LAYER_LOCATION)), 0.2F, "textures/entity/deathmoth.png"));

        }

        private static <E extends Mob, M extends EntityModel<E>> RendererGenericEntity<E, M> genericEntityRenderer(EntityRendererProvider.Context entityRenderDispatcher, M model, float shadowRadius, String textureLocation) {
            return new RendererGenericEntity<>(entityRenderDispatcher, model, shadowRadius, textureLocation);
        }
    }
}
