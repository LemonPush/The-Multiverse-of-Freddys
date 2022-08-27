// Made with Blockbench 4.2.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelShooter extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;

	public ModelShooter() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 11.8F, -7.8F);
		head.setTextureOffset(0, 15).addBox(-5.0F, -9.8F, -5.2F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(0, 15).addBox(-4.0F, -16.8F, -1.2F, 3.0F, 7.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(1.0F, -16.8F, -1.2F, 3.0F, 7.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(24, 42).addBox(-4.0F, -17.8F, -5.2F, 3.0F, 2.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(42, 42).addBox(1.0F, -17.8F, -5.2F, 3.0F, 2.0F, 6.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 6.0F, -2.5F);
		body.setTextureOffset(24, 39).addBox(-7.0F, 17.0F, -5.5F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-8.0F, 17.0F, -3.5F, 16.0F, 1.0F, 14.0F, 0.0F, false);
		body.setTextureOffset(34, 29).addBox(-4.5F, 15.0F, -3.5F, 9.0F, 1.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(30, 15).addBox(-5.5F, 16.0F, -4.5F, 11.0F, 1.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(20, 36).addBox(-7.0F, 17.0F, 10.5F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(40, 24).addBox(-6.0F, 17.0F, 12.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 10.7039F, -2.5161F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.4363F, 0.0F, 0.0F);
		body_r1.setTextureOffset(0, 35).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
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