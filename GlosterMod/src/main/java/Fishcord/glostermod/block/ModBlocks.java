package Fishcord.glostermod.block;

import Fishcord.glostermod.Glostermod;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.Items;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block FISH_LOG = Blocks.register(
            RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Glostermod.MOD_ID, "fish_log")),
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .pistonBehavior(PistonBehavior.PUSH_ONLY)
                    .sounds(BlockSoundGroup.MUD)
                    .strength(0.5F, 0.2F)
    );
    public static final Block FISH_WOOD = Blocks.register(
            RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Glostermod.MOD_ID, "fish_wood")),
            PillarBlock::new,
            AbstractBlock.Settings.copy(ModBlocks.FISH_LOG)
    );
    public static final Block FISH_PLANKS = Blocks.register(
            RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Glostermod.MOD_ID, "fish_planks")),
            PillarBlock::new,
            AbstractBlock.Settings.copy(ModBlocks.FISH_LOG)
    );
    public static final Block FISH_STAIRS = Blocks.register(
            RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Glostermod.MOD_ID, "fish_stairs")),
            settings -> new StairsBlock(FISH_PLANKS.getDefaultState(), settings),
            AbstractBlock.Settings.copy(FISH_LOG)
    );

    public static void init() {}
}