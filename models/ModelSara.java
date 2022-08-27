// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelSara extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;

	public ModelSara() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -1.0F, 0.0F);
		head.setTextureOffset(0, 24).addBox(-3.5F, -14.0F, -3.5F, 7.0F, 7.0F, 7.0F, 0.5F, false);
		head.setTextureOffset(0, 48).addBox(-4.5F, -10.5F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, true);
		head.setTextureOffset(0, 48).addBox(3.5F, -10.5F, -4.0F, 1.0F, 4.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(53, 0).addBox(-2.0F, -15.0F, -3.0F, 3.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(0, 38).addBox(0.0F, -15.0F, -5.0F, 3.0F, 1.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(52, 28).addBox(0.0F, -16.0F, -4.0F, 3.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(59, 22).addBox(-2.0F, -7.5F, -6.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(116, 0).addBox(-2.0F, -8.5F, -6.2F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(53, 8).addBox(-2.0F, -10.5F, -6.5F, 4.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(35, 42).addBox(-1.5F, -11.0F, -6.2F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(27, 27).addBox(-0.5F, -11.5F, -6.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-2.9F, -13.1F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 13).addBox(0.9F, -13.1F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(26, 13).addBox(0.9F, -14.1F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 26).addBox(-2.9F, -14.1F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-4.5F, -13.5F, 0.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 0.8727F);
		head_r1.setTextureOffset(26, 15).addBox(-4.7F, -2.3F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		head_r1.setTextureOffset(0, 0).addBox(-3.7F, -2.8F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, true);
		head_r1.setTextureOffset(0, 24).addBox(-0.7F, -1.6F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(4.5F, -13.5F, 0.0F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, -0.8727F);
		head_r2.setTextureOffset(26, 15).addBox(3.7F, -2.3F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r2.setTextureOffset(0, 0).addBox(0.7F, -2.8F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head_r2.setTextureOffset(0, 24).addBox(-1.3F, -1.6F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(3.5F, -14.5F, -0.5F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, 0.0F, -0.48F, 0.0F);
		head_r3.setTextureOffset(48, 18).addBox(-2.1F, -0.5F, -3.9F, 1.0F, 1.0F, 9.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(0, 13).addBox(-5.0F, 6.0F, -3.0F, 10.0F, 5.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(32, 0).addBox(-4.5F, 4.0F, -2.5F, 9.0F, 2.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-6.0F, 11.0F, -4.0F, 12.0F, 5.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(24, 42).addBox(-1.5F, -9.8F, 6.9F, 3.0F, 13.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(55, 36).addBox(-1.5F, -8.8F, 11.9F, 3.0F, 10.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(55, 36).addBox(-1.5F, -8.8F, 4.9F, 3.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(27, 60).addBox(-1.5F, -7.8F, 13.9F, 3.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(54, 51).addBox(-3.1F, -6.0F, -2.5F, 2.0F, 10.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(40, 51).addBox(1.1F, -6.0F, -2.5F, 2.0F, 10.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(28, 27).addBox(-4.0F, -5.5F, -2.0F, 8.0F, 11.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 42).addBox(-6.0F, -5.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 38).addBox(4.0F, -5.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(49, 51).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(21, 27).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 7.5F, 2.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.6109F, 0.0F, 0.0F);
		body_r1.setTextureOffset(21, 13).addBox(-1.5F, -0.8F, -0.5F, 3.0F, 3.0F, 11.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.6F, 8.0F, 0.0F);
		left_leg.setTextureOffset(0, 60).addBox(-1.6F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.25F, false);
		left_leg.setTextureOffset(59, 13).addBox(-1.6F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.25F, false);
		left_leg.setTextureOffset(0, 51).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(49, 22).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(40, 42).addBox(-2.1F, 14.0F, -4.5F, 4.0F, 2.0F, 7.0F, 0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.6F, 8.0F, 0.0F);
		right_leg.setTextureOffset(15, 57).addBox(-1.4F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.25F, false);
		right_leg.setTextureOffset(15, 38).addBox(-1.4F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.25F, false);
		right_leg.setTextureOffset(48, 28).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 48).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(38, 7).addBox(-1.9F, 14.0F, -4.5F, 4.0F, 2.0F, 7.0F, 0.25F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.5F, -5.3F, 0.5F);
		left_arm.setTextureOffset(10, 48).addBox(0.5F, -1.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.25F, false);
		left_arm.setTextureOffset(38, 16).addBox(0.5F, 5.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.25F, false);
		left_arm.setTextureOffset(47, 16).addBox(1.0F, 10.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 4).addBox(1.0F, 4.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(62, 45).addBox(0.5F, 11.0F, -2.0F, 3.0F, 3.0F, 3.0F, 0.25F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.5F, -5.3F, 0.5F);
		right_arm.setTextureOffset(10, 48).addBox(-3.5F, -1.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.25F, true);
		right_arm.setTextureOffset(38, 16).addBox(-3.5F, 5.0F, -2.0F, 3.0F, 5.0F, 3.0F, 0.25F, true);
		right_arm.setTextureOffset(47, 16).addBox(-3.0F, 10.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_arm.setTextureOffset(0, 4).addBox(-3.0F, 4.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, true);
		right_arm.setTextureOffset(62, 45).addBox(-3.5F, 11.0F, -2.0F, 3.0F, 3.0F, 3.0F, 0.25F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}