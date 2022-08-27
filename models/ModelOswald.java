// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelOswald extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer body;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public ModelOswald() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 2.9853F, 0.2339F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.9853F, -4.2339F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(1.0F, -12.9853F, -1.2339F, 2.0F, 6.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.0F, -12.9853F, -1.2339F, 2.0F, 6.0F, 2.0F, 0.0F, true);
		head.setTextureOffset(24, 4).addBox(-2.0F, -4.9853F, -5.7339F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 16).addBox(-0.5F, -5.4853F, -6.2339F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-2.0F, -13.9853F, -0.2339F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.5672F, 0.0F, 0.0F);
		head_r1.setTextureOffset(8, 29).addBox(-1.0F, -3.6F, -1.7F, 2.0F, 5.0F, 2.0F, 0.0F, true);
		head_r1.setTextureOffset(8, 29).addBox(3.0F, -3.6F, -1.7F, 2.0F, 5.0F, 2.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 4.0F, 0.0F);
		body.setTextureOffset(0, 16).addBox(-5.0F, 4.0F, -3.0F, 10.0F, 7.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(28, 12).addBox(-3.0F, -2.0F, -2.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(24, 0).addBox(-5.0F, -1.6F, -1.0F, 10.0F, 2.0F, 2.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.5F, 13.75F, -0.75F);
		right_leg.setTextureOffset(0, 29).addBox(-1.0F, 0.25F, -0.25F, 2.0F, 7.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(25, 22).addBox(-2.0F, 7.25F, -3.75F, 4.0F, 3.0F, 7.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.5F, 13.75F, -0.75F);
		left_leg.setTextureOffset(0, 29).addBox(-1.0F, 0.25F, -0.25F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(25, 22).addBox(-2.0F, 7.25F, -3.75F, 4.0F, 3.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}