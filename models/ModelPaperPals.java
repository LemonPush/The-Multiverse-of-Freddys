// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelPaperPals extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer Paperpals;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer Paperpals2;
	private final ModelRenderer Paperpals3;

	public ModelPaperPals() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);

		Paperpals = new ModelRenderer(this);
		Paperpals.setRotationPoint(28.0F, 0.0F, -4.0F);
		body.addChild(Paperpals);
		Paperpals.setTextureOffset(0, 25).addBox(-32.0F, -19.0F, -1.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		Paperpals.setTextureOffset(0, 46).addBox(-31.5F, -11.0F, -1.0F, 3.0F, 11.0F, 1.0F, 0.0F, false);
		Paperpals.setTextureOffset(40, 44).addBox(-27.5F, -11.0F, -1.0F, 3.0F, 11.0F, 1.0F, 0.0F, false);
		Paperpals.setTextureOffset(8, 20).addBox(-27.5F, -29.0F, -2.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Paperpals.setTextureOffset(26, 9).addBox(-31.5F, -29.0F, -2.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Paperpals.setTextureOffset(43, 0).addBox(-24.0F, -17.0F, -1.0F, 3.0F, 11.0F, 1.0F, 0.0F, false);
		Paperpals.setTextureOffset(44, 12).addBox(-35.0F, -17.0F, -1.0F, 3.0F, 11.0F, 1.0F, 0.0F, false);
		Paperpals.setTextureOffset(18, 26).addBox(-32.0F, -26.0F, -2.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(-30.0F, -28.0F, -1.5F);
		Paperpals.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, 0.0F, -0.5236F);
		body_r1.setTextureOffset(0, 20).addBox(-1.5F, -4.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(-26.0F, -28.0F, -1.5F);
		Paperpals.addChild(body_r2);
		setRotationAngle(body_r2, 0.0F, 0.0F, 0.1745F);
		body_r2.setTextureOffset(18, 13).addBox(-1.5F, -4.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		Paperpals2 = new ModelRenderer(this);
		Paperpals2.setRotationPoint(36.0F, 0.0F, 1.0F);
		body.addChild(Paperpals2);
		Paperpals2.setTextureOffset(18, 0).addBox(-32.0F, -19.0F, -1.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		Paperpals2.setTextureOffset(40, 32).addBox(-31.5F, -11.0F, -1.0F, 3.0F, 11.0F, 1.0F, 0.0F, false);
		Paperpals2.setTextureOffset(36, 20).addBox(-27.5F, -11.0F, -1.0F, 3.0F, 11.0F, 1.0F, 0.0F, false);
		Paperpals2.setTextureOffset(18, 9).addBox(-29.5F, -30.0F, -2.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		Paperpals2.setTextureOffset(0, 18).addBox(-30.5F, -27.0F, -2.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Paperpals2.setTextureOffset(32, 35).addBox(-24.0F, -17.0F, -1.0F, 3.0F, 11.0F, 1.0F, 0.0F, false);
		Paperpals2.setTextureOffset(24, 35).addBox(-35.0F, -17.0F, -1.0F, 3.0F, 11.0F, 1.0F, 0.0F, false);
		Paperpals2.setTextureOffset(17, 17).addBox(-32.0F, -26.0F, -2.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		Paperpals2.setTextureOffset(16, 62).addBox(-25.0F, -27.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Paperpals2.setTextureOffset(16, 62).addBox(-24.0F, -26.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Paperpals2.setTextureOffset(16, 62).addBox(-33.0F, -26.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		Paperpals2.setTextureOffset(16, 62).addBox(-33.0F, -27.0F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);

		Paperpals3 = new ModelRenderer(this);
		Paperpals3.setRotationPoint(-36.0F, 0.0F, 1.0F);
		body.addChild(Paperpals3);
		Paperpals3.setTextureOffset(0, 9).addBox(24.0F, -19.0F, -1.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		Paperpals3.setTextureOffset(16, 35).addBox(28.5F, -11.0F, -1.0F, 3.0F, 11.0F, 1.0F, 0.0F, false);
		Paperpals3.setTextureOffset(35, 8).addBox(24.5F, -11.0F, -1.0F, 3.0F, 11.0F, 1.0F, 0.0F, false);
		Paperpals3.setTextureOffset(8, 34).addBox(21.0F, -17.0F, -1.0F, 3.0F, 11.0F, 1.0F, 0.0F, false);
		Paperpals3.setTextureOffset(0, 34).addBox(32.0F, -17.0F, -1.0F, 3.0F, 11.0F, 1.0F, 0.0F, false);
		Paperpals3.setTextureOffset(0, 0).addBox(24.0F, -26.0F, -2.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.body.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.body.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}