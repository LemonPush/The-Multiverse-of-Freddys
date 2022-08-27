// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelFlamethrower_Bare_Endo extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer body_r5;
	private final ModelRenderer body_r6;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer right_arm_r4;
	private final ModelRenderer right_arm_r5;
	private final ModelRenderer right_arm_r6;
	private final ModelRenderer right_arm_r7;

	public ModelFlamethrower_Bare_Endo() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(24, 0).addBox(-4.0F, -14.0F, -2.0F, 8.0F, 8.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(16, 36).addBox(-4.0F, -10.5F, -5.1F, 8.0F, 5.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(55, 53).addBox(-4.0F, -12.5F, -5.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(55, 53).addBox(3.0F, -12.5F, -5.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(34, 27).addBox(-4.0F, -14.5F, -5.1F, 8.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 17).addBox(-4.0F, -14.5F, -4.1F, 8.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(33, 51).addBox(3.0F, -10.5F, -4.1F, 1.0F, 5.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(49, 56).addBox(3.0F, -14.5F, -4.1F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(33, 51).addBox(-4.0F, -10.5F, -4.1F, 1.0F, 5.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(49, 56).addBox(-4.0F, -14.5F, -4.1F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(34, 23).addBox(1.0F, -9.2F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(23, 22).addBox(-2.0F, -9.2F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(22, 42).addBox(-2.0F, -9.2F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(44, 8).addBox(-2.0F, -10.2F, -5.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(34, 37).addBox(-2.0F, -7.0F, -5.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-2.0F, -8.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(23, 20).addBox(-2.0F, -8.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 3).addBox(1.0F, -8.0F, -4.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(44, 0).addBox(-2.8F, -12.5F, -2.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(34, 42).addBox(0.7F, -12.5F, -2.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(23, 13).addBox(-4.5F, 6.0F, -2.0F, 9.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(53, 13).addBox(-6.5F, -5.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(45, 13).addBox(4.5F, -5.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(59, 11).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(32, 20).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(38, 51).addBox(-1.0F, -2.5F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(49, 27).addBox(-1.5F, 1.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 25).addBox(-5.0F, -5.4F, -1.5F, 10.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(49, 43).addBox(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-6.5F, -7.4F, 1.5F, 6.0F, 11.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(23, 24).addBox(-4.5F, -6.4F, -2.5F, 2.0F, 5.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(23, 24).addBox(2.5F, -6.4F, -2.5F, 2.0F, 5.0F, 7.0F, 0.0F, true);
		body.setTextureOffset(0, 0).addBox(0.5F, -7.4F, 1.5F, 6.0F, 11.0F, 6.0F, 0.0F, true);
		body.setTextureOffset(0, 31).addBox(3.0F, 3.6F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(0, 31).addBox(-2.0F, 3.6F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 31).addBox(1.0F, 3.6F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(0, 31).addBox(-4.0F, 3.6F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(12, 31).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(-3.5F, 5.6F, 4.5F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -1.1345F, -0.7854F, 0.0F);
		body_r1.setTextureOffset(0, 17).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(1.5F, 5.6F, 4.5F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, -1.2485F, 0.3377F, -0.2083F);
		body_r2.setTextureOffset(0, 17).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 6.0F, 1.0F, 0.0F, true);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(-1.5F, 5.6F, 4.5F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, -1.2485F, -0.3377F, 0.2083F);
		body_r3.setTextureOffset(0, 17).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(3.5F, 5.6F, 4.5F);
		body.addChild(body_r4);
		setRotationAngle(body_r4, -1.1345F, 0.7854F, 0.0F);
		body_r4.setTextureOffset(0, 17).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, true);

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(1.5F, 0.5F, 0.0F);
		body.addChild(body_r5);
		setRotationAngle(body_r5, 0.0F, 0.0F, 0.5672F);
		body_r5.setTextureOffset(9, 57).addBox(0.3F, -4.5F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		body_r6 = new ModelRenderer(this);
		body_r6.setRotationPoint(-1.5F, 0.5F, 0.0F);
		body.addChild(body_r6);
		setRotationAngle(body_r6, 0.0F, 0.0F, -0.5672F);
		body_r6.setTextureOffset(13, 57).addBox(-1.3F, -4.5F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
		left_arm.setTextureOffset(57, 58).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(58, 43).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(21, 51).addBox(1.5F, 11.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(46, 48).addBox(1.5F, 5.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(48, 17).addBox(1.5F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
		left_leg.setTextureOffset(58, 40).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 58).addBox(-1.1F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(58, 34).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 43).addBox(-1.6F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(25, 42).addBox(-1.6F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(35, 30).addBox(-2.1F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(58, 26).addBox(0.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		left_leg.setTextureOffset(58, 23).addBox(-2.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
		right_leg.setTextureOffset(25, 57).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(57, 17).addBox(-0.9F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(17, 57).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(37, 42).addBox(-1.4F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(13, 42).addBox(-1.4F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(34, 20).addBox(-1.9F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		right_leg.setTextureOffset(57, 0).addBox(-2.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		right_leg.setTextureOffset(56, 8).addBox(0.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
		right_arm.setTextureOffset(55, 48).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(18, 0).addBox(-4.0F, 3.0F, -10.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(48, 0).addBox(-4.5F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(-3.0F, 4.1667F, 0.0F);
		right_arm.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.5721F, 0.0102F, 0.0021F);
		right_arm_r1.setTextureOffset(41, 56).addBox(-1.0F, 4.8333F, -3.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(9, 51).addBox(-1.5F, 9.8333F, -1.7F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(53, 34).addBox(1.5F, -0.1667F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(53, 34).addBox(-2.5F, -0.1667F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(0, 31).addBox(-2.0F, 0.8333F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(23, 25).addBox(-1.0F, 4.8333F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-3.7444F, 8.547F, 2.6145F);
		right_arm.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, 0.6096F, -0.0007F, 1.5812F);
		right_arm_r2.setTextureOffset(0, 53).addBox(-0.53F, -0.8699F, 0.361F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(-3.7444F, 8.547F, 2.6145F);
		right_arm.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, 1.4299F, -0.0007F, 1.5812F);
		right_arm_r3.setTextureOffset(18, 4).addBox(-1.53F, 1.2564F, 11.9087F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		right_arm_r3.setTextureOffset(46, 37).addBox(-0.53F, 2.2564F, 2.9087F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(3.1739F, 8.6171F, 6.8052F);
		right_arm.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, 1.6044F, -0.0007F, 1.5812F);
		right_arm_r4.setTextureOffset(46, 37).addBox(-0.5312F, -0.9212F, 0.4701F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		right_arm_r5 = new ModelRenderer(this);
		right_arm_r5.setRotationPoint(-3.0444F, 9.747F, -0.2855F);
		right_arm.addChild(right_arm_r5);
		setRotationAngle(right_arm_r5, -0.263F, 0.0075F, 0.0073F);
		right_arm_r5.setTextureOffset(0, 53).addBox(-0.5F, 0.1701F, -3.5013F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		right_arm_r6 = new ModelRenderer(this);
		right_arm_r6.setRotationPoint(-3.0444F, 9.747F, -0.2855F);
		right_arm.addChild(right_arm_r6);
		setRotationAngle(right_arm_r6, 0.5573F, 0.0075F, 0.0073F);
		right_arm_r6.setTextureOffset(0, 53).addBox(-0.5F, 0.141F, -0.486F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		right_arm_r7 = new ModelRenderer(this);
		right_arm_r7.setRotationPoint(-3.0701F, 7.1592F, -5.8393F);
		right_arm.addChild(right_arm_r7);
		setRotationAngle(right_arm_r7, -0.8303F, 0.0102F, 0.0021F);
		right_arm_r7.setTextureOffset(0, 53).addBox(-0.4958F, -0.5026F, -0.6F, 1.0F, 1.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}