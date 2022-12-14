// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelCharlotte extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelCharlotte() {
		textureWidth = 32;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 10.8F, 0.825F);
		head.setTextureOffset(0, 0).addBox(-3.0F, -7.8F, -2.825F, 6.0F, 7.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(17, 0).addBox(0.25F, -6.7F, -2.925F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(17, 0).addBox(-2.25F, -6.7F, -2.925F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(16, 12).addBox(-3.5F, -8.3F, -3.325F, 7.0F, 8.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(0, 12).addBox(-2.5F, -14.0F, -1.0F, 5.0F, 7.0F, 3.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-2.5F, 10.5F, 0.5F);
		right_arm.setTextureOffset(13, 21).addBox(-2.0F, -0.5F, -1.5F, 2.0F, 7.0F, 3.0F, 0.0F, true);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(2.5F, 10.5F, 0.5F);
		left_arm.setTextureOffset(13, 21).addBox(0.0F, -0.5F, -1.5F, 2.0F, 7.0F, 3.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-1.5F, 16.5F, 0.5F);
		right_leg.setTextureOffset(13, 21).addBox(-1.0F, 0.5F, -1.5F, 2.0F, 7.0F, 3.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(1.5F, 16.5F, 0.5F);
		left_leg.setTextureOffset(13, 21).addBox(-1.0F, 0.5F, -1.5F, 2.0F, 7.0F, 3.0F, 0.0F, true);
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