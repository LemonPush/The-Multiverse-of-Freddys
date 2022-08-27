// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelTrash extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer bucket;
	private final ModelRenderer pan;
	private final ModelRenderer vaccum;
	private final ModelRenderer cube_r1;
	private final ModelRenderer balloon;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer crate;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public ModelTrash() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);

		bucket = new ModelRenderer(this);
		bucket.setRotationPoint(0.0F, 0.0F, 5.0F);
		bone.addChild(bucket);
		bucket.setTextureOffset(66, 67).addBox(7.0F, -11.0F, -7.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		bucket.setTextureOffset(60, 18).addBox(2.0F, -20.0F, -7.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		bucket.setTextureOffset(68, 58).addBox(-2.0F, -20.5F, -7.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		bucket.setTextureOffset(0, 31).addBox(0.0F, -22.5F, -7.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bucket.setTextureOffset(67, 2).addBox(11.0F, -11.0F, -7.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		bucket.setTextureOffset(52, 42).addBox(11.0F, -20.0F, -7.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		bucket.setTextureOffset(68, 53).addBox(18.0F, -20.5F, -7.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		bucket.setTextureOffset(30, 0).addBox(19.0F, -22.5F, -7.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bucket.setTextureOffset(8, 61).addBox(9.0F, -22.0F, -7.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		bucket.setTextureOffset(114, 0).addBox(7.0F, -22.0F, -7.1F, 6.0F, 5.0F, 1.0F, 0.0F, false);
		bucket.setTextureOffset(28, 38).addBox(6.0F, -31.0F, -10.0F, 8.0F, 9.0F, 8.0F, 0.0F, false);

		pan = new ModelRenderer(this);
		pan.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(pan);
		pan.setTextureOffset(24, 66).addBox(2.0F, -11.0F, 8.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		pan.setTextureOffset(16, 66).addBox(6.0F, -11.0F, 8.0F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		pan.setTextureOffset(0, 61).addBox(4.0F, -22.0F, 8.0F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		pan.setTextureOffset(51, 0).addBox(-3.0F, -20.0F, 8.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		pan.setTextureOffset(0, 5).addBox(4.5F, -22.0F, 7.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		pan.setTextureOffset(52, 38).addBox(6.0F, -20.0F, 8.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		pan.setTextureOffset(16, 55).addBox(1.0F, -31.0F, 7.0F, 8.0F, 9.0F, 2.0F, 0.0F, false);

		vaccum = new ModelRenderer(this);
		vaccum.setRotationPoint(0.0F, 0.0F, -3.0F);
		bone.addChild(vaccum);
		vaccum.setTextureOffset(30, 0).addBox(-8.0F, -3.0F, 8.0F, 7.0F, 3.0F, 7.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.0F, -1.5F, 14.0F);
		vaccum.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(60, 22).addBox(6.0F, -14.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(51, 4).addBox(-2.5F, -18.0F, -1.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(51, 4).addBox(0.5F, -18.0F, -1.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(68, 28).addBox(-9.0F, -14.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(40, 16).addBox(-6.0F, -13.5F, -1.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(68, 34).addBox(1.0F, -13.5F, -1.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(55, 7).addBox(-1.5F, -28.5F, -1.5F, 3.0F, 8.0F, 3.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 46).addBox(-3.0F, -16.5F, 1.0F, 6.0F, 13.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(36, 55).addBox(-1.0F, -20.5F, -1.0F, 2.0F, 20.0F, 2.0F, 0.0F, false);

		balloon = new ModelRenderer(this);
		balloon.setRotationPoint(-8.0F, 0.0F, 0.0F);
		bone.addChild(balloon);
		balloon.setTextureOffset(0, 0).addBox(-10.0F, -18.0F, -6.0F, 10.0F, 18.0F, 10.0F, 0.0F, false);
		balloon.setTextureOffset(36, 20).addBox(-9.0F, -31.0F, -5.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);
		balloon.setTextureOffset(0, 0).addBox(-6.0F, -21.0F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.0F, -16.0F, -1.0F);
		balloon.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.2182F);
		cube_r2.setTextureOffset(44, 55).addBox(0.5F, 2.0F, -2.0F, 2.0F, 14.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-9.0F, -16.0F, -1.0F);
		balloon.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.2182F);
		cube_r3.setTextureOffset(56, 51).addBox(-2.5F, 2.0F, -2.0F, 2.0F, 14.0F, 4.0F, 0.0F, false);

		crate = new ModelRenderer(this);
		crate.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(crate);
		crate.setTextureOffset(0, 110).addBox(-4.5F, -9.0F, -14.0F, 9.0F, 9.0F, 9.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-7.0F, -4.0F, -9.5F);
		crate.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.setTextureOffset(16, 46).addBox(-7.5F, -5.0F, -0.5F, 5.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r4.setTextureOffset(67, 15).addBox(-2.5F, -3.0F, -0.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r4.setTextureOffset(0, 28).addBox(-10.5F, -5.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(7.0F, -4.0F, -9.5F);
		crate.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.setTextureOffset(27, 28).addBox(7.5F, -5.0F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r5.setTextureOffset(64, 46).addBox(2.5F, -5.0F, -0.5F, 5.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r5.setTextureOffset(68, 63).addBox(-2.5F, -3.0F, -0.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}