// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelPan extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer pan;

	public ModelPan() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);

		pan = new ModelRenderer(this);
		pan.setRotationPoint(-5.0F, 0.0F, -9.0F);
		bone.addChild(pan);
		pan.setTextureOffset(16, 19).addBox(2.0F, -11.0F, 8.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		pan.setTextureOffset(8, 19).addBox(6.0F, -11.0F, 8.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		pan.setTextureOffset(0, 11).addBox(4.0F, -22.0F, 8.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		pan.setTextureOffset(8, 11).addBox(-3.0F, -20.0F, 8.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		pan.setTextureOffset(20, 0).addBox(4.5F, -22.0F, 7.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		pan.setTextureOffset(8, 15).addBox(6.0F, -20.0F, 8.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		pan.setTextureOffset(0, 0).addBox(1.0F, -31.0F, 7.0F, 8.0F, 9.0F, 2.0F, 0.0F, false);
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