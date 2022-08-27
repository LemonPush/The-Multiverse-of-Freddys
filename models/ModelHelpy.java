// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelHelpy extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer earright;
	private final ModelRenderer lower3;
	private final ModelRenderer tip;
	private final ModelRenderer earleft;
	private final ModelRenderer lower4;
	private final ModelRenderer tip2;
	private final ModelRenderer Body;
	private final ModelRenderer left_arm;
	private final ModelRenderer lowerarm2;
	private final ModelRenderer right_arm;
	private final ModelRenderer lowerarm3;
	private final ModelRenderer left_leg;
	private final ModelRenderer lower2;
	private final ModelRenderer right_leg;
	private final ModelRenderer lower;

	public ModelHelpy() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 13.9214F, -0.0143F);
		Head.setTextureOffset(0, 0).addBox(-3.5F, -5.5214F, -2.9857F, 7.0F, 3.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(0, 9).addBox(-3.0F, -9.5214F, -2.9857F, 6.0F, 4.0F, 6.0F, 0.0F, false);
		Head.setTextureOffset(29, 0).addBox(-2.5F, -8.2214F, -3.0857F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 9).addBox(0.5F, -8.2214F, -3.0857F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(58, 0).addBox(-2.5F, -9.2214F, -3.0857F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(49, 0).addBox(0.5F, -9.2214F, -3.0857F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 3).addBox(2.8F, -11.4214F, -0.4857F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-4.8F, -11.4214F, -0.4857F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(32, 9).addBox(-1.5F, -10.4214F, -1.4857F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(24, 35).addBox(-1.0F, -12.4214F, -0.9857F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(50, 10).addBox(-2.5F, -6.0214F, -5.0857F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(60, 21).addBox(-0.5F, -6.7214F, -5.5857F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(48, 20).addBox(-1.5F, -4.2214F, -4.9857F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(50, 35).addBox(-2.5F, -3.5214F, -5.0857F, 5.0F, 1.0F, 2.0F, 0.0F, false);

		earright = new ModelRenderer(this);
		earright.setRotationPoint(0.0F, 5.5786F, -0.4857F);
		Head.addChild(earright);

		lower3 = new ModelRenderer(this);
		lower3.setRotationPoint(-1.5F, -16.2F, -1.1F);
		earright.addChild(lower3);
		setRotationAngle(lower3, 0.7854F, 0.0F, 0.0F);

		tip = new ModelRenderer(this);
		tip.setRotationPoint(0.0F, -1.0F, -1.0F);
		earright.addChild(tip);

		earleft = new ModelRenderer(this);
		earleft.setRotationPoint(0.0F, 5.5786F, -0.4857F);
		Head.addChild(earleft);

		lower4 = new ModelRenderer(this);
		lower4.setRotationPoint(1.5F, -16.2F, -1.1F);
		earleft.addChild(lower4);
		setRotationAngle(lower4, 0.7854F, 0.0F, 0.0F);

		tip2 = new ModelRenderer(this);
		tip2.setRotationPoint(0.0F, -1.0F, -1.0F);
		earleft.addChild(tip2);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 25.0F, 0.0F);
		Body.setTextureOffset(0, 18).addBox(-3.5F, -9.65F, -2.5F, 7.0F, 4.0F, 5.0F, 0.0F, false);
		Body.setTextureOffset(19, 13).addBox(-3.0F, -13.65F, -2.5F, 6.0F, 4.0F, 5.0F, 0.0F, false);
		Body.setTextureOffset(24, 22).addBox(-2.5F, -12.7F, -2.75F, 5.0F, 6.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 20).addBox(-0.5F, -8.9F, -3.15F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(18, 13).addBox(-0.5F, -10.9F, -3.15F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(18, 9).addBox(-0.5F, -12.9F, -3.35F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(9, 27).addBox(-2.5F, -13.4F, -3.35F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(0, 12).addBox(0.5F, -13.4F, -3.35F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(21, 28).addBox(-0.5F, -10.6F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(1.8008F, 14.1046F, 0.0F);
		setRotationAngle(left_arm, 0.0F, 0.0F, -1.0036F);
		left_arm.setTextureOffset(24, 29).addBox(-0.0646F, -0.4002F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(12, 27).addBox(-0.0646F, 2.5498F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(33, 32).addBox(-0.0646F, 5.4998F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		lowerarm2 = new ModelRenderer(this);
		lowerarm2.setRotationPoint(-5.6519F, 12.0147F, 0.0F);
		left_arm.addChild(lowerarm2);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-1.8008F, 14.1046F, 0.0F);
		setRotationAngle(right_arm, 0.0F, 0.0F, 1.0036F);
		right_arm.setTextureOffset(24, 29).addBox(-2.9354F, -0.4002F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		right_arm.setTextureOffset(12, 27).addBox(-2.9354F, 2.5498F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);
		right_arm.setTextureOffset(33, 32).addBox(-2.9354F, 5.4998F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, true);

		lowerarm3 = new ModelRenderer(this);
		lowerarm3.setRotationPoint(5.6519F, 12.0147F, 0.0F);
		right_arm.addChild(lowerarm3);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.5F, 20.0F, -0.5F);

		lower2 = new ModelRenderer(this);
		lower2.setRotationPoint(-3.9F, 4.0F, 1.0F);
		left_leg.addChild(lower2);
		lower2.setTextureOffset(0, 27).addBox(1.9F, -4.9F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		lower2.setTextureOffset(0, 33).addBox(1.9F, -2.2F, -2.0F, 3.0F, 2.0F, 3.0F, 0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.0F, 20.0F, -0.5F);

		lower = new ModelRenderer(this);
		lower.setRotationPoint(4.4F, 4.0F, 1.0F);
		right_leg.addChild(lower);
		lower.setTextureOffset(32, 0).addBox(-4.9F, -4.9F, -2.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		lower.setTextureOffset(12, 33).addBox(-4.9F, -2.2F, -2.0F, 3.0F, 2.0F, 3.0F, 0.25F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
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
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}