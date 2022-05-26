package io.github.backroomsmod.world.dimension;

import io.github.backroomsmod.BackroomsMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class DimensionReg {
    public static ResourceKey<Level> TESTDIMENSION = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(BackroomsMod.MOD_ID, "testdimension"));
}
