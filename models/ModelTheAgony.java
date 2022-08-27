// Made with Blockbench 4.1.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelTheAgony extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer wire15;
	private final ModelRenderer wire16;
	private final ModelRenderer body;
	private final ModelRenderer wire13;
	private final ModelRenderer left_arm_r1;
	private final ModelRenderer wire14;
	private final ModelRenderer left_arm_r2;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_arm_r3;
	private final ModelRenderer wire;
	private final ModelRenderer wire2;
	private final ModelRenderer wire3;
	private final ModelRenderer Claws;
	private final ModelRenderer claw5;
	private final ModelRenderer claw4;
	private final ModelRenderer claw3;
	private final ModelRenderer claw2;
	private final ModelRenderer claw;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm_r4;
	private final ModelRenderer wire4;
	private final ModelRenderer wire5;
	private final ModelRenderer wire6;
	private final ModelRenderer Claws2;
	private final ModelRenderer claw6;
	private final ModelRenderer claw7;
	private final ModelRenderer claw8;
	private final ModelRenderer claw9;
	private final ModelRenderer claw10;
	private final ModelRenderer left_leg;
	private final ModelRenderer wire7;
	private final ModelRenderer wire8;
	private final ModelRenderer left_arm_r5;
	private final ModelRenderer wire9;
	private final ModelRenderer right_leg;
	private final ModelRenderer wire10;
	private final ModelRenderer wire11;
	private final ModelRenderer left_arm_r6;
	private final ModelRenderer wire12;

	public ModelTheAgony() {
		textureWidth = 256;
		textureHeight = 256;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.2923F, -35.6F, 0.171F);
		head.setTextureOffset(154, 74).addBox(-3.0423F, -2.9F, -2.421F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(123, 97).addBox(-7.7923F, -5.9F, -2.671F, 15.0F, 3.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(120, 89).addBox(-9.5423F, -20.9F, -2.671F, 18.0F, 3.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(28, 111).addBox(2.3327F, -34.65F, -1.721F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(129, 36).addBox(2.3327F, -22.15F, -1.421F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(126, 155).addBox(1.5827F, -31.65F, -1.421F, 5.0F, 10.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(156, 0).addBox(5.4577F, -7.9F, 2.329F, 3.0F, 5.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(142, 155).addBox(4.2077F, -7.9F, 3.579F, 3.0F, 5.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(155, 31).addBox(-8.2923F, -7.9F, 3.579F, 3.0F, 5.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(80, 22).addBox(-5.2923F, -7.9F, 6.079F, 10.0F, 5.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(35, 159).addBox(-2.7923F, -12.9F, 6.079F, 5.0F, 5.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(158, 155).addBox(-2.7923F, -16.65F, 4.829F, 5.0F, 5.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(158, 50).addBox(-2.7923F, -20.4F, 2.329F, 5.0F, 5.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(87, 159).addBox(-7.7923F, -14.65F, -7.671F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(114, 10).addBox(-9.0423F, -14.65F, -5.171F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(70, 138).addBox(1.2077F, -17.075F, -10.796F, 5.0F, 5.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(70, 138).addBox(-6.7923F, -17.075F, -10.796F, 5.0F, 5.0F, 2.0F, 0.0F, true);
		head.setTextureOffset(157, 139).addBox(2.2077F, -14.65F, -7.671F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(120, 145).addBox(3.4577F, -14.65F, -5.171F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-8.5423F, -17.9F, -2.671F, 2.0F, 15.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-10.2923F, -21.65F, -10.171F, 20.0F, 14.0F, 20.0F, 0.0F, false);
		head.setTextureOffset(0, 34).addBox(-9.2923F, -7.65F, -10.171F, 18.0F, 6.0F, 20.0F, 0.0F, false);
		head.setTextureOffset(136, 140).addBox(0.7077F, -31.65F, -2.671F, 8.0F, 10.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(60, 0).addBox(-9.2923F, -31.65F, -2.671F, 8.0F, 10.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(60, 15).addBox(-7.2923F, -33.65F, -1.671F, 4.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(103, 22).addBox(-7.7923F, -11.65F, -16.171F, 15.0F, 5.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(36, 137).addBox(-6.7923F, -3.65F, -15.171F, 13.0F, 2.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(130, 128).addBox(-6.7923F, -6.65F, -15.171F, 13.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 66).addBox(-2.0423F, -13.275F, -14.671F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-5.2423F, -31.358F, 0.1463F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.9304F, 0.284F, -0.2058F);
		head_r1.setTextureOffset(66, 94).addBox(-1.775F, -9.3029F, -2.1125F, 2.0F, 9.0F, 5.0F, 0.0F, false);
		head_r1.setTextureOffset(66, 94).addBox(1.225F, -9.3029F, -2.1125F, 2.0F, 9.0F, 5.0F, 0.0F, false);
		head_r1.setTextureOffset(53, 60).addBox(-1.775F, -12.3029F, -2.1125F, 5.0F, 3.0F, 5.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(4.6577F, -31.358F, 0.1463F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.5564F, -0.1166F, 0.1848F);
		head_r2.setTextureOffset(142, 18).addBox(-3.525F, -9.3029F, -2.1125F, 7.0F, 8.0F, 5.0F, 0.0F, false);
		head_r2.setTextureOffset(15, 155).addBox(-2.475F, -12.3029F, -2.1125F, 5.0F, 3.0F, 5.0F, 0.0F, false);

		wire15 = new ModelRenderer(this);
		wire15.setRotationPoint(6.7577F, -36.725F, -8.171F);
		head.addChild(wire15);
		setRotationAngle(wire15, 0.0F, 1.5708F, 0.0F);
		wire15.setTextureOffset(15, 34).addBox(-0.3F, -4.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire15.setTextureOffset(14, 5).addBox(0.7F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		wire15.setTextureOffset(15, 37).addBox(-1.3F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wire15.setTextureOffset(0, 34).addBox(-0.3F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire15.setTextureOffset(0, 37).addBox(-1.3F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		wire16 = new ModelRenderer(this);
		wire16.setRotationPoint(3.7577F, -34.725F, -7.171F);
		head.addChild(wire16);
		setRotationAngle(wire16, 0.0F, 1.5708F, 0.0F);
		wire16.setTextureOffset(15, 34).addBox(-1.2F, -4.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire16.setTextureOffset(14, 5).addBox(-0.2F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		wire16.setTextureOffset(15, 37).addBox(-2.2F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wire16.setTextureOffset(0, 34).addBox(-1.2F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire16.setTextureOffset(0, 37).addBox(-2.2F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(66, 60).addBox(-8.5F, -36.0F, -4.5F, 17.0F, 25.0F, 9.0F, 0.0F, false);
		body.setTextureOffset(0, 60).addBox(-10.0F, -36.7F, -6.25F, 20.0F, 21.0F, 13.0F, 0.0F, false);
		body.setTextureOffset(81, 94).addBox(-9.25F, -34.625F, -6.875F, 18.0F, 18.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(71, 156).addBox(-6.25F, -36.625F, -9.375F, 5.0F, 5.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(51, 157).addBox(1.25F, -36.625F, -9.375F, 5.0F, 5.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 60).addBox(-1.5F, -35.875F, -9.375F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(9, 0).addBox(-1.75F, -30.5F, -8.125F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(9, 0).addBox(-1.75F, -25.5F, -8.125F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(56, 34).addBox(-8.875F, -14.875F, -5.375F, 18.0F, 8.0F, 11.0F, 0.25F, false);
		body.setTextureOffset(162, 58).addBox(-7.5F, -30.25F, 0.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(161, 108).addBox(-7.5F, -26.5F, 0.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(161, 84).addBox(-7.5F, -22.75F, 0.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 160).addBox(2.5F, -22.75F, 0.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(160, 102).addBox(2.5F, -26.5F, 0.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(161, 41).addBox(2.5F, -30.25F, 0.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(103, 36).addBox(2.5F, -35.25F, -1.25F, 10.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(76, 53).addBox(-12.5F, -35.25F, -1.25F, 10.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 94).addBox(-9.25F, -12.25F, -3.75F, 18.0F, 5.0F, 8.0F, 0.0F, false);

		wire13 = new ModelRenderer(this);
		wire13.setRotationPoint(5.05F, -29.125F, -7.5F);
		body.addChild(wire13);
		setRotationAngle(wire13, 0.0F, 1.5708F, 1.1345F);
		wire13.setTextureOffset(81, 0).addBox(-0.3F, -4.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire13.setTextureOffset(106, 22).addBox(0.7F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		wire13.setTextureOffset(66, 97).addBox(-1.3F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wire13.setTextureOffset(74, 17).addBox(-0.3F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire13.setTextureOffset(92, 8).addBox(-1.3F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		left_arm_r1 = new ModelRenderer(this);
		left_arm_r1.setRotationPoint(-19.05F, 42.875F, 16.75F);
		wire13.addChild(left_arm_r1);
		setRotationAngle(left_arm_r1, 0.0F, 3.1416F, 0.0F);
		left_arm_r1.setTextureOffset(81, 3).addBox(-6.25F, -25.3741F, 4.5119F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_arm_r1.setTextureOffset(68, 60).addBox(-5.25F, -26.3741F, 4.5119F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		left_arm_r1.setTextureOffset(75, 15).addBox(-6.25F, -32.3741F, 4.5119F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_arm_r1.setTextureOffset(48, 94).addBox(-4.25F, -31.3741F, 4.5119F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		left_arm_r1.setTextureOffset(9, 66).addBox(-5.25F, -32.3741F, 4.5119F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		wire14 = new ModelRenderer(this);
		wire14.setRotationPoint(-3.95F, -22.125F, -7.5F);
		body.addChild(wire14);
		setRotationAngle(wire14, 0.0F, 1.5708F, -0.48F);
		wire14.setTextureOffset(71, 62).addBox(-0.3F, -4.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire14.setTextureOffset(102, 53).addBox(0.7F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		wire14.setTextureOffset(92, 0).addBox(-1.3F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wire14.setTextureOffset(71, 15).addBox(-0.3F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire14.setTextureOffset(86, 30).addBox(-1.3F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		left_arm_r2 = new ModelRenderer(this);
		left_arm_r2.setRotationPoint(-19.05F, 42.875F, 16.75F);
		wire14.addChild(left_arm_r2);
		setRotationAngle(left_arm_r2, 0.0F, 3.1416F, 0.0F);
		left_arm_r2.setTextureOffset(61, 71).addBox(-6.25F, -47.263F, 11.9422F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_arm_r2.setTextureOffset(63, 41).addBox(-5.25F, -48.263F, 11.9422F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		left_arm_r2.setTextureOffset(53, 63).addBox(-6.25F, -54.263F, 11.9422F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_arm_r2.setTextureOffset(44, 94).addBox(-4.25F, -53.263F, 11.9422F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		left_arm_r2.setTextureOffset(53, 60).addBox(-5.25F, -54.263F, 11.9422F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(9.7031F, -33.9531F, 0.0469F);
		left_arm.setTextureOffset(137, 36).addBox(1.9219F, -2.0469F, -2.9219F, 6.0F, 11.0F, 6.0F, 0.25F, false);
		left_arm.setTextureOffset(118, 66).addBox(1.0469F, -2.6719F, -5.0469F, 8.0F, 13.0F, 10.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 130).addBox(1.0469F, 10.8281F, -5.0469F, 8.0F, 10.0F, 10.0F, 0.0F, false);
		left_arm.setTextureOffset(130, 0).addBox(1.0469F, 21.0781F, -5.0469F, 8.0F, 8.0F, 10.0F, 0.0F, false);
		left_arm.setTextureOffset(144, 60).addBox(1.9219F, 11.5781F, -2.9219F, 6.0F, 8.0F, 6.0F, 0.25F, false);
		left_arm.setTextureOffset(30, 147).addBox(1.9219F, 21.7031F, -2.9219F, 6.0F, 6.0F, 6.0F, 0.25F, false);
		left_arm.setTextureOffset(0, 44).addBox(2.5469F, 18.5781F, -2.5469F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 34).addBox(2.5469F, 7.9531F, -2.5469F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		left_arm_r3 = new ModelRenderer(this);
		left_arm_r3.setRotationPoint(11.5469F, 15.8281F, -8.5469F);
		left_arm.addChild(left_arm_r3);
		setRotationAngle(left_arm_r3, 1.116F, -0.276F, 0.1325F);
		left_arm_r3.setTextureOffset(14, 12).addBox(-3.5F, 5.0F, -7.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		wire = new ModelRenderer(this);
		wire.setRotationPoint(-8.7031F, 58.7031F, -1.2969F);
		left_arm.addChild(wire);
		wire.setTextureOffset(9, 60).addBox(18.75F, -46.875F, 1.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire.setTextureOffset(4, 94).addBox(19.75F, -45.875F, 1.25F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		wire.setTextureOffset(62, 34).addBox(17.75F, -46.875F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wire.setTextureOffset(60, 0).addBox(18.75F, -40.875F, 1.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire.setTextureOffset(60, 3).addBox(17.75F, -39.875F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		wire2 = new ModelRenderer(this);
		wire2.setRotationPoint(5.3469F, 4.8281F, -5.5469F);
		left_arm.addChild(wire2);
		setRotationAngle(wire2, 0.0F, 1.5708F, 0.0F);
		wire2.setTextureOffset(15, 34).addBox(-0.3F, -4.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire2.setTextureOffset(14, 5).addBox(0.7F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		wire2.setTextureOffset(15, 37).addBox(-1.3F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wire2.setTextureOffset(0, 34).addBox(-0.3F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire2.setTextureOffset(0, 37).addBox(-1.3F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		wire3 = new ModelRenderer(this);
		wire3.setRotationPoint(5.3469F, 9.8281F, 6.4531F);
		left_arm.addChild(wire3);
		setRotationAngle(wire3, 0.0F, -1.5708F, 0.0F);
		wire3.setTextureOffset(15, 44).addBox(-0.3F, -4.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire3.setTextureOffset(0, 94).addBox(0.7F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		wire3.setTextureOffset(15, 47).addBox(-1.3F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wire3.setTextureOffset(0, 44).addBox(-0.3F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire3.setTextureOffset(0, 47).addBox(-1.3F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Claws = new ModelRenderer(this);
		Claws.setRotationPoint(-9.7031F, 57.9531F, -0.0469F);
		left_arm.addChild(Claws);

		claw5 = new ModelRenderer(this);
		claw5.setRotationPoint(12.75F, -23.7583F, -4.0F);
		Claws.addChild(claw5);
		setRotationAngle(claw5, 0.0F, 1.5708F, 0.0F);
		claw5.setTextureOffset(86, 8).addBox(0.0F, -5.1667F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		claw5.setTextureOffset(88, 30).addBox(-1.0F, -0.1667F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		claw5.setTextureOffset(58, 68).addBox(-2.0F, 0.8333F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		claw4 = new ModelRenderer(this);
		claw4.setRotationPoint(-2.0F, 16.95F, -0.75F);
		Claws.addChild(claw4);
		claw4.setTextureOffset(86, 8).addBox(18.75F, -45.875F, 1.25F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		claw4.setTextureOffset(88, 30).addBox(17.75F, -40.875F, 1.25F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		claw4.setTextureOffset(58, 68).addBox(16.75F, -39.875F, 1.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		claw3 = new ModelRenderer(this);
		claw3.setRotationPoint(-2.0F, 16.95F, 1.75F);
		Claws.addChild(claw3);
		claw3.setTextureOffset(86, 8).addBox(18.75F, -45.875F, 1.25F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		claw3.setTextureOffset(88, 30).addBox(17.75F, -40.875F, 1.25F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		claw3.setTextureOffset(58, 68).addBox(16.75F, -39.875F, 1.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		claw2 = new ModelRenderer(this);
		claw2.setRotationPoint(-2.0F, 16.95F, -3.45F);
		Claws.addChild(claw2);
		claw2.setTextureOffset(86, 8).addBox(18.75F, -45.875F, 1.25F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		claw2.setTextureOffset(88, 30).addBox(17.75F, -40.875F, 1.25F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		claw2.setTextureOffset(58, 68).addBox(16.75F, -39.875F, 1.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		claw = new ModelRenderer(this);
		claw.setRotationPoint(-2.0F, 16.95F, -6.25F);
		Claws.addChild(claw);
		claw.setTextureOffset(86, 8).addBox(18.75F, -45.875F, 1.25F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		claw.setTextureOffset(88, 30).addBox(17.75F, -40.875F, 1.25F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		claw.setTextureOffset(58, 68).addBox(16.75F, -39.875F, 1.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-9.7031F, -33.9531F, 0.0469F);
		right_arm.setTextureOffset(137, 36).addBox(-7.9219F, -2.0469F, -2.9219F, 6.0F, 11.0F, 6.0F, 0.25F, true);
		right_arm.setTextureOffset(76, 115).addBox(-9.0469F, -2.6719F, -5.0469F, 8.0F, 13.0F, 10.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 130).addBox(-9.0469F, 10.8281F, -5.0469F, 8.0F, 10.0F, 10.0F, 0.0F, true);
		right_arm.setTextureOffset(130, 0).addBox(-9.0469F, 21.0781F, -5.0469F, 8.0F, 8.0F, 10.0F, 0.0F, true);
		right_arm.setTextureOffset(144, 60).addBox(-7.9219F, 11.5781F, -2.9219F, 6.0F, 8.0F, 6.0F, 0.25F, true);
		right_arm.setTextureOffset(30, 147).addBox(-7.9219F, 21.7031F, -2.9219F, 6.0F, 6.0F, 6.0F, 0.25F, true);
		right_arm.setTextureOffset(0, 44).addBox(-7.5469F, 18.5781F, -2.5469F, 5.0F, 5.0F, 5.0F, 0.0F, true);
		right_arm.setTextureOffset(0, 34).addBox(-7.5469F, 7.9531F, -2.5469F, 5.0F, 5.0F, 5.0F, 0.0F, true);

		left_arm_r4 = new ModelRenderer(this);
		left_arm_r4.setRotationPoint(-11.5469F, 15.8281F, -8.5469F);
		right_arm.addChild(left_arm_r4);
		setRotationAngle(left_arm_r4, 1.116F, 0.276F, -0.1325F);
		left_arm_r4.setTextureOffset(14, 12).addBox(2.5F, 5.0F, -7.5F, 1.0F, 6.0F, 1.0F, 0.0F, true);

		wire4 = new ModelRenderer(this);
		wire4.setRotationPoint(8.7031F, 58.7031F, -1.2969F);
		right_arm.addChild(wire4);
		wire4.setTextureOffset(9, 60).addBox(-19.75F, -46.875F, 1.25F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		wire4.setTextureOffset(4, 94).addBox(-20.75F, -45.875F, 1.25F, 1.0F, 6.0F, 1.0F, 0.0F, true);
		wire4.setTextureOffset(62, 34).addBox(-18.75F, -46.875F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		wire4.setTextureOffset(60, 0).addBox(-19.75F, -40.875F, 1.25F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		wire4.setTextureOffset(60, 3).addBox(-18.75F, -39.875F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		wire5 = new ModelRenderer(this);
		wire5.setRotationPoint(-5.3469F, 4.8281F, -5.5469F);
		right_arm.addChild(wire5);
		setRotationAngle(wire5, 0.0F, -1.5708F, 0.0F);
		wire5.setTextureOffset(15, 34).addBox(-0.7F, -4.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		wire5.setTextureOffset(14, 5).addBox(-1.7F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, true);
		wire5.setTextureOffset(15, 37).addBox(0.3F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		wire5.setTextureOffset(0, 34).addBox(-0.7F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		wire5.setTextureOffset(0, 37).addBox(0.3F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		wire6 = new ModelRenderer(this);
		wire6.setRotationPoint(-5.3469F, 9.8281F, 6.4531F);
		right_arm.addChild(wire6);
		setRotationAngle(wire6, 0.0F, 1.5708F, 0.0F);
		wire6.setTextureOffset(15, 44).addBox(-0.7F, -4.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		wire6.setTextureOffset(0, 94).addBox(-1.7F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, true);
		wire6.setTextureOffset(15, 47).addBox(0.3F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		wire6.setTextureOffset(0, 44).addBox(-0.7F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		wire6.setTextureOffset(0, 47).addBox(0.3F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		Claws2 = new ModelRenderer(this);
		Claws2.setRotationPoint(9.7031F, 57.9531F, -0.0469F);
		right_arm.addChild(Claws2);

		claw6 = new ModelRenderer(this);
		claw6.setRotationPoint(-12.75F, -23.7583F, -4.0F);
		Claws2.addChild(claw6);
		setRotationAngle(claw6, 0.0F, -1.5708F, 0.0F);
		claw6.setTextureOffset(56, 34).addBox(-2.0F, -5.1667F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		claw6.setTextureOffset(80, 30).addBox(-1.0F, -0.1667F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		claw6.setTextureOffset(56, 42).addBox(0.0F, 0.8333F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		claw7 = new ModelRenderer(this);
		claw7.setRotationPoint(2.0F, 16.95F, -0.75F);
		Claws2.addChild(claw7);
		claw7.setTextureOffset(86, 8).addBox(-20.75F, -45.875F, 1.25F, 2.0F, 6.0F, 2.0F, 0.0F, true);
		claw7.setTextureOffset(88, 30).addBox(-19.75F, -40.875F, 1.25F, 2.0F, 2.0F, 2.0F, 0.0F, true);
		claw7.setTextureOffset(58, 68).addBox(-18.75F, -39.875F, 1.25F, 2.0F, 1.0F, 2.0F, 0.0F, true);

		claw8 = new ModelRenderer(this);
		claw8.setRotationPoint(2.0F, 16.95F, 1.75F);
		Claws2.addChild(claw8);
		claw8.setTextureOffset(86, 8).addBox(-20.75F, -45.875F, 1.25F, 2.0F, 6.0F, 2.0F, 0.0F, true);
		claw8.setTextureOffset(88, 30).addBox(-19.75F, -40.875F, 1.25F, 2.0F, 2.0F, 2.0F, 0.0F, true);
		claw8.setTextureOffset(58, 68).addBox(-18.75F, -39.875F, 1.25F, 2.0F, 1.0F, 2.0F, 0.0F, true);

		claw9 = new ModelRenderer(this);
		claw9.setRotationPoint(2.0F, 16.95F, -3.45F);
		Claws2.addChild(claw9);
		claw9.setTextureOffset(86, 0).addBox(-20.75F, -45.875F, 1.25F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		claw9.setTextureOffset(80, 30).addBox(-19.75F, -40.875F, 1.25F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		claw9.setTextureOffset(56, 42).addBox(-18.75F, -39.875F, 1.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		claw10 = new ModelRenderer(this);
		claw10.setRotationPoint(2.0F, 16.95F, -6.25F);
		Claws2.addChild(claw10);
		claw10.setTextureOffset(56, 34).addBox(-20.75F, -45.875F, 1.25F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		claw10.setTextureOffset(80, 30).addBox(-19.75F, -40.875F, 1.25F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		claw10.setTextureOffset(56, 42).addBox(-18.75F, -39.875F, 1.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(5.0938F, -6.4F, -0.5938F);
		left_leg.setTextureOffset(151, 115).addBox(-2.5937F, -0.85F, -1.9062F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 150).addBox(-2.3937F, 11.65F, -1.9062F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(54, 147).addBox(-2.3937F, 22.9F, -1.9062F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		left_leg.setTextureOffset(102, 145).addBox(-3.0188F, 14.775F, -2.2812F, 6.0F, 11.0F, 6.0F, 0.25F, false);
		left_leg.setTextureOffset(38, 114).addBox(-4.6938F, 14.025F, -4.4063F, 9.0F, 13.0F, 10.0F, 0.0F, false);
		left_leg.setTextureOffset(113, 105).addBox(-4.6937F, 0.325F, -4.4063F, 9.0F, 13.0F, 10.0F, 0.0F, false);
		left_leg.setTextureOffset(80, 0).addBox(-4.5688F, 24.275F, -9.7813F, 9.0F, 6.0F, 16.0F, 0.25F, false);
		left_leg.setTextureOffset(37, 94).addBox(-3.1438F, 25.4F, -9.4063F, 7.0F, 5.0F, 15.0F, 0.0F, false);

		wire7 = new ModelRenderer(this);
		wire7.setRotationPoint(-14.0938F, 56.15F, -0.6563F);
		left_leg.addChild(wire7);
		wire7.setTextureOffset(114, 0).addBox(18.75F, -46.875F, 1.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire7.setTextureOffset(118, 66).addBox(19.75F, -45.875F, 1.25F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		wire7.setTextureOffset(66, 114).addBox(17.75F, -46.875F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wire7.setTextureOffset(0, 114).addBox(18.75F, -40.875F, 1.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire7.setTextureOffset(114, 51).addBox(17.75F, -39.875F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		wire8 = new ModelRenderer(this);
		wire8.setRotationPoint(-0.3437F, 6.275F, -5.7063F);
		left_leg.addChild(wire8);
		setRotationAngle(wire8, -0.48F, 1.5708F, 0.0F);
		wire8.setTextureOffset(113, 66).addBox(-0.3F, -4.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire8.setTextureOffset(106, 115).addBox(0.7F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		wire8.setTextureOffset(114, 49).addBox(-1.3F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wire8.setTextureOffset(109, 66).addBox(-0.3F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire8.setTextureOffset(4, 114).addBox(-1.3F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		left_arm_r5 = new ModelRenderer(this);
		left_arm_r5.setRotationPoint(1.2F, 9.0F, 12.0F);
		wire8.addChild(left_arm_r5);
		setRotationAngle(left_arm_r5, 0.0F, 0.0F, 1.2217F);
		left_arm_r5.setTextureOffset(44, 114).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		wire9 = new ModelRenderer(this);
		wire9.setRotationPoint(1.1562F, 21.275F, 6.2937F);
		left_leg.addChild(wire9);
		setRotationAngle(wire9, -0.48F, 1.5708F, 0.0F);
		wire9.setTextureOffset(107, 42).addBox(-0.7F, -4.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire9.setTextureOffset(102, 115).addBox(-1.7F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		wire9.setTextureOffset(114, 3).addBox(0.3F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wire9.setTextureOffset(32, 107).addBox(-0.7F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire9.setTextureOffset(48, 107).addBox(0.3F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-5.0938F, -6.4F, -0.5938F);
		right_leg.setTextureOffset(141, 105).addBox(-2.4063F, -0.85F, -1.9062F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(66, 114).addBox(-2.6063F, 11.65F, -1.9062F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(114, 0).addBox(-2.6063F, 22.9F, -1.9062F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(78, 139).addBox(-2.9813F, 14.775F, -2.2812F, 6.0F, 11.0F, 6.0F, 0.25F, false);
		right_leg.setTextureOffset(109, 43).addBox(-4.3063F, 14.025F, -4.4063F, 9.0F, 13.0F, 10.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 107).addBox(-4.3063F, 0.325F, -4.4063F, 9.0F, 13.0F, 10.0F, 0.0F, false);
		right_leg.setTextureOffset(101, 128).addBox(-4.4312F, 24.275F, -4.7813F, 9.0F, 6.0F, 11.0F, 0.25F, false);
		right_leg.setTextureOffset(0, 0).addBox(-4.4312F, 27.275F, -6.2813F, 1.0F, 3.0F, 1.0F, 0.25F, false);
		right_leg.setTextureOffset(53, 68).addBox(-4.4312F, 28.275F, -9.2813F, 1.0F, 2.0F, 3.0F, 0.25F, false);
		right_leg.setTextureOffset(53, 68).addBox(3.5688F, 28.275F, -9.2813F, 1.0F, 2.0F, 3.0F, 0.25F, false);
		right_leg.setTextureOffset(0, 0).addBox(3.5688F, 27.275F, -6.2813F, 1.0F, 3.0F, 1.0F, 0.25F, false);
		right_leg.setTextureOffset(53, 68).addBox(1.0688F, 28.275F, -9.2813F, 1.0F, 2.0F, 3.0F, 0.25F, false);
		right_leg.setTextureOffset(0, 0).addBox(1.0688F, 27.275F, -6.2813F, 1.0F, 3.0F, 1.0F, 0.25F, false);
		right_leg.setTextureOffset(53, 68).addBox(-1.6312F, 28.275F, -9.2813F, 1.0F, 2.0F, 3.0F, 0.25F, false);
		right_leg.setTextureOffset(0, 0).addBox(-1.6312F, 27.275F, -6.2813F, 1.0F, 3.0F, 1.0F, 0.25F, false);

		wire10 = new ModelRenderer(this);
		wire10.setRotationPoint(14.0938F, 56.15F, -0.6563F);
		right_leg.addChild(wire10);
		wire10.setTextureOffset(28, 107).addBox(-19.75F, -46.875F, 1.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire10.setTextureOffset(114, 42).addBox(-20.75F, -45.875F, 1.25F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		wire10.setTextureOffset(44, 107).addBox(-18.75F, -46.875F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wire10.setTextureOffset(103, 42).addBox(-19.75F, -40.875F, 1.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire10.setTextureOffset(40, 107).addBox(-18.75F, -39.875F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		wire11 = new ModelRenderer(this);
		wire11.setRotationPoint(0.3437F, 6.275F, -5.7063F);
		right_leg.addChild(wire11);
		setRotationAngle(wire11, -0.48F, -1.5708F, 0.0F);
		wire11.setTextureOffset(96, 30).addBox(-0.7F, -4.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire11.setTextureOffset(40, 114).addBox(-1.7F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		wire11.setTextureOffset(36, 107).addBox(0.3F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wire11.setTextureOffset(79, 94).addBox(-0.7F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire11.setTextureOffset(105, 29).addBox(0.3F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		left_arm_r6 = new ModelRenderer(this);
		left_arm_r6.setRotationPoint(-1.2F, 9.0F, 12.0F);
		wire11.addChild(left_arm_r6);
		setRotationAngle(left_arm_r6, 0.0F, 0.0F, -1.2217F);
		left_arm_r6.setTextureOffset(4, 107).addBox(-0.5F, -1.0F, -4.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		wire12 = new ModelRenderer(this);
		wire12.setRotationPoint(-1.1562F, 21.275F, 6.2937F);
		right_leg.addChild(wire12);
		setRotationAngle(wire12, -0.48F, -1.5708F, 0.0F);
		wire12.setTextureOffset(75, 94).addBox(-0.3F, -4.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire12.setTextureOffset(0, 107).addBox(0.7F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		wire12.setTextureOffset(99, 32).addBox(-1.3F, -4.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		wire12.setTextureOffset(66, 94).addBox(-0.3F, 2.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		wire12.setTextureOffset(75, 97).addBox(-1.3F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}