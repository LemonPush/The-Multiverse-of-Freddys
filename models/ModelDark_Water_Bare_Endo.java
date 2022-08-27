// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelDark_Water_Bare_Endo extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer body_r5;
	private final ModelRenderer body_r6;
	private final ModelRenderer bone;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_arm;

	public ModelDark_Water_Bare_Endo() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-0.5F, -17.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(20, 0).addBox(-0.5F, -17.0F, -3.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(22, 22).addBox(-0.5F, -16.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -2.0F, 8.0F, 8.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(44, 0).addBox(4.0F, -13.0F, 0.1F, 4.0F, 5.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(44, 0).addBox(-8.0F, -13.0F, 0.1F, 4.0F, 5.0F, 2.0F, 0.0F, true);
		head.setTextureOffset(24, 7).addBox(-2.0F, -9.2F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(34, 22).addBox(-2.0F, -10.2F, -3.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 28).addBox(-2.0F, -7.0F, -3.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(24, 5).addBox(-2.0F, -8.0F, -3.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(47, 35).addBox(-3.7F, -13.5F, -2.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(42, 46).addBox(0.7F, -13.5F, -2.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-2.5F, -5.5F, -1.5F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 2.4435F, 0.0F);
		head_r1.setTextureOffset(29, 29).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);
		head_r1.setTextureOffset(29, 29).addBox(-0.5F, -2.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(2.5F, -5.5F, -1.5F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, -2.4435F, 0.0F);
		head_r2.setTextureOffset(29, 29).addBox(-2.5F, -2.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		head_r2.setTextureOffset(29, 29).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(0, 21).addBox(-4.5F, 6.0F, -2.0F, 9.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(46, 22).addBox(-6.5F, -5.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(44, 7).addBox(4.5F, -5.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 21).addBox(4.5F, -7.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 21).addBox(-5.5F, -7.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(0, 21).addBox(4.5F, -3.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 21).addBox(-5.5F, -3.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(0, 21).addBox(4.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 21).addBox(-5.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(21, 34).addBox(-1.0F, 0.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(36, 14).addBox(-1.0F, -2.5F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(16, 29).addBox(-2.5F, 4.0F, -1.5F, 5.0F, 2.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(24, 0).addBox(-3.5F, 2.0F, -1.5F, 7.0F, 2.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(23, 9).addBox(-4.5F, 0.0F, -1.5F, 9.0F, 2.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 12).addBox(-5.0F, -5.4F, -1.5F, 10.0F, 6.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(34, 5).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(-6.3075F, -0.3247F, 0.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, 0.0F, -0.3491F);
		body_r1.setTextureOffset(0, 21).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(6.3075F, -0.3247F, 0.0F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, 0.0F, 0.0F, 0.3491F);
		body_r2.setTextureOffset(0, 21).addBox(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(-6.0F, -2.0F, 0.0F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, 0.0F, 0.0F, 0.3491F);
		body_r3.setTextureOffset(0, 21).addBox(-0.9F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(6.0F, -2.0F, 0.0F);
		body.addChild(body_r4);
		setRotationAngle(body_r4, 0.0F, 0.0F, -0.3491F);
		body_r4.setTextureOffset(0, 21).addBox(-0.1F, -1.2F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(-6.0F, -6.0F, 0.0F);
		body.addChild(body_r5);
		setRotationAngle(body_r5, 0.0F, 0.0F, -0.3491F);
		body_r5.setTextureOffset(0, 21).addBox(-0.9F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, true);

		body_r6 = new ModelRenderer(this);
		body_r6.setRotationPoint(6.0F, -6.0F, 0.0F);
		body.addChild(body_r6);
		setRotationAngle(body_r6, 0.0F, 0.0F, 0.3491F);
		body_r6.setTextureOffset(0, 21).addBox(-0.1F, -0.8F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 12.0F, 0.0F);
		body.addChild(bone);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
		left_arm.setTextureOffset(52, 7).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(46, 51).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(30, 46).addBox(1.5F, 11.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(42, 14).addBox(1.5F, 5.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 42).addBox(1.5F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
		left_leg.setTextureOffset(51, 14).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(50, 39).addBox(-1.1F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(14, 51).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(38, 37).addBox(-1.6F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 33).addBox(-1.6F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(20, 22).addBox(-2.1F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(6, 51).addBox(0.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		left_leg.setTextureOffset(40, 50).addBox(-2.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
		right_leg.setTextureOffset(50, 26).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 50).addBox(-0.9F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(49, 44).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(12, 34).addBox(-1.4F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(29, 31).addBox(-1.4F, 1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(22, 15).addBox(-1.9F, 15.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
		right_leg.setTextureOffset(22, 49).addBox(-2.1F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		right_leg.setTextureOffset(48, 48).addBox(0.3F, 15.2F, -5.2F, 2.0F, 1.0F, 2.0F, -0.25F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
		right_arm.setTextureOffset(47, 11).addBox(-4.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(30, 40).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(12, 45).addBox(-4.5F, 11.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(41, 27).addBox(-4.5F, 5.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(21, 40).addBox(-4.5F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}