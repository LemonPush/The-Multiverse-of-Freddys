// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelAeronaut_Toy_Freddy extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer body;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelAeronaut_Toy_Freddy() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.5F, false);
		head.setTextureOffset(66, 51).addBox(-2.0F, -19.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(34, 46).addBox(-3.0F, -15.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(34, 46).addBox(-3.0F, -16.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(56, 0).addBox(-4.0F, -5.5F, -7.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(67, 12).addBox(-4.0F, -6.5F, -7.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(64, 43).addBox(-4.0F, -7.5F, -7.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(52, 46).addBox(-4.0F, -9.6F, -7.3F, 8.0F, 2.0F, 3.0F, 0.1F, false);
		head.setTextureOffset(0, 67).addBox(-3.0F, -10.5F, -7.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(8, 71).addBox(-1.0F, -11.5F, -7.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(71, 46).addBox(-2.9F, -13.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.1F, false);
		head.setTextureOffset(120, 0).addBox(-3.3F, -13.4F, -6.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(120, 17).addBox(0.3F, -13.4F, -6.0F, 3.0F, 3.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(89, 5).addBox(-1.0F, -16.3F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(89, 5).addBox(0.0F, -17.3F, -2.9F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(89, 5).addBox(-1.5F, -18.8F, -2.9F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(60, 23).addBox(-5.7F, -9.5F, -5.2F, 2.0F, 2.0F, 1.0F, -0.25F, false);
		head.setTextureOffset(60, 23).addBox(3.7F, -9.5F, -5.2F, 2.0F, 2.0F, 1.0F, -0.25F, true);
		head.setTextureOffset(71, 32).addBox(0.9F, -13.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.1F, false);
		head.setTextureOffset(0, 20).addBox(0.9F, -14.0F, -4.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 20).addBox(-2.9F, -14.0F, -4.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(45, 0).addBox(-5.5F, -10.0F, -4.5F, 1.0F, 4.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(45, 0).addBox(4.5F, -10.0F, -4.5F, 1.0F, 4.0F, 9.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-4.5F, -13.5F, 0.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 0.6109F);
		head_r1.setTextureOffset(46, 53).addBox(-3.7F, -2.3F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(50, 13).addBox(-0.7F, -1.3F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(4.5F, -13.5F, 0.0F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, -0.6109F);
		head_r2.setTextureOffset(56, 4).addBox(0.7F, -2.3F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head_r2.setTextureOffset(34, 50).addBox(-1.3F, -1.3F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(24, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.5F, false);
		body.setTextureOffset(36, 38).addBox(-4.5F, -5.5F, -2.5F, 9.0F, 3.0F, 5.0F, 0.75F, false);
		body.setTextureOffset(25, 21).addBox(4.5F, -5.6F, -3.5F, 1.0F, 15.0F, 7.0F, 0.75F, false);
		body.setTextureOffset(98, 106).addBox(-5.5F, -5.6F, -3.5F, 1.0F, 15.0F, 7.0F, 0.75F, true);
		body.setTextureOffset(112, 118).addBox(-7.2F, 6.4F, -3.5F, 1.0F, 3.0F, 7.0F, 0.0F, true);
		body.setTextureOffset(0, 28).addBox(-4.5F, -5.6F, 1.5F, 9.0F, 15.0F, 2.0F, 0.75F, false);
		body.setTextureOffset(0, 16).addBox(-5.0F, -1.5F, -3.0F, 10.0F, 6.0F, 6.0F, 0.75F, false);
		body.setTextureOffset(41, 28).addBox(-5.0F, -4.0F, -4.0F, 10.0F, 8.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(64, 69).addBox(-4.5F, -5.0F, -4.0F, 9.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(67, 15).addBox(-4.5F, 4.0F, -4.0F, 9.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(44, 63).addBox(-4.0F, -6.0F, -4.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-1.0F, -0.9F, -5.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);
		body.setTextureOffset(0, 0).addBox(-1.0F, -2.6F, -5.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);
		body.setTextureOffset(34, 47).addBox(-1.0F, -4.9F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(12, 45).addBox(1.0F, -5.4F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 16).addBox(-3.0F, -5.4F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(34, 22).addBox(-6.5F, -5.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(34, 18).addBox(4.5F, -5.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 71).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(24, 70).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.5F, -5.0F, 0.0F);
		right_arm.setTextureOffset(34, 53).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		right_arm.setTextureOffset(34, 53).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.3F, false);
		right_arm.setTextureOffset(0, 4).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(-3.0F, 10.3333F, 1.0F);
		right_arm.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
		right_arm_r1.setTextureOffset(52, 13).addBox(-2.5F, 7.1667F, -13.0F, 5.0F, 5.0F, 5.0F, -0.75F, false);
		right_arm_r1.setTextureOffset(14, 70).addBox(-1.5F, 8.1667F, -10.0F, 3.0F, 3.0F, 4.0F, -0.75F, false);
		right_arm_r1.setTextureOffset(48, 65).addBox(-2.0F, 7.6667F, -7.0F, 4.0F, 4.0F, 4.0F, 0.25F, false);
		right_arm_r1.setTextureOffset(62, 51).addBox(-1.0F, 6.6667F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(0, 45).addBox(-2.0F, -0.9333F, -7.0F, 4.0F, 8.0F, 4.0F, 0.3F, false);
		right_arm_r1.setTextureOffset(32, 63).addBox(-2.0F, 1.6667F, -7.0F, 4.0F, 5.0F, 4.0F, 0.25F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(6.0F, -5.0F, 0.0F);
		left_arm.setTextureOffset(62, 59).addBox(0.5F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		left_arm.setTextureOffset(18, 43).addBox(0.5F, -2.0F, -2.0F, 4.0F, 13.0F, 4.0F, 0.3F, false);
		left_arm.setTextureOffset(63, 23).addBox(0.5F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.25F, false);
		left_arm.setTextureOffset(28, 61).addBox(1.5F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(12, 58).addBox(1.5F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(65, 4).addBox(0.5F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
		right_leg.setTextureOffset(16, 60).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		right_leg.setTextureOffset(59, 33).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		right_leg.setTextureOffset(52, 23).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(30, 44).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(34, 18).addBox(-2.4F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.25F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
		left_leg.setTextureOffset(0, 57).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		left_leg.setTextureOffset(50, 53).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		left_leg.setTextureOffset(44, 13).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(26, 18).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(26, 8).addBox(-2.6F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.25F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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