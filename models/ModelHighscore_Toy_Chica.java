// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelHighscore_Toy_Chica extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer head_r6;
	private final ModelRenderer body;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer left_arm;

	public ModelHighscore_Toy_Chica() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.25F, false);
		head.setTextureOffset(53, 14).addBox(-3.0F, -7.0F, -7.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(10, 32).addBox(-3.0F, -8.0F, -7.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(40, 63).addBox(-3.0F, -8.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(34, 63).addBox(2.0F, -8.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(10, 28).addBox(-2.0F, -10.0F, -6.8F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(28, 41).addBox(-2.0F, -9.5F, -7.8F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(52, 38).addBox(-3.0F, -9.5F, -7.2F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(12, 45).addBox(-1.0F, -10.5F, -6.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(64, 24).addBox(-2.8F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(52, 63).addBox(0.8F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 63).addBox(2.9F, -9.5F, -4.7F, 2.0F, 2.0F, 1.0F, -0.25F, false);
		head.setTextureOffset(61, 0).addBox(-4.9F, -9.5F, -4.7F, 2.0F, 2.0F, 1.0F, -0.25F, false);
		head.setTextureOffset(0, 34).addBox(0.7F, -13.8F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 20).addBox(-2.8F, -13.8F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 28).addBox(-4.5F, -13.5F, -4.0F, 1.0F, 7.0F, 8.0F, 0.25F, false);
		head.setTextureOffset(24, 21).addBox(3.5F, -13.5F, -4.0F, 1.0F, 7.0F, 8.0F, 0.25F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -15.5F, -1.5F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, -1.0036F, 1.5708F, 0.0F);
		head_r1.setTextureOffset(24, 60).addBox(-2.5F, -5.3F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(0.0F, -15.5F, -1.5F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, -0.3054F, 1.5708F, 0.0F);
		head_r2.setTextureOffset(59, 43).addBox(-2.5F, -1.8F, 1.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(-0.4F, -16.1524F, -1.6356F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, -1.0036F, -2.7053F, 0.0F);
		head_r3.setTextureOffset(59, 34).addBox(-1.0F, -2.6423F, -0.9196F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(-0.4F, -16.1524F, -1.6356F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, -0.3054F, -2.7053F, 0.0F);
		head_r4.setTextureOffset(0, 16).addBox(-1.0F, -0.3552F, -0.9128F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(0.0F, -15.5F, -1.5F);
		head.addChild(head_r5);
		setRotationAngle(head_r5, -1.0036F, -1.5708F, 0.0F);
		head_r5.setTextureOffset(60, 54).addBox(0.5F, -5.3F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		head_r6 = new ModelRenderer(this);
		head_r6.setRotationPoint(0.0F, -15.5F, -1.5F);
		head.addChild(head_r6);
		setRotationAngle(head_r6, -0.3054F, -1.5708F, 0.0F);
		head_r6.setTextureOffset(62, 3).addBox(0.5F, -1.8F, 1.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(24, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.25F, false);
		body.setTextureOffset(0, 16).addBox(-5.0F, -6.0F, -3.5F, 10.0F, 6.0F, 6.0F, 0.25F, false);
		body.setTextureOffset(27, 11).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 5.0F, 5.0F, 0.25F, false);
		body.setTextureOffset(34, 21).addBox(-5.0F, -6.0F, -4.3F, 10.0F, 6.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(32, 8).addBox(-3.5F, 0.0F, -4.3F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(28, 62).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(61, 20).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(55, 19).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(55, 1).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
		right_leg.setTextureOffset(52, 24).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.1F, false);
		right_leg.setTextureOffset(16, 50).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		right_leg.setTextureOffset(44, 54).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(49, 0).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(62, 61).addBox(-0.4F, 15.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.1F, false);
		right_leg.setTextureOffset(46, 63).addBox(-2.4F, 15.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.1F, false);
		right_leg.setTextureOffset(63, 45).addBox(1.6F, 15.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.1F, false);
		right_leg.setTextureOffset(11, 36).addBox(-2.4F, 14.0F, -4.0F, 5.0F, 2.0F, 7.0F, 0.1F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
		left_leg.setTextureOffset(50, 4).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.1F, false);
		left_leg.setTextureOffset(47, 44).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		left_leg.setTextureOffset(27, 45).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(19, 45).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(35, 29).addBox(-2.6F, 14.0F, -4.0F, 5.0F, 2.0F, 7.0F, 0.1F, false);
		left_leg.setTextureOffset(63, 51).addBox(-2.6F, 15.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.1F, false);
		left_leg.setTextureOffset(63, 48).addBox(1.4F, 15.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.1F, false);
		left_leg.setTextureOffset(6, 63).addBox(-0.6F, 15.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.1F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
		right_arm.setTextureOffset(0, 45).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 4).addBox(2.0F, 4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(3.0F, 10.3333F, 0.0F);
		right_arm.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
		right_arm_r1.setTextureOffset(10, 34).addBox(-2.0F, 8.6667F, -15.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(36, 39).addBox(-3.0F, 8.6667F, -14.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(0, 0).addBox(-0.5F, 8.6667F, -18.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(28, 38).addBox(-2.0F, 8.6667F, -10.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(12, 60).addBox(-2.0F, 6.6667F, -7.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(43, 44).addBox(-1.0F, 5.6667F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(48, 54).addBox(-2.0F, 0.6667F, -7.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
		left_arm.setTextureOffset(31, 44).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(32, 54).addBox(-5.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 31).addBox(-4.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 28).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 55).addBox(-5.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}