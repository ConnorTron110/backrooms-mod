package io.github.backroomsmod.client.model.level0kp;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.backroomsmod.BackroomsMod;
import io.github.backroomsmod.entity.level0kp.DeathMothEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class DeathMoth<T extends DeathMothEntity> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(BackroomsMod.MOD_ID, "deathmoth"), "main");
    private final ModelPart body;

    public DeathMoth(ModelPart root) {
        this.body = root.getChild("body");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(20, 23).addBox(-3.5F, -4.0F, -3.0F, 7.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(26, 12).addBox(-2.5F, -3.0F, -7.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.01F))
                .texOffs(0, 29).addBox(-4.5F, -8.0F, -7.0F, 9.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 0.0F));

        PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(0, 16).addBox(-3.0F, -3.0F, -0.6F, 6.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5F, 3.0F, -0.1745F, 0.0F, 0.0F));

        PartDefinition right_antenna = body.addOrReplaceChild("right_antenna", CubeListBuilder.create().texOffs(6, 30).addBox(-1.5F, -5.0F, 0.0F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -3.0F, -7.0F));

        PartDefinition left_antenna = body.addOrReplaceChild("left_antenna", CubeListBuilder.create().texOffs(6, 35).addBox(-2.5F, -5.0F, 0.0F, 4.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -3.0F, -7.0F));

        PartDefinition rightwing_bone = body.addOrReplaceChild("rightwing_bone", CubeListBuilder.create().texOffs(0, 0).addBox(-11.0F, 0.0F, 0.0F, 11.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -4.0F, -1.0F, 0.2618F, -0.2618F, 0.0F));

        PartDefinition leftwing_bone = body.addOrReplaceChild("leftwing_bone", CubeListBuilder.create().texOffs(0, 8).addBox(0.0F, 0.0F, 0.0F, 11.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -4.0F, -1.0F, 0.2618F, 0.2618F, 0.0F));

        PartDefinition leg_front = body.addOrReplaceChild("leg_front", CubeListBuilder.create().texOffs(30, 2).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, -2.5F));

        PartDefinition leg_mid = body.addOrReplaceChild("leg_mid", CubeListBuilder.create().texOffs(30, 0).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 0.0F));

        PartDefinition leg_back = body.addOrReplaceChild("leg_back", CubeListBuilder.create().texOffs(19, 21).addBox(-3.5F, 0.0F, 0.0F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 3.0F, 2.5F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}