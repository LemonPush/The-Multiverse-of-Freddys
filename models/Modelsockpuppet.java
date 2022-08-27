// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelsockpuppet extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;

	public Modelsockpuppet() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.6504F, -3.4769F);
		bone.setTextureOffset(0, 0).addBox(-5.0F, -8.6504F, -4.5231F, 10.0F, 9.0F, 16.0F, 0.0F, false);
		bone.setTextureOffset(0, 4).addBox(-4.0F, -6.6504F, -5.5231F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(1.0F, -6.6504F, -5.5231F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 25).addBox(-5.0F, 0.3496F, 1.4769F, 10.0F, 23.0F, 10.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 1.8496F, 2.4769F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3054F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(36, 0).addBox(-5.0F, -1.5F, -7.0F, 10.0F, 3.0F, 9.0F, 0.0F, false);
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