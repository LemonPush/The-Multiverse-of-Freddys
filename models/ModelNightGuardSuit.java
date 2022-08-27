// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelNightGuardSuit extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer bone;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_boot;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_boot;
	private final ModelRenderer right_leg;

	public ModelNightGuardSuit() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.5F, 0.0F);
		head.addChild(bone);
		bone.setTextureOffset(27, 0).addBox(-4.5F, -32.0F, -7.5F, 9.0F, 1.0F, 3.0F, 0.0F, false);
		bone.setTextureOffset(27, 4).addBox(-3.0F, -32.0F, -8.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-4.5F, -34.0F, -4.5F, 9.0F, 3.0F, 9.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(0, 28).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, 2.0F, 0.0F);
		left_arm.setTextureOffset(32, 8).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(1.9F, 12.0F, 0.0F);
		left_leg.setTextureOffset(24, 28).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

		left_boot = new ModelRenderer(this);
		left_boot.setRotationPoint(1.9F, 12.0F, 0.0F);
		left_boot.setTextureOffset(24, 36).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		right_arm.setTextureOffset(32, 8).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		right_boot = new ModelRenderer(this);
		right_boot.setRotationPoint(-1.9F, 12.0F, 0.0F);
		right_boot.setTextureOffset(24, 36).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		right_leg.setTextureOffset(24, 28).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_boot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_boot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}