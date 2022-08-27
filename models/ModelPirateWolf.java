// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelPirateWolf extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer RightEar;
	private final ModelRenderer LeftEar;
	private final ModelRenderer LeftEar2;
	private final ModelRenderer mouth;
	private final ModelRenderer bone;
	private final ModelRenderer body;
	private final ModelRenderer endo;
	private final ModelRenderer right_arm;
	private final ModelRenderer freddyarm3;
	private final ModelRenderer lowerarm3;
	private final ModelRenderer left_arm;
	private final ModelRenderer freddyarm2;
	private final ModelRenderer lowerarm2;
	private final ModelRenderer right_leg;
	private final ModelRenderer lower3;
	private final ModelRenderer left_leg;
	private final ModelRenderer lower2;

	public ModelPirateWolf() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -19.0F, 3.0F);
		head.setTextureOffset(40, 69).addBox(-5.0F, -7.0F, -9.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(88, 84).addBox(-5.0F, -7.0F, -1.0F, 10.0F, 7.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(90, 77).addBox(-3.0F, -1.0F, -13.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(42, 89).addBox(-2.0F, -2.0F, -15.0F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(95, 57).addBox(-1.5F, -3.0F, -14.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(12, 58).addBox(-3.0F, -1.0F, -16.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(66, 17).addBox(-1.0F, -3.5F, -14.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(99, 92).addBox(-5.0F, -7.0F, -10.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(85, 101).addBox(3.0F, -7.0F, -10.0F, 2.0F, 6.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(78, 43).addBox(1.0F, -3.0F, -10.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(33, 77).addBox(-3.0F, -3.0F, -10.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(57, 73).addBox(1.0F, -7.0F, -10.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(43, 54).addBox(-3.0F, -7.0F, -10.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(38, 68).addBox(-1.0F, -7.0F, -10.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 68).addBox(4.0F, -7.0F, -9.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(66, 47).addBox(5.0F, 2.2F, -10.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(0, 52).addBox(5.0F, -5.8F, -10.0F, 1.0F, 5.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(50, 27).addBox(-6.0F, -5.8F, -10.0F, 1.0F, 5.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(12, 65).addBox(5.0F, 1.2F, -10.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(38, 57).addBox(5.0F, 0.2F, -10.0F, 3.0F, 1.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(44, 6).addBox(5.0F, -0.8F, -10.0F, 4.0F, 1.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(62, 32).addBox(-7.0F, 1.2F, -10.0F, 2.0F, 1.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(26, 66).addBox(-6.0F, 2.2F, -10.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(22, 54).addBox(-8.0F, 0.2F, -10.0F, 3.0F, 1.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(0, 41).addBox(-9.0F, -0.8F, -10.0F, 4.0F, 1.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(28, 24).addBox(-4.0F, -7.0F, -9.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 32).addBox(-4.0F, -8.0F, -9.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(78, 50).addBox(-3.0F, -5.0F, -10.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(50, 74).addBox(1.0F, -5.0F, -10.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(74, 58).addBox(-4.0F, 0.0F, -9.0F, 8.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(41, 4).addBox(-3.0F, 0.0F, -16.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(47, 98).addBox(-3.0F, 0.0F, -15.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(55, 4).addBox(-5.0F, -1.0F, -10.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(18, 52).addBox(3.0F, -1.0F, -10.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(96, 0).addBox(2.0F, 0.0F, -15.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(24, 37).addBox(-4.0F, -2.0F, -9.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		RightEar = new ModelRenderer(this);
		RightEar.setRotationPoint(-4.5F, -8.5F, -4.0F);
		head.addChild(RightEar);
		setRotationAngle(RightEar, 0.0F, 0.0F, -0.7854F);

		LeftEar = new ModelRenderer(this);
		LeftEar.setRotationPoint(4.1F, -8.5F, -4.0F);
		head.addChild(LeftEar);
		setRotationAngle(LeftEar, 0.0F, 0.0F, 0.4363F);
		LeftEar.setTextureOffset(6, 27).addBox(0.2F, 0.5F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		LeftEar.setTextureOffset(0, 49).addBox(-0.3F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		LeftEar.setTextureOffset(12, 52).addBox(-0.3F, -4.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		LeftEar.setTextureOffset(68, 50).addBox(-0.8F, -3.5F, -1.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		LeftEar.setTextureOffset(68, 50).addBox(-0.8F, -3.5F, -1.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		LeftEar.setTextureOffset(0, 49).addBox(-0.3F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		LeftEar.setTextureOffset(12, 52).addBox(-0.3F, -4.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		LeftEar2 = new ModelRenderer(this);
		LeftEar2.setRotationPoint(-4.1F, -8.5F, -4.0F);
		head.addChild(LeftEar2);
		setRotationAngle(LeftEar2, 0.0F, 0.0F, -0.4363F);
		LeftEar2.setTextureOffset(6, 16).addBox(-1.2F, 0.5F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		LeftEar2.setTextureOffset(12, 52).addBox(-1.7F, -4.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		LeftEar2.setTextureOffset(0, 49).addBox(-1.7F, -0.5F, -1.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		LeftEar2.setTextureOffset(68, 50).addBox(-2.2F, -3.5F, -1.5F, 3.0F, 3.0F, 1.0F, 0.0F, true);

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, 1.0F, -4.0F);
		head.addChild(mouth);
		setRotationAngle(mouth, 0.2618F, 0.0F, 0.0F);
		mouth.setTextureOffset(0, 10).addBox(-5.0F, 0.7071F, -6.0247F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		mouth.setTextureOffset(0, 21).addBox(-4.0F, 1.7071F, -6.0247F, 8.0F, 1.0F, 10.0F, 0.0F, false);
		mouth.setTextureOffset(0, 83).addBox(-2.0F, 1.7071F, -11.0247F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		mouth.setTextureOffset(77, 66).addBox(-4.0F, -0.2164F, -5.127F, 8.0F, 1.0F, 5.0F, 0.0F, false);
		mouth.setTextureOffset(47, 98).addBox(-3.0F, -0.2929F, -11.0247F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		mouth.setTextureOffset(18, 52).addBox(3.0F, -0.2929F, -6.0247F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		mouth.setTextureOffset(55, 4).addBox(-5.0F, -0.2929F, -6.0247F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		mouth.setTextureOffset(96, 0).addBox(2.0F, -0.2929F, -11.0247F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		mouth.setTextureOffset(41, 4).addBox(-3.0F, -0.2929F, -12.0247F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 20.0F, 1.0F);
		mouth.addChild(bone);
		bone.setTextureOffset(78, 50).addBox(-3.0F, -19.2929F, -13.0247F, 6.0F, 1.0F, 6.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(30, 17).addBox(-7.0F, -32.0F, -4.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(48, 43).addBox(-7.0F, -33.0F, -5.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(62, 24).addBox(-7.0F, -33.0F, 3.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(62, 4).addBox(-7.0F, -31.0F, -4.0F, 14.0F, 6.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(67, 91).addBox(-7.0F, -32.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(55, 90).addBox(6.0F, -32.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(28, 46).addBox(-7.0F, -32.0F, 2.0F, 14.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(38, 84).addBox(-6.0F, -24.0F, -3.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(88, 6).addBox(-3.0F, -20.0F, -3.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(62, 30).addBox(5.0F, -24.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(18, 45).addBox(-6.0F, -24.0F, -2.0F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(78, 72).addBox(-6.0F, -24.0F, 1.0F, 12.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(39, 20).addBox(-8.0F, -36.0F, -5.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(50, 6).addBox(7.0F, -36.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(24, 32).addBox(-8.0F, -36.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-8.0F, -37.0F, -5.0F, 16.0F, 1.0F, 9.0F, 0.0F, false);
		body.setTextureOffset(41, 0).addBox(-8.0F, -36.0F, 3.0F, 16.0F, 3.0F, 1.0F, 0.0F, false);

		endo = new ModelRenderer(this);
		endo.setRotationPoint(0.0F, -24.0F, 0.0F);
		body.addChild(endo);
		endo.setTextureOffset(22, 95).addBox(-4.5F, -8.0F, 1.5F, 9.0F, 3.0F, 0.0F, 0.0F, false);
		endo.setTextureOffset(62, 91).addBox(-4.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
		endo.setTextureOffset(38, 16).addBox(-1.5F, -6.0F, -2.5F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		endo.setTextureOffset(78, 53).addBox(1.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
		endo.setTextureOffset(41, 2).addBox(4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		endo.setTextureOffset(8, 54).addBox(-4.5F, -5.0F, -2.5F, 9.0F, 0.0F, 4.0F, 0.0F, false);
		endo.setTextureOffset(24, 10).addBox(-6.0F, -8.0F, -3.5F, 12.0F, 0.0F, 6.0F, 0.0F, false);
		endo.setTextureOffset(0, 21).addBox(2.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		endo.setTextureOffset(0, 10).addBox(5.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		endo.setTextureOffset(2, 10).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		endo.setTextureOffset(0, 0).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		endo.setTextureOffset(29, 19).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
		endo.setTextureOffset(29, 16).addBox(-2.0F, -12.0F, 1.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
		endo.setTextureOffset(24, 33).addBox(-4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		endo.setTextureOffset(30, 58).addBox(2.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		endo.setTextureOffset(46, 57).addBox(5.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		endo.setTextureOffset(0, 39).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		endo.setTextureOffset(38, 19).addBox(-2.0F, -9.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		endo.setTextureOffset(24, 36).addBox(3.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		endo.setTextureOffset(30, 54).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		endo.setTextureOffset(35, 21).addBox(-5.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		endo.setTextureOffset(8, 56).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		endo.setTextureOffset(88, 12).addBox(-6.0F, -12.0F, 2.5F, 12.0F, 4.0F, 0.0F, 0.0F, false);
		endo.setTextureOffset(8, 51).addBox(6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		endo.setTextureOffset(26, 26).addBox(6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		endo.setTextureOffset(26, 25).addBox(6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		endo.setTextureOffset(48, 36).addBox(6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		endo.setTextureOffset(8, 20).addBox(-6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		endo.setTextureOffset(0, 15).addBox(-6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		endo.setTextureOffset(26, 45).addBox(-6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		endo.setTextureOffset(0, 26).addBox(-6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		endo.setTextureOffset(64, 84).addBox(-4.5F, 0.0F, -2.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
		endo.setTextureOffset(36, 103).addBox(-5.5F, 3.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		endo.setTextureOffset(103, 16).addBox(3.5F, 3.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		endo.setTextureOffset(12, 96).addBox(-1.0F, -9.0F, -1.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		endo.setTextureOffset(58, 17).addBox(-1.0F, -12.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		endo.setTextureOffset(91, 92).addBox(-1.0F, -20.0F, 1.6F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		endo.setTextureOffset(74, 64).addBox(-1.0F, -11.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		endo.setTextureOffset(62, 11).addBox(-3.0F, -11.0F, -1.5F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		endo.setTextureOffset(18, 43).addBox(3.0F, -10.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		endo.setTextureOffset(18, 41).addBox(-9.0F, -10.5F, -1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-7.0F, -11.0F, 0.0F);

		freddyarm3 = new ModelRenderer(this);
		freddyarm3.setRotationPoint(-1.0F, 1.0F, 0.0F);
		right_arm.addChild(freddyarm3);
		setRotationAngle(freddyarm3, 0.0F, 0.0F, 0.3927F);
		freddyarm3.setTextureOffset(38, 54).addBox(-4.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
		freddyarm3.setTextureOffset(88, 18).addBox(-4.5F, -2.2F, -3.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		freddyarm3.setTextureOffset(72, 77).addBox(-5.3827F, -3.1239F, -3.5F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		freddyarm3.setTextureOffset(0, 52).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
		freddyarm3.setTextureOffset(40, 95).addBox(-4.5F, -1.2F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
		freddyarm3.setTextureOffset(79, 91).addBox(-3.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		freddyarm3.setTextureOffset(50, 69).addBox(-3.0F, 4.8F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		freddyarm3.setTextureOffset(10, 67).addBox(-4.5F, -1.2F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);

		lowerarm3 = new ModelRenderer(this);
		lowerarm3.setRotationPoint(-2.0F, 6.8F, 0.3F);
		freddyarm3.addChild(lowerarm3);
		setRotationAngle(lowerarm3, -1.1345F, 0.0F, 0.0F);
		lowerarm3.setTextureOffset(96, 42).addBox(-1.5F, 9.0F, -1.3F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		lowerarm3.setTextureOffset(0, 32).addBox(-1.0F, 2.0F, -0.8F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		lowerarm3.setTextureOffset(68, 45).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		lowerarm3.setTextureOffset(0, 41).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 7.0F, 1.0F, 0.0F, false);
		lowerarm3.setTextureOffset(26, 21).addBox(-2.0F, 2.0F, 1.2F, 4.0F, 7.0F, 1.0F, 0.0F, false);
		lowerarm3.setTextureOffset(0, 10).addBox(-2.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
		lowerarm3.setTextureOffset(0, 0).addBox(1.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(7.0F, -11.0F, 0.0F);

		freddyarm2 = new ModelRenderer(this);
		freddyarm2.setRotationPoint(1.0F, 1.0F, 0.0F);
		left_arm.addChild(freddyarm2);
		setRotationAngle(freddyarm2, 0.0F, 0.0F, -0.3927F);
		freddyarm2.setTextureOffset(20, 98).addBox(3.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
		freddyarm2.setTextureOffset(22, 89).addBox(-0.5F, -2.2F, -3.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		freddyarm2.setTextureOffset(78, 43).addBox(-0.6173F, -3.1239F, -3.5F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		freddyarm2.setTextureOffset(28, 98).addBox(-0.5F, -1.2F, -2.0F, 1.0F, 7.0F, 3.0F, 0.0F, false);
		freddyarm2.setTextureOffset(0, 96).addBox(-0.5F, -1.2F, -3.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);
		freddyarm2.setTextureOffset(92, 24).addBox(0.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		freddyarm2.setTextureOffset(77, 101).addBox(1.0F, 4.8F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		freddyarm2.setTextureOffset(96, 34).addBox(-0.5F, -1.2F, 1.0F, 5.0F, 7.0F, 1.0F, 0.0F, false);

		lowerarm2 = new ModelRenderer(this);
		lowerarm2.setRotationPoint(2.0F, 6.8F, 0.3F);
		freddyarm2.addChild(lowerarm2);
		setRotationAngle(lowerarm2, -1.1345F, 0.0F, 0.0F);
		lowerarm2.setTextureOffset(96, 50).addBox(-1.5F, 9.0F, -1.3F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		lowerarm2.setTextureOffset(52, 24).addBox(-1.0F, 2.0F, -0.8F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		lowerarm2.setTextureOffset(99, 99).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		lowerarm2.setTextureOffset(26, 65).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 7.0F, 1.0F, 0.0F, false);
		lowerarm2.setTextureOffset(54, 57).addBox(-2.0F, 2.0F, 1.2F, 4.0F, 7.0F, 1.0F, 0.0F, false);
		lowerarm2.setTextureOffset(0, 21).addBox(1.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);
		lowerarm2.setTextureOffset(0, 67).addBox(-2.0F, 2.0F, -0.8F, 1.0F, 7.0F, 2.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-4.1F, 3.0F, 0.0F);
		right_leg.setTextureOffset(73, 11).addBox(-2.9F, 2.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(58, 71).addBox(-2.9F, 10.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(50, 46).addBox(-2.9F, 18.0F, -6.0F, 5.0F, 3.0F, 8.0F, 0.0F, false);
		right_leg.setTextureOffset(98, 62).addBox(-1.4F, 8.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		lower3 = new ModelRenderer(this);
		lower3.setRotationPoint(4.0F, 5.0F, 0.0F);
		right_leg.addChild(lower3);
		lower3.setTextureOffset(37, 89).addBox(-5.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(4.1F, 3.0F, 0.0F);
		left_leg.setTextureOffset(18, 77).addBox(-2.1F, 2.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(76, 30).addBox(-2.1F, 10.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(56, 60).addBox(-2.1F, 18.0F, -6.0F, 5.0F, 3.0F, 8.0F, 0.0F, false);
		left_leg.setTextureOffset(103, 0).addBox(-0.6F, 8.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		lower2 = new ModelRenderer(this);
		lower2.setRotationPoint(-4.0F, 5.0F, 0.0F);
		left_leg.addChild(lower2);
		lower2.setTextureOffset(57, 102).addBox(3.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
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
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}