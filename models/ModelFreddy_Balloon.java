// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelFreddy_Balloon extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;

	public ModelFreddy_Balloon() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 14.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -18.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 23).addBox(-1.0F, -10.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 23).addBox(-1.0F, -9.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(18, 16).addBox(-1.5F, -3.0F, -1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-0.5F, 1.0F, -1.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-0.5F, -8.0F, -1.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(18, 27).addBox(-2.0F, -22.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-3.0F, -19.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(26, 16).addBox(-4.0F, -10.0F, -6.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(24, 5).addBox(-4.0F, -11.0F, -6.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(24, 0).addBox(-4.0F, -13.5F, -6.8F, 8.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(26, 20).addBox(-3.0F, -14.0F, -6.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(10, 25).addBox(-1.0F, -15.0F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(10, 28).addBox(-2.8F, -16.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 26).addBox(0.7F, -16.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(10, 23).addBox(0.7F, -17.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(10, 23).addBox(-2.8F, -17.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 23).addBox(-5.0F, -13.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(16, 16).addBox(4.0F, -13.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-4.5F, -17.5F, 0.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 0.6109F);
		head_r1.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(17, 27).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(4.5F, -17.5F, 0.0F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, -0.6109F);
		head_r2.setTextureOffset(0, 4).addBox(0.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head_r2.setTextureOffset(0, 29).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
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