// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelTentacle extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public ModelTentacle() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 11.3569F, -0.7262F);
		bone.setTextureOffset(0, 0).addBox(-7.0F, 11.6431F, -6.2738F, 14.0F, 1.0F, 14.0F, 0.0F, false);
		bone.setTextureOffset(0, 15).addBox(-6.5F, 10.6431F, -5.7738F, 13.0F, 1.0F, 13.0F, 0.0F, false);
		bone.setTextureOffset(0, 29).addBox(-6.0F, 9.6431F, -5.2738F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(0, 42).addBox(-3.0F, 1.6431F, -2.2738F, 6.0F, 11.0F, 6.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.5F, -11.351F, 0.9244F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.0472F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(24, 42).addBox(-1.5F, -12.9056F, 0.9015F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.5F, -11.351F, 0.9244F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.5236F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(36, 29).addBox(-1.5F, -6.6779F, -2.2328F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -4.5991F, 2.2438F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(39, 15).addBox(-2.5F, -7.0566F, -2.4105F, 5.0F, 8.0F, 5.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 2.5431F, 0.5262F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(42, 0).addBox(-2.5F, -7.8F, -2.5F, 5.0F, 8.0F, 5.0F, 0.0F, false);
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