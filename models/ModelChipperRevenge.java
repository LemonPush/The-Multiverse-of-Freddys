// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelChipperRevenge extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelChipperRevenge() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -17.5F, 1.0F);
		head.setTextureOffset(0, 30).addBox(-7.0F, -15.5F, -6.5F, 14.0F, 15.0F, 14.0F, 0.0F, false);
		head.setTextureOffset(0, 18).addBox(-3.0F, -16.5F, -6.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 9).addBox(2.0F, -16.5F, -6.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-0.5F, -16.5F, -6.5F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 30).addBox(1.5F, -12.5F, -7.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(17, 17).addBox(-5.5F, -12.5F, -7.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(80, 0).addBox(-7.0F, -7.5F, -8.0F, 14.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 9).addBox(-7.0F, -4.5F, -7.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(5.0F, -4.5F, -7.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(19, 8).addBox(-5.0F, -2.5F, -7.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(19, 0).addBox(3.0F, -2.5F, -7.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(18, 22).addBox(4.0F, -3.5F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 21).addBox(-5.0F, -3.5F, -7.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(45, 22).addBox(-5.0F, -1.5F, -7.0F, 10.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 18).addBox(-1.0F, -2.5F, -7.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 6).addBox(-1.0F, -4.5F, -8.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(10, 19).addBox(-1.0F, -8.5F, -8.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(10, 9).addBox(7.0F, -13.5F, -1.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(10, 0).addBox(-10.0F, -13.5F, -1.0F, 3.0F, 5.0F, 3.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 10.0F, 3.0F);
		body.setTextureOffset(47, 50).addBox(-7.0F, -13.0F, -6.0F, 14.0F, 9.0F, 9.0F, 0.0F, false);
		body.setTextureOffset(45, 0).addBox(-7.0F, -28.0F, -5.0F, 14.0F, 15.0F, 7.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.5F, -5.5F, 2.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.0472F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-4.5F, -3.0F, -5.0F, 9.0F, 3.0F, 27.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-7.0F, -15.0F, 1.5F);
		right_arm.setTextureOffset(48, 68).addBox(-5.0F, -3.0F, -2.5F, 5.0F, 24.0F, 5.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(7.0F, -15.0F, 1.5F);
		left_arm.setTextureOffset(28, 63).addBox(0.0F, -3.0F, -2.5F, 5.0F, 24.0F, 5.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.5F, 9.5F, 1.75F);
		right_leg.setTextureOffset(65, 23).addBox(-3.5F, -3.5F, -3.75F, 7.0F, 15.0F, 7.0F, 0.0F, false);
		right_leg.setTextureOffset(68, 80).addBox(-3.0F, 11.5F, -5.75F, 6.0F, 3.0F, 9.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.5F, 9.5F, 1.75F);
		left_leg.setTextureOffset(0, 59).addBox(-3.5F, -3.5F, -3.75F, 7.0F, 15.0F, 7.0F, 0.0F, false);
		left_leg.setTextureOffset(68, 68).addBox(-3.0F, 11.5F, -5.75F, 6.0F, 3.0F, 9.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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