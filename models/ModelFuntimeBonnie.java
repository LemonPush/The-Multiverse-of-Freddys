// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelFuntimeBonnie extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer right_arm_r5_r1;
	private final ModelRenderer right_arm_r6_r1;
	private final ModelRenderer right_arm_r6_r2;
	private final ModelRenderer right_arm_r4_r1;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r2;
	private final ModelRenderer right_arm_r4;
	private final ModelRenderer body;
	private final ModelRenderer neck;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_arm;

	public ModelFuntimeBonnie() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -7.8294F, 0.05F);

		right_arm_r5_r1 = new ModelRenderer(this);
		right_arm_r5_r1.setRotationPoint(-3.9548F, -8.0705F, -1.2167F);
		head.addChild(right_arm_r5_r1);
		setRotationAngle(right_arm_r5_r1, -1.5708F, 0.0F, 0.0F);
		right_arm_r5_r1.setTextureOffset(0, 4).addBox(0.9548F, -1.7F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		right_arm_r5_r1.setTextureOffset(0, 4).addBox(4.9548F, -1.7F, -2.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		right_arm_r6_r1 = new ModelRenderer(this);
		right_arm_r6_r1.setRotationPoint(-2.0F, -14.7705F, -0.1167F);
		head.addChild(right_arm_r6_r1);
		setRotationAngle(right_arm_r6_r1, -0.8552F, 0.0F, 0.0F);
		right_arm_r6_r1.setTextureOffset(21, 31).addBox(-1.5F, -1.4F, -4.8F, 3.0F, 2.0F, 4.0F, 0.0F, true);
		right_arm_r6_r1.setTextureOffset(0, 17).addBox(-1.0F, -1.4F, -5.8F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		right_arm_r6_r1.setTextureOffset(21, 31).addBox(2.5F, -1.4F, -4.8F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		right_arm_r6_r1.setTextureOffset(0, 17).addBox(3.0F, -1.4F, -5.8F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		right_arm_r6_r2 = new ModelRenderer(this);
		right_arm_r6_r2.setRotationPoint(-3.9548F, -6.9705F, -1.2167F);
		head.addChild(right_arm_r6_r2);
		setRotationAngle(right_arm_r6_r2, -1.5708F, 0.0F, 0.0F);
		right_arm_r6_r2.setTextureOffset(0, 4).addBox(0.9548F, -1.5F, -9.1F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		right_arm_r6_r2.setTextureOffset(0, 4).addBox(4.9548F, -1.5F, -9.1F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		right_arm_r4_r1 = new ModelRenderer(this);
		right_arm_r4_r1.setRotationPoint(-3.9548F, -7.9705F, -1.2167F);
		head.addChild(right_arm_r4_r1);
		setRotationAngle(right_arm_r4_r1, -1.5708F, 0.0F, 0.0F);
		right_arm_r4_r1.setTextureOffset(63, 66).addBox(0.4548F, -2.1F, -7.1F, 3.0F, 2.0F, 5.0F, 0.0F, true);
		right_arm_r4_r1.setTextureOffset(63, 66).addBox(4.4548F, -2.1F, -7.1F, 3.0F, 2.0F, 5.0F, 0.0F, false);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(8.0F, 3.8294F, 8.45F);
		head.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
		right_arm_r1.setTextureOffset(0, 59).addBox(-11.0F, 7.0F, -7.5F, 6.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(32, 39).addBox(-12.0F, 7.0F, -12.5F, 8.0F, 4.0F, 6.0F, 0.0F, false);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-3.5622F, -12.9931F, -0.55F);
		head.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.6545F);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(3.5622F, -12.9931F, -0.55F);
		head.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, -1.5708F, 0.0F, -0.6545F);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 14.8294F, -1.55F);
		head.addChild(bone);
		bone.setTextureOffset(54, 39).addBox(-3.5F, -17.5F, -5.0F, 7.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(58, 12).addBox(-3.5F, -19.5F, -5.0F, 7.0F, 2.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(35, 49).addBox(1.5F, -20.0F, -5.1F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(35, 49).addBox(-5.5F, -20.0F, -5.1F, 4.0F, 3.0F, 1.0F, 0.0F, true);
		bone.setTextureOffset(0, 13).addBox(-4.5F, -24.5F, -2.1F, 9.0F, 8.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(29, 60).addBox(4.5F, -19.5F, -2.1F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(13, 60).addBox(-5.5F, -19.5F, -2.1F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(12, 70).addBox(-2.5F, -20.1F, -4.8F, 5.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(28, 4).addBox(-1.0F, -21.1F, -4.8F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.0F, -14.4F, 0.9F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.1309F, 0.0F, 0.0F);
		bone_r1.setTextureOffset(64, 18).addBox(-3.5F, -1.9F, -5.7F, 7.0F, 1.0F, 3.0F, 0.0F, false);

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(0.0F, -14.4F, 0.9F);
		bone.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.1309F, 0.0F, 0.0F);
		bone_r2.setTextureOffset(21, 28).addBox(3.5F, -0.9F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(21, 30).addBox(-4.5F, -0.9F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(45, 60).addBox(-5.5F, -0.9F, -2.7F, 1.0F, 2.0F, 7.0F, 0.0F, false);
		bone_r2.setTextureOffset(54, 66).addBox(4.5F, -0.9F, -2.7F, 1.0F, 2.0F, 7.0F, 0.0F, false);
		bone_r2.setTextureOffset(62, 37).addBox(-4.5F, -0.9F, 3.3F, 9.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(28, 0).addBox(-3.5F, 0.1F, -5.7F, 7.0F, 1.0F, 3.0F, 0.0F, false);
		bone_r2.setTextureOffset(28, 0).addBox(-3.5F, -0.9F, -5.7F, 7.0F, 1.0F, 3.0F, 0.0F, false);
		bone_r2.setTextureOffset(0, 39).addBox(-4.5F, 0.1F, -2.7F, 9.0F, 1.0F, 7.0F, 0.0F, false);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(8.0F, -11.0F, 9.0F);
		bone.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, -1.5708F, 0.0F, 0.0F);
		right_arm_r4.setTextureOffset(44, 69).addBox(-11.5F, 9.7F, -13.1F, 3.0F, 2.0F, 1.0F, -0.25F, false);
		right_arm_r4.setTextureOffset(66, 9).addBox(-7.0F, 10.2F, -11.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		right_arm_r4.setTextureOffset(38, 64).addBox(-11.0F, 10.2F, -11.5F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		right_arm_r4.setTextureOffset(58, 18).addBox(-7.5F, 9.7F, -13.1F, 3.0F, 2.0F, 1.0F, -0.25F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(-0.5F, -9.0F, 0.0F);
		body.setTextureOffset(78, 71).addBox(-4.0F, 9.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(67, 78).addBox(-4.0F, 6.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(78, 0).addBox(1.0F, 6.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(74, 67).addBox(1.0F, 4.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(54, 22).addBox(-4.0F, 12.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(36, 77).addBox(1.0F, 9.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(22, 60).addBox(5.25F, 4.0F, -2.0F, 2.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 67).addBox(-8.25F, 4.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(66, 0).addBox(-1.5F, 11.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(32, 15).addBox(-4.5F, 6.1F, -3.0F, 10.0F, 1.0F, 6.0F, 0.25F, false);
		body.setTextureOffset(0, 0).addBox(-5.0F, 7.6F, -3.0F, 11.0F, 7.0F, 6.0F, 0.25F, false);
		body.setTextureOffset(30, 31).addBox(-4.5F, 3.6F, -3.0F, 10.0F, 2.0F, 6.0F, 0.25F, false);
		body.setTextureOffset(50, 77).addBox(3.5F, 7.3F, -3.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(46, 77).addBox(-3.5F, 7.3F, -3.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(4, 28).addBox(2.5F, 6.3F, -3.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 28).addBox(-2.5F, 6.3F, -3.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(76, 27).addBox(-1.5F, 5.3F, -3.5F, 4.0F, 9.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 39).addBox(-0.5F, 3.6F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(61, 0).addBox(-1.0F, 7.25F, -4.0F, 3.0F, 3.0F, 1.0F, 0.5F, false);
		body.setTextureOffset(32, 19).addBox(0.0F, 11.3F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(31, 31).addBox(0.0F, 12.8F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 13).addBox(-2.5F, 3.3F, -4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(1.5F, 3.3F, -4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(26, 22).addBox(-5.0F, 15.5F, -3.0F, 11.0F, 3.0F, 6.0F, 0.25F, false);
		body.setTextureOffset(15, 47).addBox(-1.0F, 15.5F, 3.5F, 3.0F, 3.0F, 2.0F, 0.25F, false);
		body.setTextureOffset(28, 76).addBox(-1.0F, 4.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(30, 70).addBox(-1.5F, 2.0F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(2.0F, 1.0F, 0.0F);
		body.addChild(neck);
		setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.5F, -9.0F, 0.0F);
		left_arm.setTextureOffset(42, 72).addBox(1.0F, 16.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(71, 22).addBox(1.0F, 9.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(72, 51).addBox(1.5F, 11.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(25, 39).addBox(1.5F, 18.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(71, 40).addBox(1.5F, 4.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(40, 49).addBox(0.5F, 3.3F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(20, 49).addBox(0.5F, 10.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(55, 44).addBox(0.5F, 16.7F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.2F, 7.0F, -0.5F);
		left_leg.setTextureOffset(76, 9).addBox(-2.0F, 9.0F, -1.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(38, 60).addBox(-2.5F, 7.75F, -2.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		left_leg.setTextureOffset(66, 73).addBox(-2.0F, 2.7F, -1.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(55, 75).addBox(-1.5F, 10.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(56, 26).addBox(-2.5F, 3.0F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 47).addBox(-2.5F, 9.5F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 28).addBox(-3.0F, 15.0F, -6.0F, 6.0F, 2.0F, 9.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.2F, 7.0F, -0.5F);
		right_leg.setTextureOffset(12, 75).addBox(-2.0F, 9.0F, -1.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(74, 62).addBox(-2.0F, 2.7F, -1.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 74).addBox(-1.5F, 10.0F, -1.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(55, 55).addBox(-2.5F, 3.0F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(46, 0).addBox(-2.5F, 9.5F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(25, 4).addBox(-3.0F, 15.0F, -6.0F, 6.0F, 2.0F, 9.0F, 0.0F, false);
		right_leg.setTextureOffset(25, 15).addBox(-2.5F, 7.75F, -2.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.5F, -9.0F, 0.0F);
		right_arm.setTextureOffset(42, 72).addBox(-5.0F, 16.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, true);
		right_arm.setTextureOffset(71, 22).addBox(-5.0F, 9.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, true);
		right_arm.setTextureOffset(72, 51).addBox(-4.5F, 11.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);
		right_arm.setTextureOffset(25, 39).addBox(-4.5F, 18.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		right_arm.setTextureOffset(71, 40).addBox(-4.5F, 4.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);
		right_arm.setTextureOffset(40, 49).addBox(-5.5F, 3.3F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, true);
		right_arm.setTextureOffset(20, 49).addBox(-5.5F, 10.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, true);
		right_arm.setTextureOffset(55, 44).addBox(-5.5F, 16.7F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, true);
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
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}