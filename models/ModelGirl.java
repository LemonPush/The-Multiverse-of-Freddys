// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelGirl extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelGirl() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 8.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(0, 16).addBox(-4.0F, 8.0F, -2.0F, 8.0F, 8.0F, 4.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.0F, 9.0F, 0.0F);
		left_arm.setTextureOffset(24, 16).addBox(0.0F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.0F, 9.0F, 0.0F);
		right_arm.setTextureOffset(0, 28).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.0F, 16.0F, 0.0F);
		left_leg.setTextureOffset(16, 28).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.0F, 16.0F, 0.0F);
		right_leg.setTextureOffset(32, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}