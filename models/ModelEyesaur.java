// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelEyesaur extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer back_right;
	private final ModelRenderer back_left;

	public ModelEyesaur() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.4615F, 4.5385F, -7.3077F);
		head.setTextureOffset(0, 39).addBox(-6.5385F, -6.5385F, -10.6923F, 14.0F, 14.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(62, 69).addBox(-6.0385F, -3.5385F, -18.6923F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(74, 50).addBox(-6.0385F, -6.5385F, -14.6923F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(73, 0).addBox(-6.0385F, -0.5385F, -14.6923F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(34, 63).addBox(-6.0385F, 2.4615F, -18.6923F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(69, 14).addBox(-1.5385F, -6.5385F, -18.6923F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(50, 65).addBox(-1.5385F, 0.4615F, -18.6923F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(66, 61).addBox(2.9615F, 2.4615F, -18.6923F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(14, 71).addBox(2.9615F, -3.5385F, -18.6923F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(74, 35).addBox(2.9615F, -6.5385F, -14.6923F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(18, 63).addBox(-1.5385F, -4.5385F, -14.6923F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(30, 71).addBox(2.9615F, -0.5385F, -14.6923F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(46, 73).addBox(-1.5385F, 2.4615F, -14.6923F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(48, 54).addBox(-3.5F, -22.5F, 21.0F, 7.0F, 7.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 63).addBox(-2.5F, -21.5F, 25.0F, 5.0F, 5.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(48, 39).addBox(-5.5F, -24.5F, 17.0F, 11.0F, 11.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-7.0F, -26.0F, -8.0F, 14.0F, 14.0F, 25.0F, 0.0F, false);
		body.setTextureOffset(74, 73).addBox(-0.5F, -32.0F, -15.0F, 1.0F, 6.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 72).addBox(-0.5F, -32.0F, -7.0F, 1.0F, 6.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(38, 39).addBox(-0.5F, -32.0F, 1.0F, 1.0F, 6.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 39).addBox(-0.5F, -32.0F, 9.0F, 1.0F, 6.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-4.5F, 11.75F, -5.5F);
		right_leg.setTextureOffset(0, 0).addBox(-2.5F, -0.75F, -2.5F, 5.0F, 13.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(30, 63).addBox(1.5F, 11.25F, -5.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(63, 20).addBox(-0.5F, 11.25F, -5.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(66, 54).addBox(-2.5F, 11.25F, -5.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(4.5F, 11.75F, -5.5F);
		left_leg.setTextureOffset(53, 0).addBox(-2.5F, -0.75F, -2.5F, 5.0F, 13.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(14, 63).addBox(-2.5F, 11.25F, -5.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(58, 19).addBox(-0.5F, 11.25F, -5.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(53, 18).addBox(1.5F, 11.25F, -5.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		back_right = new ModelRenderer(this);
		back_right.setRotationPoint(-4.5F, 11.75F, 13.5F);
		back_right.setTextureOffset(0, 0).addBox(-2.5F, -0.75F, -2.5F, 5.0F, 13.0F, 5.0F, 0.0F, false);
		back_right.setTextureOffset(0, 18).addBox(1.5F, 11.25F, -5.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		back_right.setTextureOffset(17, 15).addBox(-0.5F, 11.25F, -5.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		back_right.setTextureOffset(15, 0).addBox(-2.5F, 11.25F, -5.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		back_left = new ModelRenderer(this);
		back_left.setRotationPoint(4.5F, 11.75F, 13.5F);
		back_left.setTextureOffset(0, 0).addBox(-2.5F, -0.75F, -2.5F, 5.0F, 13.0F, 5.0F, 0.0F, false);
		back_left.setTextureOffset(44, 39).addBox(-2.5F, 11.25F, -5.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		back_left.setTextureOffset(13, 19).addBox(-0.5F, 11.25F, -5.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		back_left.setTextureOffset(8, 18).addBox(1.5F, 11.25F, -5.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		back_right.render(matrixStack, buffer, packedLight, packedOverlay);
		back_left.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.back_right.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.back_left.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}