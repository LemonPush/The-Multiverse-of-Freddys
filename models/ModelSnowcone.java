// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelSnowcone extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer group;

	public ModelSnowcone() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.6F, -4.9F, 0.6F);
		head.setTextureOffset(0, 44).addBox(-9.4F, -17.1F, -7.6F, 20.0F, 16.0F, 14.0F, 0.0F, false);
		head.setTextureOffset(35, 89).addBox(-1.4F, -9.1F, -12.6F, 4.0F, 4.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(92, 28).addBox(-7.4F, -15.1F, -9.6F, 6.0F, 6.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(90, 44).addBox(2.6F, -15.1F, -9.6F, 6.0F, 6.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 44).addBox(7.6F, -6.1F, -9.6F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 6).addBox(-9.4F, -6.1F, -9.6F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(54, 44).addBox(-5.4F, -19.1F, -6.6F, 12.0F, 2.0F, 12.0F, 0.0F, false);
		head.setTextureOffset(68, 28).addBox(-2.9F, -26.1F, -4.6F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.1818F, 11.6785F, -2.6142F);
		body.setTextureOffset(28, 74).addBox(-2.1818F, -13.6785F, -7.3858F, 4.0F, 4.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(72, 58).addBox(-2.1818F, -5.6785F, -7.3858F, 4.0F, 4.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-10.1818F, -17.6785F, -4.3858F, 20.0F, 30.0F, 14.0F, 0.0F, false);
		body.setTextureOffset(68, 0).addBox(-10.1818F, -15.6785F, -6.3858F, 20.0F, 26.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(68, 0).addBox(-10.1818F, -15.6785F, 9.6142F, 20.0F, 26.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(54, 60).addBox(9.8182F, -15.6785F, -4.3858F, 2.0F, 26.0F, 14.0F, 0.0F, false);
		body.setTextureOffset(54, 60).addBox(-12.1818F, -15.6785F, -4.3858F, 2.0F, 26.0F, 14.0F, 0.0F, true);
		body.setTextureOffset(86, 58).addBox(11.8182F, -15.6785F, -2.3858F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		body.setTextureOffset(86, 78).addBox(13.6182F, -14.1785F, -14.3858F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(86, 78).addBox(12.6182F, -11.4785F, -14.3858F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(86, 78).addBox(19.0182F, -11.4785F, -14.3858F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(14.3182F, -12.6785F, -10.3858F, 5.0F, 4.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(14.3182F, -12.6785F, -7.3858F, 5.0F, 4.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(14.3182F, -12.6785F, -4.3858F, 5.0F, 4.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(86, 78).addBox(18.0182F, -14.1785F, -14.3858F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(86, 78).addBox(15.8182F, -14.6785F, -14.3858F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(86, 78).addBox(17.0182F, -9.1785F, -14.3858F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(86, 78).addBox(14.6182F, -9.1785F, -14.3858F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		body.setTextureOffset(54, 60).addBox(-12.1818F, -15.6785F, -4.3858F, 2.0F, 26.0F, 14.0F, 0.0F, true);
		body.setTextureOffset(86, 78).addBox(-15.9818F, -14.1785F, -14.3858F, 2.0F, 2.0F, 12.0F, 0.0F, true);
		body.setTextureOffset(86, 78).addBox(-18.1818F, -14.6785F, -14.3858F, 2.0F, 2.0F, 12.0F, 0.0F, true);
		body.setTextureOffset(86, 78).addBox(-20.3818F, -14.1785F, -14.3858F, 2.0F, 2.0F, 12.0F, 0.0F, true);
		body.setTextureOffset(86, 78).addBox(-21.3818F, -11.4785F, -14.3858F, 2.0F, 2.0F, 12.0F, 0.0F, true);
		body.setTextureOffset(86, 78).addBox(-19.3818F, -9.1785F, -14.3858F, 2.0F, 2.0F, 12.0F, 0.0F, true);
		body.setTextureOffset(86, 78).addBox(-16.9818F, -9.1785F, -14.3858F, 2.0F, 2.0F, 12.0F, 0.0F, true);
		body.setTextureOffset(86, 78).addBox(-14.9818F, -11.4785F, -14.3858F, 2.0F, 2.0F, 12.0F, 0.0F, true);
		body.setTextureOffset(0, 0).addBox(-19.6818F, -12.6785F, -10.3858F, 5.0F, 4.0F, 2.0F, 0.0F, true);
		body.setTextureOffset(0, 0).addBox(-19.6818F, -12.6785F, -7.3858F, 5.0F, 4.0F, 2.0F, 0.0F, true);
		body.setTextureOffset(0, 0).addBox(-19.6818F, -12.6785F, -4.3858F, 5.0F, 4.0F, 2.0F, 0.0F, true);

		group = new ModelRenderer(this);
		group.setRotationPoint(-12.6818F, 7.8215F, 13.1142F);
		body.addChild(group);

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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