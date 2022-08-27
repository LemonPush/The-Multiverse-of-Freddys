// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelBunnyCall extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer body;
	private final ModelRenderer right_arm;
	private final ModelRenderer bone4;
	private final ModelRenderer left_leg_r1;
	private final ModelRenderer left_arm;
	private final ModelRenderer bone5;
	private final ModelRenderer left_leg_r2;
	private final ModelRenderer right_leg;
	private final ModelRenderer leg;
	private final ModelRenderer bone2;
	private final ModelRenderer left_leg;
	private final ModelRenderer leg2;
	private final ModelRenderer bone3;

	public ModelBunnyCall() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -13.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-3.5F, 3.0F, -2.5F, 7.0F, 7.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(15, 35).addBox(-2.5F, 2.0F, -2.0F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(43, 0).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(20, 0).addBox(-2.5F, 7.0F, -3.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(40, 61).addBox(-2.5F, 8.0F, -3.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-0.5F, 6.3F, -3.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-2.0F, 3.1565F, 0.7222F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.7854F, 0.0F, -0.3927F);
		head_r1.setTextureOffset(38, 52).addBox(-1.0F, -7.3891F, 1.8749F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(-2.0F, 3.1565F, 0.7222F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, -0.3927F);
		head_r2.setTextureOffset(0, 13).addBox(-1.0F, -4.1565F, -1.2222F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(2.0F, 3.1565F, 0.7222F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, 0.7854F, 0.0F, 0.3927F);
		head_r3.setTextureOffset(56, 33).addBox(-1.0F, -7.3891F, 1.8749F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(2.0F, 3.1565F, 0.7222F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, 0.0F, 0.0F, 0.3927F);
		head_r4.setTextureOffset(56, 47).addBox(-1.0F, -4.1565F, -1.2222F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(20, 21).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 11.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(58, 61).addBox(-1.0F, 7.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(32, 40).addBox(1.2F, -2.2F, -1.2F, 2.0F, 9.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(38, 10).addBox(-3.0F, -2.2F, 1.2F, 6.0F, 9.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 39).addBox(-3.2F, -2.2F, -1.2F, 2.0F, 9.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(54, 5).addBox(1.2F, 2.8F, -2.2F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(54, 12).addBox(-3.2F, 2.8F, -2.2F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(49, 17).addBox(-1.5F, -2.4F, -2.45F, 3.0F, 3.0F, 3.0F, -1.0F, false);
		body.setTextureOffset(10, 41).addBox(-3.5F, -2.9F, -2.45F, 4.0F, 4.0F, 3.0F, -1.0F, false);
		body.setTextureOffset(38, 20).addBox(-0.5F, -2.9F, -2.45F, 4.0F, 4.0F, 3.0F, -1.0F, false);
		body.setTextureOffset(48, 27).addBox(-1.5F, -0.5F, -2.05F, 3.0F, 3.0F, 3.0F, -1.0F, false);
		body.setTextureOffset(34, 31).addBox(-2.5F, 3.0F, -2.0F, 5.0F, 5.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(56, 53).addBox(-1.0F, -5.0F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-2.7273F, -0.8436F, 0.59F);
		setRotationAngle(right_arm, 3.1416F, 0.0F, -2.7489F);
		right_arm.setTextureOffset(18, 51).addBox(0.0824F, -0.8869F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(7.2919F, 12.4043F, 4.0503F);
		right_arm.addChild(bone4);
		setRotationAngle(bone4, 0.2618F, 0.0F, 0.0F);

		left_leg_r1 = new ModelRenderer(this);
		left_leg_r1.setRotationPoint(-2.0F, -13.0F, 0.0F);
		bone4.addChild(left_leg_r1);
		setRotationAngle(left_leg_r1, 0.6981F, 0.0F, 0.0F);
		left_leg_r1.setTextureOffset(18, 5).addBox(-7.2095F, 6.2752F, -9.0751F, 2.0F, 8.0F, 8.0F, 0.0F, false);
		left_leg_r1.setTextureOffset(50, 38).addBox(-5.2095F, 2.2752F, -6.0751F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(2.7273F, -0.8436F, 0.59F);
		setRotationAngle(left_arm, 3.1416F, 0.0F, 2.7489F);
		left_arm.setTextureOffset(48, 50).addBox(-2.0824F, -0.8869F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-7.2919F, 12.4043F, 4.0503F);
		left_arm.addChild(bone5);
		setRotationAngle(bone5, 0.2618F, 0.0F, 0.0F);

		left_leg_r2 = new ModelRenderer(this);
		left_leg_r2.setRotationPoint(2.0F, -13.0F, 0.0F);
		bone5.addChild(left_leg_r2);
		setRotationAngle(left_leg_r2, 0.6981F, 0.0F, 0.0F);
		left_leg_r2.setTextureOffset(0, 13).addBox(5.2095F, 6.2752F, -9.0751F, 2.0F, 8.0F, 8.0F, 0.0F, false);
		left_leg_r2.setTextureOffset(10, 48).addBox(3.2095F, 2.2752F, -6.0751F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-1.5628F, 8.1437F, 1.1398F);
		right_leg.setTextureOffset(30, 0).addBox(-3.5F, 13.8F, -4.5F, 3.0F, 2.0F, 7.0F, 0.0F, false);

		leg = new ModelRenderer(this);
		leg.setRotationPoint(0.6628F, -8.4814F, -0.3448F);
		right_leg.addChild(leg);
		setRotationAngle(leg, -0.0418F, 0.0283F, 0.1278F);
		leg.setTextureOffset(30, 52).addBox(-0.8628F, 8.5292F, -0.4974F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.6274F, 24.0575F, 2.5776F);
		leg.addChild(bone2);
		setRotationAngle(bone2, 0.2618F, 0.0F, 0.0F);
		bone2.setTextureOffset(42, 40).addBox(-2.4903F, -9.076F, -0.7329F, 2.0F, 9.0F, 2.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(1.5628F, 8.1437F, 1.1398F);
		left_leg.setTextureOffset(0, 29).addBox(0.5F, 13.8F, -4.5F, 3.0F, 2.0F, 7.0F, 0.0F, false);

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-0.6628F, -8.4814F, -0.3448F);
		left_leg.addChild(leg2);
		setRotationAngle(leg2, -0.0418F, -0.0283F, -0.1278F);
		leg2.setTextureOffset(0, 51).addBox(-1.1372F, 8.5292F, -0.4974F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.6274F, 24.0575F, 2.5776F);
		leg2.addChild(bone3);
		setRotationAngle(bone3, 0.2618F, 0.0F, 0.0F);
		bone3.setTextureOffset(24, 41).addBox(0.4903F, -9.076F, -0.7329F, 2.0F, 9.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.right_arm.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}