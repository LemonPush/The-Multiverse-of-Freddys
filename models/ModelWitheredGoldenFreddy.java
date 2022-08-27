// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelWitheredGoldenFreddy extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;
	private final ModelRenderer right_arm_r4;
	private final ModelRenderer body;
	private final ModelRenderer neck;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_arm_r1;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_arm_r5;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_leg_r1;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_leg_r1;

	public ModelWitheredGoldenFreddy() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 6.0F, 3.0F);
		setRotationAngle(head, 0.1309F, 0.0F, -0.2182F);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(8.0F, -9.0F, 8.5F);
		head.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
		right_arm_r1.setTextureOffset(28, 34).addBox(-12.2164F, 7.1274F, -2.5321F, 8.0F, 4.0F, 6.0F, 0.0F, false);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-3.5622F, -25.8225F, -0.5F);
		head.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.6545F);
		right_arm_r2.setTextureOffset(0, 71).addBox(4.2976F, -1.55F, 10.2399F, 4.0F, 2.0F, 4.0F, 0.25F, false);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(3.5622F, -25.8225F, -0.5F);
		head.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, -1.5708F, 0.0F, -0.6545F);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 2.0F, -1.5F);
		head.addChild(bone);
		bone.setTextureOffset(58, 42).addBox(-3.7164F, -6.6321F, -5.1274F, 7.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(57, 0).addBox(-3.7164F, -8.6321F, -5.1274F, 7.0F, 2.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 19).addBox(-4.7164F, -13.5321F, -2.2274F, 9.0F, 7.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(46, 23).addBox(-3.2164F, -14.5321F, -1.6274F, 6.0F, 2.0F, 6.0F, -0.25F, false);
		bone.setTextureOffset(63, 64).addBox(-2.2164F, -17.5321F, -0.6274F, 4.0F, 4.0F, 4.0F, -0.25F, false);
		bone.setTextureOffset(32, 0).addBox(-4.7164F, -6.5321F, -2.2274F, 9.0F, 2.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(32, 0).addBox(-4.7164F, -5.5321F, -2.2274F, 9.0F, 2.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(0, 60).addBox(4.2836F, -8.5321F, -2.2274F, 1.0F, 4.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(0, 60).addBox(-5.7164F, -8.5321F, -2.2274F, 1.0F, 4.0F, 7.0F, 0.0F, true);
		bone.setTextureOffset(65, 57).addBox(-2.7164F, -9.2321F, -4.9274F, 5.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 4).addBox(-1.2164F, -10.2321F, -4.9274F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.0F, -6.05F, 1.0F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.1309F, 0.0F, 0.0F);
		bone_r1.setTextureOffset(58, 42).addBox(-3.7164F, 0.993F, -6.2527F, 7.0F, 1.0F, 4.0F, 0.0F, false);
		bone_r1.setTextureOffset(67, 6).addBox(-4.7164F, 1.993F, -3.2527F, 1.0F, 1.0F, 7.0F, 0.0F, true);
		bone_r1.setTextureOffset(67, 6).addBox(3.2836F, 1.993F, -3.2527F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		bone_r1.setTextureOffset(22, 23).addBox(-3.7164F, 1.993F, -6.2527F, 7.0F, 1.0F, 10.0F, 0.0F, false);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(8.0F, -11.0F, 9.0F);
		bone.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, -1.5708F, 0.0F, 0.0F);
		right_arm_r4.setTextureOffset(76, 9).addBox(-11.7164F, 9.8274F, -2.1321F, 3.0F, 2.0F, 1.0F, -0.25F, false);
		right_arm_r4.setTextureOffset(76, 18).addBox(-7.2164F, 10.3274F, -0.5321F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		right_arm_r4.setTextureOffset(76, 18).addBox(-11.2164F, 10.3274F, -0.5321F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		right_arm_r4.setTextureOffset(76, 9).addBox(-7.7164F, 9.8274F, -2.1321F, 3.0F, 2.0F, 1.0F, -0.25F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 10.1833F, 0.7083F);
		setRotationAngle(body, -0.2618F, 0.0F, 0.0F);
		body.setTextureOffset(35, 56).addBox(-3.5F, 9.7826F, -0.4495F, 7.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(72, 14).addBox(-4.0F, 1.1826F, 0.5505F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(58, 19).addBox(-4.0F, -1.4174F, 0.5505F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(9, 57).addBox(1.0F, -1.4174F, 0.5505F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(15, 45).addBox(1.0F, -4.2174F, 0.5505F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(76, 6).addBox(-1.0F, -5.2174F, 0.5505F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(19, 34).addBox(-5.0F, -4.2174F, 0.5505F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(32, 9).addBox(-4.0F, 3.7826F, 0.5505F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(38, 44).addBox(1.0F, 1.1826F, 0.5505F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(30, 56).addBox(5.0F, -4.2174F, 0.5505F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(19, 38).addBox(-7.0F, -4.2174F, 0.5505F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 33).addBox(-1.0F, 5.7826F, 0.5505F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-5.0F, -4.6174F, -1.4495F, 10.0F, 13.0F, 6.0F, 0.25F, false);
		body.setTextureOffset(0, 57).addBox(3.5F, 0.0826F, -2.4495F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 57).addBox(-4.5F, 0.0826F, -2.4495F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(28, 67).addBox(2.5F, -1.9174F, -2.4495F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(28, 67).addBox(-3.5F, -1.9174F, -2.4495F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(35, 63).addBox(-2.5F, -3.9174F, -2.4495F, 5.0F, 12.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(46, 23).addBox(-1.0F, -4.4174F, -3.4495F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-3.0F, -4.7174F, -3.4495F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(1.0F, -4.7174F, -3.4495F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(26, 13).addBox(-5.0F, 9.3826F, -1.4495F, 10.0F, 4.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(71, 72).addBox(-1.0F, -4.2174F, 0.5505F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(75, 65).addBox(-1.0F, -6.2174F, 0.5505F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(2.0F, -17.1833F, 1.2917F);
		body.addChild(neck);
		setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(6.5F, -9.0F, 0.0F);
		left_arm.setTextureOffset(64, 6).addBox(1.0F, 21.4F, 2.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		left_arm.setTextureOffset(71, 47).addBox(0.5F, 15.4F, 1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);
		left_arm.setTextureOffset(23, 44).addBox(-0.5F, 14.7F, 0.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		left_arm_r1 = new ModelRenderer(this);
		left_arm_r1.setRotationPoint(2.0F, 21.5F, 3.0F);
		left_arm.addChild(left_arm_r1);
		setRotationAngle(left_arm_r1, -0.4363F, 0.0F, -0.4363F);
		left_arm_r1.setTextureOffset(52, 9).addBox(-2.5F, 7.9F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		left_arm_r1.setTextureOffset(15, 56).addBox(-2.5F, 0.9F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
		left_arm_r1.setTextureOffset(26, 0).addBox(-1.5F, 7.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		left_arm_r1.setTextureOffset(71, 27).addBox(-1.5F, 0.9F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_arm_r1.setTextureOffset(63, 47).addBox(-1.0F, 6.9F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-6.5F, -9.0F, 0.0F);
		right_arm.setTextureOffset(64, 6).addBox(-3.0F, 21.4F, 2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(71, 47).addBox(-3.5F, 15.4F, 1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(23, 44).addBox(-4.5F, 14.7F, 0.5F, 5.0F, 7.0F, 5.0F, 0.0F, true);

		right_arm_r5 = new ModelRenderer(this);
		right_arm_r5.setRotationPoint(-2.0F, 21.4714F, 1.7857F);
		right_arm.addChild(right_arm_r5);
		setRotationAngle(right_arm_r5, -0.5221F, 0.4817F, 0.3054F);
		right_arm_r5.setTextureOffset(64, 19).addBox(-2.0F, 8.4286F, -7.2857F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm_r5.setTextureOffset(47, 64).addBox(-1.5F, 8.9286F, -3.2857F, 3.0F, 3.0F, 5.0F, 0.0F, false);
		right_arm_r5.setTextureOffset(52, 9).addBox(-2.5F, 7.9286F, -1.2857F, 5.0F, 5.0F, 5.0F, 0.0F, true);
		right_arm_r5.setTextureOffset(56, 31).addBox(-2.5F, 0.9286F, -1.2857F, 5.0F, 6.0F, 5.0F, 0.0F, false);
		right_arm_r5.setTextureOffset(26, 0).addBox(-1.5F, 7.9286F, -0.2857F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		right_arm_r5.setTextureOffset(71, 27).addBox(-1.5F, 0.9286F, -0.2857F, 3.0F, 6.0F, 3.0F, 0.0F, true);
		right_arm_r5.setTextureOffset(63, 47).addBox(-1.0F, 6.9286F, 0.2143F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.9403F, 18.2231F, -3.0024F);
		setRotationAngle(left_leg, -2.1422F, -0.1819F, -0.0542F);
		left_leg.setTextureOffset(58, 64).addBox(-1.0114F, -1.8371F, 1.7943F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(16, 67).addBox(-1.5114F, -0.8371F, 1.2943F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 45).addBox(-2.5114F, -0.8371F, -0.5057F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		left_leg_r1 = new ModelRenderer(this);
		left_leg_r1.setRotationPoint(2.7422F, 5.9545F, -13.4675F);
		left_leg.addChild(left_leg_r1);
		setRotationAngle(left_leg_r1, 1.1345F, 0.0F, 0.0F);
		left_leg_r1.setTextureOffset(0, 33).addBox(-5.2536F, 20.0584F, 1.6794F, 5.0F, 3.0F, 9.0F, 0.0F, false);
		left_leg_r1.setTextureOffset(43, 44).addBox(-5.2536F, 14.5584F, 5.6794F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		left_leg_r1.setTextureOffset(0, 19).addBox(-1.4536F, 21.3584F, 2.1794F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg_r1.setTextureOffset(0, 22).addBox(-5.0536F, 21.3584F, 2.1794F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg_r1.setTextureOffset(25, 23).addBox(-3.2536F, 21.3584F, 2.1794F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg_r1.setTextureOffset(57, 50).addBox(-4.7536F, 20.9584F, 4.1794F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg_r1.setTextureOffset(51, 57).addBox(-4.7536F, 21.3584F, 4.1794F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg_r1.setTextureOffset(59, 72).addBox(-4.2536F, 14.3584F, 6.6794F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_leg_r1.setTextureOffset(75, 0).addBox(-3.7536F, 20.3584F, 7.1794F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg_r1.setTextureOffset(75, 62).addBox(-3.7536F, 13.3584F, 7.1794F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-1.652F, 19.3315F, -0.8177F);
		setRotationAngle(right_leg, -2.1381F, 0.1308F, 0.0482F);
		right_leg.setTextureOffset(58, 64).addBox(-1.8729F, 0.5899F, 0.8787F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(16, 67).addBox(-2.3729F, 1.5899F, 0.3787F, 3.0F, 7.0F, 3.0F, 0.0F, true);
		right_leg.setTextureOffset(23, 44).addBox(-3.3729F, 1.5899F, -0.6213F, 5.0F, 7.0F, 5.0F, 0.0F, true);

		right_leg_r1 = new ModelRenderer(this);
		right_leg_r1.setRotationPoint(-2.6315F, 8.7251F, -14.4631F);
		right_leg.addChild(right_leg_r1);
		setRotationAngle(right_leg_r1, 1.2654F, 0.0F, 0.0F);
		right_leg_r1.setTextureOffset(0, 33).addBox(-0.7415F, 20.8405F, 0.2912F, 5.0F, 3.0F, 9.0F, 0.0F, true);
		right_leg_r1.setTextureOffset(23, 44).addBox(-0.7415F, 15.3405F, 4.2912F, 5.0F, 7.0F, 5.0F, 0.0F, true);
		right_leg_r1.setTextureOffset(0, 19).addBox(-0.5415F, 22.0405F, 0.7912F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg_r1.setTextureOffset(0, 22).addBox(3.0585F, 22.0405F, 0.7912F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg_r1.setTextureOffset(25, 23).addBox(1.2585F, 22.0405F, 0.7912F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg_r1.setTextureOffset(57, 50).addBox(-0.2415F, 21.6405F, 2.7912F, 4.0F, 1.0F, 6.0F, 0.0F, true);
		right_leg_r1.setTextureOffset(51, 57).addBox(-0.2415F, 22.0405F, 2.7912F, 4.0F, 1.0F, 6.0F, 0.0F, true);
		right_leg_r1.setTextureOffset(47, 72).addBox(0.2585F, 15.0405F, 5.2912F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg_r1.setTextureOffset(75, 0).addBox(0.7585F, 21.0405F, 5.7912F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg_r1.setTextureOffset(75, 62).addBox(0.7585F, 14.0405F, 5.7912F, 2.0F, 1.0F, 2.0F, 0.0F, true);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
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
}