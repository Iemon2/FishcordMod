package Fishcord.fishcordmods.block;

import Fishcord.fishcordmods.Fishcordmods;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.register;


public class ModBlocks {
    public static final Block BOOMBOX = register(
            RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Fishcordmods.MOD_ID, "boombox")),
            BoomboxBlock::new,
            AbstractBlock.Settings.create()
                    .breakInstantly()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .sounds(BlockSoundGroup.COPPER_GRATE)
    );

    public static void init() {
    }
}
