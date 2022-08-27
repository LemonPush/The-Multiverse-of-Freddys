// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelRat extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r2;
	private final ModelRenderer bone_r3;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelRat() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.5019F, -9.9554F, 0.248F);
		head.setTextureOffset(52, 54).addBox(3.9981F, -6.5446F, -3.348F, 1.0F, 2.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(54, 46).addBox(-6.0019F, -6.5446F, -3.348F, 1.0F, 2.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-5.0019F, -11.5446F, -4.348F, 9.0F, 7.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(23, 39).addBox(-2.0019F, -4.5446F, -8.348F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(22, 52).addBox(-3.0019F, -4.5446F, -7.348F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(55, 38).addBox(-3.5019F, -6.5446F, -7.348F, 6.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(36, 60).addBox(-2.5019F, -7.0446F, -7.348F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(62, 46).addBox(-2.5019F, -6.5446F, -8.348F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(26, 18).addBox(-1.0019F, -7.0446F, -9.148F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(-0.5019F, -3.3446F, 0.252F);
		head.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.2182F, 0.0F, 0.0F);
		bone_r1.setTextureOffset(55, 43).addBox(-2.5F, 0.0F, -8.5F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		bone_r1.setTextureOffset(36, 24).addBox(-3.5F, 0.0F, -6.5F, 7.0F, 1.0F, 2.0F, 0.0F, false);
		bone_r1.setTextureOffset(52, 32).addBox(-2.5F, -1.0F, -7.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		bone_r1.setTextureOffset(0, 27).addBox(-3.5F, 0.0F, 2.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r1.setTextureOffset(51, 4).addBox(3.5F, 0.0F, -4.5F, 1.0F, 1.0F, 8.0F, 0.0F, true);
		bone_r1.setTextureOffset(51, 4).addBox(-4.5F, 0.0F, -4.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(2.4981F, -11.5446F, -0.348F);
		head.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.0F, 0.0F, -0.7854F);
		bone_r2.setTextureOffset(0, 15).addBox(0.25F, 0.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(26, 15).addBox(1.25F, 2.0F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone_r2.setTextureOffset(62, 22).addBox(0.25F, -1.0F, -1.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);

		bone_r3 = new ModelRenderer(this);
		bone_r3.setRotationPoint(-3.5019F, -11.5446F, -0.348F);
		head.addChild(bone_r3);
		setRotationAngle(bone_r3, 0.0F, 0.0F, 0.7854F);
		bone_r3.setTextureOffset(60, 54).addBox(-4.25F, -1.0F, -1.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -9.0F, 0.0F);
		body.setTextureOffset(62, 25).addBox(-4.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(35, 41).addBox(-4.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(15, 39).addBox(1.0F, 1.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(15, 52).addBox(1.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(56, 62).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(26, 0).addBox(-5.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(49, 0).addBox(-4.0F, 7.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(26, 29).addBox(1.0F, 4.4F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(10, 66).addBox(5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(64, 64).addBox(-7.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-1.0F, 9.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 15).addBox(-5.0F, 5.3F, -3.0F, 10.0F, 6.0F, 6.0F, 0.25F, false);
		body.setTextureOffset(0, 15).addBox(-5.0F, -1.4F, -3.0F, 10.0F, 6.0F, 6.0F, 0.25F, false);
		body.setTextureOffset(0, 29).addBox(-5.0F, 11.9F, -3.0F, 10.0F, 4.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(48, 62).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 13.9F, 2.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -1.1781F, 0.0F, 0.0F);
		body_r1.setTextureOffset(20, 15).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(0.0F, 21.171F, 9.1606F);
		body.addChild(body_r2);
		setRotationAngle(body_r2, -0.8293F, -0.0088F, -0.0065F);
		body_r2.setTextureOffset(20, 15).addBox(-1.0F, 3.3672F, 0.7016F, 2.0F, 2.0F, 12.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(6.5F, -9.0F, 0.0F);
		left_arm.setTextureOffset(51, 13).addBox(1.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(56, 13).addBox(0.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(20, 41).addBox(-0.5F, 6.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(42, 52).addBox(0.0F, 13.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(26, 4).addBox(1.0F, 12.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(34, 0).addBox(-0.5F, -1.7F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-6.5F, -9.0F, 0.0F);
		right_arm.setTextureOffset(42, 52).addBox(-4.0F, 13.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
		right_arm.setTextureOffset(64, 60).addBox(-3.0F, 12.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(40, 66).addBox(-3.0F, 5.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 58).addBox(-3.5F, -1.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_arm.setTextureOffset(36, 12).addBox(-4.5F, -1.7F, -2.5F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(40, 41).addBox(-4.5F, 6.0F, -2.5F, 5.0F, 6.0F, 5.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.7F, 7.0F, -0.5F);
		left_leg.setTextureOffset(26, 66).addBox(-1.0F, 7.5F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(34, 64).addBox(-1.0F, 13.5F, -0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(18, 66).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(12, 58).addBox(-1.5F, 8.5F, -1.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(12, 58).addBox(-1.5F, 2.5F, -1.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 50).addBox(-2.0F, 16.0F, -4.5F, 4.0F, 1.0F, 7.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 39).addBox(-2.5F, 8.0F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, true);
		left_leg.setTextureOffset(32, 29).addBox(-2.5F, 0.5F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, true);
		left_leg.setTextureOffset(61, 4).addBox(-2.0F, 15.0F, -1.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.7F, 7.0F, -0.5F);
		right_leg.setTextureOffset(65, 13).addBox(-1.0F, 7.5F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(37, 52).addBox(-1.0F, 13.5F, -0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(62, 49).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(24, 58).addBox(-1.5F, 8.5F, -1.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(47, 24).addBox(-2.0F, 16.0F, -4.5F, 4.0F, 1.0F, 7.0F, 0.0F, false);
		right_leg.setTextureOffset(61, 8).addBox(-2.0F, 15.0F, -1.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(32, 29).addBox(-2.5F, 0.5F, -2.0F, 5.0F, 7.0F, 5.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 39).addBox(-2.5F, 8.0F, -2.0F, 5.0F, 6.0F, 5.0F, 0.0F, false);
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
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}