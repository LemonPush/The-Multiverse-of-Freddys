// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelGoldenFreddysuit extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer Body;
	private final ModelRenderer Waist;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftBoot;
	private final ModelRenderer RightBoot;

	public ModelGoldenFreddysuit() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(40, 23).addBox(-3.0F, -3.0F, -6.0F, 6.0F, 3.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(0, 18).addBox(-0.5F, -4.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(22, 56).addBox(-2.5F, -9.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		Head.setTextureOffset(0, 56).addBox(-1.5F, -12.0F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(29, 33).addBox(1.0F, -6.0F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(29, 33).addBox(-3.0F, -6.0F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(5.5F, -9.5F, 0.0F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.0F, 0.0F, 0.7854F);
		Head_r1.setTextureOffset(26, 44).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, true);

		Head_r2 = new ModelRenderer(this);
		Head_r2.setRotationPoint(-5.5F, -9.5F, 0.0F);
		Head.addChild(Head_r2);
		setRotationAngle(Head_r2, 0.0F, 0.0F, -0.7854F);
		Head_r2.setTextureOffset(26, 44).addBox(-1.5F, -0.5F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 9.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(0, 16).addBox(-0.5F, 1.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(12, 32).addBox(-2.5F, 0.5F, -2.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(20, 16).addBox(0.5F, 0.5F, -2.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		Waist = new ModelRenderer(this);
		Waist.setRotationPoint(0.0F, 10.5F, -1.0F);
		Body.addChild(Waist);
		Waist.setTextureOffset(24, 0).addBox(-4.0F, -1.5F, -1.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(24, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(0, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(16, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(32, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftBoot.setTextureOffset(40, 15).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightBoot.setTextureOffset(32, 7).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}