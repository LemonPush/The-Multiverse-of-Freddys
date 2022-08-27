// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelBalloonBoy extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer Body;
	private final ModelRenderer right_arm;
	private final ModelRenderer cube_r4;
	private final ModelRenderer lowerarm3;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer left_arm;
	private final ModelRenderer cube_r9;
	private final ModelRenderer lowerarm2;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer right_leg;
	private final ModelRenderer lower3;
	private final ModelRenderer left_leg;
	private final ModelRenderer lower2;

	public ModelBalloonBoy() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 8.4762F, 0.2095F);
		Head.setTextureOffset(0, 10).addBox(-5.0F, -10.4762F, -4.7095F, 10.0F, 5.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-5.5F, -11.4762F, -5.1095F, 11.0F, 1.0F, 9.0F, 0.0F, false);
		Head.setTextureOffset(0, 23).addBox(-5.0F, -12.4762F, -4.7095F, 10.0F, 1.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(31, 0).addBox(-4.5F, -13.4762F, -4.2095F, 9.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(0, 23).addBox(-0.5F, -17.4762F, -1.1095F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(28, 14).addBox(-3.0F, -9.4762F, -5.2095F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 28).addBox(1.0F, -9.4762F, -5.2095F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 7).addBox(-0.5F, -7.4762F, -5.7095F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(32, 37).addBox(-5.0F, -5.4762F, -3.7095F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(23, 36).addBox(4.0F, -5.4762F, -3.7095F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		Head.setTextureOffset(28, 10).addBox(-5.0F, -5.4762F, -4.7095F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(4, 23).addBox(-0.5F, -5.9762F, 3.2905F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.6238F, -0.2095F);
		Head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(28, 15).addBox(-5.0F, -2.1F, -3.5F, 10.0F, 1.0F, 8.0F, 0.0F, false);
		cube_r1.setTextureOffset(28, 12).addBox(-5.0F, -3.1F, -3.5F, 10.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(9, 42).addBox(-2.0F, -3.1F, -1.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(10, 46).addBox(2.0F, -3.1F, -1.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r1.setTextureOffset(18, 48).addBox(-3.0F, -3.1F, -1.5F, 1.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 42).addBox(-5.0F, -3.1F, -2.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);
		cube_r1.setTextureOffset(41, 36).addBox(4.0F, -3.1F, -2.5F, 1.0F, 1.0F, 7.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -15.9762F, -0.6095F);
		Head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
		cube_r2.setTextureOffset(40, 8).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -15.9762F, -0.6095F);
		Head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.7854F, 0.0F);
		cube_r3.setTextureOffset(9, 44).addBox(-4.5F, -0.5F, -0.5F, 9.0F, 1.0F, 1.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 25.0F, 0.0F);
		Body.setTextureOffset(29, 25).addBox(-5.0F, -12.0F, -3.5F, 10.0F, 4.0F, 7.0F, 0.0F, false);
		Body.setTextureOffset(0, 32).addBox(-4.5F, -16.0F, -3.0F, 9.0F, 4.0F, 6.0F, 0.0F, false);
		Body.setTextureOffset(18, 46).addBox(-0.5F, -17.9F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-3.4F, 10.2F, 0.0F);
		setRotationAngle(right_arm, 0.0F, 0.0F, 0.6981F);
		right_arm.setTextureOffset(29, 54).addBox(-2.6572F, -0.134F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.0307F, 1.5238F, 0.0F);
		right_arm.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.8606F, 0.1386F, -0.1568F);
		cube_r4.setTextureOffset(4, 0).addBox(-3.8566F, 0.2421F, -0.1562F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		lowerarm3 = new ModelRenderer(this);
		lowerarm3.setRotationPoint(5.5177F, 12.7465F, 0.0F);
		right_arm.addChild(lowerarm3);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.9672F, -7.7327F, -7.3113F);
		lowerarm3.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.7134F, -0.1637F, -0.3577F);
		cube_r5.setTextureOffset(32, 36).addBox(-2.675F, -0.0818F, 0.026F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.863F, -8.031F, -6.3628F);
		lowerarm3.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.4291F, -0.6087F, -1.0676F);
		cube_r6.setTextureOffset(35, 38).addBox(-2.5146F, -2.0998F, -0.3814F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-4.987F, -6.2228F, -7.0F);
		lowerarm3.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.8217F, -0.3231F, -0.5622F);
		cube_r7.setTextureOffset(32, 40).addBox(-3.4392F, -0.3661F, 1.7042F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(41, 36).addBox(-3.4392F, -0.3661F, 0.4042F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(41, 39).addBox(-3.4392F, -0.3661F, 3.0042F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 42).addBox(-3.4392F, -0.3661F, -0.8958F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.987F, -11.2228F, 0.0F);
		lowerarm3.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.8606F, 0.1386F, -0.1568F);
		cube_r8.setTextureOffset(3, 44).addBox(-4.7566F, 8.2421F, 0.4438F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(35, 45).addBox(-4.7566F, 8.2421F, -0.8562F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 46).addBox(-4.7566F, 8.2421F, 1.7438F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(9, 46).addBox(-4.7566F, 8.2421F, -2.1562F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r8.setTextureOffset(0, 13).addBox(-4.3566F, 6.2421F, -0.6562F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r8.setTextureOffset(41, 54).addBox(-4.3566F, 7.2421F, -1.6562F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(3.4F, 10.2F, 0.0F);
		setRotationAngle(left_arm, 0.0F, 0.0F, -0.6981F);
		left_arm.setTextureOffset(50, 49).addBox(-0.3428F, -0.134F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.0307F, 1.5238F, 0.0F);
		left_arm.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.8606F, -0.1386F, 0.1568F);
		cube_r9.setTextureOffset(0, 0).addBox(2.8566F, 0.2421F, -0.1562F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		lowerarm2 = new ModelRenderer(this);
		lowerarm2.setRotationPoint(-5.5177F, 12.7465F, 0.0F);
		left_arm.addChild(lowerarm2);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(2.9672F, -7.7327F, -7.3113F);
		lowerarm2.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.7134F, 0.1637F, 0.3577F);
		cube_r10.setTextureOffset(28, 24).addBox(1.675F, -0.0818F, 0.026F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(3.863F, -8.031F, -6.3628F);
		lowerarm2.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.4291F, 0.6087F, 1.0676F);
		cube_r11.setTextureOffset(28, 27).addBox(1.5146F, -2.0998F, -0.3814F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(4.987F, -6.2228F, -7.0F);
		lowerarm2.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.8217F, 0.3231F, 0.5622F);
		cube_r12.setTextureOffset(31, 0).addBox(2.4392F, -0.3661F, 1.7042F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r12.setTextureOffset(31, 3).addBox(2.4392F, -0.3661F, 0.4042F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r12.setTextureOffset(0, 32).addBox(2.4392F, -0.3661F, 3.0042F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r12.setTextureOffset(24, 32).addBox(2.4392F, -0.3661F, -0.8958F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(2.987F, -11.2228F, 0.0F);
		lowerarm2.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.8606F, -0.1386F, 0.1568F);
		cube_r13.setTextureOffset(32, 24).addBox(3.7566F, 8.2421F, 0.4438F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r13.setTextureOffset(32, 27).addBox(3.7566F, 8.2421F, -0.8562F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r13.setTextureOffset(0, 35).addBox(3.7566F, 8.2421F, 1.7438F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r13.setTextureOffset(24, 35).addBox(3.7566F, 8.2421F, -2.1562F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r13.setTextureOffset(0, 10).addBox(3.3566F, 6.2421F, -0.6562F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r13.setTextureOffset(10, 53).addBox(3.3566F, 7.2421F, -1.6562F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.0F, 16.5F, 0.0F);

		lower3 = new ModelRenderer(this);
		lower3.setRotationPoint(5.0F, 9.5F, 0.0F);
		right_leg.addChild(lower3);
		lower3.setTextureOffset(38, 45).addBox(-6.0F, -9.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		lower3.setTextureOffset(50, 44).addBox(-6.0F, -3.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		lower3.setTextureOffset(50, 36).addBox(-6.5F, -4.0F, -5.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.0F, 16.5F, 0.0F);

		lower2 = new ModelRenderer(this);
		lower2.setRotationPoint(-5.0F, 9.5F, 0.0F);
		left_leg.addChild(lower2);
		lower2.setTextureOffset(26, 45).addBox(3.0F, -9.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		lower2.setTextureOffset(0, 50).addBox(3.0F, -3.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
		lower2.setTextureOffset(50, 10).addBox(2.5F, -4.0F, -5.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}