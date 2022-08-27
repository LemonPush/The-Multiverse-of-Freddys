// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelFelix_the_shark extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer bone;
	private final ModelRenderer body;
	private final ModelRenderer tail;
	private final ModelRenderer left_fin;
	private final ModelRenderer right_fin;
	private final ModelRenderer back_fin;
	private final ModelRenderer tail_fin;

	public ModelFelix_the_shark() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 20.0F, -6.0F);
		head.setTextureOffset(29, 0).addBox(-4.0F, -7.0F, -3.0F, 8.0F, 7.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 36).addBox(-4.0F, -7.0F, -6.0F, 8.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(19, 20).addBox(-4.0F, -7.0F, -5.0F, 8.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(5, 0).addBox(-1.0F, -6.5F, -7.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(38, 38).addBox(-4.0F, -2.0F, -5.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(32, 32).addBox(-4.0F, -4.0F, -5.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -4.8F, -5.3F);
		head.addChild(bone);
		setRotationAngle(bone, 0.4363F, 0.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, -3.0F);
		body.setTextureOffset(0, 0).addBox(-4.0F, -11.0F, 0.0F, 8.0F, 7.0F, 13.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 21.5F, 11.0F);
		tail.setTextureOffset(0, 20).addBox(-2.0F, -6.5F, -1.0F, 4.0F, 5.0F, 11.0F, 0.0F, false);

		left_fin = new ModelRenderer(this);
		left_fin.setRotationPoint(3.5F, 18.0F, 1.5F);
		setRotationAngle(left_fin, -1.5708F, 0.0F, -1.0036F);
		left_fin.setTextureOffset(32, 20).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 8.0F, 0.0F, false);

		right_fin = new ModelRenderer(this);
		right_fin.setRotationPoint(-3.5F, 18.0F, 1.5F);
		setRotationAngle(right_fin, -1.5708F, 0.0F, 1.0036F);
		right_fin.setTextureOffset(22, 28).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 4.0F, 8.0F, 0.0F, false);

		back_fin = new ModelRenderer(this);
		back_fin.setRotationPoint(0.0F, 13.0F, -5.0F);
		back_fin.setTextureOffset(31, 40).addBox(-0.5F, -1.0F, 19.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		back_fin.setTextureOffset(19, 25).addBox(-0.5F, 4.0F, 20.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		back_fin.setTextureOffset(29, 0).addBox(-0.5F, -4.0F, 8.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		back_fin.setTextureOffset(25, 40).addBox(-0.5F, -6.0F, 10.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);

		tail_fin = new ModelRenderer(this);
		tail_fin.setRotationPoint(0.0F, 21.5F, 20.0F);
		tail_fin.setTextureOffset(0, 0).addBox(-0.5F, -9.5F, -1.0F, 1.0F, 10.0F, 3.0F, 0.0F, false);
		tail_fin.setTextureOffset(0, 20).addBox(-0.5F, -13.5F, 2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
		tail_fin.setTextureOffset(17, 38).addBox(-0.5F, -2.5F, 2.0F, 1.0F, 5.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
		left_fin.render(matrixStack, buffer, packedLight, packedOverlay);
		right_fin.render(matrixStack, buffer, packedLight, packedOverlay);
		back_fin.render(matrixStack, buffer, packedLight, packedOverlay);
		tail_fin.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}