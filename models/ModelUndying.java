// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelUndying extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_arm_r1;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm_r2;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelUndying() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -7.4F, 0.4F);
		head.setTextureOffset(0, 0).addBox(-5.0F, -10.6F, -5.4F, 10.0F, 10.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(38, 18).addBox(-4.0F, -5.6F, -7.4F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 4).addBox(-1.0F, -6.6F, -8.4F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 39).addBox(-10.0F, -15.6F, -1.4F, 7.0F, 7.0F, 2.0F, 0.0F, true);
		head.setTextureOffset(0, 39).addBox(3.0F, -15.6F, -1.4F, 7.0F, 7.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 4.0F, 0.0F);
		body.setTextureOffset(0, 20).addBox(-4.0F, -12.0F, -2.0F, 8.0F, 15.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-4.0F, -12.0F, -3.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(1.0F, -12.0F, -3.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(30, 0).addBox(-1.0F, -11.5F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(20, 20).addBox(-1.0F, -14.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(2.9844F, -6.4704F, 0.0F);
		setRotationAngle(left_arm, 0.0F, 0.0F, -0.4363F);

		left_arm_r1 = new ModelRenderer(this);
		left_arm_r1.setRotationPoint(-0.4226F, 0.9063F, 0.0F);
		left_arm.addChild(left_arm_r1);
		setRotationAngle(left_arm_r1, 0.0F, 0.0F, 0.4363F);
		left_arm_r1.setTextureOffset(20, 38).addBox(1.0F, 11.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		left_arm_r1.setTextureOffset(36, 34).addBox(1.0F, -2.5F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-2.9844F, -6.4704F, 0.0F);
		setRotationAngle(right_arm, 0.0F, 0.0F, 0.4363F);

		left_arm_r2 = new ModelRenderer(this);
		left_arm_r2.setRotationPoint(0.4226F, 0.9063F, 0.0F);
		right_arm.addChild(left_arm_r2);
		setRotationAngle(left_arm_r2, 0.0F, 0.0F, -0.4363F);
		left_arm_r2.setTextureOffset(20, 38).addBox(-5.0F, 11.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
		left_arm_r2.setTextureOffset(36, 34).addBox(-5.0F, -2.5F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.0F, 6.25F, -0.75F);
		left_leg.setTextureOffset(24, 20).addBox(-2.0F, 0.75F, -1.25F, 4.0F, 14.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(30, 0).addBox(-2.0F, 14.75F, -4.25F, 4.0F, 3.0F, 7.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.0F, 6.25F, -0.75F);
		right_leg.setTextureOffset(24, 20).addBox(-2.0F, 0.75F, -1.25F, 4.0F, 14.0F, 4.0F, 0.0F, true);
		right_leg.setTextureOffset(30, 0).addBox(-2.0F, 14.75F, -4.25F, 4.0F, 3.0F, 7.0F, 0.0F, true);
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
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}