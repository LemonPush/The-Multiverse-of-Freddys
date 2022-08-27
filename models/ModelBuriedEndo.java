// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelBuriedEndo extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer mouth;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer left_leg2;
	private final ModelRenderer left_upper_leg2;
	private final ModelRenderer left_lower_leg2;
	private final ModelRenderer left_foot2;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_upper_arm;
	private final ModelRenderer left_lower_arm;
	private final ModelRenderer left_hand;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_upper_leg;
	private final ModelRenderer left_lower_leg;
	private final ModelRenderer lower5_r1;
	private final ModelRenderer left_foot;
	private final ModelRenderer lower4_r1;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_upper_arm;
	private final ModelRenderer right_lower_arm;
	private final ModelRenderer right_hand;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_upper_leg3;
	private final ModelRenderer right_lower_leg3;
	private final ModelRenderer lower6_r1;
	private final ModelRenderer right_foot3;
	private final ModelRenderer lower5_r2;

	public ModelBuriedEndo() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -17.375F, 1.625F);
		head.setTextureOffset(0, 0).addBox(-4.5F, -7.625F, -8.125F, 9.0F, 7.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(0, 26).addBox(-3.5F, -6.625F, -7.125F, 7.0F, 5.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(26, 47).addBox(-2.75F, -4.625F, -8.125F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 40).addBox(4.0F, -1.625F, -1.625F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 40).addBox(4.0F, 1.375F, -1.625F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(10, 49).addBox(4.0F, -1.625F, -1.625F, 1.0F, 4.0F, 1.0F, -0.8F, false);
		head.setTextureOffset(0, 40).addBox(-5.0F, 1.375F, -1.625F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(10, 49).addBox(-5.0F, -1.625F, -1.625F, 1.0F, 4.0F, 1.0F, -0.8F, true);
		head.setTextureOffset(0, 40).addBox(-5.0F, -1.625F, -1.625F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(47, 2).addBox(0.75F, -4.625F, -8.125F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(43, 47).addBox(-4.0F, -0.625F, -7.625F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(46, 14).addBox(3.0F, -0.625F, -7.625F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(45, 23).addBox(-3.0F, -0.625F, -7.625F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(53, 52).addBox(-4.0F, -1.625F, -7.625F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(50, 34).addBox(3.0F, -1.625F, -7.625F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(63, 49).addBox(-3.0F, -1.625F, -7.625F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(48, 32).addBox(-3.0F, -1.625F, -0.625F, 6.0F, 1.0F, 1.0F, 0.0F, false);

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, 2.0564F, -3.9601F);
		head.addChild(mouth);
		setRotationAngle(mouth, 0.2618F, 0.0F, 0.0F);
		mouth.setTextureOffset(53, 43).addBox(-4.0F, -0.0714F, -3.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		mouth.setTextureOffset(0, 16).addBox(-4.5F, -0.0714F, -4.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);
		mouth.setTextureOffset(0, 16).addBox(-4.5F, 0.9286F, -4.0F, 9.0F, 1.0F, 9.0F, 0.0F, false);
		mouth.setTextureOffset(51, 23).addBox(3.0F, -0.0714F, -3.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		mouth.setTextureOffset(65, 11).addBox(-3.0F, -0.0714F, -3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		mouth.setTextureOffset(63, 57).addBox(-3.0F, -0.0714F, 3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		mouth.setTextureOffset(22, 50).addBox(-4.0F, -1.0714F, -3.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		mouth.setTextureOffset(47, 0).addBox(-3.0F, -1.0714F, -3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		mouth.setTextureOffset(0, 50).addBox(3.0F, -1.0714F, -3.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(61, 0).addBox(-6.0F, -8.0F, -3.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(12, 64).addBox(-6.0F, -12.0F, -2.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(72, 13).addBox(-6.0F, -12.0F, -3.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(61, 0).addBox(-6.0F, -12.0F, 1.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(37, 19).addBox(5.0F, -8.0F, -3.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(0, 26).addBox(4.0F, -12.0F, -3.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(21, 35).addBox(-6.5F, -12.0F, -4.0F, 3.0F, 5.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(28, 28).addBox(-3.5F, -12.0F, -4.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(21, 35).addBox(3.5F, -12.0F, -4.0F, 3.0F, 5.0F, 7.0F, 0.0F, true);
		body.setTextureOffset(27, 19).addBox(-3.5F, -12.0F, 2.0F, 7.0F, 5.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(35, 42).addBox(-5.5F, -7.0F, -3.5F, 2.0F, 7.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(27, 0).addBox(-3.5F, -1.0F, -3.5F, 7.0F, 1.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(45, 19).addBox(-3.5F, -11.0F, -4.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(70, 23).addBox(-0.5F, -10.5F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(45, 19).addBox(0.5F, -9.0F, -4.0F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(70, 23).addBox(-3.5F, -8.5F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(45, 19).addBox(-3.5F, -7.0F, -4.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(70, 23).addBox(-0.5F, -6.5F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(45, 19).addBox(0.5F, -5.0F, -4.0F, 3.0F, 2.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(70, 23).addBox(-3.5F, -4.5F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(45, 19).addBox(-3.5F, -3.0F, -4.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(70, 23).addBox(-0.5F, -2.5F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(35, 42).addBox(3.5F, -7.0F, -3.5F, 2.0F, 7.0F, 6.0F, 0.0F, true);
		body.setTextureOffset(56, 14).addBox(-3.5F, -7.0F, 1.5F, 7.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 64).addBox(4.0F, -12.0F, -2.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(27, 0).addBox(4.0F, -12.0F, 1.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(34, 35).addBox(-4.5F, 0.5F, -2.0F, 9.0F, 4.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(34, 35).addBox(-4.5F, 0.5F, -2.0F, 9.0F, 4.0F, 3.0F, 0.5F, false);
		body.setTextureOffset(48, 61).addBox(-2.5F, 0.5F, -1.5F, 5.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(71, 59).addBox(-1.5F, 3.5F, -1.5F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(40, 61).addBox(-1.0F, -9.5F, -0.5F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(32, 61).addBox(-1.0F, -19.25F, 1.5F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(21, 26).addBox(-9.0F, -10.5F, -1.0F, 18.0F, 1.0F, 1.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(2.182F, 2.6464F, -0.5F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, 0.0F, 0.6109F);
		body_r1.setTextureOffset(46, 14).addBox(-0.5858F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(-2.182F, 2.6464F, -0.5F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, 0.0F, 0.0F, -0.6109F);
		body_r2.setTextureOffset(46, 14).addBox(-2.4142F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		left_leg2 = new ModelRenderer(this);
		left_leg2.setRotationPoint(3.7F, 4.0F, -0.5F);
		body.addChild(left_leg2);

		left_upper_leg2 = new ModelRenderer(this);
		left_upper_leg2.setRotationPoint(-4.5F, 20.0F, 0.5F);
		left_leg2.addChild(left_upper_leg2);

		left_lower_leg2 = new ModelRenderer(this);
		left_lower_leg2.setRotationPoint(-4.5F, 20.0F, 0.5F);
		left_leg2.addChild(left_lower_leg2);

		left_foot2 = new ModelRenderer(this);
		left_foot2.setRotationPoint(0.0F, 0.0F, 0.0F);
		left_lower_leg2.addChild(left_foot2);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(8.0F, -10.0F, -0.5F);

		left_upper_arm = new ModelRenderer(this);
		left_upper_arm.setRotationPoint(0.5F, 1.175F, 0.0F);
		left_arm.addChild(left_upper_arm);
		left_upper_arm.setTextureOffset(0, 38).addBox(0.5F, 1.075F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(23, 38).addBox(0.5F, 0.575F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(0, 38).addBox(0.5F, 4.075F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(23, 38).addBox(0.5F, 3.575F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(23, 38).addBox(0.5F, 2.575F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(0, 38).addBox(0.5F, 3.075F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(23, 38).addBox(0.5F, 1.575F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(0, 38).addBox(0.5F, 2.075F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(0, 38).addBox(0.5F, 1.075F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(23, 38).addBox(0.5F, 0.575F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(0, 38).addBox(0.5F, 4.075F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(23, 38).addBox(0.5F, 3.575F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(23, 38).addBox(0.5F, 2.575F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(0, 38).addBox(0.5F, 3.075F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(23, 38).addBox(0.5F, 1.575F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(0, 38).addBox(0.5F, 2.075F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(0, 49).addBox(0.0F, 0.325F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(49, 3).addBox(-1.0F, -1.175F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(49, 3).addBox(-1.0F, 6.825F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(57, 71).addBox(0.0F, 4.825F, -1.0F, 2.0F, 3.0F, 2.0F, -0.1F, false);
		left_upper_arm.setTextureOffset(63, 43).addBox(-0.5F, -2.675F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		left_upper_arm.setTextureOffset(45, 70).addBox(-0.5F, -2.925F, -1.5F, 3.0F, 1.0F, 3.0F, 0.25F, false);
		left_upper_arm.setTextureOffset(71, 64).addBox(1.5F, -1.925F, -1.5F, 1.0F, 1.0F, 3.0F, 0.25F, false);

		left_lower_arm = new ModelRenderer(this);
		left_lower_arm.setRotationPoint(1.5F, 8.0F, 0.0F);
		left_arm.addChild(left_lower_arm);
		left_lower_arm.setTextureOffset(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		left_lower_arm.setTextureOffset(61, 22).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_lower_arm.setTextureOffset(57, 71).addBox(-1.0F, 5.5F, -1.0F, 2.0F, 3.0F, 2.0F, -0.1F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setRotationPoint(0.0F, 7.4333F, 0.1667F);
		left_lower_arm.addChild(left_hand);
		left_hand.setTextureOffset(62, 61).addBox(-1.5F, 0.0667F, -1.6667F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		left_hand.setTextureOffset(24, 68).addBox(0.5F, 3.0667F, -1.6667F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		left_hand.setTextureOffset(30, 28).addBox(-1.5F, 3.0667F, -1.6667F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.9F, 4.0F, -0.5F);
		left_leg.setTextureOffset(8, 64).addBox(-1.0F, 8.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(12, 59).addBox(-1.0F, 17.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(53, 47).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		left_upper_leg = new ModelRenderer(this);
		left_upper_leg.setRotationPoint(-4.5F, 20.0F, 0.5F);
		left_leg.addChild(left_upper_leg);
		left_upper_leg.setTextureOffset(70, 19).addBox(3.0F, -12.75F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
		left_upper_leg.setTextureOffset(60, 32).addBox(3.0F, -18.5F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_upper_leg.setTextureOffset(69, 38).addBox(3.0F, -14.25F, -2.0F, 3.0F, 1.0F, 3.0F, 0.25F, false);
		left_upper_leg.setTextureOffset(16, 59).addBox(2.5F, -14.5F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		left_upper_leg.setTextureOffset(0, 59).addBox(2.5F, -16.25F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		left_upper_leg.setTextureOffset(0, 38).addBox(1.5F, -19.0F, -2.5F, 5.0F, 7.0F, 4.0F, 0.0F, false);
		left_upper_leg.setTextureOffset(14, 47).addBox(2.5F, -10.5F, -2.5F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		left_upper_leg.setTextureOffset(36, 56).addBox(2.5F, -18.0F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		left_upper_leg.setTextureOffset(69, 31).addBox(3.0F, -18.25F, -2.0F, 3.0F, 1.0F, 3.0F, 0.25F, false);
		left_upper_leg.setTextureOffset(63, 52).addBox(3.0F, -19.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		left_lower_leg = new ModelRenderer(this);
		left_lower_leg.setRotationPoint(-4.5F, 20.0F, 0.5F);
		left_leg.addChild(left_lower_leg);
		left_lower_leg.setTextureOffset(69, 0).addBox(3.0F, -10.75F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
		left_lower_leg.setTextureOffset(0, 0).addBox(3.5F, -10.0F, -1.5F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		left_lower_leg.setTextureOffset(0, 69).addBox(3.0F, -4.25F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
		left_lower_leg.setTextureOffset(66, 68).addBox(3.0F, -7.9F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
		left_lower_leg.setTextureOffset(57, 67).addBox(3.0F, -8.8F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
		left_lower_leg.setTextureOffset(48, 66).addBox(3.0F, -9.6F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
		left_lower_leg.setTextureOffset(65, 7).addBox(3.0F, -6.3F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
		left_lower_leg.setTextureOffset(20, 64).addBox(3.0F, -5.5F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
		left_lower_leg.setTextureOffset(48, 56).addBox(3.0F, -7.1F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
		left_lower_leg.setTextureOffset(45, 43).addBox(3.0F, -10.25F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
		left_lower_leg.setTextureOffset(14, 38).addBox(3.0F, -4.75F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, false);
		left_lower_leg.setTextureOffset(48, 28).addBox(3.0F, -1.0F, -4.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		lower5_r1 = new ModelRenderer(this);
		lower5_r1.setRotationPoint(4.5F, -1.4062F, -3.3304F);
		left_lower_leg.addChild(lower5_r1);
		setRotationAngle(lower5_r1, 0.3054F, 0.0F, 0.0F);
		lower5_r1.setTextureOffset(27, 7).addBox(-1.5F, -0.1188F, 0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		left_foot = new ModelRenderer(this);
		left_foot.setRotationPoint(0.0F, 0.0F, 0.0F);
		left_lower_leg.addChild(left_foot);
		left_foot.setTextureOffset(21, 28).addBox(3.0F, -2.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		left_foot.setTextureOffset(28, 8).addBox(2.0F, -3.0F, -6.5F, 5.0F, 3.0F, 8.0F, 0.0F, false);
		left_foot.setTextureOffset(69, 4).addBox(2.5F, -1.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		left_foot.setTextureOffset(53, 52).addBox(4.25F, -1.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		left_foot.setTextureOffset(0, 31).addBox(2.75F, -1.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		lower4_r1 = new ModelRenderer(this);
		lower4_r1.setRotationPoint(4.5F, -1.4062F, -3.3304F);
		left_foot.addChild(lower4_r1);
		setRotationAngle(lower4_r1, 0.3054F, 0.0F, 0.0F);
		lower4_r1.setTextureOffset(12, 69).addBox(-1.5F, -0.1188F, -1.7F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-8.0F, -10.0F, -0.5F);

		right_upper_arm = new ModelRenderer(this);
		right_upper_arm.setRotationPoint(-0.5F, 1.175F, 0.0F);
		right_arm.addChild(right_upper_arm);
		right_upper_arm.setTextureOffset(0, 38).addBox(-1.5F, 1.075F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(23, 38).addBox(-1.5F, 0.575F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(0, 38).addBox(-1.5F, 4.075F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(23, 38).addBox(-1.5F, 3.575F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(23, 38).addBox(-1.5F, 2.575F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(0, 38).addBox(-1.5F, 3.075F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(23, 38).addBox(-1.5F, 1.575F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(0, 38).addBox(-1.5F, 2.075F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(0, 38).addBox(-1.5F, 1.075F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(23, 38).addBox(-1.5F, 0.575F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(0, 38).addBox(-1.5F, 4.075F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(23, 38).addBox(-1.5F, 3.575F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(23, 38).addBox(-1.5F, 2.575F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(0, 38).addBox(-1.5F, 3.075F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(23, 38).addBox(-1.5F, 1.575F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(0, 38).addBox(-1.5F, 2.075F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(0, 49).addBox(-2.0F, 0.325F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(49, 3).addBox(-3.0F, -1.175F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(49, 3).addBox(-3.0F, 6.825F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(57, 71).addBox(-2.0F, 4.825F, -1.0F, 2.0F, 3.0F, 2.0F, -0.1F, true);
		right_upper_arm.setTextureOffset(63, 43).addBox(-2.5F, -2.675F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		right_upper_arm.setTextureOffset(45, 70).addBox(-2.5F, -2.925F, -1.5F, 3.0F, 1.0F, 3.0F, 0.25F, true);
		right_upper_arm.setTextureOffset(71, 64).addBox(-2.5F, -1.925F, -1.5F, 1.0F, 1.0F, 3.0F, 0.25F, true);

		right_lower_arm = new ModelRenderer(this);
		right_lower_arm.setRotationPoint(-1.5F, 8.0F, 0.0F);
		right_arm.addChild(right_lower_arm);
		right_lower_arm.setTextureOffset(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, true);
		right_lower_arm.setTextureOffset(61, 22).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, true);
		right_lower_arm.setTextureOffset(57, 71).addBox(-1.0F, 5.5F, -1.0F, 2.0F, 3.0F, 2.0F, -0.1F, true);

		right_hand = new ModelRenderer(this);
		right_hand.setRotationPoint(0.0F, 7.4333F, 0.1667F);
		right_lower_arm.addChild(right_hand);
		right_hand.setTextureOffset(62, 61).addBox(-1.5F, 0.0667F, -1.6667F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		right_hand.setTextureOffset(24, 68).addBox(-1.5F, 3.0667F, -1.6667F, 1.0F, 3.0F, 3.0F, 0.0F, true);
		right_hand.setTextureOffset(30, 28).addBox(0.5F, 3.0667F, -1.6667F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.9F, 4.0F, -0.5F);
		right_leg.setTextureOffset(8, 64).addBox(-1.0F, 8.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(12, 59).addBox(-1.0F, 17.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(53, 47).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);

		right_upper_leg3 = new ModelRenderer(this);
		right_upper_leg3.setRotationPoint(4.5F, 20.0F, 0.5F);
		right_leg.addChild(right_upper_leg3);
		right_upper_leg3.setTextureOffset(70, 19).addBox(-6.0F, -12.75F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
		right_upper_leg3.setTextureOffset(60, 32).addBox(-6.0F, -18.5F, -2.0F, 3.0F, 6.0F, 3.0F, 0.0F, true);
		right_upper_leg3.setTextureOffset(69, 38).addBox(-6.0F, -14.25F, -2.0F, 3.0F, 1.0F, 3.0F, 0.25F, true);
		right_upper_leg3.setTextureOffset(16, 59).addBox(-6.5F, -14.5F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, true);
		right_upper_leg3.setTextureOffset(0, 59).addBox(-6.5F, -16.25F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, true);
		right_upper_leg3.setTextureOffset(0, 38).addBox(-6.5F, -19.0F, -2.5F, 5.0F, 7.0F, 4.0F, 0.0F, true);
		right_upper_leg3.setTextureOffset(14, 47).addBox(-6.5F, -10.5F, -2.5F, 4.0F, 7.0F, 4.0F, 0.0F, true);
		right_upper_leg3.setTextureOffset(36, 56).addBox(-6.5F, -18.0F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, true);
		right_upper_leg3.setTextureOffset(69, 31).addBox(-6.0F, -18.25F, -2.0F, 3.0F, 1.0F, 3.0F, 0.25F, true);
		right_upper_leg3.setTextureOffset(63, 52).addBox(-6.0F, -19.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, true);

		right_lower_leg3 = new ModelRenderer(this);
		right_lower_leg3.setRotationPoint(4.5F, 20.0F, 0.5F);
		right_leg.addChild(right_lower_leg3);
		right_lower_leg3.setTextureOffset(69, 0).addBox(-6.0F, -10.75F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
		right_lower_leg3.setTextureOffset(0, 0).addBox(-5.5F, -10.0F, -1.5F, 2.0F, 7.0F, 2.0F, 0.0F, true);
		right_lower_leg3.setTextureOffset(0, 69).addBox(-6.0F, -4.25F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
		right_lower_leg3.setTextureOffset(66, 68).addBox(-6.0F, -7.9F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
		right_lower_leg3.setTextureOffset(57, 67).addBox(-6.0F, -8.8F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
		right_lower_leg3.setTextureOffset(48, 66).addBox(-6.0F, -9.6F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
		right_lower_leg3.setTextureOffset(65, 7).addBox(-6.0F, -6.3F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
		right_lower_leg3.setTextureOffset(20, 64).addBox(-6.0F, -5.5F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
		right_lower_leg3.setTextureOffset(48, 56).addBox(-6.0F, -7.1F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
		right_lower_leg3.setTextureOffset(45, 43).addBox(-6.0F, -10.25F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
		right_lower_leg3.setTextureOffset(14, 38).addBox(-6.0F, -4.75F, -2.0F, 3.0F, 1.0F, 3.0F, -0.25F, true);
		right_lower_leg3.setTextureOffset(48, 28).addBox(-6.0F, -1.0F, -4.0F, 3.0F, 1.0F, 2.0F, 0.0F, true);

		lower6_r1 = new ModelRenderer(this);
		lower6_r1.setRotationPoint(-4.5F, -1.4062F, -3.3304F);
		right_lower_leg3.addChild(lower6_r1);
		setRotationAngle(lower6_r1, 0.3054F, 0.0F, 0.0F);
		lower6_r1.setTextureOffset(27, 7).addBox(-1.5F, -0.1188F, 0.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		right_foot3 = new ModelRenderer(this);
		right_foot3.setRotationPoint(0.0F, 0.0F, 0.0F);
		right_lower_leg3.addChild(right_foot3);
		right_foot3.setTextureOffset(21, 28).addBox(-6.0F, -2.0F, -2.0F, 3.0F, 2.0F, 3.0F, 0.0F, true);
		right_foot3.setTextureOffset(28, 8).addBox(-7.0F, -3.0F, -6.5F, 5.0F, 3.0F, 8.0F, 0.0F, true);
		right_foot3.setTextureOffset(69, 4).addBox(-6.5F, -1.0F, -5.0F, 4.0F, 1.0F, 1.0F, 0.0F, true);
		right_foot3.setTextureOffset(53, 52).addBox(-6.25F, -1.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		right_foot3.setTextureOffset(0, 31).addBox(-4.75F, -1.0F, -6.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);

		lower5_r2 = new ModelRenderer(this);
		lower5_r2.setRotationPoint(-4.5F, -1.4062F, -3.3304F);
		right_foot3.addChild(lower5_r2);
		setRotationAngle(lower5_r2, 0.3054F, 0.0F, 0.0F);
		lower5_r2.setTextureOffset(12, 69).addBox(-1.5F, -0.1188F, -1.7F, 3.0F, 1.0F, 3.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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