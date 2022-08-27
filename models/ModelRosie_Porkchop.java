// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelRosie_Porkchop extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelRosie_Porkchop() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(30, 16).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(38, 52).addBox(-5.0F, -16.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(38, 52).addBox(3.0F, -16.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(30, 30).addBox(-1.0F, -10.4F, -6.0F, 2.0F, 2.0F, 2.0F, 0.25F, false);
		head.setTextureOffset(30, 30).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(31, 13).addBox(-3.0F, -8.0F, -4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(54, 21).addBox(1.0F, -12.7F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 17).addBox(1.5F, -10.3F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 17).addBox(-3.5F, -10.3F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(54, 18).addBox(-3.0F, -12.7F, -4.2F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(2.5F, -15.0F, -4.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, -0.5919F, -0.2188F, 0.1449F);
		head_r1.setTextureOffset(0, 125).addBox(-1.5F, -0.3F, -0.1F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 125).addBox(0.5F, 0.2F, -0.1F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 125).addBox(1.5F, -0.3F, -0.1F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(37, 0).addBox(-5.0F, 6.0F, -2.5F, 10.0F, 3.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 13).addBox(-6.0F, 5.5F, -3.5F, 12.0F, 4.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-7.0F, 9.5F, -4.5F, 14.0F, 4.0F, 9.0F, 0.0F, false);
		body.setTextureOffset(82, 115).addBox(-7.0F, 13.5F, -4.5F, 14.0F, 4.0F, 9.0F, 0.0F, false);
		body.setTextureOffset(0, 24).addBox(-5.0F, -6.5F, -2.5F, 10.0F, 12.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(31, 15).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 13).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(46, 8).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-1.0F, -9.0F, -0.8F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.5F, 7.5F, 1.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -0.5672F, 0.0F, 0.0F);
		body_r1.setTextureOffset(0, 24).addBox(-1.0F, -2.3F, 6.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(5, 5).addBox(-0.3F, -1.3F, 7.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(0, 26).addBox(-1.0F, -0.3F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(25, 24).addBox(-1.7F, -1.3F, 5.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(25, 26).addBox(-0.3F, -1.3F, 4.3F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(37, 0).addBox(-1.0F, -2.3F, 3.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body_r1.setTextureOffset(0, 5).addBox(-1.0F, -1.3F, 0.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
		right_arm.setTextureOffset(58, 26).addBox(-5.0F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(34, 58).addBox(-5.0F, 4.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(43, 13).addBox(-4.0F, 8.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(30, 34).addBox(-4.0F, 3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(60, 44).addBox(-5.0F, 9.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(40, 39).addBox(-6.0F, -3.5F, -2.5F, 6.0F, 3.0F, 5.0F, 0.0F, true);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
		left_arm.setTextureOffset(0, 51).addBox(1.0F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(40, 39).addBox(0.0F, -3.5F, -2.5F, 6.0F, 3.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(12, 60).addBox(1.0F, 4.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(18, 41).addBox(2.0F, 8.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 41).addBox(2.0F, 3.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(58, 36).addBox(1.0F, 9.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.0F, 7.6F, -0.2F);
		right_leg.setTextureOffset(56, 54).addBox(-2.0F, 8.4F, -1.8F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(22, 49).addBox(-2.0F, 0.9F, -1.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(12, 51).addBox(-1.0F, 7.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 44).addBox(-1.0F, 0.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 41).addBox(-2.5F, 14.4F, -4.8F, 5.0F, 2.0F, 8.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.0F, 7.6F, -0.2F);
		left_leg.setTextureOffset(54, 8).addBox(-2.0F, 8.4F, -1.8F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(44, 47).addBox(-2.0F, 0.9F, -1.8F, 4.0F, 7.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(34, 49).addBox(-1.0F, 7.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(18, 44).addBox(-1.0F, 0.4F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(22, 39).addBox(-2.5F, 14.4F, -4.8F, 5.0F, 2.0F, 8.0F, 0.0F, false);
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
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}