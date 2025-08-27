package Fishcord.fishcordmods;

import Fishcord.fishcordmods.block.ModBlocks;
import Fishcord.fishcordmods.item.ModItems;
import net.fabricmc.api.ModInitializer;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Fishcordmods implements ModInitializer {
    public static final String MOD_ID = "fishcordmods";
    public static final Logger LOGGER = LogManager.getLogManager().getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.initialize();
        ModBlocks.init();
    }
}
//seed: -4158291033318983842