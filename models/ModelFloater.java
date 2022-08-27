// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelFloater extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;

	public ModelFloater() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 4.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 7.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(14, 20).addBox(-5.0F, -3.0F, -5.0F, 10.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 17).addBox(-4.0F, -17.0F, -1.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(1.0F, -17.0F, -1.0F, 3.0F, 7.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(18, 24).addBox(-4.0F, -18.0F, -5.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 30).addBox(1.0F, -18.0F, -5.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -1.5F, 0.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.829F, 0.0F, 0.0F);
		head_r1.setTextureOffset(14, 17).addBox(-5.0F, -1.4F, -5.5F, 10.0F, 1.0F, 2.0F, 0.0F, false);
		head_r1.setTextureOffset(30, 0).addBox(-3.0F, -0.4F, -5.5F, 6.0F, 3.0F, 2.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 17).addBox(3.0F, -0.4F, -5.5F, 2.0F, 3.0F, 10.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 30).addBox(3.5F, -4.4F, -1.5F, 1.0F, 4.0F, 1.0F, 0.0F, true);
		head_r1.setTextureOffset(0, 30).addBox(-4.5F, -4.4F, -1.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 17).addBox(-5.0F, -0.4F, -5.5F, 2.0F, 3.0F, 10.0F, 0.0F, false);
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