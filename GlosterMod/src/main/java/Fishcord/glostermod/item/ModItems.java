package Fishcord.glostermod.item;

import Fishcord.glostermod.Glostermod;
import Fishcord.glostermod.block.ModBlocks;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.loot.v3.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;
import net.minecraft.item.consume.ConsumeEffect;
import net.minecraft.item.consume.UseAction;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTables;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    //fish wood stuff
    public static final Item FISH_LOG = Items.register(ModBlocks.FISH_LOG);
    public static final Item FISH_WOOD = Items.register(ModBlocks.FISH_WOOD);
    public static final Item FISH_PLANKS = Items.register(ModBlocks.FISH_PLANKS);
    public static final Item FISH_STAIRS = Items.register(ModBlocks.FISH_STAIRS);

    //fishiessssss
    public static final Item NYAN_FISH = Items.register(
            RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Glostermod.MOD_ID, "nyan_fish")),
            Item::new,
            new Item.Settings().food(new FoodComponent(0, 0F, true), ModConsumableComponents.NYAN_FISH)
    );

    public static void init() {}
}
