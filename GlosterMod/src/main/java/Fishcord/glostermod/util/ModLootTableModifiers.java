package Fishcord.glostermod.util;

import Fishcord.glostermod.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier JUNK_TABLE_ID
        = LootTables.FISHING_JUNK_GAMEPLAY.getRegistry();

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register(((key, tableBuilder, source, registries) -> {

            if(JUNK_TABLE_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1F))
                        .with(ItemEntry.builder(ModItems.NYAN_FISH))
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build());

                tableBuilder.pool(poolBuilder.build());
            }


        }));
    }
}
