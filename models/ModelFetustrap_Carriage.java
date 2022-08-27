// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelFetustrap_Carriage extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer left_ear;
	private final ModelRenderer cube_r1;
	private final ModelRenderer right_ear;
	private final ModelRenderer mouth;
	private final ModelRenderer carriage;
	private final ModelRenderer top;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bottom;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer body;
	private final ModelRenderer left_arm_r1;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelFetustrap_Carriage() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 8.0F, 2.0F);
		head.setTextureOffset(26, 38).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		left_ear = new ModelRenderer(this);
		left_ear.setRotationPoint(1.5F, -6.2F, -1.0F);
		head.addChild(left_ear);
		setRotationAngle(left_ear, 0.6981F, 0.0F, 0.0F);
		left_ear.setTextureOffset(31, 0).addBox(-1.0F, -2.3572F, 0.266F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -3.0F, 0.0F);
		left_ear.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.9599F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(33, 7).addBox(-0.5F, -2.0038F, -0.5872F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(40, 3).addBox(-1.0F, -1.0038F, -0.5872F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(-1.5F, -6.2F, -1.0F);
		head.addChild(right_ear);
		setRotationAngle(right_ear, 0.6981F, 0.0F, 0.0F);
		right_ear.setTextureOffset(31, 0).addBox(-1.0F, -2.3572F, 0.266F, 2.0F, 3.0F, 1.0F, 0.0F, true);

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(-11.0F, 16.0F, -2.0F);
		head.addChild(mouth);
		mouth.setTextureOffset(7, 32).addBox(9.75F, -18.0F, -2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		mouth.setTextureOffset(0, 19).addBox(9.0F, -19.0F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		mouth.setTextureOffset(10, 19).addBox(9.0F, -17.0F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		carriage = new ModelRenderer(this);
		carriage.setRotationPoint(0.0F, 24.0F, 0.0F);

		top = new ModelRenderer(this);
		top.setRotationPoint(-5.5F, -4.5F, 5.5F);
		carriage.addChild(top);
		top.setTextureOffset(0, 22).addBox(10.5F, -22.3F, -7.2F, 1.0F, 4.0F, 1.0F, 0.0F, true);
		top.setTextureOffset(0, 0).addBox(10.5F, -18.5F, -7.2F, 1.0F, 10.0F, 9.0F, 0.0F, true);
		top.setTextureOffset(0, 22).addBox(-0.5F, -22.3F, -7.2F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		top.setTextureOffset(0, 0).addBox(-0.5F, -18.5F, -7.2F, 1.0F, 10.0F, 9.0F, 0.0F, false);
		top.setTextureOffset(0, 38).addBox(-0.5F, -18.5F, 1.8F, 12.0F, 10.0F, 1.0F, 0.0F, false);
		top.setTextureOffset(35, 33).addBox(0.5F, -22.3F, -7.2F, 10.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(5.5F, -17.5F, 2.3F);
		top.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.1781F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(11, 0).addBox(-6.0F, -9.9F, -0.9F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(40, 0).addBox(-6.0F, -8.9F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r2.setTextureOffset(47, 47).addBox(-6.0F, -7.9F, -2.9F, 1.0F, 8.0F, 3.0F, 0.0F, false);
		cube_r2.setTextureOffset(35, 22).addBox(-6.0F, -9.9F, 0.1F, 12.0F, 10.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(11, 0).addBox(5.0F, -9.9F, -0.9F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		cube_r2.setTextureOffset(47, 47).addBox(5.0F, -7.9F, -2.9F, 1.0F, 8.0F, 3.0F, 0.0F, true);
		cube_r2.setTextureOffset(40, 0).addBox(5.0F, -8.9F, -2.9F, 1.0F, 1.0F, 2.0F, 0.0F, true);

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(0.0F, 0.0F, 0.0F);
		carriage.addChild(bottom);
		bottom.setTextureOffset(40, 8).addBox(-4.0F, -13.0F, 6.3F, 8.0F, 4.0F, 1.0F, 0.0F, false);
		bottom.setTextureOffset(23, 0).addBox(4.0F, -13.0F, -7.7F, 1.0F, 4.0F, 15.0F, 0.0F, true);
		bottom.setTextureOffset(44, 38).addBox(-4.0F, -13.0F, -7.7F, 8.0F, 4.0F, 1.0F, 0.0F, false);
		bottom.setTextureOffset(23, 0).addBox(-5.0F, -13.0F, -7.7F, 1.0F, 4.0F, 15.0F, 0.0F, false);
		bottom.setTextureOffset(0, 22).addBox(-5.0F, -9.0F, -7.7F, 10.0F, 1.0F, 15.0F, 0.0F, false);
		bottom.setTextureOffset(7, 22).addBox(5.5F, -2.0F, 5.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
		bottom.setTextureOffset(7, 49).addBox(6.0F, -6.0F, 6.0F, 1.0F, 4.0F, 1.0F, 0.0F, true);
		bottom.setTextureOffset(0, 49).addBox(5.0F, -11.0F, -0.7F, 1.0F, 4.0F, 1.0F, 0.0F, true);
		bottom.setTextureOffset(7, 22).addBox(-7.5F, -2.0F, 5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bottom.setTextureOffset(0, 49).addBox(-6.0F, -11.0F, -0.7F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bottom.setTextureOffset(26, 38).addBox(-6.0F, -13.0F, -1.25F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bottom.setTextureOffset(26, 38).addBox(5.0F, -13.0F, -1.25F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		bottom.setTextureOffset(0, 22).addBox(7.0F, -5.0F, -7.0F, 1.0F, 5.0F, 5.0F, 0.0F, true);
		bottom.setTextureOffset(8, 34).addBox(-7.0F, -5.0F, 4.4F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bottom.setTextureOffset(8, 34).addBox(6.0F, -5.0F, 4.4F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		bottom.setTextureOffset(7, 49).addBox(-7.0F, -6.0F, 6.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		bottom.setTextureOffset(0, 22).addBox(-8.0F, -5.0F, -7.0F, 1.0F, 5.0F, 5.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-6.5F, -2.0F, -3.0F);
		bottom.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(23, 0).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r3.setTextureOffset(23, 19).addBox(0.5F, -2.0F, 26.5F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 0).addBox(-0.5F, -2.0F, 6.5F, 1.0F, 1.0F, 21.0F, 0.0F, true);
		cube_r3.setTextureOffset(0, 0).addBox(12.5F, -2.0F, 6.5F, 1.0F, 1.0F, 21.0F, 0.0F, false);
		cube_r3.setTextureOffset(23, 0).addBox(12.5F, -2.0F, -0.5F, 1.0F, 1.0F, 6.0F, 0.0F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-6.5F, -4.5F, 4.5F);
		bottom.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.5236F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 49).addBox(-0.5F, -0.5F, -4.8F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		cube_r4.setTextureOffset(0, 49).addBox(12.5F, -0.5F, -4.8F, 1.0F, 1.0F, 5.0F, 0.0F, true);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-6.5F, -7.1F, -0.0033F);
		bottom.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.7854F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(23, 0).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r5.setTextureOffset(23, 0).addBox(12.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);

		body = new ModelRenderer(this);
		body.setRotationPoint(2.0F, -18.0F, 0.5F);
		carriage.addChild(body);
		body.setTextureOffset(23, 7).addBox(-4.0F, 2.0F, 0.5F, 4.0F, 6.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(17, 2).addBox(-2.25F, 2.5F, 0.49F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(31, 4).addBox(-2.5F, 7.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		left_arm_r1 = new ModelRenderer(this);
		left_arm_r1.setRotationPoint(-2.25F, 2.25F, -3.6144F);
		body.addChild(left_arm_r1);
		setRotationAngle(left_arm_r1, 0.0F, -1.5708F, -1.5708F);
		left_arm_r1.setTextureOffset(23, 4).addBox(-0.25F, -0.2533F, -2.3024F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_arm_r1.setTextureOffset(11, 0).addBox(-0.75F, -1.7533F, -1.3024F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		left_arm_r1.setTextureOffset(12, 49).addBox(-0.75F, -0.7533F, -1.3024F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(2.0F, -11.0F, 0.0F);
		carriage.addChild(left_arm);
		setRotationAngle(left_arm, 0.0F, 0.3491F, 0.0F);
		left_arm.setTextureOffset(40, 0).addBox(-0.342F, -5.0F, -3.0603F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-2.0F, -11.0F, 0.0F);
		carriage.addChild(right_arm);
		setRotationAngle(right_arm, 0.0F, -0.3491F, 0.0F);
		right_arm.setTextureOffset(40, 0).addBox(-1.658F, -5.0F, -3.0603F, 2.0F, 2.0F, 6.0F, 0.0F, true);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-1.0F, -14.0F, -0.1667F);
		carriage.addChild(right_leg);
		setRotationAngle(right_leg, -1.5708F, 0.2182F, 0.0F);
		right_leg.setTextureOffset(0, 0).addBox(-1.4329F, -1.9526F, 3.1667F, 2.0F, 4.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 32).addBox(-1.4329F, 3.0474F, 2.1667F, 2.0F, 1.0F, 3.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 6).addBox(-1.4329F, 2.0474F, 3.1667F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(17, 0).addBox(-0.9329F, 2.0474F, 3.6667F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_leg.setTextureOffset(17, 0).addBox(-0.9329F, 3.0374F, 3.6667F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_leg.setTextureOffset(11, 5).addBox(-1.4329F, 3.0374F, 2.1667F, 2.0F, 1.0F, 3.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(1.0F, -14.0F, -0.1667F);
		carriage.addChild(left_leg);
		setRotationAngle(left_leg, -1.5708F, -0.2182F, 0.0F);
		left_leg.setTextureOffset(0, 0).addBox(-0.5671F, -1.9526F, 3.1667F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 32).addBox(-0.5671F, 3.0474F, 2.1667F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 6).addBox(-0.5671F, 2.0474F, 3.1667F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(17, 0).addBox(-0.0671F, 2.0474F, 3.6667F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_leg.setTextureOffset(17, 0).addBox(-0.0671F, 3.0374F, 3.6667F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_leg.setTextureOffset(11, 5).addBox(-0.5671F, 3.0374F, 2.1667F, 2.0F, 1.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		carriage.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}