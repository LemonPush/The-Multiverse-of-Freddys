// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelTrapped_Afton extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer mask;
	private final ModelRenderer ear_left;
	private final ModelRenderer head_r1;
	private final ModelRenderer ear_right;
	private final ModelRenderer jaw;
	private final ModelRenderer skull;
	private final ModelRenderer body;
	private final ModelRenderer flesh_body;
	private final ModelRenderer body2;
	private final ModelRenderer left_arm;
	private final ModelRenderer flesh_left_arm;
	private final ModelRenderer left_arm4;
	private final ModelRenderer right_arm;
	private final ModelRenderer flesh_right_arm;
	private final ModelRenderer right_arm2;
	private final ModelRenderer right_leg;
	private final ModelRenderer flesh_right_leg;
	private final ModelRenderer right_leg2;
	private final ModelRenderer left_leg;
	private final ModelRenderer flesh_left_leg;
	private final ModelRenderer left_leg4;

	public ModelTrapped_Afton() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -0.253F, 0.1333F);
		head.setTextureOffset(50, 8).addBox(-3.0F, -1.947F, -1.1333F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(44, 14).addBox(-3.5F, -7.947F, -1.1333F, 7.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(62, 62).addBox(2.5F, -6.947F, -1.1333F, 1.0F, 6.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(20, 63).addBox(2.5F, -2.947F, 0.8667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(14, 63).addBox(2.0F, -2.947F, 1.3667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(62, 38).addBox(-3.0F, -2.947F, 1.3667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(61, 24).addBox(-2.0F, -2.947F, 2.3667F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(50, 64).addBox(-1.0F, -4.947F, 2.3667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(64, 27).addBox(-1.0F, -6.447F, 1.8667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(64, 19).addBox(-1.0F, -7.947F, 0.8667F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(44, 52).addBox(-3.5F, -2.947F, 0.8667F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(32, 65).addBox(-3.0F, -5.447F, -3.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 65).addBox(-3.5F, -5.447F, -2.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(64, 22).addBox(1.0F, -5.447F, -3.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(62, 42).addBox(1.5F, -5.447F, -2.1333F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(56, 62).addBox(-3.5F, -6.947F, -1.1333F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		mask = new ModelRenderer(this);
		mask.setRotationPoint(0.0F, -4.0662F, 4.3051F);
		head.addChild(mask);
		setRotationAngle(mask, -0.6109F, 0.0F, 0.0F);
		mask.setTextureOffset(0, 0).addBox(-4.0F, -4.3808F, -8.4385F, 8.0F, 6.0F, 8.0F, 0.0F, false);
		mask.setTextureOffset(62, 34).addBox(-2.55F, -2.9308F, -8.5385F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(62, 34).addBox(-2.45F, -2.9308F, -8.5385F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		mask.setTextureOffset(62, 34).addBox(0.45F, -2.9308F, -8.5385F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(62, 34).addBox(0.55F, -2.9308F, -8.5385F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		mask.setTextureOffset(59, 30).addBox(-2.5F, -0.3808F, -9.4385F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		mask.setTextureOffset(0, 30).addBox(-0.5F, -0.6308F, -9.9385F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(24, 0).addBox(1.5F, 1.2692F, -8.9885F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(6, 64).addBox(2.75F, 1.2692F, -8.3885F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		mask.setTextureOffset(24, 0).addBox(0.25F, 1.2692F, -9.3885F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		mask.setTextureOffset(24, 0).addBox(-1.25F, 1.2692F, -9.3885F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		mask.setTextureOffset(24, 0).addBox(-2.5F, 1.2692F, -8.9885F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		mask.setTextureOffset(6, 64).addBox(-3.75F, 1.2692F, -8.3885F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		ear_left = new ModelRenderer(this);
		ear_left.setRotationPoint(2.05F, -4.3097F, -4.3899F);
		mask.addChild(ear_left);
		setRotationAngle(ear_left, 0.1745F, 0.0F, 0.2094F);
		ear_left.setTextureOffset(12, 43).addBox(-1.5F, -4.571F, -1.0485F, 3.0F, 4.0F, 2.0F, 0.0F, true);
		ear_left.setTextureOffset(24, 2).addBox(-0.5F, -5.571F, -0.5485F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		ear_left.setTextureOffset(0, 14).addBox(-0.5F, -0.571F, -0.5485F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		ear_left.setTextureOffset(0, 43).addBox(-1.0F, -4.571F, -0.5485F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -4.0F, -1.0F);
		ear_left.addChild(head_r1);
		setRotationAngle(head_r1, 0.5672F, 0.0F, 0.0F);
		head_r1.setTextureOffset(5, 0).addBox(-0.5F, -3.4861F, 1.0556F, 1.0F, 0.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(26, 63).addBox(-1.0F, -3.4861F, 1.0556F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(45, 0).addBox(-1.0F, -4.3249F, 0.3086F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head_r1.setTextureOffset(21, 30).addBox(-1.5F, -3.3249F, 0.3086F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		ear_right = new ModelRenderer(this);
		ear_right.setRotationPoint(-2.05F, -4.3097F, -4.3899F);
		mask.addChild(ear_right);
		setRotationAngle(ear_right, 0.1745F, 0.0F, -0.2094F);
		ear_right.setTextureOffset(12, 43).addBox(-1.5F, -4.571F, -1.0485F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		ear_right.setTextureOffset(24, 2).addBox(-0.5F, -5.571F, -0.5485F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		ear_right.setTextureOffset(0, 14).addBox(-0.5F, -0.571F, -0.5485F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		ear_right.setTextureOffset(0, 43).addBox(-1.0F, -4.571F, -0.5485F, 2.0F, 4.0F, 1.0F, 0.0F, true);

		jaw = new ModelRenderer(this);
		jaw.setRotationPoint(0.0F, -1.1807F, -0.0361F);
		head.addChild(jaw);
		setRotationAngle(jaw, 0.3054F, 0.0F, 0.0F);
		jaw.setTextureOffset(54, 11).addBox(-2.5F, -0.2344F, -4.9962F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		jaw.setTextureOffset(6, 64).addBox(2.75F, -0.8344F, -3.9462F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		jaw.setTextureOffset(48, 17).addBox(2.95F, -0.8344F, -3.5462F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		jaw.setTextureOffset(48, 17).addBox(-3.95F, -0.8344F, -3.5462F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		jaw.setTextureOffset(24, 0).addBox(-4.0F, -2.1844F, -0.9962F, 8.0F, 2.0F, 5.0F, 0.0F, false);
		jaw.setTextureOffset(24, 0).addBox(1.5F, -0.8344F, -4.5462F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		jaw.setTextureOffset(24, 0).addBox(0.25F, -0.8344F, -4.9462F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		jaw.setTextureOffset(42, 22).addBox(3.0F, -0.2344F, -3.9962F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		jaw.setTextureOffset(42, 22).addBox(-4.0F, -0.2344F, -3.9962F, 1.0F, 1.0F, 8.0F, 0.0F, true);
		jaw.setTextureOffset(59, 36).addBox(-3.0F, -0.2344F, 3.0038F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		jaw.setTextureOffset(59, 0).addBox(-3.0F, -0.2344F, -3.9962F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		jaw.setTextureOffset(24, 0).addBox(-1.25F, -0.8344F, -4.9462F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		jaw.setTextureOffset(24, 0).addBox(-2.5F, -0.8344F, -4.5462F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		jaw.setTextureOffset(6, 64).addBox(-3.75F, -0.8344F, -3.9462F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		skull = new ModelRenderer(this);
		skull.setRotationPoint(0.0F, 22.053F, -0.1333F);
		head.addChild(skull);
		skull.setTextureOffset(18, 44).addBox(-2.0F, -25.0F, -3.0F, 4.0F, 2.0F, 5.0F, 0.25F, false);
		skull.setTextureOffset(52, 44).addBox(-1.15F, -25.0F, -3.05F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		skull.setTextureOffset(26, 30).addBox(-2.5F, -29.5F, -3.0F, 5.0F, 4.0F, 6.0F, 0.25F, false);
		skull.setTextureOffset(64, 7).addBox(-2.5F, -28.75F, -3.85F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		skull.setTextureOffset(64, 7).addBox(0.5F, -28.75F, -3.85F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(24, 51).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 30).addBox(-4.0F, 0.0F, -2.5F, 8.0F, 8.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(36, 44).addBox(-3.5F, 0.75F, -2.75F, 7.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 32).addBox(-0.5F, 1.75F, -3.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(32, 7).addBox(-3.5F, 8.5F, -2.0F, 7.0F, 3.0F, 4.0F, 0.25F, false);
		body.setTextureOffset(66, 62).addBox(-3.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(43, 66).addBox(-3.0F, 4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(66, 38).addBox(-3.0F, 5.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(65, 44).addBox(1.0F, 5.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(66, 10).addBox(1.0F, 4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(37, 66).addBox(1.0F, 2.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(26, 40).addBox(-5.0F, 0.25F, -1.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(42, 31).addBox(-3.5F, 9.5F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(62, 2).addBox(-1.0F, -2.5F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		flesh_body = new ModelRenderer(this);
		flesh_body.setRotationPoint(0.0F, 22.0F, 0.0F);
		body.addChild(flesh_body);
		flesh_body.setTextureOffset(58, 58).addBox(-2.5F, -14.0F, -1.0F, 5.0F, 2.0F, 2.0F, 0.25F, false);
		flesh_body.setTextureOffset(61, 15).addBox(-1.5F, -16.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.25F, false);
		flesh_body.setTextureOffset(61, 15).addBox(-1.5F, -19.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.25F, false);
		flesh_body.setTextureOffset(58, 58).addBox(-2.5F, -21.7F, -1.0F, 5.0F, 2.0F, 2.0F, 0.25F, false);
		flesh_body.setTextureOffset(0, 14).addBox(-4.0F, -22.2F, -2.0F, 8.0F, 12.0F, 4.0F, -0.3F, false);

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(0.0F, -0.2F, -8.0F);
		body.addChild(body2);
		body2.setTextureOffset(24, 14).addBox(-4.0F, 0.0F, 6.0F, 8.0F, 12.0F, 4.0F, -0.4F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(3.9F, 0.85F, 0.0F);
		left_arm.setTextureOffset(16, 51).addBox(1.1F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, true);
		left_arm.setTextureOffset(58, 51).addBox(0.6F, -0.6F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, true);
		left_arm.setTextureOffset(56, 44).addBox(0.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, true);
		left_arm.setTextureOffset(56, 44).addBox(0.6F, -0.75F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, true);
		left_arm.setTextureOffset(32, 52).addBox(0.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, true);
		left_arm.setTextureOffset(52, 24).addBox(0.6F, 8.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.25F, true);
		left_arm.setTextureOffset(20, 14).addBox(1.1F, 9.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, true);

		flesh_left_arm = new ModelRenderer(this);
		flesh_left_arm.setRotationPoint(-0.5F, 21.15F, 0.0F);
		left_arm.addChild(flesh_left_arm);
		flesh_left_arm.setTextureOffset(0, 0).addBox(1.6F, -19.5F, -1.0F, 2.0F, 5.0F, 2.0F, 0.2F, true);

		left_arm4 = new ModelRenderer(this);
		left_arm4.setRotationPoint(-7.9F, 1.35F, 0.0F);
		left_arm.addChild(left_arm4);
		left_arm4.setTextureOffset(0, 51).addBox(9.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.1F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-3.9F, 0.85F, 0.0F);
		right_arm.setTextureOffset(16, 51).addBox(-3.1F, -0.6F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(58, 51).addBox(-3.6F, -0.6F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, false);
		right_arm.setTextureOffset(56, 44).addBox(-3.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(56, 44).addBox(-3.6F, -0.75F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(32, 52).addBox(-3.6F, 4.15F, -1.5F, 3.0F, 4.0F, 3.0F, 0.25F, false);
		right_arm.setTextureOffset(52, 24).addBox(-3.6F, 8.9F, -1.5F, 3.0F, 3.0F, 3.0F, 0.25F, false);
		right_arm.setTextureOffset(20, 14).addBox(-3.1F, 9.15F, -1.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);

		flesh_right_arm = new ModelRenderer(this);
		flesh_right_arm.setRotationPoint(0.5F, 21.15F, 0.0F);
		right_arm.addChild(flesh_right_arm);
		flesh_right_arm.setTextureOffset(0, 0).addBox(-3.6F, -19.5F, -1.0F, 2.0F, 5.0F, 2.0F, 0.2F, false);

		right_arm2 = new ModelRenderer(this);
		right_arm2.setRotationPoint(7.9F, 1.35F, 0.0F);
		right_arm.addChild(right_arm2);
		right_arm2.setTextureOffset(0, 51).addBox(-11.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, 0.1F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.0F, 11.2917F, -0.1667F);
		right_leg.setTextureOffset(8, 51).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(50, 36).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(32, 59).addBox(-1.0F, 6.8083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, false);
		right_leg.setTextureOffset(50, 0).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.25F, false);
		right_leg.setTextureOffset(52, 17).addBox(-1.5F, 6.7083F, -1.3333F, 3.0F, 4.0F, 3.0F, 0.25F, false);
		right_leg.setTextureOffset(0, 43).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, false);

		flesh_right_leg = new ModelRenderer(this);
		flesh_right_leg.setRotationPoint(2.0F, 10.7083F, 0.1667F);
		right_leg.addChild(flesh_right_leg);
		flesh_right_leg.setTextureOffset(42, 57).addBox(-3.0F, -8.75F, -1.0F, 2.0F, 7.0F, 2.0F, 0.2F, false);

		right_leg2 = new ModelRenderer(this);
		right_leg2.setRotationPoint(4.0F, 0.4083F, 0.2667F);
		right_leg.addChild(right_leg2);
		right_leg2.setTextureOffset(50, 50).addBox(-5.0F, 0.1F, -1.1F, 2.0F, 12.0F, 2.0F, 0.1F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.0F, 11.2917F, -0.1667F);
		left_leg.setTextureOffset(8, 51).addBox(-1.0F, -0.0417F, -0.8333F, 2.0F, 11.0F, 2.0F, 0.0F, true);
		left_leg.setTextureOffset(50, 36).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.0F, true);
		left_leg.setTextureOffset(32, 59).addBox(-1.0F, 6.8083F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.25F, true);
		left_leg.setTextureOffset(50, 0).addBox(-1.5F, 0.9583F, -1.3333F, 3.0F, 5.0F, 3.0F, 0.25F, true);
		left_leg.setTextureOffset(52, 17).addBox(-1.5F, 6.7083F, -1.3333F, 3.0F, 4.0F, 3.0F, 0.25F, true);
		left_leg.setTextureOffset(0, 43).addBox(-1.5F, 10.7083F, -3.8333F, 3.0F, 2.0F, 6.0F, 0.0F, true);

		flesh_left_leg = new ModelRenderer(this);
		flesh_left_leg.setRotationPoint(-2.0F, 10.7083F, 0.1667F);
		left_leg.addChild(flesh_left_leg);
		flesh_left_leg.setTextureOffset(42, 57).addBox(1.0F, -8.75F, -1.0F, 2.0F, 7.0F, 2.0F, 0.2F, true);

		left_leg4 = new ModelRenderer(this);
		left_leg4.setRotationPoint(-4.0F, 0.4083F, 0.2667F);
		left_leg.addChild(left_leg4);
		left_leg4.setTextureOffset(50, 50).addBox(3.0F, 0.1F, -1.1F, 2.0F, 12.0F, 2.0F, 0.1F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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