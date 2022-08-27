// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelWooden_Puppets extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelWooden_Puppets() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 8.0F, 0.0F);
		head.setTextureOffset(64, 0).addBox(-1.5F, -12.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(24, 0).addBox(-2.0F, -9.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(24, 8).addBox(-16.0F, -8.0F, 6.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(36, 0).addBox(-9.0F, -10.0F, 9.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-7.0F, -8.0F, 9.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-19.0F, -8.0F, 9.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(32, 24).addBox(-19.0F, -10.0F, 9.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(8.0F, -8.0F, 6.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(20, 40).addBox(-4.0F, 8.0F, -2.0F, 8.0F, 8.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 32).addBox(-16.0F, 8.0F, 8.0F, 8.0F, 8.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(28, 28).addBox(8.0F, 8.0F, 8.0F, 8.0F, 8.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(30, 5).addBox(9.5F, 8.5F, 7.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(24, 5).addBox(12.5F, 8.5F, 7.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(20, 32).addBox(11.0F, 9.0F, 7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.0F, 9.0F, 0.0F);
		left_arm.setTextureOffset(0, 60).addBox(0.0F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(52, 20).addBox(-12.0F, -1.0F, 8.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(0, 44).addBox(12.0F, -1.0F, 8.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.0F, 9.0F, 0.0F);
		right_arm.setTextureOffset(60, 8).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(28, 52).addBox(-16.0F, -1.0F, 8.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		right_arm.setTextureOffset(44, 40).addBox(8.0F, -1.0F, 8.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.0F, 16.0F, 0.0F);
		left_leg.setTextureOffset(60, 44).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(44, 52).addBox(-14.0F, 0.0F, 8.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(48, 0).addBox(10.0F, 0.0F, 8.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.0F, 16.0F, 7.0F);
		right_leg.setTextureOffset(56, 60).addBox(-2.0F, 0.0F, -9.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(56, 32).addBox(-14.0F, 0.0F, 1.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(12, 52).addBox(10.0F, 0.0F, 1.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
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
}