// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelChipper extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer bone;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelChipper() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 19).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(42, 24).addBox(-4.0F, -4.0F, -5.5F, 8.0F, 4.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-0.5F, -4.5F, -5.8F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 19).addBox(3.0F, -7.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(10, 0).addBox(-5.0F, -7.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(29, 0).addBox(-5.0F, 5.0F, -3.0F, 10.0F, 7.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(40, 13).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 5.0F, 6.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 11.0F, 1.0F);
		body.addChild(bone);
		setRotationAngle(bone, -0.8727F, 0.0F, 0.0F);
		bone.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, 0.2F, 6.0F, 2.0F, 17.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.0F, 2.0F, 0.0F);
		left_arm.setTextureOffset(44, 43).addBox(0.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.0F, 2.0F, 0.0F);
		right_arm.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.5F, 12.0F, 0.0F);
		left_leg.setTextureOffset(0, 35).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 12.0F, 6.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.5F, 12.0F, 0.0F);
		right_leg.setTextureOffset(26, 29).addBox(-2.5F, 0.0F, -3.0F, 5.0F, 12.0F, 6.0F, 0.0F, false);
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