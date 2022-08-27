// Made with Blockbench 4.1.5
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelThe_Face extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg_r1;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_leg_r2;

	public ModelThe_Face() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 12.0F, -4.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -9.0F, -5.0F, 8.0F, 5.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 13).addBox(-3.0F, -4.0F, -5.0F, 6.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(30, 11).addBox(3.0F, -11.0F, -2.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(20, 13).addBox(-6.0F, -11.0F, -2.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 34).addBox(-1.5F, -4.5F, -7.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(26, 31).addBox(-2.0F, -1.0F, -5.0F, 4.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(4, 13).addBox(-0.5F, -5.5F, -7.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 13).addBox(-2.0F, -6.25F, -5.2F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 13).addBox(1.0F, -6.25F, -5.2F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 15.0F, -2.0F);
		setRotationAngle(body, 0.6109F, 0.0F, 0.0F);
		body.setTextureOffset(23, 19).addBox(-3.5F, 2.0F, -2.5F, 7.0F, 7.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 24).addBox(-2.5F, -4.0F, -2.0F, 5.0F, 6.0F, 4.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(1.8774F, 12.6502F, -3.0F);
		setRotationAngle(left_arm, -0.6545F, 0.0F, 0.0F);
		left_arm.setTextureOffset(18, 31).addBox(0.6169F, 0.2846F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(24, 0).addBox(-0.2831F, 9.2846F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-1.8774F, 12.6502F, -3.0F);
		setRotationAngle(right_arm, -0.6545F, 0.0F, 0.0F);
		right_arm.setTextureOffset(18, 31).addBox(-2.6169F, 0.2846F, -1.0F, 2.0F, 9.0F, 2.0F, 0.0F, true);
		right_arm.setTextureOffset(24, 0).addBox(-3.7169F, 9.2846F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-2.5F, 22.7691F, 5.5156F);
		setRotationAngle(right_leg, 0.9599F, 0.0F, 0.0F);

		left_leg_r1 = new ModelRenderer(this);
		left_leg_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		right_leg.addChild(left_leg_r1);
		setRotationAngle(left_leg_r1, 0.5672F, 0.0F, 0.0F);
		left_leg_r1.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(2.5F, 22.7691F, 5.5156F);
		setRotationAngle(left_leg, 0.9599F, 0.0F, 0.0F);

		left_leg_r2 = new ModelRenderer(this);
		left_leg_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		left_leg.addChild(left_leg_r2);
		setRotationAngle(left_leg_r2, 0.5672F, 0.0F, 0.0F);
		left_leg_r2.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.right_arm.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_arm.rotateAngleZ = MathHelper.cos(f * 0.6662F) * f1;
	}
}