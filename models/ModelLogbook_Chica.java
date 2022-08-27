// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelLogbook_Chica extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelLogbook_Chica() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 41).addBox(-3.0F, -7.0F, -7.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(48, 21).addBox(-3.0F, -8.0F, -7.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(38, 2).addBox(-3.0F, -8.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 36).addBox(2.0F, -8.0F, -6.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(52, 37).addBox(-2.8F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(52, 3).addBox(0.8F, -12.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(16, 41).addBox(0.8F, -13.5F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(24, 4).addBox(-2.8F, -13.5F, -4.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(30, 8).addBox(-4.5F, -13.5F, -4.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(22, 24).addBox(3.5F, -13.5F, -4.0F, 1.0F, 7.0F, 8.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -15.5F, -1.5F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.3054F, 0.0F, 0.0F);
		head_r1.setTextureOffset(32, 7).addBox(-1.0F, -1.1F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(0.0F, -15.5F, -1.5F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.3054F, -1.5708F, 0.0F);
		head_r2.setTextureOffset(24, 0).addBox(0.5F, -1.8F, -2.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(0.0F, -15.5F, -1.5F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, -0.3054F, -1.5708F, 0.0F);
		head_r3.setTextureOffset(0, 32).addBox(0.5F, -1.8F, 1.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(0.0F, -15.5F, -1.5F);
		head.addChild(head_r4);
		setRotationAngle(head_r4, -0.3054F, 0.0F, 0.0F);
		head_r4.setTextureOffset(32, 11).addBox(-1.0F, -2.1F, 2.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(0, 16).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 11.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(32, 23).addBox(-4.0F, -5.9F, -2.7F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(38, 0).addBox(-3.5F, 2.1F, -2.7F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(50, 23).addBox(-7.0F, -5.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(26, 49).addBox(5.0F, -5.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(52, 0).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(36, 45).addBox(-3.0F, 7.0F, -1.5F, 6.0F, 2.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-1.0F, 6.0F, -0.8F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(51, 43).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
		left_arm.setTextureOffset(48, 13).addBox(1.5F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(48, 13).addBox(1.5F, 5.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		left_arm.setTextureOffset(12, 51).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(50, 50).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(36, 35).addBox(1.0F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(36, 35).addBox(1.0F, 6.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
		right_arm.setTextureOffset(18, 49).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(48, 29).addBox(-4.5F, -1.0F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
		right_leg.setTextureOffset(0, 46).addBox(-1.4F, 8.0F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(40, 3).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(40, 13).addBox(-0.9F, 14.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(40, 13).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(42, 50).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(50, 27).addBox(0.6F, 15.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		right_leg.setTextureOffset(51, 46).addBox(-2.4F, 15.0F, -5.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		right_leg.setTextureOffset(24, 0).addBox(-1.9F, 15.0F, -4.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
		left_leg.setTextureOffset(20, 39).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(36, 35).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(34, 50).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(40, 32).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 32).addBox(-2.6F, 14.0F, -4.0F, 5.0F, 2.0F, 7.0F, 0.0F, false);
		left_leg.setTextureOffset(12, 46).addBox(-2.6F, 14.0F, -6.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 4).addBox(0.4F, 14.0F, -6.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}