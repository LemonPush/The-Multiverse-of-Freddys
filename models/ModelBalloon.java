// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelBalloon extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer balloon;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public ModelBalloon() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);

		balloon = new ModelRenderer(this);
		balloon.setRotationPoint(5.0F, 0.0F, 0.0F);
		bone.addChild(balloon);
		balloon.setTextureOffset(0, 0).addBox(-10.0F, -18.0F, -6.0F, 10.0F, 18.0F, 10.0F, 0.0F, false);
		balloon.setTextureOffset(0, 28).addBox(-9.0F, -31.0F, -5.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
		balloon.setTextureOffset(0, 0).addBox(-6.0F, -21.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0F, -16.0F, -1.0F);
		balloon.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.2182F);
		cube_r1.setTextureOffset(32, 28).addBox(0.5F, 2.0F, -2.0F, 2.0F, 14.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-9.0F, -16.0F, -1.0F);
		balloon.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.2182F);
		cube_r2.setTextureOffset(40, 0).addBox(-2.5F, 2.0F, -2.0F, 2.0F, 14.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}