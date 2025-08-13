package Fishcord.fishcordmods.item;

import Fishcord.fishcordmods.Fishcordmods;
import Fishcord.fishcordmods.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.EquippableComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.waypoint.Waypoint;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import static net.minecraft.item.Items.register;

public class ModItems {


    public static final Item BOOMBOX = register(
            ModBlocks.BOOMBOX,
            (UnaryOperator<Item.Settings>)(settings -> Waypoint.disableTracking(settings)
                    .component(
                            DataComponentTypes.EQUIPPABLE,
                            EquippableComponent.builder(EquipmentSlot.HEAD).swappable(false).build()
                    ))
    );

    public static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Fishcordmods.MOD_ID, name));
        return Items.register(registryKey, factory, settings);
    }
    public static void registerModItems() {

    }


}
