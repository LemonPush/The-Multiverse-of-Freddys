// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelHourglass extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer back_left;
	private final ModelRenderer front_left;
	private final ModelRenderer back_right;
	private final ModelRenderer front_right;

	public ModelHourglass() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -0.8333F, -5.1111F);
		head.setTextureOffset(0, 18).addBox(-4.0F, -1.1667F, -9.8889F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(52, 41).addBox(-3.0F, 0.8333F, -9.8889F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(32, 53).addBox(-3.0F, 2.8333F, -7.8889F, 6.0F, 5.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(46, 18).addBox(-3.0F, 6.8333F, -9.8889F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(32, 27).addBox(-5.0F, -7.1667F, -7.8889F, 10.0F, 10.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(32, 41).addBox(-4.0F, -6.1667F, -3.8889F, 8.0F, 8.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(56, 44).addBox(3.0F, -11.1667F, -6.3889F, 5.0F, 5.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(48, 53).addBox(-8.0F, -11.1667F, -6.3889F, 5.0F, 5.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 0).addBox(-1.0F, -2.1667F, -10.8889F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 4.0F, 0.0F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 3.5F, 6.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -0.6109F, 0.0F, 0.0F);
		body_r1.setTextureOffset(0, 0).addBox(-6.0F, -2.5F, -14.0F, 12.0F, 5.0F, 22.0F, 0.0F, false);

		back_left = new ModelRenderer(this);
		back_left.setRotationPoint(4.0F, 10.0F, 12.0F);
		back_left.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

		front_left = new ModelRenderer(this);
		front_left.setRotationPoint(5.0F, 0.0F, -5.0F);
		front_left.setTextureOffset(0, 27).addBox(1.0F, -2.0F, -2.0F, 4.0F, 26.0F, 4.0F, 0.0F, false);

		back_right = new ModelRenderer(this);
		back_right.setRotationPoint(-4.0F, 10.0F, 12.0F);
		back_right.setTextureOffset(0, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, true);

		front_right = new ModelRenderer(this);
		front_right.setRotationPoint(-5.0F, 0.0F, -5.0F);
		front_right.setTextureOffset(0, 27).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 26.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		back_left.render(matrixStack, buffer, packedLight, packedOverlay);
		front_left.render(matrixStack, buffer, packedLight, packedOverlay);
		back_right.render(matrixStack, buffer, packedLight, packedOverlay);
		front_right.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.front_left.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.back_right.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.back_left.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.front_right.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}