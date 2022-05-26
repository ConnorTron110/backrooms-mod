package io.github.backroomsmod.client.model.level0kp;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import io.github.backroomsmod.BackroomsMod;
import io.github.backroomsmod.entity.level0kp.BacteriaEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class Bacteria<T extends BacteriaEntity> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(BackroomsMod.MOD_ID, "bacteria"), "main");
    private final ModelPart head;
    private final ModelPart waist;
    private final ModelPart rightArm;
    private final ModelPart leftArm;
    private final ModelPart rightLeg;
    private final ModelPart leftLeg;

    public Bacteria(ModelPart root) {
        this.head = root.getChild("head");
        this.waist = root.getChild("waist");
        this.rightArm = root.getChild("rightArm");
        this.leftArm = root.getChild("leftArm");
        this.rightLeg = root.getChild("rightLeg");
        this.leftLeg = root.getChild("leftLeg");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-9.0F, -1.0F, -7.5F, 19.0F, 2.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(30, 14).addBox(-6.0F, -3.0F, 2.5F, 11.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 14).addBox(-5.0F, -8.0F, -6.5F, 9.0F, 8.0F, 12.0F, new CubeDeformation(0.02F)), PartPose.offset(0.0F, -18.0F, 0.5F));

        PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 20).addBox(-9.5F, -2.5F, 1.5F, 11.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -7.5F, 3.0F, 0.0F, -1.5708F, 0.0F));

        PartDefinition waist = partdefinition.addOrReplaceChild("waist", CubeListBuilder.create(), PartPose.offset(-0.5F, 4.0F, 0.5F));

        PartDefinition body = waist.addOrReplaceChild("body", CubeListBuilder.create().texOffs(58, 26).addBox(-3.5F, -3.5F, -2.5F, 7.0F, 4.0F, 4.0F, new CubeDeformation(0.01F))
                .texOffs(10, 55).addBox(-0.5F, 0.5F, -0.5F, 1.0F, 20.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(57, 14).addBox(-9.5F, 18.5F, -0.5F, 9.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 34).addBox(-4.5F, 0.5F, 0.5F, 9.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -18.5F, 0.0F));

        PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create().texOffs(50, 56).addBox(-3.0F, 27.0F, -0.5F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(54, 27).addBox(1.0F, 0.0F, -1.0F, 1.0F, 28.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(58, 41).addBox(-4.0F, -2.0F, -0.1F, 8.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(6.0F, -15.0F, 0.0F));

        PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create().texOffs(59, 0).addBox(-5.5F, 27.0F, -0.5F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(18, 34).addBox(-3.0F, 0.0F, -1.0F, 2.0F, 28.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(58, 34).addBox(-4.0F, -2.0F, 0.0F, 8.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, -15.0F, 0.0F));

        PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create().texOffs(26, 41).addBox(-3.5F, -3.0F, 0.0F, 7.0F, 21.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(35, 20).addBox(-3.5F, 18.0F, -7.0F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(3.5F, 6.0F, 0.5F));

        PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create().texOffs(40, 34).addBox(-3.5F, -3.0F, 0.0F, 7.0F, 21.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(19, 34).addBox(-3.5F, 18.0F, -7.0F, 7.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 6.0F, 0.5F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        waist.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        rightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}