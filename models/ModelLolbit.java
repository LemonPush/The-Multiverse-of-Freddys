// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelLolbit extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer body_r3;
	private final ModelRenderer body;
	private final ModelRenderer body_r4;
	private final ModelRenderer body_r5;
	private final ModelRenderer body_r6;
	private final ModelRenderer body_r7;
	private final ModelRenderer neck;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelLolbit() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -1.8294F, -0.85F);
		head.setTextureOffset(0, 12).addBox(-4.5F, -15.9706F, -2.05F, 9.0F, 10.0F, 6.0F, 0.5F, false);
		head.setTextureOffset(29, 91).addBox(4.5F, -6.4706F, -1.55F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(20, 90).addBox(4.5F, -7.4706F, -1.55F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(84, 0).addBox(4.5F, -9.4706F, -1.55F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(70, 86).addBox(4.5F, -8.4706F, -1.55F, 3.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(38, 69).addBox(-5.5F, -6.4706F, -1.55F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(58, 39).addBox(-6.5F, -7.4706F, -1.55F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(84, 52).addBox(-7.5F, -8.4706F, -1.55F, 3.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(20, 31).addBox(-8.5F, -9.4706F, -1.55F, 4.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(30, 15).addBox(-3.5F, -8.9706F, -8.55F, 7.0F, 1.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.5F, -10.1706F, -8.75F, 7.0F, 1.0F, 11.0F, 0.25F, false);
		head.setTextureOffset(0, 51).addBox(-0.5F, -18.1706F, -0.55F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(46, 0).addBox(-2.0F, -11.1706F, -7.55F, 4.0F, 1.0F, 10.0F, 0.25F, false);
		head.setTextureOffset(6, 0).addBox(-0.5F, -11.9706F, -7.35F, 1.0F, 1.0F, 1.0F, 0.25F, false);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(-8.0F, 1.8294F, 9.45F);
		head.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.7854F);
		right_arm_r1.setTextureOffset(25, 0).addBox(-15.8F, 7.5F, -16.6F, 1.0F, 3.0F, 3.0F, 0.0F, true);
		right_arm_r1.setTextureOffset(54, 85).addBox(-14.8F, 7.5F, -17.1F, 4.0F, 3.0F, 4.0F, 0.0F, true);
		right_arm_r1.setTextureOffset(64, 0).addBox(-10.8F, 8.0F, -16.0F, 1.0F, 2.0F, 2.0F, 0.25F, false);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(8.0F, 1.8294F, 9.45F);
		head.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, -1.5708F, 0.0F, -0.7854F);
		right_arm_r2.setTextureOffset(25, 0).addBox(14.8F, 7.5F, -16.6F, 1.0F, 3.0F, 3.0F, 0.0F, false);
		right_arm_r2.setTextureOffset(54, 85).addBox(10.8F, 7.5F, -17.1F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		right_arm_r2.setTextureOffset(0, 12).addBox(9.8F, 8.0F, -16.0F, 1.0F, 2.0F, 2.0F, 0.25F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(1.0F, -16.1706F, 0.45F);
		head.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, 0.0F, 0.4363F);
		body_r1.setTextureOffset(16, 51).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(-1.0F, -16.1706F, 0.45F);
		head.addChild(body_r2);
		setRotationAngle(body_r2, 0.0F, 0.0F, -0.4363F);
		body_r2.setTextureOffset(0, 64).addBox(-0.5F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(-8.0F, 1.8294F, 9.45F);
		head.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, -1.5708F, 0.0F, 0.0F);
		right_arm_r3.setTextureOffset(40, 50).addBox(4.75F, 11.2F, -15.9F, 2.0F, 1.0F, 2.0F, 0.25F, true);
		right_arm_r3.setTextureOffset(40, 50).addBox(9.25F, 11.2F, -15.9F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		right_arm_r3.setTextureOffset(74, 44).addBox(5.0F, 7.0F, -11.5F, 6.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm_r3.setTextureOffset(50, 11).addBox(4.0F, 7.0F, -17.5F, 8.0F, 4.0F, 6.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(0.0F, -8.0706F, 0.3167F);
		head.addChild(body_r3);
		setRotationAngle(body_r3, 0.0436F, 0.0F, 0.0F);
		body_r3.setTextureOffset(64, 0).addBox(-3.5F, 0.0F, -8.8667F, 7.0F, 1.0F, 6.0F, 0.0F, false);
		body_r3.setTextureOffset(68, 21).addBox(-3.5F, 1.2F, -9.0667F, 7.0F, 1.0F, 6.0F, 0.25F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -9.0F, 0.0F);
		body.setTextureOffset(46, 0).addBox(-4.0F, 8.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 32).addBox(-4.0F, 5.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 28).addBox(1.0F, 5.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(90, 58).addBox(1.0F, 3.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(24, 14).addBox(-5.0F, 3.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(54, 21).addBox(-4.0F, 11.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(25, 6).addBox(1.0F, 8.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(90, 38).addBox(5.0F, 3.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(90, 12).addBox(-7.0F, 3.0F, -2.0F, 2.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-1.0F, 3.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 40).addBox(-5.0F, 3.0F, -2.5F, 10.0F, 6.0F, 5.0F, 0.5F, false);
		body.setTextureOffset(22, 58).addBox(-3.5F, 3.0F, -2.7F, 7.0F, 6.0F, 5.0F, 0.5F, false);
		body.setTextureOffset(72, 7).addBox(-3.0F, 10.0F, -2.7F, 6.0F, 4.0F, 5.0F, 0.5F, false);
		body.setTextureOffset(68, 28).addBox(-3.5F, 15.0F, -2.7F, 7.0F, 2.0F, 1.0F, 0.5F, false);
		body.setTextureOffset(30, 0).addBox(-1.0F, 3.0F, -3.7F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(46, 4).addBox(1.0F, 2.6F, -3.7F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(46, 4).addBox(-4.0F, 2.6F, -3.7F, 3.0F, 3.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(11, 87).addBox(-1.0F, 6.5F, -3.1F, 2.0F, 2.0F, 5.0F, 0.5F, false);
		body.setTextureOffset(48, 45).addBox(-4.0F, 6.0F, -2.5F, 8.0F, 8.0F, 5.0F, 0.5F, false);
		body.setTextureOffset(24, 22).addBox(-5.5F, 14.5F, -3.0F, 11.0F, 3.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(40, 45).addBox(-1.5F, 1.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(-7.1927F, 4.0881F, 10.9513F);
		body.addChild(body_r4);
		setRotationAngle(body_r4, 1.9285F, -0.6614F, -1.5014F);
		body_r4.setTextureOffset(30, 31).addBox(-2.7531F, -2.9281F, 0.4531F, 6.0F, 6.0F, 8.0F, 0.5F, false);

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(0.2117F, 10.388F, 8.2552F);
		body.addChild(body_r5);
		setRotationAngle(body_r5, 1.2764F, -0.6377F, -0.6709F);
		body_r5.setTextureOffset(22, 45).addBox(-2.9608F, -2.3502F, 3.5343F, 5.0F, 5.0F, 8.0F, 0.5F, false);

		body_r6 = new ModelRenderer(this);
		body_r6.setRotationPoint(1.1F, 12.8882F, 3.8865F);
		body.addChild(body_r6);
		setRotationAngle(body_r6, 0.7623F, -0.3742F, -0.3358F);
		body_r6.setTextureOffset(61, 76).addBox(-2.0F, -2.0968F, 2.969F, 4.0F, 4.0F, 5.0F, 0.5F, false);

		body_r7 = new ModelRenderer(this);
		body_r7.setRotationPoint(0.0F, 18.0F, 2.0F);
		body.addChild(body_r7);
		setRotationAngle(body_r7, 0.6981F, 0.0F, 0.0F);
		body_r7.setTextureOffset(84, 63).addBox(-1.5F, -4.3F, 1.9F, 3.0F, 3.0F, 5.0F, 0.5F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(2.0F, 1.0F, 0.0F);
		body.addChild(neck);
		setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(6.5F, -4.3286F, 0.0F);
		left_arm.setTextureOffset(16, 67).addBox(1.0F, 11.3286F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(64, 7).addBox(1.0F, 4.3286F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(84, 28).addBox(0.0F, 6.3286F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(38, 81).addBox(0.0F, 0.3286F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(62, 64).addBox(-0.5F, -2.1714F, -3.0F, 5.0F, 6.0F, 6.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 76).addBox(-0.5F, 4.2286F, -3.0F, 5.0F, 5.0F, 6.0F, 0.0F, false);
		left_arm.setTextureOffset(44, 70).addBox(-0.5F, 9.6286F, -3.0F, 5.0F, 5.0F, 6.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.5F, -4.3286F, 0.0F);
		right_arm.setTextureOffset(62, 61).addBox(-4.0F, 11.3286F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(41, 58).addBox(-4.0F, 4.3286F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(22, 80).addBox(-5.0F, 6.3286F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(79, 76).addBox(-5.0F, 0.3286F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 64).addBox(-5.5F, -2.1714F, -3.0F, 5.0F, 6.0F, 6.0F, 0.0F, false);
		right_arm.setTextureOffset(22, 69).addBox(-5.5F, 4.2286F, -3.0F, 5.0F, 5.0F, 6.0F, 0.0F, false);
		right_arm.setTextureOffset(68, 52).addBox(-5.5F, 9.6286F, -3.0F, 5.0F, 5.0F, 6.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.0F, 9.0F, 0.5F);
		left_leg.setTextureOffset(89, 6).addBox(-2.0F, -1.0F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 87).addBox(-2.0F, 6.0F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(68, 32).addBox(-2.5F, 0.0F, -3.5F, 5.0F, 6.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(88, 21).addBox(-2.0F, 6.4F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(52, 25).addBox(-2.5F, 6.4F, -3.5F, 5.0F, 7.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(26, 2).addBox(-2.4F, 13.0F, -7.5F, 5.0F, 2.0F, 10.0F, 0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.5F, 9.0F, 0.5F);
		right_leg.setTextureOffset(81, 86).addBox(-2.5F, -1.0F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(84, 71).addBox(-2.5F, 6.0F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(46, 58).addBox(-3.0F, 0.0F, -3.5F, 5.0F, 6.0F, 6.0F, 0.0F, false);
		right_leg.setTextureOffset(78, 16).addBox(-2.5F, 6.4F, -2.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 51).addBox(-3.0F, 6.4F, -3.5F, 5.0F, 7.0F, 6.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 28).addBox(-3.1F, 13.0F, -7.5F, 5.0F, 2.0F, 10.0F, 0.25F, false);
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
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}