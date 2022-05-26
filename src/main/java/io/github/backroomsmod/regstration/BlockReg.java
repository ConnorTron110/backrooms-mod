package io.github.backroomsmod.regstration;

import io.github.backroomsmod.BackroomsMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockReg {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BackroomsMod.MOD_ID);

    //Registry Starts here

    public static <B extends Block> RegistryObject<B> register(String name, Supplier<B> blockSup) {
        RegistryObject<B> obj = registerNoItem(name, blockSup);
        ItemReg.register(name, () -> new BlockItem(obj.get(), new Item.Properties().tab(CreativeModeTab.TAB_MISC))); //TODO Creative Tab
        return obj;
    }

    public static <B extends Block> RegistryObject<B> registerNoItem(String name, Supplier<B> blockSup) {
        return BLOCKS.register(name, blockSup);
    }
}
