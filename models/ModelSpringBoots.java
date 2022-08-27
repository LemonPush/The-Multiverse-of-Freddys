// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelSpringBoots extends EntityModel<Entity> {
	private final ModelRenderer RightBoot;
	private final ModelRenderer LeftBoot;

	public ModelSpringBoots() {
		textureWidth = 16;
		textureHeight = 16;

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(-2.0F, 12.0F, 0.0F);
		RightBoot.setTextureOffset(0, 0).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(2.0F, 12.0F, 0.0F);
		LeftBoot.setTextureOffset(0, 0).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		RightBoot.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftBoot.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}