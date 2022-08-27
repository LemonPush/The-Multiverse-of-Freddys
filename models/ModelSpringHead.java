// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelSpringHead extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Head_r1;

	public ModelSpringHead() {
		textureWidth = 32;
		textureHeight = 32;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(0, 16).addBox(-3.0F, -3.0F, -6.0F, 6.0F, 3.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(0, 3).addBox(-0.5F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(16, 16).addBox(-3.5F, -12.0F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(16, 16).addBox(0.5F, -12.0F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(2.0F, -11.5F, 0.0F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.6545F, 0.0F, 0.0F);
		Head_r1.setTextureOffset(0, 21).addBox(-1.5F, -2.8F, -0.9F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		Head_r1.setTextureOffset(0, 0).addBox(-1.0F, -3.8F, -0.9F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Head_r1.setTextureOffset(0, 0).addBox(-5.0F, -3.8F, -0.9F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Head_r1.setTextureOffset(0, 21).addBox(-5.5F, -2.8F, -0.9F, 3.0F, 3.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}