// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelFetch extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer top_left;
	private final ModelRenderer top_right;
	private final ModelRenderer bottom_left;
	private final ModelRenderer bottom_right;

	public ModelFetch() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 9.0609F, -5.2843F);
		head.setTextureOffset(0, 21).addBox(-4.0F, -7.0609F, -8.7157F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 24).addBox(-1.0F, -1.5609F, -0.7157F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(33, 10).addBox(-1.0F, -3.5609F, -12.7157F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(33, 0).addBox(-4.0F, -3.0609F, -12.2157F, 8.0F, 2.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(12, 39).addBox(-4.0F, -1.0609F, -12.1157F, 8.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(16, 43).addBox(-4.0F, -11.0609F, -5.7157F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(40, 27).addBox(1.0F, -11.0609F, -5.7157F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 27).addBox(1.5F, -12.0609F, -5.2157F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(24, 27).addBox(-3.5F, -12.0609F, -5.2157F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-2.5F, -10.0609F, -4.7157F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.8727F, 0.0F, 0.0F);
		head_r1.setTextureOffset(0, 6).addBox(3.5F, -5.0F, 0.1F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		head_r1.setTextureOffset(34, 39).addBox(-1.5F, -5.0F, 0.1F, 3.0F, 4.0F, 2.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(0.0F, 0.4391F, -7.1157F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.5672F, 0.0F, 0.0F);
		head_r2.setTextureOffset(33, 6).addBox(-4.0F, -1.5F, -4.9F, 8.0F, 1.0F, 3.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(0.0F, 0.4391F, -7.2157F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, 0.5672F, 0.0F, 0.0F);
		head_r3.setTextureOffset(24, 21).addBox(-4.0F, -0.5F, -4.9F, 8.0F, 1.0F, 5.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 2.0F);
		body.setTextureOffset(0, 0).addBox(-5.0F, 7.0F, -7.0F, 10.0F, 8.0F, 13.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 11.75F, 5.0F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, 0.6981F, 0.0F, 0.0F);
		body_r1.setTextureOffset(23, 28).addBox(-2.0F, -0.9F, 0.0F, 4.0F, 2.0F, 9.0F, 0.0F, false);

		top_left = new ModelRenderer(this);
		top_left.setRotationPoint(3.5F, 13.75F, -3.25F);
		top_left.setTextureOffset(0, 0).addBox(-1.5F, 1.75F, -1.75F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		top_left.setTextureOffset(0, 0).addBox(-1.5F, 5.25F, -1.75F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		top_left.setTextureOffset(0, 21).addBox(-1.0F, 4.75F, -1.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		top_left.setTextureOffset(0, 21).addBox(-1.0F, 1.25F, -1.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		top_left.setTextureOffset(0, 37).addBox(-1.5F, 8.25F, -4.75F, 3.0F, 2.0F, 6.0F, 0.0F, false);

		top_right = new ModelRenderer(this);
		top_right.setRotationPoint(-3.5F, 13.75F, -3.25F);
		top_right.setTextureOffset(0, 0).addBox(-1.5F, 5.25F, -1.75F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		top_right.setTextureOffset(0, 21).addBox(-1.0F, 4.75F, -1.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		top_right.setTextureOffset(0, 21).addBox(-1.0F, 1.25F, -1.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		top_right.setTextureOffset(0, 0).addBox(-1.5F, 1.75F, -1.75F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		top_right.setTextureOffset(0, 37).addBox(-1.5F, 8.25F, -4.75F, 3.0F, 2.0F, 6.0F, 0.0F, false);

		bottom_left = new ModelRenderer(this);
		bottom_left.setRotationPoint(3.5F, 13.75F, 6.75F);
		bottom_left.setTextureOffset(0, 0).addBox(-1.5F, 5.25F, -1.75F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		bottom_left.setTextureOffset(0, 21).addBox(-1.0F, 4.75F, -1.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bottom_left.setTextureOffset(0, 21).addBox(-1.0F, 1.25F, -1.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bottom_left.setTextureOffset(0, 0).addBox(-1.5F, 1.75F, -1.75F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		bottom_left.setTextureOffset(0, 37).addBox(-1.5F, 8.25F, -4.75F, 3.0F, 2.0F, 6.0F, 0.0F, false);

		bottom_right = new ModelRenderer(this);
		bottom_right.setRotationPoint(-3.5F, 13.75F, 6.75F);
		bottom_right.setTextureOffset(0, 37).addBox(-1.5F, 8.25F, -4.75F, 3.0F, 2.0F, 6.0F, 0.0F, false);
		bottom_right.setTextureOffset(0, 0).addBox(-1.5F, 5.25F, -1.75F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		bottom_right.setTextureOffset(0, 21).addBox(-1.0F, 4.75F, -1.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bottom_right.setTextureOffset(0, 21).addBox(-1.0F, 1.25F, -1.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bottom_right.setTextureOffset(0, 0).addBox(-1.5F, 1.75F, -1.75F, 3.0F, 3.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		top_left.render(matrixStack, buffer, packedLight, packedOverlay);
		top_right.render(matrixStack, buffer, packedLight, packedOverlay);
		bottom_left.render(matrixStack, buffer, packedLight, packedOverlay);
		bottom_right.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.top_right.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.top_left.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.bottom_right.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.bottom_left.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}