package Fishcord.glostermod;

import Fishcord.glostermod.block.ModBlocks;
import Fishcord.glostermod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import java.util.logging.LogManager;

import java.util.logging.Logger;

public class Glostermod implements ModInitializer {
    public static final String MOD_ID = "glostermod";
    public static final Logger LOGGER = LogManager.getLogManager().getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModBlocks.init();
        ModItems.init();
    }
}
