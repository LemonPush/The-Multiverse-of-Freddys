// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelDeeDee extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer body;
	private final ModelRenderer button_r1;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_arm;

	public ModelDeeDee() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 9.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -9.0F, -3.5F, 8.0F, 7.0F, 8.0F, 0.1F, false);
		head.setTextureOffset(0, 18).addBox(-2.7F, -7.5F, -3.9F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		head.setTextureOffset(0, 15).addBox(0.7F, -7.5F, -3.9F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		head.setTextureOffset(0, 4).addBox(-4.0F, -5.1F, -4.1F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(37, 40).addBox(2.0F, -5.1F, -4.1F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-0.5F, -5.2F, -5.8F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(27, 7).addBox(-4.0F, -10.0F, -3.5F, 8.0F, 2.0F, 8.0F, 0.2F, false);
		head.setTextureOffset(27, 20).addBox(-4.0F, -7.6F, -2.4F, 8.0F, 3.0F, 7.0F, 0.2F, false);
		head.setTextureOffset(24, 0).addBox(-0.5F, -13.0F, 0.0F, 1.0F, 3.0F, 1.0F, 0.1F, false);
		head.setTextureOffset(24, 0).addBox(-1.0F, -13.0F, -0.4F, 2.0F, 1.0F, 5.0F, 0.1F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -12.5F, 0.5F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.6109F, 0.0F);
		head_r1.setTextureOffset(27, 17).addBox(0.0F, -0.5F, -1.5F, 5.0F, 1.0F, 2.0F, 0.1F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(0.0F, -12.5F, 0.5F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 1.5708F, -0.6109F, 0.0F);
		head_r2.setTextureOffset(41, 17).addBox(-5.0F, -1.5F, -0.5F, 5.0F, 2.0F, 1.0F, 0.1F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(0, 15).addBox(-5.0F, 8.0F, -3.3F, 10.0F, 5.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(0, 27).addBox(-5.0F, 13.0F, -3.3F, 10.0F, 4.0F, 7.0F, 0.25F, false);
		body.setTextureOffset(51, 0).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		button_r1 = new ModelRenderer(this);
		button_r1.setRotationPoint(0.0F, 9.8F, -9.2F);
		body.addChild(button_r1);
		setRotationAngle(button_r1, -3.1416F, 0.0F, 3.1416F);
		button_r1.setTextureOffset(63, 0).addBox(-3.5F, -2.8F, -7.3F, 7.0F, 7.0F, 1.0F, -1.5F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.4F, 10.0F, 0.0F);
		setRotationAngle(left_arm, 0.0F, 0.0F, -0.1745F);
		left_arm.setTextureOffset(42, 40).addBox(0.0F, -2.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(50, 17).addBox(0.6F, 7.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(44, 50).addBox(1.1F, 3.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.8F, 17.0F, 0.0F);
		left_leg.setTextureOffset(49, 30).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.25F, false);
		left_leg.setTextureOffset(0, 38).addBox(-2.1F, 5.0F, -5.0F, 4.0F, 2.0F, 7.0F, 0.5F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.8F, 17.0F, 0.0F);
		right_leg.setTextureOffset(0, 47).addBox(-1.9F, 0.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.25F, false);
		right_leg.setTextureOffset(27, 31).addBox(-1.9F, 5.0F, -5.0F, 4.0F, 2.0F, 7.0F, 0.5F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.4F, 10.0F, 0.0F);
		setRotationAngle(right_arm, 0.0F, 0.0F, 0.1745F);
		right_arm.setTextureOffset(22, 40).addBox(-5.0F, -2.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(16, 50).addBox(-4.6F, 7.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(32, 50).addBox(-4.1F, 3.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
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
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}