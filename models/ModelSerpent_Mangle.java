// Made with Blockbench 4.2.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelSerpent_Mangle extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer body;
	private final ModelRenderer right_leg_r1;
	private final ModelRenderer right_leg_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer neck;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer right_arm_r4;
	private final ModelRenderer right_arm_r5;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_arm_r6;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm_r7;
	private final ModelRenderer right_arm_r8;
	private final ModelRenderer right_arm_r9;
	private final ModelRenderer other_arm;
	private final ModelRenderer right_leg_r3;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_leg_r4;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg_r5;
	private final ModelRenderer middle_leg;
	private final ModelRenderer right_leg_r6;

	public ModelSerpent_Mangle() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(-7.0217F, -20.0227F, -4.9788F);
		head.setTextureOffset(0, 15).addBox(-2.9783F, -3.9773F, -9.0212F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(65, 52).addBox(0.0217F, -4.9773F, -9.0212F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(24, 15).addBox(-0.9783F, -5.9773F, -6.0212F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 31).addBox(-1.9783F, 4.0227F, -15.0212F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(74, 55).addBox(-1.9783F, 3.0227F, -15.0212F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(7, 75).addBox(-1.9783F, 3.0227F, -14.0212F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(74, 49).addBox(3.0217F, 3.0227F, -14.0212F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(73, 0).addBox(3.0217F, 1.5227F, -14.0212F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(36, 36).addBox(-1.9783F, 1.5227F, -15.0212F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(24, 19).addBox(-1.9783F, 2.0227F, -15.0212F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(19, 74).addBox(-1.9783F, 1.5227F, -14.0212F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(28, 49).addBox(-0.9783F, 0.0227F, -14.8212F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(29, 11).addBox(-1.9783F, 0.5227F, -15.2212F, 6.0F, 1.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(53, 36).addBox(0.0217F, -0.4773F, -14.5212F, 2.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(64, 52).addBox(-1.7783F, -2.4773F, -9.5212F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(60, 23).addBox(1.7217F, -2.4773F, -9.5212F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(75, 6).addBox(-6.9783F, 1.0227F, -6.0212F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(77, 67).addBox(-7.9783F, -0.9773F, -6.0212F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(77, 67).addBox(8.0217F, -0.9773F, -6.0212F, 2.0F, 2.0F, 2.0F, 0.0F, true);
		head.setTextureOffset(75, 6).addBox(5.0217F, 1.0227F, -6.0212F, 4.0F, 2.0F, 2.0F, 0.0F, true);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(1.0217F, -5.4773F, -6.5212F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, -0.5236F, 1.5708F, 0.0F);
		head_r1.setTextureOffset(0, 39).addBox(-2.0F, -1.3F, 3.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 15).addBox(-2.0F, -4.8F, 2.7F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		head_r1.setTextureOffset(25, 0).addBox(-2.0F, -5.3F, 3.2F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		head_r1.setTextureOffset(6, 0).addBox(-2.0F, -5.8F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(1.0217F, -5.4773F, -6.5212F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, -0.5236F, -1.5708F, 0.0F);
		head_r2.setTextureOffset(28, 79).addBox(1.0F, -4.8F, 2.7F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		head_r2.setTextureOffset(7, 9).addBox(1.0F, -5.8F, 3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r2.setTextureOffset(0, 31).addBox(1.0F, -5.3F, 3.2F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		head_r2.setTextureOffset(44, 0).addBox(1.0F, -1.3F, 3.7F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(10, 69).addBox(-15.0F, -23.0F, -4.0F, 5.0F, 4.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(10, 69).addBox(-15.0F, -19.0F, -4.0F, 5.0F, 4.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(10, 69).addBox(-2.0F, -23.0F, -4.0F, 5.0F, 4.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(10, 69).addBox(-2.0F, -19.0F, -4.0F, 5.0F, 4.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(40, 19).addBox(-10.0F, -23.0F, -4.0F, 8.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(74, 11).addBox(-6.0F, -28.0F, -4.0F, 4.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(74, 11).addBox(-10.0F, -28.0F, -4.0F, 4.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(74, 11).addBox(-10.0F, -15.0F, -4.0F, 4.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(74, 11).addBox(-6.0F, -15.0F, -4.0F, 4.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(44, 0).addBox(-3.5F, 7.0F, -2.0F, 7.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(14, 75).addBox(-4.0F, 1.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(48, 77).addBox(-4.0F, -1.2F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(28, 44).addBox(1.0F, -1.2F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(77, 63).addBox(1.0F, -4.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(81, 49).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(77, 36).addBox(-5.0F, -4.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(48, 14).addBox(-4.0F, 4.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(42, 49).addBox(1.0F, 1.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(36, 79).addBox(5.0F, -4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(79, 22).addBox(-7.0F, -4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(20, 83).addBox(-1.0F, 6.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(12, 83).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(38, 39).addBox(5.0F, -15.0F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 39).addBox(-19.0F, -13.0F, 3.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		right_leg_r1 = new ModelRenderer(this);
		right_leg_r1.setRotationPoint(-5.0F, 9.0F, 1.0F);
		body.addChild(right_leg_r1);
		setRotationAngle(right_leg_r1, -0.5236F, 0.0F, 0.0F);
		right_leg_r1.setTextureOffset(19, 35).addBox(5.0F, -1.5F, 0.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg_r1.setTextureOffset(22, 21).addBox(3.5F, -3.0F, 2.0F, 4.0F, 4.0F, 10.0F, 0.0F, false);

		right_leg_r2 = new ModelRenderer(this);
		right_leg_r2.setRotationPoint(2.0F, -8.0F, 0.0F);
		body.addChild(right_leg_r2);
		setRotationAngle(right_leg_r2, 0.0F, 0.0F, 0.7418F);
		right_leg_r2.setTextureOffset(48, 49).addBox(-1.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(-6.0F, -19.0F, -1.0F);
		body.addChild(head_r3);
		setRotationAngle(head_r3, 0.0F, 0.0F, -0.7854F);
		head_r3.setTextureOffset(74, 11).addBox(-4.0F, 4.0F, -2.0F, 4.0F, 5.0F, 2.0F, 0.0F, false);
		head_r3.setTextureOffset(74, 11).addBox(0.0F, 4.0F, -2.0F, 4.0F, 5.0F, 2.0F, 0.0F, false);
		head_r3.setTextureOffset(74, 11).addBox(-4.0F, -9.0F, -2.0F, 4.0F, 5.0F, 2.0F, 0.0F, false);
		head_r3.setTextureOffset(74, 11).addBox(0.0F, -9.0F, -2.0F, 4.0F, 5.0F, 2.0F, 0.0F, false);
		head_r3.setTextureOffset(10, 69).addBox(4.0F, -4.0F, -2.0F, 5.0F, 4.0F, 2.0F, 0.0F, false);
		head_r3.setTextureOffset(10, 69).addBox(4.0F, 0.0F, -2.0F, 5.0F, 4.0F, 2.0F, 0.0F, false);
		head_r3.setTextureOffset(10, 69).addBox(-9.0F, 0.0F, -2.0F, 5.0F, 4.0F, 2.0F, 0.0F, false);
		head_r3.setTextureOffset(10, 69).addBox(-9.0F, -4.0F, -2.0F, 5.0F, 4.0F, 2.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(2.0F, -6.0F, 0.0F);
		body.addChild(neck);
		setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(5.3F, 3.5499F, -10.6346F);
		neck.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.9635F, 0.0F, 0.5672F);
		right_arm_r1.setTextureOffset(48, 36).addBox(0.3F, -1.1499F, 3.0346F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(5.3F, 3.5499F, -10.6346F);
		neck.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, -2.6023F, -0.05F, -0.0418F);
		right_arm_r2.setTextureOffset(15, 39).addBox(-2.0F, 2.3614F, 2.7233F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm_r2.setTextureOffset(70, 24).addBox(-2.5F, -2.6386F, 2.2233F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(3.1285F, 6.3503F, -3.3283F);
		neck.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, -1.8159F, -0.0934F, 0.5603F);
		right_arm_r3.setTextureOffset(32, 56).addBox(-0.6359F, 1.6278F, 0.8498F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(3.1285F, 6.3503F, -3.3283F);
		neck.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, 0.1745F, 0.0F, 0.0F);
		right_arm_r4.setTextureOffset(44, 57).addBox(-1.6285F, -6.3503F, 1.8283F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_arm_r4.setTextureOffset(22, 60).addBox(-1.1285F, -0.3503F, 2.3283F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		right_arm_r5 = new ModelRenderer(this);
		right_arm_r5.setRotationPoint(3.1285F, 6.3503F, -3.3283F);
		neck.addChild(right_arm_r5);
		setRotationAngle(right_arm_r5, -1.0908F, 0.0F, 0.0F);
		right_arm_r5.setTextureOffset(0, 72).addBox(-1.6285F, -2.9326F, -0.5788F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		right_arm_r5.setTextureOffset(79, 71).addBox(-1.1285F, 2.0674F, -0.0788F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, -4.0F, 0.0F);
		right_arm.setTextureOffset(50, 81).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(65, 15).addBox(-4.5F, -2.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		right_arm_r6 = new ModelRenderer(this);
		right_arm_r6.setRotationPoint(5.0F, 5.0F, 1.0F);
		right_arm.addChild(right_arm_r6);
		setRotationAngle(right_arm_r6, -1.2654F, 0.0F, 0.0F);
		right_arm_r6.setTextureOffset(70, 72).addBox(-9.5F, 1.0F, -2.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		right_arm_r6.setTextureOffset(38, 75).addBox(-10.5F, 11.0F, -0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r6.setTextureOffset(76, 32).addBox(-10.5F, 11.0F, -1.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r6.setTextureOffset(77, 18).addBox(-10.5F, 11.0F, 0.5F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r6.setTextureOffset(62, 0).addBox(-11.5F, 10.8F, -5.5F, 7.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r6.setTextureOffset(26, 74).addBox(-10.5F, 9.8F, -7.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
		right_arm_r6.setTextureOffset(0, 56).addBox(-11.5F, 9.8F, -6.5F, 7.0F, 4.0F, 1.0F, 0.0F, false);
		right_arm_r6.setTextureOffset(63, 35).addBox(-11.0F, 9.8F, 1.5F, 6.0F, 5.0F, 1.0F, 0.0F, false);
		right_arm_r6.setTextureOffset(68, 58).addBox(-11.0F, 10.8F, 0.5F, 6.0F, 4.0F, 1.0F, 0.0F, false);
		right_arm_r6.setTextureOffset(0, 0).addBox(-11.5F, 6.8F, -8.5F, 7.0F, 4.0F, 11.0F, 0.0F, false);
		right_arm_r6.setTextureOffset(25, 0).addBox(-11.0F, 7.0F, -5.5F, 6.0F, 4.0F, 7.0F, 0.0F, false);
		right_arm_r6.setTextureOffset(78, 81).addBox(-9.0F, 6.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.15F, -3.6501F, -1.3346F);
		left_arm.setTextureOffset(17, 80).addBox(1.85F, 3.6501F, 0.3346F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(58, 26).addBox(1.35F, -2.3499F, -0.1654F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		right_arm_r7 = new ModelRenderer(this);
		right_arm_r7.setRotationPoint(5.15F, 2.2F, -9.3F);
		left_arm.addChild(right_arm_r7);
		setRotationAngle(right_arm_r7, -1.9635F, 0.0F, 0.5672F);
		right_arm_r7.setTextureOffset(80, 0).addBox(-1.0F, -0.1499F, 1.0346F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm_r7.setTextureOffset(56, 57).addBox(-1.5F, -6.1499F, 0.5346F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		right_arm_r8 = new ModelRenderer(this);
		right_arm_r8.setRotationPoint(5.15F, 2.2F, -9.3F);
		left_arm.addChild(right_arm_r8);
		setRotationAngle(right_arm_r8, 3.0543F, 0.0F, 0.5672F);
		right_arm_r8.setTextureOffset(0, 80).addBox(-1.0F, 3.3614F, -0.2767F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm_r8.setTextureOffset(72, 41).addBox(-1.5F, -1.6386F, -0.7767F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		right_arm_r9 = new ModelRenderer(this);
		right_arm_r9.setRotationPoint(-5.15F, 4.6501F, 2.3346F);
		left_arm.addChild(right_arm_r9);
		setRotationAngle(right_arm_r9, -1.2654F, 0.0F, 0.0F);
		right_arm_r9.setTextureOffset(58, 72).addBox(6.5F, 1.0F, -2.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		right_arm_r9.setTextureOffset(56, 80).addBox(7.0F, 6.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		other_arm = new ModelRenderer(this);
		other_arm.setRotationPoint(-1.9F, 8.0F, 2.0F);
		setRotationAngle(other_arm, -3.1416F, 0.0F, -0.6545F);
		other_arm.setTextureOffset(42, 81).addBox(-1.1F, 7.0F, -5.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		other_arm.setTextureOffset(81, 40).addBox(-1.1F, 14.0F, -5.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		other_arm.setTextureOffset(63, 4).addBox(-1.6F, 8.0F, -5.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		other_arm.setTextureOffset(16, 52).addBox(-2.1F, 15.0F, -6.1F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		right_leg_r3 = new ModelRenderer(this);
		right_leg_r3.setRotationPoint(-0.1F, 8.25F, -4.0F);
		other_arm.addChild(right_leg_r3);
		setRotationAngle(right_leg_r3, -0.48F, 0.0F, 0.0F);
		right_leg_r3.setTextureOffset(0, 61).addBox(-1.5F, -7.25F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg_r3.setTextureOffset(6, 81).addBox(-1.0F, -8.25F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.1F, 8.0F, -1.0F);
		setRotationAngle(right_leg, 0.0F, 0.5236F, 0.0F);
		right_leg.setTextureOffset(82, 57).addBox(-0.6321F, 7.0F, -5.4641F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(82, 29).addBox(-0.6321F, 14.0F, -5.4641F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(37, 66).addBox(-1.1321F, 8.0F, -5.9641F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(19, 35).addBox(-2.1321F, 14.0F, -8.9641F, 5.0F, 2.0F, 7.0F, 0.1F, false);
		right_leg.setTextureOffset(53, 39).addBox(1.8679F, 15.0F, -10.6641F, 1.0F, 1.0F, 2.0F, 0.1F, false);
		right_leg.setTextureOffset(28, 51).addBox(-2.1321F, 15.0F, -10.6641F, 1.0F, 1.0F, 2.0F, 0.1F, false);
		right_leg.setTextureOffset(0, 52).addBox(-0.1321F, 15.0F, -10.6641F, 1.0F, 1.0F, 2.0F, 0.1F, false);

		right_leg_r4 = new ModelRenderer(this);
		right_leg_r4.setRotationPoint(0.3679F, 7.25F, -4.4641F);
		right_leg.addChild(right_leg_r4);
		setRotationAngle(right_leg_r4, -0.48F, 0.0F, 0.0F);
		right_leg_r4.setTextureOffset(65, 63).addBox(-1.5F, -6.25F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg_r4.setTextureOffset(82, 26).addBox(-1.0F, -7.25F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.1F, 8.0F, -1.0F);
		setRotationAngle(left_leg, 0.0F, -0.5236F, 0.0F);
		left_leg.setTextureOffset(0, 83).addBox(-1.3679F, 7.0F, -5.4641F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(82, 60).addBox(-1.3679F, 14.0F, -5.4641F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(49, 66).addBox(-1.8679F, 8.0F, -5.9641F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 49).addBox(-2.3679F, 15.0F, -7.9641F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(48, 7).addBox(-2.3679F, 14.6F, -7.9641F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(58, 18).addBox(-2.8679F, 15.0F, -9.6641F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(53, 57).addBox(-0.8679F, 15.0F, -9.6641F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(41, 56).addBox(1.1321F, 15.0F, -9.6641F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		right_leg_r5 = new ModelRenderer(this);
		right_leg_r5.setRotationPoint(-0.3679F, 8.25F, -4.4641F);
		left_leg.addChild(right_leg_r5);
		setRotationAngle(right_leg_r5, -0.48F, 0.0F, 0.0F);
		right_leg_r5.setTextureOffset(25, 65).addBox(-1.5F, -7.25F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg_r5.setTextureOffset(82, 74).addBox(-1.0F, -8.25F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		middle_leg = new ModelRenderer(this);
		middle_leg.setRotationPoint(3.1F, 8.0F, 1.0F);
		setRotationAngle(middle_leg, 0.0F, 0.0436F, 0.0F);
		middle_leg.setTextureOffset(80, 78).addBox(-0.8383F, 7.0F, 3.0057F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		middle_leg.setTextureOffset(72, 80).addBox(-0.8383F, 14.0F, 3.0057F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		middle_leg.setTextureOffset(60, 43).addBox(-1.3383F, 8.0F, 2.5057F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		middle_leg.setTextureOffset(44, 29).addBox(-1.8383F, 15.0F, 1.5057F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		middle_leg.setTextureOffset(14, 44).addBox(-1.8383F, 14.6F, 1.5057F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		middle_leg.setTextureOffset(14, 51).addBox(-2.3383F, 15.0F, 7.2057F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		middle_leg.setTextureOffset(0, 49).addBox(-0.3383F, 15.0F, 7.2057F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		middle_leg.setTextureOffset(36, 38).addBox(1.6617F, 15.0F, 7.2057F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		right_leg_r6 = new ModelRenderer(this);
		right_leg_r6.setRotationPoint(0.1617F, 8.25F, 4.0057F);
		middle_leg.addChild(right_leg_r6);
		setRotationAngle(right_leg_r6, 0.48F, 0.0F, 0.0F);
		right_leg_r6.setTextureOffset(13, 60).addBox(-1.5F, -7.25F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg_r6.setTextureOffset(64, 80).addBox(-1.0F, -8.25F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		other_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		middle_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
		this.middle_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}