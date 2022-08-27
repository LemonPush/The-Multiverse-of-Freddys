// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelGoldenBonnie extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg_r1;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_leg_r2;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_arm_r2;

	public ModelGoldenBonnie() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.005F, 10.2133F, 2.1726F);
		setRotationAngle(head, 0.0F, 0.0F, -0.3054F);
		head.setTextureOffset(0, 0).addBox(-2.9054F, -10.3518F, -4.1726F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(52, 16).addBox(-2.3054F, -2.3518F, -6.1726F, 7.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(25, 18).addBox(-2.3054F, -3.3518F, -6.1726F, 7.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(49, 0).addBox(-2.4054F, -5.8518F, -6.9726F, 7.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(29, 54).addBox(-1.9054F, -6.3518F, -6.6726F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(60, 28).addBox(0.0946F, -7.3518F, -6.6726F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(61, 10).addBox(-1.7054F, -8.8518F, -4.6726F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(61, 7).addBox(1.7946F, -8.8518F, -4.6726F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(18, 34).addBox(-3.9054F, -5.8518F, -4.1726F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 32).addBox(5.0946F, -5.8518F, -4.1726F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 18).addBox(2.5946F, -10.8518F, -0.6726F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(56, 22).addBox(1.5946F, -14.8518F, -1.0726F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(2.5946F, -15.8518F, -0.6726F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(16, 55).addBox(-2.4054F, -14.8518F, -1.0726F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 6).addBox(-1.4054F, -15.8518F, -0.6726F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(4, 6).addBox(-1.4054F, -10.8518F, -0.6726F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-0.6047F, -19.3056F, -0.5726F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.3927F, 0.0F, 0.0F);
		head_r1.setTextureOffset(30, 21).addBox(-1.3007F, -0.6189F, -1.865F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head_r1.setTextureOffset(26, 58).addBox(-1.8007F, 0.3811F, -1.865F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 32).addBox(2.6993F, -0.6189F, -1.865F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head_r1.setTextureOffset(36, 58).addBox(2.1993F, 0.3811F, -1.865F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 11.5769F, -0.7846F);
		setRotationAngle(body, -0.2182F, 0.0F, 0.0F);
		body.setTextureOffset(24, 0).addBox(-5.0F, 8.3994F, -0.4989F, 10.0F, 3.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 16).addBox(-5.0F, -3.6006F, -0.4989F, 10.0F, 11.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(43, 8).addBox(-4.0F, -0.6006F, -1.4989F, 8.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(52, 38).addBox(-3.5F, -1.6006F, -1.4989F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(52, 20).addBox(-3.5F, 6.3994F, -1.4989F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(54, 5).addBox(-3.0F, -2.6006F, -1.4989F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(6, 61).addBox(-1.0F, -3.1006F, -2.4989F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 61).addBox(1.0F, -3.6006F, -2.4989F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(60, 49).addBox(-3.0F, -3.6006F, -2.4989F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(60, 40).addBox(-6.0F, -2.6006F, 1.2011F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(12, 53).addBox(5.0F, -2.6006F, 1.2011F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(54, 58).addBox(-1.0F, 7.3994F, 1.2011F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(46, 58).addBox(-1.0F, -4.6006F, 1.2011F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, -5.0F, 1.7F);
		left_arm.setTextureOffset(48, 28).addBox(1.0F, 13.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(12, 43).addBox(2.0F, 19.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(3.0F, 19.3333F, 0.0F);
		left_arm.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -0.5236F, 0.0F, -0.3054F);
		right_arm_r1.setTextureOffset(0, 53).addBox(-2.0F, 6.6667F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(28, 45).addBox(-1.0F, 5.6667F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(48, 49).addBox(-2.0F, 0.6667F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.0F, 16.1317F, -7.6015F);
		setRotationAngle(left_leg, -2.0071F, 0.0F, 0.0F);
		left_leg.setTextureOffset(40, 18).addBox(-2.0F, -6.7698F, 2.1509F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 35).addBox(-1.0F, -0.7698F, 3.1509F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(28, 34).addBox(-1.0F, -7.7698F, 3.1509F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		right_leg_r1 = new ModelRenderer(this);
		right_leg_r1.setRotationPoint(0.0F, -0.4691F, 2.6971F);
		left_leg.addChild(right_leg_r1);
		setRotationAngle(right_leg_r1, 0.5236F, 0.0F, 0.0F);
		right_leg_r1.setTextureOffset(22, 24).addBox(-2.5F, 7.2164F, -3.5237F, 5.0F, 2.0F, 8.0F, 0.0F, false);
		right_leg_r1.setTextureOffset(0, 43).addBox(-2.0F, 1.2164F, -0.5237F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.6F, 16.1317F, -7.6015F);
		setRotationAngle(right_leg, -2.0104F, 0.1186F, -0.0556F);
		right_leg.setTextureOffset(40, 18).addBox(-2.0F, -6.7698F, 2.1509F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 35).addBox(-1.0F, -0.7698F, 3.1509F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(28, 34).addBox(-1.0F, -7.7698F, 3.1509F, 2.0F, 1.0F, 2.0F, 0.0F, true);

		right_leg_r2 = new ModelRenderer(this);
		right_leg_r2.setRotationPoint(0.0F, -0.4691F, 2.6971F);
		right_leg.addChild(right_leg_r2);
		setRotationAngle(right_leg_r2, 0.5236F, 0.0F, 0.0F);
		right_leg_r2.setTextureOffset(22, 24).addBox(-2.5F, 7.2164F, -3.5237F, 5.0F, 2.0F, 8.0F, 0.0F, true);
		right_leg_r2.setTextureOffset(0, 43).addBox(-2.0F, 1.2164F, -0.5237F, 4.0F, 6.0F, 4.0F, 0.0F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, -5.0F, 1.7F);
		right_arm.setTextureOffset(48, 28).addBox(-5.0F, 13.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		right_arm.setTextureOffset(12, 43).addBox(-4.0F, 19.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-3.0F, 19.3333F, 0.0F);
		right_arm.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, -0.5236F, 0.0F, 0.3054F);
		right_arm_r2.setTextureOffset(0, 53).addBox(-2.0F, 6.6667F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
		right_arm_r2.setTextureOffset(28, 45).addBox(-1.0F, 5.6667F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_arm_r2.setTextureOffset(48, 49).addBox(-2.0F, 0.6667F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}