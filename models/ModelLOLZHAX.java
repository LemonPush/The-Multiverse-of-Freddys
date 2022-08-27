// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelLOLZHAX extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelLOLZHAX() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-6.0F, -36.0F, -5.0F, 12.0F, 12.0F, 10.0F, 0.0F, false);
		head.setTextureOffset(0, 38).addBox(-5.0F, -35.0F, 4.0F, 10.0F, 10.0F, 4.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-1.4093F, -35.1569F, 0.5F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, -0.6109F);
		head_r1.setTextureOffset(2, 6).addBox(-0.9306F, -7.3725F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, true);
		head_r1.setTextureOffset(0, 0).addBox(-0.4306F, -5.3725F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, true);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(1.4093F, -35.1569F, 0.5F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, 0.6109F);
		head_r2.setTextureOffset(2, 6).addBox(-1.0694F, -7.3725F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		head_r2.setTextureOffset(0, 0).addBox(-0.5694F, -5.3725F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(46, 26).addBox(-4.0F, -4.5F, -2.0F, 8.0F, 6.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(34, 0).addBox(-4.0F, -14.0F, -2.0F, 8.0F, 6.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(0, 22).addBox(-6.0F, -21.0F, -3.0F, 12.0F, 10.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(52, 57).addBox(6.0F, -23.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(54, 4).addBox(-8.0F, -23.0F, -3.0F, 2.0F, 6.0F, 6.0F, 0.0F, false);
		body.setTextureOffset(64, 16).addBox(-1.5F, -10.5F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(64, 0).addBox(-1.5F, -24.5F, -1.5F, 3.0F, 6.0F, 3.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(7.5F, -19.25F, 0.0F);
		left_arm.setTextureOffset(52, 47).addBox(-0.5F, 18.25F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		left_arm.setTextureOffset(12, 52).addBox(0.5F, -1.75F, -1.5F, 3.0F, 20.0F, 3.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-7.5F, -19.25F, 0.0F);
		right_arm.setTextureOffset(52, 37).addBox(-4.5F, 18.25F, -2.5F, 5.0F, 5.0F, 5.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 52).addBox(-3.5F, -1.75F, -1.5F, 3.0F, 20.0F, 3.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.5F, 1.0F, -1.5F);
		left_leg.setTextureOffset(34, 12).addBox(-1.5F, 19.0F, -6.5F, 5.0F, 4.0F, 10.0F, 0.0F, false);
		left_leg.setTextureOffset(40, 42).addBox(-0.5F, -3.0F, 0.0F, 3.0F, 22.0F, 3.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.5F, 1.0F, -1.5F);
		right_leg.setTextureOffset(26, 28).addBox(-3.5F, 19.0F, -6.5F, 5.0F, 4.0F, 10.0F, 0.0F, false);
		right_leg.setTextureOffset(28, 42).addBox(-2.5F, -3.0F, 0.0F, 3.0F, 22.0F, 3.0F, 0.0F, false);
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

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}