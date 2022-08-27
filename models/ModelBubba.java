// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelBubba extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelBubba() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -17.5F, 1.0F);
		head.setTextureOffset(0, 0).addBox(-7.0F, -15.5F, -1.5F, 14.0F, 15.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(36, 0).addBox(-10.0F, -3.5F, -0.5F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(36, 0).addBox(7.0F, -3.5F, -0.5F, 3.0F, 2.0F, 2.0F, 0.0F, true);
		head.setTextureOffset(44, 0).addBox(-7.0F, -15.5F, -5.5F, 14.0F, 10.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(24, 70).addBox(-7.0F, -2.5F, -5.5F, 14.0F, 2.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(24, 51).addBox(1.5F, -12.5F, -6.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(18, 46).addBox(-5.5F, -12.5F, -6.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(72, 72).addBox(-4.0F, -8.5F, -9.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(72, 17).addBox(-7.0F, -2.5F, -7.0F, 14.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(84, 33).addBox(-4.0F, -2.5F, -9.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(76, 0).addBox(-4.0F, -5.5F, -9.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(42, 30).addBox(-4.0F, -3.5F, -9.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-1.0F, -9.5F, -9.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(84, 37).addBox(6.0F, -18.5F, -1.0F, 5.0F, 5.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(78, 81).addBox(-11.0F, -18.5F, -1.0F, 5.0F, 5.0F, 3.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 10.0F, 3.0F);
		body.setTextureOffset(37, 16).addBox(-7.0F, -11.0F, -5.0F, 14.0F, 7.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(42, 34).addBox(-2.0F, -13.0F, -3.5F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(60, 84).addBox(-1.5F, -25.0F, -5.5F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(84, 54).addBox(-1.5F, -21.0F, -5.5F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(44, 84).addBox(-2.0F, -21.0F, 0.5F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(14, 76).addBox(-2.0F, -27.0F, 4.5F, 4.0F, 15.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 76).addBox(-2.0F, -27.0F, 10.5F, 4.0F, 15.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(78, 45).addBox(-2.0F, -27.0F, 7.5F, 4.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(78, 24).addBox(-2.0F, -15.0F, 7.5F, 4.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(28, 76).addBox(-2.0F, -21.0F, 7.5F, 4.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 23).addBox(-7.0F, -28.0F, -5.0F, 14.0F, 16.0F, 7.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-7.0F, -16.0F, 1.5F);
		right_arm.setTextureOffset(0, 46).addBox(-6.0F, -2.0F, -3.0F, 6.0F, 24.0F, 6.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(7.0F, -16.0F, 1.5F);
		left_arm.setTextureOffset(36, 40).addBox(0.0F, -2.0F, -3.0F, 6.0F, 24.0F, 6.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.5F, 9.5F, 1.75F);
		right_leg.setTextureOffset(60, 51).addBox(-3.0F, -3.5F, -3.25F, 6.0F, 15.0F, 6.0F, 0.0F, false);
		right_leg.setTextureOffset(51, 72).addBox(-3.0F, 11.5F, -5.75F, 6.0F, 3.0F, 9.0F, 0.0F, false);
		right_leg.setTextureOffset(36, 0).addBox(-5.5F, 11.5F, -1.25F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.5F, 9.5F, 1.75F);
		left_leg.setTextureOffset(60, 30).addBox(-3.0F, -3.5F, -3.25F, 6.0F, 15.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(72, 5).addBox(-3.0F, 11.5F, -5.75F, 6.0F, 3.0F, 9.0F, 0.0F, false);
		left_leg.setTextureOffset(36, 0).addBox(2.5F, 11.5F, -1.25F, 3.0F, 2.0F, 2.0F, 0.0F, true);
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