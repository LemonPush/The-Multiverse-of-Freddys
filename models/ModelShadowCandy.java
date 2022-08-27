// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelShadowCandy extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_arm;

	public ModelShadowCandy() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -6.5465F, 0.0269F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -9.4535F, -4.0269F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(25, 18).addBox(-3.0F, -2.4535F, -5.8269F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(49, 0).addBox(-3.0F, -4.4535F, -5.8269F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(54, 4).addBox(-2.5F, -4.9535F, -5.5269F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 19).addBox(-0.5F, -5.9535F, -5.5269F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(53, 15).addBox(3.0F, -4.4535F, -4.5269F, 2.0F, 2.0F, 1.0F, -0.25F, false);
		head.setTextureOffset(64, 49).addBox(-2.7F, -6.9535F, -4.5269F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(64, 38).addBox(0.7F, -6.9535F, -4.5269F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 6).addBox(-2.7F, -7.9535F, -4.5269F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 33).addBox(0.7F, -7.9535F, -4.5269F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(28, 36).addBox(4.0F, -5.4535F, -4.0269F, 1.0F, 4.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(38, 32).addBox(5.0F, -5.4535F, -4.0269F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(38, 43).addBox(6.0F, -5.4535F, -4.0269F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(43, 10).addBox(-7.0F, -5.4535F, -4.0269F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 37).addBox(-6.0F, -5.4535F, -4.0269F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(18, 32).addBox(-5.0F, -5.4535F, -4.0269F, 1.0F, 4.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(18, 27).addBox(-5.0F, -4.4535F, -4.5269F, 2.0F, 2.0F, 1.0F, -0.25F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-3.3907F, -11.5206F, 0.1288F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, -0.48F);
		head_r1.setTextureOffset(42, 53).addBox(-2.9147F, -2.5775F, -1.1444F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 60).addBox(-3.4147F, -1.5775F, -1.1444F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 16).addBox(-1.8853F, 1.3775F, -0.6556F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(3.3907F, -11.5206F, 0.1288F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, 0.48F);
		head_r2.setTextureOffset(63, 28).addBox(-0.0853F, -2.5775F, -1.1444F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		head_r2.setTextureOffset(61, 15).addBox(-0.5853F, -1.5775F, -1.1444F, 4.0F, 3.0F, 2.0F, 0.0F, false);
		head_r2.setTextureOffset(24, 0).addBox(0.8853F, 1.3775F, -0.6556F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(0.0F, -1.4535F, -3.0769F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, 0.4363F, 0.0F, 0.0F);
		head_r3.setTextureOffset(10, 37).addBox(-3.0F, -1.0F, -2.75F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		head_r3.setTextureOffset(28, 32).addBox(-3.0F, 0.0F, -2.75F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(24, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.25F, false);
		body.setTextureOffset(0, 16).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 6.0F, 5.0F, 0.25F, false);
		body.setTextureOffset(25, 22).addBox(-5.0F, 0.0F, -2.5F, 10.0F, 5.0F, 5.0F, 0.5F, false);
		body.setTextureOffset(53, 7).addBox(-4.0F, -3.0F, -3.5F, 8.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(30, 48).addBox(-3.5F, -4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(40, 20).addBox(-3.5F, 4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 48).addBox(-3.0F, -5.0F, -3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(28, 60).addBox(-1.0F, -6.2F, -3.8F, 2.0F, 9.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(43, 12).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(43, 8).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(10, 40).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 40).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
		left_arm.setTextureOffset(52, 49).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		left_arm.setTextureOffset(38, 56).addBox(1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.25F, false);
		left_arm.setTextureOffset(38, 36).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 37).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(54, 59).addBox(1.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
		right_leg.setTextureOffset(52, 39).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		right_leg.setTextureOffset(51, 28).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		right_leg.setTextureOffset(28, 36).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(18, 30).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 27).addBox(-2.4F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.25F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
		left_leg.setTextureOffset(26, 50).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		left_leg.setTextureOffset(0, 50).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		left_leg.setTextureOffset(0, 30).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 27).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(25, 8).addBox(-2.6F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.25F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
		right_arm.setTextureOffset(14, 44).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		right_arm.setTextureOffset(12, 56).addBox(-5.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.25F, false);
		right_arm.setTextureOffset(0, 3).addBox(-4.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 0).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(55, 20).addBox(-5.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.25F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}