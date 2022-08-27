// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelImpurity extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_arm;

	public ModelImpurity() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -1.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(20, 21).addBox(-3.0F, -3.0F, -4.0F, 6.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 40).addBox(2.0F, -12.0F, -1.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(36, 32).addBox(-8.0F, -12.0F, -1.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(28, 15).addBox(-2.0F, -3.5F, -6.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(24, 0).addBox(-2.5F, 0.0F, -4.0F, 5.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 13).addBox(-0.5F, -4.5F, -6.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -9.5F, -4.5F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, -0.4363F, 0.0F, 0.0F);
		head_r1.setTextureOffset(0, 4).addBox(-1.0F, -2.2F, 1.9F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 0).addBox(1.0F, -2.7F, 1.9F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(0, 0).addBox(-4.0F, -2.7F, 1.9F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 4.0F, 0.0F);
		body.setTextureOffset(0, 13).addBox(-4.5F, 2.0F, -2.5F, 9.0F, 11.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 29).addBox(-3.0F, -5.0F, -2.0F, 6.0F, 7.0F, 4.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(2.5774F, -0.3498F, 0.0F);
		setRotationAngle(left_arm, 0.0F, 0.0F, -0.4363F);
		left_arm.setTextureOffset(40, 15).addBox(-0.3831F, 0.2846F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(20, 32).addBox(-1.2831F, 9.2846F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.5F, 12.75F, -0.75F);
		right_leg.setTextureOffset(40, 0).addBox(-1.0F, 0.25F, -0.25F, 2.0F, 10.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(25, 6).addBox(-2.0F, 9.25F, -3.75F, 4.0F, 2.0F, 7.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.5F, 12.75F, -0.75F);
		left_leg.setTextureOffset(40, 0).addBox(-1.0F, 0.25F, -0.25F, 2.0F, 10.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(25, 6).addBox(-2.0F, 9.25F, -3.75F, 4.0F, 2.0F, 7.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-2.5774F, -0.3498F, 0.0F);
		setRotationAngle(right_arm, 0.0F, 0.0F, 0.4363F);
		right_arm.setTextureOffset(40, 15).addBox(-1.6169F, 0.2846F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);
		right_arm.setTextureOffset(20, 32).addBox(-2.7169F, 9.2846F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}