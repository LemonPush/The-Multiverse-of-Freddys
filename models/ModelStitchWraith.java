// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelStitchWraith extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer group;
	private final ModelRenderer group2;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_arm;

	public ModelStitchWraith() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.0143F, -7.0714F, 0.2857F);
		head.setTextureOffset(40, 19).addBox(-3.9857F, -8.9286F, -1.7857F, 8.0F, 8.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 31).addBox(-4.9857F, -9.9286F, -2.7857F, 10.0F, 10.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(42, 69).addBox(-4.9857F, -9.9286F, -3.7857F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(59, 68).addBox(4.0143F, -9.9286F, -3.7857F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(14, 47).addBox(-3.9857F, -9.9286F, -3.7857F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 34).addBox(-2.7857F, -7.4286F, -2.7857F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 31).addBox(0.7143F, -7.4286F, -2.7857F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		group = new ModelRenderer(this);
		group.setRotationPoint(8.0143F, 9.0714F, -9.2857F);
		head.addChild(group);
		group.setTextureOffset(52, 31).addBox(-12.0F, -18.0F, 5.5F, 8.0F, 8.0F, 2.0F, 0.0F, false);
		group.setTextureOffset(0, 0).addBox(-10.8F, -16.8F, 5.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		group.setTextureOffset(0, 0).addBox(-7.2F, -16.8F, 5.2F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		group2 = new ModelRenderer(this);
		group2.setRotationPoint(-8.0F, -10.5F, 4.5F);
		group.addChild(group2);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(48, 46).addBox(-4.5F, 6.0F, -2.0F, 9.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(64, 26).addBox(-6.5F, -5.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(60, 41).addBox(4.5F, -5.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(6, 73).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(55, 0).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(39, 57).addBox(-1.0F, -2.5F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(13, 0).addBox(-1.5F, 1.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(33, 0).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(14, 50).addBox(-5.0F, -5.4F, -1.5F, 10.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(20, 0).addBox(-6.0F, -6.4F, -3.5F, 3.0F, 24.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(0, 47).addBox(-3.0F, -6.4F, 2.5F, 6.0F, 24.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(3.0F, -6.4F, -3.5F, 3.0F, 24.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(18, 56).addBox(2.0F, -2.4F, -3.5F, 1.0F, 20.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(14, 56).addBox(-3.0F, -2.4F, -3.5F, 1.0F, 20.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(26, 56).addBox(-2.0F, 1.6F, -3.5F, 1.0F, 16.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(22, 56).addBox(1.0F, 1.6F, -3.5F, 1.0F, 16.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(53, 68).addBox(-1.0F, 5.6F, -3.5F, 2.0F, 12.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(26, 31).addBox(-1.0F, -5.0F, -2.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(52, 41).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(1.5F, 0.5F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, 0.0F, 0.5672F);
		body_r1.setTextureOffset(46, 69).addBox(0.3F, -4.5F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(-1.5F, 0.5F, 0.0F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, 0.0F, 0.0F, -0.5672F);
		body_r2.setTextureOffset(70, 41).addBox(-1.3F, -4.5F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
		left_arm.setTextureOffset(72, 65).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(72, 47).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(66, 59).addBox(1.5F, 11.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(30, 66).addBox(1.5F, 5.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(63, 65).addBox(1.5F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(40, 0).addBox(0.5F, -2.4F, -2.5F, 5.0F, 14.0F, 5.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
		left_leg.setTextureOffset(72, 37).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(72, 12).addBox(-1.1F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(72, 34).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(42, 60).addBox(-1.6F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(60, 0).addBox(-1.6F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(48, 53).addBox(-2.1F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(72, 31).addBox(0.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		left_leg.setTextureOffset(72, 15).addBox(-2.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
		right_leg.setTextureOffset(72, 6).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(72, 3).addBox(-0.9F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 72).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(60, 9).addBox(-1.4F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(30, 57).addBox(-1.4F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(34, 50).addBox(-1.9F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		right_leg.setTextureOffset(71, 53).addBox(-2.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		right_leg.setTextureOffset(70, 28).addBox(0.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
		right_arm.setTextureOffset(69, 9).addBox(-4.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(69, 0).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(62, 53).addBox(-4.5F, 11.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(64, 18).addBox(-4.5F, 5.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(54, 60).addBox(-4.5F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(32, 31).addBox(-5.5F, -2.4F, -2.5F, 5.0F, 14.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}