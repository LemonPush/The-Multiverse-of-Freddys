// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelPigPatch extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelPigPatch() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(0, 17).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(110, 0).addBox(3.5F, -10.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(110, 0).addBox(-4.5F, -10.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, true);
		head.setTextureOffset(48, 10).addBox(3.0F, -16.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(44, 36).addBox(-5.0F, -16.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 21).addBox(-1.0F, -10.4F, -6.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
		head.setTextureOffset(24, 9).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(24, 9).addBox(3.5F, -7.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(24, 9).addBox(-4.5F, -7.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, true);
		head.setTextureOffset(65, 0).addBox(-3.0F, -8.0F, -4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(48, 23).addBox(1.0F, -12.7F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(72, 25).addBox(1.5F, -10.3F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(72, 25).addBox(-3.5F, -10.3F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(48, 13).addBox(-3.0F, -12.7F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(27, 26).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-5.0F, -6.5F, -2.5F, 10.0F, 12.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 41).addBox(-4.0F, -5.5F, -2.75F, 8.0F, 10.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(22, 37).addBox(-0.5F, 2.6F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(30, 44).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(44, 18).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(36, 36).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(62, 36).addBox(-1.0F, -9.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.5F, 7.5F, 1.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -0.5672F, 0.0F, 0.0F);
		body_r1.setTextureOffset(0, 2).addBox(-0.5F, -2.3F, 6.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(0, 0).addBox(0.2F, -1.3F, 7.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(30, 18).addBox(-0.5F, -0.3F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(25, 3).addBox(-1.2F, -1.3F, 5.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(31, 20).addBox(0.2F, -1.3F, 4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(0, 37).addBox(-0.5F, -2.3F, 3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(0, 17).addBox(-0.5F, -1.3F, 0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
		right_arm.setTextureOffset(0, 52).addBox(-5.0F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(30, 0).addBox(-5.0F, 4.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 31).addBox(-4.0F, 8.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(24, 18).addBox(-4.0F, 3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(52, 23).addBox(-5.0F, 9.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
		left_arm.setTextureOffset(48, 0).addBox(1.0F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(52, 14).addBox(1.0F, 4.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(25, 0).addBox(2.0F, 8.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(24, 21).addBox(2.0F, 3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(32, 18).addBox(1.0F, 9.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.0F, 7.6F, -0.2F);
		right_leg.setTextureOffset(46, 51).addBox(-2.0F, 8.4F, -1.8F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(18, 44).addBox(-2.0F, 0.9F, -1.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(42, 0).addBox(-1.0F, 7.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(18, 31).addBox(-1.0F, 0.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(18, 34).addBox(-2.5F, 14.4F, -4.8F, 5.0F, 2.0F, 8.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.0F, 7.6F, -0.2F);
		left_leg.setTextureOffset(30, 51).addBox(-2.0F, 8.4F, -1.8F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(40, 40).addBox(-2.0F, 0.9F, -1.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(36, 39).addBox(-1.0F, 7.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 34).addBox(-1.0F, 0.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 31).addBox(-2.5F, 14.4F, -4.8F, 5.0F, 2.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}