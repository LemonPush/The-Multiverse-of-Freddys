// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelIgnitedFoxy extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer body;
	private final ModelRenderer neck;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer right_arm_r4;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelIgnitedFoxy() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -7.8294F, -0.45F);
		head.setTextureOffset(19, 36).addBox(-4.0F, -11.1706F, -2.05F, 8.0F, 3.0F, 5.0F, 0.5F, false);
		head.setTextureOffset(64, 54).addBox(5.0F, -8.1706F, -2.05F, 1.0F, 1.0F, 5.0F, 0.25F, false);
		head.setTextureOffset(43, 0).addBox(-4.5F, -8.1706F, -2.05F, 9.0F, 1.0F, 5.0F, 0.25F, false);
		head.setTextureOffset(22, 47).addBox(-3.5F, -6.9706F, -8.35F, 7.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.5F, -8.1706F, -8.55F, 7.0F, 1.0F, 11.0F, 0.25F, false);
		head.setTextureOffset(25, 0).addBox(6.5F, -8.1706F, -1.05F, 1.0F, 1.0F, 4.0F, 0.25F, false);
		head.setTextureOffset(46, 21).addBox(8.0F, -8.1706F, -0.05F, 1.0F, 1.0F, 3.0F, 0.25F, false);
		head.setTextureOffset(40, 39).addBox(-4.0F, -14.1706F, -2.05F, 8.0F, 3.0F, 5.0F, 0.25F, false);
		head.setTextureOffset(19, 26).addBox(-0.5F, -16.1706F, -0.55F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(64, 54).addBox(-6.0F, -8.1706F, -2.05F, 1.0F, 1.0F, 5.0F, 0.25F, true);
		head.setTextureOffset(25, 0).addBox(-7.5F, -8.1706F, -1.05F, 1.0F, 1.0F, 4.0F, 0.25F, true);
		head.setTextureOffset(46, 21).addBox(-9.0F, -8.1706F, -0.05F, 1.0F, 1.0F, 3.0F, 0.25F, true);
		head.setTextureOffset(25, 0).addBox(-2.0F, -9.1706F, -7.55F, 4.0F, 1.0F, 10.0F, 0.25F, false);
		head.setTextureOffset(7, 9).addBox(-0.5F, -9.9706F, -7.35F, 1.0F, 1.0F, 1.0F, 0.25F, false);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(-8.0F, 3.8294F, 9.45F);
		head.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.7854F);
		right_arm_r1.setTextureOffset(71, 54).addBox(-14.0F, 8.0F, -16.0F, 1.0F, 2.0F, 2.0F, 0.25F, false);
		right_arm_r1.setTextureOffset(42, 47).addBox(-10.0F, 8.0F, -16.0F, 1.0F, 2.0F, 2.0F, 0.25F, false);
		right_arm_r1.setTextureOffset(61, 39).addBox(-13.0F, 8.0F, -16.5F, 3.0F, 2.0F, 3.0F, 0.25F, false);
		right_arm_r1.setTextureOffset(40, 69).addBox(-13.0F, 8.0F, -16.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(1.0F, -14.1706F, 0.45F);
		head.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, 0.0F, 0.4363F);
		body_r1.setTextureOffset(19, 26).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(-1.0F, -14.1706F, 0.45F);
		head.addChild(body_r2);
		setRotationAngle(body_r2, 0.0F, 0.0F, -0.4363F);
		body_r2.setTextureOffset(19, 26).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(8.0F, 3.8294F, 9.45F);
		head.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.0F);
		right_arm_r2.setTextureOffset(0, 41).addBox(-7.0F, 11.2F, -15.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		right_arm_r2.setTextureOffset(8, 41).addBox(-11.0F, 11.2F, -15.5F, 2.0F, 1.0F, 2.0F, 0.35F, false);
		right_arm_r2.setTextureOffset(12, 71).addBox(-10.5F, 11.0F, -11.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r2.setTextureOffset(70, 60).addBox(-10.5F, 11.0F, -8.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r2.setTextureOffset(43, 6).addBox(-10.5F, 11.0F, -10.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r2.setTextureOffset(67, 29).addBox(-10.5F, 11.0F, -9.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r2.setTextureOffset(51, 21).addBox(-11.0F, 7.0F, -11.5F, 6.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm_r2.setTextureOffset(30, 11).addBox(-12.0F, 7.0F, -17.5F, 8.0F, 4.0F, 6.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(0.0F, -6.0706F, 0.5167F);
		head.addChild(body_r3);
		setRotationAngle(body_r3, 0.0436F, 0.0F, 0.0F);
		body_r3.setTextureOffset(22, 47).addBox(-3.5F, 0.0F, -8.8667F, 7.0F, 1.0F, 6.0F, 0.0F, false);
		body_r3.setTextureOffset(42, 48).addBox(-3.5F, 1.2F, -9.0667F, 7.0F, 1.0F, 6.0F, 0.25F, false);
		body_r3.setTextureOffset(0, 44).addBox(-4.5F, 1.2F, -2.5667F, 9.0F, 1.0F, 5.0F, 0.25F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -9.0F, 0.0F);
		body.setTextureOffset(0, 50).addBox(-3.5F, 13.0F, -2.0F, 7.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(70, 37).addBox(-4.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(30, 54).addBox(-4.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(25, 12).addBox(1.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(24, 61).addBox(1.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(31, 44).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(58, 17).addBox(-5.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(52, 13).addBox(-4.0F, 7.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(25, 5).addBox(1.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(60, 55).addBox(5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(46, 55).addBox(-7.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(71, 22).addBox(-1.0F, 9.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(46, 31).addBox(-4.0F, 13.0F, -2.5F, 8.0F, 3.0F, 5.0F, 0.25F, false);
		body.setTextureOffset(23, 44).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(2.0F, 1.0F, 0.0F);
		body.addChild(neck);
		setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(6.5F, -9.0F, 0.0F);
		left_arm.setTextureOffset(10, 57).addBox(1.0F, 12.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		left_arm.setTextureOffset(18, 50).addBox(1.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		left_arm.setTextureOffset(28, 66).addBox(0.5F, 6.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(66, 6).addBox(0.5F, 13.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(47, 65).addBox(0.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);
		left_arm.setTextureOffset(14, 61).addBox(0.5F, 6.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.25F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-6.5F, -9.0F, 0.0F);
		right_arm.setTextureOffset(10, 57).addBox(-3.0F, 12.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(18, 50).addBox(-3.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(47, 65).addBox(-3.5F, 6.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(67, 18).addBox(-3.5F, 13.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.25F, false);
		right_arm.setTextureOffset(0, 12).addBox(-2.5F, 13.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.25F, false);
		right_arm.setTextureOffset(0, 12).addBox(-3.7615F, 17.0585F, -0.5F, 1.0F, 2.0F, 1.0F, 0.25F, false);
		right_arm.setTextureOffset(6, 0).addBox(-1.5615F, 19.1585F, -0.5F, 1.0F, 1.0F, 1.0F, 0.25F, false);
		right_arm.setTextureOffset(47, 65).addBox(-3.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 57).addBox(-3.5F, -1.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.25F, false);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(-2.0F, 14.5F, 0.0F);
		right_arm.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, 0.0F, 0.0F, 2.0508F);
		right_arm_r3.setTextureOffset(0, 12).addBox(3.9F, -2.7F, -0.5F, 1.0F, 2.0F, 1.0F, 0.25F, false);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(-2.0F, 14.5F, 0.0F);
		right_arm.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, 0.0F, 0.0F, 0.6545F);
		right_arm_r4.setTextureOffset(0, 12).addBox(0.1F, 0.8F, -0.5F, 1.0F, 2.0F, 1.0F, 0.25F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.5F, 6.0F, 0.5F);
		left_leg.setTextureOffset(70, 12).addBox(-1.0F, 9.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(67, 33).addBox(-1.0F, 16.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(37, 66).addBox(-1.0F, 1.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 67).addBox(-1.5F, 10.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(63, 44).addBox(-1.5F, 2.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(16, 54).addBox(-2.0F, 17.0F, -4.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(52, 6).addBox(-2.0F, 16.6F, -4.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(59, 71).addBox(-0.5F, 17.0F, -6.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(70, 15).addBox(-2.3F, 17.0F, -6.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(40, 36).addBox(1.3F, 17.0F, -6.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(36, 55).addBox(-1.5F, 2.0F, -2.5F, 3.0F, 7.0F, 4.0F, 0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.5F, 6.0F, 0.5F);
		right_leg.setTextureOffset(70, 12).addBox(-1.0F, 9.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(67, 33).addBox(-1.0F, 16.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(37, 66).addBox(-1.0F, 1.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 67).addBox(-1.5F, 10.0F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, true);
		right_leg.setTextureOffset(63, 44).addBox(-1.5F, 2.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, true);
		right_leg.setTextureOffset(16, 54).addBox(-2.0F, 17.0F, -4.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
		right_leg.setTextureOffset(52, 6).addBox(-2.0F, 16.6F, -4.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
		right_leg.setTextureOffset(59, 71).addBox(-0.5F, 17.0F, -6.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(70, 15).addBox(1.3F, 17.0F, -6.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(40, 36).addBox(-2.3F, 17.0F, -6.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(36, 55).addBox(-1.5F, 2.0F, -2.5F, 3.0F, 7.0F, 4.0F, 0.25F, false);
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
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}