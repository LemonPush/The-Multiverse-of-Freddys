// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelBlackice_Frostbear extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer body;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer right_arm_r4;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm_r5;
	private final ModelRenderer right_arm_r6;
	private final ModelRenderer right_arm_r7;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_arm_r8;
	private final ModelRenderer right_arm_r9;
	private final ModelRenderer right_arm_r10;
	private final ModelRenderer right_arm_r11;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_arm_r12;
	private final ModelRenderer right_arm_r13;
	private final ModelRenderer right_arm_r14;
	private final ModelRenderer right_arm_r15;

	public ModelBlackice_Frostbear() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(56, 64).addBox(-2.0F, -18.0F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(40, 20).addBox(-3.0F, -15.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(58, 0).addBox(-4.0F, -6.0F, -6.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(59, 27).addBox(-4.0F, -7.0F, -6.0F, 8.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(40, 27).addBox(-4.0F, -9.5F, -6.8F, 8.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(13, 67).addBox(-3.0F, -10.0F, -6.5F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(38, 48).addBox(-1.0F, -11.0F, -6.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(37, 68).addBox(-2.8F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(31, 68).addBox(0.7F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(40, 6).addBox(0.7F, -13.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(40, 6).addBox(-2.8F, -13.5F, -4.2F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(28, 47).addBox(-5.0F, -9.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(18, 44).addBox(4.0F, -9.5F, -4.0F, 1.0F, 3.0F, 8.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-4.5F, -13.5F, 0.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, 0.6109F);
		head_r1.setTextureOffset(0, 4).addBox(-3.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(18, 36).addBox(0.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(4.5F, -13.5F, 0.0F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, -0.6109F);
		head_r2.setTextureOffset(24, 0).addBox(0.0F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head_r2.setTextureOffset(18, 38).addBox(-1.0F, -1.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(18, 36).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 16).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 11.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(54, 36).addBox(-4.0F, -3.0F, -3.5F, 8.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(58, 24).addBox(-3.5F, -4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(58, 4).addBox(-3.5F, 4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(12, 49).addBox(-3.0F, -5.0F, -3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(58, 15).addBox(-1.0F, -5.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(40, 58).addBox(1.0F, -6.0F, -4.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(38, 51).addBox(-3.0F, -6.0F, -4.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(40, 20).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(25, 16).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(28, 47).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(28, 44).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
		right_arm.setTextureOffset(60, 54).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 16).addBox(-4.5F, -5.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		right_arm.setTextureOffset(0, 16).addBox(-2.5F, -5.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		right_arm.setTextureOffset(0, 0).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(-6.0F, 0.5F, 0.0F);
		right_arm.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -0.7854F, 0.0F, -1.5708F);
		right_arm_r1.setTextureOffset(0, 16).addBox(0.5F, -3.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		right_arm_r1.setTextureOffset(0, 16).addBox(-1.5F, -3.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-6.0F, 0.5F, 0.0F);
		right_arm.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, 0.7854F, 0.0F, -1.5708F);
		right_arm_r2.setTextureOffset(0, 16).addBox(-1.5F, -3.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		right_arm_r2.setTextureOffset(0, 16).addBox(0.5F, -3.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(-3.0F, 10.3333F, 1.0F);
		right_arm.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, -1.5708F, 0.0F, 0.0F);
		right_arm_r3.setTextureOffset(0, 36).addBox(-2.5F, 7.1667F, -19.0F, 5.0F, 5.0F, 8.0F, -0.75F, false);
		right_arm_r3.setTextureOffset(39, 36).addBox(-1.5F, 8.1667F, -26.0F, 3.0F, 3.0F, 9.0F, -0.75F, false);
		right_arm_r3.setTextureOffset(0, 0).addBox(-2.0F, 7.6667F, -13.0F, 4.0F, 4.0F, 32.0F, -0.75F, false);
		right_arm_r3.setTextureOffset(62, 16).addBox(-2.0F, 7.6667F, -7.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm_r3.setTextureOffset(40, 13).addBox(-1.0F, 6.6667F, -6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm_r3.setTextureOffset(62, 6).addBox(-2.0F, 1.6667F, -7.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(-4.0F, -3.5F, 0.0F);
		right_arm.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, 0.0F, 0.0F, -1.5708F);
		right_arm_r4.setTextureOffset(0, 16).addBox(-3.5F, -3.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		right_arm_r4.setTextureOffset(0, 16).addBox(-5.5F, -3.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
		left_arm.setTextureOffset(0, 16).addBox(3.5F, -5.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 16).addBox(1.5F, -5.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		left_arm.setTextureOffset(46, 48).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 61).addBox(1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(40, 10).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(40, 3).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(59, 44).addBox(1.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		right_arm_r5 = new ModelRenderer(this);
		right_arm_r5.setRotationPoint(6.0F, 0.5F, 0.0F);
		left_arm.addChild(right_arm_r5);
		setRotationAngle(right_arm_r5, -0.7854F, 0.0F, 1.5708F);
		right_arm_r5.setTextureOffset(0, 16).addBox(-1.5F, -3.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r5.setTextureOffset(0, 16).addBox(0.5F, -3.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		right_arm_r6 = new ModelRenderer(this);
		right_arm_r6.setRotationPoint(6.0F, 0.5F, 0.0F);
		left_arm.addChild(right_arm_r6);
		setRotationAngle(right_arm_r6, 0.7854F, 0.0F, 1.5708F);
		right_arm_r6.setTextureOffset(0, 16).addBox(-1.5F, -3.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r6.setTextureOffset(0, 16).addBox(0.5F, -3.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		right_arm_r7 = new ModelRenderer(this);
		right_arm_r7.setRotationPoint(4.0F, -3.5F, 0.0F);
		left_arm.addChild(right_arm_r7);
		setRotationAngle(right_arm_r7, 0.0F, 0.0F, 1.5708F);
		right_arm_r7.setTextureOffset(0, 16).addBox(4.5F, -4.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r7.setTextureOffset(0, 16).addBox(2.5F, -4.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
		left_leg.setTextureOffset(12, 55).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 49).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 36).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(24, 4).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(40, 0).addBox(-2.6F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.0F, false);

		right_arm_r8 = new ModelRenderer(this);
		right_arm_r8.setRotationPoint(2.9F, 7.5F, 0.0F);
		left_leg.addChild(right_arm_r8);
		setRotationAngle(right_arm_r8, -0.7854F, 0.0F, 1.5708F);
		right_arm_r8.setTextureOffset(0, 16).addBox(-4.5F, -3.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r8.setTextureOffset(0, 16).addBox(-2.5F, -3.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r8.setTextureOffset(0, 16).addBox(1.5F, -3.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r8.setTextureOffset(0, 16).addBox(3.5F, -3.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		right_arm_r9 = new ModelRenderer(this);
		right_arm_r9.setRotationPoint(2.9F, 7.5F, 0.0F);
		left_leg.addChild(right_arm_r9);
		setRotationAngle(right_arm_r9, 0.7854F, 0.0F, 1.5708F);
		right_arm_r9.setTextureOffset(0, 16).addBox(3.5F, -3.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r9.setTextureOffset(0, 16).addBox(1.5F, -3.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r9.setTextureOffset(0, 16).addBox(-4.5F, -3.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r9.setTextureOffset(0, 16).addBox(-2.5F, -3.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		right_arm_r10 = new ModelRenderer(this);
		right_arm_r10.setRotationPoint(5.9F, -10.5F, 0.0F);
		left_leg.addChild(right_arm_r10);
		setRotationAngle(right_arm_r10, 0.0F, 0.0F, 1.5708F);
		right_arm_r10.setTextureOffset(0, 16).addBox(19.5F, 1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r10.setTextureOffset(0, 16).addBox(21.5F, 1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		right_arm_r11 = new ModelRenderer(this);
		right_arm_r11.setRotationPoint(5.9F, -16.5F, 0.0F);
		left_leg.addChild(right_arm_r11);
		setRotationAngle(right_arm_r11, 0.0F, 0.0F, 1.5708F);
		right_arm_r11.setTextureOffset(0, 16).addBox(21.5F, 1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		right_arm_r11.setTextureOffset(0, 16).addBox(19.5F, 1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
		right_leg.setTextureOffset(12, 55).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 49).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 36).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(24, 4).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(40, 0).addBox(-2.4F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.0F, true);

		right_arm_r12 = new ModelRenderer(this);
		right_arm_r12.setRotationPoint(-2.9F, 7.5F, 0.0F);
		right_leg.addChild(right_arm_r12);
		setRotationAngle(right_arm_r12, -0.7854F, 0.0F, -1.5708F);
		right_arm_r12.setTextureOffset(0, 16).addBox(3.5F, -3.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		right_arm_r12.setTextureOffset(0, 16).addBox(1.5F, -3.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		right_arm_r12.setTextureOffset(0, 16).addBox(-2.5F, -3.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		right_arm_r12.setTextureOffset(0, 16).addBox(-4.5F, -3.0F, 1.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		right_arm_r13 = new ModelRenderer(this);
		right_arm_r13.setRotationPoint(-2.9F, 7.5F, 0.0F);
		right_leg.addChild(right_arm_r13);
		setRotationAngle(right_arm_r13, 0.7854F, 0.0F, -1.5708F);
		right_arm_r13.setTextureOffset(0, 16).addBox(-4.5F, -3.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		right_arm_r13.setTextureOffset(0, 16).addBox(-2.5F, -3.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		right_arm_r13.setTextureOffset(0, 16).addBox(3.5F, -3.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		right_arm_r13.setTextureOffset(0, 16).addBox(1.5F, -3.0F, -2.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		right_arm_r14 = new ModelRenderer(this);
		right_arm_r14.setRotationPoint(-5.9F, -10.5F, 0.0F);
		right_leg.addChild(right_arm_r14);
		setRotationAngle(right_arm_r14, 0.0F, 0.0F, -1.5708F);
		right_arm_r14.setTextureOffset(0, 16).addBox(-20.5F, 1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		right_arm_r14.setTextureOffset(0, 16).addBox(-22.5F, 1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);

		right_arm_r15 = new ModelRenderer(this);
		right_arm_r15.setRotationPoint(-5.9F, -16.5F, 0.0F);
		right_leg.addChild(right_arm_r15);
		setRotationAngle(right_arm_r15, 0.0F, 0.0F, -1.5708F);
		right_arm_r15.setTextureOffset(0, 16).addBox(-22.5F, 1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
		right_arm_r15.setTextureOffset(0, 16).addBox(-20.5F, 1.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}