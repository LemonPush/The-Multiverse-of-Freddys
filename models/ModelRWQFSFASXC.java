// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelRWQFSFASXC extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer jaw;
	private final ModelRenderer body;
	private final ModelRenderer right_arm;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer right_hand;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer left_arm;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer left_hand;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer right_leg;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer left_leg;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;

	public ModelRWQFSFASXC() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -10.0F, 0.0F);
		head.setTextureOffset(0, 11).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(40, 22).addBox(-3.0F, -4.0F, 3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(40, 20).addBox(-3.5F, -4.0F, -5.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(24, 11).addBox(-0.5F, -3.0F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(36, 7).addBox(-3.5F, -6.0F, -6.0F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(24, 13).addBox(-0.5F, -6.5F, -6.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(24, 28).addBox(4.0F, -6.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 34).addBox(3.0F, -4.0F, 1.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 34).addBox(-4.0F, -4.0F, 1.0F, 1.0F, 3.0F, 3.0F, 0.0F, true);
		head.setTextureOffset(34, 36).addBox(3.0F, -4.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(10, 36).addBox(-4.0F, -4.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(14, 26).addBox(-5.0F, -6.0F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-2.0F, -10.0235F, -0.8248F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.5236F, 0.0F, -0.1745F);
		head_r1.setTextureOffset(0, 25).addBox(-1.0F, -9.2677F, 1.6361F, 1.0F, 1.0F, 2.0F, 0.25F, false);
		head_r1.setTextureOffset(34, 27).addBox(-1.5F, -8.2677F, 1.6361F, 2.0F, 4.0F, 2.0F, 0.25F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(-2.0F, -10.0235F, -0.3248F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.1309F, 0.0F, -0.1745F);
		head_r2.setTextureOffset(0, 11).addBox(-1.5F, -4.6765F, -0.5752F, 2.0F, 5.0F, 2.0F, 0.25F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(2.0F, -10.0235F, -0.8248F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, 0.5236F, 0.0F, 0.1745F);
		head_r3.setTextureOffset(15, 25).addBox(0.0F, -9.2677F, 1.6361F, 1.0F, 1.0F, 2.0F, 0.25F, false);
		head_r3.setTextureOffset(10, 36).addBox(-0.5F, -8.2677F, 1.6361F, 2.0F, 4.0F, 2.0F, 0.25F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(2.0F, -10.0235F, -0.3248F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, 0.1309F, 0.0F, 0.1745F);
		head_r4.setTextureOffset(24, 27).addBox(-0.5F, -4.6765F, -0.5752F, 2.0F, 5.0F, 2.0F, 0.25F, false);

		jaw = new ModelRenderer(this);
		jaw.setRotationPoint(0.0F, -2.25F, 3.8F);
		head.addChild(jaw);
		setRotationAngle(jaw, 0.2618F, 0.0F, 0.0F);
		jaw.setTextureOffset(0, 0).addBox(-4.0F, 0.25F, -9.8F, 8.0F, 1.0F, 10.0F, 0.0F, false);
		jaw.setTextureOffset(34, 27).addBox(3.0F, -0.75F, -7.8F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		jaw.setTextureOffset(40, 18).addBox(-3.5F, -0.75F, -9.3F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		jaw.setTextureOffset(0, 34).addBox(-4.0F, -0.75F, -7.8F, 1.0F, 1.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(20, 38).addBox(-3.5F, -18.0F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-1.5F, -26.0F, -1.0F, 3.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(53, 33).addBox(-1.0F, -34.3F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(26, 0).addBox(-3.5F, -29.0F, -2.0F, 7.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(24, 11).addBox(-5.5F, -32.0F, -2.0F, 11.0F, 3.0F, 4.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.5F, -6.4333F, -0.373F);
		setRotationAngle(right_arm, -0.413F, 0.1451F, 0.3186F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.8794F, -0.7952F, -0.4722F);
		right_arm.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.4363F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(8, 45).addBox(0.8794F, -0.645F, -0.7109F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.8794F, 9.5795F, 1.2183F);
		right_arm.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.4363F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(16, 45).addBox(0.8794F, -4.62F, -1.2891F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setRotationPoint(-3.8823F, 19.2151F, -4.3887F);
		right_arm.addChild(right_hand);
		setRotationAngle(right_hand, -0.0873F, 1.0908F, -1.1781F);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.4971F, -5.1926F, 14.1206F);
		right_hand.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.6981F, -0.4363F, 0.5236F);
		cube_r3.setTextureOffset(0, 53).addBox(-0.3378F, 11.685F, -11.2027F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.4971F, -5.1926F, 14.1206F);
		right_hand.addChild(cube_r4);
		setRotationAngle(cube_r4, -2.597F, -0.4341F, 2.3213F);
		cube_r4.setTextureOffset(56, 14).addBox(-0.4388F, 7.9709F, 3.4189F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.4971F, -5.1926F, 14.1206F);
		right_hand.addChild(cube_r5);
		setRotationAngle(cube_r5, -1.637F, -0.4341F, 2.3213F);
		cube_r5.setTextureOffset(57, 22).addBox(-0.4388F, 11.4048F, -10.2654F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.4971F, -5.1926F, 14.1206F);
		right_hand.addChild(cube_r6);
		setRotationAngle(cube_r6, -1.6581F, 0.4363F, -0.5236F);
		cube_r6.setTextureOffset(4, 53).addBox(0.3172F, 7.39F, 3.6926F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.4971F, -5.1926F, 14.1206F);
		right_hand.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.6981F, 0.4363F, -0.5236F);
		cube_r7.setTextureOffset(24, 53).addBox(0.3172F, 11.8694F, -10.4518F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.4971F, -5.1926F, 14.1206F);
		right_hand.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.6981F, 0.0436F, 0.0F);
		cube_r8.setTextureOffset(53, 24).addBox(-0.2814F, 12.2021F, -9.7544F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.4971F, -5.1926F, 14.1206F);
		right_hand.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.6581F, 0.0436F, 0.0F);
		cube_r9.setTextureOffset(28, 53).addBox(-0.2814F, 7.0096F, 4.3651F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.4971F, -5.1926F, 14.1206F);
		right_hand.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.6981F, -0.0436F, 0.0F);
		cube_r10.setTextureOffset(50, 53).addBox(0.528F, 12.2371F, -9.7961F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.4971F, -5.1926F, 14.1206F);
		right_hand.addChild(cube_r11);
		setRotationAngle(cube_r11, -1.6581F, -0.0436F, 0.0F);
		cube_r11.setTextureOffset(54, 5).addBox(0.528F, 7.0638F, 4.3699F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.4971F, -5.1926F, 14.1206F);
		right_hand.addChild(cube_r12);
		setRotationAngle(cube_r12, -1.6581F, -0.4363F, 0.5236F);
		cube_r12.setTextureOffset(54, 53).addBox(-0.3378F, 7.8994F, 3.1108F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.4971F, -5.1926F, 14.1206F);
		right_hand.addChild(cube_r13);
		setRotationAngle(cube_r13, -1.1345F, 0.0F, 0.0F);
		cube_r13.setTextureOffset(44, 36).addBox(-0.8761F, 7.2719F, 0.1538F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.5F, -6.4333F, -0.373F);
		setRotationAngle(left_arm, -0.413F, -0.1451F, -0.3186F);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(2.8794F, -0.7952F, -0.4722F);
		left_arm.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.4363F, 0.0F, 0.0F);
		cube_r14.setTextureOffset(34, 45).addBox(-2.8794F, -0.645F, -0.7109F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(2.8794F, 9.5795F, 1.2183F);
		left_arm.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.4363F, 0.0F, 0.0F);
		cube_r15.setTextureOffset(45, 25).addBox(-2.8794F, -4.62F, -1.2891F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setRotationPoint(3.8823F, 19.2151F, -4.3887F);
		left_arm.addChild(left_hand);
		setRotationAngle(left_hand, -0.0873F, -1.0908F, 1.1781F);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.4971F, -5.1926F, 14.1206F);
		left_hand.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.6981F, 0.4363F, -0.5236F);
		cube_r16.setTextureOffset(16, 55).addBox(-0.6622F, 11.685F, -11.2027F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.4971F, -5.1926F, 14.1206F);
		left_hand.addChild(cube_r17);
		setRotationAngle(cube_r17, -2.597F, 0.4341F, -2.3213F);
		cube_r17.setTextureOffset(58, 5).addBox(-0.5612F, 7.9709F, 3.4189F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.4971F, -5.1926F, 14.1206F);
		left_hand.addChild(cube_r18);
		setRotationAngle(cube_r18, -1.637F, 0.4341F, -2.3213F);
		cube_r18.setTextureOffset(58, 38).addBox(-0.5612F, 11.4048F, -10.2654F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.4971F, -5.1926F, 14.1206F);
		left_hand.addChild(cube_r19);
		setRotationAngle(cube_r19, -1.6581F, -0.4363F, 0.5236F);
		cube_r19.setTextureOffset(32, 55).addBox(-1.3172F, 7.39F, 3.6926F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.4971F, -5.1926F, 14.1206F);
		left_hand.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.6981F, -0.4363F, 0.5236F);
		cube_r20.setTextureOffset(36, 55).addBox(-1.3172F, 11.8694F, -10.4518F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.4971F, -5.1926F, 14.1206F);
		left_hand.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.6981F, -0.0436F, 0.0F);
		cube_r21.setTextureOffset(40, 55).addBox(-0.7186F, 12.2021F, -9.7544F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.4971F, -5.1926F, 14.1206F);
		left_hand.addChild(cube_r22);
		setRotationAngle(cube_r22, -1.6581F, -0.0436F, 0.0F);
		cube_r22.setTextureOffset(44, 55).addBox(-0.7186F, 7.0096F, 4.3651F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.4971F, -5.1926F, 14.1206F);
		left_hand.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.6981F, 0.0436F, 0.0F);
		cube_r23.setTextureOffset(8, 55).addBox(-1.528F, 12.2371F, -9.7961F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.4971F, -5.1926F, 14.1206F);
		left_hand.addChild(cube_r24);
		setRotationAngle(cube_r24, -1.6581F, 0.0436F, 0.0F);
		cube_r24.setTextureOffset(12, 55).addBox(-1.528F, 7.0638F, 4.3699F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.4971F, -5.1926F, 14.1206F);
		left_hand.addChild(cube_r25);
		setRotationAngle(cube_r25, -1.6581F, 0.4363F, -0.5236F);
		cube_r25.setTextureOffset(20, 55).addBox(-0.6622F, 7.8994F, 3.1108F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.4971F, -5.1926F, 14.1206F);
		left_hand.addChild(cube_r26);
		setRotationAngle(cube_r26, -1.1345F, 0.0F, 0.0F);
		cube_r26.setTextureOffset(48, 0).addBox(-2.1239F, 7.2719F, 0.1538F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.5F, 7.6667F, 0.373F);
		right_leg.setTextureOffset(0, 25).addBox(-2.0F, 14.3333F, -5.373F, 4.0F, 2.0F, 7.0F, 0.0F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, 14.3333F, -0.373F);
		right_leg.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.4363F, 0.0F, 0.0F);
		cube_r27.setTextureOffset(0, 43).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, 0.3333F, -0.373F);
		right_leg.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.4363F, 0.0F, 0.0F);
		cube_r28.setTextureOffset(26, 43).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.5F, 7.6667F, 0.373F);
		left_leg.setTextureOffset(25, 18).addBox(-2.0F, 14.3333F, -5.373F, 4.0F, 2.0F, 7.0F, 0.0F, false);

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, 14.3333F, -0.373F);
		left_leg.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.4363F, 0.0F, 0.0F);
		cube_r29.setTextureOffset(42, 45).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, 0.3333F, -0.373F);
		left_leg.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.4363F, 0.0F, 0.0F);
		cube_r30.setTextureOffset(50, 43).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
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
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}