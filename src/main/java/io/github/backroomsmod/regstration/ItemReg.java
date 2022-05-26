package io.github.backroomsmod.regstration;

import io.github.backroomsmod.BackroomsMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemReg {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BackroomsMod.MOD_ID);

    public static <I extends Item> RegistryObject<I> register(String name, Supplier<I> itemSup) {
        return ITEMS.register(name, itemSup);
    }
}
