package Fishcord.fishcordmods.entity;


import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.state.FishingBobberEntityState;

@Environment(EnvType.CLIENT)
public class BobberEntityModel extends EntityModel<FishingBobberEntityState> {

    private ModelPart base;

    public BobberEntityModel(ModelPart root) {
        super(root);
        this.base = root.getChild(EntityModelPartNames.BODY);
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData base = modelPartData.addChild("base", ModelPartBuilder.create().uv(0, 0).cuboid(-2.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.rotation(0.0F, 24.0F, 0.0F));
        return TexturedModelData.of(modelData, 16, 16);
    }
}