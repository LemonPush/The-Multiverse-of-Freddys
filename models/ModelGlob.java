// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelGlob extends EntityModel<Entity> {
	private final ModelRenderer Head_Mess;
	private final ModelRenderer Plushtrap;
	private final ModelRenderer earright;
	private final ModelRenderer lower3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer tip;
	private final ModelRenderer earleft;
	private final ModelRenderer lower4;
	private final ModelRenderer cube_r2;
	private final ModelRenderer tip2;
	private final ModelRenderer ToyBonnie;
	private final ModelRenderer head_r8;
	private final ModelRenderer head_r9;
	private final ModelRenderer ToyChica;
	private final ModelRenderer head_r10;
	private final ModelRenderer head_r11;
	private final ModelRenderer ToyFreddy;
	private final ModelRenderer head_r12;
	private final ModelRenderer head_r13;
	private final ModelRenderer Baby;
	private final ModelRenderer head_r14;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r1_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r4_r1;
	private final ModelRenderer head_r5;
	private final ModelRenderer head_r5_r1;
	private final ModelRenderer head_r6;
	private final ModelRenderer head_r6_r1;
	private final ModelRenderer head_r7;
	private final ModelRenderer Foxy;
	private final ModelRenderer head_r15;
	private final ModelRenderer head_r16;
	private final ModelRenderer head_r17;
	private final ModelRenderer head_r18;
	private final ModelRenderer Chica;
	private final ModelRenderer head_r19;
	private final ModelRenderer head_r20;
	private final ModelRenderer head_r21;
	private final ModelRenderer head_r22;
	private final ModelRenderer Bonnie;
	private final ModelRenderer head_r23;
	private final ModelRenderer Funtime;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer Nightmarionne;
	private final ModelRenderer bone3;
	private final ModelRenderer Freddy;
	private final ModelRenderer head_r24;
	private final ModelRenderer head_r25;
	private final ModelRenderer body;
	private final ModelRenderer endo_body;
	private final ModelRenderer suit;
	private final ModelRenderer lower_right_arm;
	private final ModelRenderer endo_arm4;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer suit_arm4;
	private final ModelRenderer lower_suit4;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer lower_left_arm;
	private final ModelRenderer endo_arm2;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer suit_arm2;
	private final ModelRenderer lower_suit2;
	private final ModelRenderer right_arm_r4;
	private final ModelRenderer right_arm;
	private final ModelRenderer arm;
	private final ModelRenderer endo_arm3;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer suit_arm3;
	private final ModelRenderer lower_suit3;
	private final ModelRenderer right_arm_r5;
	private final ModelRenderer tentacle;
	private final ModelRenderer right_leg_r1;
	private final ModelRenderer lower_leg2;
	private final ModelRenderer right_leg_r2;
	private final ModelRenderer tentacle2;
	private final ModelRenderer right_leg_r3;
	private final ModelRenderer lower_leg3;
	private final ModelRenderer right_leg_r4;
	private final ModelRenderer tentacle3;
	private final ModelRenderer right_leg_r5;
	private final ModelRenderer lower_leg4;
	private final ModelRenderer right_leg_r6;
	private final ModelRenderer left_arm;
	private final ModelRenderer arm2;
	private final ModelRenderer endo_arm5;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer suit_arm5;
	private final ModelRenderer lower_suit5;
	private final ModelRenderer right_arm_r6;
	private final ModelRenderer tentacle4;
	private final ModelRenderer right_leg_r7;
	private final ModelRenderer lower_leg5;
	private final ModelRenderer right_leg_r8;
	private final ModelRenderer tentacle5;
	private final ModelRenderer right_leg_r9;
	private final ModelRenderer lower_leg6;
	private final ModelRenderer right_leg_r10;
	private final ModelRenderer tentacle6;
	private final ModelRenderer right_leg_r11;
	private final ModelRenderer lower_leg7;
	private final ModelRenderer right_leg_r12;
	private final ModelRenderer left_leg;
	private final ModelRenderer suit_leg2;
	private final ModelRenderer right_leg;
	private final ModelRenderer suit_leg3;
	private final ModelRenderer left_leg2;
	private final ModelRenderer suit_leg4;
	private final ModelRenderer right_leg2;
	private final ModelRenderer suit_leg5;

	public ModelGlob() {
		textureWidth = 256;
		textureHeight = 256;

		Head_Mess = new ModelRenderer(this);
		Head_Mess.setRotationPoint(0.0F, -24.8333F, -0.1667F);
		Head_Mess.setTextureOffset(0, 0).addBox(-10.0F, -20.1667F, -10.3333F, 20.0F, 19.0F, 14.0F, 0.0F, false);
		Head_Mess.setTextureOffset(0, 54).addBox(-10.0F, -20.1667F, 3.6667F, 20.0F, 19.0F, 4.0F, 0.0F, false);
		Head_Mess.setTextureOffset(124, 144).addBox(3.0F, -1.1667F, 3.6667F, 2.0F, 19.0F, 2.0F, 0.0F, false);
		Head_Mess.setTextureOffset(93, 165).addBox(-5.0F, -1.1667F, 3.6667F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		Head_Mess.setTextureOffset(93, 165).addBox(5.0F, -1.1667F, -7.3333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		Head_Mess.setTextureOffset(93, 165).addBox(-7.0F, -4.1667F, -7.3333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		Head_Mess.setTextureOffset(124, 144).addBox(-2.0F, -1.1667F, -7.3333F, 2.0F, 19.0F, 2.0F, 0.0F, false);
		Head_Mess.setTextureOffset(50, 44).addBox(1.0F, -12.1667F, -6.3333F, 20.0F, 11.0F, 10.0F, 0.0F, false);
		Head_Mess.setTextureOffset(0, 33).addBox(-21.0F, -12.1667F, -6.3333F, 20.0F, 11.0F, 10.0F, 0.0F, false);

		Plushtrap = new ModelRenderer(this);
		Plushtrap.setRotationPoint(0.0F, 34.8333F, -4.3333F);
		Head_Mess.addChild(Plushtrap);
		Plushtrap.setTextureOffset(149, 117).addBox(-20.5F, -40.7F, -4.5F, 5.0F, 5.0F, 4.0F, 0.0F, false);
		Plushtrap.setTextureOffset(118, 43).addBox(-18.5F, -38.7F, -5.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Plushtrap.setTextureOffset(117, 37).addBox(-19.5F, -40.0F, -4.5F, 1.0F, 1.0F, 1.0F, 0.25F, false);
		Plushtrap.setTextureOffset(111, 3).addBox(-17.5F, -40.0F, -4.5F, 1.0F, 1.0F, 1.0F, 0.25F, false);
		Plushtrap.setTextureOffset(61, 103).addBox(-19.5F, -38.2F, -5.6F, 3.0F, 1.0F, 1.0F, 0.25F, false);
		Plushtrap.setTextureOffset(101, 6).addBox(-19.5F, -36.65F, -5.6F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		earright = new ModelRenderer(this);
		earright.setRotationPoint(0.0F, 9.0F, 0.0F);
		Plushtrap.addChild(earright);
		earright.setTextureOffset(87, 169).addBox(-20.5F, -51.7F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		lower3 = new ModelRenderer(this);
		lower3.setRotationPoint(-1.5F, -16.2F, -1.1F);
		earright.addChild(lower3);
		setRotationAngle(lower3, 0.7854F, 0.0F, 0.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 1.1F, 0.5F);
		lower3.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2618F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(162, 110).addBox(-19.0F, -21.7151F, 29.1044F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		tip = new ModelRenderer(this);
		tip.setRotationPoint(0.0F, -1.0F, -1.0F);
		earright.addChild(tip);
		tip.setTextureOffset(54, 111).addBox(-20.5F, -51.7F, -3.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		earleft = new ModelRenderer(this);
		earleft.setRotationPoint(0.0F, 9.0F, 0.0F);
		Plushtrap.addChild(earleft);
		earleft.setTextureOffset(158, 127).addBox(-17.5F, -51.7F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		lower4 = new ModelRenderer(this);
		lower4.setRotationPoint(1.5F, -16.2F, -1.1F);
		earleft.addChild(lower4);
		setRotationAngle(lower4, 0.7854F, 0.0F, 0.0F);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 1.1F, 0.5F);
		lower4.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.2618F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(158, 32).addBox(-19.0F, -21.7151F, 29.1044F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		tip2 = new ModelRenderer(this);
		tip2.setRotationPoint(0.0F, -1.0F, -1.0F);
		earleft.addChild(tip2);
		tip2.setTextureOffset(48, 111).addBox(-17.5F, -51.7F, -3.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		ToyBonnie = new ModelRenderer(this);
		ToyBonnie.setRotationPoint(0.0F, 22.8333F, -3.8333F);
		Head_Mess.addChild(ToyBonnie);
		ToyBonnie.setTextureOffset(0, 103).addBox(4.0F, -29.0F, -9.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		ToyBonnie.setTextureOffset(155, 45).addBox(4.5F, -21.0F, -10.8F, 7.0F, 1.0F, 3.0F, 0.0F, false);
		ToyBonnie.setTextureOffset(160, 151).addBox(4.5F, -22.0F, -10.8F, 7.0F, 1.0F, 2.0F, 0.0F, false);
		ToyBonnie.setTextureOffset(163, 53).addBox(4.5F, -25.0F, -10.8F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		ToyBonnie.setTextureOffset(82, 29).addBox(5.0F, -25.5F, -10.5F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		ToyBonnie.setTextureOffset(7, 125).addBox(7.5F, -26.5F, -10.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ToyBonnie.setTextureOffset(170, 25).addBox(11.5F, -24.0F, -9.5F, 2.0F, 2.0F, 1.0F, -0.25F, false);
		ToyBonnie.setTextureOffset(170, 22).addBox(2.5F, -24.0F, -9.5F, 2.0F, 2.0F, 1.0F, -0.25F, false);
		ToyBonnie.setTextureOffset(170, 9).addBox(5.3F, -27.5F, -9.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		ToyBonnie.setTextureOffset(170, 6).addBox(8.7F, -27.5F, -9.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		ToyBonnie.setTextureOffset(23, 119).addBox(8.7F, -28.7F, -9.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		ToyBonnie.setTextureOffset(112, 43).addBox(5.3F, -28.7F, -9.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		ToyBonnie.setTextureOffset(100, 141).addBox(2.5F, -25.0F, -9.0F, 2.0F, 4.0F, 8.0F, 0.0F, false);
		ToyBonnie.setTextureOffset(80, 140).addBox(11.5F, -25.0F, -9.0F, 2.0F, 4.0F, 8.0F, 0.0F, false);

		head_r8 = new ModelRenderer(this);
		head_r8.setRotationPoint(6.0F, -29.0235F, -5.3248F);
		ToyBonnie.addChild(head_r8);
		setRotationAngle(head_r8, 0.1309F, 0.0F, -0.1745F);
		head_r8.setTextureOffset(48, 119).addBox(-0.5F, -5.8765F, -0.1752F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r8.setTextureOffset(77, 105).addBox(-0.5F, -0.8765F, -0.1752F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r9 = new ModelRenderer(this);
		head_r9.setRotationPoint(10.0F, -29.0235F, -5.3248F);
		ToyBonnie.addChild(head_r9);
		setRotationAngle(head_r9, 0.1309F, 0.0F, 0.1745F);
		head_r9.setTextureOffset(121, 100).addBox(-0.5F, -5.8765F, -0.1752F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r9.setTextureOffset(115, 94).addBox(-1.5F, -4.6765F, -0.5752F, 3.0F, 4.0F, 2.0F, 0.25F, false);
		head_r9.setTextureOffset(111, 0).addBox(-0.5F, -0.8765F, -0.1752F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		ToyChica = new ModelRenderer(this);
		ToyChica.setRotationPoint(1.0F, 22.8333F, -3.8333F);
		Head_Mess.addChild(ToyChica);
		ToyChica.setTextureOffset(53, 105).addBox(-13.0F, -29.0F, -8.0F, 8.0F, 8.0F, 8.0F, 0.25F, false);
		ToyChica.setTextureOffset(152, 143).addBox(-12.0F, -22.0F, -11.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		ToyChica.setTextureOffset(68, 12).addBox(-11.0F, -25.0F, -10.8F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		ToyChica.setTextureOffset(32, 111).addBox(-11.0F, -24.5F, -11.8F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		ToyChica.setTextureOffset(152, 98).addBox(-12.0F, -24.5F, -11.2F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		ToyChica.setTextureOffset(0, 125).addBox(-10.0F, -25.5F, -10.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		ToyChica.setTextureOffset(0, 171).addBox(-11.8F, -27.5F, -8.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		ToyChica.setTextureOffset(132, 170).addBox(-8.3F, -27.5F, -8.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		ToyChica.setTextureOffset(170, 35).addBox(-6.1F, -24.5F, -8.7F, 2.0F, 2.0F, 1.0F, -0.25F, false);
		ToyChica.setTextureOffset(170, 32).addBox(-13.9F, -24.5F, -8.7F, 2.0F, 2.0F, 1.0F, -0.25F, false);
		ToyChica.setTextureOffset(110, 126).addBox(-8.3F, -28.8F, -8.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		ToyChica.setTextureOffset(121, 81).addBox(-11.8F, -28.8F, -8.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		ToyChica.setTextureOffset(132, 136).addBox(-13.5F, -28.5F, -8.0F, 1.0F, 7.0F, 8.0F, 0.25F, false);
		ToyChica.setTextureOffset(12, 131).addBox(-5.5F, -28.5F, -8.0F, 1.0F, 7.0F, 8.0F, 0.25F, false);

		head_r10 = new ModelRenderer(this);
		head_r10.setRotationPoint(-9.0F, -30.5F, -5.5F);
		ToyChica.addChild(head_r10);
		setRotationAngle(head_r10, -1.0036F, 1.5708F, 0.0F);
		head_r10.setTextureOffset(50, 129).addBox(-2.5F, -5.3F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		head_r11 = new ModelRenderer(this);
		head_r11.setRotationPoint(-9.0F, -30.5F, -5.5F);
		ToyChica.addChild(head_r11);
		setRotationAngle(head_r11, -0.3054F, 1.5708F, 0.0F);
		head_r11.setTextureOffset(50, 133).addBox(-2.5F, -1.8F, 1.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		ToyFreddy = new ModelRenderer(this);
		ToyFreddy.setRotationPoint(21.9F, -6.4117F, -5.1133F);
		Head_Mess.addChild(ToyFreddy);
		setRotationAngle(ToyFreddy, 0.0F, -0.5672F, 0.0F);
		ToyFreddy.setTextureOffset(85, 110).addBox(-4.0F, -2.755F, -3.12F, 8.0F, 8.0F, 8.0F, 0.5F, false);
		ToyFreddy.setTextureOffset(158, 24).addBox(-2.0F, -7.755F, -1.12F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		ToyFreddy.setTextureOffset(138, 38).addBox(-3.0F, -3.755F, -2.12F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		ToyFreddy.setTextureOffset(124, 61).addBox(-4.0F, 5.745F, -6.12F, 8.0F, 1.0F, 3.0F, 0.0F, false);
		ToyFreddy.setTextureOffset(152, 148).addBox(-4.0F, 4.745F, -6.12F, 8.0F, 1.0F, 2.0F, 0.0F, false);
		ToyFreddy.setTextureOffset(120, 16).addBox(-4.0F, 1.645F, -6.42F, 8.0F, 2.0F, 3.0F, 0.1F, false);
		ToyFreddy.setTextureOffset(165, 57).addBox(-3.0F, 0.745F, -6.12F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		ToyFreddy.setTextureOffset(132, 87).addBox(-1.0F, -0.255F, -6.12F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		ToyFreddy.setTextureOffset(114, 171).addBox(-2.9F, -1.755F, -4.12F, 2.0F, 2.0F, 1.0F, 0.1F, false);
		ToyFreddy.setTextureOffset(171, 102).addBox(-5.7F, 1.745F, -4.32F, 2.0F, 2.0F, 1.0F, -0.25F, false);
		ToyFreddy.setTextureOffset(65, 171).addBox(3.7F, 1.745F, -4.32F, 2.0F, 2.0F, 1.0F, -0.25F, false);
		ToyFreddy.setTextureOffset(171, 12).addBox(0.9F, -1.755F, -4.12F, 2.0F, 2.0F, 1.0F, 0.1F, false);
		ToyFreddy.setTextureOffset(22, 137).addBox(0.9F, -2.755F, -1.92F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		ToyFreddy.setTextureOffset(0, 109).addBox(-2.9F, -2.755F, -3.82F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		ToyFreddy.setTextureOffset(0, 109).addBox(0.9F, -2.755F, -3.82F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		ToyFreddy.setTextureOffset(41, 138).addBox(-5.5F, 1.245F, -3.62F, 1.0F, 4.0F, 9.0F, 0.0F, false);
		ToyFreddy.setTextureOffset(21, 138).addBox(4.5F, 1.245F, -3.62F, 1.0F, 4.0F, 9.0F, 0.0F, false);

		head_r12 = new ModelRenderer(this);
		head_r12.setRotationPoint(-4.5F, -2.255F, 0.88F);
		ToyFreddy.addChild(head_r12);
		setRotationAngle(head_r12, 0.0F, 0.0F, 0.6109F);
		head_r12.setTextureOffset(12, 135).addBox(-3.7F, -2.3F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head_r12.setTextureOffset(132, 90).addBox(-0.7F, -1.3F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		head_r13 = new ModelRenderer(this);
		head_r13.setRotationPoint(4.5F, -2.255F, 0.88F);
		ToyFreddy.addChild(head_r13);
		setRotationAngle(head_r13, 0.0F, 0.0F, -0.6109F);
		head_r13.setTextureOffset(139, 65).addBox(0.7F, -2.3F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head_r13.setTextureOffset(136, 21).addBox(-1.3F, -1.3F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		Baby = new ModelRenderer(this);
		Baby.setRotationPoint(12.5669F, -4.2249F, -8.3789F);
		Head_Mess.addChild(Baby);

		head_r14 = new ModelRenderer(this);
		head_r14.setRotationPoint(-0.0669F, -9.1418F, 0.0956F);
		Baby.addChild(head_r14);
		setRotationAngle(head_r14, 0.0F, -0.6109F, 0.0F);
		head_r14.setTextureOffset(65, 121).addBox(8.2364F, -4.424F, 0.75F, 3.0F, 3.0F, 4.0F, 0.0F, false);
		head_r14.setTextureOffset(54, 0).addBox(-4.0F, -4.1F, -2.35F, 4.0F, 10.0F, 1.0F, 0.25F, false);
		head_r14.setTextureOffset(38, 81).addBox(0.0F, -4.1F, -2.35F, 4.0F, 10.0F, 1.0F, 0.25F, false);
		head_r14.setTextureOffset(171, 118).addBox(3.2F, 2.8F, -3.25F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		head_r14.setTextureOffset(171, 121).addBox(-5.2F, 2.8F, -3.25F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		head_r14.setTextureOffset(126, 66).addBox(0.05F, 1.9F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r14.setTextureOffset(86, 126).addBox(-1.05F, 1.9F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r14.setTextureOffset(138, 42).addBox(-3.6F, -2.3F, -2.95F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head_r14.setTextureOffset(171, 147).addBox(-3.6F, -0.8F, -2.75F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		head_r14.setTextureOffset(42, 111).addBox(1.6F, -2.3F, -2.95F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head_r14.setTextureOffset(166, 171).addBox(1.6F, -0.8F, -2.75F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		head_r14.setTextureOffset(92, 94).addBox(-6.1F, 2.3F, -2.75F, 6.0F, 5.0F, 11.0F, 0.0F, false);
		head_r14.setTextureOffset(98, 76).addBox(0.1F, 2.3F, -2.75F, 6.0F, 5.0F, 11.0F, 0.0F, false);
		head_r14.setTextureOffset(69, 87).addBox(-6.1F, -4.8F, -2.75F, 6.0F, 7.0F, 11.0F, 0.0F, false);
		head_r14.setTextureOffset(115, 92).addBox(-6.1F, -5.3F, -2.75F, 6.0F, 1.0F, 11.0F, 0.0F, false);
		head_r14.setTextureOffset(0, 119).addBox(0.1F, -5.3F, -2.75F, 6.0F, 1.0F, 11.0F, 0.0F, false);
		head_r14.setTextureOffset(27, 93).addBox(0.1F, -4.8F, -2.75F, 6.0F, 7.0F, 11.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-18.6861F, 8.8634F, 7.8456F);
		Baby.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 1.5708F);

		head_r1_r1 = new ModelRenderer(this);
		head_r1_r1.setRotationPoint(-9.0053F, -18.6192F, -7.75F);
		head_r1.addChild(head_r1_r1);
		setRotationAngle(head_r1_r1, -0.6109F, 0.0F, 0.0F);
		head_r1_r1.setTextureOffset(160, 129).addBox(-8.9079F, 10.143F, 0.75F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(-18.6861F, 8.8634F, 7.8456F);
		Baby.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, 0.3927F);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(-17.2861F, 8.1634F, 7.8456F);
		Baby.addChild(head_r3);
		setRotationAngle(head_r3, 0.0F, 0.0F, 0.3927F);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(1.1523F, 8.1634F, 7.8456F);
		Baby.addChild(head_r4);
		setRotationAngle(head_r4, 0.0F, 0.0F, -0.3927F);

		head_r4_r1 = new ModelRenderer(this);
		head_r4_r1.setRotationPoint(2.0519F, -8.1396F, -7.75F);
		head_r4.addChild(head_r4_r1);
		setRotationAngle(head_r4_r1, 0.2618F, -0.5585F, -0.0755F);
		head_r4_r1.setTextureOffset(157, 69).addBox(8.7886F, -9.2434F, 0.75F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(2.5523F, 8.8634F, 7.8456F);
		Baby.addChild(head_r5);
		setRotationAngle(head_r5, 0.0F, 0.0F, -0.3927F);

		head_r5_r1 = new ModelRenderer(this);
		head_r5_r1.setRotationPoint(1.0263F, -9.322F, -7.75F);
		head_r5.addChild(head_r5_r1);
		setRotationAngle(head_r5_r1, 0.2618F, -0.5585F, -0.0755F);
		head_r5_r1.setTextureOffset(160, 34).addBox(12.5702F, -8.0755F, 0.75F, 3.0F, 5.0F, 4.0F, 0.0F, false);

		head_r6 = new ModelRenderer(this);
		head_r6.setRotationPoint(2.5523F, 8.8634F, 7.8456F);
		Baby.addChild(head_r6);
		setRotationAngle(head_r6, 0.0F, 0.0F, -1.5708F);

		head_r6_r1 = new ModelRenderer(this);
		head_r6_r1.setRotationPoint(9.0052F, -2.6192F, -7.75F);
		head_r6.addChild(head_r6_r1);
		setRotationAngle(head_r6_r1, 0.6109F, 0.0F, 0.0F);
		head_r6_r1.setTextureOffset(156, 103).addBox(4.9079F, 10.143F, 0.75F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		head_r7 = new ModelRenderer(this);
		head_r7.setRotationPoint(-8.1669F, 7.3582F, 2.6456F);
		Baby.addChild(head_r7);
		setRotationAngle(head_r7, 0.6109F, 0.0F, 0.0F);

		Foxy = new ModelRenderer(this);
		Foxy.setRotationPoint(-10.0224F, -25.9384F, -6.7594F);
		Head_Mess.addChild(Foxy);
		setRotationAngle(Foxy, 0.0F, 0.3054F, 0.0F);
		Foxy.setTextureOffset(112, 21).addBox(-3.9776F, -1.2283F, -1.0739F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Foxy.setTextureOffset(65, 121).addBox(-0.6776F, -2.7283F, 2.3261F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Foxy.setTextureOffset(75, 166).addBox(2.0224F, 4.2717F, -6.0739F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		Foxy.setTextureOffset(54, 12).addBox(-2.9776F, 4.2717F, -7.0739F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Foxy.setTextureOffset(63, 145).addBox(-2.9776F, 4.2717F, -6.0739F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		Foxy.setTextureOffset(100, 47).addBox(-1.9776F, 2.7717F, -6.8739F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		Foxy.setTextureOffset(136, 16).addBox(-2.9776F, 3.2717F, -7.2739F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		Foxy.setTextureOffset(161, 120).addBox(-0.9776F, 2.2717F, -6.5739F, 2.0F, 1.0F, 6.0F, 0.0F, false);
		Foxy.setTextureOffset(144, 28).addBox(-0.9776F, 1.6717F, -6.5739F, 2.0F, 1.0F, 2.0F, -0.1F, false);
		Foxy.setTextureOffset(172, 43).addBox(-2.6776F, 0.2717F, -1.5739F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Foxy.setTextureOffset(172, 17).addBox(0.7224F, 0.2717F, -1.5739F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Foxy.setTextureOffset(140, 130).addBox(0.7224F, -0.7283F, -1.5739F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Foxy.setTextureOffset(138, 93).addBox(-2.6776F, -0.7283F, -1.5739F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		head_r15 = new ModelRenderer(this);
		head_r15.setRotationPoint(0.0224F, -2.7283F, 1.4261F);
		Foxy.addChild(head_r15);
		setRotationAngle(head_r15, -0.5236F, 1.5708F, 0.0F);
		head_r15.setTextureOffset(48, 113).addBox(-2.0F, -1.3F, 3.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r15.setTextureOffset(123, 69).addBox(-2.0F, -4.8F, 2.7F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		head_r15.setTextureOffset(0, 33).addBox(-2.0F, -5.3F, 3.2F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		head_r15.setTextureOffset(119, 126).addBox(-2.0F, -5.8F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r16 = new ModelRenderer(this);
		head_r16.setRotationPoint(0.0224F, -2.7283F, 1.4261F);
		Foxy.addChild(head_r16);
		setRotationAngle(head_r16, -0.5236F, -1.5708F, 0.0F);
		head_r16.setTextureOffset(138, 87).addBox(1.0F, -4.8F, 2.7F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		head_r16.setTextureOffset(112, 128).addBox(1.0F, -5.8F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r16.setTextureOffset(100, 47).addBox(1.0F, -5.3F, 3.2F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		head_r16.setTextureOffset(48, 116).addBox(1.0F, -1.3F, 3.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r17 = new ModelRenderer(this);
		head_r17.setRotationPoint(0.5224F, -1.8283F, 2.8261F);
		Foxy.addChild(head_r17);
		setRotationAngle(head_r17, 0.0F, 0.0F, 0.2618F);
		head_r17.setTextureOffset(75, 121).addBox(-0.1F, -0.9F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		head_r18 = new ModelRenderer(this);
		head_r18.setRotationPoint(-0.4776F, -1.8283F, 2.8261F);
		Foxy.addChild(head_r18);
		setRotationAngle(head_r18, 0.0F, 0.0F, -0.2618F);
		head_r18.setTextureOffset(81, 121).addBox(-1.2F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Chica = new ModelRenderer(this);
		Chica.setRotationPoint(11.0F, -24.1199F, -6.7688F);
		Head_Mess.addChild(Chica);
		setRotationAngle(Chica, 0.0F, -0.3927F, 0.0F);
		Chica.setTextureOffset(24, 113).addBox(-4.0F, -3.0468F, -1.0645F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Chica.setTextureOffset(155, 12).addBox(-3.0F, 3.9532F, -4.0645F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		Chica.setTextureOffset(34, 77).addBox(-3.0F, 2.9532F, -4.0645F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		Chica.setTextureOffset(56, 172).addBox(-3.0F, 2.9532F, -3.0645F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Chica.setTextureOffset(71, 171).addBox(2.0F, 2.9532F, -3.0645F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		Chica.setTextureOffset(65, 94).addBox(-2.0F, 0.9532F, -3.8645F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		Chica.setTextureOffset(140, 154).addBox(-3.0F, 1.4532F, -4.2645F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		Chica.setTextureOffset(167, 87).addBox(-1.0F, 0.4532F, -3.5645F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		Chica.setTextureOffset(50, 172).addBox(-2.7F, -1.5468F, -1.5645F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Chica.setTextureOffset(172, 49).addBox(0.7F, -1.5468F, -1.5645F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Chica.setTextureOffset(146, 51).addBox(0.7F, -2.5468F, -1.5645F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Chica.setTextureOffset(143, 81).addBox(-2.7F, -2.5468F, -1.5645F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Chica.setTextureOffset(139, 61).addBox(-4.5F, -2.5468F, -1.0645F, 1.0F, 7.0F, 8.0F, 0.0F, false);
		Chica.setTextureOffset(138, 87).addBox(3.5F, -2.5468F, -1.0645F, 1.0F, 7.0F, 8.0F, 0.0F, false);

		head_r19 = new ModelRenderer(this);
		head_r19.setRotationPoint(0.0F, -4.5468F, 1.4355F);
		Chica.addChild(head_r19);
		setRotationAngle(head_r19, 0.3054F, 0.0F, 0.0F);
		head_r19.setTextureOffset(138, 38).addBox(-1.0F, -1.1F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		head_r20 = new ModelRenderer(this);
		head_r20.setRotationPoint(0.0F, -4.5468F, 1.4355F);
		Chica.addChild(head_r20);
		setRotationAngle(head_r20, 0.3054F, -1.5708F, 0.0F);
		head_r20.setTextureOffset(140, 126).addBox(0.5F, -1.8F, -2.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		head_r21 = new ModelRenderer(this);
		head_r21.setRotationPoint(0.0F, -4.5468F, 1.4355F);
		Chica.addChild(head_r21);
		setRotationAngle(head_r21, -0.3054F, -1.5708F, 0.0F);
		head_r21.setTextureOffset(143, 77).addBox(0.5F, -1.8F, 1.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		head_r22 = new ModelRenderer(this);
		head_r22.setRotationPoint(0.0F, -4.5468F, 1.4355F);
		Chica.addChild(head_r22);
		setRotationAngle(head_r22, -0.3054F, 0.0F, 0.0F);
		head_r22.setTextureOffset(70, 145).addBox(-1.0F, -2.1F, 2.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		Bonnie = new ModelRenderer(this);
		Bonnie.setRotationPoint(0.0F, 22.8333F, -3.8333F);
		Head_Mess.addChild(Bonnie);
		Bonnie.setTextureOffset(114, 37).addBox(-4.0F, -51.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Bonnie.setTextureOffset(155, 49).addBox(-3.4F, -43.0F, -6.0F, 7.0F, 1.0F, 3.0F, 0.0F, false);
		Bonnie.setTextureOffset(165, 84).addBox(-3.4F, -44.0F, -6.0F, 7.0F, 1.0F, 2.0F, 0.0F, false);
		Bonnie.setTextureOffset(155, 17).addBox(-3.5F, -46.5F, -6.8F, 7.0F, 2.0F, 3.0F, 0.0F, false);
		Bonnie.setTextureOffset(165, 76).addBox(-3.0F, -47.0F, -6.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		Bonnie.setTextureOffset(168, 143).addBox(-1.0F, -48.0F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Bonnie.setTextureOffset(83, 172).addBox(-2.7F, -49.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Bonnie.setTextureOffset(77, 172).addBox(0.7F, -49.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Bonnie.setTextureOffset(142, 143).addBox(-5.0F, -46.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		Bonnie.setTextureOffset(101, 0).addBox(4.0F, -46.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		Bonnie.setTextureOffset(29, 131).addBox(1.5F, -51.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bonnie.setTextureOffset(168, 96).addBox(0.5F, -55.5F, -0.9F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		Bonnie.setTextureOffset(22, 131).addBox(1.5F, -56.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bonnie.setTextureOffset(0, 119).addBox(-3.5F, -55.5F, -0.9F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		Bonnie.setTextureOffset(0, 131).addBox(-2.5F, -56.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Bonnie.setTextureOffset(119, 128).addBox(-2.5F, -51.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r23 = new ModelRenderer(this);
		head_r23.setRotationPoint(-2.0F, -59.0F, -0.4F);
		Bonnie.addChild(head_r23);
		setRotationAngle(head_r23, 0.3927F, 0.0F, 0.0F);
		head_r23.setTextureOffset(78, 145).addBox(-1.0F, -1.5F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head_r23.setTextureOffset(69, 87).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		head_r23.setTextureOffset(166, 3).addBox(3.0F, -1.5F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head_r23.setTextureOffset(99, 76).addBox(2.5F, -0.5F, -1.5F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Funtime = new ModelRenderer(this);
		Funtime.setRotationPoint(-22.3F, -5.0041F, -2.8131F);
		Head_Mess.addChild(Funtime);
		setRotationAngle(Funtime, 0.0F, 0.7418F, 0.0F);
		Funtime.setTextureOffset(120, 0).addBox(-4.5F, -12.9626F, -1.2202F, 9.0F, 10.0F, 6.0F, 0.5F, false);
		Funtime.setTextureOffset(22, 131).addBox(-5.5F, -3.4626F, -0.7202F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		Funtime.setTextureOffset(111, 0).addBox(-6.5F, -4.4626F, -0.7202F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		Funtime.setTextureOffset(163, 112).addBox(-7.5F, -5.4626F, -0.7202F, 3.0F, 1.0F, 5.0F, 0.0F, false);
		Funtime.setTextureOffset(50, 97).addBox(-8.5F, -6.4626F, -0.7202F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		Funtime.setTextureOffset(99, 54).addBox(-3.5F, -7.1626F, -7.9202F, 7.0F, 1.0F, 11.0F, 0.25F, false);
		Funtime.setTextureOffset(120, 0).addBox(-0.5F, -15.1626F, 0.2798F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		Funtime.setTextureOffset(121, 66).addBox(-2.0F, -8.1626F, -6.7202F, 4.0F, 1.0F, 10.0F, 0.25F, false);
		Funtime.setTextureOffset(77, 108).addBox(-0.5F, -8.9626F, -6.5202F, 1.0F, 1.0F, 1.0F, 0.25F, false);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(-8.0F, 13.8374F, 10.2798F);
		Funtime.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.7854F);
		right_arm_r1.setTextureOffset(0, 103).addBox(-22.164F, 7.5F, -22.964F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(77, 106).addBox(-21.164F, 7.5F, -23.464F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(92, 87).addBox(-17.164F, 8.0F, -22.364F, 1.0F, 2.0F, 2.0F, 0.25F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(1.0F, -4.1626F, 1.2798F);
		Funtime.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, 0.0F, 0.4363F);
		body_r1.setTextureOffset(63, 98).addBox(-4.3036F, -10.1568F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(-1.0F, -4.1626F, 1.2798F);
		Funtime.addChild(body_r2);
		setRotationAngle(body_r2, 0.0F, 0.0F, -0.4363F);
		body_r2.setTextureOffset(121, 77).addBox(3.3036F, -10.1568F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-8.0F, 13.8374F, 10.2798F);
		Funtime.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.0F);
		right_arm_r2.setTextureOffset(111, 6).addBox(9.25F, 11.2F, -26.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		right_arm_r2.setTextureOffset(111, 6).addBox(4.75F, 11.2F, -26.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		right_arm_r2.setTextureOffset(111, 37).addBox(4.75F, 11.2F, -24.9F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		right_arm_r2.setTextureOffset(115, 100).addBox(9.25F, 11.2F, -24.9F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		right_arm_r2.setTextureOffset(149, 57).addBox(5.0F, 7.0F, -20.5F, 6.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm_r2.setTextureOffset(121, 77).addBox(4.0F, 7.0F, -26.5F, 8.0F, 4.0F, 6.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(0.0F, 3.9374F, 1.1464F);
		Funtime.addChild(body_r3);
		setRotationAngle(body_r3, 0.0436F, 0.0F, 0.0F);
		body_r3.setTextureOffset(138, 31).addBox(-3.5F, -7.7914F, -8.6741F, 7.0F, 1.0F, 6.0F, 0.25F, false);

		Nightmarionne = new ModelRenderer(this);
		Nightmarionne.setRotationPoint(-10.6F, -3.2917F, -6.4333F);
		Head_Mess.addChild(Nightmarionne);
		setRotationAngle(Nightmarionne, 0.0F, 0.5236F, 0.0F);
		Nightmarionne.setTextureOffset(88, 126).addBox(-5.0F, -16.875F, -4.0F, 10.0F, 12.0F, 2.0F, 0.0F, false);
		Nightmarionne.setTextureOffset(102, 66).addBox(-5.5F, -4.875F, -4.0F, 11.0F, 1.0F, 2.0F, 0.0F, false);
		Nightmarionne.setTextureOffset(166, 157).addBox(-6.0F, -15.875F, -4.0F, 1.0F, 11.0F, 2.0F, 0.0F, false);
		Nightmarionne.setTextureOffset(101, 165).addBox(5.0F, -15.875F, -4.0F, 1.0F, 11.0F, 2.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(8.0F, 23.125F, 0.0F);
		Nightmarionne.addChild(bone3);
		bone3.setTextureOffset(144, 0).addBox(-13.0F, -32.5F, -5.0F, 10.0F, 5.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(150, 6).addBox(-12.5F, -39.5F, -5.0F, 9.0F, 5.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(156, 154).addBox(-12.5F, -34.5F, -5.0F, 9.0F, 2.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(52, 137).addBox(-4.0F, -33.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone3.setTextureOffset(29, 133).addBox(-13.0F, -33.5F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Freddy = new ModelRenderer(this);
		Freddy.setRotationPoint(0.0F, 6.8333F, -12.6333F);
		Head_Mess.addChild(Freddy);
		Freddy.setTextureOffset(117, 110).addBox(-4.0F, -23.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Freddy.setTextureOffset(162, 136).addBox(-2.0F, -27.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		Freddy.setTextureOffset(140, 126).addBox(-3.0F, -24.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		Freddy.setTextureOffset(149, 65).addBox(-4.0F, -15.0F, -6.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
		Freddy.setTextureOffset(156, 93).addBox(-4.0F, -16.0F, -6.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
		Freddy.setTextureOffset(148, 88).addBox(-4.0F, -18.5F, -6.8F, 8.0F, 2.0F, 3.0F, 0.0F, false);
		Freddy.setTextureOffset(165, 80).addBox(-3.0F, -19.0F, -6.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		Freddy.setTextureOffset(169, 68).addBox(-1.0F, -20.0F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Freddy.setTextureOffset(172, 127).addBox(-2.7F, -21.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Freddy.setTextureOffset(107, 172).addBox(0.7F, -21.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Freddy.setTextureOffset(50, 151).addBox(0.7F, -22.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Freddy.setTextureOffset(148, 93).addBox(-2.7F, -22.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Freddy.setTextureOffset(53, 145).addBox(-5.0F, -18.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		Freddy.setTextureOffset(145, 45).addBox(4.0F, -18.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);

		head_r24 = new ModelRenderer(this);
		head_r24.setRotationPoint(-4.5F, -22.5F, 0.0F);
		Freddy.addChild(head_r24);
		setRotationAngle(head_r24, 0.0F, 0.0F, 0.6109F);
		head_r24.setTextureOffset(145, 56).addBox(-3.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head_r24.setTextureOffset(0, 133).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r25 = new ModelRenderer(this);
		head_r25.setRotationPoint(4.5F, -22.5F, 0.0F);
		Freddy.addChild(head_r25);
		setRotationAngle(head_r25, 0.0F, 0.0F, -0.6109F);
		head_r25.setTextureOffset(150, 12).addBox(0.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head_r25.setTextureOffset(22, 133).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);

		endo_body = new ModelRenderer(this);
		endo_body.setRotationPoint(0.0F, -24.0F, 0.0F);
		body.addChild(endo_body);
		endo_body.setTextureOffset(166, 0).addBox(-4.5F, -17.0F, 1.5F, 9.0F, 3.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(148, 172).addBox(-4.5F, -17.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(0, 80).addBox(-1.5F, -15.0F, -2.5F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(172, 130).addBox(1.5F, -17.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(92, 90).addBox(4.5F, -17.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		endo_body.setTextureOffset(46, 93).addBox(-4.5F, -14.0F, -2.5F, 9.0F, 0.0F, 4.0F, 0.0F, false);
		endo_body.setTextureOffset(93, 70).addBox(-6.0F, -17.0F, -3.5F, 12.0F, 0.0F, 6.0F, 0.0F, false);
		endo_body.setTextureOffset(94, 43).addBox(2.0F, -21.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		endo_body.setTextureOffset(2, 33).addBox(5.0F, -21.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		endo_body.setTextureOffset(42, 54).addBox(-6.0F, -21.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		endo_body.setTextureOffset(0, 33).addBox(-3.0F, -21.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		endo_body.setTextureOffset(75, 43).addBox(-2.0F, -21.0F, -3.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
		endo_body.setTextureOffset(71, 65).addBox(-2.0F, -21.0F, 1.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
		endo_body.setTextureOffset(0, 35).addBox(-4.5F, -17.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		endo_body.setTextureOffset(128, 68).addBox(2.0F, -21.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(24, 107).addBox(5.0F, -21.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(36, 79).addBox(-2.0F, -21.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(77, 70).addBox(-2.0F, -18.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(79, 12).addBox(3.0F, -18.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(24, 103).addBox(-6.0F, -21.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(67, 12).addBox(-5.0F, -18.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(89, 105).addBox(-3.0F, -21.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(136, 24).addBox(-6.0F, -21.0F, 2.5F, 12.0F, 4.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(100, 93).addBox(6.0F, -21.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		endo_body.setTextureOffset(68, 39).addBox(6.0F, -21.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		endo_body.setTextureOffset(64, 61).addBox(6.0F, -18.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		endo_body.setTextureOffset(36, 98).addBox(6.0F, -21.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		endo_body.setTextureOffset(8, 38).addBox(-6.0F, -21.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		endo_body.setTextureOffset(0, 38).addBox(-6.0F, -21.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		endo_body.setTextureOffset(48, 59).addBox(-6.0F, -21.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		endo_body.setTextureOffset(60, 39).addBox(-6.0F, -18.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		endo_body.setTextureOffset(141, 110).addBox(-4.5F, -9.0F, -2.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
		endo_body.setTextureOffset(107, 169).addBox(-1.0F, -21.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		endo_body.setTextureOffset(24, 151).addBox(-2.0F, -26.0F, -2.5F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		endo_body.setTextureOffset(36, 151).addBox(-1.0F, -20.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		endo_body.setTextureOffset(0, 99).addBox(-8.0F, -20.0F, -1.5F, 16.0F, 2.0F, 2.0F, 0.0F, false);
		endo_body.setTextureOffset(7, 131).addBox(9.0F, -20.0F, -1.5F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		endo_body.setTextureOffset(102, 43).addBox(-13.0F, -20.0F, -1.5F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		endo_body.setTextureOffset(168, 62).addBox(-11.0F, -20.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		endo_body.setTextureOffset(38, 168).addBox(8.0F, -20.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		suit = new ModelRenderer(this);
		suit.setRotationPoint(-103.0F, 0.0F, 0.0F);
		body.addChild(suit);
		suit.setTextureOffset(92, 92).addBox(95.0F, -41.0F, -5.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(0, 77).addBox(95.0F, -42.0F, -6.0F, 16.0F, 1.0F, 2.0F, 0.0F, false);
		suit.setTextureOffset(126, 104).addBox(96.0F, -42.0F, 4.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(82, 12).addBox(94.0F, -40.0F, -5.0F, 18.0F, 16.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(0, 153).addBox(100.8F, -25.0F, -3.8F, 2.0F, 16.0F, 2.0F, 0.0F, false);
		suit.setTextureOffset(0, 153).addBox(111.0F, -22.0F, -6.0F, 2.0F, 16.0F, 2.0F, 0.0F, false);
		suit.setTextureOffset(0, 153).addBox(105.9F, -23.6F, -1.0F, 2.0F, 16.0F, 2.0F, 0.0F, false);
		suit.setTextureOffset(0, 153).addBox(96.0F, -25.0F, -1.0F, 2.0F, 16.0F, 2.0F, 0.0F, false);
		suit.setTextureOffset(56, 121).addBox(111.0F, -41.0F, -4.0F, 1.0F, 17.0F, 7.0F, 0.0F, false);
		suit.setTextureOffset(72, 121).addBox(94.0F, -41.0F, -4.0F, 1.0F, 17.0F, 7.0F, 0.0F, false);
		suit.setTextureOffset(0, 81).addBox(94.0F, -41.0F, 3.0F, 18.0F, 17.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(64, 66).addBox(94.0F, -45.0F, 4.0F, 18.0F, 3.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(54, 0).addBox(94.0F, -46.0F, -6.0F, 18.0F, 1.0F, 11.0F, 0.0F, false);
		suit.setTextureOffset(0, 54).addBox(94.0F, -45.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(44, 54).addBox(111.0F, -45.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(76, 93).addBox(94.0F, -45.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(50, 97).addBox(111.0F, -45.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(50, 39).addBox(94.0F, -45.0F, -6.0F, 18.0F, 3.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(167, 165).addBox(111.0F, -24.0F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		suit.setTextureOffset(167, 105).addBox(94.0F, -24.0F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		lower_right_arm = new ModelRenderer(this);
		lower_right_arm.setRotationPoint(-9.0F, -31.0F, -3.0F);
		body.addChild(lower_right_arm);
		setRotationAngle(lower_right_arm, 0.0F, 0.829F, 0.0F);

		endo_arm4 = new ModelRenderer(this);
		endo_arm4.setRotationPoint(-2.0F, 9.0F, 0.0F);
		lower_right_arm.addChild(endo_arm4);
		setRotationAngle(endo_arm4, 0.0F, 0.0F, 0.3927F);
		endo_arm4.setTextureOffset(26, 163).addBox(-6.9442F, -9.5149F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		endo_arm4.setTextureOffset(156, 41).addBox(-5.9442F, -9.1649F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm4.setTextureOffset(152, 28).addBox(-5.9442F, -7.3649F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm4.setTextureOffset(46, 151).addBox(-5.9442F, -5.6649F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm4.setTextureOffset(146, 48).addBox(-5.9442F, -3.8649F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm4.setTextureOffset(146, 45).addBox(-5.9442F, -3.8649F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm4.setTextureOffset(52, 143).addBox(-5.9442F, -5.6649F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm4.setTextureOffset(140, 133).addBox(-5.9442F, -7.3649F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm4.setTextureOffset(81, 124).addBox(-5.9442F, -9.1649F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm4.setTextureOffset(124, 53).addBox(-6.9442F, -9.5149F, -2.9F, 3.0F, 7.0F, 0.0F, 0.0F, false);
		endo_arm4.setTextureOffset(56, 121).addBox(-6.9442F, -9.5149F, 1.9F, 3.0F, 7.0F, 0.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.0F, 8.3F, 0.5F);
		endo_arm4.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.1345F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(85, 113).addBox(-4.4442F, 3.036F, -9.7359F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r3.setTextureOffset(92, 140).addBox(-5.4442F, 4.936F, -10.7359F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r3.setTextureOffset(120, 166).addBox(-4.9442F, -1.964F, -10.2859F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0F, 6.3F, -0.5F);
		endo_arm4.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.48F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(101, 0).addBox(-4.4442F, -8.5754F, -4.9394F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		suit_arm4 = new ModelRenderer(this);
		suit_arm4.setRotationPoint(54.0F, 9.0F, 0.0F);
		lower_right_arm.addChild(suit_arm4);
		setRotationAngle(suit_arm4, 0.0F, 0.0F, 0.3927F);
		suit_arm4.setTextureOffset(71, 147).addBox(-60.6814F, 11.9154F, -3.0F, 1.0F, 11.0F, 5.0F, 0.0F, false);
		suit_arm4.setTextureOffset(124, 53).addBox(-60.6814F, 10.9154F, -4.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);
		suit_arm4.setTextureOffset(149, 76).addBox(-60.6814F, 11.9154F, 2.0F, 7.0F, 11.0F, 1.0F, 0.0F, false);
		suit_arm4.setTextureOffset(12, 146).addBox(-54.6814F, 11.9154F, -3.0F, 1.0F, 11.0F, 5.0F, 0.0F, false);
		suit_arm4.setTextureOffset(109, 110).addBox(-60.6814F, 11.9154F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);

		lower_suit4 = new ModelRenderer(this);
		lower_suit4.setRotationPoint(-2.0F, 6.8F, 0.3F);
		suit_arm4.addChild(lower_suit4);
		setRotationAngle(lower_suit4, -1.1345F, 0.0F, 0.0F);
		lower_suit4.setTextureOffset(66, 163).addBox(-58.1814F, 7.5428F, 9.0865F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		lower_suit4.setTextureOffset(64, 70).addBox(-58.1814F, 5.5428F, 14.0865F, 6.0F, 9.0F, 1.0F, 0.0F, false);
		lower_suit4.setTextureOffset(8, 162).addBox(-58.1814F, 5.5428F, 10.0865F, 1.0F, 9.0F, 4.0F, 0.0F, false);
		lower_suit4.setTextureOffset(142, 133).addBox(-57.6814F, 13.5428F, 9.5865F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		lower_suit4.setTextureOffset(148, 159).addBox(-53.1814F, 5.5428F, 10.0865F, 1.0F, 9.0F, 4.0F, 0.0F, false);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(-50.2373F, 24.0568F, 18.1224F);
		lower_suit4.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, 1.1208F, 0.3899F, -0.0722F);
		right_arm_r3.setTextureOffset(115, 153).addBox(-5.0785F, -11.2979F, 10.522F, 2.0F, 14.0F, 2.0F, 0.0F, false);
		right_arm_r3.setTextureOffset(50, 156).addBox(-2.3785F, -11.6979F, 7.822F, 2.0F, 14.0F, 2.0F, 0.0F, false);
		right_arm_r3.setTextureOffset(58, 156).addBox(-3.5785F, -10.9979F, 0.922F, 2.0F, 14.0F, 2.0F, 0.0F, false);
		right_arm_r3.setTextureOffset(158, 157).addBox(-4.0785F, -10.1979F, 5.522F, 2.0F, 14.0F, 2.0F, 0.0F, false);
		right_arm_r3.setTextureOffset(140, 159).addBox(-1.4785F, -8.9979F, 3.522F, 2.0F, 14.0F, 2.0F, 0.0F, false);

		lower_left_arm = new ModelRenderer(this);
		lower_left_arm.setRotationPoint(9.0F, -31.0F, -3.0F);
		body.addChild(lower_left_arm);
		setRotationAngle(lower_left_arm, 0.0F, -0.829F, 0.0F);

		endo_arm2 = new ModelRenderer(this);
		endo_arm2.setRotationPoint(2.0F, 9.0F, 0.0F);
		lower_left_arm.addChild(endo_arm2);
		setRotationAngle(endo_arm2, 0.0F, 0.0F, -0.3927F);
		endo_arm2.setTextureOffset(26, 163).addBox(3.9442F, -9.5149F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, true);
		endo_arm2.setTextureOffset(156, 41).addBox(4.9442F, -9.1649F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm2.setTextureOffset(152, 28).addBox(4.9442F, -7.3649F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm2.setTextureOffset(46, 151).addBox(4.9442F, -5.6649F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm2.setTextureOffset(146, 48).addBox(4.9442F, -3.8649F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm2.setTextureOffset(146, 45).addBox(4.9442F, -3.8649F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm2.setTextureOffset(52, 143).addBox(4.9442F, -5.6649F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm2.setTextureOffset(140, 133).addBox(4.9442F, -7.3649F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm2.setTextureOffset(81, 124).addBox(4.9442F, -9.1649F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm2.setTextureOffset(124, 53).addBox(3.9442F, -9.5149F, -2.9F, 3.0F, 7.0F, 0.0F, 0.0F, true);
		endo_arm2.setTextureOffset(56, 121).addBox(3.9442F, -9.5149F, 1.9F, 3.0F, 7.0F, 0.0F, 0.0F, true);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.0F, 8.3F, 0.5F);
		endo_arm2.addChild(cube_r5);
		setRotationAngle(cube_r5, -1.1345F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(85, 113).addBox(2.4442F, 3.036F, -9.7359F, 2.0F, 3.0F, 2.0F, 0.0F, true);
		cube_r5.setTextureOffset(92, 140).addBox(1.4442F, 4.936F, -10.7359F, 4.0F, 4.0F, 4.0F, 0.0F, true);
		cube_r5.setTextureOffset(120, 166).addBox(1.9442F, -1.964F, -10.2859F, 3.0F, 5.0F, 3.0F, 0.0F, true);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(2.0F, 6.3F, -0.5F);
		endo_arm2.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.48F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(101, 0).addBox(2.4442F, -8.5754F, -4.9394F, 2.0F, 4.0F, 2.0F, 0.0F, true);

		suit_arm2 = new ModelRenderer(this);
		suit_arm2.setRotationPoint(-54.0F, 9.0F, 0.0F);
		lower_left_arm.addChild(suit_arm2);
		setRotationAngle(suit_arm2, 0.0F, 0.0F, -0.3927F);
		suit_arm2.setTextureOffset(71, 147).addBox(59.6814F, 11.9154F, -3.0F, 1.0F, 11.0F, 5.0F, 0.0F, true);
		suit_arm2.setTextureOffset(124, 53).addBox(53.6814F, 10.9154F, -4.0F, 7.0F, 1.0F, 7.0F, 0.0F, true);
		suit_arm2.setTextureOffset(149, 76).addBox(53.6814F, 11.9154F, 2.0F, 7.0F, 11.0F, 1.0F, 0.0F, true);
		suit_arm2.setTextureOffset(12, 146).addBox(53.6814F, 11.9154F, -3.0F, 1.0F, 11.0F, 5.0F, 0.0F, true);
		suit_arm2.setTextureOffset(109, 110).addBox(53.6814F, 11.9154F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, true);

		lower_suit2 = new ModelRenderer(this);
		lower_suit2.setRotationPoint(2.0F, 6.8F, 0.3F);
		suit_arm2.addChild(lower_suit2);
		setRotationAngle(lower_suit2, -1.1345F, 0.0F, 0.0F);
		lower_suit2.setTextureOffset(66, 163).addBox(52.1814F, 7.5428F, 9.0865F, 6.0F, 7.0F, 1.0F, 0.0F, true);
		lower_suit2.setTextureOffset(64, 70).addBox(52.1814F, 5.5428F, 14.0865F, 6.0F, 9.0F, 1.0F, 0.0F, true);
		lower_suit2.setTextureOffset(8, 162).addBox(57.1814F, 5.5428F, 10.0865F, 1.0F, 9.0F, 4.0F, 0.0F, true);
		lower_suit2.setTextureOffset(142, 133).addBox(52.6814F, 13.5428F, 9.5865F, 5.0F, 5.0F, 5.0F, 0.0F, true);
		lower_suit2.setTextureOffset(148, 159).addBox(52.1814F, 5.5428F, 10.0865F, 1.0F, 9.0F, 4.0F, 0.0F, true);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(50.2373F, 24.0568F, 18.1224F);
		lower_suit2.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, 1.1208F, -0.3899F, 0.0722F);
		right_arm_r4.setTextureOffset(115, 153).addBox(3.0785F, -11.2979F, 10.522F, 2.0F, 14.0F, 2.0F, 0.0F, true);
		right_arm_r4.setTextureOffset(50, 156).addBox(0.3785F, -11.6979F, 7.822F, 2.0F, 14.0F, 2.0F, 0.0F, true);
		right_arm_r4.setTextureOffset(58, 156).addBox(1.5785F, -10.9979F, 0.922F, 2.0F, 14.0F, 2.0F, 0.0F, true);
		right_arm_r4.setTextureOffset(158, 157).addBox(2.0785F, -10.1979F, 5.522F, 2.0F, 14.0F, 2.0F, 0.0F, true);
		right_arm_r4.setTextureOffset(140, 159).addBox(-0.5215F, -8.9979F, 3.522F, 2.0F, 14.0F, 2.0F, 0.0F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-10.0F, -18.0F, 0.0F);

		arm = new ModelRenderer(this);
		arm.setRotationPoint(0.0F, 8.0F, -5.0F);
		right_arm.addChild(arm);
		setRotationAngle(arm, -0.5236F, 0.0F, 0.0F);

		endo_arm3 = new ModelRenderer(this);
		endo_arm3.setRotationPoint(-1.0F, 0.0F, 0.0F);
		arm.addChild(endo_arm3);
		setRotationAngle(endo_arm3, 0.0F, 0.0F, 0.3927F);
		endo_arm3.setTextureOffset(26, 163).addBox(-6.9442F, -9.5149F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		endo_arm3.setTextureOffset(156, 41).addBox(-5.9442F, -9.1649F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm3.setTextureOffset(152, 28).addBox(-5.9442F, -7.3649F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm3.setTextureOffset(46, 151).addBox(-5.9442F, -5.6649F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm3.setTextureOffset(146, 48).addBox(-5.9442F, -3.8649F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm3.setTextureOffset(146, 45).addBox(-5.9442F, -3.8649F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm3.setTextureOffset(52, 143).addBox(-5.9442F, -5.6649F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm3.setTextureOffset(140, 133).addBox(-5.9442F, -7.3649F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm3.setTextureOffset(81, 124).addBox(-5.9442F, -9.1649F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm3.setTextureOffset(124, 53).addBox(-6.9442F, -9.5149F, -2.9F, 3.0F, 7.0F, 0.0F, 0.0F, false);
		endo_arm3.setTextureOffset(56, 121).addBox(-6.9442F, -9.5149F, 1.9F, 3.0F, 7.0F, 0.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.0F, 8.3F, 0.5F);
		endo_arm3.addChild(cube_r7);
		setRotationAngle(cube_r7, -1.1345F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(85, 113).addBox(-4.4442F, 3.036F, -9.7359F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r7.setTextureOffset(92, 140).addBox(-5.4442F, 4.936F, -10.7359F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r7.setTextureOffset(120, 166).addBox(-4.9442F, -1.964F, -10.2859F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.0F, 6.3F, -0.5F);
		endo_arm3.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.48F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(101, 0).addBox(-4.4442F, -8.5754F, -4.9394F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		suit_arm3 = new ModelRenderer(this);
		suit_arm3.setRotationPoint(55.0F, 0.0F, 0.0F);
		arm.addChild(suit_arm3);
		setRotationAngle(suit_arm3, 0.0F, 0.0F, 0.3927F);
		suit_arm3.setTextureOffset(71, 147).addBox(-60.6814F, 11.9154F, -3.0F, 1.0F, 11.0F, 5.0F, 0.0F, false);
		suit_arm3.setTextureOffset(124, 53).addBox(-60.6814F, 10.9154F, -4.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);
		suit_arm3.setTextureOffset(149, 76).addBox(-60.6814F, 11.9154F, 2.0F, 7.0F, 11.0F, 1.0F, 0.0F, false);
		suit_arm3.setTextureOffset(12, 146).addBox(-54.6814F, 11.9154F, -3.0F, 1.0F, 11.0F, 5.0F, 0.0F, false);
		suit_arm3.setTextureOffset(109, 110).addBox(-60.6814F, 11.9154F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);

		lower_suit3 = new ModelRenderer(this);
		lower_suit3.setRotationPoint(-2.0F, 6.8F, 0.3F);
		suit_arm3.addChild(lower_suit3);
		setRotationAngle(lower_suit3, -1.1345F, 0.0F, 0.0F);
		lower_suit3.setTextureOffset(93, 153).addBox(-58.1814F, 7.5428F, 9.0865F, 6.0F, 11.0F, 1.0F, 0.0F, false);
		lower_suit3.setTextureOffset(0, 0).addBox(-58.1814F, 5.5428F, 14.0865F, 6.0F, 13.0F, 1.0F, 0.0F, false);
		lower_suit3.setTextureOffset(83, 152).addBox(-58.1814F, 5.5428F, 10.0865F, 1.0F, 13.0F, 4.0F, 0.0F, false);
		lower_suit3.setTextureOffset(40, 151).addBox(-53.1814F, 5.5428F, 10.0865F, 1.0F, 13.0F, 4.0F, 0.0F, false);

		right_arm_r5 = new ModelRenderer(this);
		right_arm_r5.setRotationPoint(-53.6911F, 33.9217F, 13.7421F);
		lower_suit3.addChild(right_arm_r5);
		setRotationAngle(right_arm_r5, 0.6183F, 0.2415F, -0.0098F);
		right_arm_r5.setTextureOffset(69, 71).addBox(-4.6582F, -16.8778F, 3.1804F, 10.0F, 6.0F, 10.0F, 0.0F, false);

		tentacle = new ModelRenderer(this);
		tentacle.setRotationPoint(-41.0F, 0.2F, 4.8F);
		lower_suit3.addChild(tentacle);

		right_leg_r1 = new ModelRenderer(this);
		right_leg_r1.setRotationPoint(-12.6911F, 33.7217F, 8.9421F);
		tentacle.addChild(right_leg_r1);
		setRotationAngle(right_leg_r1, 0.6146F, 0.3186F, -0.2001F);
		right_leg_r1.setTextureOffset(107, 153).addBox(5.4203F, -13.9579F, 4.7445F, 2.0F, 14.0F, 2.0F, 0.0F, false);

		lower_leg2 = new ModelRenderer(this);
		lower_leg2.setRotationPoint(-4.0F, 15.0F, 0.8F);
		tentacle.addChild(lower_leg2);

		right_leg_r2 = new ModelRenderer(this);
		right_leg_r2.setRotationPoint(-8.6911F, 18.7217F, 8.1421F);
		lower_leg2.addChild(right_leg_r2);
		setRotationAngle(right_leg_r2, 1.3563F, 0.3186F, -0.2001F);
		right_leg_r2.setTextureOffset(132, 151).addBox(5.4203F, 3.2702F, 3.5391F, 2.0F, 17.0F, 2.0F, 0.0F, false);

		tentacle2 = new ModelRenderer(this);
		tentacle2.setRotationPoint(-48.0F, 0.2F, 4.8F);
		lower_suit3.addChild(tentacle2);

		right_leg_r3 = new ModelRenderer(this);
		right_leg_r3.setRotationPoint(-5.6911F, 33.7217F, 8.9421F);
		tentacle2.addChild(right_leg_r3);
		setRotationAngle(right_leg_r3, 0.6146F, 0.3186F, -0.2001F);
		right_leg_r3.setTextureOffset(107, 153).addBox(-1.5797F, -13.9579F, 4.7445F, 2.0F, 14.0F, 2.0F, 0.0F, false);

		lower_leg3 = new ModelRenderer(this);
		lower_leg3.setRotationPoint(-4.0F, 15.0F, 0.8F);
		tentacle2.addChild(lower_leg3);

		right_leg_r4 = new ModelRenderer(this);
		right_leg_r4.setRotationPoint(-1.6911F, 18.7217F, 8.1421F);
		lower_leg3.addChild(right_leg_r4);
		setRotationAngle(right_leg_r4, 1.3563F, 0.3186F, -0.2001F);
		right_leg_r4.setTextureOffset(132, 151).addBox(-1.5797F, 3.2702F, 3.5391F, 2.0F, 17.0F, 2.0F, 0.0F, false);

		tentacle3 = new ModelRenderer(this);
		tentacle3.setRotationPoint(-45.0F, 0.2F, 9.8F);
		lower_suit3.addChild(tentacle3);

		right_leg_r5 = new ModelRenderer(this);
		right_leg_r5.setRotationPoint(-8.6911F, 33.7217F, 3.9421F);
		tentacle3.addChild(right_leg_r5);
		setRotationAngle(right_leg_r5, 0.6146F, 0.3186F, -0.2001F);
		right_leg_r5.setTextureOffset(18, 162).addBox(1.4203F, -14.071F, 9.276F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		lower_leg4 = new ModelRenderer(this);
		lower_leg4.setRotationPoint(-4.0F, 15.0F, 0.8F);
		tentacle3.addChild(lower_leg4);

		right_leg_r6 = new ModelRenderer(this);
		right_leg_r6.setRotationPoint(-4.6911F, 18.7217F, 3.1421F);
		lower_leg4.addChild(right_leg_r6);
		setRotationAngle(right_leg_r6, 1.3563F, 0.3186F, -0.2001F);
		right_leg_r6.setTextureOffset(132, 151).addBox(1.4203F, 4.7738F, 8.3077F, 2.0F, 17.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(10.0F, -18.0F, 0.0F);

		arm2 = new ModelRenderer(this);
		arm2.setRotationPoint(0.0F, 8.0F, -5.0F);
		left_arm.addChild(arm2);
		setRotationAngle(arm2, -0.5236F, 0.0F, 0.0F);

		endo_arm5 = new ModelRenderer(this);
		endo_arm5.setRotationPoint(1.0F, 0.0F, 0.0F);
		arm2.addChild(endo_arm5);
		setRotationAngle(endo_arm5, 0.0F, 0.0F, -0.3927F);
		endo_arm5.setTextureOffset(26, 163).addBox(3.9442F, -9.5149F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, true);
		endo_arm5.setTextureOffset(156, 41).addBox(4.9442F, -9.1649F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm5.setTextureOffset(152, 28).addBox(4.9442F, -7.3649F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm5.setTextureOffset(46, 151).addBox(4.9442F, -5.6649F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm5.setTextureOffset(146, 48).addBox(4.9442F, -3.8649F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm5.setTextureOffset(146, 45).addBox(4.9442F, -3.8649F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm5.setTextureOffset(52, 143).addBox(4.9442F, -5.6649F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm5.setTextureOffset(140, 133).addBox(4.9442F, -7.3649F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm5.setTextureOffset(81, 124).addBox(4.9442F, -9.1649F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm5.setTextureOffset(124, 53).addBox(3.9442F, -9.5149F, -2.9F, 3.0F, 7.0F, 0.0F, 0.0F, true);
		endo_arm5.setTextureOffset(56, 121).addBox(3.9442F, -9.5149F, 1.9F, 3.0F, 7.0F, 0.0F, 0.0F, true);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(2.0F, 8.3F, 0.5F);
		endo_arm5.addChild(cube_r9);
		setRotationAngle(cube_r9, -1.1345F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(85, 113).addBox(2.4442F, 3.036F, -9.7359F, 2.0F, 3.0F, 2.0F, 0.0F, true);
		cube_r9.setTextureOffset(92, 140).addBox(1.4442F, 4.936F, -10.7359F, 4.0F, 4.0F, 4.0F, 0.0F, true);
		cube_r9.setTextureOffset(120, 166).addBox(1.9442F, -1.964F, -10.2859F, 3.0F, 5.0F, 3.0F, 0.0F, true);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(2.0F, 6.3F, -0.5F);
		endo_arm5.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.48F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(101, 0).addBox(2.4442F, -8.5754F, -4.9394F, 2.0F, 4.0F, 2.0F, 0.0F, true);

		suit_arm5 = new ModelRenderer(this);
		suit_arm5.setRotationPoint(-55.0F, 0.0F, 0.0F);
		arm2.addChild(suit_arm5);
		setRotationAngle(suit_arm5, 0.0F, 0.0F, -0.3927F);
		suit_arm5.setTextureOffset(71, 147).addBox(59.6814F, 11.9154F, -3.0F, 1.0F, 11.0F, 5.0F, 0.0F, true);
		suit_arm5.setTextureOffset(124, 53).addBox(53.6814F, 10.9154F, -4.0F, 7.0F, 1.0F, 7.0F, 0.0F, true);
		suit_arm5.setTextureOffset(149, 76).addBox(53.6814F, 11.9154F, 2.0F, 7.0F, 11.0F, 1.0F, 0.0F, true);
		suit_arm5.setTextureOffset(12, 146).addBox(53.6814F, 11.9154F, -3.0F, 1.0F, 11.0F, 5.0F, 0.0F, true);
		suit_arm5.setTextureOffset(109, 110).addBox(53.6814F, 11.9154F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, true);

		lower_suit5 = new ModelRenderer(this);
		lower_suit5.setRotationPoint(2.0F, 6.8F, 0.3F);
		suit_arm5.addChild(lower_suit5);
		setRotationAngle(lower_suit5, -1.1345F, 0.0F, 0.0F);
		lower_suit5.setTextureOffset(93, 153).addBox(52.1814F, 7.5428F, 9.0865F, 6.0F, 11.0F, 1.0F, 0.0F, true);
		lower_suit5.setTextureOffset(0, 0).addBox(52.1814F, 5.5428F, 14.0865F, 6.0F, 13.0F, 1.0F, 0.0F, true);
		lower_suit5.setTextureOffset(83, 152).addBox(57.1814F, 5.5428F, 10.0865F, 1.0F, 13.0F, 4.0F, 0.0F, true);
		lower_suit5.setTextureOffset(40, 151).addBox(52.1814F, 5.5428F, 10.0865F, 1.0F, 13.0F, 4.0F, 0.0F, true);

		right_arm_r6 = new ModelRenderer(this);
		right_arm_r6.setRotationPoint(53.6911F, 33.9217F, 13.7421F);
		lower_suit5.addChild(right_arm_r6);
		setRotationAngle(right_arm_r6, 0.6183F, -0.2415F, 0.0098F);
		right_arm_r6.setTextureOffset(69, 71).addBox(-5.3418F, -16.8778F, 3.1804F, 10.0F, 6.0F, 10.0F, 0.0F, true);

		tentacle4 = new ModelRenderer(this);
		tentacle4.setRotationPoint(41.0F, 0.2F, 4.8F);
		lower_suit5.addChild(tentacle4);

		right_leg_r7 = new ModelRenderer(this);
		right_leg_r7.setRotationPoint(12.6911F, 33.7217F, 8.9421F);
		tentacle4.addChild(right_leg_r7);
		setRotationAngle(right_leg_r7, 0.6146F, -0.3186F, 0.2001F);
		right_leg_r7.setTextureOffset(107, 153).addBox(-7.4203F, -13.9579F, 4.7445F, 2.0F, 14.0F, 2.0F, 0.0F, true);

		lower_leg5 = new ModelRenderer(this);
		lower_leg5.setRotationPoint(4.0F, 15.0F, 0.8F);
		tentacle4.addChild(lower_leg5);

		right_leg_r8 = new ModelRenderer(this);
		right_leg_r8.setRotationPoint(8.6911F, 18.7217F, 8.1421F);
		lower_leg5.addChild(right_leg_r8);
		setRotationAngle(right_leg_r8, 1.3563F, -0.3186F, 0.2001F);
		right_leg_r8.setTextureOffset(132, 151).addBox(-7.4203F, 3.2702F, 3.5391F, 2.0F, 17.0F, 2.0F, 0.0F, true);

		tentacle5 = new ModelRenderer(this);
		tentacle5.setRotationPoint(48.0F, 0.2F, 4.8F);
		lower_suit5.addChild(tentacle5);

		right_leg_r9 = new ModelRenderer(this);
		right_leg_r9.setRotationPoint(5.6911F, 33.7217F, 8.9421F);
		tentacle5.addChild(right_leg_r9);
		setRotationAngle(right_leg_r9, 0.6146F, -0.3186F, 0.2001F);
		right_leg_r9.setTextureOffset(107, 153).addBox(-0.4203F, -13.9579F, 4.7445F, 2.0F, 14.0F, 2.0F, 0.0F, true);

		lower_leg6 = new ModelRenderer(this);
		lower_leg6.setRotationPoint(4.0F, 15.0F, 0.8F);
		tentacle5.addChild(lower_leg6);

		right_leg_r10 = new ModelRenderer(this);
		right_leg_r10.setRotationPoint(1.6911F, 18.7217F, 8.1421F);
		lower_leg6.addChild(right_leg_r10);
		setRotationAngle(right_leg_r10, 1.3563F, -0.3186F, 0.2001F);
		right_leg_r10.setTextureOffset(132, 151).addBox(-0.4203F, 3.2702F, 3.5391F, 2.0F, 17.0F, 2.0F, 0.0F, true);

		tentacle6 = new ModelRenderer(this);
		tentacle6.setRotationPoint(45.0F, 0.2F, 9.8F);
		lower_suit5.addChild(tentacle6);

		right_leg_r11 = new ModelRenderer(this);
		right_leg_r11.setRotationPoint(8.6911F, 33.7217F, 3.9421F);
		tentacle6.addChild(right_leg_r11);
		setRotationAngle(right_leg_r11, 0.6146F, -0.3186F, 0.2001F);
		right_leg_r11.setTextureOffset(18, 162).addBox(-3.4203F, -14.071F, 9.276F, 2.0F, 12.0F, 2.0F, 0.0F, true);

		lower_leg7 = new ModelRenderer(this);
		lower_leg7.setRotationPoint(4.0F, 15.0F, 0.8F);
		tentacle6.addChild(lower_leg7);

		right_leg_r12 = new ModelRenderer(this);
		right_leg_r12.setRotationPoint(4.6911F, 18.7217F, 3.1421F);
		lower_leg7.addChild(right_leg_r12);
		setRotationAngle(right_leg_r12, 1.3563F, -0.3186F, 0.2001F);
		right_leg_r12.setTextureOffset(132, 151).addBox(-3.4203F, 4.7738F, 8.3077F, 2.0F, 17.0F, 2.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(6.0F, 2.0F, -3.0F);
		setRotationAngle(left_leg, 0.0F, -0.5236F, 0.0F);

		suit_leg2 = new ModelRenderer(this);
		suit_leg2.setRotationPoint(-15.2321F, 1.2875F, -11.2766F);
		left_leg.addChild(suit_leg2);
		suit_leg2.setTextureOffset(0, 131).addBox(12.5F, 0.7125F, -2.1875F, 1.0F, 17.0F, 5.0F, 0.0F, false);
		suit_leg2.setTextureOffset(34, 129).addBox(12.5F, 0.7125F, -3.1875F, 7.0F, 17.0F, 1.0F, 0.0F, false);
		suit_leg2.setTextureOffset(112, 126).addBox(18.5F, -0.2875F, -2.1875F, 1.0F, 18.0F, 5.0F, 0.0F, false);
		suit_leg2.setTextureOffset(124, 126).addBox(12.5F, 0.7125F, 2.8125F, 7.0F, 17.0F, 1.0F, 0.0F, false);
		suit_leg2.setTextureOffset(88, 29).addBox(13.0F, 17.8125F, -7.6875F, 6.0F, 3.0F, 11.0F, 0.0F, false);
		suit_leg2.setTextureOffset(38, 81).addBox(11.0F, 19.8125F, -7.6875F, 10.0F, 1.0F, 11.0F, 0.0F, false);
		suit_leg2.setTextureOffset(51, 16).addBox(12.5F, -3.2875F, -3.1875F, 7.0F, 6.0F, 17.0F, 0.0F, false);
		suit_leg2.setTextureOffset(33, 65).addBox(12.0F, 19.8125F, -9.6875F, 8.0F, 1.0F, 15.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-6.0F, 2.0F, -3.0F);
		setRotationAngle(right_leg, 0.0F, 0.5236F, 0.0F);

		suit_leg3 = new ModelRenderer(this);
		suit_leg3.setRotationPoint(15.2321F, 1.2875F, -11.2766F);
		right_leg.addChild(suit_leg3);
		suit_leg3.setTextureOffset(0, 131).addBox(-13.5F, 0.7125F, -2.1875F, 1.0F, 17.0F, 5.0F, 0.0F, true);
		suit_leg3.setTextureOffset(34, 129).addBox(-19.5F, 0.7125F, -3.1875F, 7.0F, 17.0F, 1.0F, 0.0F, true);
		suit_leg3.setTextureOffset(112, 126).addBox(-19.5F, -0.2875F, -2.1875F, 1.0F, 18.0F, 5.0F, 0.0F, true);
		suit_leg3.setTextureOffset(124, 126).addBox(-19.5F, 0.7125F, 2.8125F, 7.0F, 17.0F, 1.0F, 0.0F, true);
		suit_leg3.setTextureOffset(88, 29).addBox(-19.0F, 17.8125F, -7.6875F, 6.0F, 3.0F, 11.0F, 0.0F, true);
		suit_leg3.setTextureOffset(38, 81).addBox(-21.0F, 19.8125F, -7.6875F, 10.0F, 1.0F, 11.0F, 0.0F, true);
		suit_leg3.setTextureOffset(51, 16).addBox(-19.5F, -3.2875F, -3.1875F, 7.0F, 6.0F, 17.0F, 0.0F, true);
		suit_leg3.setTextureOffset(33, 65).addBox(-20.0F, 19.8125F, -9.6875F, 8.0F, 1.0F, 15.0F, 0.0F, true);

		left_leg2 = new ModelRenderer(this);
		left_leg2.setRotationPoint(6.0F, 2.0F, 3.0F);
		setRotationAngle(left_leg2, 0.0F, 0.5236F, 0.0F);

		suit_leg4 = new ModelRenderer(this);
		suit_leg4.setRotationPoint(-15.2321F, 1.2875F, 11.2766F);
		left_leg2.addChild(suit_leg4);
		suit_leg4.setTextureOffset(0, 131).addBox(12.5F, 0.7125F, -2.8125F, 1.0F, 17.0F, 5.0F, 0.0F, false);
		suit_leg4.setTextureOffset(34, 129).addBox(12.5F, 0.7125F, 2.1875F, 7.0F, 17.0F, 1.0F, 0.0F, false);
		suit_leg4.setTextureOffset(112, 126).addBox(18.5F, -0.2875F, -2.8125F, 1.0F, 18.0F, 5.0F, 0.0F, false);
		suit_leg4.setTextureOffset(124, 126).addBox(12.5F, 0.7125F, -3.8125F, 7.0F, 17.0F, 1.0F, 0.0F, false);
		suit_leg4.setTextureOffset(88, 29).addBox(13.0F, 17.8125F, -3.3125F, 6.0F, 3.0F, 11.0F, 0.0F, false);
		suit_leg4.setTextureOffset(38, 81).addBox(11.0F, 19.8125F, -3.3125F, 10.0F, 1.0F, 11.0F, 0.0F, false);
		suit_leg4.setTextureOffset(51, 16).addBox(12.5F, -3.2875F, -13.8125F, 7.0F, 6.0F, 17.0F, 0.0F, false);
		suit_leg4.setTextureOffset(33, 65).addBox(12.0F, 19.8125F, -5.3125F, 8.0F, 1.0F, 15.0F, 0.0F, false);

		right_leg2 = new ModelRenderer(this);
		right_leg2.setRotationPoint(-6.0F, 2.0F, 3.0F);
		setRotationAngle(right_leg2, 0.0F, -0.5236F, 0.0F);

		suit_leg5 = new ModelRenderer(this);
		suit_leg5.setRotationPoint(15.2321F, 1.2875F, 11.2766F);
		right_leg2.addChild(suit_leg5);
		suit_leg5.setTextureOffset(0, 131).addBox(-13.5F, 0.7125F, -2.8125F, 1.0F, 17.0F, 5.0F, 0.0F, true);
		suit_leg5.setTextureOffset(34, 129).addBox(-19.5F, 0.7125F, 2.1875F, 7.0F, 17.0F, 1.0F, 0.0F, true);
		suit_leg5.setTextureOffset(112, 126).addBox(-19.5F, -0.2875F, -2.8125F, 1.0F, 18.0F, 5.0F, 0.0F, true);
		suit_leg5.setTextureOffset(124, 126).addBox(-19.5F, 0.7125F, -3.8125F, 7.0F, 17.0F, 1.0F, 0.0F, true);
		suit_leg5.setTextureOffset(88, 29).addBox(-19.0F, 17.8125F, -3.3125F, 6.0F, 3.0F, 11.0F, 0.0F, true);
		suit_leg5.setTextureOffset(38, 81).addBox(-21.0F, 19.8125F, -3.3125F, 10.0F, 1.0F, 11.0F, 0.0F, true);
		suit_leg5.setTextureOffset(51, 16).addBox(-19.5F, -3.2875F, -13.8125F, 7.0F, 6.0F, 17.0F, 0.0F, true);
		suit_leg5.setTextureOffset(33, 65).addBox(-20.0F, 19.8125F, -5.3125F, 8.0F, 1.0F, 15.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head_Mess.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head_Mess.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head_Mess.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}