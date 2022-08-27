// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelCandyCadet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;

	public ModelCandyCadet() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 8.0F, 0.0F);
		head.setTextureOffset(31, 0).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 30).addBox(-5.0F, -11.0F, -2.5F, 10.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(25, 23).addBox(3.0F, -13.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 23).addBox(-4.0F, -13.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 12).addBox(-6.0F, -10.0F, -3.5F, 12.0F, 4.0F, 7.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-3.5F, -12.0F, 0.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, -0.6109F);
		head_r1.setTextureOffset(0, 30).addBox(0.0F, -2.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(30, 42).addBox(-0.5F, -4.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(3.5F, -12.0F, 0.0F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, 0.6109F);
		head_r2.setTextureOffset(50, 25).addBox(-1.5F, -4.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head_r2.setTextureOffset(31, 0).addBox(-1.0F, -2.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 9.0F, 0.0F);
		body.setTextureOffset(25, 32).addBox(-3.5F, 9.0F, -2.5F, 7.0F, 5.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(38, 6).addBox(3.5F, 8.0F, -3.5F, 2.0F, 7.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(0, 16).addBox(4.0F, 11.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(41, 50).addBox(6.0F, 10.0F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 12).addBox(6.5F, 10.5F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-7.5F, 10.5F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(16, 50).addBox(-7.0F, 10.0F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 4).addBox(-6.0F, 11.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 36).addBox(-5.5F, 8.0F, -3.5F, 2.0F, 7.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(25, 25).addBox(-5.0F, 3.0F, -2.5F, 10.0F, 2.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 23).addBox(-5.0F, -4.0F, -2.5F, 10.0F, 2.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-6.0F, -2.0F, -3.5F, 12.0F, 5.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(18, 42).addBox(-2.0F, 5.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(34, 42).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(-4.5833F, -1.6667F, -0.1667F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, 0.0F, 0.7418F);
		body_r1.setTextureOffset(24, 53).addBox(-2.4167F, -1.3333F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(4.5833F, -1.6667F, -0.1667F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, 0.0F, 0.0F, -0.7418F);
		body_r2.setTextureOffset(49, 53).addBox(0.4167F, -1.3333F, -0.8333F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(6.0F, 4.1F, 0.2F);
		left_arm.setTextureOffset(0, 50).addBox(2.2841F, 3.0059F, -1.2F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(31, 48).addBox(4.2841F, 8.0059F, -1.7F, 2.0F, 4.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(47, 46).addBox(0.2841F, 8.0059F, -1.7F, 2.0F, 4.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(45, 20).addBox(2.2841F, 8.0059F, -1.7F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(49, 32).addBox(-16.2841F, 3.0059F, -1.2F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(11, 36).addBox(-18.2841F, 8.0059F, -1.7F, 2.0F, 4.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(46, 39).addBox(-14.2841F, 8.0059F, -1.7F, 2.0F, 4.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(35, 20).addBox(-16.2841F, 8.0059F, -1.7F, 2.0F, 2.0F, 3.0F, 0.0F, false);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(-11.5833F, 2.3333F, -0.1667F);
		left_arm.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, 0.0F, 0.0F, 0.7418F);
		right_arm_r1.setTextureOffset(47, 14).addBox(-3.0667F, 2.6667F, -1.0333F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(49, 6).addBox(-3.0667F, -1.3333F, -1.0333F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-0.4167F, 2.3333F, -0.1667F);
		left_arm.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, 0.0F, 0.0F, -0.7418F);
		right_arm_r2.setTextureOffset(10, 44).addBox(2.0667F, 2.6667F, -1.0333F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm_r2.setTextureOffset(8, 50).addBox(1.0667F, -1.3333F, -1.0333F, 2.0F, 4.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}