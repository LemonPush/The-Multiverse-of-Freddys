// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelCoffee extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelCoffee() {
		textureWidth = 32;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(1.0F, 24.0F, 0.0F);
		body.setTextureOffset(17, 0).addBox(-3.5F, -11.0F, 0.0F, 5.0F, 5.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 8).addBox(-3.5F, -6.0F, -6.0F, 5.0F, 1.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(20, 28).addBox(-2.5F, -10.0F, -3.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 29).addBox(-2.0F, -11.0F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(10, 24).addBox(-1.5F, -10.0F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 23).addBox(-1.5F, -10.0F, -5.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(24, 20).addBox(-1.5F, -8.0F, -5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 16).addBox(-3.0F, -9.0F, -4.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-3.5F, -12.0F, -6.0F, 5.0F, 1.0F, 7.0F, 0.0F, false);
		body.setTextureOffset(20, 20).addBox(-1.5F, -14.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(12, 16).addBox(-3.5F, -13.0F, -2.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.0F, -13.5F, 1.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.6109F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 8).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(2.0F, 14.6667F, 0.5F);
		left_arm.setTextureOffset(26, 6).addBox(0.5F, 2.8333F, 0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		left_arm.setTextureOffset(6, 23).addBox(0.5F, -0.6667F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 26).addBox(0.5F, 2.8333F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-2.0F, 14.6667F, 0.5F);
		right_arm.setTextureOffset(25, 16).addBox(-1.5F, 2.8333F, 0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 0).addBox(-1.5F, -0.6667F, -0.5F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		right_arm.setTextureOffset(14, 25).addBox(-1.5F, 2.8333F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(1.5F, 18.3333F, 0.0F);
		left_leg.setTextureOffset(20, 22).addBox(-1.0F, 3.6667F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 13).addBox(-1.0F, 4.6667F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		left_leg.setTextureOffset(25, 12).addBox(-0.5F, 0.6667F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-1.5F, 18.3333F, 0.0F);
		right_leg.setTextureOffset(13, 20).addBox(-1.0F, 3.6667F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 5).addBox(-1.0F, 4.6667F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 16).addBox(-0.5F, 0.6667F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
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
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}