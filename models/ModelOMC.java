// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelOMC extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer OMC;

	public ModelOMC() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 14.3F, 5.6F);
		Head.setTextureOffset(24, 0).addBox(-2.5F, -1.3F, -5.6F, 5.0F, 1.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(17, 16).addBox(-2.5F, -7.3F, -1.6F, 5.0F, 7.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(15, 7).addBox(-2.5F, -2.3F, -5.6F, 5.0F, 1.0F, 4.0F, 0.0F, false);
		Head.setTextureOffset(0, 7).addBox(-2.5F, -4.3F, -6.6F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(0, 13).addBox(-2.5F, -5.3F, -6.6F, 5.0F, 1.0F, 5.0F, 0.0F, false);

		OMC = new ModelRenderer(this);
		OMC.setRotationPoint(0.0F, 24.0F, 3.0F);
		OMC.setTextureOffset(0, 0).addBox(-4.0F, -3.0F, 1.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);
		OMC.setTextureOffset(0, 19).addBox(-2.5F, -10.0F, 1.5F, 5.0F, 7.0F, 3.0F, 0.0F, false);
		OMC.setTextureOffset(29, 5).addBox(-3.0F, -5.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		OMC.setTextureOffset(25, 26).addBox(-3.0F, -2.0F, -3.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		OMC.setTextureOffset(20, 0).addBox(-3.0F, -5.0F, 0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		OMC.setTextureOffset(20, 26).addBox(-3.0F, -9.0F, -0.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		OMC.setTextureOffset(20, 26).addBox(-3.0F, -8.0F, -2.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		OMC.setTextureOffset(20, 26).addBox(-3.0F, -7.0F, -4.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		OMC.setTextureOffset(20, 26).addBox(1.0F, -7.0F, -4.5F, 2.0F, 2.0F, 3.0F, 0.0F, true);
		OMC.setTextureOffset(20, 26).addBox(1.0F, -8.0F, -2.5F, 2.0F, 2.0F, 3.0F, 0.0F, true);
		OMC.setTextureOffset(20, 26).addBox(1.0F, -9.0F, -0.5F, 2.0F, 2.0F, 3.0F, 0.0F, true);
		OMC.setTextureOffset(20, 0).addBox(1.0F, -5.0F, 0.5F, 2.0F, 2.0F, 2.0F, 0.0F, true);
		OMC.setTextureOffset(29, 5).addBox(1.0F, -5.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, true);
		OMC.setTextureOffset(11, 26).addBox(1.0F, -2.0F, -3.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		OMC.setTextureOffset(18, 12).addBox(-3.0F, -9.0F, -6.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		OMC.setTextureOffset(18, 12).addBox(-3.0F, -11.0F, -8.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		OMC.setTextureOffset(18, 12).addBox(-3.0F, -15.0F, -12.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		OMC.setTextureOffset(18, 12).addBox(-3.0F, -13.0F, -10.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		OMC.setTextureOffset(0, 29).addBox(-2.5F, -13.0F, -12.0F, 1.0F, 13.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		OMC.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}