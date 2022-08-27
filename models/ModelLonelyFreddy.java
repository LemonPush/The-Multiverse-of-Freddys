// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelLonelyFreddy extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelLonelyFreddy() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 9.7778F, -0.2222F);
		head.setTextureOffset(0, 26).addBox(-3.5F, -3.7778F, -4.7778F, 7.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.5F, -7.7778F, -2.7778F, 7.0F, 7.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(6, 38).addBox(-1.0F, -4.2778F, -5.2778F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(36, 25).addBox(-2.7F, -6.2778F, -3.2778F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(24, 35).addBox(0.7F, -6.2778F, -3.2778F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(30, 19).addBox(-1.5F, -10.7778F, -1.2778F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(28, 7).addBox(-2.0F, -8.2778F, -1.7778F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(35, 13).addBox(2.5F, -9.7778F, -0.7778F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(32, 0).addBox(-5.5F, -9.7778F, -0.7778F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(19, 14).addBox(-3.0F, 17.0F, -1.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 14).addBox(-3.5F, 10.0F, -2.0F, 7.0F, 7.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(18, 28).addBox(-2.5F, 10.5F, -2.3F, 5.0F, 6.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(32, 37).addBox(-1.5F, 12.3F, -2.6F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 3).addBox(0.4F, 9.9F, -2.6F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 14).addBox(-0.5F, 10.4F, -2.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-2.4F, 9.9F, -2.6F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(2.7F, 9.8F, 0.0F);
		left_arm.setTextureOffset(0, 31).addBox(1.0F, -0.5F, -1.0F, 2.0F, 7.0F, 2.0F, 0.25F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-2.7F, 9.8F, 0.0F);
		right_arm.setTextureOffset(30, 28).addBox(-3.0F, -0.5F, -1.0F, 2.0F, 7.0F, 2.0F, 0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-1.7F, 16.25F, -0.25F);
		right_leg.setTextureOffset(19, 21).addBox(-1.5F, 5.75F, -2.75F, 3.0F, 2.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(16, 35).addBox(-1.0F, 0.75F, -0.75F, 2.0F, 5.0F, 2.0F, 0.25F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(1.7F, 16.25F, -0.25F);
		left_leg.setTextureOffset(21, 0).addBox(-1.5F, 5.75F, -2.75F, 3.0F, 2.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(8, 31).addBox(-1.0F, 0.75F, -0.75F, 2.0F, 5.0F, 2.0F, 0.25F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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