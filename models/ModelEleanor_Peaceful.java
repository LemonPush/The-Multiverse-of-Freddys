// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelEleanor_Peaceful extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body_r1;
	private final ModelRenderer body;
	private final ModelRenderer left_arm_r1;
	private final ModelRenderer left_arm_r2;
	private final ModelRenderer left_arm_r3;
	private final ModelRenderer left_arm_r4;
	private final ModelRenderer left_arm_r5;
	private final ModelRenderer left_arm_r6;
	private final ModelRenderer left_arm_r7;
	private final ModelRenderer left_arm_r8;
	private final ModelRenderer left_arm_r9;
	private final ModelRenderer left_arm_r10;
	private final ModelRenderer left_arm_r11;
	private final ModelRenderer left_arm_r12;
	private final ModelRenderer left_arm_r13;
	private final ModelRenderer left_arm_r14;
	private final ModelRenderer left_arm_r15;
	private final ModelRenderer left_arm_r16;
	private final ModelRenderer left_arm_r17;
	private final ModelRenderer left_arm_r18;
	private final ModelRenderer left_arm_r19;
	private final ModelRenderer left_arm_r20;
	private final ModelRenderer left_arm_r21;
	private final ModelRenderer left_arm_r22;
	private final ModelRenderer left_arm_r23;
	private final ModelRenderer left_arm_r24;
	private final ModelRenderer left_arm_r25;
	private final ModelRenderer left_arm_r26;
	private final ModelRenderer left_arm_r27;
	private final ModelRenderer left_arm_r28;
	private final ModelRenderer left_arm_r29;
	private final ModelRenderer cape;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer body_r5;
	private final ModelRenderer body_r6;
	private final ModelRenderer body_r7;
	private final ModelRenderer body_r8;
	private final ModelRenderer body_r9;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_arm_r30;
	private final ModelRenderer left_arm_r31;
	private final ModelRenderer bone;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm_r32;
	private final ModelRenderer left_arm_r33;
	private final ModelRenderer bone2;

	public ModelEleanor_Peaceful() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -1.9882F, 0.1991F);
		head.setTextureOffset(0, 0).addBox(-3.5F, -9.0118F, -3.1991F, 7.0F, 8.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(0.5F, -6.7118F, -3.4991F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-2.5F, -6.7118F, -3.4991F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(0, 3).addBox(0.5F, -7.7118F, -3.4991F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 3).addBox(-2.5F, -7.7118F, -3.4991F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(42, 10).addBox(1.9F, -9.0118F, -1.1991F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(42, 10).addBox(-4.9F, -9.0118F, -1.1991F, 3.0F, 3.0F, 2.0F, 0.0F, true);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 1.2882F, 3.5009F);
		head.addChild(body_r1);
		setRotationAngle(body_r1, 0.1745F, 0.0F, 0.0F);
		body_r1.setTextureOffset(42, 0).addBox(-4.0F, -11.5F, 0.5F, 8.0F, 9.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(0, 22).addBox(-4.0F, -12.5F, -6.5F, 8.0F, 1.0F, 7.0F, 0.0F, false);
		body_r1.setTextureOffset(0, 30).addBox(-5.0F, -11.5F, -6.5F, 1.0F, 9.0F, 7.0F, 0.0F, true);
		body_r1.setTextureOffset(0, 14).addBox(-4.0F, -2.5F, -6.5F, 8.0F, 1.0F, 7.0F, 0.0F, false);
		body_r1.setTextureOffset(0, 30).addBox(4.0F, -11.5F, -6.5F, 1.0F, 9.0F, 7.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(43, 46).addBox(2.5F, 11.7F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
		body.setTextureOffset(43, 46).addBox(-4.5F, 11.7F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(38, 17).addBox(-3.0F, -1.0F, -2.0F, 6.0F, 5.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(49, 42).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(23, 22).addBox(-2.0F, 4.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(26, 0).addBox(-2.0F, 7.0F, -2.0F, 4.0F, 17.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(22, 49).addBox(-1.0F, -6.4F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r1 = new ModelRenderer(this);
		left_arm_r1.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r1);
		setRotationAngle(left_arm_r1, 3.1416F, 0.3927F, -3.1416F);
		left_arm_r1.setTextureOffset(43, 46).addBox(2.5F, -0.4862F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);

		left_arm_r2 = new ModelRenderer(this);
		left_arm_r2.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r2);
		setRotationAngle(left_arm_r2, 0.0F, 1.1781F, 0.0F);
		left_arm_r2.setTextureOffset(43, 46).addBox(2.5F, -0.4862F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);

		left_arm_r3 = new ModelRenderer(this);
		left_arm_r3.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r3);
		setRotationAngle(left_arm_r3, -2.9844F, 0.3614F, -2.7201F);
		left_arm_r3.setTextureOffset(43, 46).addBox(2.3369F, -10.5859F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);

		left_arm_r4 = new ModelRenderer(this);
		left_arm_r4.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r4);
		setRotationAngle(left_arm_r4, -0.7459F, 1.0228F, -0.8249F);
		left_arm_r4.setTextureOffset(43, 46).addBox(2.3369F, -10.5859F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);

		left_arm_r5 = new ModelRenderer(this);
		left_arm_r5.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r5);
		setRotationAngle(left_arm_r5, -0.7459F, -1.0228F, 0.8249F);
		left_arm_r5.setTextureOffset(43, 46).addBox(-4.3369F, -10.5859F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r6 = new ModelRenderer(this);
		left_arm_r6.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r6);
		setRotationAngle(left_arm_r6, 0.0F, -1.1781F, 0.0F);
		left_arm_r6.setTextureOffset(43, 46).addBox(-4.5F, -0.4862F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r7 = new ModelRenderer(this);
		left_arm_r7.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r7);
		setRotationAngle(left_arm_r7, 0.0F, 0.3927F, 0.0F);
		left_arm_r7.setTextureOffset(43, 46).addBox(2.5F, -0.4862F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);

		left_arm_r8 = new ModelRenderer(this);
		left_arm_r8.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r8);
		setRotationAngle(left_arm_r8, -0.1572F, 0.3614F, -0.4215F);
		left_arm_r8.setTextureOffset(43, 46).addBox(2.3369F, -10.5859F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);

		left_arm_r9 = new ModelRenderer(this);
		left_arm_r9.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r9);
		setRotationAngle(left_arm_r9, 3.1416F, -0.3927F, 3.1416F);
		left_arm_r9.setTextureOffset(43, 46).addBox(-4.5F, -0.4862F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r10 = new ModelRenderer(this);
		left_arm_r10.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r10);
		setRotationAngle(left_arm_r10, 0.0F, -1.1781F, 0.0F);
		left_arm_r10.setTextureOffset(43, 46).addBox(-4.5F, -0.4862F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r11 = new ModelRenderer(this);
		left_arm_r11.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r11);
		setRotationAngle(left_arm_r11, -2.9844F, -0.3614F, 2.7201F);
		left_arm_r11.setTextureOffset(43, 46).addBox(-4.3369F, -10.5859F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r12 = new ModelRenderer(this);
		left_arm_r12.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r12);
		setRotationAngle(left_arm_r12, -0.7459F, -1.0228F, 0.8249F);
		left_arm_r12.setTextureOffset(43, 46).addBox(-4.3369F, -10.5859F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r13 = new ModelRenderer(this);
		left_arm_r13.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r13);
		setRotationAngle(left_arm_r13, -0.7459F, 1.0228F, -0.8249F);
		left_arm_r13.setTextureOffset(43, 46).addBox(2.3369F, -10.5859F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);

		left_arm_r14 = new ModelRenderer(this);
		left_arm_r14.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r14);
		setRotationAngle(left_arm_r14, 0.0F, 1.1781F, 0.0F);
		left_arm_r14.setTextureOffset(43, 46).addBox(2.5F, -0.4862F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);

		left_arm_r15 = new ModelRenderer(this);
		left_arm_r15.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r15);
		setRotationAngle(left_arm_r15, 0.0F, -0.3927F, 0.0F);
		left_arm_r15.setTextureOffset(43, 46).addBox(-4.5F, -0.4862F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r16 = new ModelRenderer(this);
		left_arm_r16.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r16);
		setRotationAngle(left_arm_r16, -0.1572F, -0.3614F, 0.4215F);
		left_arm_r16.setTextureOffset(43, 46).addBox(-4.3369F, -10.5859F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r17 = new ModelRenderer(this);
		left_arm_r17.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r17);
		setRotationAngle(left_arm_r17, -0.3655F, -0.7119F, 0.5299F);
		left_arm_r17.setTextureOffset(43, 46).addBox(-4.3369F, -10.5859F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r18 = new ModelRenderer(this);
		left_arm_r18.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r18);
		setRotationAngle(left_arm_r18, -2.7761F, -0.7119F, 2.6117F);
		left_arm_r18.setTextureOffset(43, 46).addBox(-4.3369F, -10.5859F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r19 = new ModelRenderer(this);
		left_arm_r19.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r19);
		setRotationAngle(left_arm_r19, 0.0F, -0.7854F, 0.0F);
		left_arm_r19.setTextureOffset(43, 46).addBox(-4.5F, -0.4862F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r20 = new ModelRenderer(this);
		left_arm_r20.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r20);
		setRotationAngle(left_arm_r20, 3.1416F, -0.7854F, 3.1416F);
		left_arm_r20.setTextureOffset(43, 46).addBox(-4.5F, -0.4862F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r21 = new ModelRenderer(this);
		left_arm_r21.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r21);
		setRotationAngle(left_arm_r21, 0.3655F, 0.7119F, 0.5299F);
		left_arm_r21.setTextureOffset(43, 46).addBox(-4.3369F, -10.5859F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r22 = new ModelRenderer(this);
		left_arm_r22.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r22);
		setRotationAngle(left_arm_r22, 0.0F, 0.7854F, 0.0F);
		left_arm_r22.setTextureOffset(43, 46).addBox(-4.5F, -0.4862F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r23 = new ModelRenderer(this);
		left_arm_r23.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r23);
		setRotationAngle(left_arm_r23, 2.7761F, 0.7119F, 2.6117F);
		left_arm_r23.setTextureOffset(43, 46).addBox(-4.3369F, -10.5859F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r24 = new ModelRenderer(this);
		left_arm_r24.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r24);
		setRotationAngle(left_arm_r24, -3.1416F, 0.7854F, 3.1416F);
		left_arm_r24.setTextureOffset(43, 46).addBox(-4.5F, -0.4862F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r25 = new ModelRenderer(this);
		left_arm_r25.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r25);
		setRotationAngle(left_arm_r25, 0.0F, 1.5708F, 0.0F);
		left_arm_r25.setTextureOffset(43, 46).addBox(2.5F, -0.4862F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);
		left_arm_r25.setTextureOffset(43, 46).addBox(-4.5F, -0.4862F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r26 = new ModelRenderer(this);
		left_arm_r26.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r26);
		setRotationAngle(left_arm_r26, -1.5708F, 1.1781F, -1.5708F);
		left_arm_r26.setTextureOffset(43, 46).addBox(2.3369F, -10.5859F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);

		left_arm_r27 = new ModelRenderer(this);
		left_arm_r27.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r27);
		setRotationAngle(left_arm_r27, 1.5708F, 1.1781F, 1.5708F);
		left_arm_r27.setTextureOffset(43, 46).addBox(-4.3369F, -10.5859F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r28 = new ModelRenderer(this);
		left_arm_r28.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r28);
		setRotationAngle(left_arm_r28, 0.0F, 0.0F, 0.3927F);
		left_arm_r28.setTextureOffset(43, 46).addBox(-4.3369F, -10.5859F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, false);

		left_arm_r29 = new ModelRenderer(this);
		left_arm_r29.setRotationPoint(0.0F, 12.1862F, 0.0F);
		body.addChild(left_arm_r29);
		setRotationAngle(left_arm_r29, 0.0F, 0.0F, -0.3927F);
		left_arm_r29.setTextureOffset(43, 46).addBox(2.3369F, -10.5859F, -1.0F, 2.0F, 12.0F, 2.0F, 0.0F, true);

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 0.3F, 3.7F);
		body.addChild(cape);
		setRotationAngle(cape, -0.2182F, 0.0F, 0.0F);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(-3.5358F, 9.3449F, 3.2023F);
		cape.addChild(body_r2);
		setRotationAngle(body_r2, 1.5708F, -1.2217F, -1.5708F);
		body_r2.setTextureOffset(6, 46).addBox(-6.4923F, -9.3681F, 3.1613F, 2.0F, 17.0F, 1.0F, 0.0F, true);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(-3.5358F, 9.3449F, 3.2023F);
		cape.addChild(body_r3);
		setRotationAngle(body_r3, 0.8803F, -1.1111F, -0.826F);
		body_r3.setTextureOffset(0, 46).addBox(-5.4292F, -10.3681F, 1.6264F, 2.0F, 18.0F, 1.0F, 0.0F, true);

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(3.5358F, 9.3449F, 3.2023F);
		cape.addChild(body_r4);
		setRotationAngle(body_r4, 1.5708F, 1.2217F, 1.5708F);
		body_r4.setTextureOffset(6, 46).addBox(4.4923F, -9.3681F, 3.1613F, 2.0F, 17.0F, 1.0F, 0.0F, false);

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(3.5358F, 9.3449F, 3.2023F);
		cape.addChild(body_r5);
		setRotationAngle(body_r5, 0.8803F, 1.1111F, 0.826F);
		body_r5.setTextureOffset(0, 46).addBox(3.4292F, -10.3681F, 1.6264F, 2.0F, 18.0F, 1.0F, 0.0F, false);

		body_r6 = new ModelRenderer(this);
		body_r6.setRotationPoint(3.5358F, 9.3449F, 3.2023F);
		cape.addChild(body_r6);
		setRotationAngle(body_r6, 0.4301F, 0.609F, 0.2567F);
		body_r6.setTextureOffset(43, 26).addBox(2.0883F, -11.3681F, -0.683F, 2.0F, 19.0F, 1.0F, 0.0F, false);

		body_r7 = new ModelRenderer(this);
		body_r7.setRotationPoint(2.0F, 7.0477F, 2.5652F);
		cape.addChild(body_r7);
		setRotationAngle(body_r7, 0.4301F, 0.609F, 0.2567F);
		body_r7.setTextureOffset(16, 30).addBox(0.4205F, -9.9914F, 0.1036F, 3.0F, 20.0F, 1.0F, 0.0F, false);

		body_r8 = new ModelRenderer(this);
		body_r8.setRotationPoint(-2.0F, 7.0477F, 2.5652F);
		cape.addChild(body_r8);
		setRotationAngle(body_r8, 0.4301F, -0.609F, -0.2567F);
		body_r8.setTextureOffset(43, 26).addBox(-5.4205F, -8.9914F, 0.1036F, 2.0F, 19.0F, 1.0F, 0.0F, true);
		body_r8.setTextureOffset(16, 30).addBox(-3.4205F, -9.9914F, 0.1036F, 3.0F, 20.0F, 1.0F, 0.0F, true);

		body_r9 = new ModelRenderer(this);
		body_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		cape.addChild(body_r9);
		setRotationAngle(body_r9, 0.3491F, 0.0F, 0.0F);
		body_r9.setTextureOffset(29, 29).addBox(-3.0F, -3.4914F, -0.3695F, 6.0F, 21.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(3.7971F, -5.4127F, -5.733F);
		body.addChild(left_arm);
		setRotationAngle(left_arm, -1.0018F, -0.0736F, -0.047F);

		left_arm_r30 = new ModelRenderer(this);
		left_arm_r30.setRotationPoint(0.2241F, 1.8681F, 1.333F);
		left_arm.addChild(left_arm_r30);
		setRotationAngle(left_arm_r30, 0.0F, 0.9599F, -0.3491F);
		left_arm_r30.setTextureOffset(49, 26).addBox(-6.284F, -4.3871F, 3.4895F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		left_arm_r31 = new ModelRenderer(this);
		left_arm_r31.setRotationPoint(0.2944F, 4.3184F, 1.6623F);
		left_arm.addChild(left_arm_r31);
		setRotationAngle(left_arm_r31, -1.5681F, 0.9574F, -0.3489F);
		left_arm_r31.setTextureOffset(20, 0).addBox(-5.5611F, -5.9612F, -2.12F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm_r31.setTextureOffset(49, 34).addBox(-5.5611F, -4.9612F, -2.12F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.7971F, 6.6127F, 6.333F);
		left_arm.addChild(bone);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-3.7971F, -5.4127F, -5.733F);
		body.addChild(right_arm);
		setRotationAngle(right_arm, -1.0018F, 0.0736F, 0.047F);

		left_arm_r32 = new ModelRenderer(this);
		left_arm_r32.setRotationPoint(-0.2241F, 1.8681F, 1.333F);
		right_arm.addChild(left_arm_r32);
		setRotationAngle(left_arm_r32, 0.0F, -0.9599F, 0.3491F);
		left_arm_r32.setTextureOffset(49, 26).addBox(4.284F, -4.3871F, 3.4895F, 2.0F, 6.0F, 2.0F, 0.0F, true);

		left_arm_r33 = new ModelRenderer(this);
		left_arm_r33.setRotationPoint(-0.2944F, 4.3184F, 1.6623F);
		right_arm.addChild(left_arm_r33);
		setRotationAngle(left_arm_r33, -1.5681F, -0.9574F, 0.3489F);
		left_arm_r33.setTextureOffset(20, 0).addBox(3.5611F, -5.9612F, -2.12F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		left_arm_r33.setTextureOffset(49, 34).addBox(3.5611F, -4.9612F, -2.12F, 2.0F, 6.0F, 2.0F, 0.0F, true);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.7971F, 6.6127F, 6.333F);
		right_arm.addChild(bone2);

	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}