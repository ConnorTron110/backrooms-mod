package io.github.backroomsmod.regstration;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroup {
    public static final CreativeModeTab BLOCK_GROUP = new CreativeModeTab("backroomsBlocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockReg.LEVEL0KPWALLBLOCKA.get());
        }
    };

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab("backroomsItems") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockReg.LEVEL0KPWALLBLOCKB.get());
        }
    };
}
