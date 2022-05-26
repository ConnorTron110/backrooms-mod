package io.github.backroomsmod;

import com.mojang.logging.LogUtils;
import io.github.backroomsmod.regstration.BlockReg;
import io.github.backroomsmod.regstration.ItemReg;
import io.github.backroomsmod.regstration.ModEntityTypes;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;


@Mod(BackroomsMod.MOD_ID)
public class BackroomsMod {

    public static final String MOD_ID = "backroomsmod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public BackroomsMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockReg.BLOCKS.register(bus);
        ItemReg.ITEMS.register(bus);
        ModEntityTypes.ENTITY_TYPES.register(bus);
    }
}
