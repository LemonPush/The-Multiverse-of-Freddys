// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelNightmareMangle extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer head_r1;
	private final ModelRenderer LeftEar;
	private final ModelRenderer RightEar;
	private final ModelRenderer mouth;
	private final ModelRenderer head_r2;
	private final ModelRenderer bone;
	private final ModelRenderer head_r3;
	private final ModelRenderer NightmareBody;
	private final ModelRenderer body;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer body_r1;
	private final ModelRenderer neck;
	private final ModelRenderer head2;
	private final ModelRenderer cube_r6;
	private final ModelRenderer head_r4;
	private final ModelRenderer NightmareLeftArm3;
	private final ModelRenderer freddyarm6;
	private final ModelRenderer left_arm3;
	private final ModelRenderer cube_r7;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer bone2;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer cube_r8;
	private final ModelRenderer lowerarm6;
	private final ModelRenderer cube_r9;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer mouth2;
	private final ModelRenderer head_r5;
	private final ModelRenderer bone3;
	private final ModelRenderer NightmareRightArm;
	private final ModelRenderer freddyarm3;
	private final ModelRenderer right_arm;
	private final ModelRenderer lowerarm3;
	private final ModelRenderer cube_r10;
	private final ModelRenderer right_arm_r4;
	private final ModelRenderer NightmareRightArm2;
	private final ModelRenderer right_arm_r5;
	private final ModelRenderer freddyarm4;
	private final ModelRenderer right_arm2;
	private final ModelRenderer cube_r11;
	private final ModelRenderer lowerarm4;
	private final ModelRenderer cube_r12;
	private final ModelRenderer right_arm_r6;
	private final ModelRenderer NightmareLeftArm;
	private final ModelRenderer freddyarm2;
	private final ModelRenderer left_arm;
	private final ModelRenderer cube_r13;
	private final ModelRenderer right_arm_r7;
	private final ModelRenderer lowerarm2;
	private final ModelRenderer cube_r14;
	private final ModelRenderer right_arm_r8;
	private final ModelRenderer NightmareLeftArm2;
	private final ModelRenderer freddyarm5;
	private final ModelRenderer left_arm2;
	private final ModelRenderer cube_r15;
	private final ModelRenderer right_arm_r9;
	private final ModelRenderer lowerarm5;
	private final ModelRenderer cube_r16;
	private final ModelRenderer right_arm_r10;
	private final ModelRenderer right_leg;
	private final ModelRenderer cube_r17;
	private final ModelRenderer right_leg_r1;
	private final ModelRenderer lower;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg_r2;
	private final ModelRenderer lower2;
	private final ModelRenderer middle_leg;
	private final ModelRenderer cube_r20;
	private final ModelRenderer right_leg_r3;
	private final ModelRenderer lower3;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;

	public ModelNightmareMangle() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(1.0F, -13.0F, 2.0F);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0F, -3.3F, 3.4F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(48, 15).addBox(-4.0F, -2.0F, -9.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-1.0F, 18.7F, -0.6F);
		Head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 0.0F);
		head_r1.setTextureOffset(110, 14).addBox(2.0F, -23.0F, -14.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 102).addBox(-5.0F, -29.0F, -5.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
		head_r1.setTextureOffset(96, 88).addBox(-4.0F, -22.0F, -5.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		head_r1.setTextureOffset(74, 0).addBox(1.0F, -27.0F, -6.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(72, 14).addBox(-5.0F, -24.3F, 1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(75, 69).addBox(4.0F, -24.3F, 1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(24, 39).addBox(-4.0F, -30.0F, -5.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		head_r1.setTextureOffset(74, 3).addBox(-3.0F, -27.0F, -6.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(24, 17).addBox(-4.0F, -29.0F, -5.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);
		head_r1.setTextureOffset(64, 34).addBox(5.0F, -25.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		head_r1.setTextureOffset(48, 51).addBox(4.0F, -29.0F, -5.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
		head_r1.setTextureOffset(48, 17).addBox(8.0F, -25.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		head_r1.setTextureOffset(75, 69).addBox(6.0F, -25.0F, -2.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 2).addBox(7.0F, -25.0F, -1.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		head_r1.setTextureOffset(72, 14).addBox(-6.0F, -25.0F, -3.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		head_r1.setTextureOffset(7, 81).addBox(-7.0F, -25.0F, -2.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		head_r1.setTextureOffset(80, 13).addBox(-8.0F, -25.0F, -1.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		head_r1.setTextureOffset(55, 68).addBox(-9.0F, -25.0F, 0.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 12).addBox(-1.0F, -29.0F, -6.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 70).addBox(-3.0F, -29.0F, -6.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(13, 71).addBox(1.0F, -29.0F, -6.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(56, 7).addBox(-3.0F, -25.0F, -6.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(18, 58).addBox(1.0F, -25.0F, -6.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(72, 58).addBox(3.0F, -29.0F, -6.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(63, 88).addBox(-5.0F, -29.0F, -6.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(24, 39).addBox(-1.0F, -25.5F, -15.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head_r1.setTextureOffset(18, 57).addBox(-3.0F, -24.0F, -15.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		head_r1.setTextureOffset(48, 42).addBox(-2.0F, -25.0F, -14.0F, 4.0F, 1.0F, 8.0F, 0.0F, false);
		head_r1.setTextureOffset(18, 64).addBox(-5.0F, -29.0F, 3.0F, 10.0F, 7.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(114, 55).addBox(-3.0F, -23.0F, -15.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(110, 0).addBox(-3.0F, -23.0F, -14.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head_r1.setTextureOffset(72, 24).addBox(-3.0F, -24.0F, -9.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		LeftEar = new ModelRenderer(this);
		LeftEar.setRotationPoint(3.5F, -15.8F, 0.4F);
		Head.addChild(LeftEar);
		setRotationAngle(LeftEar, 0.0F, 0.0F, 0.7854F);
		LeftEar.setTextureOffset(28, 52).addBox(3.0284F, 2.3284F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		LeftEar.setTextureOffset(56, 11).addBox(2.5284F, 1.3284F, -2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		LeftEar.setTextureOffset(48, 48).addBox(2.5284F, -5.6716F, -2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		LeftEar.setTextureOffset(81, 57).addBox(1.6284F, -4.6716F, -2.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);

		RightEar = new ModelRenderer(this);
		RightEar.setRotationPoint(-5.5F, -15.8F, 0.4F);
		Head.addChild(RightEar);
		setRotationAngle(RightEar, 0.0F, 0.0F, -0.7854F);
		RightEar.setTextureOffset(13, 67).addBox(-4.0284F, 2.3284F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightEar.setTextureOffset(10, 58).addBox(-4.5284F, 1.3284F, -2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		RightEar.setTextureOffset(45, 57).addBox(-4.5284F, -5.6716F, -2.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		RightEar.setTextureOffset(27, 84).addBox(-5.6284F, -4.6716F, -2.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(-1.0F, -6.3F, -15.6F);
		Head.addChild(mouth);
		setRotationAngle(mouth, 0.2618F, 0.0F, 0.0F);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(0.0F, 24.1411F, 16.4548F);
		mouth.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, 0.0F);
		head_r2.setTextureOffset(96, 101).addBox(-4.0F, -16.688F, -8.0259F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		head_r2.setTextureOffset(0, 43).addBox(-4.0F, -15.688F, -8.0259F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		head_r2.setTextureOffset(48, 33).addBox(-2.0F, -14.688F, -17.0259F, 4.0F, 1.0F, 8.0F, 0.0F, false);
		head_r2.setTextureOffset(114, 61).addBox(-3.0F, -16.688F, -18.0259F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head_r2.setTextureOffset(56, 0).addBox(-3.0F, -15.688F, -18.0259F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		head_r2.setTextureOffset(110, 42).addBox(2.0F, -16.688F, -17.0259F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head_r2.setTextureOffset(110, 28).addBox(-3.0F, -16.688F, -17.0259F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head_r2.setTextureOffset(0, 0).addBox(-5.0F, -15.688F, -9.0259F, 10.0F, 2.0F, 10.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.1411F, 16.4548F);
		mouth.addChild(bone);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(head_r3);
		setRotationAngle(head_r3, 0.0F, 0.0F, 0.0F);
		head_r3.setTextureOffset(56, 7).addBox(-3.0F, -15.688F, -15.0259F, 6.0F, 1.0F, 6.0F, 0.0F, false);

		NightmareBody = new ModelRenderer(this);
		NightmareBody.setRotationPoint(0.0F, 5.0F, 0.0F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -5.0F, 0.0F);
		NightmareBody.addChild(body);
		body.setTextureOffset(58, 51).addBox(-2.5F, 5.0F, -1.5F, 9.0F, 4.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.1F, 13.0F, -2.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3034F, 0.0189F, 0.2174F);
		cube_r2.setTextureOffset(40, 15).addBox(-8.9F, -19.5F, -1.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(0, 97).addBox(3.1F, -19.5F, -1.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(79, 49).addBox(-2.9F, -20.0F, -1.5F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r2.setTextureOffset(48, 42).addBox(1.1F, -21.4F, -6.7F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r2.setTextureOffset(48, 33).addBox(-2.9F, -21.3F, -6.7F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r2.setTextureOffset(24, 34).addBox(-0.9F, -20.8F, -6.7F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r2.setTextureOffset(24, 43).addBox(-0.9F, -20.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r2.setTextureOffset(72, 28).addBox(-0.9F, -22.0F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r2.setTextureOffset(19, 81).addBox(-0.9F, -18.0F, -1.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.1F, 12.0F, -2.0F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.9163F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(85, 89).addBox(0.6F, 0.0F, 4.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(6.5286F, 8.1049F, -0.9278F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.9479F, -0.6917F, -0.3776F);
		cube_r4.setTextureOffset(92, 21).addBox(-1.0F, -1.5F, -1.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.7F, 13.5F, -6.8F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.7418F, 1.0036F, 0.0F);
		cube_r5.setTextureOffset(33, 92).addBox(-5.0F, -8.5F, -2.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 9.0F, -2.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -0.3034F, 0.0189F, 0.2174F);
		body_r1.setTextureOffset(109, 123).addBox(-2.0F, -17.0F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		body_r1.setTextureOffset(109, 123).addBox(-5.0F, -17.0F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		body_r1.setTextureOffset(102, 123).addBox(-5.0F, -17.0F, 1.5F, 12.0F, 3.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(118, 123).addBox(6.0F, -17.0F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		body_r1.setTextureOffset(118, 123).addBox(3.0F, -17.0F, -2.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		body_r1.setTextureOffset(124, 123).addBox(6.0F, -17.0F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(124, 123).addBox(-5.0F, -17.0F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(124, 123).addBox(-2.0F, -17.0F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(124, 123).addBox(3.0F, -17.0F, -3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(35, 124).addBox(-3.5F, -13.0F, -1.5F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body_r1.setTextureOffset(118, 126).addBox(-1.0F, -17.0F, -3.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(22, 113).addBox(-5.0F, -14.0F, -3.5F, 12.0F, 1.0F, 6.0F, 0.0F, false);
		body_r1.setTextureOffset(44, 124).addBox(-3.5F, -11.0F, -2.5F, 9.0F, 1.0F, 3.0F, 0.0F, false);
		body_r1.setTextureOffset(12, 124).addBox(4.5F, -13.0F, -1.5F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body_r1.setTextureOffset(10, 124).addBox(2.5F, -13.0F, -2.5F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body_r1.setTextureOffset(34, 125).addBox(-3.5F, -13.0F, -2.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(74, 124).addBox(-3.5F, -13.0F, 0.5F, 9.0F, 3.0F, 1.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, -25.3F, 7.4F);
		NightmareBody.addChild(neck);

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(15.0F, -3.0F, 4.0F);
		neck.addChild(head2);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 4.0F, -2.0F);
		head2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(0, 25).addBox(-4.0F, -2.0F, -9.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(0.0F, 26.0F, -6.0F);
		head2.addChild(head_r4);
		setRotationAngle(head_r4, 0.0F, 0.0F, 0.0F);
		head_r4.setTextureOffset(96, 88).addBox(-4.0F, -23.0F, -5.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		head_r4.setTextureOffset(24, 48).addBox(1.0F, -27.0F, -6.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head_r4.setTextureOffset(0, 0).addBox(-5.0F, -24.3F, 1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head_r4.setTextureOffset(46, 66).addBox(4.0F, -24.3F, 1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head_r4.setTextureOffset(0, 67).addBox(-3.0F, -27.0F, -6.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head_r4.setTextureOffset(0, 12).addBox(-4.0F, -29.0F, -5.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);

		NightmareLeftArm3 = new ModelRenderer(this);
		NightmareLeftArm3.setRotationPoint(-8.3F, 12.0F, -7.6F);
		head2.addChild(NightmareLeftArm3);
		setRotationAngle(NightmareLeftArm3, 0.1745F, -1.3526F, -2.0508F);

		freddyarm6 = new ModelRenderer(this);
		freddyarm6.setRotationPoint(1.0F, 0.0F, 0.0F);
		NightmareLeftArm3.addChild(freddyarm6);
		setRotationAngle(freddyarm6, 0.0F, 0.0F, -0.3927F);

		left_arm3 = new ModelRenderer(this);
		left_arm3.setRotationPoint(1.0F, 0.0F, 0.0F);
		NightmareLeftArm3.addChild(left_arm3);
		setRotationAngle(left_arm3, 0.0F, 0.0F, -0.3927F);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-6.9F, 17.8F, 0.0F);
		left_arm3.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(88, 38).addBox(5.8812F, -15.2353F, 1.8057F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(-7.0F, 13.8F, 0.0F);
		left_arm3.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, 0.0F, 0.0F, 0.0F);
		right_arm_r1.setTextureOffset(64, 78).addBox(5.4812F, -17.2353F, 1.3057F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, -2.2F, -0.7F);
		left_arm3.addChild(bone2);
		setRotationAngle(bone2, -1.6581F, 0.0F, 0.0F);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-9.0F, 11.0782F, 9.1572F);
		bone2.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, 0.0F, 0.0F, 0.0F);
		right_arm_r2.setTextureOffset(0, 34).addBox(5.9812F, -14.0983F, -13.0149F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-8.9F, 15.0782F, 9.1572F);
		bone2.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(48, 51).addBox(5.8812F, -13.0983F, -13.0149F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		lowerarm6 = new ModelRenderer(this);
		lowerarm6.setRotationPoint(2.0F, 6.2F, -0.3F);
		left_arm3.addChild(lowerarm6);
		setRotationAngle(lowerarm6, -0.6109F, 0.0F, 0.0F);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-8.9F, 12.0F, 0.7F);
		lowerarm6.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(22, 72).addBox(5.8812F, -8.7271F, 0.9258F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(-9.0F, 8.0F, 0.7F);
		lowerarm6.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, 0.0F, 0.0F, 0.0F);
		right_arm_r3.setTextureOffset(0, 34).addBox(5.9812F, -9.7271F, 0.9258F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		mouth2 = new ModelRenderer(this);
		mouth2.setRotationPoint(0.0F, 1.0F, -5.0F);
		head2.addChild(mouth2);
		setRotationAngle(mouth2, 0.2618F, 0.0F, 0.0F);

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(0.0F, 20.0F, 1.0F);
		mouth2.addChild(head_r5);
		setRotationAngle(head_r5, 0.0F, 0.0F, 0.0F);
		head_r5.setTextureOffset(96, 101).addBox(-4.0F, -16.688F, -8.0259F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		head_r5.setTextureOffset(32, 6).addBox(-4.0F, -15.688F, -8.0259F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 20.0F, 1.0F);
		mouth2.addChild(bone3);

		NightmareRightArm = new ModelRenderer(this);
		NightmareRightArm.setRotationPoint(-3.0F, -6.2F, 2.4F);

		freddyarm3 = new ModelRenderer(this);
		freddyarm3.setRotationPoint(-1.0F, -4.0F, 3.0F);
		NightmareRightArm.addChild(freddyarm3);
		setRotationAngle(freddyarm3, 0.0F, 0.0F, 0.3927F);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-1.0F, -4.0F, 3.0F);
		NightmareRightArm.addChild(right_arm);
		setRotationAngle(right_arm, 0.0F, 0.0F, 0.3927F);
		right_arm.setTextureOffset(64, 78).addBox(-1.9693F, 2.4955F, -4.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(89, 29).addBox(-1.4693F, 8.4955F, -3.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		lowerarm3 = new ModelRenderer(this);
		lowerarm3.setRotationPoint(-2.0F, 6.8F, 0.3F);
		right_arm.addChild(lowerarm3);
		setRotationAngle(lowerarm3, -1.1345F, 0.0F, 0.0F);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(8.9F, 12.0F, 0.7F);
		lowerarm3.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(8, 89).addBox(-8.3693F, -1.6256F, 1.004F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(9.0F, 8.0F, 0.7F);
		lowerarm3.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, 0.0F, 0.0F, 0.0F);
		right_arm_r4.setTextureOffset(0, 34).addBox(-8.4693F, -2.6256F, 1.004F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		NightmareRightArm2 = new ModelRenderer(this);
		NightmareRightArm2.setRotationPoint(3.0F, 10.2F, -0.8F);
		lowerarm3.addChild(NightmareRightArm2);
		setRotationAngle(NightmareRightArm2, -0.5738F, 0.0334F, -0.3914F);

		right_arm_r5 = new ModelRenderer(this);
		right_arm_r5.setRotationPoint(-9.8333F, -11.9708F, 0.6986F);
		NightmareRightArm2.addChild(right_arm_r5);
		setRotationAngle(right_arm_r5, -1.5708F, 1.2217F, -1.5708F);
		right_arm_r5.setTextureOffset(54, 0).addBox(0.0343F, 9.9026F, 8.8776F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		right_arm_r5.setTextureOffset(21, 103).addBox(-1.9657F, 9.9026F, 8.8776F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_arm_r5.setTextureOffset(36, 57).addBox(-1.9657F, 6.9026F, 8.8776F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		freddyarm4 = new ModelRenderer(this);
		freddyarm4.setRotationPoint(-1.0F, 0.0F, 0.0F);
		NightmareRightArm2.addChild(freddyarm4);
		setRotationAngle(freddyarm4, 0.0F, 0.0F, 0.3927F);

		right_arm2 = new ModelRenderer(this);
		right_arm2.setRotationPoint(-1.0F, 0.0F, 0.0F);
		NightmareRightArm2.addChild(right_arm2);
		setRotationAngle(right_arm2, 0.0F, 0.0F, 0.3927F);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(7.1522F, -3.7887F, 5.3493F);
		right_arm2.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(88, 79).addBox(-9.4419F, 10.1877F, -2.7337F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r11.setTextureOffset(64, 78).addBox(-9.9419F, 4.1877F, -3.2337F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		lowerarm4 = new ModelRenderer(this);
		lowerarm4.setRotationPoint(-2.0F, 6.8F, 0.3F);
		right_arm2.addChild(lowerarm4);
		setRotationAngle(lowerarm4, -1.1345F, 0.0F, 0.0F);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(9.1522F, -10.5887F, 5.0493F);
		lowerarm4.addChild(cube_r12);
		setRotationAngle(cube_r12, 2.138F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(77, 88).addBox(-9.4419F, -0.1656F, -7.6608F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		right_arm_r6 = new ModelRenderer(this);
		right_arm_r6.setRotationPoint(9.1522F, -10.5887F, 5.0493F);
		lowerarm4.addChild(right_arm_r6);
		setRotationAngle(right_arm_r6, 2.138F, 0.0F, 0.0F);
		right_arm_r6.setTextureOffset(0, 34).addBox(-9.4419F, -5.1656F, -7.6608F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		NightmareLeftArm = new ModelRenderer(this);
		NightmareLeftArm.setRotationPoint(11.0F, -3.0F, 2.3F);
		setRotationAngle(NightmareLeftArm, 1.3065F, 0.5944F, -0.1504F);

		freddyarm2 = new ModelRenderer(this);
		freddyarm2.setRotationPoint(-1.3033F, 3.2895F, 4.9874F);
		NightmareLeftArm.addChild(freddyarm2);
		setRotationAngle(freddyarm2, 0.0F, 0.0F, -0.3927F);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-1.3033F, 3.2895F, 4.9874F);
		NightmareLeftArm.addChild(left_arm);
		setRotationAngle(left_arm, 0.0F, 0.0F, -0.3927F);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-6.9F, 17.8F, 0.0F);
		left_arm.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.0F);
		cube_r13.setTextureOffset(91, 72).addBox(8.8166F, -13.584F, -5.8381F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		right_arm_r7 = new ModelRenderer(this);
		right_arm_r7.setRotationPoint(-7.0F, 13.8F, 0.0F);
		left_arm.addChild(right_arm_r7);
		setRotationAngle(right_arm_r7, 0.0F, 0.0F, 0.0F);
		right_arm_r7.setTextureOffset(64, 78).addBox(8.4166F, -15.584F, -6.3381F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		lowerarm2 = new ModelRenderer(this);
		lowerarm2.setRotationPoint(2.0F, 6.8F, 0.3F);
		left_arm.addChild(lowerarm2);
		setRotationAngle(lowerarm2, -1.1345F, 0.0F, 0.0F);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-8.9F, 12.0F, 0.7F);
		lowerarm2.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.0F);
		cube_r14.setTextureOffset(25, 91).addBox(8.8166F, -1.3152F, -3.8626F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		right_arm_r8 = new ModelRenderer(this);
		right_arm_r8.setRotationPoint(-9.0F, 8.0F, 0.7F);
		lowerarm2.addChild(right_arm_r8);
		setRotationAngle(right_arm_r8, 0.0F, 0.0F, 0.0F);
		right_arm_r8.setTextureOffset(0, 34).addBox(8.9166F, -2.3152F, -3.8626F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		NightmareLeftArm2 = new ModelRenderer(this);
		NightmareLeftArm2.setRotationPoint(-2.5F, 11.2F, 0.8F);
		lowerarm2.addChild(NightmareLeftArm2);

		freddyarm5 = new ModelRenderer(this);
		freddyarm5.setRotationPoint(1.0F, 0.0F, 0.0F);
		NightmareLeftArm2.addChild(freddyarm5);
		setRotationAngle(freddyarm5, 0.0F, 0.0F, -0.3927F);

		left_arm2 = new ModelRenderer(this);
		left_arm2.setRotationPoint(1.0F, 0.0F, 0.0F);
		NightmareLeftArm2.addChild(left_arm2);
		setRotationAngle(left_arm2, 0.0F, 0.0F, -0.3927F);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-6.9F, 17.8F, 0.0F);
		left_arm2.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.0F);
		cube_r15.setTextureOffset(69, 88).addBox(7.3367F, -9.2449F, -3.8626F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		right_arm_r9 = new ModelRenderer(this);
		right_arm_r9.setRotationPoint(-7.0F, 13.8F, 0.0F);
		left_arm2.addChild(right_arm_r9);
		setRotationAngle(right_arm_r9, 0.0F, 0.0F, 0.0F);
		right_arm_r9.setTextureOffset(64, 78).addBox(6.9367F, -11.2449F, -4.3626F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		lowerarm5 = new ModelRenderer(this);
		lowerarm5.setRotationPoint(2.0F, 6.8F, 0.3F);
		left_arm2.addChild(lowerarm5);
		setRotationAngle(lowerarm5, -1.1345F, 0.0F, 0.0F);

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-8.9F, 12.0F, 0.7F);
		lowerarm5.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.0F);
		cube_r16.setTextureOffset(88, 67).addBox(7.3367F, -1.2718F, 0.9048F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		right_arm_r10 = new ModelRenderer(this);
		right_arm_r10.setRotationPoint(-9.0F, 8.0F, 0.7F);
		lowerarm5.addChild(right_arm_r10);
		setRotationAngle(right_arm_r10, 0.0F, 0.0F, 0.0F);
		right_arm_r10.setTextureOffset(0, 34).addBox(7.4367F, -2.2718F, 0.9048F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.1F, 7.0F, -1.0F);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-6.1F, 11.0F, -2.5F);
		right_leg.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.1265F, 0.3419F, 0.2766F);
		cube_r17.setTextureOffset(41, 92).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		right_leg_r1 = new ModelRenderer(this);
		right_leg_r1.setRotationPoint(-1.6F, 2.5F, -0.8F);
		right_leg.addChild(right_leg_r1);
		setRotationAngle(right_leg_r1, -0.7418F, 1.0036F, 0.0F);
		right_leg_r1.setTextureOffset(76, 78).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		lower = new ModelRenderer(this);
		lower.setRotationPoint(2.0F, 1.0F, 4.0F);
		right_leg.addChild(lower);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 0.0F, 0.0F);
		lower.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.3927F, 0.0F);
		cube_r18.setTextureOffset(53, 87).addBox(-5.1F, 15.0F, -18.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r18.setTextureOffset(87, 60).addBox(-8.1F, 15.0F, -18.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r18.setTextureOffset(88, 9).addBox(-6.6F, 15.0F, -18.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r18.setTextureOffset(0, 67).addBox(-7.6F, 14.0F, -15.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-8.1F, 10.0F, -6.5F);
		lower.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.1265F, 0.3419F, 0.2766F);
		cube_r19.setTextureOffset(49, 92).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r19.setTextureOffset(0, 34).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(6.1F, 7.0F, -0.8F);
		setRotationAngle(left_leg, 0.0F, -0.5672F, 0.0F);
		left_leg.setTextureOffset(92, 14).addBox(-0.7563F, 4.0F, -7.3289F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		right_leg_r2 = new ModelRenderer(this);
		right_leg_r2.setRotationPoint(-2.2563F, 5.0F, -6.8289F);
		left_leg.addChild(right_leg_r2);
		setRotationAngle(right_leg_r2, -0.829F, 0.0F, 0.0F);
		right_leg_r2.setTextureOffset(76, 78).addBox(1.0F, -7.0F, -1.3F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		lower2 = new ModelRenderer(this);
		lower2.setRotationPoint(-4.1563F, 1.0F, -5.8289F);
		left_leg.addChild(lower2);
		lower2.setTextureOffset(33, 65).addBox(2.9F, 14.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
		lower2.setTextureOffset(85, 74).addBox(5.4F, 15.0F, -8.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		lower2.setTextureOffset(86, 16).addBox(3.9F, 15.0F, -8.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		lower2.setTextureOffset(86, 24).addBox(2.4F, 15.0F, -8.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		lower2.setTextureOffset(0, 34).addBox(3.4F, 6.0F, -1.5F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		lower2.setTextureOffset(92, 0).addBox(3.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		middle_leg = new ModelRenderer(this);
		middle_leg.setRotationPoint(1.1F, 8.0F, 2.0F);
		setRotationAngle(middle_leg, -3.1416F, 0.0F, 3.1416F);

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-0.6F, 15.0F, -9.5F);
		middle_leg.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.384F, 0.0F, 0.0F);
		cube_r20.setTextureOffset(90, 53).addBox(-1.0F, -12.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		right_leg_r3 = new ModelRenderer(this);
		right_leg_r3.setRotationPoint(-1.1F, 12.0F, -18.0F);
		middle_leg.addChild(right_leg_r3);
		setRotationAngle(right_leg_r3, -0.7418F, 0.0F, 0.0F);
		right_leg_r3.setTextureOffset(76, 78).addBox(-1.0F, -20.0F, 3.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		lower3 = new ModelRenderer(this);
		lower3.setRotationPoint(-3.0F, 0.0F, -18.0F);
		middle_leg.addChild(lower3);

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(2.4F, 15.0F, 8.5F);
		lower3.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.384F, 0.0F, 0.0F);
		cube_r21.setTextureOffset(90, 43).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r21.setTextureOffset(0, 34).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(2.4F, 14.375F, 8.75F);
		lower3.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, -1.0908F, 0.0F);
		cube_r22.setTextureOffset(82, 40).addBox(-2.0F, 0.625F, -8.25F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r22.setTextureOffset(82, 69).addBox(-0.5F, 0.625F, -8.25F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r22.setTextureOffset(84, 84).addBox(1.0F, 0.625F, -8.25F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r22.setTextureOffset(59, 59).addBox(-1.5F, -0.375F, -4.75F, 3.0F, 2.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		NightmareBody.render(matrixStack, buffer, packedLight, packedOverlay);
		NightmareRightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		NightmareLeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		middle_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_leg.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.NightmareLeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.NightmareRightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
	}
}