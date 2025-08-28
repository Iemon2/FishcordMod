package Fishcord.glostermod.world.biome.surface;

import Fishcord.glostermod.world.biome.ModBiomes;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import terrablender.api.ParameterUtils.*;
import terrablender.api.Region;
import terrablender.api.RegionType;
import terrablender.api.VanillaParameterOverlayBuilder;

import java.util.function.Consumer;

public class FishBiome extends Region {
    public FishBiome(Identifier biome, int weight) {
        super(biome, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<BiomeEffects.Builder, Registry<Biome>>> mapper) {
        VanillaParameterOverlayBuilder builder = new VanillaParameterOverlayBuilder();

        new ParameterPointListBuilder()
                .temperature(Temperature.span(Temperature.COOL, Temperature.WARM))
                .humidity(Humidity.span(Humidity.WET, Humidity.HUMID))
                .continentalness(Continentalness.span(Continentalness.NEAR_INLAND, Continentalness.COAST))
                .erosion(Erosion.EROSION_6)
                .depth(Depth.SURFACE)
                .weirdness(Weirdness.LOW_SLICE_NORMAL_DESCENDING)
                .build().forEach(point -> builder.add(point, ModBiomes.FISH_BIOME));
    }
}
