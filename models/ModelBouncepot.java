// Made with Blockbench 4.1.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelBouncepot extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public ModelBouncepot() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 8.0572F, 0.0F);
		head.setTextureOffset(38, 20).addBox(-5.0F, -9.9572F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0F, -9.5572F, 0.0F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.setTextureOffset(0, 15).addBox(-3.8F, -0.7F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.0F, -9.5572F, 0.0F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.setTextureOffset(0, 15).addBox(-0.2F, -0.7F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, true);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-6.5F, -5.0F, -6.5F, 13.0F, 2.0F, 13.0F, 0.0F, false);
		bone.setTextureOffset(42, 40).addBox(-3.0F, -15.9F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(0, 30).addBox(-6.0F, -7.0F, -6.0F, 12.0F, 2.0F, 12.0F, 0.0F, false);
		bone.setTextureOffset(0, 15).addBox(-6.0F, -3.0F, -6.0F, 12.0F, 3.0F, 12.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.0F, -8.5F, 0.0F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.5672F);
		cube_r3.setTextureOffset(0, 0).addBox(-1.0F, -7.5F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(4.0F, -8.5F, 0.0F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.5672F);
		cube_r4.setTextureOffset(0, 0).addBox(-2.0F, -7.5F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
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