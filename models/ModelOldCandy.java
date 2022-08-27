// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelOldCandy extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r2;
	private final ModelRenderer bone_r3;
	private final ModelRenderer right_arm_r4;
	private final ModelRenderer body;
	private final ModelRenderer neck;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelOldCandy() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -7.8294F, -1.45F);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(8.0F, 3.8294F, 9.45F);
		head.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-3.5622F, -12.9931F, 0.45F);
		head.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.6545F);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(3.5622F, -12.9931F, 0.45F);
		head.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, -1.5708F, 0.0F, -0.6545F);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 14.8294F, -0.55F);
		head.addChild(bone);
		bone.setTextureOffset(28, 61).addBox(4.5F, -23.5F, -1.1F, 1.0F, 2.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(20, 69).addBox(5.5F, -24.5F, -0.1F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(14, 61).addBox(-5.5F, -23.5F, -1.1F, 1.0F, 2.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(69, 19).addBox(-6.5F, -24.5F, -0.1F, 1.0F, 2.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 19).addBox(-4.5F, -28.5F, -2.1F, 9.0F, 7.0F, 8.0F, 0.0F, false);
		bone.setTextureOffset(60, 43).addBox(-3.5F, -23.5F, -4.1F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-0.5F, -24.5F, -3.9F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.0F, -20.3F, 2.5F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.2182F, 0.0F, 0.0F);
		bone_r1.setTextureOffset(54, 30).addBox(-3.5F, 0.0F, -6.5F, 7.0F, 1.0F, 2.0F, 0.0F, false);
		bone_r1.setTextureOffset(102, 0).addBox(-3.5F, -1.0F, -6.5F, 7.0F, 1.0F, 6.0F, 0.0F, false);
		bone_r1.setTextureOffset(26, 11).addBox(-4.5F, 0.0F, -4.5F, 9.0F, 1.0F, 8.0F, 0.0F, false);

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(-3.0F, -28.5F, 1.9F);
		bone.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.0F, 0.0F, -0.6109F);
		bone_r2.setTextureOffset(60, 47).addBox(-2.15F, -4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(26, 0).addBox(-2.65F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		bone_r3 = new ModelRenderer(this);
		bone_r3.setRotationPoint(3.0F, -28.5F, 1.9F);
		bone.addChild(bone_r3);
		setRotationAngle(bone_r3, 0.0F, 0.0F, 0.6109F);
		bone_r3.setTextureOffset(36, 61).addBox(0.15F, -4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone_r3.setTextureOffset(35, 38).addBox(-0.35F, -3.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(8.0F, -11.0F, 9.0F);
		bone.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, -1.5708F, 0.0F, 0.0F);
		right_arm_r4.setTextureOffset(36, 74).addBox(-7.0F, 10.2F, -15.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		right_arm_r4.setTextureOffset(74, 25).addBox(-11.0F, 10.2F, -15.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -9.0F, 0.0F);
		body.setTextureOffset(70, 31).addBox(-4.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 70).addBox(-4.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(35, 50).addBox(1.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(46, 20).addBox(1.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(30, 69).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(15, 34).addBox(-5.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(55, 50).addBox(-4.0F, 7.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(47, 0).addBox(1.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(54, 71).addBox(5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(64, 70).addBox(-7.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 19).addBox(-1.0F, 9.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-5.0F, -1.4F, -3.0F, 10.0F, 13.0F, 6.0F, 0.25F, false);
		body.setTextureOffset(0, 58).addBox(-3.0F, -0.4F, -3.5F, 6.0F, 11.0F, 1.0F, 0.25F, false);
		body.setTextureOffset(28, 28).addBox(-5.0F, 11.9F, -3.0F, 10.0F, 4.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(12, 69).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(2.0F, 1.0F, 0.0F);
		body.addChild(neck);
		setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(6.5F, -9.0F, 0.0F);
		left_arm.setTextureOffset(68, 58).addBox(1.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(42, 61).addBox(0.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(32, 0).addBox(-0.5F, 6.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(54, 20).addBox(-0.5F, 13.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(68, 47).addBox(1.0F, 12.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 34).addBox(-0.5F, -1.7F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-6.5F, -9.0F, 0.0F);
		right_arm.setTextureOffset(74, 16).addBox(-3.0F, 12.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 74).addBox(-3.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(54, 62).addBox(-3.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 46).addBox(-4.5F, -1.7F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(52, 0).addBox(-4.5F, 6.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(55, 33).addBox(-4.5F, 13.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.7F, 7.0F, -0.5F);
		left_leg.setTextureOffset(70, 72).addBox(-1.0F, 7.5F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(46, 70).addBox(-1.0F, 13.5F, -0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(72, 28).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(69, 8).addBox(-1.5F, 8.5F, -1.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(53, 54).addBox(-2.0F, 16.0F, -4.5F, 4.0F, 1.0F, 7.0F, 0.0F, false);
		left_leg.setTextureOffset(67, 0).addBox(-2.0F, 15.0F, -1.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(40, 38).addBox(-2.5F, 0.5F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(40, 50).addBox(-2.5F, 8.0F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.7F, 7.0F, -0.5F);
		right_leg.setTextureOffset(72, 4).addBox(-1.0F, 7.5F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(38, 70).addBox(-1.0F, 13.5F, -0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(70, 35).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(66, 62).addBox(-1.5F, 8.5F, -1.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(52, 11).addBox(-2.0F, 16.0F, -4.5F, 4.0F, 1.0F, 7.0F, 0.0F, false);
		right_leg.setTextureOffset(68, 54).addBox(-2.0F, 15.0F, -1.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(20, 38).addBox(-2.5F, 0.5F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(20, 50).addBox(-2.5F, 8.0F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}