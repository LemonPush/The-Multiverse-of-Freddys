// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelNightmareFredbear extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer endo_head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer mouth;
	private final ModelRenderer mask;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer mask_jaw;
	private final ModelRenderer body;
	private final ModelRenderer endo_body;
	private final ModelRenderer suit;
	private final ModelRenderer right_arm;
	private final ModelRenderer endo_arm3;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer suit_arm3;
	private final ModelRenderer lower_suit3;
	private final ModelRenderer left_arm;
	private final ModelRenderer endo_arm2;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer suit_arm2;
	private final ModelRenderer lower_suit2;
	private final ModelRenderer right_leg;
	private final ModelRenderer endo_leg;
	private final ModelRenderer suit_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer endo_leg2;
	private final ModelRenderer suit_leg2;

	public ModelNightmareFredbear() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -16.0F, 4.0F);

		endo_head = new ModelRenderer(this);
		endo_head.setRotationPoint(0.0F, -5.0F, -1.0F);
		head.addChild(endo_head);
		endo_head.setTextureOffset(30, 40).addBox(-4.0F, -7.0F, -9.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);
		endo_head.setTextureOffset(115, 76).addBox(-3.0F, -5.0F, -10.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		endo_head.setTextureOffset(95, 44).addBox(4.0F, -2.3F, -3.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		endo_head.setTextureOffset(78, 44).addBox(-5.0F, -2.3F, -3.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		endo_head.setTextureOffset(22, 108).addBox(1.0F, -5.0F, -10.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		endo_head.setTextureOffset(58, 27).addBox(-4.0F, 0.5F, -10.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		endo_head.setTextureOffset(0, 57).addBox(-4.0F, -0.5F, -10.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		endo_head.setTextureOffset(30, 53).addBox(-4.0F, -2.0F, -9.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-7.5F, -8.5F, -5.0F);
		endo_head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, -0.7418F);
		head_r1.setTextureOffset(0, 57).addBox(0.75F, -0.5F, -1.0F, 2.0F, 6.0F, 2.0F, -0.1F, true);
		head_r1.setTextureOffset(6, 116).addBox(-0.25F, -4.0F, -1.0F, 4.0F, 4.0F, 2.0F, -0.1F, true);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(7.5F, -8.5F, -5.0F);
		endo_head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, 0.7418F);
		head_r2.setTextureOffset(6, 116).addBox(-3.75F, -4.0F, -1.0F, 4.0F, 4.0F, 2.0F, -0.1F, false);
		head_r2.setTextureOffset(0, 57).addBox(-2.75F, -0.5F, -1.0F, 2.0F, 6.0F, 2.0F, -0.1F, false);

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, 3.0F, -4.0F);
		endo_head.addChild(mouth);
		setRotationAngle(mouth, 0.2618F, 0.0F, 0.0F);
		mouth.setTextureOffset(54, 55).addBox(-4.0F, -1.0F, -6.0247F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		mouth.setTextureOffset(0, 57).addBox(-4.0F, 0.0F, -6.0247F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		mask = new ModelRenderer(this);
		mask.setRotationPoint(-103.0F, 17.0F, -5.0F);
		head.addChild(mask);
		mask.setTextureOffset(44, 64).addBox(97.0F, -29.0F, -6.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);
		mask.setTextureOffset(84, 89).addBox(96.0F, -25.0F, -5.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		mask.setTextureOffset(76, 64).addBox(97.0F, -29.0F, 4.0F, 12.0F, 7.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(12, 84).addBox(109.0F, -25.0F, -5.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		mask.setTextureOffset(22, 62).addBox(108.0F, -29.0F, -6.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);
		mask.setTextureOffset(56, 64).addBox(97.0F, -29.0F, -7.0F, 3.0F, 7.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(78, 55).addBox(104.0F, -25.0F, -7.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(106, 72).addBox(104.0F, -29.0F, -7.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(39, 101).addBox(100.0F, -29.0F, -7.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(78, 38).addBox(100.0F, -25.0F, -7.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(85, 83).addBox(99.0F, -25.0F, -10.0F, 8.0F, 3.0F, 3.0F, 0.0F, false);
		mask.setTextureOffset(51, 90).addBox(102.0F, -26.0F, -9.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		mask.setTextureOffset(0, 12).addBox(97.0F, -30.0F, -7.0F, 12.0F, 1.0F, 12.0F, 0.0F, false);
		mask.setTextureOffset(18, 116).addBox(102.0F, -29.0F, -7.0F, 2.0F, 7.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(43, 12).addBox(100.0F, -22.0F, -10.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(24, 61).addBox(99.0F, -22.0F, -10.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		mask.setTextureOffset(0, 77).addBox(97.0F, -22.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(15, 80).addBox(106.0F, -22.0F, -10.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		mask.setTextureOffset(58, 27).addBox(106.0F, -29.0F, -7.0F, 3.0F, 7.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(44, 72).addBox(107.0F, -22.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(112, 22).addBox(108.0F, -22.0F, -6.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		mask.setTextureOffset(113, 47).addBox(97.0F, -22.0F, -6.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		mask.setTextureOffset(78, 55).addBox(99.5F, -31.0F, -4.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);
		mask.setTextureOffset(12, 100).addBox(101.0F, -35.0F, -3.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(95.5F, -30.5F, -1.0F);
		mask.addChild(head_r3);
		setRotationAngle(head_r3, 0.0F, 0.0F, -0.7418F);
		head_r3.setTextureOffset(69, 83).addBox(-0.75F, -4.0F, -1.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(110.5F, -30.5F, -1.0F);
		mask.addChild(head_r4);
		setRotationAngle(head_r4, 0.0F, 0.0F, 0.7418F);
		head_r4.setTextureOffset(108, 95).addBox(-4.25F, -4.0F, -1.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);

		mask_jaw = new ModelRenderer(this);
		mask_jaw.setRotationPoint(0.0F, -19.0F, 0.0F);
		mask.addChild(mask_jaw);
		setRotationAngle(mask_jaw, 0.2618F, 0.0F, 0.0F);
		mask_jaw.setTextureOffset(87, 72).addBox(99.0F, 0.7071F, -10.0247F, 8.0F, 2.0F, 3.0F, 0.0F, false);
		mask_jaw.setTextureOffset(41, 116).addBox(108.0F, -0.2929F, -6.0247F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		mask_jaw.setTextureOffset(78, 59).addBox(107.0F, -0.2929F, -7.0247F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		mask_jaw.setTextureOffset(98, 54).addBox(106.0F, -0.2929F, -9.0247F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		mask_jaw.setTextureOffset(0, 25).addBox(97.0F, 0.7071F, -7.0247F, 12.0F, 2.0F, 11.0F, 0.0F, false);
		mask_jaw.setTextureOffset(82, 33).addBox(99.0F, -0.2929F, -10.0247F, 8.0F, 1.0F, 1.0F, 0.0F, false);
		mask_jaw.setTextureOffset(98, 57).addBox(99.0F, -0.2929F, -9.0247F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		mask_jaw.setTextureOffset(116, 0).addBox(97.0F, -0.2929F, -6.0247F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		mask_jaw.setTextureOffset(38, 79).addBox(97.0F, -0.2929F, -7.0247F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		mask_jaw.setTextureOffset(54, 46).addBox(99.0F, 0.7071F, -5.0247F, 8.0F, 1.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);

		endo_body = new ModelRenderer(this);
		endo_body.setRotationPoint(0.0F, -24.0F, 0.0F);
		body.addChild(endo_body);
		endo_body.setTextureOffset(103, 0).addBox(-4.5F, -8.0F, 1.5F, 9.0F, 3.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(116, 69).addBox(-4.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(69, 39).addBox(-1.5F, -6.0F, -2.5F, 3.0F, 1.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(48, 116).addBox(1.5F, -8.0F, -2.5F, 3.0F, 3.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(54, 51).addBox(4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		endo_body.setTextureOffset(81, 0).addBox(-4.5F, -5.0F, -2.5F, 9.0F, 0.0F, 4.0F, 0.0F, false);
		endo_body.setTextureOffset(48, 40).addBox(-6.0F, -8.0F, -3.5F, 12.0F, 0.0F, 6.0F, 0.0F, false);
		endo_body.setTextureOffset(35, 27).addBox(2.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		endo_body.setTextureOffset(31, 27).addBox(5.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		endo_body.setTextureOffset(33, 27).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		endo_body.setTextureOffset(29, 25).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 0.0F, 6.0F, 0.0F, false);
		endo_body.setTextureOffset(53, 60).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
		endo_body.setTextureOffset(53, 59).addBox(-2.0F, -12.0F, 1.5F, 4.0F, 0.0F, 1.0F, 0.0F, false);
		endo_body.setTextureOffset(35, 29).addBox(-4.5F, -8.0F, -2.5F, 0.0F, 3.0F, 4.0F, 0.0F, false);
		endo_body.setTextureOffset(34, 62).addBox(2.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(36, 57).addBox(5.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(69, 38).addBox(-2.0F, -12.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(49, 62).addBox(-2.0F, -9.0F, -3.5F, 4.0F, 1.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(7, 16).addBox(3.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(43, 27).addBox(-6.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(0, 16).addBox(-5.0F, -9.0F, -3.5F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(43, 31).addBox(-3.0F, -12.0F, -3.5F, 1.0F, 4.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(85, 7).addBox(-6.0F, -12.0F, 2.5F, 12.0F, 4.0F, 0.0F, 0.0F, false);
		endo_body.setTextureOffset(38, 11).addBox(6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		endo_body.setTextureOffset(54, 54).addBox(6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		endo_body.setTextureOffset(54, 49).addBox(6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		endo_body.setTextureOffset(36, 11).addBox(6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		endo_body.setTextureOffset(6, 24).addBox(-6.0F, -12.0F, -3.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		endo_body.setTextureOffset(54, 42).addBox(-6.0F, -12.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		endo_body.setTextureOffset(8, 24).addBox(-6.0F, -12.0F, 1.5F, 0.0F, 4.0F, 1.0F, 0.0F, false);
		endo_body.setTextureOffset(54, 43).addBox(-6.0F, -9.0F, -2.5F, 0.0F, 1.0F, 4.0F, 0.0F, false);
		endo_body.setTextureOffset(43, 83).addBox(-4.5F, 0.0F, -2.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
		endo_body.setTextureOffset(116, 102).addBox(-5.5F, 2.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		endo_body.setTextureOffset(90, 116).addBox(3.5F, 2.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		endo_body.setTextureOffset(100, 109).addBox(-1.0F, -9.0F, -1.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		endo_body.setTextureOffset(20, 80).addBox(-1.0F, -12.0F, -1.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		endo_body.setTextureOffset(0, 103).addBox(-1.0F, -22.0F, 2.5F, 2.0F, 13.0F, 2.0F, 0.0F, false);
		endo_body.setTextureOffset(24, 118).addBox(-1.0F, -11.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		endo_body.setTextureOffset(60, 17).addBox(-8.0F, -11.0F, -1.5F, 16.0F, 2.0F, 2.0F, 0.0F, false);
		endo_body.setTextureOffset(24, 57).addBox(9.0F, -11.0F, -1.5F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		endo_body.setTextureOffset(24, 57).addBox(-13.0F, -11.0F, -1.5F, 4.0F, 2.0F, 2.0F, 0.0F, true);
		endo_body.setTextureOffset(64, 113).addBox(-11.0F, -11.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		endo_body.setTextureOffset(64, 113).addBox(8.0F, -11.5F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, true);

		suit = new ModelRenderer(this);
		suit.setRotationPoint(-103.0F, 0.0F, 0.0F);
		body.addChild(suit);
		suit.setTextureOffset(0, 38).addBox(95.0F, -32.0F, -5.0F, 16.0F, 1.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(78, 53).addBox(95.0F, -33.0F, -6.0F, 16.0F, 1.0F, 0.0F, 0.0F, false);
		suit.setTextureOffset(71, 21).addBox(96.0F, -33.0F, 4.0F, 14.0F, 5.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(47, 0).addBox(94.0F, -31.0F, -5.0F, 18.0F, 6.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(82, 27).addBox(96.0F, -26.0F, -6.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(60, 11).addBox(95.0F, -31.0F, -6.0F, 16.0F, 5.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(68, 81).addBox(96.0F, -32.0F, -6.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(85, 4).addBox(97.0F, -35.0F, -7.0F, 12.0F, 2.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(87, 77).addBox(98.0F, -36.0F, -7.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(86, 62).addBox(98.0F, -37.0F, -7.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(38, 81).addBox(96.0F, -33.0F, -7.0F, 14.0F, 1.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(60, 83).addBox(111.0F, -32.0F, -4.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);
		suit.setTextureOffset(76, 83).addBox(94.0F, -32.0F, -4.0F, 1.0F, 7.0F, 7.0F, 0.0F, false);
		suit.setTextureOffset(111, 62).addBox(95.0F, -24.0F, -3.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		suit.setTextureOffset(110, 86).addBox(96.0F, -24.0F, -3.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		suit.setTextureOffset(34, 111).addBox(109.0F, -24.0F, -3.0F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		suit.setTextureOffset(58, 36).addBox(97.0F, -25.0F, -6.0F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(82, 29).addBox(97.0F, -24.0F, -5.0F, 12.0F, 3.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(78, 36).addBox(100.0F, -20.0F, -4.0F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		suit.setTextureOffset(0, 40).addBox(94.0F, -32.0F, 3.0F, 18.0F, 7.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(0, 66).addBox(96.0F, -24.0F, -4.0F, 14.0F, 4.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(0, 53).addBox(94.0F, -36.0F, 4.0F, 18.0F, 3.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(0, 0).addBox(94.0F, -37.0F, -6.0F, 18.0F, 1.0F, 11.0F, 0.0F, false);
		suit.setTextureOffset(60, 21).addBox(101.5F, -28.5F, -7.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(60, 21).addBox(101.5F, -32.0F, -7.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(107, 86).addBox(102.0F, -36.0F, -8.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(98, 79).addBox(104.0F, -36.5F, -8.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(117, 85).addBox(99.0F, -36.5F, -8.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(0, 0).addBox(94.0F, -36.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(6, 0).addBox(111.0F, -36.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(0, 12).addBox(94.0F, -36.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(7, 12).addBox(111.0F, -36.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(47, 7).addBox(94.0F, -36.0F, -6.0F, 18.0F, 3.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(0, 48).addBox(96.0F, -24.0F, 2.0F, 14.0F, 4.0F, 1.0F, 0.0F, false);
		suit.setTextureOffset(108, 37).addBox(110.0F, -24.0F, -3.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		suit.setTextureOffset(83, 116).addBox(111.0F, -24.0F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		suit.setTextureOffset(71, 116).addBox(94.0F, -24.0F, -3.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-10.0F, -10.0F, 0.0F);

		endo_arm3 = new ModelRenderer(this);
		endo_arm3.setRotationPoint(-1.0F, 0.0F, 0.0F);
		right_arm.addChild(endo_arm3);
		setRotationAngle(endo_arm3, 0.0F, 0.0F, 0.3927F);
		endo_arm3.setTextureOffset(106, 76).addBox(-3.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		endo_arm3.setTextureOffset(78, 97).addBox(-2.5F, -0.85F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm3.setTextureOffset(78, 97).addBox(-2.5F, 0.95F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm3.setTextureOffset(78, 97).addBox(-2.5F, 2.65F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm3.setTextureOffset(78, 97).addBox(-2.5F, 4.45F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm3.setTextureOffset(78, 97).addBox(-2.5F, 4.45F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm3.setTextureOffset(78, 97).addBox(-2.5F, 2.65F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm3.setTextureOffset(78, 97).addBox(-2.5F, 0.95F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm3.setTextureOffset(78, 97).addBox(-2.5F, -0.85F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		endo_arm3.setTextureOffset(66, 73).addBox(-3.5F, -1.2F, -2.9F, 3.0F, 7.0F, 0.0F, 0.0F, false);
		endo_arm3.setTextureOffset(66, 73).addBox(-3.5F, -1.2F, 1.9F, 3.0F, 7.0F, 0.0F, 0.0F, false);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(7.0F, 14.8F, 1.0F);
		endo_arm3.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.1345F, 0.0F, 0.0F);
		right_arm_r1.setTextureOffset(109, 3).addBox(-11.5F, 9.35F, -9.85F, 1.0F, 3.0F, 5.0F, -0.1F, false);
		right_arm_r1.setTextureOffset(109, 102).addBox(-11.5F, 12.25F, -9.85F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(43, 14).addBox(-7.5F, 11.25F, -9.85F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(0, 25).addBox(-7.5F, 9.35F, -9.85F, 1.0F, 2.0F, 1.0F, -0.1F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.0F, 8.3F, 0.5F);
		endo_arm3.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.1345F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(16, 95).addBox(-1.0F, 6.55F, -2.2F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(97, 33).addBox(-2.0F, 8.45F, -3.2F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		cube_r1.setTextureOffset(110, 11).addBox(-1.5F, 1.55F, -2.75F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0F, 6.3F, -0.5F);
		endo_arm3.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.48F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(0, 71).addBox(-1.0F, -1.2F, -1.1F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		suit_arm3 = new ModelRenderer(this);
		suit_arm3.setRotationPoint(55.0F, 0.0F, 0.0F);
		right_arm.addChild(suit_arm3);
		setRotationAngle(suit_arm3, 0.0F, 0.0F, 0.3927F);
		suit_arm3.setTextureOffset(36, 12).addBox(-57.2373F, 20.2303F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
		suit_arm3.setTextureOffset(66, 73).addBox(-57.2373F, 19.2303F, -4.0F, 7.0F, 1.0F, 7.0F, 0.0F, false);
		suit_arm3.setTextureOffset(94, 89).addBox(-57.2373F, 20.2303F, 2.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
		suit_arm3.setTextureOffset(0, 12).addBox(-51.2373F, 20.2303F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
		suit_arm3.setTextureOffset(94, 11).addBox(-57.2373F, 20.2303F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);

		lower_suit3 = new ModelRenderer(this);
		lower_suit3.setRotationPoint(-2.0F, 6.8F, 0.3F);
		suit_arm3.addChild(lower_suit3);
		setRotationAngle(lower_suit3, -1.1345F, 0.0F, 0.0F);
		lower_suit3.setTextureOffset(62, 105).addBox(-54.7373F, 11.0568F, 16.6224F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		lower_suit3.setTextureOffset(104, 54).addBox(-54.7373F, 11.0568F, 21.6224F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		lower_suit3.setTextureOffset(0, 25).addBox(-54.7373F, 11.0568F, 17.6224F, 1.0F, 7.0F, 4.0F, 0.0F, false);
		lower_suit3.setTextureOffset(34, 62).addBox(-54.2373F, 17.0568F, 17.1224F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		lower_suit3.setTextureOffset(102, 64).addBox(-54.2373F, 21.0568F, 17.1224F, 2.0F, 3.0F, 5.0F, 0.0F, false);
		lower_suit3.setTextureOffset(32, 91).addBox(-51.2373F, 21.0568F, 17.1224F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		lower_suit3.setTextureOffset(0, 0).addBox(-49.7373F, 11.0568F, 17.6224F, 1.0F, 7.0F, 4.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(10.0F, -10.0F, 0.0F);

		endo_arm2 = new ModelRenderer(this);
		endo_arm2.setRotationPoint(1.0F, 0.0F, 0.0F);
		left_arm.addChild(endo_arm2);
		setRotationAngle(endo_arm2, 0.0F, 0.0F, -0.3927F);
		endo_arm2.setTextureOffset(106, 76).addBox(0.5F, -1.2F, -2.0F, 3.0F, 7.0F, 3.0F, 0.0F, true);
		endo_arm2.setTextureOffset(78, 97).addBox(1.5F, -0.85F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm2.setTextureOffset(78, 97).addBox(1.5F, 0.95F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm2.setTextureOffset(78, 97).addBox(1.5F, 2.65F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm2.setTextureOffset(78, 97).addBox(1.5F, 4.45F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm2.setTextureOffset(78, 97).addBox(1.5F, 4.45F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm2.setTextureOffset(78, 97).addBox(1.5F, 2.65F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm2.setTextureOffset(78, 97).addBox(1.5F, 0.95F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm2.setTextureOffset(78, 97).addBox(1.5F, -0.85F, -0.1F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		endo_arm2.setTextureOffset(66, 73).addBox(0.5F, -1.2F, -2.9F, 3.0F, 7.0F, 0.0F, 0.0F, true);
		endo_arm2.setTextureOffset(66, 73).addBox(0.5F, -1.2F, 1.9F, 3.0F, 7.0F, 0.0F, 0.0F, true);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-7.0F, 14.8F, 1.0F);
		endo_arm2.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, -1.1345F, 0.0F, 0.0F);
		right_arm_r2.setTextureOffset(109, 3).addBox(10.5F, 9.35F, -9.85F, 1.0F, 3.0F, 5.0F, -0.1F, true);
		right_arm_r2.setTextureOffset(109, 102).addBox(10.5F, 12.25F, -9.85F, 1.0F, 1.0F, 5.0F, 0.0F, true);
		right_arm_r2.setTextureOffset(43, 14).addBox(6.5F, 11.25F, -9.85F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_arm_r2.setTextureOffset(0, 25).addBox(6.5F, 9.35F, -9.85F, 1.0F, 2.0F, 1.0F, -0.1F, true);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.0F, 8.3F, 0.5F);
		endo_arm2.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.1345F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(16, 95).addBox(-1.0F, 6.55F, -2.2F, 2.0F, 3.0F, 2.0F, 0.0F, true);
		cube_r3.setTextureOffset(97, 33).addBox(-2.0F, 8.45F, -3.2F, 4.0F, 4.0F, 4.0F, 0.0F, true);
		cube_r3.setTextureOffset(110, 11).addBox(-1.5F, 1.55F, -2.75F, 3.0F, 5.0F, 3.0F, 0.0F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.0F, 6.3F, -0.5F);
		endo_arm2.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.48F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 71).addBox(-1.0F, -1.2F, -1.1F, 2.0F, 4.0F, 2.0F, 0.0F, true);

		suit_arm2 = new ModelRenderer(this);
		suit_arm2.setRotationPoint(-55.0F, 0.0F, 0.0F);
		left_arm.addChild(suit_arm2);
		setRotationAngle(suit_arm2, 0.0F, 0.0F, -0.3927F);
		suit_arm2.setTextureOffset(36, 12).addBox(56.2373F, 20.2303F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, true);
		suit_arm2.setTextureOffset(66, 73).addBox(50.2373F, 19.2303F, -4.0F, 7.0F, 1.0F, 7.0F, 0.0F, true);
		suit_arm2.setTextureOffset(94, 89).addBox(50.2373F, 20.2303F, 2.0F, 7.0F, 7.0F, 1.0F, 0.0F, true);
		suit_arm2.setTextureOffset(0, 12).addBox(50.2373F, 20.2303F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, true);
		suit_arm2.setTextureOffset(94, 11).addBox(50.2373F, 20.2303F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, true);

		lower_suit2 = new ModelRenderer(this);
		lower_suit2.setRotationPoint(2.0F, 6.8F, 0.3F);
		suit_arm2.addChild(lower_suit2);
		setRotationAngle(lower_suit2, -1.1345F, 0.0F, 0.0F);
		lower_suit2.setTextureOffset(62, 105).addBox(48.7373F, 11.0568F, 16.6224F, 6.0F, 7.0F, 1.0F, 0.0F, true);
		lower_suit2.setTextureOffset(104, 54).addBox(48.7373F, 11.0568F, 21.6224F, 6.0F, 7.0F, 1.0F, 0.0F, true);
		lower_suit2.setTextureOffset(0, 25).addBox(53.7373F, 11.0568F, 17.6224F, 1.0F, 7.0F, 4.0F, 0.0F, true);
		lower_suit2.setTextureOffset(34, 62).addBox(49.2373F, 17.0568F, 17.1224F, 5.0F, 5.0F, 5.0F, 0.0F, true);
		lower_suit2.setTextureOffset(102, 64).addBox(52.2373F, 21.0568F, 17.1224F, 2.0F, 3.0F, 5.0F, 0.0F, true);
		lower_suit2.setTextureOffset(32, 91).addBox(49.2373F, 21.0568F, 17.1224F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		lower_suit2.setTextureOffset(0, 0).addBox(48.7373F, 11.0568F, 17.6224F, 1.0F, 7.0F, 4.0F, 0.0F, true);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-4.1F, 3.0F, 0.0F);

		endo_leg = new ModelRenderer(this);
		endo_leg.setRotationPoint(4.0F, 5.0F, 0.0F);
		right_leg.addChild(endo_leg);
		endo_leg.setTextureOffset(0, 92).addBox(-6.4F, 5.0F, -2.5F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		endo_leg.setTextureOffset(108, 116).addBox(-5.4F, 2.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		endo_leg.setTextureOffset(0, 80).addBox(-6.9F, -3.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		endo_leg.setTextureOffset(116, 116).addBox(-5.4F, 12.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		endo_leg.setTextureOffset(78, 44).addBox(-6.9F, 13.75F, -5.0F, 5.0F, 2.0F, 7.0F, 0.25F, false);
		endo_leg.setTextureOffset(109, 72).addBox(-6.9F, 15.0F, -8.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);

		suit_leg = new ModelRenderer(this);
		suit_leg.setRotationPoint(4.0F, 5.0F, 0.0F);
		right_leg.addChild(suit_leg);
		suit_leg.setTextureOffset(54, 109).addBox(-2.4F, 5.0F, -2.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);
		suit_leg.setTextureOffset(24, 107).addBox(-7.4F, 5.0F, -2.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);
		suit_leg.setTextureOffset(109, 29).addBox(-7.4F, 5.0F, 1.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		suit_leg.setTextureOffset(108, 108).addBox(-7.4F, 5.0F, -3.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		suit_leg.setTextureOffset(0, 71).addBox(-7.4F, 13.1F, -5.5F, 6.0F, 1.0F, 8.0F, 0.0F, false);
		suit_leg.setTextureOffset(37, 14).addBox(-7.4F, 14.1F, -8.5F, 6.0F, 2.0F, 11.0F, 0.0F, false);
		suit_leg.setTextureOffset(101, 19).addBox(-7.9F, -3.0F, 2.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
		suit_leg.setTextureOffset(102, 44).addBox(-7.9F, -3.0F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
		suit_leg.setTextureOffset(50, 96).addBox(-7.9F, -4.0F, -3.0F, 1.0F, 8.0F, 5.0F, 0.0F, false);
		suit_leg.setTextureOffset(32, 99).addBox(-1.9F, -3.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(4.1F, 3.0F, 0.0F);

		endo_leg2 = new ModelRenderer(this);
		endo_leg2.setRotationPoint(-2.1F, 17.0F, 0.0F);
		left_leg.addChild(endo_leg2);
		endo_leg2.setTextureOffset(39, 90).addBox(0.5F, -7.0F, -2.5F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		endo_leg2.setTextureOffset(78, 116).addBox(1.5F, -10.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		endo_leg2.setTextureOffset(115, 37).addBox(1.5F, 0.0F, -1.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		endo_leg2.setTextureOffset(23, 79).addBox(0.0F, -15.0F, -3.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		endo_leg2.setTextureOffset(78, 44).addBox(0.0F, 1.75F, -5.0F, 5.0F, 2.0F, 7.0F, 0.25F, true);
		endo_leg2.setTextureOffset(109, 72).addBox(0.0F, 3.0F, -8.0F, 5.0F, 1.0F, 3.0F, 0.0F, true);

		suit_leg2 = new ModelRenderer(this);
		suit_leg2.setRotationPoint(-4.0F, 5.0F, 0.0F);
		left_leg.addChild(suit_leg2);
		suit_leg2.setTextureOffset(97, 97).addBox(0.9F, -3.0F, -3.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);
		suit_leg2.setTextureOffset(78, 100).addBox(0.9F, -3.0F, -4.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
		suit_leg2.setTextureOffset(25, 91).addBox(6.9F, -4.0F, -3.0F, 1.0F, 8.0F, 5.0F, 0.0F, false);
		suit_leg2.setTextureOffset(62, 97).addBox(0.9F, -3.0F, 2.0F, 7.0F, 7.0F, 1.0F, 0.0F, false);
		suit_leg2.setTextureOffset(90, 105).addBox(1.4F, 5.0F, -2.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);
		suit_leg2.setTextureOffset(44, 105).addBox(6.4F, 5.0F, -2.5F, 1.0F, 7.0F, 4.0F, 0.0F, false);
		suit_leg2.setTextureOffset(76, 108).addBox(1.4F, 5.0F, 1.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		suit_leg2.setTextureOffset(8, 108).addBox(1.4F, 5.0F, -3.5F, 6.0F, 7.0F, 1.0F, 0.0F, false);
		suit_leg2.setTextureOffset(56, 64).addBox(1.4F, 13.1F, -5.5F, 6.0F, 1.0F, 8.0F, 0.0F, false);
		suit_leg2.setTextureOffset(35, 27).addBox(1.4F, 14.1F, -8.5F, 6.0F, 2.0F, 11.0F, 0.0F, false);
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