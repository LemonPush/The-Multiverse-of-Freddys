// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelJulius extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer body2;
	private final ModelRenderer left_arm_r1;
	private final ModelRenderer left_arm_r2;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm_r3;
	private final ModelRenderer left_arm_r4;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_leg_r1;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg_r2;

	public ModelJulius() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(1.0F, -0.0226F, 0.0366F);
		setRotationAngle(head, 0.0F, 0.0F, 0.5672F);
		head.setTextureOffset(28, 39).addBox(-1.0373F, -1.8208F, -0.5366F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(22, 8).addBox(-3.5373F, -2.8208F, -1.0366F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(22, 5).addBox(-4.0373F, -8.8208F, -1.0366F, 7.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(36, 22).addBox(1.9627F, -7.8208F, -1.0366F, 1.0F, 6.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(22, 39).addBox(1.9627F, -3.8208F, 0.9634F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(38, 34).addBox(1.4627F, -3.8208F, 1.4634F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.5373F, -3.8208F, 1.4634F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(35, 19).addBox(-2.5373F, -3.8208F, 2.4634F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(40, 13).addBox(-1.5373F, -5.8208F, 2.4634F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(7, 40).addBox(-1.5373F, -7.3208F, 1.9634F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(40, 5).addBox(-1.5373F, -8.8208F, 0.9634F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(14, 12).addBox(-4.0373F, -3.8208F, 0.9634F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(20, 24).addBox(-3.5373F, -6.3208F, -3.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 4).addBox(-4.0373F, -6.3208F, -2.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(38, 10).addBox(-3.0373F, -7.5708F, -3.8866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(6, 24).addBox(0.4627F, -6.3208F, -3.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(14, 16).addBox(0.9627F, -6.3208F, -2.0366F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(16, 28).addBox(-0.0373F, -7.5708F, -3.8866F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.0373F, -8.3208F, -3.5366F, 5.0F, 6.0F, 6.0F, 0.25F, false);
		head.setTextureOffset(34, 11).addBox(-4.0373F, -7.8208F, -1.0366F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(8, 28).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 12).addBox(-2.5F, 0.0F, -1.0F, 5.0F, 10.0F, 2.0F, 0.25F, false);
		body.setTextureOffset(16, 37).addBox(2.5F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(16, 37).addBox(-4.5F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
		body.setTextureOffset(0, 41).addBox(-3.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(40, 40).addBox(-3.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(40, 38).addBox(-3.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(40, 16).addBox(1.0F, 5.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(40, 22).addBox(1.0F, 4.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(40, 32).addBox(1.0F, 2.5F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(37, 30).addBox(1.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(20, 20).addBox(-3.0F, 0.5F, -1.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(32, 30).addBox(-2.5F, -0.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(32, 30).addBox(1.5F, -0.5F, -1.5F, 1.0F, 3.0F, 3.0F, 0.0F, true);
		body.setTextureOffset(20, 20).addBox(-3.0F, 2.5F, -1.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(20, 20).addBox(-3.0F, 4.0F, -1.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(20, 20).addBox(-3.0F, 5.5F, -1.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(36, 8).addBox(-5.0F, 0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(16, 0).addBox(-3.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.1F, 0.95F, -0.4F);

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(0.0F, 0.0F, 0.0F);
		left_arm.addChild(body2);
		setRotationAngle(body2, -1.6609F, -0.4721F, 1.1998F);
		body2.setTextureOffset(26, 11).addBox(-0.3372F, -1.1308F, -2.7118F, 2.0F, 5.0F, 2.0F, 0.0F, true);

		left_arm_r1 = new ModelRenderer(this);
		left_arm_r1.setRotationPoint(0.6628F, 3.1192F, -1.7118F);
		body2.addChild(left_arm_r1);
		setRotationAngle(left_arm_r1, 0.0F, 0.0F, 0.5672F);
		left_arm_r1.setTextureOffset(0, 37).addBox(-0.6F, 5.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, true);
		left_arm_r1.setTextureOffset(36, 0).addBox(-0.6F, 0.9F, -1.0F, 2.0F, 3.0F, 2.0F, 0.25F, true);
		left_arm_r1.setTextureOffset(26, 11).addBox(-0.6F, 0.75F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, true);

		left_arm_r2 = new ModelRenderer(this);
		left_arm_r2.setRotationPoint(0.6628F, 0.8692F, -1.7118F);
		body2.addChild(left_arm_r2);
		setRotationAngle(left_arm_r2, 0.0F, 0.6981F, 0.0F);
		left_arm_r2.setTextureOffset(16, 31).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-3.1F, 1.45F, 0.0F);
		setRotationAngle(right_arm, 0.0F, 0.0F, 0.5672F);
		right_arm.setTextureOffset(26, 11).addBox(-3.0F, -0.6F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(16, 31).addBox(-3.0F, -0.6F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, false);

		left_arm_r3 = new ModelRenderer(this);
		left_arm_r3.setRotationPoint(-2.0F, 3.65F, 0.0F);
		right_arm.addChild(left_arm_r3);
		setRotationAngle(left_arm_r3, 0.0F, 0.0F, -0.5672F);
		left_arm_r3.setTextureOffset(0, 37).addBox(-1.4F, 5.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
		left_arm_r3.setTextureOffset(26, 11).addBox(-1.4F, 0.75F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		left_arm_r4 = new ModelRenderer(this);
		left_arm_r4.setRotationPoint(-1.0478F, 5.8891F, 0.0F);
		right_arm.addChild(left_arm_r4);
		setRotationAngle(left_arm_r4, 0.0F, -1.2566F, -0.5672F);
		left_arm_r4.setTextureOffset(36, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.25F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.0F, 10.625F, -0.25F);
		left_leg.setTextureOffset(0, 24).addBox(-1.0F, 0.625F, -0.75F, 2.0F, 11.0F, 2.0F, 0.0F, true);
		left_leg.setTextureOffset(23, 25).addBox(-1.5F, 1.625F, -1.25F, 3.0F, 5.0F, 3.0F, 0.0F, true);
		left_leg.setTextureOffset(14, 12).addBox(-1.5F, 11.375F, -1.75F, 3.0F, 2.0F, 6.0F, 0.0F, true);

		left_leg_r1 = new ModelRenderer(this);
		left_leg_r1.setRotationPoint(0.0F, 9.375F, 0.25F);
		left_leg.addChild(left_leg_r1);
		setRotationAngle(left_leg_r1, 0.0F, -0.7854F, 0.0F);
		left_leg_r1.setTextureOffset(24, 33).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.25F, true);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.0F, 10.625F, -0.25F);
		right_leg.setTextureOffset(0, 24).addBox(-1.0F, 0.625F, -0.75F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(24, 33).addBox(-1.0F, 7.375F, -0.75F, 2.0F, 4.0F, 2.0F, 0.25F, false);
		right_leg.setTextureOffset(14, 12).addBox(-1.5F, 11.375F, -3.75F, 3.0F, 2.0F, 6.0F, 0.0F, false);

		left_leg_r2 = new ModelRenderer(this);
		left_leg_r2.setRotationPoint(0.0F, 4.125F, 0.25F);
		right_leg.addChild(left_leg_r2);
		setRotationAngle(left_leg_r2, 0.0F, 0.7854F, 0.0F);
		left_leg_r2.setTextureOffset(23, 25).addBox(-1.5F, -2.5F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}