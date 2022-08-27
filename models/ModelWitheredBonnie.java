// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelWitheredBonnie extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;
	private final ModelRenderer right_arm_r4;
	private final ModelRenderer body;
	private final ModelRenderer neck;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelWitheredBonnie() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -7.8294F, -0.95F);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(8.0F, 3.8294F, 9.45F);
		head.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
		right_arm_r1.setTextureOffset(71, 60).addBox(-10.5F, 10.5F, -8.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(54, 0).addBox(-10.5F, 10.5F, -9.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(57, 43).addBox(-11.0F, 7.0F, -11.5F, 6.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(32, 0).addBox(-12.0F, 7.0F, -17.5F, 8.0F, 4.0F, 6.0F, 0.0F, false);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-3.5622F, -12.9931F, 0.45F);
		head.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.6545F);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(3.5622F, -12.9931F, 0.45F);
		head.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, -1.5708F, 0.0F, -0.6545F);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 14.8294F, -0.55F);
		head.addChild(bone);
		bone.setTextureOffset(0, 30).addBox(-4.5F, -29.0F, -2.0F, 9.0F, 1.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(0, 19).addBox(-4.5F, -19.0F, -5.0F, 9.0F, 1.0F, 10.0F, 0.0F, false);
		bone.setTextureOffset(32, 10).addBox(-3.5F, -19.0F, -6.0F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(51, 48).addBox(-4.5F, -20.0F, -5.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(0, 4).addBox(-3.5F, -20.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(51, 48).addBox(3.5F, -20.0F, -5.0F, 1.0F, 1.0F, 3.0F, 0.0F, true);
		bone.setTextureOffset(0, 4).addBox(2.5F, -20.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bone.setTextureOffset(15, 38).addBox(-3.25F, -20.0F, -5.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(28, 27).addBox(-1.75F, -20.0F, -6.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(57, 23).addBox(-4.5F, -28.0F, 4.0F, 9.0F, 9.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(73, 40).addBox(-4.6F, -34.4F, 0.7F, 4.0F, 5.0F, 2.0F, 0.0F, false);
		bone.setTextureOffset(27, 51).addBox(-4.1F, -35.4F, 1.2F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(58, 51).addBox(-4.1F, -30.4F, 1.2F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(73, 40).addBox(0.6F, -34.4F, 0.7F, 4.0F, 5.0F, 2.0F, 0.0F, true);
		bone.setTextureOffset(27, 51).addBox(1.1F, -35.4F, 1.2F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		bone.setTextureOffset(58, 51).addBox(1.1F, -30.4F, 1.2F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		bone.setTextureOffset(54, 4).addBox(-4.5F, -28.0F, -2.0F, 1.0F, 9.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(33, 59).addBox(-5.5F, -22.5F, -2.0F, 1.0F, 4.0F, 7.0F, 0.0F, true);
		bone.setTextureOffset(25, 35).addBox(3.5F, -28.0F, -2.0F, 1.0F, 9.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(33, 59).addBox(4.5F, -22.5F, -2.0F, 1.0F, 4.0F, 7.0F, 0.0F, false);

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(2.0919F, -35.5308F, 0.8243F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.5236F, 0.0F, 0.0F);
		bone_r1.setTextureOffset(15, 40).addBox(-0.9919F, -4.1396F, -0.6186F, 3.0F, 1.0F, 2.0F, 0.0F, true);
		bone_r1.setTextureOffset(26, 0).addBox(-1.4919F, -3.1396F, -0.6186F, 4.0F, 4.0F, 2.0F, 0.0F, true);
		bone_r1.setTextureOffset(15, 40).addBox(-6.1919F, -4.1396F, -0.6186F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		bone_r1.setTextureOffset(26, 0).addBox(-6.6919F, -3.1396F, -0.6186F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(8.0F, -11.0F, 9.0F);
		bone.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, -1.5708F, 0.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -9.0F, 0.0F);
		body.setTextureOffset(56, 33).addBox(-3.5F, 13.0F, -2.0F, 7.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(75, 64).addBox(-4.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(58, 74).addBox(-4.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(74, 33).addBox(1.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(15, 50).addBox(1.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(76, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(34, 35).addBox(-5.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(49, 65).addBox(-4.0F, 7.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(28, 23).addBox(1.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(58, 69).addBox(5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 69).addBox(6.0F, -1.0F, -1.0F, 3.0F, 9.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(42, 59).addBox(-7.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(48, 23).addBox(-1.0F, 9.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-5.0F, -1.4F, -3.0F, 10.0F, 13.0F, 6.0F, 0.25F, false);
		body.setTextureOffset(66, 51).addBox(3.5F, 3.3F, -4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(66, 51).addBox(-4.5F, 3.3F, -4.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(10, 69).addBox(2.5F, 1.3F, -4.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(10, 69).addBox(-3.5F, 1.3F, -4.0F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(20, 65).addBox(-2.5F, -0.7F, -4.0F, 5.0F, 12.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 65).addBox(-1.0F, -1.2F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-3.0F, -1.5F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(1.0F, -1.5F, -5.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(28, 13).addBox(-5.0F, 12.6F, -3.0F, 10.0F, 4.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 19).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(68, 20).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(2.0F, 1.0F, 0.0F);
		body.addChild(neck);
		setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-6.5F, -9.0F, 0.0F);
		right_arm.setTextureOffset(42, 63).addBox(-3.0F, 12.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(62, 7).addBox(-3.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(71, 51).addBox(-3.5F, 6.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(68, 7).addBox(-3.5F, 13.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(32, 70).addBox(-3.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 50).addBox(-4.5F, -1.7F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(51, 54).addBox(-4.5F, 6.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.7F, 7.0F, -0.5F);
		left_leg.setTextureOffset(61, 40).addBox(-1.0F, 8.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(60, 20).addBox(-1.0F, 15.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(46, 10).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(46, 69).addBox(-1.5F, 9.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(66, 66).addBox(-1.5F, 1.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(62, 13).addBox(-2.0F, 16.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 62).addBox(-2.0F, 15.6F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(14, 62).addBox(-0.5F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 62).addBox(-2.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(34, 39).addBox(1.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(36, 47).addBox(-2.5F, 1.0F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(20, 54).addBox(-2.5F, 8.5F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(20, 54).addBox(-2.5F, 9.0F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.7F, 7.0F, -0.5F);
		right_leg.setTextureOffset(61, 40).addBox(-1.0F, 8.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(60, 20).addBox(-1.0F, 15.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(46, 10).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(46, 69).addBox(-1.5F, 9.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, true);
		right_leg.setTextureOffset(66, 66).addBox(-1.5F, 1.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, true);
		right_leg.setTextureOffset(62, 0).addBox(-2.0F, 16.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 62).addBox(-2.0F, 15.6F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
		right_leg.setTextureOffset(25, 33).addBox(-0.5F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 33).addBox(1.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 30).addBox(-2.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(41, 35).addBox(-2.5F, 1.0F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 38).addBox(-2.5F, 8.5F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(29, 23).addBox(-2.5F, 14.0F, -6.0F, 5.0F, 3.0F, 9.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}