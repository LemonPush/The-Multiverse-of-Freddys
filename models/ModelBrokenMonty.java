// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelBrokenMonty extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer tail;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;

	public ModelBrokenMonty() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 11.8235F, -2.6059F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -9.8235F, -6.3941F, 8.0F, 7.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(24, 20).addBox(-4.0F, -2.8235F, -6.3941F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 44).addBox(4.0F, -5.8235F, -6.3941F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(42, 35).addBox(-5.0F, -5.8235F, -6.3941F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 18).addBox(-2.5F, -8.3235F, -6.5941F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(24, 0).addBox(-2.5F, -9.3235F, -6.5941F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 6).addBox(0.5F, -9.3235F, -6.5941F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 15).addBox(0.5F, -8.3235F, -6.5941F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 44).addBox(-1.0F, -12.8235F, -2.8941F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(10, 48).addBox(-1.0F, -11.8235F, -0.8941F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-1.0F, -13.8235F, -4.8941F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 37).addBox(-3.0F, -1.8235F, -11.3941F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(26, 36).addBox(-3.0F, -2.8235F, -11.3941F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(24, 29).addBox(-3.0F, -3.8235F, -11.8941F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 28).addBox(-4.0F, -1.8235F, -6.3941F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(24, 0).addBox(-3.0F, -5.8235F, -11.8941F, 6.0F, 2.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(34, 52).addBox(-2.0F, -6.3235F, -10.8941F, 4.0F, 2.0F, 5.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0455F, 15.8636F, 0.5818F);
		setRotationAngle(body, 0.6981F, 0.0F, 0.0F);
		body.setTextureOffset(26, 9).addBox(-5.5455F, -4.8636F, -2.5818F, 11.0F, 5.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(18, 43).addBox(4.4545F, -5.8636F, -2.5818F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(42, 2).addBox(-10.5455F, -5.8636F, -2.5818F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 15).addBox(-5.0455F, 0.1364F, -2.5818F, 10.0F, 7.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(48, 20).addBox(-4.5455F, -3.8636F, -3.0818F, 9.0F, 5.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(52, 35).addBox(-3.5455F, 1.1364F, -3.0818F, 7.0F, 6.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 28).addBox(-6.0455F, -4.3636F, -1.0818F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(31, 59).addBox(4.9545F, -4.3636F, -1.0818F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(42, 29).addBox(-4.0455F, 7.1364F, -1.3818F, 8.0F, 2.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(38, 46).addBox(-3.0455F, 9.1364F, -0.3818F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(18, 37).addBox(-1.5455F, -6.8636F, -1.0818F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(4.9545F, 13.1273F, 4.5487F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.8727F, 0.3054F, 0.0F);
		body_r1.setTextureOffset(8, 55).addBox(-3.0F, -5.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(-5.0455F, 13.1273F, 4.5487F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, 0.8727F, -0.3054F, 0.0F);
		body_r2.setTextureOffset(8, 55).addBox(1.0F, -5.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(-0.0455F, 14.1364F, 7.6182F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, 0.8727F, 0.0F, 0.0F);
		body_r3.setTextureOffset(8, 55).addBox(-1.0F, -8.0F, -2.2F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		body_r3.setTextureOffset(8, 55).addBox(-1.0F, -5.0F, -2.2F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(-3.0455F, -8.8636F, 1.4182F);
		body.addChild(tail);
		setRotationAngle(tail, 0.5236F, 0.0F, 0.0F);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(6.0F, 13.0551F, -0.707F);
		setRotationAngle(left_arm, -0.8727F, 0.0F, 0.0F);
		left_arm.setTextureOffset(60, 4).addBox(0.5F, 4.203F, -0.7605F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 55).addBox(1.0F, -0.297F, -0.2605F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(41, 59).addBox(0.5F, 10.203F, -0.7605F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(54, 9).addBox(0.0F, 11.203F, -0.2605F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-6.0F, 13.2567F, -0.5963F);
		setRotationAngle(right_arm, -0.8727F, 0.0F, 0.0F);
		right_arm.setTextureOffset(52, 52).addBox(-4.0F, -1.3558F, -1.3837F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(18, 50).addBox(-4.0F, 4.1442F, -1.3837F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(60, 0).addBox(-3.5F, 3.6442F, -0.8837F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(10, 44).addBox(-3.5F, 9.6442F, -0.8837F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(58, 44).addBox(-4.0F, 10.6442F, -0.3837F, 4.0F, 4.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.right_arm.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_arm.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
	}
}