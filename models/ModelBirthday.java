// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelBirthday extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;

	public ModelBirthday() {
		textureWidth = 32;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 14.3333F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.5F, -6.3333F, -2.5F, 9.0F, 6.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(14, 11).addBox(-2.0F, -7.3333F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(14, 16).addBox(-1.5F, -8.3333F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(8, 20).addBox(-1.0F, -9.3333F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(11, 11).addBox(-0.5F, -10.3333F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 20).addBox(-1.0F, -12.3333F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(12.5F, 0.0F, 0.0F);
		body.setTextureOffset(0, 11).addBox(-14.5F, 14.0F, -1.5F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-1.3F, 20.0F, 0.0F);
		right_leg.setTextureOffset(23, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(1.3F, 20.0F, 0.0F);
		left_leg.setTextureOffset(0, 0).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-1.5F, 15.5F, 0.0F);
		right_arm.setTextureOffset(16, 20).addBox(-1.5F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(1.5F, 15.5F, 0.0F);
		left_arm.setTextureOffset(20, 20).addBox(0.5F, -0.5F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}