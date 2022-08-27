// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelSeaBonnies extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public ModelSeaBonnies() {
		textureWidth = 16;
		textureHeight = 16;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.5F, 16.0F, -4.0F);
		bone.setTextureOffset(0, 8).addBox(-1.5F, -1.0F, -2.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(7, 11).addBox(0.0F, 0.0F, 3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(9, 2).addBox(0.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(6, 8).addBox(0.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.5F, 0.0F, 7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(9, 9).addBox(0.0F, 0.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(11, 11).addBox(-2.0F, 0.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(0, 12).addBox(-2.0F, 0.0F, 3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(9, 4).addBox(-2.0F, 0.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(9, 0).addBox(-2.0F, 0.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0F, 0.0F, -1.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.4363F);
		cube_r1.setTextureOffset(3, 4).addBox(-0.4F, -2.1F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, -1.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.4363F);
		cube_r2.setTextureOffset(0, 2).addBox(-0.6F, -2.1F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}