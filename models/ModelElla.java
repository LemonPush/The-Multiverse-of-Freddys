// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelElla extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer body;

	public ModelElla() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 13.2978F, 0.5918F);
		head.setTextureOffset(24, 25).addBox(-3.0F, -6.2978F, -3.0918F, 6.0F, 5.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 24).addBox(-3.5F, -7.2978F, -2.5918F, 7.0F, 5.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(25, 9).addBox(-3.5F, -7.2978F, -3.5918F, 7.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 43).addBox(2.5F, -2.2978F, -1.5918F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(41, 25).addBox(-3.5F, -2.2978F, -1.5918F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(30, 15).addBox(-2.5F, -2.2978F, 0.4082F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(42, 26).addBox(-3.5F, -1.2978F, -0.5918F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(30, 15).addBox(-2.5F, -1.2978F, 0.4082F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(1, 44).addBox(2.5F, -1.2978F, -0.5918F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(22, 17).addBox(0.55F, -6.0478F, -3.2918F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 20).addBox(-2.55F, -6.0478F, -3.2918F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -6.2978F, -0.5918F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.48F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 17).addBox(-4.0F, -3.2F, -2.5F, 8.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r1.setTextureOffset(22, 18).addBox(-4.0F, -1.2F, -2.5F, 8.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-5.0F, -2.2F, -3.5F, 10.0F, 1.0F, 8.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(1.75F, 19.5F, 0.0F);
		left_leg.setTextureOffset(19, 25).addBox(-1.25F, 3.5F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 9).addBox(-1.55F, 3.6F, -1.4F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 9).addBox(0.05F, 3.6F, -1.4F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 9).addBox(-2.95F, 3.6F, -1.4F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		left_leg.setTextureOffset(0, 9).addBox(-4.55F, 3.6F, -1.4F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		left_leg.setTextureOffset(10, 43).addBox(-1.25F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-1.75F, 19.5F, 0.0F);
		right_leg.setTextureOffset(29, 35).addBox(-0.75F, 3.5F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 0).addBox(-0.75F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 6).addBox(-1.5F, -11.0F, -2.2F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(25, 9).addBox(-0.5F, -8.5F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 12).addBox(-2.3F, -9.0F, -2.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 17).addBox(0.3F, -9.0F, -2.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(36, 35).addBox(-2.5F, -12.0F, -2.0F, 5.0F, 5.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 9).addBox(-4.5F, -5.0F, -3.5F, 9.0F, 1.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(0, 9).addBox(-4.5F, -6.0F, -3.5F, 9.0F, 1.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(28, 0).addBox(-3.5F, -7.0F, -2.5F, 7.0F, 1.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(11, 34).addBox(2.0F, -12.0F, -6.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 34).addBox(2.5F, -11.0F, -5.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(22, 20).addBox(-4.0F, -12.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(18, 35).addBox(-4.5F, -11.0F, -5.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(44, 6).addBox(-4.5F, -12.0F, -7.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}