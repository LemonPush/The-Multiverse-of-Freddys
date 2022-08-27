// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelBoxbyte extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelBoxbyte() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-7.0F, -26.0F, -7.0F, 14.0F, 20.0F, 14.0F, 0.0F, false);
		bone.setTextureOffset(24, 34).addBox(7.0F, -19.0F, -3.5F, 5.0F, 6.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(0, 34).addBox(-12.0F, -19.0F, -3.5F, 5.0F, 6.0F, 7.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.5F, 18.0F, 0.0F);
		left_leg.setTextureOffset(41, 40).addBox(-2.5F, 0.0F, -3.5F, 5.0F, 6.0F, 7.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.5F, 18.0F, 0.0F);
		right_leg.setTextureOffset(41, 40).addBox(-2.5F, 0.0F, -3.5F, 5.0F, 6.0F, 7.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}