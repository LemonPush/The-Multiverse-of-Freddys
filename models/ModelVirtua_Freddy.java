// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelVirtua_Freddy extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelVirtua_Freddy() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(44, 42).addBox(-2.0F, -18.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(26, 10).addBox(-3.0F, -15.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(44, 8).addBox(-4.0F, -6.0F, -6.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(44, 12).addBox(-4.0F, -7.0F, -6.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(30, 17).addBox(-4.0F, -9.5F, -6.8F, 8.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(16, 45).addBox(-3.0F, -10.0F, -6.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(50, 50).addBox(-1.0F, -11.0F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(52, 18).addBox(-2.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(52, 18).addBox(0.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(32, 8).addBox(-2.7F, -13.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(32, 8).addBox(0.7F, -13.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(30, 34).addBox(-5.0F, -9.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(12, 34).addBox(4.0F, -9.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-4.5F, -13.5F, 0.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 0.6109F);
		head_r1.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 16).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(4.5F, -13.5F, 0.0F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, -0.6109F);
		head_r2.setTextureOffset(0, 4).addBox(0.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head_r2.setTextureOffset(0, 18).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(24, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 16).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 11.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(40, 34).addBox(-4.0F, -3.0F, -3.5F, 8.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(49, 0).addBox(-3.5F, -4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(48, 32).addBox(-3.5F, 4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(30, 22).addBox(-3.0F, -5.0F, -3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(52, 21).addBox(-1.0F, -5.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(18, 52).addBox(1.0F, -6.0F, -4.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(12, 52).addBox(-3.0F, -6.0F, -4.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(6, 51).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 51).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(44, 49).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(22, 49).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
		left_arm.setTextureOffset(40, 22).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 42).addBox(1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(49, 15).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(14, 49).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(22, 34).addBox(1.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
		right_arm.setTextureOffset(40, 22).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		right_arm.setTextureOffset(14, 49).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(-3.0F, 4.25F, 0.0F);
		right_arm.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
		right_arm_r1.setTextureOffset(22, 34).addBox(-2.0F, 6.75F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
		right_arm_r1.setTextureOffset(49, 15).addBox(-1.0F, 5.75F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_arm_r1.setTextureOffset(0, 42).addBox(-2.0F, 0.75F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, true);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-3.0F, 10.3333F, 1.0F);
		right_arm.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.0F);
		right_arm_r2.setTextureOffset(0, 32).addBox(-2.5F, 7.1667F, -13.0F, 5.0F, 5.0F, 5.0F, -0.75F, false);
		right_arm_r2.setTextureOffset(30, 45).addBox(-1.5F, 8.1667F, -10.0F, 3.0F, 3.0F, 4.0F, -0.75F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
		left_leg.setTextureOffset(40, 22).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(40, 22).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(40, 22).addBox(2.9F, -15.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(49, 2).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(25, 17).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(22, 24).addBox(-2.6F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
		right_leg.setTextureOffset(40, 22).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		right_leg.setTextureOffset(40, 22).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		right_leg.setTextureOffset(40, 22).addBox(-6.9F, -15.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		right_leg.setTextureOffset(49, 2).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(25, 17).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(22, 24).addBox(-2.4F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.0F, true);
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