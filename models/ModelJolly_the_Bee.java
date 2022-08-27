// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelJolly_the_Bee extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer bone;
	private final ModelRenderer body;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelJolly_the_Bee() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -0.2817F, -0.0462F);
		head.setTextureOffset(0, 16).addBox(-4.0F, -4.7183F, -3.9538F, 8.0F, 4.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(98, 0).addBox(-4.0F, -8.7183F, -2.9538F, 8.0F, 4.0F, 7.0F, 0.0F, false);
		head.setTextureOffset(18, 37).addBox(-4.05F, -8.7183F, -3.9538F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(17, 28).addBox(0.05F, -8.7183F, -3.9538F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(41, 40).addBox(-2.5F, -6.7183F, -4.0538F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 32).addBox(0.5F, -6.7183F, -4.0538F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(24, 0).addBox(-5.0F, -4.7183F, -3.9538F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(4, 16).addBox(4.0F, -4.7183F, -3.9538F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 37).addBox(-3.0F, -14.7183F, -2.9538F, 6.0F, 3.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(43, 41).addBox(-2.5F, -11.7183F, -2.4538F, 5.0F, 3.0F, 5.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(2.5F, -8.2183F, -3.4538F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0873F, 0.0F, 0.0873F);
		head_r1.setTextureOffset(0, 16).addBox(-0.5F, -5.5F, -0.4F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(-2.5F, -8.2183F, -3.4538F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0873F, 0.0F, -0.0873F);
		head_r2.setTextureOffset(0, 37).addBox(-0.5F, -5.5F, -0.4F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -1.7183F, 0.0462F);
		head.addChild(bone);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(24, 0).addBox(-4.5F, 9.5F, -2.5F, 9.0F, 3.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(27, 23).addBox(-4.5F, 0.5F, -2.5F, 9.0F, 9.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 6).addBox(-0.5F, 1.1F, -2.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(44, 20).addBox(-1.5F, 0.6F, -2.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(27, 41).addBox(0.5F, 0.6F, -2.6F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 28).addBox(4.0F, 1.5F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(2, 20).addBox(-5.0F, 1.5F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 3).addBox(-1.0F, 8.5F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, 1.62F, 0.0F);
		right_arm.setTextureOffset(51, 33).addBox(-4.0F, 3.08F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(48, 4).addBox(-4.0F, -2.12F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(28, 46).addBox(-3.5F, 6.88F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(41, 37).addBox(-3.5F, 2.88F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(16, 55).addBox(-4.0F, 7.28F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, 1.62F, 0.0F);
		left_arm.setTextureOffset(0, 55).addBox(0.0F, 3.08F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(32, 49).addBox(0.0F, -2.12F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(48, 13).addBox(0.5F, 6.88F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(47, 0).addBox(0.5F, 2.88F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(55, 25).addBox(0.0F, 7.28F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.5F, 11.02F, -0.2F);
		right_leg.setTextureOffset(16, 46).addBox(-2.0F, 5.98F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 46).addBox(-2.0F, 0.58F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(34, 20).addBox(-1.5F, 4.98F, -0.8F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(24, 20).addBox(-1.5F, 0.48F, -0.8F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 28).addBox(-2.5F, 10.98F, -3.8F, 5.0F, 2.0F, 7.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.5F, 11.02F, -0.2F);
		left_leg.setTextureOffset(51, 16).addBox(-2.0F, 5.98F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(48, 49).addBox(-2.0F, 0.58F, -1.8F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(58, 13).addBox(-1.5F, 4.98F, -0.8F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(55, 1).addBox(-1.5F, 0.48F, -0.8F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(24, 37).addBox(-2.5F, 10.98F, -3.8F, 5.0F, 2.0F, 7.0F, 0.0F, false);
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