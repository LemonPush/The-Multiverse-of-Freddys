// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelStone extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm_r2;

	public ModelStone() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -1.0F, 0.0F);
		head.setTextureOffset(21, 16).addBox(-3.5F, -14.0F, -3.5F, 7.0F, 7.0F, 7.0F, 0.5F, false);
		head.setTextureOffset(47, 27).addBox(-2.5F, -7.5F, -6.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-1.5F, -9.5F, -8.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(14, 23).addBox(-1.0F, -10.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 13).addBox(-1.5F, -7.5F, -8.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(39, 9).addBox(-2.5F, -9.5F, -6.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(9, 41).addBox(-1.5F, -10.5F, -6.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 9).addBox(-1.0F, -11.1F, -5.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(20, 47).addBox(-2.9F, -13.1F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(18, 41).addBox(0.9F, -13.1F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(44, 47).addBox(0.9F, -14.1F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(32, 47).addBox(-2.9F, -14.1F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(17, 9).addBox(-4.5F, 6.0F, -2.0F, 9.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 26).addBox(-4.0F, -5.5F, -2.0F, 8.0F, 11.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(24, 30).addBox(-4.5F, -6.0F, -2.5F, 9.0F, 3.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 41).addBox(1.5F, -3.0F, -2.5F, 2.0F, 4.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(32, 38).addBox(-3.5F, -3.0F, -2.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(47, 31).addBox(-6.0F, -5.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(17, 16).addBox(4.0F, -5.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(51, 13).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 4).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 7.5F, 2.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -1.2117F, -0.1624F, 0.4068F);
		body_r1.setTextureOffset(0, 9).addBox(-1.5F, -0.8F, -0.5F, 3.0F, 3.0F, 11.0F, 0.0F, true);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(0.0F, 7.5F, 2.0F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, -1.2117F, 0.1624F, -0.4068F);
		body_r2.setTextureOffset(0, 9).addBox(-1.5F, -0.8F, -0.5F, 3.0F, 3.0F, 11.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(0.0F, 7.5F, 2.0F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, -1.1781F, 0.0F, 0.0F);
		body_r3.setTextureOffset(0, 9).addBox(-1.5F, -0.8F, -0.5F, 3.0F, 3.0F, 11.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.5F, -5.0F, 0.5F);
		right_arm.setTextureOffset(42, 13).addBox(-3.5F, -1.3F, -2.0F, 3.0F, 6.0F, 3.0F, 0.25F, false);
		right_arm.setTextureOffset(0, 0).addBox(-3.5F, 4.7F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(-2.5F, 11.0333F, 1.0F);
		right_arm.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
		right_arm_r1.setTextureOffset(0, 0).addBox(-1.0F, 10.9667F, -9.0F, 16.0F, 1.0F, 8.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(51, 19).addBox(-1.0F, 7.6667F, -7.0F, 3.0F, 3.0F, 3.0F, 0.25F, false);
		right_arm_r1.setTextureOffset(0, 23).addBox(-1.0F, 6.6667F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(40, 0).addBox(-1.0F, 1.6667F, -7.0F, 3.0F, 5.0F, 3.0F, 0.25F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.6F, 8.0F, 0.0F);
		left_leg.setTextureOffset(47, 47).addBox(-1.6F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.25F, false);
		left_leg.setTextureOffset(35, 47).addBox(-1.6F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.25F, false);
		left_leg.setTextureOffset(50, 6).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 50).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(39, 38).addBox(-2.1F, 14.0F, -4.5F, 4.0F, 2.0F, 7.0F, 0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.6F, 8.0F, 0.0F);
		right_leg.setTextureOffset(23, 47).addBox(-1.4F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.25F, false);
		right_leg.setTextureOffset(11, 47).addBox(-1.4F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.25F, false);
		right_leg.setTextureOffset(49, 0).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(8, 23).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(17, 38).addBox(-1.9F, 14.0F, -4.5F, 4.0F, 2.0F, 7.0F, 0.25F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.5F, -5.0F, 0.5F);
		left_arm.setTextureOffset(42, 13).addBox(0.5F, -1.3F, -2.0F, 3.0F, 6.0F, 3.0F, 0.25F, true);
		left_arm.setTextureOffset(0, 0).addBox(1.5F, 4.7F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(2.5F, 11.0333F, 1.0F);
		left_arm.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.0F);
		right_arm_r2.setTextureOffset(51, 19).addBox(-2.0F, 7.6667F, -7.0F, 3.0F, 3.0F, 3.0F, 0.25F, true);
		right_arm_r2.setTextureOffset(0, 23).addBox(-1.0F, 6.6667F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_arm_r2.setTextureOffset(40, 0).addBox(-2.0F, 1.6667F, -7.0F, 3.0F, 5.0F, 3.0F, 0.25F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}