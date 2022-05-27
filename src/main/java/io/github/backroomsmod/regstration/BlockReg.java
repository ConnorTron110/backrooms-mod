package io.github.backroomsmod.regstration;

import io.github.backroomsmod.BackroomsMod;
import io.github.backroomsmod.block.base.BaseHorizontalBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockReg {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BackroomsMod.MOD_ID);

    //Level-0 KP

    public static final RegistryObject<Block> LEVEL0KPWALLBLOCKA = registerBlock("level0kpwallblocka",
            () -> new BaseHorizontalBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(-0F).sound(SoundType.WOOD)
                    .noOcclusion().explosionResistance(999999)));

    public static final RegistryObject<Block> LEVEL0KPWALLBLOCKB = registerBlock("level0kpwallblockb",
            () -> new BaseHorizontalBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(-0F).sound(SoundType.WOOD)
                    .noOcclusion().explosionResistance(999999)));

    public static final RegistryObject<Block> LEVEL0KPLIGHTBLOCK = registerBlock("level0kplightblock",
            () -> new BaseHorizontalBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(-0F).sound(SoundType.GLASS)
                    .noOcclusion().explosionResistance(999999).lightLevel((state) -> 5)));

    public static final RegistryObject<Block> LEVEL0KPFLOORBLOCK = registerBlock("level0kpfloorblock",
            () -> new BaseHorizontalBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(-0F).sound(SoundType.MOSS_CARPET)
                    .noOcclusion().explosionResistance(999999)));

    public static final RegistryObject<Block> LEVEL0KPCEILINGBLOCK = registerBlock("level0kpceilingblock",
            () -> new BaseHorizontalBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(-0F).sound(SoundType.STONE)
                    .noOcclusion().explosionResistance(999999)));

    public static final RegistryObject<Block> LEVEL0KPWALLENDBLOCK = registerBlock("level0kpwallendblock",
            () -> new BaseHorizontalBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(-0F).sound(SoundType.WOOD)
                    .noOcclusion().explosionResistance(999999)));

    public static final RegistryObject<Block> LEVEL0KPWALLENDLINEBLOCK = registerBlock("level0kpwallendlineblock",
            () -> new BaseHorizontalBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(-0F).sound(SoundType.WOOD)
                    .noOcclusion().explosionResistance(999999)));

    public static final RegistryObject<Block> LEVEL0KPWALLENDOUTLETBLOCK = registerBlock("level0kpwallendoutletblock",
            () -> new BaseHorizontalBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(-0F).sound(SoundType.WOOD)
                    .noOcclusion().explosionResistance(999999)));

    public static final RegistryObject<Block> LEVEL0KPWALLLINEBLOCK = registerBlock("level0kpwalllineblock",
            () -> new BaseHorizontalBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(-0F).sound(SoundType.WOOD)
                    .noOcclusion().explosionResistance(999999)));

    public static final RegistryObject<Block> LEVEL0KPWALLOUTLETBLOCK = registerBlock("level0kpwalloutletblock",
            () -> new BaseHorizontalBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(-0F).sound(SoundType.WOOD)
                    .noOcclusion().explosionResistance(999999)));




    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<B> blockSup) {
        RegistryObject<B> obj = registerNoItem(name, blockSup);
        ItemReg.register(name, () -> new BlockItem(obj.get(), new Item.Properties().tab(ModItemGroup.BLOCK_GROUP)));
        return obj;
    }


    public static <B extends Block> RegistryObject<B> registerNoItem(String name, Supplier<B> blockSup) {
        return BLOCKS.register(name, blockSup);
    }
}
