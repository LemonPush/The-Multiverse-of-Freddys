// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelBlackbird extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer body;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelBlackbird() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -0.625F, -0.75F);
		setRotationAngle(head, 0.0F, 0.0F, 0.0F);
		head.setTextureOffset(38, 34).addBox(-5.0F, -9.375F, -4.25F, 10.0F, 8.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(0, 44).addBox(-6.0F, -8.875F, -3.25F, 12.0F, 7.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(32, 52).addBox(-4.0F, -10.375F, -3.25F, 8.0F, 2.0F, 8.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -4.875F, -3.25F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.5236F, 0.0F, 0.0F);
		head_r1.setTextureOffset(40, 24).addBox(-0.5F, -1.1F, -5.0F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(0, 34).addBox(-8.0F, 14.0F, -4.0F, 16.0F, 2.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(48, 16).addBox(-7.0F, 16.0F, -4.0F, 14.0F, 1.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(46, 0).addBox(-7.0F, -2.5F, -4.0F, 14.0F, 2.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(0, 24).addBox(-8.0F, -0.5F, -4.0F, 16.0F, 2.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-9.0F, 0.5F, -5.0F, 18.0F, 14.0F, 10.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.5F, 15.0F, 0.0F);
		left_leg.setTextureOffset(0, 59).addBox(-1.5F, -3.0F, -1.5F, 3.0F, 12.0F, 3.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.5F, 15.0F, 0.0F);
		right_leg.setTextureOffset(0, 59).addBox(-1.5F, -3.0F, -1.5F, 3.0F, 12.0F, 3.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
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