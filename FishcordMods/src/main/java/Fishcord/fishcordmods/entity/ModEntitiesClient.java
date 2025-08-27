package Fishcord.fishcordmods.entity;

import Fishcord.fishcordmods.Fishcordmods;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class ModEntitiesClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_LAYER = new EntityModelLayer(Identifier.of(Fishcordmods.MOD_ID, "bobber"), "main");
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.BOBBER, (context) -> {
            return new BobberEntityRenderer(context);
        });

        EntityModelLayerRegistry.registerModelLayer(MODEL_LAYER, BobberEntityModel::getTexturedModelData);
    }
}
