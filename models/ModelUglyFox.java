// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelUglyFox extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelUglyFox() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(0, 16).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 47).addBox(-0.7F, -15.5F, -0.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 32).addBox(-3.0F, -6.0F, -10.2F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(0, 9).addBox(-3.0F, -9.0F, -10.2F, 6.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(32, 53).addBox(-3.0F, -9.0F, -9.2F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(52, 38).addBox(2.0F, -9.0F, -9.2F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(43, 15).addBox(-2.0F, -10.0F, -9.8F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(24, 16).addBox(-3.0F, -9.5F, -10.2F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(48, 0).addBox(-1.0F, -10.5F, -9.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(14, 40).addBox(-1.0F, -11.1F, -9.5F, 2.0F, 1.0F, 2.0F, -0.1F, false);
		head.setTextureOffset(58, 50).addBox(-2.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(14, 43).addBox(0.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(20, 40).addBox(0.7F, -13.5F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 22).addBox(-2.7F, -13.5F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 57).addBox(-8.0F, -9.0F, 0.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(43, 15).addBox(-6.0F, -9.0F, -2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(28, 43).addBox(-7.0F, -9.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 40).addBox(4.0F, -9.0F, -2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(43, 0).addBox(4.0F, -9.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(54, 7).addBox(4.0F, -9.0F, 0.0F, 4.0F, 3.0F, 2.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -15.5F, -1.5F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, -0.5236F, 1.5708F, 0.0F);
		head_r1.setTextureOffset(9, 0).addBox(-2.0F, -1.3F, 3.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 16).addBox(-2.0F, -4.8F, 2.7F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		head_r1.setTextureOffset(24, 16).addBox(-2.0F, -5.3F, 3.2F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		head_r1.setTextureOffset(18, 3).addBox(-2.0F, -5.8F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(0.0F, -15.5F, -1.5F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, -0.5236F, -1.5708F, 0.0F);
		head_r2.setTextureOffset(19, 32).addBox(1.0F, -4.8F, 2.7F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		head_r2.setTextureOffset(38, 24).addBox(1.0F, -5.8F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r2.setTextureOffset(0, 32).addBox(1.0F, -5.3F, 3.2F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		head_r2.setTextureOffset(48, 24).addBox(1.0F, -1.3F, 3.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(0.5F, -14.6F, -0.1F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, 0.0F, 0.0F, 0.2618F);
		head_r3.setTextureOffset(18, 0).addBox(-0.1F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(-0.5F, -14.6F, -0.1F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, 0.0F, 0.0F, -0.2618F);
		head_r4.setTextureOffset(50, 3).addBox(-1.2F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(18, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(27, 27).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 11.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(32, 8).addBox(-4.0F, -5.5F, -4.7F, 8.0F, 4.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(12, 57).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(39, 53).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(58, 47).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(58, 3).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 7.5F, 2.5F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -1.0036F, 0.0F, 0.0F);
		body_r1.setTextureOffset(0, 0).addBox(-1.0F, -0.8F, -1.2F, 2.0F, 2.0F, 14.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
		left_arm.setTextureOffset(34, 43).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(16, 50).addBox(1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(32, 24).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(27, 8).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(18, 8).addBox(1.5F, 11.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
		right_arm.setTextureOffset(34, 43).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		right_arm.setTextureOffset(16, 50).addBox(-5.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, true);
		right_arm.setTextureOffset(32, 24).addBox(-4.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_arm.setTextureOffset(27, 8).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_arm.setTextureOffset(18, 8).addBox(-4.5F, 11.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
		left_leg.setTextureOffset(46, 49).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(58, 0).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(57, 15).addBox(-1.1F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(57, 34).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(52, 22).addBox(-1.6F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(14, 43).addBox(-2.1F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(57, 31).addBox(0.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		left_leg.setTextureOffset(57, 18).addBox(-2.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
		right_leg.setTextureOffset(0, 47).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(54, 12).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(52, 46).addBox(-0.9F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(28, 51).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 0).addBox(-1.4F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 40).addBox(-1.9F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		right_leg.setTextureOffset(46, 44).addBox(-2.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		right_leg.setTextureOffset(40, 24).addBox(0.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
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