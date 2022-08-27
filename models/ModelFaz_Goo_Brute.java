// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelFaz_Goo_Brute extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelFaz_Goo_Brute() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.2F, -8.5F, -1.0667F);
		head.setTextureOffset(50, 26).addBox(-4.2F, -8.7F, -3.4333F, 8.0F, 8.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(41, 26).addBox(-2.7F, -3.7F, -3.5333F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(41, 26).addBox(-2.7F, -1.7F, -3.5333F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(36, 60).addBox(-4.0F, -8.5F, 0.3667F, 5.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(62, 6).addBox(0.8F, -8.7F, 0.5667F, 3.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 60).addBox(-4.2F, -4.7F, 0.5667F, 8.0F, 4.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -7.0F, 0.0F);
		body.setTextureOffset(20, 21).addBox(-9.0F, -2.0F, -5.0F, 6.0F, 8.0F, 9.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -5.0F, 12.0F, 12.0F, 9.0F, 0.0F, false);
		body.setTextureOffset(14, 21).addBox(-7.0F, 6.5F, -2.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(41, 15).addBox(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, 0.5F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-8.5F, -7.3333F, 0.0F);
		right_arm.setTextureOffset(20, 38).addBox(-4.5F, 7.8333F, -3.0F, 4.0F, 20.0F, 6.0F, 0.0F, false);
		right_arm.setTextureOffset(62, 38).addBox(-3.5F, -1.1667F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(34, 38).addBox(-2.5F, -1.1667F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(9.0F, -7.5F, 0.0F);
		left_arm.setTextureOffset(0, 21).addBox(0.0F, -2.0F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-4.5F, 8.0F, -0.5F);
		right_leg.setTextureOffset(40, 38).addBox(-3.0F, 0.0F, -2.5F, 6.0F, 16.0F, 5.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(4.5F, 8.6F, -0.5F);
		left_leg.setTextureOffset(57, 54).addBox(-3.0F, -0.6F, -2.5F, 6.0F, 7.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(56, 0).addBox(-3.0F, 12.4F, -2.5F, 6.0F, 1.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(42, 8).addBox(-3.5F, 13.4F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(33, 0).addBox(-4.0F, 14.4F, -3.5F, 8.0F, 1.0F, 7.0F, 0.0F, false);
		left_leg.setTextureOffset(24, 64).addBox(-1.0F, 6.4F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
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
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}