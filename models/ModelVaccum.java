// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelVaccum extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer vaccum;
	private final ModelRenderer cube_r1;

	public ModelVaccum() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);

		vaccum = new ModelRenderer(this);
		vaccum.setRotationPoint(4.0F, 0.0F, -11.0F);
		bone.addChild(vaccum);
		vaccum.setTextureOffset(0, 0).addBox(-7.5F, -3.0F, 8.0F, 7.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.0F, -1.5F, 14.0F);
		vaccum.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(21, 0).addBox(6.0F, -14.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(-2.5F, -18.0F, -1.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 0).addBox(0.5F, -18.0F, -1.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(24, 21).addBox(-9.0F, -14.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 25).addBox(-6.0F, -13.5F, -1.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(24, 27).addBox(1.0F, -13.5F, -1.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(24, 10).addBox(-1.5F, -28.5F, -1.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 10).addBox(-3.0F, -16.5F, 1.0F, 6.0F, 13.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(16, 10).addBox(-1.0F, -20.5F, -1.0F, 2.0F, 20.0F, 2.0F, 0.0F, false);
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