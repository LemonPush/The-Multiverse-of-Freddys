// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelElChip extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelElChip() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(0, 37).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-4.0F, -9.4F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(66, 59).addBox(4.0F, -14.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-8.0F, -15.0F, -7.0F, 16.0F, 1.0F, 14.0F, 0.0F, false);
		head.setTextureOffset(26, 54).addBox(-3.5F, -17.0F, -3.5F, 7.0F, 2.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-1.5F, -19.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(64, 43).addBox(-6.0F, -14.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(46, 9).addBox(-3.0F, -10.4F, -6.0F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 5).addBox(-2.0F, -10.7F, -5.6F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(93, 16).addBox(-1.0F, -11.0F, -6.1F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(62, 56).addBox(-3.0F, -7.0F, -6.0F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(24, 37).addBox(2.9F, -9.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(33, 15).addBox(2.9F, -9.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(9, 0).addBox(-3.9F, -9.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 26).addBox(-3.9F, -9.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(32, 37).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(114, 6).addBox(-3.0F, -8.4F, -6.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(114, 4).addBox(-3.0F, -8.0F, -6.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(48, 67).addBox(0.7F, -12.7F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(98, 30).addBox(0.7F, -13.9F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(92, 30).addBox(-2.7F, -13.9F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(67, 46).addBox(-2.7F, -12.7F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(27, 46).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(33, 15).addBox(-5.0F, -6.5F, -2.5F, 10.0F, 12.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 15).addBox(-4.0F, -5.5F, -2.75F, 8.0F, 10.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(44, 61).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(12, 26).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(45, 56).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 37).addBox(-1.0F, -10.0F, -0.8F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.5F, 7.5F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -1.0036F, 0.0F, 0.0F);
		body_r1.setTextureOffset(0, 15).addBox(-4.0F, -2.9F, 0.1F, 7.0F, 3.0F, 19.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.7F, -5.0F, 0.0F);
		right_arm.setTextureOffset(32, 61).addBox(-5.0F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(63, 19).addBox(-5.0F, 4.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(18, 50).addBox(-4.0F, 8.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(46, 0).addBox(-4.0F, 3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 26).addBox(-5.0F, 9.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.7F, -5.0F, 0.0F);
		left_arm.setTextureOffset(0, 60).addBox(1.0F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(62, 63).addBox(1.0F, 4.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 50).addBox(2.0F, 8.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(46, 3).addBox(2.0F, 3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(24, 37).addBox(1.0F, 9.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.0F, 7.6F, -0.2F);
		right_leg.setTextureOffset(16, 61).addBox(-2.0F, 8.4F, -1.8F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(63, 28).addBox(-2.0F, 7.15F, -2.3F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		right_leg.setTextureOffset(50, 56).addBox(-2.0F, 0.9F, -1.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(28, 61).addBox(-1.0F, 7.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(52, 32).addBox(-1.0F, 0.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 50).addBox(-2.5F, 14.4F, -4.8F, 5.0F, 2.0F, 8.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.0F, 7.6F, -0.2F);
		left_leg.setTextureOffset(60, 9).addBox(-2.0F, 8.4F, -1.8F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(56, 32).addBox(-2.0F, 0.9F, -1.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(12, 60).addBox(-1.0F, 7.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 53).addBox(-1.0F, 0.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(49, 46).addBox(-2.5F, 14.4F, -4.8F, 5.0F, 2.0F, 8.0F, 0.0F, false);
		left_leg.setTextureOffset(18, 53).addBox(-2.0F, 7.15F, -2.3F, 4.0F, 2.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}