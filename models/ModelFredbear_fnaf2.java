// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelFredbear_fnaf2 extends EntityModel<Entity> {
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

	public ModelFredbear_fnaf2() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -7.8294F, -0.95F);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(8.0F, 3.8294F, 9.45F);
		head.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
		right_arm_r1.setTextureOffset(12, 74).addBox(-10.5F, 11.0F, -11.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(73, 54).addBox(-10.5F, 11.0F, -8.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(72, 14).addBox(-10.5F, 11.0F, -10.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(0, 57).addBox(-10.5F, 11.0F, -9.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(57, 56).addBox(-11.0F, 7.0F, -11.5F, 6.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(28, 34).addBox(-12.0F, 7.0F, -17.5F, 8.0F, 4.0F, 6.0F, 0.0F, false);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-3.5622F, -12.9931F, 0.45F);
		head.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.6545F);
		right_arm_r2.setTextureOffset(12, 68).addBox(-4.6426F, -1.6774F, -1.7667F, 4.0F, 2.0F, 4.0F, 0.25F, true);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(3.5622F, -12.9931F, 0.45F);
		head.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, -1.5708F, 0.0F, -0.6545F);
		right_arm_r3.setTextureOffset(12, 68).addBox(0.6426F, -1.6774F, -1.7667F, 4.0F, 2.0F, 4.0F, 0.25F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 14.8294F, -0.55F);
		head.addChild(bone);
		bone.setTextureOffset(22, 23).addBox(-3.5F, -19.3F, -5.0F, 7.0F, 1.0F, 10.0F, 0.0F, false);
		bone.setTextureOffset(67, 6).addBox(3.5F, -19.3F, -2.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(67, 6).addBox(-4.5F, -19.3F, -2.0F, 1.0F, 1.0F, 7.0F, 0.0F, true);
		bone.setTextureOffset(37, 63).addBox(-3.5F, -20.3F, -5.0F, 7.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(37, 63).addBox(-3.5F, -21.6F, -5.0F, 7.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(57, 0).addBox(-3.5F, -23.6F, -5.0F, 7.0F, 2.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 19).addBox(-4.5F, -28.5F, -2.1F, 9.0F, 7.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(46, 23).addBox(-3.0F, -29.5F, -1.5F, 6.0F, 2.0F, 6.0F, -0.25F, false);
		bone.setTextureOffset(64, 19).addBox(-2.0F, -32.5F, -0.5F, 4.0F, 4.0F, 4.0F, -0.25F, false);
		bone.setTextureOffset(32, 0).addBox(-4.5F, -21.5F, -2.1F, 9.0F, 2.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(28, 63).addBox(4.5F, -23.5F, -2.1F, 1.0F, 4.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(28, 63).addBox(-5.5F, -23.5F, -2.1F, 1.0F, 4.0F, 7.0F, 0.0F, true);
		bone.setTextureOffset(63, 49).addBox(-2.5F, -24.2F, -4.8F, 5.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 4).addBox(-1.0F, -25.2F, -4.8F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(8.0F, -11.0F, 9.0F);
		bone.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, -1.5708F, 0.0F, 0.0F);
		right_arm_r4.setTextureOffset(76, 36).addBox(-11.5F, 9.7F, -17.1F, 3.0F, 2.0F, 1.0F, -0.25F, false);
		right_arm_r4.setTextureOffset(42, 77).addBox(-7.0F, 10.2F, -15.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		right_arm_r4.setTextureOffset(42, 77).addBox(-11.0F, 10.2F, -15.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		right_arm_r4.setTextureOffset(76, 36).addBox(-7.5F, 9.7F, -17.1F, 3.0F, 2.0F, 1.0F, -0.25F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -9.0F, 0.0F);
		body.setTextureOffset(35, 56).addBox(-3.5F, 13.0F, -2.0F, 7.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(75, 0).addBox(-4.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(28, 74).addBox(-4.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(58, 19).addBox(1.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(15, 45).addBox(1.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(76, 18).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(19, 34).addBox(-5.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(32, 9).addBox(-4.0F, 7.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(38, 44).addBox(1.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(30, 56).addBox(5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(19, 38).addBox(-7.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 33).addBox(-1.0F, 9.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-5.0F, -1.4F, -3.0F, 10.0F, 13.0F, 6.0F, 0.25F, false);
		body.setTextureOffset(38, 74).addBox(3.5F, 3.3F, -4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(38, 74).addBox(-4.5F, 3.3F, -4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(24, 74).addBox(2.5F, 1.3F, -4.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(24, 74).addBox(-3.5F, 1.3F, -4.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(59, 64).addBox(-2.5F, -0.7F, -4.0F, 5.0F, 12.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(46, 23).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-3.0F, -1.5F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(1.0F, -1.5F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(26, 13).addBox(-5.0F, 12.6F, -3.0F, 10.0F, 4.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(71, 73).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(76, 9).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(2.0F, 1.0F, 0.0F);
		body.addChild(neck);
		setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(6.5F, -9.0F, 0.0F);
		left_arm.setTextureOffset(53, 56).addBox(1.0F, 12.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		left_arm.setTextureOffset(12, 57).addBox(1.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		left_arm.setTextureOffset(44, 68).addBox(0.5F, 6.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(26, 0).addBox(0.5F, 13.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		left_arm.setTextureOffset(71, 27).addBox(0.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);
		left_arm.setTextureOffset(23, 44).addBox(-0.5F, -1.7F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(15, 56).addBox(-0.5F, 6.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(52, 9).addBox(-0.5F, 13.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-6.5F, -9.0F, 0.0F);
		right_arm.setTextureOffset(53, 56).addBox(-3.0F, 12.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(12, 57).addBox(-3.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(44, 68).addBox(-3.5F, 6.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);
		right_arm.setTextureOffset(26, 0).addBox(-3.5F, 13.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(71, 27).addBox(-3.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(23, 44).addBox(-4.5F, -1.7F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, true);
		right_arm.setTextureOffset(56, 31).addBox(-4.5F, 6.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(52, 9).addBox(-4.5F, 13.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.7F, 7.0F, -0.5F);
		left_leg.setTextureOffset(76, 6).addBox(-1.0F, 8.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(24, 67).addBox(-1.0F, 15.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(64, 6).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(73, 39).addBox(-1.5F, 9.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 68).addBox(-1.5F, 1.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 61).addBox(-2.0F, 16.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(58, 42).addBox(-2.0F, 15.6F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(25, 23).addBox(-0.5F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 22).addBox(-2.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 19).addBox(1.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 45).addBox(-2.5F, 1.0F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(43, 44).addBox(-2.5F, 8.5F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 33).addBox(-2.5F, 14.0F, -6.0F, 5.0F, 3.0F, 9.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.7F, 7.0F, -0.5F);
		right_leg.setTextureOffset(76, 6).addBox(-1.0F, 8.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(24, 67).addBox(-1.0F, 15.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(64, 6).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(71, 64).addBox(-1.5F, 9.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 68).addBox(-1.5F, 1.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 61).addBox(-2.0F, 16.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
		right_leg.setTextureOffset(58, 42).addBox(-2.0F, 15.6F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
		right_leg.setTextureOffset(25, 23).addBox(-0.5F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 22).addBox(1.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 19).addBox(-2.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(23, 44).addBox(-2.5F, 1.0F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, true);
		right_leg.setTextureOffset(23, 44).addBox(-2.5F, 8.5F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 33).addBox(-2.5F, 14.0F, -6.0F, 5.0F, 3.0F, 9.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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