// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelPluto extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer front_right;
	private final ModelRenderer front_left;

	public ModelPluto() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 5.9167F, -7.8333F);
		head.setTextureOffset(36, 0).addBox(-4.0F, -1.9167F, -6.1667F, 8.0F, 4.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(36, 6).addBox(-3.0F, 2.0833F, -4.1667F, 6.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 21).addBox(-4.0F, -7.9167F, -4.1667F, 8.0F, 10.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 12).addBox(-1.0F, -2.9167F, -7.1667F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(20, 35).addBox(-5.0F, -4.9167F, -1.1667F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(16, 35).addBox(4.0F, -4.9167F, -1.1667F, 1.0F, 11.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 4.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-5.0F, 1.0F, -8.0F, 10.0F, 5.0F, 16.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.0F, 9.0F, 6.0F);
		left_leg.setTextureOffset(0, 0).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.0F, 9.0F, 6.0F);
		right_leg.setTextureOffset(36, 35).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

		front_right = new ModelRenderer(this);
		front_right.setRotationPoint(-3.0F, 9.0F, -6.0F);
		front_right.setTextureOffset(0, 35).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);

		front_left = new ModelRenderer(this);
		front_left.setRotationPoint(3.0F, 9.0F, -6.0F);
		front_left.setTextureOffset(24, 21).addBox(-2.0F, 1.0F, -2.0F, 4.0F, 14.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		front_right.render(matrixStack, buffer, packedLight, packedOverlay);
		front_left.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.front_left.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.front_right.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}