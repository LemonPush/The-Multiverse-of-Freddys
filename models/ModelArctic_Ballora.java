// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelArctic_Ballora extends EntityModel<Entity> {
	private final ModelRenderer ballora;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer body_r5;
	private final ModelRenderer body_r6;
	private final ModelRenderer body_r7;
	private final ModelRenderer body_r8;
	private final ModelRenderer body_r9;
	private final ModelRenderer body_r10;
	private final ModelRenderer body_r11;
	private final ModelRenderer body_r12;
	private final ModelRenderer body_r13;
	private final ModelRenderer body_r14;
	private final ModelRenderer body_r15;
	private final ModelRenderer body_r16;
	private final ModelRenderer body_r17;
	private final ModelRenderer body_r18;
	private final ModelRenderer body_r19;
	private final ModelRenderer body_r20;
	private final ModelRenderer body_r21;
	private final ModelRenderer body_r22;
	private final ModelRenderer body_r23;
	private final ModelRenderer body_r24;
	private final ModelRenderer body_r25;
	private final ModelRenderer body_r26;
	private final ModelRenderer body_r27;
	private final ModelRenderer body_r28;
	private final ModelRenderer body_r29;
	private final ModelRenderer body_r30;
	private final ModelRenderer body_r31;
	private final ModelRenderer body_r32;
	private final ModelRenderer body_r33;
	private final ModelRenderer body_r34;
	private final ModelRenderer body_r35;
	private final ModelRenderer body_r36;
	private final ModelRenderer body_r37;
	private final ModelRenderer body_r38;
	private final ModelRenderer body_r39;
	private final ModelRenderer body_r40;
	private final ModelRenderer body_r41;
	private final ModelRenderer body_r42;
	private final ModelRenderer body_r43;
	private final ModelRenderer body_r44;
	private final ModelRenderer body_r45;
	private final ModelRenderer body_r46;
	private final ModelRenderer body_r47;
	private final ModelRenderer body_r48;
	private final ModelRenderer body_r49;
	private final ModelRenderer body_r50;
	private final ModelRenderer body_r51;
	private final ModelRenderer body_r52;
	private final ModelRenderer body_r53;
	private final ModelRenderer body_r54;
	private final ModelRenderer body_r55;
	private final ModelRenderer body_r56;
	private final ModelRenderer body_r57;
	private final ModelRenderer body_r58;
	private final ModelRenderer body_r59;
	private final ModelRenderer body_r60;
	private final ModelRenderer body_r61;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm_r4;
	private final ModelRenderer right_arm_r5;
	private final ModelRenderer right_arm_r6;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelArctic_Ballora() {
		textureWidth = 128;
		textureHeight = 128;

		ballora = new ModelRenderer(this);
		ballora.setRotationPoint(0.0F, 4.0F, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -14.0F, 0.0F);
		ballora.addChild(head);
		head.setTextureOffset(0, 12).addBox(-4.0F, -7.0F, -3.0F, 8.0F, 8.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 3).addBox(1.0F, -5.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		head.setTextureOffset(0, 28).addBox(-0.5F, -2.7F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(26, 4).addBox(2.7F, -2.0F, -3.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 26).addBox(-3.7F, -2.0F, -3.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.0F, -5.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		head.setTextureOffset(0, 16).addBox(1.0F, -6.0F, -3.0F, 2.0F, 0.0F, 1.0F, 0.25F, false);
		head.setTextureOffset(0, 16).addBox(-3.0F, -6.0F, -3.0F, 2.0F, 0.0F, 1.0F, 0.25F, false);
		head.setTextureOffset(22, 12).addBox(4.0F, -4.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 12).addBox(-5.0F, -4.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(16, 49).addBox(-2.0F, -9.0F, 1.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(26, 0).addBox(-2.0F, -8.0F, 0.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -13.0F, 0.0F);
		ballora.addChild(body);
		body.setTextureOffset(23, 21).addBox(-5.0F, 12.2F, -2.5F, 10.0F, 3.0F, 5.0F, 0.25F, false);
		body.setTextureOffset(28, 18).addBox(-11.0F, 11.0F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(28, 18).addBox(0.0F, 11.0F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(0, 0).addBox(-5.0F, 1.0F, -3.5F, 10.0F, 6.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 26).addBox(-4.5F, 6.0F, -3.0F, 9.0F, 2.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(22, 12).addBox(-4.5F, 4.0F, -2.5F, 9.0F, 1.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(23, 29).addBox(-3.5F, 7.0F, -2.5F, 7.0F, 4.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(59, 52).addBox(5.0F, 2.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(38, 59).addBox(-7.0F, 2.0F, -1.5F, 2.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(60, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(-3.4096F, 10.9845F, 4.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.4168F, 0.6753F, 0.4084F);
		body_r1.setTextureOffset(28, 18).addBox(-6.2321F, -0.9553F, -1.8918F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(-3.4096F, 10.9845F, 4.0F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, 0.0F, 0.7418F, 0.0F);
		body_r2.setTextureOffset(28, 18).addBox(-6.0819F, 0.0155F, -1.9618F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(-3.4096F, 10.9845F, 4.0F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, 0.6902F, 1.0515F, 0.7603F);
		body_r3.setTextureOffset(28, 18).addBox(-5.7561F, -0.9553F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(-3.4096F, 10.9845F, 4.0F);
		body.addChild(body_r4);
		setRotationAngle(body_r4, 0.0F, 1.1781F, 0.0F);
		body_r4.setTextureOffset(28, 18).addBox(-5.5904F, 0.0155F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(-3.4096F, 10.9845F, 4.0F);
		body.addChild(body_r5);
		setRotationAngle(body_r5, 1.6342F, 1.2486F, 1.7761F);
		body_r5.setTextureOffset(28, 18).addBox(-6.2321F, -0.9553F, 0.8918F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r6 = new ModelRenderer(this);
		body_r6.setRotationPoint(-3.4096F, 10.9845F, 4.0F);
		body.addChild(body_r6);
		setRotationAngle(body_r6, 3.1416F, 1.5272F, -3.1416F);
		body_r6.setTextureOffset(28, 18).addBox(-6.0819F, 0.0155F, 0.9618F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r7 = new ModelRenderer(this);
		body_r7.setRotationPoint(3.4096F, 10.9845F, 4.0F);
		body.addChild(body_r7);
		setRotationAngle(body_r7, 0.4168F, -0.6753F, -0.4084F);
		body_r7.setTextureOffset(28, 18).addBox(-4.7679F, -0.9553F, -1.8918F, 11.0F, 1.0F, 1.0F, 0.0F, true);

		body_r8 = new ModelRenderer(this);
		body_r8.setRotationPoint(3.4096F, 10.9845F, 4.0F);
		body.addChild(body_r8);
		setRotationAngle(body_r8, 0.0F, -0.7418F, 0.0F);
		body_r8.setTextureOffset(28, 18).addBox(-4.9181F, 0.0155F, -1.9618F, 11.0F, 1.0F, 1.0F, 0.0F, true);

		body_r9 = new ModelRenderer(this);
		body_r9.setRotationPoint(3.4096F, 10.9845F, 4.0F);
		body.addChild(body_r9);
		setRotationAngle(body_r9, 0.6902F, -1.0515F, -0.7603F);
		body_r9.setTextureOffset(28, 18).addBox(-5.2439F, -0.9553F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, true);

		body_r10 = new ModelRenderer(this);
		body_r10.setRotationPoint(3.4096F, 10.9845F, 4.0F);
		body.addChild(body_r10);
		setRotationAngle(body_r10, 0.0F, -1.1781F, 0.0F);
		body_r10.setTextureOffset(28, 18).addBox(-5.4096F, 0.0155F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, true);

		body_r11 = new ModelRenderer(this);
		body_r11.setRotationPoint(3.4096F, 10.9845F, 4.0F);
		body.addChild(body_r11);
		setRotationAngle(body_r11, 3.1416F, -1.5272F, 3.1416F);
		body_r11.setTextureOffset(28, 18).addBox(-4.9181F, 0.0155F, 0.9618F, 11.0F, 1.0F, 1.0F, 0.0F, true);

		body_r12 = new ModelRenderer(this);
		body_r12.setRotationPoint(3.4096F, 10.9845F, 4.0F);
		body.addChild(body_r12);
		setRotationAngle(body_r12, 1.6342F, -1.2486F, -1.7761F);
		body_r12.setTextureOffset(28, 18).addBox(-4.7679F, -0.9553F, 0.8918F, 11.0F, 1.0F, 1.0F, 0.0F, true);

		body_r13 = new ModelRenderer(this);
		body_r13.setRotationPoint(-0.4096F, 10.9845F, 4.0F);
		body.addChild(body_r13);
		setRotationAngle(body_r13, 0.7632F, 1.0537F, 0.6778F);
		body_r13.setTextureOffset(28, 18).addBox(-6.2321F, -0.9553F, -1.8918F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r14 = new ModelRenderer(this);
		body_r14.setRotationPoint(-0.4096F, 10.9845F, 4.0F);
		body.addChild(body_r14);
		setRotationAngle(body_r14, 2.4772F, 0.9834F, 2.548F);
		body_r14.setTextureOffset(28, 18).addBox(-6.2321F, -0.9553F, 0.8918F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r15 = new ModelRenderer(this);
		body_r15.setRotationPoint(-0.4096F, 10.9845F, 4.0F);
		body.addChild(body_r15);
		setRotationAngle(body_r15, 1.6978F, 1.2191F, 1.6901F);
		body_r15.setTextureOffset(28, 18).addBox(-5.7561F, -0.9553F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r16 = new ModelRenderer(this);
		body_r16.setRotationPoint(-0.4096F, 10.9845F, 4.0F);
		body.addChild(body_r16);
		setRotationAngle(body_r16, 3.1416F, 1.0908F, -3.1416F);
		body_r16.setTextureOffset(28, 18).addBox(-6.0819F, 0.0155F, 0.9618F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r17 = new ModelRenderer(this);
		body_r17.setRotationPoint(-0.4096F, 10.9845F, 4.0F);
		body.addChild(body_r17);
		setRotationAngle(body_r17, 3.1416F, 1.5272F, 3.1416F);
		body_r17.setTextureOffset(28, 18).addBox(-5.5904F, 0.0155F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r18 = new ModelRenderer(this);
		body_r18.setRotationPoint(-0.4096F, 10.9845F, 4.0F);
		body.addChild(body_r18);
		setRotationAngle(body_r18, 0.0F, 1.1781F, 0.0F);
		body_r18.setTextureOffset(28, 18).addBox(-6.0819F, 0.0155F, -1.9618F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r19 = new ModelRenderer(this);
		body_r19.setRotationPoint(-0.4096F, 10.9845F, -4.0F);
		body.addChild(body_r19);
		setRotationAngle(body_r19, -0.7632F, -1.0537F, 0.6778F);
		body_r19.setTextureOffset(28, 18).addBox(-6.2321F, -0.9553F, 0.8918F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r20 = new ModelRenderer(this);
		body_r20.setRotationPoint(-0.4096F, 10.9845F, -4.0F);
		body.addChild(body_r20);
		setRotationAngle(body_r20, -2.4772F, -0.9834F, 2.548F);
		body_r20.setTextureOffset(28, 18).addBox(-6.2321F, -0.9553F, -1.8918F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r21 = new ModelRenderer(this);
		body_r21.setRotationPoint(-0.4096F, 10.9845F, -4.0F);
		body.addChild(body_r21);
		setRotationAngle(body_r21, -1.6978F, -1.2191F, 1.6901F);
		body_r21.setTextureOffset(28, 18).addBox(-5.7561F, -0.9553F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r22 = new ModelRenderer(this);
		body_r22.setRotationPoint(-0.4096F, 10.9845F, -4.0F);
		body.addChild(body_r22);
		setRotationAngle(body_r22, -3.1416F, -1.0908F, -3.1416F);
		body_r22.setTextureOffset(28, 18).addBox(-6.0819F, 0.0155F, -1.9618F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r23 = new ModelRenderer(this);
		body_r23.setRotationPoint(-0.4096F, 10.9845F, -4.0F);
		body.addChild(body_r23);
		setRotationAngle(body_r23, -3.1416F, -1.5272F, 3.1416F);
		body_r23.setTextureOffset(28, 18).addBox(-5.5904F, 0.0155F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r24 = new ModelRenderer(this);
		body_r24.setRotationPoint(-0.4096F, 10.9845F, -4.0F);
		body.addChild(body_r24);
		setRotationAngle(body_r24, 0.0F, -1.1781F, 0.0F);
		body_r24.setTextureOffset(28, 18).addBox(-6.0819F, 0.0155F, 0.9618F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r25 = new ModelRenderer(this);
		body_r25.setRotationPoint(-3.4096F, 10.9845F, -4.0F);
		body.addChild(body_r25);
		setRotationAngle(body_r25, -0.4168F, -0.6753F, 0.4084F);
		body_r25.setTextureOffset(28, 18).addBox(-6.2321F, -0.9553F, 0.8918F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r26 = new ModelRenderer(this);
		body_r26.setRotationPoint(-3.4096F, 10.9845F, -4.0F);
		body.addChild(body_r26);
		setRotationAngle(body_r26, -1.6342F, -1.2486F, 1.7761F);
		body_r26.setTextureOffset(28, 18).addBox(-6.2321F, -0.9553F, -1.8918F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r27 = new ModelRenderer(this);
		body_r27.setRotationPoint(-3.4096F, 10.9845F, -4.0F);
		body.addChild(body_r27);
		setRotationAngle(body_r27, -0.6902F, -1.0515F, 0.7603F);
		body_r27.setTextureOffset(28, 18).addBox(-5.7561F, -0.9553F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r28 = new ModelRenderer(this);
		body_r28.setRotationPoint(-3.4096F, 10.9845F, -4.0F);
		body.addChild(body_r28);
		setRotationAngle(body_r28, -3.1416F, -1.5272F, -3.1416F);
		body_r28.setTextureOffset(28, 18).addBox(-6.0819F, 0.0155F, -1.9618F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r29 = new ModelRenderer(this);
		body_r29.setRotationPoint(-3.4096F, 10.9845F, -4.0F);
		body.addChild(body_r29);
		setRotationAngle(body_r29, 0.0F, -1.1781F, 0.0F);
		body_r29.setTextureOffset(28, 18).addBox(-5.5904F, 0.0155F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r30 = new ModelRenderer(this);
		body_r30.setRotationPoint(-3.4096F, 10.9845F, -4.0F);
		body.addChild(body_r30);
		setRotationAngle(body_r30, 0.0F, -0.7418F, 0.0F);
		body_r30.setTextureOffset(28, 18).addBox(-6.0819F, 0.0155F, 0.9618F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r31 = new ModelRenderer(this);
		body_r31.setRotationPoint(3.4096F, 10.9845F, -4.0F);
		body.addChild(body_r31);
		setRotationAngle(body_r31, -0.4168F, 0.6753F, -0.4084F);
		body_r31.setTextureOffset(28, 18).addBox(-4.7679F, -0.9553F, 0.8918F, 11.0F, 1.0F, 1.0F, 0.0F, true);

		body_r32 = new ModelRenderer(this);
		body_r32.setRotationPoint(3.4096F, 10.9845F, -4.0F);
		body.addChild(body_r32);
		setRotationAngle(body_r32, -1.6342F, 1.2486F, -1.7761F);
		body_r32.setTextureOffset(28, 18).addBox(-4.7679F, -0.9553F, -1.8918F, 11.0F, 1.0F, 1.0F, 0.0F, true);

		body_r33 = new ModelRenderer(this);
		body_r33.setRotationPoint(3.4096F, 10.9845F, -4.0F);
		body.addChild(body_r33);
		setRotationAngle(body_r33, -0.6902F, 1.0515F, -0.7603F);
		body_r33.setTextureOffset(28, 18).addBox(-5.2439F, -0.9553F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, true);

		body_r34 = new ModelRenderer(this);
		body_r34.setRotationPoint(3.4096F, 10.9845F, -4.0F);
		body.addChild(body_r34);
		setRotationAngle(body_r34, -3.1416F, 1.5272F, 3.1416F);
		body_r34.setTextureOffset(28, 18).addBox(-4.9181F, 0.0155F, -1.9618F, 11.0F, 1.0F, 1.0F, 0.0F, true);

		body_r35 = new ModelRenderer(this);
		body_r35.setRotationPoint(3.4096F, 10.9845F, -4.0F);
		body.addChild(body_r35);
		setRotationAngle(body_r35, 0.0F, 1.1781F, 0.0F);
		body_r35.setTextureOffset(28, 18).addBox(-5.4096F, 0.0155F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, true);

		body_r36 = new ModelRenderer(this);
		body_r36.setRotationPoint(3.4096F, 10.9845F, -4.0F);
		body.addChild(body_r36);
		setRotationAngle(body_r36, 0.0F, 0.7418F, 0.0F);
		body_r36.setTextureOffset(28, 18).addBox(-4.9181F, 0.0155F, 0.9618F, 11.0F, 1.0F, 1.0F, 0.0F, true);

		body_r37 = new ModelRenderer(this);
		body_r37.setRotationPoint(5.4096F, 11.5F, 0.0F);
		body.addChild(body_r37);
		setRotationAngle(body_r37, 0.0F, -0.4363F, 0.0F);
		body_r37.setTextureOffset(28, 18).addBox(-4.9181F, -0.5F, 0.9618F, 11.0F, 1.0F, 1.0F, 0.0F, true);

		body_r38 = new ModelRenderer(this);
		body_r38.setRotationPoint(5.4096F, 11.5F, 0.0F);
		body.addChild(body_r38);
		setRotationAngle(body_r38, 0.0F, 0.4363F, 0.0F);
		body_r38.setTextureOffset(28, 18).addBox(-4.9181F, -0.5F, -1.9618F, 11.0F, 1.0F, 1.0F, 0.0F, true);

		body_r39 = new ModelRenderer(this);
		body_r39.setRotationPoint(5.4096F, 10.5F, 0.0F);
		body.addChild(body_r39);
		setRotationAngle(body_r39, 0.0F, 0.0F, -0.3491F);
		body_r39.setTextureOffset(28, 18).addBox(-5.4096F, -0.5F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, true);

		body_r40 = new ModelRenderer(this);
		body_r40.setRotationPoint(1.0032F, -11.3564F, 3.517F);
		body.addChild(body_r40);
		setRotationAngle(body_r40, 1.7047F, -0.4623F, -1.8642F);
		body_r40.setTextureOffset(48, 24).addBox(-2.5461F, -0.5F, 2.7943F, 8.0F, 1.0F, 1.0F, 0.0F, true);

		body_r41 = new ModelRenderer(this);
		body_r41.setRotationPoint(-2.5552F, -11.8458F, 3.7718F);
		body.addChild(body_r41);
		setRotationAngle(body_r41, 1.6161F, -0.478F, -1.6691F);
		body_r41.setTextureOffset(48, 24).addBox(-4.0F, -0.5F, -1.5F, 8.0F, 1.0F, 1.0F, 0.0F, true);

		body_r42 = new ModelRenderer(this);
		body_r42.setRotationPoint(-1.559F, -11.9232F, 3.8121F);
		body.addChild(body_r42);
		setRotationAngle(body_r42, 1.5746F, -0.4365F, -1.5707F);
		body_r42.setTextureOffset(48, 24).addBox(-4.0F, -0.5F, -1.5F, 8.0F, 1.0F, 1.0F, 0.0F, true);

		body_r43 = new ModelRenderer(this);
		body_r43.setRotationPoint(1.559F, -11.9232F, 3.8121F);
		body.addChild(body_r43);
		setRotationAngle(body_r43, 1.5746F, 0.4365F, 1.5707F);
		body_r43.setTextureOffset(48, 24).addBox(-4.0F, -0.5F, -1.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		body_r44 = new ModelRenderer(this);
		body_r44.setRotationPoint(2.5552F, -11.8458F, 3.7718F);
		body.addChild(body_r44);
		setRotationAngle(body_r44, 1.6161F, 0.478F, 1.6691F);
		body_r44.setTextureOffset(48, 24).addBox(-4.0F, -0.5F, -1.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		body_r45 = new ModelRenderer(this);
		body_r45.setRotationPoint(-1.0032F, -11.3564F, 3.517F);
		body.addChild(body_r45);
		setRotationAngle(body_r45, 1.7047F, 0.4623F, 1.8642F);
		body_r45.setTextureOffset(48, 24).addBox(-5.4539F, -0.5F, 2.7943F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		body_r46 = new ModelRenderer(this);
		body_r46.setRotationPoint(-0.7032F, -1.3564F, 4.517F);
		body.addChild(body_r46);
		setRotationAngle(body_r46, 1.7047F, 0.4623F, 1.8642F);
		body_r46.setTextureOffset(48, 24).addBox(-5.4539F, -0.5F, 2.7943F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		body_r47 = new ModelRenderer(this);
		body_r47.setRotationPoint(-0.7032F, -1.3564F, 4.517F);
		body.addChild(body_r47);
		setRotationAngle(body_r47, 1.5708F, 0.48F, 1.5708F);
		body_r47.setTextureOffset(48, 24).addBox(-3.4482F, -0.5F, 1.0448F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		body_r47.setTextureOffset(48, 24).addBox(-3.4482F, -0.5F, -0.9552F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		body_r48 = new ModelRenderer(this);
		body_r48.setRotationPoint(-0.7032F, -1.3564F, 4.517F);
		body.addChild(body_r48);
		setRotationAngle(body_r48, 1.4369F, 0.4623F, 1.2774F);
		body_r48.setTextureOffset(48, 24).addBox(-5.2039F, -0.5F, -3.8613F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		body_r49 = new ModelRenderer(this);
		body_r49.setRotationPoint(-4.9101F, -1.754F, 3.4618F);
		body.addChild(body_r49);
		setRotationAngle(body_r49, 0.0F, 0.2618F, 1.0908F);
		body_r49.setTextureOffset(48, 24).addBox(-4.0F, -0.5F, -0.9F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		body_r50 = new ModelRenderer(this);
		body_r50.setRotationPoint(-4.9101F, -1.754F, 3.4618F);
		body.addChild(body_r50);
		setRotationAngle(body_r50, 0.0F, 0.0F, 1.0908F);
		body_r50.setTextureOffset(48, 24).addBox(-3.0F, -0.5F, -2.9F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		body_r50.setTextureOffset(48, 24).addBox(-3.0F, -0.5F, -4.9F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		body_r51 = new ModelRenderer(this);
		body_r51.setRotationPoint(-4.9101F, -1.754F, -3.4618F);
		body.addChild(body_r51);
		setRotationAngle(body_r51, 0.0F, -0.2618F, 1.0908F);
		body_r51.setTextureOffset(48, 24).addBox(-4.0F, -0.5F, -1.1F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		body_r52 = new ModelRenderer(this);
		body_r52.setRotationPoint(4.9101F, -1.754F, 3.4618F);
		body.addChild(body_r52);
		setRotationAngle(body_r52, 0.0F, 0.0F, -1.0908F);
		body_r52.setTextureOffset(48, 24).addBox(-5.0F, -0.5F, -4.9F, 8.0F, 1.0F, 1.0F, 0.0F, true);
		body_r52.setTextureOffset(48, 24).addBox(-5.0F, -0.5F, -2.9F, 8.0F, 1.0F, 1.0F, 0.0F, true);

		body_r53 = new ModelRenderer(this);
		body_r53.setRotationPoint(4.9101F, -1.754F, 3.4618F);
		body.addChild(body_r53);
		setRotationAngle(body_r53, 0.0F, -0.2618F, -1.0908F);
		body_r53.setTextureOffset(48, 24).addBox(-4.0F, -0.5F, -0.9F, 8.0F, 1.0F, 1.0F, 0.0F, true);

		body_r54 = new ModelRenderer(this);
		body_r54.setRotationPoint(4.9101F, -1.754F, -3.4618F);
		body.addChild(body_r54);
		setRotationAngle(body_r54, 0.0F, 0.2618F, -1.0908F);
		body_r54.setTextureOffset(48, 24).addBox(-4.0F, -0.5F, -1.1F, 8.0F, 1.0F, 1.0F, 0.0F, true);

		body_r55 = new ModelRenderer(this);
		body_r55.setRotationPoint(5.4096F, 10.5F, 0.0F);
		body.addChild(body_r55);
		setRotationAngle(body_r55, 0.0F, 0.4363F, -0.3491F);
		body_r55.setTextureOffset(28, 18).addBox(-4.9181F, -0.5F, -1.9618F, 11.0F, 1.0F, 1.0F, 0.0F, true);

		body_r56 = new ModelRenderer(this);
		body_r56.setRotationPoint(5.4096F, 10.5F, 0.0F);
		body.addChild(body_r56);
		setRotationAngle(body_r56, 0.0F, -0.4363F, -0.3491F);
		body_r56.setTextureOffset(28, 18).addBox(-4.9181F, -0.5F, 0.9618F, 11.0F, 1.0F, 1.0F, 0.0F, true);

		body_r57 = new ModelRenderer(this);
		body_r57.setRotationPoint(-5.4096F, 10.5F, 0.0F);
		body.addChild(body_r57);
		setRotationAngle(body_r57, 0.0F, 0.4363F, 0.3491F);
		body_r57.setTextureOffset(28, 18).addBox(-6.0819F, -0.5F, 0.9618F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r58 = new ModelRenderer(this);
		body_r58.setRotationPoint(-5.4096F, 10.5F, 0.0F);
		body.addChild(body_r58);
		setRotationAngle(body_r58, 0.0F, -0.4363F, 0.3491F);
		body_r58.setTextureOffset(28, 18).addBox(-6.0819F, -0.5F, -1.9618F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r59 = new ModelRenderer(this);
		body_r59.setRotationPoint(-5.4096F, 10.5F, 0.0F);
		body.addChild(body_r59);
		setRotationAngle(body_r59, 0.0F, 0.0F, 0.3491F);
		body_r59.setTextureOffset(28, 18).addBox(-5.5904F, -0.5F, -0.5F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r60 = new ModelRenderer(this);
		body_r60.setRotationPoint(-5.4096F, 11.5F, 0.0F);
		body.addChild(body_r60);
		setRotationAngle(body_r60, 0.0F, 0.4363F, 0.0F);
		body_r60.setTextureOffset(28, 18).addBox(-6.0819F, -0.5F, 0.9618F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		body_r61 = new ModelRenderer(this);
		body_r61.setRotationPoint(-5.4096F, 11.5F, 0.0F);
		body.addChild(body_r61);
		setRotationAngle(body_r61, 0.0F, -0.4363F, 0.0F);
		body_r61.setTextureOffset(28, 18).addBox(-6.0819F, -0.5F, -1.9618F, 11.0F, 1.0F, 1.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.6F, -15.0F, 0.0F);
		ballora.addChild(right_arm);
		setRotationAngle(right_arm, 3.1416F, 0.0F, 0.1745F);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(-5.3F, 6.2333F, 0.0F);
		right_arm.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, 0.0F, 0.0F, -0.2618F);
		right_arm_r1.setTextureOffset(32, 51).addBox(0.754F, 2.019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(59, 58).addBox(1.204F, 1.019F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(48, 0).addBox(0.754F, -4.981F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-5.5531F, 7.0379F, 0.0F);
		right_arm.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, 0.0F, 0.0F, -0.0087F);
		right_arm_r2.setTextureOffset(26, 59).addBox(0.3892F, -8.8384F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(0.0F, 0.25F, 0.0F);
		right_arm.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, 0.0F, 0.0F, 0.3927F);
		right_arm_r3.setTextureOffset(0, 33).addBox(-5.9011F, -7.4266F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.6F, -15.0F, 0.0F);
		ballora.addChild(left_arm);
		setRotationAngle(left_arm, 3.1416F, 0.0F, -0.1745F);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(5.3F, 6.2333F, 0.0F);
		left_arm.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, 0.0F, 0.0F, 0.2618F);
		right_arm_r4.setTextureOffset(48, 16).addBox(-5.1766F, 1.1127F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm_r4.setTextureOffset(57, 10).addBox(-4.6266F, 0.1127F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		right_arm_r4.setTextureOffset(44, 45).addBox(-5.1766F, -5.8873F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		right_arm_r5 = new ModelRenderer(this);
		right_arm_r5.setRotationPoint(5.5531F, 7.0379F, 0.0F);
		left_arm.addChild(right_arm_r5);
		setRotationAngle(right_arm_r5, 0.0F, 0.0F, 0.0087F);
		right_arm_r5.setTextureOffset(14, 57).addBox(-3.5715F, -9.8216F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		right_arm_r6 = new ModelRenderer(this);
		right_arm_r6.setRotationPoint(0.0F, 0.25F, 0.0F);
		left_arm.addChild(right_arm_r6);
		setRotationAngle(right_arm_r6, 0.0F, 0.0F, -0.3927F);
		right_arm_r6.setTextureOffset(32, 0).addBox(2.1176F, -8.4029F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.8F, -3.0F, 0.0F);
		ballora.addChild(right_leg);
		setRotationAngle(right_leg, 0.0F, 0.48F, 0.0F);
		right_leg.setTextureOffset(32, 38).addBox(-1.9F, 12.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(47, 29).addBox(-1.9F, 5.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(59, 26).addBox(-1.4F, 11.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(48, 39).addBox(-1.9F, 19.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(48, 55).addBox(-1.9F, 20.0F, -2.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.8F, -3.0F, 0.0F);
		ballora.addChild(left_leg);
		setRotationAngle(left_leg, 0.0F, -0.48F, 0.0F);
		left_leg.setTextureOffset(16, 38).addBox(-2.1F, 12.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 45).addBox(-2.1F, 5.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(56, 44).addBox(-1.6F, 11.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(45, 10).addBox(-2.1F, 19.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 55).addBox(-2.1F, 20.0F, -2.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		ballora.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.ballora.rotateAngleY = f2 / 20.f;
	}
}