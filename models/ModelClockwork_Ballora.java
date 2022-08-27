// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelClockwork_Ballora extends EntityModel<Entity> {
	private final ModelRenderer ballora;
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer body;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm_r4;
	private final ModelRenderer right_arm_r5;
	private final ModelRenderer right_arm_r6;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelClockwork_Ballora() {
		textureWidth = 128;
		textureHeight = 128;

		ballora = new ModelRenderer(this);
		ballora.setRotationPoint(0.0F, 4.0F, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -14.0F, 0.0F);
		ballora.addChild(head);
		head.setTextureOffset(26, 22).addBox(-4.0F, -7.0F, -3.0F, 8.0F, 8.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(6, 12).addBox(1.0F, -5.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		head.setTextureOffset(0, 20).addBox(-0.5F, -2.7F, -3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(11, 6).addBox(2.7F, -2.0F, -3.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(11, 1).addBox(-3.7F, -2.0F, -3.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 12).addBox(-3.0F, -5.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		head.setTextureOffset(3, 4).addBox(1.0F, -6.0F, -3.0F, 2.0F, 0.0F, 1.0F, 0.25F, false);
		head.setTextureOffset(3, 4).addBox(-3.0F, -6.0F, -3.0F, 2.0F, 0.0F, 1.0F, 0.25F, false);
		head.setTextureOffset(26, 16).addBox(4.0F, -4.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-5.0F, -4.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(46, 60).addBox(-2.0F, -9.0F, 1.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(28, 65).addBox(-2.0F, -8.0F, 0.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -7.0F, 2.5F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.5236F, 0.0F, 0.0F);
		head_r1.setTextureOffset(110, 0).addBox(-4.0F, -4.0F, 2.2F, 8.0F, 8.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -13.0F, 0.0F);
		ballora.addChild(body);
		body.setTextureOffset(0, 31).addBox(-5.0F, 12.2F, -2.5F, 10.0F, 3.0F, 5.0F, 0.25F, false);
		body.setTextureOffset(0, 0).addBox(-8.0F, 11.0F, -7.5F, 16.0F, 1.0F, 15.0F, 0.0F, false);
		body.setTextureOffset(0, 16).addBox(-5.0F, 1.0F, -3.5F, 10.0F, 6.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(25, 36).addBox(-4.5F, 6.0F, -3.0F, 9.0F, 2.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(26, 16).addBox(-4.5F, 4.0F, -2.5F, 9.0F, 1.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 39).addBox(-3.5F, 7.0F, -2.5F, 7.0F, 4.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(16, 43).addBox(5.0F, 0.0F, -4.5F, 1.0F, 6.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(16, 43).addBox(-6.0F, 0.0F, -4.5F, 1.0F, 6.0F, 8.0F, 0.0F, true);
		body.setTextureOffset(16, 65).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.6F, -15.0F, 0.0F);
		ballora.addChild(right_arm);
		setRotationAngle(right_arm, 3.1416F, 0.0F, 0.1745F);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(-5.3F, 6.2333F, 0.0F);
		right_arm.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, 0.0F, 0.0F, -0.2618F);
		right_arm_r1.setTextureOffset(0, 61).addBox(0.754F, 2.019F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(63, 6).addBox(1.204F, 1.019F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(30, 55).addBox(0.754F, -4.981F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-5.5531F, 7.0379F, 0.0F);
		right_arm.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, 0.0F, 0.0F, -0.0087F);
		right_arm_r2.setTextureOffset(63, 0).addBox(0.3892F, -8.8384F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(0.0F, 0.25F, 0.0F);
		right_arm.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, 0.0F, 0.0F, 0.3927F);
		right_arm_r3.setTextureOffset(47, 0).addBox(-5.9011F, -7.4266F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.6F, -15.0F, 0.0F);
		ballora.addChild(left_arm);
		setRotationAngle(left_arm, 3.1416F, 0.0F, -0.1745F);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(5.3F, 6.2333F, 0.0F);
		left_arm.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, 0.0F, 0.0F, 0.2618F);
		right_arm_r4.setTextureOffset(12, 57).addBox(-5.1766F, 1.1127F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm_r4.setTextureOffset(62, 38).addBox(-4.6266F, 0.1127F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		right_arm_r4.setTextureOffset(50, 50).addBox(-5.1766F, -5.8873F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

		right_arm_r5 = new ModelRenderer(this);
		right_arm_r5.setRotationPoint(5.5531F, 7.0379F, 0.0F);
		left_arm.addChild(right_arm_r5);
		setRotationAngle(right_arm_r5, 0.0F, 0.0F, 0.0087F);
		right_arm_r5.setTextureOffset(62, 60).addBox(-3.5715F, -9.8216F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		right_arm_r6 = new ModelRenderer(this);
		right_arm_r6.setRotationPoint(0.0F, 0.25F, 0.0F);
		left_arm.addChild(right_arm_r6);
		setRotationAngle(right_arm_r6, 0.0F, 0.0F, -0.3927F);
		right_arm_r6.setTextureOffset(34, 43).addBox(2.1176F, -8.4029F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.8F, -3.0F, 0.0F);
		ballora.addChild(right_leg);
		setRotationAngle(right_leg, 0.0F, 0.48F, 0.0F);
		right_leg.setTextureOffset(50, 39).addBox(-1.9F, 12.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(54, 28).addBox(-1.9F, 5.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(62, 50).addBox(-1.4F, 11.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(62, 17).addBox(-1.9F, 19.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 6).addBox(-1.9F, 20.0F, -2.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.8F, -3.0F, 0.0F);
		ballora.addChild(left_leg);
		setRotationAngle(left_leg, 0.0F, -0.48F, 0.0F);
		left_leg.setTextureOffset(0, 48).addBox(-2.1F, 12.0F, -2.0F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(50, 18).addBox(-2.1F, 5.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(26, 43).addBox(-1.6F, 11.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(58, 12).addBox(-2.1F, 19.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 0).addBox(-2.1F, 20.0F, -2.0F, 4.0F, 3.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		ballora.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.ballora.rotateAngleY = f2 / 20.f;
	}
}