// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelPhoneGuy extends EntityModel<Entity> {
	private final ModelRenderer Phone;

	public ModelPhoneGuy() {
		textureWidth = 32;
		textureHeight = 32;

		Phone = new ModelRenderer(this);
		Phone.setRotationPoint(0.0F, 24.0F, 0.0F);
		Phone.setTextureOffset(0, 0).addBox(-2.0F, -20.0F, 0.0F, 4.0F, 16.0F, 2.0F, 0.0F, false);
		Phone.setTextureOffset(0, 18).addBox(-2.0F, -20.0F, -2.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		Phone.setTextureOffset(12, 0).addBox(-2.0F, -20.0F, -4.0F, 4.0F, 4.0F, 2.0F, 0.25F, false);
		Phone.setTextureOffset(19, 7).addBox(2.0F, -20.0F, -4.1F, 0.0F, 4.0F, 0.0F, 0.25F, false);
		Phone.setTextureOffset(14, 10).addBox(-2.0F, -16.0F, -4.1F, 4.0F, 0.0F, 0.0F, 0.25F, false);
		Phone.setTextureOffset(14, 10).addBox(-2.0F, -20.0F, -4.1F, 4.0F, 0.0F, 0.0F, 0.25F, false);
		Phone.setTextureOffset(19, 8).addBox(-2.0F, -20.0F, -4.1F, 0.0F, 4.0F, 0.0F, 0.25F, false);
		Phone.setTextureOffset(14, 10).addBox(-2.0F, -8.0F, -4.1F, 4.0F, 0.0F, 0.0F, 0.25F, false);
		Phone.setTextureOffset(14, 10).addBox(-2.0F, -4.0F, -4.1F, 4.0F, 0.0F, 0.0F, 0.25F, false);
		Phone.setTextureOffset(19, 7).addBox(2.0F, -8.0F, -4.1F, 0.0F, 4.0F, 0.0F, 0.25F, false);
		Phone.setTextureOffset(19, 8).addBox(-2.0F, -8.0F, -4.1F, 0.0F, 4.0F, 0.0F, 0.25F, false);
		Phone.setTextureOffset(12, 0).addBox(-2.0F, -8.0F, -4.0F, 4.0F, 4.0F, 2.0F, 0.25F, false);
		Phone.setTextureOffset(12, 6).addBox(-2.0F, -8.0F, -2.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Phone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Phone.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Phone.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}