// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelNightmareFoxy extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer RightEar;
	private final ModelRenderer LeftEar;
	private final ModelRenderer mouth;
	private final ModelRenderer bone;
	private final ModelRenderer NightmareBody;
	private final ModelRenderer body;
	private final ModelRenderer NightmareRightArm;
	private final ModelRenderer freddyarm;
	private final ModelRenderer right_arm;
	private final ModelRenderer lowerarm;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer right_arm_r4;
	private final ModelRenderer right_leg;
	private final ModelRenderer lower;
	private final ModelRenderer left_leg;
	private final ModelRenderer lower2;
	private final ModelRenderer NightmareLeftArm;
	private final ModelRenderer freddyarm2;
	private final ModelRenderer left_arm;
	private final ModelRenderer lowerarm2;

	public ModelNightmareFoxy() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -19.0F, 4.0F);
		head.setTextureOffset(42, 50).addBox(-5.0F, -7.0F, -10.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(23, 65).addBox(-5.0F, -7.0F, -2.0F, 10.0F, 7.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(72, 38).addBox(-3.0F, -2.0F, -14.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 50).addBox(-2.0F, -3.0F, -19.0F, 4.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(54, 59).addBox(-3.0F, -2.0F, -20.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(40, 19).addBox(-1.0F, -3.5F, -20.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(78, 101).addBox(-5.0F, -7.0F, -11.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(101, 0).addBox(3.0F, -7.0F, -11.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 59).addBox(1.0F, -3.0F, -11.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(54, 9).addBox(-3.0F, -3.0F, -11.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(18, 62).addBox(1.0F, -7.0F, -11.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(18, 59).addBox(-3.0F, -7.0F, -11.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 22).addBox(-1.0F, -7.0F, -11.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(13, 101).addBox(-9.0F, -3.0F, -5.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(60, 72).addBox(-8.0F, -3.0F, -6.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(34, 50).addBox(-7.0F, -3.0F, -7.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(40, 75).addBox(-6.0F, -3.0F, -8.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 12).addBox(7.0F, -3.0F, -6.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(16, 50).addBox(6.0F, -3.0F, -7.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(100, 32).addBox(8.0F, -3.0F, -5.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(24, 50).addBox(4.0F, -7.0F, -10.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(12, 76).addBox(5.0F, -3.0F, -8.0F, 1.0F, 3.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 22).addBox(-4.0F, -7.0F, -10.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(24, 28).addBox(-4.0F, -8.0F, -10.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 66).addBox(-3.0F, -5.0F, -11.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(34, 50).addBox(4.0F, -2.3F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(16, 50).addBox(-5.0F, -2.3F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(64, 38).addBox(1.0F, -5.0F, -11.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(24, 37).addBox(-4.0F, 0.0F, -10.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 44).addBox(-3.0F, -1.0F, -20.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(70, 58).addBox(-4.0F, -1.0F, -19.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(12, 67).addBox(3.0F, -1.0F, -19.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 35).addBox(-4.0F, -2.0F, -10.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		RightEar = new ModelRenderer(this);
		RightEar.setRotationPoint(-4.5F, -8.5F, -5.0F);
		head.addChild(RightEar);
		setRotationAngle(RightEar, 0.0F, 0.0F, -0.7854F);
		RightEar.setTextureOffset(72, 59).addBox(-1.2F, -0.5F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		RightEar.setTextureOffset(72, 13).addBox(-1.7F, -1.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		RightEar.setTextureOffset(67, 17).addBox(-1.7F, -8.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		RightEar.setTextureOffset(98, 40).addBox(-2.8F, -7.5F, -1.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);

		LeftEar = new ModelRenderer(this);
		LeftEar.setRotationPoint(4.5F, -8.5F, -5.0F);
		head.addChild(LeftEar);
		setRotationAngle(LeftEar, 0.0F, 0.0F, 0.7854F);
		LeftEar.setTextureOffset(13, 69).addBox(0.2F, -0.5F, -1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		LeftEar.setTextureOffset(0, 63).addBox(-0.3F, -1.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		LeftEar.setTextureOffset(54, 13).addBox(-0.3F, -8.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		LeftEar.setTextureOffset(97, 92).addBox(-1.2F, -7.5F, -1.5F, 4.0F, 6.0F, 1.0F, 0.0F, false);

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, 1.0F, -5.0F);
		head.addChild(mouth);
		setRotationAngle(mouth, 0.2618F, 0.0F, 0.0F);
		mouth.setTextureOffset(0, 10).addBox(-5.0F, 0.7071F, -6.0247F, 10.0F, 2.0F, 10.0F, 0.0F, false);
		mouth.setTextureOffset(48, 33).addBox(-2.0F, 1.7071F, -14.0247F, 4.0F, 1.0F, 8.0F, 0.0F, false);
		mouth.setTextureOffset(54, 9).addBox(-3.0F, 0.7071F, -15.0247F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		mouth.setTextureOffset(30, 10).addBox(-4.0F, 0.7071F, -5.0247F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		mouth.setTextureOffset(41, 0).addBox(-4.0F, -0.2164F, -5.127F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		mouth.setTextureOffset(22, 73).addBox(-3.0F, -0.2929F, -14.0247F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		mouth.setTextureOffset(50, 72).addBox(2.0F, -0.2929F, -14.0247F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		mouth.setTextureOffset(54, 16).addBox(-3.0F, -0.2929F, -15.0247F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 20.0F, 1.0F);
		mouth.addChild(bone);
		bone.setTextureOffset(0, 59).addBox(-3.0F, -19.2929F, -13.0247F, 6.0F, 1.0F, 6.0F, 0.0F, false);

		NightmareBody = new ModelRenderer(this);
		NightmareBody.setRotationPoint(0.0F, 24.0F, 0.0F);
		NightmareBody.setTextureOffset(48, 42).addBox(-7.0F, -32.0F, -4.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		NightmareBody.setTextureOffset(68, 67).addBox(-1.0F, -30.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		NightmareBody.setTextureOffset(0, 10).addBox(-2.0F, -30.0F, -4.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		NightmareBody.setTextureOffset(51, 65).addBox(2.0F, -30.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		NightmareBody.setTextureOffset(46, 55).addBox(1.0F, -30.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		NightmareBody.setTextureOffset(56, 44).addBox(-2.0F, -31.0F, -4.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		NightmareBody.setTextureOffset(52, 50).addBox(-7.0F, -33.0F, -5.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		NightmareBody.setTextureOffset(48, 27).addBox(-7.0F, -33.0F, 3.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
		NightmareBody.setTextureOffset(88, 50).addBox(-7.0F, -31.0F, -4.0F, 5.0F, 6.0F, 1.0F, 0.0F, false);
		NightmareBody.setTextureOffset(36, 97).addBox(3.0F, -31.0F, -4.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		NightmareBody.setTextureOffset(68, 75).addBox(-7.0F, -32.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
		NightmareBody.setTextureOffset(0, 75).addBox(6.0F, -32.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
		NightmareBody.setTextureOffset(48, 19).addBox(-7.0F, -32.0F, 2.0F, 14.0F, 7.0F, 1.0F, 0.0F, false);
		NightmareBody.setTextureOffset(64, 33).addBox(-6.0F, -24.0F, -3.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
		NightmareBody.setTextureOffset(51, 66).addBox(-3.0F, -20.0F, -3.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);
		NightmareBody.setTextureOffset(102, 20).addBox(5.0F, -24.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		NightmareBody.setTextureOffset(101, 14).addBox(-6.0F, -24.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		NightmareBody.setTextureOffset(52, 52).addBox(-6.0F, -24.0F, 1.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
		NightmareBody.setTextureOffset(0, 46).addBox(-8.0F, -36.0F, -5.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);
		NightmareBody.setTextureOffset(0, 75).addBox(7.0F, -36.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		NightmareBody.setTextureOffset(60, 72).addBox(-8.0F, -36.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		NightmareBody.setTextureOffset(0, 0).addBox(-8.0F, -37.0F, -5.0F, 16.0F, 1.0F, 9.0F, 0.0F, false);
		NightmareBody.setTextureOffset(34, 46).addBox(-8.0F, -36.0F, 3.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -24.0F, 0.0F);
		NightmareBody.addChild(body);
		body.setTextureOffset(78, 29).addBox(-4.5F, -8.0F, 1.5F, 9.0F, 3.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(0, 69).addBox(-4.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(14, 45).addBox(-1.5F, -6.0F, -2.5F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(13, 66).addBox(1.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(24, 36).addBox(4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(64, 44).addBox(-4.5F, -5.0F, -2.5F, 9.0F, 0.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(18, 22).addBox(-6.0F, -8.0F, -3.5F, 12.0F, 0.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 22).addBox(2.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 10).addBox(5.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(2, 10).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(40, 7).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(23, 35).addBox(-2.0F, -12.0F, 1.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(24, 33).addBox(-4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(50, 75).addBox(2.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(48, 75).addBox(5.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(21, 44).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(13, 44).addBox(-2.0F, -9.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(38, 19).addBox(3.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(9, 75).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(0, 15).addBox(-5.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(44, 75).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(72, 9).addBox(-6.0F, -12.0F, 2.5F, 12.0F, 4.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(7, 74).addBox(6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(30, 15).addBox(6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(24, 25).addBox(6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(32, 72).addBox(6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(17, 68).addBox(-6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 15).addBox(-6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(66, 71).addBox(-6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(24, 24).addBox(-6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(65, 0).addBox(-4.5F, 0.0F, -2.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(103, 99).addBox(-5.5F, 3.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(103, 69).addBox(3.5F, 3.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(43, 84).addBox(-1.0F, -9.0F, -1.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(48, 33).addBox(-1.0F, -12.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(35, 84).addBox(-1.0F, -20.0F, 1.5F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(48, 37).addBox(-1.0F, -11.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(88, 13).addBox(-3.0F, -11.0F, -1.5F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(68, 48).addBox(3.0F, -10.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(60, 57).addBox(-9.0F, -10.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		NightmareRightArm = new ModelRenderer(this);
		NightmareRightArm.setRotationPoint(-7.0F, -10.0F, 0.0F);

		freddyarm = new ModelRenderer(this);
		freddyarm.setRotationPoint(-1.0F, 0.0F, 0.0F);
		NightmareRightArm.addChild(freddyarm);
		setRotationAngle(freddyarm, 0.0F, 0.0F, 0.3927F);
		freddyarm.setTextureOffset(61, 95).addBox(-4.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
		freddyarm.setTextureOffset(73, 52).addBox(-4.5F, -2.2F, -3.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		freddyarm.setTextureOffset(28, 94).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
		freddyarm.setTextureOffset(90, 19).addBox(-4.5F, -1.2F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
		freddyarm.setTextureOffset(89, 0).addBox(-4.5F, -1.2F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-1.0F, 0.0F, 0.0F);
		NightmareRightArm.addChild(right_arm);
		setRotationAngle(right_arm, 0.0F, 0.0F, 0.3927F);
		right_arm.setTextureOffset(23, 82).addBox(-3.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(69, 102).addBox(-3.0F, 4.8F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		lowerarm = new ModelRenderer(this);
		lowerarm.setRotationPoint(-2.0F, 6.8F, 0.3F);
		right_arm.addChild(lowerarm);
		setRotationAngle(lowerarm, -1.1345F, 0.0F, 0.0F);
		lowerarm.setTextureOffset(68, 67).addBox(-2.5F, 9.0F, -2.3F, 5.0F, 3.0F, 5.0F, 0.0F, false);
		lowerarm.setTextureOffset(102, 26).addBox(-1.0F, 12.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		lowerarm.setTextureOffset(41, 0).addBox(-4.1F, 17.0F, -0.8F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		lowerarm.setTextureOffset(95, 99).addBox(-1.0F, 2.0F, -0.8F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		lowerarm.setTextureOffset(102, 58).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		lowerarm.setTextureOffset(94, 84).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 7.0F, 1.0F, 0.0F, false);
		lowerarm.setTextureOffset(92, 57).addBox(-2.0F, 2.0F, 1.2F, 4.0F, 7.0F, 1.0F, 0.0F, false);
		lowerarm.setTextureOffset(52, 99).addBox(-2.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
		lowerarm.setTextureOffset(46, 97).addBox(1.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(0.0F, 14.5F, 0.2F);
		lowerarm.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, 0.0F, 0.0F, 0.829F);
		right_arm_r1.setTextureOffset(0, 50).addBox(-1.0F, -0.3F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-1.045F, 23.2157F, 0.2F);
		lowerarm.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, 0.0F, 0.0F, -1.5708F);
		right_arm_r2.setTextureOffset(100, 63).addBox(-1.4234F, -0.1743F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(-3.1F, 21.5F, 0.2F);
		lowerarm.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, 0.0F, 0.0F, 0.5672F);
		right_arm_r3.setTextureOffset(100, 47).addBox(4.6F, -4.5F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(-3.1F, 21.5F, 0.2F);
		lowerarm.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, 0.0F, 0.0F, -0.829F);
		right_arm_r4.setTextureOffset(100, 75).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-4.1F, 3.0F, 0.0F);
		right_leg.setTextureOffset(8, 94).addBox(1.1F, 2.0F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(88, 66).addBox(-2.9F, 2.0F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
		right_leg.setTextureOffset(75, 90).addBox(-2.9F, 1.0F, -2.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(63, 87).addBox(-2.9F, 2.0F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
		right_leg.setTextureOffset(51, 81).addBox(-1.9F, 2.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(29, 104).addBox(-1.4F, 8.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		lower = new ModelRenderer(this);
		lower.setRotationPoint(4.0F, 5.0F, 0.0F);
		right_leg.addChild(lower);
		lower.setTextureOffset(0, 35).addBox(-5.4F, 6.0F, -1.5F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		lower.setTextureOffset(37, 104).addBox(-5.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		lower.setTextureOffset(38, 66).addBox(-5.9F, 14.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
		lower.setTextureOffset(97, 70).addBox(-4.9F, 15.0F, -8.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		lower.setTextureOffset(69, 97).addBox(-6.4F, 15.0F, -8.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		lower.setTextureOffset(96, 27).addBox(-3.4F, 15.0F, -8.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(4.1F, 3.0F, 0.0F);
		left_leg.setTextureOffset(92, 74).addBox(-2.1F, 2.0F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(86, 42).addBox(-2.1F, 2.0F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 87).addBox(1.9F, 1.0F, -2.0F, 1.0F, 8.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(11, 86).addBox(-2.1F, 2.0F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
		left_leg.setTextureOffset(80, 75).addBox(-1.1F, 2.0F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(21, 102).addBox(-0.6F, 8.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		lower2 = new ModelRenderer(this);
		lower2.setRotationPoint(-4.0F, 5.0F, 0.0F);
		left_leg.addChild(lower2);
		lower2.setTextureOffset(0, 66).addBox(2.9F, 14.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
		lower2.setTextureOffset(48, 75).addBox(5.4F, 15.0F, -8.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		lower2.setTextureOffset(20, 76).addBox(3.9F, 15.0F, -8.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		lower2.setTextureOffset(96, 8).addBox(2.4F, 15.0F, -8.5F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		lower2.setTextureOffset(30, 10).addBox(3.4F, 6.0F, -1.5F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		lower2.setTextureOffset(101, 53).addBox(3.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		NightmareLeftArm = new ModelRenderer(this);
		NightmareLeftArm.setRotationPoint(7.0F, -10.0F, 0.0F);

		freddyarm2 = new ModelRenderer(this);
		freddyarm2.setRotationPoint(1.0F, 0.0F, 0.0F);
		NightmareLeftArm.addChild(freddyarm2);
		setRotationAngle(freddyarm2, 0.0F, 0.0F, -0.3927F);
		freddyarm2.setTextureOffset(20, 92).addBox(3.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
		freddyarm2.setTextureOffset(73, 13).addBox(-0.5F, -2.2F, -3.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		freddyarm2.setTextureOffset(89, 90).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
		freddyarm2.setTextureOffset(80, 85).addBox(-0.5F, -1.2F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
		freddyarm2.setTextureOffset(80, 58).addBox(-0.5F, -1.2F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(1.0F, 0.0F, 0.0F);
		NightmareLeftArm.addChild(left_arm);
		setRotationAngle(left_arm, 0.0F, 0.0F, -0.3927F);
		left_arm.setTextureOffset(78, 19).addBox(0.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(41, 50).addBox(1.0F, 4.8F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		lowerarm2 = new ModelRenderer(this);
		lowerarm2.setRotationPoint(2.0F, 6.8F, 0.3F);
		left_arm.addChild(lowerarm2);
		setRotationAngle(lowerarm2, -1.1345F, 0.0F, 0.0F);
		lowerarm2.setTextureOffset(32, 75).addBox(-1.5F, 9.0F, -1.3F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		lowerarm2.setTextureOffset(86, 100).addBox(0.5F, 12.0F, -1.3F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		lowerarm2.setTextureOffset(28, 55).addBox(-1.5F, 12.0F, -1.3F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		lowerarm2.setTextureOffset(0, 98).addBox(-1.0F, 2.0F, -0.8F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		lowerarm2.setTextureOffset(23, 50).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		lowerarm2.setTextureOffset(51, 91).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 7.0F, 1.0F, 0.0F, false);
		lowerarm2.setTextureOffset(90, 32).addBox(-2.0F, 2.0F, 1.2F, 4.0F, 7.0F, 1.0F, 0.0F, false);
		lowerarm2.setTextureOffset(83, 93).addBox(1.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
		lowerarm2.setTextureOffset(0, 0).addBox(-2.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		NightmareBody.render(matrixStack, buffer, packedLight, packedOverlay);
		NightmareRightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		NightmareLeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.NightmareLeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.NightmareRightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}