// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelfriend_fredbear extends EntityModel<Entity> {
	private final ModelRenderer bone;

	public Modelfriend_fredbear() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 6.0F);
		bone.setTextureOffset(32, 20).addBox(3.0F, -6.0F, -8.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(32, 20).addBox(-3.0F, -6.0F, -8.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-7.0F, -18.0F, -8.0F, 14.0F, 12.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(32, 20).addBox(-9.0F, -6.0F, -8.0F, 6.0F, 6.0F, 4.0F, 0.0F, true);
		bone.setTextureOffset(32, 20).addBox(5.0F, -17.0F, -8.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 16).addBox(-6.0F, -26.0F, -8.0F, 12.0F, 8.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(32, 12).addBox(-5.0F, -32.0F, -8.0F, 10.0F, 4.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 28).addBox(-7.0F, -28.0F, -8.0F, 14.0F, 2.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(32, 20).addBox(-11.0F, -17.0F, -8.0F, 6.0F, 6.0F, 4.0F, 0.0F, true);
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
		this.bone.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.bone.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}