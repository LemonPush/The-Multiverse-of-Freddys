// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelIgnitedChica extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r2;
	private final ModelRenderer bone_r3;
	private final ModelRenderer bone_r4;
	private final ModelRenderer right_arm_r4;
	private final ModelRenderer body;
	private final ModelRenderer neck;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelIgnitedChica() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -6.8294F, -0.95F);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(8.0F, 3.8294F, 9.45F);
		head.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
		right_arm_r1.setTextureOffset(73, 23).addBox(-10.5F, 11.0F, -12.6F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(68, 19).addBox(-10.5F, 11.0F, -11.6F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(64, 30).addBox(-11.0F, 7.0F, -12.5F, 6.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(0, 43).addBox(-12.0F, 7.0F, -17.5F, 8.0F, 4.0F, 5.0F, 0.0F, false);

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
		bone.setTextureOffset(61, 58).addBox(-3.5F, -24.5F, -7.0F, 7.0F, 1.0F, 5.0F, 0.0F, false);
		bone.setTextureOffset(45, 43).addBox(-3.5F, -26.5F, -7.0F, 7.0F, 2.0F, 6.0F, 0.0F, false);
		bone.setTextureOffset(0, 19).addBox(-4.5F, -31.5F, -2.1F, 9.0F, 7.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(0, 34).addBox(-4.5F, -24.5F, -2.1F, 9.0F, 2.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(64, 44).addBox(4.5F, -26.5F, -2.1F, 1.0F, 4.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(64, 44).addBox(-5.5F, -26.5F, -2.1F, 1.0F, 4.0F, 7.0F, 0.0F, true);
		bone.setTextureOffset(0, 64).addBox(-2.5F, -27.1F, -6.8F, 5.0F, 1.0F, 6.0F, 0.0F, false);

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(-1.0F, -30.5F, 1.5F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.3054F, 1.5708F, 0.0F);
		bone_r1.setTextureOffset(77, 10).addBox(-1.5F, -4.0F, -0.5F, 3.0F, 4.0F, 1.0F, -0.25F, true);

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(1.0F, -30.5F, 1.5F);
		bone.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.3054F, -1.5708F, 0.0F);
		bone_r2.setTextureOffset(77, 10).addBox(-1.5F, -4.0F, -0.5F, 3.0F, 4.0F, 1.0F, -0.25F, false);

		bone_r3 = new ModelRenderer(this);
		bone_r3.setRotationPoint(0.0F, -30.5F, 1.0F);
		bone.addChild(bone_r3);
		setRotationAngle(bone_r3, 0.3054F, 0.0F, 0.0F);
		bone_r3.setTextureOffset(77, 10).addBox(-1.5F, -4.0F, -0.5F, 3.0F, 4.0F, 1.0F, -0.25F, false);

		bone_r4 = new ModelRenderer(this);
		bone_r4.setRotationPoint(0.0F, -30.5F, 2.0F);
		bone.addChild(bone_r4);
		setRotationAngle(bone_r4, -0.3054F, 0.0F, 0.0F);
		bone_r4.setTextureOffset(77, 10).addBox(-1.5F, -4.0F, -0.5F, 3.0F, 4.0F, 1.0F, -0.25F, false);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(8.0F, -11.0F, 9.0F);
		bone.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, -1.5708F, 0.0F, 0.0F);
		right_arm_r4.setTextureOffset(0, 80).addBox(-7.0F, 10.2F, -18.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		right_arm_r4.setTextureOffset(0, 80).addBox(-11.0F, 10.2F, -18.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -9.0F, 0.0F);
		body.setTextureOffset(40, 63).addBox(-3.5F, 13.0F, -2.0F, 7.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(73, 46).addBox(-4.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(73, 42).addBox(-4.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(35, 58).addBox(1.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(64, 38).addBox(1.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(79, 71).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(56, 30).addBox(-5.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(62, 0).addBox(-4.0F, 7.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(46, 6).addBox(1.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(78, 53).addBox(5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(76, 38).addBox(-7.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(42, 34).addBox(-1.0F, 9.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-5.0F, -1.4F, -3.0F, 10.0F, 13.0F, 6.0F, 0.25F, false);
		body.setTextureOffset(49, 79).addBox(3.5F, -1.7F, -4.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(20, 52).addBox(2.5F, -1.7F, -4.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(46, 23).addBox(-3.5F, -1.7F, -4.0F, 1.0F, 9.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(45, 79).addBox(-4.5F, -1.7F, -4.0F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(22, 69).addBox(-2.5F, -1.7F, -4.0F, 5.0F, 10.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(26, 13).addBox(-5.0F, 12.6F, -3.0F, 10.0F, 4.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(12, 71).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(77, 15).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(2.0F, 1.0F, 0.0F);
		body.addChild(neck);
		setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(6.5F, -9.0F, 0.0F);
		setRotationAngle(left_arm, 0.0F, 0.0F, -1.5708F);
		left_arm.setTextureOffset(41, 46).addBox(-1.0F, 6.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		left_arm.setTextureOffset(46, 70).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);
		left_arm.setTextureOffset(46, 51).addBox(-2.5F, -0.7F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.5F, -9.0F, 0.0F);
		setRotationAngle(right_arm, 0.0F, 0.0F, 1.5708F);
		right_arm.setTextureOffset(41, 46).addBox(-1.0F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(46, 70).addBox(-1.5F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.7F, 7.0F, -0.5F);
		left_leg.setTextureOffset(76, 68).addBox(-1.0F, 8.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(73, 27).addBox(-1.0F, 15.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(67, 8).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(70, 71).addBox(-1.5F, 9.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(34, 70).addBox(-1.5F, 1.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(56, 64).addBox(-2.0F, 16.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(32, 6).addBox(-2.0F, 15.6F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 19).addBox(-0.5F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 3).addBox(-2.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 0).addBox(1.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(53, 18).addBox(-2.5F, 1.0F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(52, 6).addBox(-2.5F, 8.5F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(23, 34).addBox(-2.5F, 14.0F, -6.0F, 5.0F, 3.0F, 9.0F, 0.0F, false);
		left_leg.setTextureOffset(76, 5).addBox(-2.5F, 15.0F, -8.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(76, 5).addBox(1.5F, 15.0F, -8.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(76, 5).addBox(-0.5F, 15.0F, -8.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.7F, 7.0F, -0.5F);
		right_leg.setTextureOffset(76, 68).addBox(-1.0F, 8.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(73, 27).addBox(-1.0F, 15.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(67, 8).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(58, 71).addBox(-1.5F, 9.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(34, 70).addBox(-1.5F, 1.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, true);
		right_leg.setTextureOffset(56, 64).addBox(-2.0F, 16.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
		right_leg.setTextureOffset(32, 6).addBox(-2.0F, 15.6F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 19).addBox(-0.5F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 3).addBox(1.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 0).addBox(-2.3F, 16.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 52).addBox(-2.5F, 1.0F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(23, 34).addBox(-2.5F, 14.0F, -6.0F, 5.0F, 3.0F, 9.0F, 0.0F, true);
		right_leg.setTextureOffset(76, 5).addBox(-2.5F, 15.0F, -8.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);
		right_leg.setTextureOffset(76, 5).addBox(1.5F, 15.0F, -8.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);
		right_leg.setTextureOffset(76, 5).addBox(-0.5F, 15.0F, -8.0F, 1.0F, 2.0F, 3.0F, 0.0F, true);
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
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}