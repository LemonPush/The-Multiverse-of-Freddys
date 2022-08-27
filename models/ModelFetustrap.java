// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelFetustrap extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer left_ear;
	private final ModelRenderer cube_r1;
	private final ModelRenderer right_ear;
	private final ModelRenderer mouth;
	private final ModelRenderer body;
	private final ModelRenderer left_arm_r1;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public ModelFetustrap() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 11.95F, 0.1F);
		head.setTextureOffset(0, 0).addBox(-3.0F, -5.95F, -3.1F, 6.0F, 6.0F, 6.0F, 0.0F, false);

		left_ear = new ModelRenderer(this);
		left_ear.setRotationPoint(1.5F, -5.95F, -0.1F);
		head.addChild(left_ear);
		left_ear.setTextureOffset(25, 16).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -3.0F, 0.0F);
		left_ear.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(18, 2).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(8, 26).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		right_ear = new ModelRenderer(this);
		right_ear.setRotationPoint(-1.5F, -5.95F, -0.1F);
		head.addChild(right_ear);
		right_ear.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(-11.0F, 12.05F, -0.1F);
		head.addChild(mouth);
		mouth.setTextureOffset(24, 8).addBox(9.75F, -14.0F, -4.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		mouth.setTextureOffset(24, 0).addBox(9.0F, -15.0F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		mouth.setTextureOffset(24, 2).addBox(9.0F, -13.0F, -4.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(2.0F, 6.0F, 0.5F);
		body.setTextureOffset(0, 12).addBox(-4.0F, 6.0F, -1.5F, 4.0F, 6.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(10, 12).addBox(-2.25F, 6.5F, -1.51F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(18, 0).addBox(-2.5F, 11.0F, 0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 24).addBox(-6.0F, 8.0F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(18, 22).addBox(-6.0F, 6.0F, -1.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		left_arm_r1 = new ModelRenderer(this);
		left_arm_r1.setRotationPoint(-5.0F, 13.0F, -6.25F);
		body.addChild(left_arm_r1);
		setRotationAngle(left_arm_r1, -1.5708F, 0.0F, 0.0F);
		left_arm_r1.setTextureOffset(12, 14).addBox(-0.5F, -2.0F, -7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_arm_r1.setTextureOffset(18, 0).addBox(-1.0F, -3.5F, -6.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		left_arm_r1.setTextureOffset(12, 12).addBox(-1.0F, -2.5F, -6.0F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(2.0F, 13.0F, 0.0F);
		left_arm.setTextureOffset(10, 18).addBox(0.0F, -1.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(1.0F, 18.0F, -0.1667F);
		left_leg.setTextureOffset(22, 10).addBox(-1.0F, 0.0F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 20).addBox(-1.0F, 5.0F, -1.8333F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		left_leg.setTextureOffset(24, 5).addBox(-1.0F, 4.0F, -0.8333F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 4).addBox(-0.5F, 4.0F, -0.3333F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 4).addBox(-0.5F, 4.99F, -0.3333F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		left_leg.setTextureOffset(18, 18).addBox(-1.0F, 4.99F, -1.8333F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-1.0F, 18.0F, -0.1667F);
		right_leg.setTextureOffset(22, 10).addBox(-1.0F, 0.0F, -0.8333F, 2.0F, 4.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 20).addBox(-1.0F, 5.0F, -1.8333F, 2.0F, 1.0F, 3.0F, 0.0F, true);
		right_leg.setTextureOffset(24, 5).addBox(-1.0F, 4.0F, -0.8333F, 2.0F, 1.0F, 2.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 4).addBox(-0.5F, 4.0F, -0.3333F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_leg.setTextureOffset(0, 4).addBox(-0.5F, 4.99F, -0.3333F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		right_leg.setTextureOffset(18, 18).addBox(-1.0F, 4.99F, -1.8333F, 2.0F, 1.0F, 3.0F, 0.0F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
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
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}