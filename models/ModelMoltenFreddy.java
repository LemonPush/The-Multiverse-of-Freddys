// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelMoltenFreddy extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer right_arm_r5_r1;
	private final ModelRenderer right_arm_r4_r1;
	private final ModelRenderer right_arm_r1;
	private final ModelRenderer right_arm_r2;
	private final ModelRenderer right_arm_r3;
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r2;
	private final ModelRenderer right_arm_r4;
	private final ModelRenderer body;
	private final ModelRenderer neck;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_arm_r1;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm_r2;

	public ModelMoltenFreddy() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.3294F, 0.05F);

		right_arm_r5_r1 = new ModelRenderer(this);
		right_arm_r5_r1.setRotationPoint(-4.9548F, -13.9705F, -1.2167F);
		head.addChild(right_arm_r5_r1);
		setRotationAngle(right_arm_r5_r1, -1.5708F, 0.0F, 0.5672F);
		right_arm_r5_r1.setTextureOffset(9, 0).addBox(-0.05F, -2.1F, -1.5F, 1.0F, 2.0F, 1.0F, 0.25F, false);
		right_arm_r5_r1.setTextureOffset(16, 39).addBox(-3.55F, -2.1F, -2.5F, 3.0F, 2.0F, 3.0F, 0.25F, false);

		right_arm_r4_r1 = new ModelRenderer(this);
		right_arm_r4_r1.setRotationPoint(4.9548F, -13.9705F, -1.2167F);
		head.addChild(right_arm_r4_r1);
		setRotationAngle(right_arm_r4_r1, -1.5708F, 0.0F, -0.5672F);
		right_arm_r4_r1.setTextureOffset(34, 16).addBox(-0.95F, -2.1F, -1.5F, 1.0F, 2.0F, 1.0F, 0.25F, false);
		right_arm_r4_r1.setTextureOffset(66, 61).addBox(0.55F, -2.1F, -2.5F, 3.0F, 2.0F, 3.0F, 0.25F, false);

		right_arm_r1 = new ModelRenderer(this);
		right_arm_r1.setRotationPoint(8.0F, -2.1706F, 8.45F);
		head.addChild(right_arm_r1);
		setRotationAngle(right_arm_r1, -1.5708F, 0.0F, 0.0F);
		right_arm_r1.setTextureOffset(40, 48).addBox(-11.0F, 7.0F, -6.8F, 6.0F, 4.0F, 5.0F, 0.0F, false);
		right_arm_r1.setTextureOffset(26, 38).addBox(-12.0F, 7.0F, -11.8F, 8.0F, 4.0F, 6.0F, 0.0F, false);

		right_arm_r2 = new ModelRenderer(this);
		right_arm_r2.setRotationPoint(-3.5622F, -18.9931F, -0.55F);
		head.addChild(right_arm_r2);
		setRotationAngle(right_arm_r2, -1.5708F, 0.0F, 0.6545F);

		right_arm_r3 = new ModelRenderer(this);
		right_arm_r3.setRotationPoint(3.5622F, -18.9931F, -0.55F);
		head.addChild(right_arm_r3);
		setRotationAngle(right_arm_r3, -1.5708F, 0.0F, -0.6545F);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 8.8294F, -1.55F);
		head.addChild(bone);
		bone.setTextureOffset(93, 60).addBox(-3.5F, -16.8F, -5.0F, 7.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(44, 8).addBox(-3.5F, -18.8F, -5.0F, 7.0F, 2.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 16).addBox(-4.5F, -23.8F, -2.1F, 9.0F, 8.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(16, 48).addBox(-3.0F, -24.8F, -1.5F, 6.0F, 2.0F, 6.0F, -0.25F, false);
		bone.setTextureOffset(31, 57).addBox(-2.0F, -27.8F, -0.5F, 4.0F, 5.0F, 4.0F, -0.25F, false);
		bone.setTextureOffset(55, 50).addBox(4.5F, -18.8F, -2.1F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(55, 18).addBox(-5.5F, -18.8F, -2.1F, 1.0F, 3.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(64, 17).addBox(-2.5F, -19.4F, -4.8F, 5.0F, 1.0F, 4.0F, 0.0F, false);
		bone.setTextureOffset(0, 35).addBox(-1.0F, -20.4F, -4.8F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.0F, -12.7F, 0.9F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.1309F, 0.0F, 0.0F);
		bone_r1.setTextureOffset(108, 0).addBox(-3.5F, -1.9F, -5.7F, 7.0F, 1.0F, 3.0F, 0.0F, false);

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(0.0F, -12.7F, 0.9F);
		bone.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.1309F, 0.0F, 0.0F);
		bone_r2.setTextureOffset(10, 10).addBox(3.5F, -0.9F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(13, 39).addBox(-4.5F, -0.9F, -2.7F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(59, 8).addBox(-5.5F, -0.9F, -2.7F, 1.0F, 2.0F, 7.0F, 0.0F, false);
		bone_r2.setTextureOffset(40, 59).addBox(4.5F, -0.9F, -2.7F, 1.0F, 2.0F, 7.0F, 0.0F, false);
		bone_r2.setTextureOffset(57, 47).addBox(-4.5F, -0.9F, 3.3F, 9.0F, 1.0F, 1.0F, 0.0F, false);
		bone_r2.setTextureOffset(54, 43).addBox(-3.5F, 0.1F, -5.7F, 7.0F, 1.0F, 3.0F, 0.0F, false);
		bone_r2.setTextureOffset(56, 28).addBox(-3.5F, -0.9F, -5.7F, 7.0F, 1.0F, 3.0F, 0.0F, false);
		bone_r2.setTextureOffset(0, 31).addBox(-4.5F, 0.1F, -2.7F, 9.0F, 1.0F, 7.0F, 0.0F, false);

		right_arm_r4 = new ModelRenderer(this);
		right_arm_r4.setRotationPoint(8.0F, -11.0F, 9.0F);
		bone.addChild(right_arm_r4);
		setRotationAngle(right_arm_r4, -1.5708F, 0.0F, 0.0F);
		right_arm_r4.setTextureOffset(64, 22).addBox(-11.5F, 9.7F, -12.4F, 3.0F, 2.0F, 1.0F, -0.25F, false);
		right_arm_r4.setTextureOffset(0, 60).addBox(-7.0F, 10.2F, -10.8F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		right_arm_r4.setTextureOffset(26, 56).addBox(-11.0F, 10.2F, -10.8F, 2.0F, 1.0F, 2.0F, 0.25F, false);
		right_arm_r4.setTextureOffset(50, 28).addBox(-7.5F, 9.7F, -12.4F, 3.0F, 2.0F, 1.0F, -0.25F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(-0.5F, -9.0F, 0.0F);
		body.setTextureOffset(32, 66).addBox(-4.0F, 7.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(34, 48).addBox(1.0F, 7.5F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 10).addBox(1.0F, 4.7F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(16, 44).addBox(1.0F, 10.1F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(66, 32).addBox(4.5F, 4.7F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(25, 16).addBox(-6.5F, 4.7F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(26, 25).addBox(-4.0F, 4.8F, -3.0F, 9.0F, 7.0F, 6.0F, 0.25F, false);
		body.setTextureOffset(0, 0).addBox(-7.0F, 30.8F, -7.0F, 15.0F, 2.0F, 14.0F, 0.25F, false);
		body.setTextureOffset(32, 16).addBox(-4.0F, 28.3F, -3.0F, 9.0F, 3.0F, 6.0F, 0.25F, false);
		body.setTextureOffset(0, 39).addBox(-2.0F, 11.8F, -1.5F, 5.0F, 18.0F, 3.0F, 0.25F, false);
		body.setTextureOffset(44, 0).addBox(-3.5F, 11.8F, -2.0F, 8.0F, 4.0F, 4.0F, 0.25F, false);
		body.setTextureOffset(0, 20).addBox(-0.5F, 5.3F, -4.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 31).addBox(-2.5F, 5.0F, -4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 16).addBox(1.5F, 5.0F, -4.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(24, 66).addBox(-1.0F, 4.7F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(64, 49).addBox(-1.5F, 2.7F, -2.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(86, 31).addBox(0.5F, 24.2F, -1.8F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		body.setTextureOffset(80, 25).addBox(-1.5F, 18.2F, -1.8F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		body.setTextureOffset(90, 25).addBox(1.5F, 13.2F, -2.2F, 2.0F, 2.0F, 1.0F, 0.25F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(2.0F, 1.0F, 0.0F);
		body.addChild(neck);
		setRotationAngle(neck, 1.0036F, 0.0F, 2.7925F);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.4F, -2.4F, 0.0F);
		setRotationAngle(left_arm, 0.0F, 0.0F, -0.5236F);
		left_arm.setTextureOffset(12, 66).addBox(0.2F, -0.434F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(85, 18).addBox(2.3F, 2.6F, -1.0F, 1.0F, 2.0F, 2.0F, 0.25F, false);

		left_arm_r1 = new ModelRenderer(this);
		left_arm_r1.setRotationPoint(1.7F, 6.166F, 0.0F);
		left_arm.addChild(left_arm_r1);
		setRotationAngle(left_arm_r1, -0.8727F, 0.0F, 0.0F);
		left_arm_r1.setTextureOffset(11, 56).addBox(-2.5F, 7.1F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		left_arm_r1.setTextureOffset(56, 64).addBox(-1.5F, 0.4F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.4F, -2.4F, 0.0F);
		setRotationAngle(right_arm, 0.0F, 0.0F, 0.5236F);
		right_arm.setTextureOffset(0, 0).addBox(-3.2F, -0.434F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);

		left_arm_r2 = new ModelRenderer(this);
		left_arm_r2.setRotationPoint(-1.7F, 6.166F, 0.0F);
		right_arm.addChild(left_arm_r2);
		setRotationAngle(left_arm_r2, -0.8727F, 0.0F, 0.0F);
		left_arm_r2.setTextureOffset(51, 33).addBox(-2.5F, 7.1F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		left_arm_r2.setTextureOffset(0, 63).addBox(-1.5F, 0.4F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}