// Made with Blockbench 4.2.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelGoldenFlumpty extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelGoldenFlumpty() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.setTextureOffset(46, 0).addBox(-6.0F, -27.0F, 4.0F, 12.0F, 15.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(62, 51).addBox(-5.0F, -26.0F, 5.0F, 10.0F, 13.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(62, 65).addBox(-3.0F, -29.0F, 5.0F, 6.0F, 17.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(26, 51).addBox(-4.0F, -30.0F, 4.0F, 8.0F, 19.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(68, 16).addBox(-3.0F, -29.0F, -5.0F, 6.0F, 17.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 64).addBox(-5.0F, -26.0F, -5.0F, 10.0F, 13.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(31, 22).addBox(-2.0F, -28.0F, -6.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(31, 26).addBox(-2.0F, -14.0F, -6.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(22, 71).addBox(-4.0F, -25.0F, -6.0F, 8.0F, 11.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(40, 71).addBox(-2.0F, -28.0F, 6.0F, 4.0F, 15.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(68, 34).addBox(-4.0F, -25.0F, 6.0F, 8.0F, 11.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(44, 51).addBox(-4.0F, -30.0F, -4.0F, 8.0F, 19.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 48).addBox(-6.0F, -27.0F, -4.0F, 12.0F, 15.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-8.0F, -27.0F, -3.0F, 16.0F, 15.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(0, 22).addBox(-6.0F, -30.0F, -3.0F, 12.0F, 19.0F, 7.0F, 0.0F, false);
		bone.setTextureOffset(38, 22).addBox(-4.0F, -32.0F, -3.0F, 8.0F, 22.0F, 7.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-7.5F, 5.0F, 0.5F);
		right_arm.setTextureOffset(54, 71).addBox(-1.5F, -1.0F, -0.5F, 1.0F, 10.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(7.5F, 5.0F, 0.5F);
		left_arm.setTextureOffset(50, 71).addBox(0.5F, -1.0F, -0.5F, 1.0F, 10.0F, 1.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.0F, 14.0F, 0.5F);
		right_leg.setTextureOffset(58, 71).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 10.0F, 1.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.0F, 14.0F, 0.5F);
		left_leg.setTextureOffset(61, 16).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 10.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}