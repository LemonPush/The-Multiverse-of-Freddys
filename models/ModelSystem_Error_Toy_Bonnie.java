// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelSystem_Error_Toy_Bonnie extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_arm;

	public ModelSystem_Error_Toy_Bonnie() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(30, 18).addBox(-3.5F, -6.0F, -5.8F, 7.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(55, 25).addBox(-3.5F, -7.0F, -5.8F, 7.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(44, 54).addBox(-3.5F, -8.0F, -5.8F, 7.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(54, 30).addBox(-3.5F, -10.0F, -5.8F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(30, 32).addBox(-3.0F, -10.5F, -5.5F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 33).addBox(-0.5F, -11.5F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(61, 53).addBox(3.5F, -9.0F, -4.5F, 2.0F, 2.0F, 1.0F, -0.25F, false);
		head.setTextureOffset(18, 27).addBox(-5.5F, -9.0F, -4.5F, 2.0F, 2.0F, 1.0F, -0.25F, false);
		head.setTextureOffset(62, 16).addBox(-2.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(15, 62).addBox(0.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(30, 36).addBox(-5.5F, -10.0F, -4.0F, 2.0F, 4.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(18, 32).addBox(3.5F, -10.0F, -4.0F, 2.0F, 4.0F, 8.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-2.0F, -14.0235F, -0.3248F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.1309F, 0.0F, -0.1745F);
		head_r1.setTextureOffset(0, 19).addBox(-0.5F, -5.8765F, -0.1752F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(42, 57).addBox(-1.5F, -4.6765F, -0.5752F, 3.0F, 4.0F, 2.0F, 0.25F, false);
		head_r1.setTextureOffset(0, 16).addBox(-0.5F, -0.8765F, -0.1752F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(-2.0F, -14.0235F, -0.3248F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.5236F, 0.0F, -0.1745F);
		head_r2.setTextureOffset(0, 4).addBox(-1.0F, -9.2677F, 1.6361F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		head_r2.setTextureOffset(32, 58).addBox(-1.5F, -8.2677F, 1.6361F, 3.0F, 3.0F, 2.0F, 0.25F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(2.0F, -14.0235F, -0.3248F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, 0.1309F, 0.0F, 0.1745F);
		head_r3.setTextureOffset(24, 3).addBox(-0.5F, -5.8765F, -0.1752F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r3.setTextureOffset(52, 57).addBox(-1.5F, -4.6765F, -0.5752F, 3.0F, 4.0F, 2.0F, 0.25F, false);
		head_r3.setTextureOffset(24, 0).addBox(-0.5F, -0.8765F, -0.1752F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(2.0F, -14.0235F, -0.3248F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, 0.5236F, 0.0F, 0.1745F);
		head_r4.setTextureOffset(0, 30).addBox(-1.0F, -9.2677F, 1.6361F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		head_r4.setTextureOffset(58, 36).addBox(-1.5F, -8.2677F, 1.6361F, 3.0F, 3.0F, 2.0F, 0.25F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(24, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.25F, false);
		body.setTextureOffset(0, 0).addBox(-1.0F, 7.0F, 3.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
		body.setTextureOffset(0, 16).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 6.0F, 5.0F, 0.25F, false);
		body.setTextureOffset(25, 22).addBox(-5.0F, 0.0F, -2.5F, 10.0F, 5.0F, 5.0F, 0.5F, false);
		body.setTextureOffset(43, 8).addBox(-4.0F, -3.0F, -3.5F, 8.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(54, 34).addBox(-3.5F, -4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(42, 42).addBox(-3.5F, 4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(12, 37).addBox(-3.0F, -5.0F, -3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(61, 56).addBox(-1.0F, -5.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(61, 12).addBox(1.0F, -6.0F, -4.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(61, 8).addBox(-3.0F, -6.0F, -4.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(40, 48).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(24, 44).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(8, 60).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 60).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
		left_arm.setTextureOffset(0, 50).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		left_arm.setTextureOffset(50, 16).addBox(1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.25F, false);
		left_arm.setTextureOffset(58, 44).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(58, 41).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(16, 54).addBox(1.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
		right_leg.setTextureOffset(28, 48).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		right_leg.setTextureOffset(46, 44).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		right_leg.setTextureOffset(49, 0).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 47).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 27).addBox(-2.4F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.25F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
		left_leg.setTextureOffset(12, 44).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		left_leg.setTextureOffset(42, 32).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		left_leg.setTextureOffset(30, 35).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(18, 30).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(25, 8).addBox(-2.6F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.25F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
		right_arm.setTextureOffset(0, 37).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		right_arm.setTextureOffset(50, 16).addBox(-5.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.25F, false);
		right_arm.setTextureOffset(0, 27).addBox(-4.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(25, 18).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(54, 0).addBox(-5.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.25F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}