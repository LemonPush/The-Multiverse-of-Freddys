// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelMendo extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelMendo() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -6.5667F, 0.5556F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -9.4333F, -2.5556F, 8.0F, 9.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(14, 33).addBox(-3.5F, -8.4333F, -3.0556F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(14, 33).addBox(0.5F, -8.4333F, -3.0556F, 3.0F, 3.0F, 4.0F, 0.0F, true);
		head.setTextureOffset(0, 0).addBox(-0.5F, -12.4333F, -1.0556F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(20, 0).addBox(-1.0F, -14.4333F, -1.5556F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(34, 26).addBox(-3.5F, -4.1333F, -4.5556F, 7.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 33).addBox(-3.5F, -2.0333F, -4.5556F, 7.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 30).addBox(-3.5F, -3.0333F, -4.5556F, 7.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 30).addBox(-3.5F, -3.6333F, -4.5556F, 7.0F, 1.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.2625F, 0.025F);
		body.setTextureOffset(0, 23).addBox(-4.5F, 1.9625F, -2.025F, 9.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(22, 19).addBox(-4.5F, 6.2625F, -2.025F, 9.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(24, 42).addBox(-6.5F, -4.7375F, -1.025F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(42, 4).addBox(4.5F, -4.7375F, -1.025F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(37, 0).addBox(-1.0F, 4.2625F, -0.825F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 13).addBox(-5.0F, -5.1375F, -2.525F, 10.0F, 7.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 13).addBox(-5.0F, -5.1375F, -0.525F, 10.0F, 7.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(23, 11).addBox(-1.0F, -6.7375F, -1.025F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
		left_arm.setTextureOffset(44, 17).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(34, 29).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(24, 0).addBox(1.0F, 11.0F, -2.5F, 4.0F, 6.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(32, 42).addBox(4.0F, 17.0F, -2.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		left_arm.setTextureOffset(29, 48).addBox(1.0F, 17.0F, -2.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		left_arm.setTextureOffset(32, 42).addBox(4.0F, 17.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		left_arm.setTextureOffset(32, 42).addBox(4.0F, 17.0F, 1.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		left_arm.setTextureOffset(40, 29).addBox(1.5F, 5.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(12, 40).addBox(1.5F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
		right_arm.setTextureOffset(44, 17).addBox(-4.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_arm.setTextureOffset(34, 29).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_arm.setTextureOffset(24, 0).addBox(-5.0F, 11.0F, -2.5F, 4.0F, 6.0F, 5.0F, 0.0F, true);
		right_arm.setTextureOffset(32, 42).addBox(-5.0F, 17.0F, -2.5F, 1.0F, 6.0F, 1.0F, 0.0F, true);
		right_arm.setTextureOffset(29, 48).addBox(-2.0F, 17.0F, -2.5F, 1.0F, 4.0F, 1.0F, 0.0F, true);
		right_arm.setTextureOffset(32, 42).addBox(-5.0F, 17.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, true);
		right_arm.setTextureOffset(32, 42).addBox(-5.0F, 17.0F, 1.5F, 1.0F, 6.0F, 1.0F, 0.0F, true);
		right_arm.setTextureOffset(40, 29).addBox(-4.5F, 5.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, true);
		right_arm.setTextureOffset(12, 40).addBox(-4.5F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
		left_leg.setTextureOffset(12, 48).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(46, 37).addBox(-1.1F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(48, 3).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(40, 8).addBox(-1.6F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 36).addBox(-1.6F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(20, 26).addBox(-2.1F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 48).addBox(0.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		left_leg.setTextureOffset(47, 46).addBox(-2.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
		right_leg.setTextureOffset(22, 46).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(6, 46).addBox(-0.9F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(45, 0).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(37, 39).addBox(-1.4F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(28, 33).addBox(-1.4F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(26, 11).addBox(-1.9F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 45).addBox(-2.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		right_leg.setTextureOffset(44, 20).addBox(0.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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