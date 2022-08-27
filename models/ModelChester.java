// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelChester extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_arm;

	public ModelChester() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(0, 12).addBox(-4.0F, -14.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(12, 39).addBox(-3.0F, -7.0F, -5.8F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(24, 54).addBox(-3.0F, -9.0F, -5.8F, 6.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(57, 31).addBox(-2.5F, -9.5F, -5.5F, 5.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(29, 4).addBox(-2.7F, -11.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 4).addBox(0.7F, -11.5F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 58).addBox(3.8053F, -13.6445F, -0.9887F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 58).addBox(-6.8053F, -13.6445F, -0.9887F, 3.0F, 3.0F, 2.0F, 0.0F, true);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(0.0F, -6.0F, -2.55F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.3665F, 0.0F, 0.0F);
		head_r1.setTextureOffset(46, 54).addBox(-3.0F, -1.0F, -3.25F, 6.0F, 1.0F, 2.0F, 0.0F, false);
		head_r1.setTextureOffset(29, 0).addBox(-3.0F, 0.0F, -3.25F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-5.5F, 4.0F, -3.5F, 11.0F, 5.0F, 7.0F, 0.25F, false);
		body.setTextureOffset(27, 23).addBox(-5.0F, -6.0F, -2.5F, 10.0F, 6.0F, 5.0F, 0.25F, false);
		body.setTextureOffset(0, 29).addBox(-5.0F, 0.0F, -2.5F, 10.0F, 5.0F, 5.0F, 0.5F, false);
		body.setTextureOffset(32, 14).addBox(-4.0F, -3.0F, -3.5F, 8.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(57, 29).addBox(-3.5F, -4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(57, 27).addBox(-3.5F, 4.0F, -3.5F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(46, 57).addBox(-3.0F, -5.0F, -3.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(40, 54).addBox(-4.3F, -6.2F, -3.6F, 2.0F, 12.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(40, 54).addBox(2.3F, -6.2F, -3.6F, 2.0F, 12.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(40, 54).addBox(2.3F, -6.2F, 2.6F, 2.0F, 12.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(40, 54).addBox(-4.3F, -6.2F, 2.6F, 2.0F, 12.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(28, 58).addBox(-6.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(5.0F, -5.0F, -0.8F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(58, 0).addBox(-1.0F, 5.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(48, 20).addBox(-1.0F, -7.0F, -0.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, -5.0F, 0.0F);
		left_arm.setTextureOffset(48, 44).addBox(1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		left_arm.setTextureOffset(50, 10).addBox(1.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.25F, false);
		left_arm.setTextureOffset(44, 44).addBox(2.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(28, 44).addBox(2.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(12, 54).addBox(1.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.25F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.1F, 8.0F, 0.0F);
		right_leg.setTextureOffset(48, 34).addBox(-1.9F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		right_leg.setTextureOffset(46, 0).addBox(-1.9F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		right_leg.setTextureOffset(40, 37).addBox(-0.9F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(40, 34).addBox(-0.9F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_leg.setTextureOffset(22, 34).addBox(-2.4F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.25F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.1F, 8.0F, 0.0F);
		left_leg.setTextureOffset(32, 44).addBox(-2.1F, 8.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		left_leg.setTextureOffset(16, 44).addBox(-2.1F, 1.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		left_leg.setTextureOffset(24, 17).addBox(-1.1F, 7.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(24, 14).addBox(-1.1F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(28, 4).addBox(-2.6F, 14.0F, -5.0F, 5.0F, 2.0F, 8.0F, 0.25F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, -5.0F, 0.0F);
		right_arm.setTextureOffset(0, 39).addBox(-5.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, 0.25F, false);
		right_arm.setTextureOffset(0, 49).addBox(-5.0F, 5.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.25F, false);
		right_arm.setTextureOffset(0, 15).addBox(-4.0F, 10.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 12).addBox(-4.0F, 4.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(52, 19).addBox(-5.0F, 11.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.25F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}