// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelNightHare extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer head_r6;
	private final ModelRenderer head_r7;
	private final ModelRenderer head_r8;
	private final ModelRenderer mouth;
	private final ModelRenderer FredbearBody;
	private final ModelRenderer body;
	private final ModelRenderer FrebearRightArm;
	private final ModelRenderer freddyarm;
	private final ModelRenderer right_arm;
	private final ModelRenderer cube_r1;
	private final ModelRenderer lowerarm;
	private final ModelRenderer FrebearLeftArm;
	private final ModelRenderer freddyarm2;
	private final ModelRenderer left_arm;
	private final ModelRenderer cube_r2;
	private final ModelRenderer lowerarm2;
	private final ModelRenderer right_leg;
	private final ModelRenderer lower;
	private final ModelRenderer left_leg;
	private final ModelRenderer lower2;

	public ModelNightHare() {
		textureWidth = 256;
		textureHeight = 256;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -21.0F, 4.0F);
		head.setTextureOffset(22, 66).addBox(-6.0F, -7.0F, -11.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(82, 11).addBox(-6.0F, -7.0F, -1.0F, 12.0F, 7.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(93, 60).addBox(-4.0F, -3.0F, -15.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(117, 85).addBox(-1.0F, -4.0F, -14.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(24, 56).addBox(-6.0F, -7.0F, -12.0F, 3.0F, 7.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 56).addBox(3.0F, -7.0F, -12.0F, 3.0F, 7.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(73, 47).addBox(1.0F, -3.0F, -12.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(7, 12).addBox(-3.0F, -3.0F, -12.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(92, 19).addBox(1.0F, -7.0F, -12.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(68, 89).addBox(-3.0F, -7.0F, -12.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 65).addBox(-1.0F, -7.0F, -12.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(30, 95).addBox(-7.0F, -3.0F, -10.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 65).addBox(5.0F, -7.0F, -11.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(12, 94).addBox(6.0F, -3.0F, -10.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(49, 47).addBox(-4.0F, -7.0F, -10.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(24, 25).addBox(-5.0F, -9.0F, -12.0F, 10.0F, 2.0F, 12.0F, 0.0F, false);
		head.setTextureOffset(83, 101).addBox(-3.0F, -5.0F, -11.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(72, 60).addBox(4.0F, -2.3F, -4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(6, 65).addBox(-5.0F, -2.3F, -4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(98, 19).addBox(1.0F, -5.0F, -11.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(58, 11).addBox(-4.0F, 0.0F, -11.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(124, 68).addBox(-6.0F, 0.0F, -11.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(124, 62).addBox(5.0F, 0.0F, -11.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(56, 117).addBox(3.0F, 0.0F, -15.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(105, 16).addBox(-4.0F, 0.0F, -15.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(68, 37).addBox(-3.0F, 0.0F, -15.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(22, 74).addBox(-6.0F, 0.0F, -12.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(46, 66).addBox(4.0F, 0.0F, -12.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(24, 57).addBox(-4.0F, -2.0F, -10.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-2.8F, -8.216F, -5.9466F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.2608F, 0.0094F, -0.218F);
		head_r1.setTextureOffset(69, 22).addBox(-1.0F, -9.784F, -1.0534F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		head_r1.setTextureOffset(0, 113).addBox(-2.5F, -8.784F, -1.0534F, 5.0F, 7.0F, 2.0F, 0.0F, true);
		head_r1.setTextureOffset(15, 90).addBox(-1.0F, -1.784F, -1.0534F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(-2.5F, -6.916F, -4.4466F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.7844F, 0.0094F, -0.218F);
		head_r2.setTextureOffset(69, 22).addBox(-1.0F, -16.2562F, 3.4624F, 2.0F, 1.0F, 2.0F, 0.0F, true);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(-2.5F, -6.916F, -4.4466F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, 1.657F, 0.0094F, -0.218F);
		head_r3.setTextureOffset(68, 92).addBox(-2.5F, -10.2184F, 13.9727F, 5.0F, 3.0F, 2.0F, 0.0F, true);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(-2.8F, -8.216F, -5.9466F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, 0.7844F, 0.0094F, -0.218F);
		head_r4.setTextureOffset(22, 95).addBox(-2.5F, -13.2562F, 3.5624F, 5.0F, 5.0F, 2.0F, 0.0F, true);

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(2.5F, -6.916F, -4.4466F);
		head.addChild(head_r5);
		setRotationAngle(head_r5, 1.657F, -0.0094F, 0.218F);
		head_r5.setTextureOffset(68, 92).addBox(-2.5F, -10.2184F, 13.9727F, 5.0F, 3.0F, 2.0F, 0.0F, false);

		head_r6 = new ModelRenderer(this);
		head_r6.setRotationPoint(2.5F, -6.916F, -4.4466F);
		head.addChild(head_r6);
		setRotationAngle(head_r6, 0.7844F, -0.0094F, 0.218F);
		head_r6.setTextureOffset(69, 22).addBox(-1.0F, -16.2562F, 3.4624F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		head_r7 = new ModelRenderer(this);
		head_r7.setRotationPoint(2.8F, -8.216F, -5.9466F);
		head.addChild(head_r7);
		setRotationAngle(head_r7, 0.2608F, -0.0094F, 0.218F);
		head_r7.setTextureOffset(69, 22).addBox(-1.0F, -9.784F, -1.0534F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head_r7.setTextureOffset(0, 113).addBox(-2.5F, -8.784F, -1.0534F, 5.0F, 7.0F, 2.0F, 0.0F, false);
		head_r7.setTextureOffset(15, 90).addBox(-1.0F, -1.784F, -1.0534F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		head_r8 = new ModelRenderer(this);
		head_r8.setRotationPoint(2.8F, -8.216F, -5.9466F);
		head.addChild(head_r8);
		setRotationAngle(head_r8, 0.7844F, -0.0094F, 0.218F);
		head_r8.setTextureOffset(22, 95).addBox(-2.5F, -13.2562F, 3.5624F, 5.0F, 5.0F, 2.0F, 0.0F, false);

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, 3.0F, -5.0F);
		head.addChild(mouth);
		setRotationAngle(mouth, 0.2618F, 0.0F, 0.0F);
		mouth.setTextureOffset(23, 12).addBox(-6.0F, 0.7071F, -7.0247F, 12.0F, 2.0F, 11.0F, 0.0F, false);
		mouth.setTextureOffset(98, 86).addBox(-4.0F, 0.7071F, -10.0247F, 8.0F, 2.0F, 3.0F, 0.0F, false);
		mouth.setTextureOffset(0, 56).addBox(-4.0F, 0.7071F, -5.0247F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		mouth.setTextureOffset(48, 60).addBox(-4.0F, -0.2929F, -6.0247F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		mouth.setTextureOffset(12, 70).addBox(-4.0F, -0.2929F, -10.0247F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		mouth.setTextureOffset(64, 75).addBox(-6.0F, -0.2929F, -7.0247F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		mouth.setTextureOffset(44, 75).addBox(4.0F, -0.2929F, -7.0247F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		mouth.setTextureOffset(0, 82).addBox(-4.0F, -0.2929F, -9.0247F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		mouth.setTextureOffset(4, 72).addBox(3.0F, -0.2929F, -9.0247F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		mouth.setTextureOffset(20, 125).addBox(5.0F, -0.2929F, -6.0247F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		mouth.setTextureOffset(124, 110).addBox(-6.0F, -0.2929F, -6.0247F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		FredbearBody = new ModelRenderer(this);
		FredbearBody.setRotationPoint(0.0F, 24.0F, 0.0F);
		FredbearBody.setTextureOffset(58, 20).addBox(-8.0F, -32.0F, -5.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(0, 49).addBox(-8.0F, -33.0F, -6.0F, 16.0F, 1.0F, 0.0F, 0.0F, false);
		FredbearBody.setTextureOffset(44, 79).addBox(-7.0F, -33.0F, 4.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(47, 0).addBox(-9.0F, -31.0F, -5.0F, 18.0F, 6.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(80, 29).addBox(-7.0F, -26.0F, -6.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(56, 31).addBox(-8.0F, -31.0F, -6.0F, 16.0F, 5.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(0, 12).addBox(4.4F, -37.5F, -7.5F, 5.0F, 11.0F, 13.0F, 0.0F, false);
		FredbearBody.setTextureOffset(0, 12).addBox(-9.4F, -37.5F, -7.5F, 5.0F, 11.0F, 13.0F, 0.0F, true);
		FredbearBody.setTextureOffset(74, 79).addBox(-4.4F, -37.5F, 3.5F, 9.0F, 11.0F, 2.0F, 0.0F, false);
		FredbearBody.setTextureOffset(80, 27).addBox(-7.0F, -32.0F, -6.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(84, 44).addBox(-6.0F, -35.0F, -7.0F, 12.0F, 2.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(85, 4).addBox(-5.0F, -36.0F, -7.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(0, 50).addBox(-5.0F, -37.0F, -7.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(79, 68).addBox(-7.0F, -33.0F, -7.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(59, 90).addBox(-9.0F, -32.0F, -4.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);
		FredbearBody.setTextureOffset(89, 85).addBox(8.0F, -32.0F, -4.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);
		FredbearBody.setTextureOffset(46, 39).addBox(-9.0F, -32.0F, 3.0F, 18.0F, 7.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(81, 55).addBox(-7.0F, -24.0F, -4.0F, 14.0F, 4.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(85, 0).addBox(-6.0F, -24.0F, -5.0F, 12.0F, 3.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(84, 6).addBox(-6.0F, -25.0F, -6.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(0, 82).addBox(-3.0F, -20.0F, -4.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		FredbearBody.setTextureOffset(121, 102).addBox(6.0F, -24.0F, -3.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		FredbearBody.setTextureOffset(121, 42).addBox(-7.0F, -24.0F, -3.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		FredbearBody.setTextureOffset(124, 3).addBox(-8.0F, -24.0F, -3.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		FredbearBody.setTextureOffset(80, 125).addBox(-9.0F, -24.0F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		FredbearBody.setTextureOffset(107, 122).addBox(7.0F, -24.0F, -3.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		FredbearBody.setTextureOffset(125, 124).addBox(8.0F, -24.0F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		FredbearBody.setTextureOffset(80, 22).addBox(-7.0F, -24.0F, 2.0F, 14.0F, 4.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(47, 7).addBox(-9.0F, -36.0F, -6.0F, 18.0F, 3.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(23, 12).addBox(8.0F, -36.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(6, 0).addBox(8.0F, -36.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(0, 12).addBox(-9.0F, -36.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(0, 0).addBox(-9.0F, -36.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(6, 122).addBox(-4.0F, -36.5F, -8.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(117, 110).addBox(1.0F, -36.5F, -8.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(94, 51).addBox(-1.0F, -36.0F, -8.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(101, 51).addBox(-1.5F, -32.0F, -7.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		FredbearBody.setTextureOffset(0, 0).addBox(-9.0F, -37.0F, -6.0F, 18.0F, 1.0F, 11.0F, 0.0F, false);
		FredbearBody.setTextureOffset(0, 52).addBox(-9.0F, -36.0F, 4.0F, 18.0F, 3.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -24.0F, 0.0F);
		FredbearBody.addChild(body);
		body.setTextureOffset(38, 52).addBox(-4.5F, -8.0F, 1.5F, 9.0F, 3.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(65, 104).addBox(-4.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(7, 16).addBox(-1.5F, -6.0F, -2.5F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(89, 101).addBox(1.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(48, 56).addBox(4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(8, 66).addBox(-4.5F, -5.0F, -2.5F, 9.0F, 0.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(50, 25).addBox(-6.0F, -8.0F, -3.5F, 12.0F, 0.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(23, 39).addBox(2.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(19, 39).addBox(5.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(21, 39).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(17, 39).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(38, 56).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(30, 56).addBox(-2.0F, -12.0F, 1.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(46, 43).addBox(-4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(34, 66).addBox(2.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(30, 66).addBox(5.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(12, 65).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(58, 22).addBox(-2.0F, -9.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(31, 36).addBox(3.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(31, 39).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(0, 16).addBox(-5.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(31, 43).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(94, 47).addBox(-6.0F, -12.0F, 2.5F, 12.0F, 4.0F, 0.0F, 0.0F, false);
		body.setTextureOffset(2, 35).addBox(6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(38, 51).addBox(6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(23, 42).addBox(6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 35).addBox(6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(29, 11).addBox(-6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(23, 32).addBox(-6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(31, 11).addBox(-6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(23, 41).addBox(-6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(84, 70).addBox(-4.5F, 0.0F, -2.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(87, 125).addBox(-5.5F, 2.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(125, 35).addBox(3.5F, 2.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(99, 122).addBox(-1.0F, -9.0F, -1.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(41, 85).addBox(-1.0F, -12.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(77, 112).addBox(-1.0F, -22.0F, 2.5F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(122, 23).addBox(-1.0F, -11.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(40, 97).addBox(-3.0F, -11.0F, -1.5F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(85, 8).addBox(3.0F, -10.5F, -1.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(12, 72).addBox(-11.0F, -10.5F, -1.5F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		FrebearRightArm = new ModelRenderer(this);
		FrebearRightArm.setRotationPoint(-10.0F, -10.0F, 0.0F);

		freddyarm = new ModelRenderer(this);
		freddyarm.setRotationPoint(-1.0F, 0.0F, 0.0F);
		FrebearRightArm.addChild(freddyarm);
		setRotationAngle(freddyarm, 0.0F, 0.0F, 0.3927F);
		freddyarm.setTextureOffset(65, 112).addBox(-5.5F, -1.2F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
		freddyarm.setTextureOffset(73, 47).addBox(-5.5F, -2.2F, -4.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);
		freddyarm.setTextureOffset(98, 110).addBox(0.5F, -1.2F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
		freddyarm.setTextureOffset(111, 51).addBox(-5.5F, -1.2F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
		freddyarm.setTextureOffset(111, 0).addBox(-5.5F, -1.2F, 2.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-1.0F, 0.0F, 0.0F);
		FrebearRightArm.addChild(right_arm);
		setRotationAngle(right_arm, 0.0F, 0.0F, 0.3927F);
		right_arm.setTextureOffset(0, 90).addBox(-4.5F, -1.2F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.0F, 6.3F, -0.5F);
		right_arm.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(64, 69).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		lowerarm = new ModelRenderer(this);
		lowerarm.setRotationPoint(-2.0F, 6.8F, 0.3F);
		right_arm.addChild(lowerarm);
		setRotationAngle(lowerarm, -1.1345F, 0.0F, 0.0F);
		lowerarm.setTextureOffset(43, 101).addBox(-2.5F, 9.0F, -2.3F, 5.0F, 3.0F, 5.0F, 0.0F, false);
		lowerarm.setTextureOffset(85, 117).addBox(-2.5F, 12.0F, -2.3F, 2.0F, 3.0F, 5.0F, 0.0F, false);
		lowerarm.setTextureOffset(67, 125).addBox(-2.5F, 15.0F, -2.3F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		lowerarm.setTextureOffset(6, 38).addBox(1.5F, 14.0F, -2.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		lowerarm.setTextureOffset(0, 85).addBox(0.5F, 12.0F, -2.3F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		lowerarm.setTextureOffset(16, 105).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		lowerarm.setTextureOffset(27, 125).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		lowerarm.setTextureOffset(51, 121).addBox(-3.0F, 2.0F, -2.8F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		lowerarm.setTextureOffset(37, 121).addBox(-3.0F, 2.0F, 2.2F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		lowerarm.setTextureOffset(122, 12).addBox(-3.0F, 2.0F, -1.8F, 1.0F, 7.0F, 4.0F, 0.0F, false);
		lowerarm.setTextureOffset(10, 122).addBox(2.0F, 2.0F, -1.8F, 1.0F, 7.0F, 4.0F, 0.0F, false);

		FrebearLeftArm = new ModelRenderer(this);
		FrebearLeftArm.setRotationPoint(10.0F, -10.0F, 0.0F);

		freddyarm2 = new ModelRenderer(this);
		freddyarm2.setRotationPoint(1.0F, 0.0F, 0.0F);
		FrebearLeftArm.addChild(freddyarm2);
		setRotationAngle(freddyarm2, 0.0F, 0.0F, -0.3927F);
		freddyarm2.setTextureOffset(44, 109).addBox(4.5F, -1.2F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
		freddyarm2.setTextureOffset(72, 60).addBox(-1.5F, -2.2F, -4.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);
		freddyarm2.setTextureOffset(32, 106).addBox(-1.5F, -1.2F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
		freddyarm2.setTextureOffset(108, 8).addBox(-1.5F, -1.2F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
		freddyarm2.setTextureOffset(87, 107).addBox(-1.5F, -1.2F, 2.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(1.0F, 0.0F, 0.0F);
		FrebearLeftArm.addChild(left_arm);
		setRotationAngle(left_arm, 0.0F, 0.0F, -0.3927F);
		left_arm.setTextureOffset(85, 32).addBox(-0.5F, -1.2F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(2.0F, 6.3F, -0.5F);
		left_arm.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(58, 11).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		lowerarm2 = new ModelRenderer(this);
		lowerarm2.setRotationPoint(2.0F, 6.8F, 0.3F);
		left_arm.addChild(lowerarm2);
		setRotationAngle(lowerarm2, -1.1345F, 0.0F, 0.0F);
		lowerarm2.setTextureOffset(90, 99).addBox(-2.5F, 9.0F, -2.3F, 5.0F, 3.0F, 5.0F, 0.0F, false);
		lowerarm2.setTextureOffset(23, 117).addBox(0.5F, 12.0F, -2.3F, 2.0F, 3.0F, 5.0F, 0.0F, false);
		lowerarm2.setTextureOffset(60, 124).addBox(1.5F, 15.0F, -2.3F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		lowerarm2.setTextureOffset(6, 36).addBox(-2.5F, 14.0F, -2.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		lowerarm2.setTextureOffset(73, 51).addBox(-2.5F, 12.0F, -2.3F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		lowerarm2.setTextureOffset(34, 66).addBox(-2.0F, 2.0F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		lowerarm2.setTextureOffset(96, 77).addBox(-1.0F, 7.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		lowerarm2.setTextureOffset(115, 59).addBox(-3.0F, 2.0F, -2.8F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		lowerarm2.setTextureOffset(110, 114).addBox(-3.0F, 2.0F, 2.2F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		lowerarm2.setTextureOffset(120, 118).addBox(2.0F, 2.0F, -1.8F, 1.0F, 7.0F, 4.0F, 0.0F, false);
		lowerarm2.setTextureOffset(0, 36).addBox(-3.0F, 2.0F, -1.8F, 1.0F, 7.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-4.1F, 3.0F, 0.0F);
		right_leg.setTextureOffset(110, 16).addBox(2.1F, 2.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(110, 39).addBox(-3.9F, 2.0F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
		right_leg.setTextureOffset(58, 104).addBox(-3.9F, 1.0F, -3.0F, 1.0F, 8.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(108, 69).addBox(-3.9F, 2.0F, 2.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
		right_leg.setTextureOffset(46, 85).addBox(-2.9F, 2.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(126, 96).addBox(-1.4F, 7.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		lower = new ModelRenderer(this);
		lower.setRotationPoint(4.0F, 5.0F, 0.0F);
		right_leg.addChild(lower);
		lower.setTextureOffset(0, 102).addBox(-6.4F, 5.0F, -2.5F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		lower.setTextureOffset(126, 116).addBox(-5.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		lower.setTextureOffset(98, 77).addBox(-5.9F, 14.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
		lower.setTextureOffset(48, 63).addBox(-5.9F, 15.0F, -6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		lower.setTextureOffset(0, 122).addBox(-2.4F, 5.0F, -2.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);
		lower.setTextureOffset(121, 85).addBox(-7.4F, 5.0F, -2.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);
		lower.setTextureOffset(121, 27).addBox(-7.4F, 5.0F, 1.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		lower.setTextureOffset(118, 77).addBox(-7.4F, 5.0F, -3.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		lower.setTextureOffset(64, 70).addBox(-7.4F, 13.0F, -5.5F, 6.0F, 1.0F, 8.0F, 0.0F, false);
		lower.setTextureOffset(23, 39).addBox(-7.4F, 14.0F, -8.5F, 6.0F, 2.0F, 11.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(4.1F, 3.0F, 0.0F);
		left_leg.setTextureOffset(105, 102).addBox(-3.1F, 2.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(105, 91).addBox(-3.1F, 2.0F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 12).addBox(2.9F, 1.0F, -3.0F, 1.0F, 8.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(105, 31).addBox(-3.1F, 2.0F, 2.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
		left_leg.setTextureOffset(26, 83).addBox(-2.1F, 2.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(61, 85).addBox(-0.6F, 7.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		lower2 = new ModelRenderer(this);
		lower2.setRotationPoint(-4.0F, 5.0F, 0.0F);
		left_leg.addChild(lower2);
		lower2.setTextureOffset(71, 101).addBox(2.4F, 5.0F, -2.5F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		lower2.setTextureOffset(19, 83).addBox(3.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		lower2.setTextureOffset(75, 92).addBox(2.9F, 14.0F, -5.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
		lower2.setTextureOffset(58, 17).addBox(2.9F, 15.0F, -6.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		lower2.setTextureOffset(23, 12).addBox(1.4F, 5.0F, -2.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);
		lower2.setTextureOffset(0, 0).addBox(6.4F, 5.0F, -2.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);
		lower2.setTextureOffset(14, 114).addBox(1.4F, 5.0F, 1.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		lower2.setTextureOffset(112, 99).addBox(1.4F, 5.0F, -3.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		lower2.setTextureOffset(44, 69).addBox(1.4F, 13.0F, -5.5F, 6.0F, 1.0F, 8.0F, 0.0F, false);
		lower2.setTextureOffset(0, 36).addBox(1.4F, 14.0F, -8.5F, 6.0F, 2.0F, 11.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		FredbearBody.render(matrixStack, buffer, packedLight, packedOverlay);
		FrebearRightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		FrebearLeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.FrebearRightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.FrebearLeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}