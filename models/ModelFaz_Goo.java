// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelFaz_Goo extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rib;
	private final ModelRenderer rib2;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer bottom;

	public ModelFaz_Goo() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 34).addBox(-4.0F, 2.8F, -4.0F, 8.0F, 8.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(20, 26).addBox(-2.5F, 7.8F, -4.1F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(20, 26).addBox(-2.5F, 9.8F, -4.1F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(44, 0).addBox(-3.8F, 3.0F, -0.2F, 5.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(20, 45).addBox(1.0F, 2.8F, 0.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(36, 21).addBox(-4.0F, 6.8F, 0.0F, 8.0F, 4.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 15.0F, 3.0F);
		setRotationAngle(body, 0.5672F, 0.0F, 0.0F);
		body.setTextureOffset(36, 11).addBox(-4.0F, -4.4819F, -2.9671F, 8.0F, 6.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(20, 0).addBox(-1.0F, 1.5181F, -1.9671F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		rib = new ModelRenderer(this);
		rib.setRotationPoint(-3.5F, 0.0181F, -1.8671F);
		body.addChild(rib);
		setRotationAngle(rib, 0.0F, -0.5236F, 0.0F);
		rib.setTextureOffset(20, 34).addBox(-0.5F, 0.4819F, -3.1329F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		rib.setTextureOffset(6, 30).addBox(-0.5F, -1.0181F, -3.1329F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		rib.setTextureOffset(0, 30).addBox(-0.5F, -2.5181F, -3.1329F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		rib2 = new ModelRenderer(this);
		rib2.setRotationPoint(3.5F, 0.0181F, -1.8671F);
		body.addChild(rib2);
		setRotationAngle(rib2, 0.0F, 0.5236F, 0.0F);
		rib2.setTextureOffset(10, 28).addBox(-0.5F, 0.4819F, -3.1329F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		rib2.setTextureOffset(6, 27).addBox(-0.5F, -1.0181F, -3.1329F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		rib2.setTextureOffset(0, 27).addBox(-0.5F, -2.5181F, -3.1329F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(3.0F, 11.0F, 0.0F);
		setRotationAngle(left_arm, -1.309F, 0.0F, 0.0F);
		left_arm.setTextureOffset(0, 17).addBox(1.0F, -2.0518F, -0.2613F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(20, 17).addBox(2.0F, 3.1482F, 0.7387F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-3.0F, 11.0F, 0.0F);
		setRotationAngle(right_arm, -1.309F, 0.0F, 0.0F);
		right_arm.setTextureOffset(0, 0).addBox(-5.0F, -1.5341F, -0.2613F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(0.0F, 24.0F, 0.0F);
		bottom.setTextureOffset(20, 0).addBox(-4.0F, -3.0F, 4.5F, 8.0F, 3.0F, 8.0F, 0.0F, false);
		bottom.setTextureOffset(20, 17).addBox(4.0F, -2.0F, 2.5F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		bottom.setTextureOffset(0, 0).addBox(6.0F, -1.0F, 0.5F, 2.0F, 1.0F, 16.0F, 0.0F, false);
		bottom.setTextureOffset(0, 17).addBox(-8.0F, -1.0F, 0.5F, 2.0F, 1.0F, 16.0F, 0.0F, false);
		bottom.setTextureOffset(24, 31).addBox(-6.0F, -2.0F, 2.5F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		bottom.setTextureOffset(40, 31).addBox(-6.0F, -1.0F, 14.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		bottom.setTextureOffset(20, 11).addBox(-4.0F, -2.0F, 12.5F, 8.0F, 2.0F, 2.0F, 0.0F, false);
		bottom.setTextureOffset(40, 34).addBox(-6.0F, -1.0F, 0.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		bottom.setTextureOffset(40, 37).addBox(-4.0F, -2.0F, 2.5F, 8.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bottom.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_arm.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_arm.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
	}
}