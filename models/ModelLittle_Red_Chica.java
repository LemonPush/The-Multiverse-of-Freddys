// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelLittle_Red_Chica extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelLittle_Red_Chica() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(0, 42).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(76, 21).addBox(-3.0F, -7.0F, -7.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(60, 39).addBox(-3.0F, -8.0F, -7.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(57, 53).addBox(-3.0F, -8.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(54, 32).addBox(2.0F, -8.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(76, 47).addBox(-2.0F, -10.0F, -6.8F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(38, 31).addBox(-3.0F, -9.5F, -7.2F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(32, 23).addBox(-1.0F, -10.5F, -6.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(62, 3).addBox(-2.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(62, 0).addBox(0.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(34, 4).addBox(0.7F, -13.5F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 30).addBox(-2.7F, -13.5F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(33, 67).addBox(-4.5F, -13.5F, -4.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(62, 10).addBox(3.5F, -13.5F, -4.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(65, 66).addBox(4.5F, -7.0F, -4.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(65, 66).addBox(-5.5F, -7.0F, -4.0F, 1.0F, 1.0F, 9.0F, 0.0F, true);
		head.setTextureOffset(17, 58).addBox(4.5F, -16.0F, -6.0F, 1.0F, 2.0F, 11.0F, 0.0F, false);
		head.setTextureOffset(64, 53).addBox(-5.5F, -16.0F, 4.0F, 11.0F, 11.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(32, 29).addBox(-5.5F, -6.0F, 3.0F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(32, 18).addBox(-5.5F, -16.0F, -6.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(52, 57).addBox(5.5F, -14.5F, -5.0F, 1.0F, 8.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(17, 58).addBox(-5.5F, -16.0F, -6.0F, 1.0F, 2.0F, 11.0F, 0.0F, true);
		head.setTextureOffset(52, 57).addBox(-6.5F, -14.5F, -5.0F, 1.0F, 8.0F, 10.0F, 0.0F, true);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(60, 29).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(32, 36).addBox(-5.5F, 5.0F, -3.0F, 11.0F, 9.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(34, 0).addBox(-5.5F, -7.0F, -3.0F, 11.0F, 12.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(32, 51).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 11.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-8.0F, -6.0F, 2.5F, 16.0F, 25.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(68, 0).addBox(-4.0F, -5.9F, -2.7F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(60, 37).addBox(-3.5F, 2.1F, -2.7F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(34, 0).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 26).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(70, 25).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(43, 67).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
		left_arm.setTextureOffset(67, 76).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 79).addBox(1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(19, 64).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(62, 25).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(32, 82).addBox(1.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
		right_arm.setTextureOffset(0, 69).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 42).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(-3.0F, 10.3333F, 0.0F);
		right_arm.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
		right_arm_r1.setTextureOffset(24, 42).addBox(2.2F, 10.2667F, -16.5F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		right_arm_r1.setTextureOffset(84, 6).addBox(0.0F, 6.6667F, -17.0F, 4.0F, 4.0F, 3.0F, 0.25F, false);
		right_arm_r1.setTextureOffset(34, 18).addBox(1.5F, 8.1667F, -20.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(85, 26).addBox(0.0F, 6.6667F, -14.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(0, 58).addBox(0.0F, 4.6667F, -19.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(77, 80).addBox(0.0F, 12.6667F, -19.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(77, 80).addBox(0.0F, 3.6667F, -19.0F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(0, 26).addBox(-6.0F, 3.6667F, -13.0F, 13.0F, 10.0F, 6.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(16, 81).addBox(-2.0F, 6.6667F, -7.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(24, 45).addBox(-1.0F, 5.6667F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(72, 9).addBox(-2.0F, 0.6667F, -7.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-3.0F, 10.3333F, -11.0F);
		right_arm.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.0F);
		right_arm_r2.setTextureOffset(24, 42).addBox(-0.2F, -0.7333F, -16.5F, 2.0F, 1.0F, 2.0F, -0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
		right_leg.setTextureOffset(76, 65).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(76, 37).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(19, 61).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(19, 58).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 58).addBox(-2.4F, 14.0F, -6.0F, 5.0F, 2.0F, 9.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
		left_leg.setTextureOffset(51, 75).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(16, 71).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(54, 29).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 46).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(57, 42).addBox(-2.6F, 14.0F, -6.0F, 5.0F, 2.0F, 9.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}