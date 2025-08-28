package Fishcord.glostermod.world.biome;

import Fishcord.glostermod.Glostermod;
import Fishcord.glostermod.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.RegionType;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerraBlenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(Identifier.of(Glostermod.MOD_ID, "overworld"), RegionType.OVERWORLD, 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, Glostermod.MOD_ID, ModMaterialRules.makeRules());
    }
}
