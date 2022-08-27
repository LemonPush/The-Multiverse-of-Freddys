// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelAntonette extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer bone;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg_r1;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_leg_r2;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer right_arm_r4;

	public ModelAntonette() {
		textureWidth = 32;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -1.0F, 0.6F);
		head.setTextureOffset(0, 0).addBox(-2.0F, -5.5F, -2.3F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(20, 2).addBox(-2.5F, -6.0F, -3.3F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(20, 2).addBox(0.5F, -6.0F, -3.3F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(16, 15).addBox(-0.5F, -5.5F, -1.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-0.5F, -7.5F, -2.3F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-0.5F, -7.5F, 0.7F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(12, 0).addBox(-0.5F, -7.5F, -2.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(16, 12).addBox(0.0F, -1.3F, -4.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 18).addBox(2.0F, -2.3F, -4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 18).addBox(2.0F, -6.3F, -4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(20, 5).addBox(-0.5F, -6.3F, -4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(4, 5).addBox(0.0F, -8.3F, -4.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(17, 0).addBox(0.0F, -4.3F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(17, 0).addBox(-3.0F, -4.3F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(0, 18).addBox(-3.0F, -6.3F, -4.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		head.setTextureOffset(4, 5).addBox(-3.0F, -8.3F, -4.0F, 3.0F, 3.0F, 2.0F, 0.0F, true);
		head.setTextureOffset(0, 18).addBox(-3.0F, -2.3F, -4.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		head.setTextureOffset(16, 12).addBox(-2.0F, -1.3F, -4.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		head.setTextureOffset(12, 19).addBox(-4.0F, -4.3F, -4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(6, 19).addBox(3.0F, -4.3F, -4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -1.0F, 0.0F);
		head.addChild(bone);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(0, 5).addBox(-0.5F, -0.5F, -0.4F, 1.0F, 12.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-0.0259F, 0.0991F, 0.1095F);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(0.7259F, 0.0509F, -0.5095F);
		left_arm.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, 0.0F, 0.0F, -0.4363F);
		right_arm_r1.setTextureOffset(4, 10).addBox(-1.0F, -0.25F, 0.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(4.0577F, 6.3405F, -0.5095F);
		left_arm.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, -0.829F, 0.0F, -0.4363F);
		right_arm_r2.setTextureOffset(16, 4).addBox(-1.3615F, -0.3585F, 0.2F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(0.6F, 9.75F, -0.4F);
		setRotationAngle(left_leg, -0.2559F, -0.056F, -0.211F);
		left_leg.setTextureOffset(12, 10).addBox(-0.4881F, -0.8582F, -0.1F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		right_leg_r1 = new ModelRenderer(this);
		right_leg_r1.setRotationPoint(0.0F, 6.25F, 0.0F);
		left_leg.addChild(right_leg_r1);
		setRotationAngle(right_leg_r1, 0.5236F, 0.0F, 0.0F);
		right_leg_r1.setTextureOffset(8, 10).addBox(-0.4881F, 0.7063F, -0.5459F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-0.6F, 9.75F, -0.4F);
		setRotationAngle(right_leg, -0.2559F, 0.056F, 0.211F);
		right_leg.setTextureOffset(12, 10).addBox(-0.5119F, -0.8582F, -0.1F, 1.0F, 8.0F, 1.0F, 0.0F, true);

		right_leg_r2 = new ModelRenderer(this);
		right_leg_r2.setRotationPoint(0.0F, 6.25F, 0.0F);
		right_leg.addChild(right_leg_r2);
		setRotationAngle(right_leg_r2, 0.5236F, 0.0F, 0.0F);
		right_leg_r2.setTextureOffset(8, 10).addBox(-0.5119F, 0.7063F, -0.5459F, 1.0F, 8.0F, 1.0F, 0.0F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(0.0259F, 0.0991F, 0.1095F);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(-0.7259F, 0.0509F, -0.5095F);
		right_arm.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, 0.0F, 0.0F, 0.4363F);
		right_arm_r3.setTextureOffset(4, 10).addBox(0.0F, -0.25F, 0.0F, 1.0F, 8.0F, 1.0F, 0.0F, true);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(-4.0577F, 6.3405F, -0.5095F);
		right_arm.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, -0.829F, 0.0F, 0.4363F);
		right_arm_r4.setTextureOffset(16, 4).addBox(0.3615F, -0.3585F, 0.2F, 1.0F, 7.0F, 1.0F, 0.0F, true);
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
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}