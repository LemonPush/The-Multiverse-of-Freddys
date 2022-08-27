// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelIgnitedFreddy extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer bone;
	private final ModelRenderer right_arm_r4;
	private final ModelRenderer body;
	private final ModelRenderer neck;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelIgnitedFreddy() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -7.8294F, -0.95F);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(8.0F, 3.8294F, 9.45F);
		head.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
		right_arm_r1.setTextureOffset(66, 23).addBox(-10.5F, 11.0F, -11.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(66, 12).addBox(-10.5F, 11.0F, -8.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(65, 0).addBox(-10.5F, 11.0F, -10.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(58, 19).addBox(-10.5F, 11.0F, -9.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(50, 23).addBox(-11.0F, 7.0F, -11.5F, 6.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(0, 33).addBox(-12.0F, 7.0F, -17.5F, 8.0F, 4.0F, 6.0F, 0.0F, false);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-3.5622F, -12.9931F, 0.45F);
		head.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.6545F);
		right_arm_r2.setTextureOffset(60, 41).addBox(-4.6426F, -1.6774F, -1.7667F, 4.0F, 2.0F, 4.0F, 0.25F, false);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(3.5622F, -12.9931F, 0.45F);
		head.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, -1.5708F, 0.0F, -0.6545F);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 14.8294F, -0.55F);
		head.addChild(bone);
		bone.setTextureOffset(36, 56).addBox(-3.5F, -21.6F, -5.0F, 7.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(48, 35).addBox(-3.5F, -23.6F, -5.0F, 7.0F, 2.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 19).addBox(-4.5F, -28.5F, -2.1F, 9.0F, 7.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(42, 41).addBox(-3.0F, -29.5F, -1.5F, 6.0F, 2.0F, 6.0F, -0.25F, false);
		bone.setTextureOffset(54, 60).addBox(-2.0F, -32.5F, -0.5F, 4.0F, 4.0F, 4.0F, -0.25F, false);
		bone.setTextureOffset(25, 26).addBox(-4.5F, -21.5F, -2.1F, 9.0F, 2.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(0, 55).addBox(4.5F, -23.5F, -2.1F, 1.0F, 4.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(0, 55).addBox(-5.5F, -23.5F, -2.1F, 1.0F, 4.0F, 7.0F, 0.0F, true);
		bone.setTextureOffset(60, 7).addBox(-2.5F, -24.2F, -4.8F, 5.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 4).addBox(-1.0F, -25.2F, -4.8F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(8.0F, -11.0F, 9.0F);
		bone.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, -1.5708F, 0.0F, 0.0F);
		right_arm_r4.setTextureOffset(70, 37).addBox(-11.5F, 9.7F, -17.1F, 3.0F, 2.0F, 1.0F, -0.25F, false);
		right_arm_r4.setTextureOffset(71, 4).addBox(-7.0F, 10.2F, -15.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		right_arm_r4.setTextureOffset(71, 4).addBox(-11.0F, 10.2F, -15.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		right_arm_r4.setTextureOffset(70, 37).addBox(-7.5F, 9.7F, -17.1F, 3.0F, 2.0F, 1.0F, -0.25F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -9.0F, 0.0F);
		body.setTextureOffset(40, 49).addBox(-3.5F, 13.0F, -2.0F, 7.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(70, 17).addBox(-4.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(66, 60).addBox(-4.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(57, 31).addBox(1.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(15, 43).addBox(1.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(49, 61).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(26, 0).addBox(-5.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(54, 56).addBox(-4.0F, 7.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(22, 35).addBox(1.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(43, 35).addBox(5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(32, 4).addBox(-7.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(58, 68).addBox(-1.0F, 9.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-5.0F, -1.4F, -3.0F, 10.0F, 13.0F, 6.0F, 0.25F, false);
		body.setTextureOffset(39, 70).addBox(3.5F, 3.3F, -4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(39, 70).addBox(-4.5F, 3.3F, -4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(12, 66).addBox(2.5F, 1.3F, -4.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(12, 66).addBox(-3.5F, 1.3F, -4.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(16, 58).addBox(-2.5F, -0.7F, -4.0F, 5.0F, 12.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 36).addBox(-1.0F, -1.2F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-3.0F, -1.5F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(1.0F, -1.5F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(26, 13).addBox(-5.0F, 12.6F, -3.0F, 10.0F, 4.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(50, 68).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(28, 58).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(2.0F, 1.0F, 0.0F);
		body.addChild(neck);
		setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(6.5F, -9.0F, 0.0F);
		left_arm.setTextureOffset(25, 23).addBox(1.0F, 12.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		left_arm.setTextureOffset(33, 23).addBox(1.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		left_arm.setTextureOffset(40, 61).addBox(0.5F, 6.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(63, 47).addBox(0.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);
		left_arm.setTextureOffset(28, 35).addBox(-0.5F, -1.7F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-6.5F, -9.0F, 0.0F);
		right_arm.setTextureOffset(25, 23).addBox(-3.0F, 12.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(33, 23).addBox(-3.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(67, 65).addBox(-3.5F, 6.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(63, 47).addBox(-3.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(28, 35).addBox(-4.5F, -1.7F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, true);
		right_arm.setTextureOffset(20, 47).addBox(-4.5F, 6.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.7F, 7.0F, -0.5F);
		left_leg.setTextureOffset(9, 55).addBox(-1.0F, 8.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(35, 47).addBox(-1.0F, 15.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(41, 23).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(67, 28).addBox(-1.5F, 9.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(28, 61).addBox(-1.5F, 1.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(52, 12).addBox(-2.0F, 16.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(51, 0).addBox(-2.0F, 15.6F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 33).addBox(-0.5F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 22).addBox(-2.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 19).addBox(1.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 43).addBox(-2.5F, 1.0F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(32, 0).addBox(-2.5F, 14.0F, -6.0F, 5.0F, 3.0F, 9.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.7F, 7.0F, -0.5F);
		right_leg.setTextureOffset(9, 55).addBox(-1.0F, 8.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(35, 47).addBox(-1.0F, 15.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(41, 23).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 66).addBox(-1.5F, 9.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(28, 61).addBox(-1.5F, 1.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, true);
		right_leg.setTextureOffset(52, 12).addBox(-2.0F, 16.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
		right_leg.setTextureOffset(51, 0).addBox(-2.0F, 15.6F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 33).addBox(-0.5F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 22).addBox(1.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 19).addBox(-2.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(28, 35).addBox(-2.5F, 1.0F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, true);
		right_leg.setTextureOffset(32, 0).addBox(-2.5F, 14.0F, -6.0F, 5.0F, 3.0F, 9.0F, 0.0F, true);
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
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}