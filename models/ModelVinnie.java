// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelVinnie extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer bone3;
	private final ModelRenderer left_leg_r1;
	private final ModelRenderer bone6;
	private final ModelRenderer left_leg_r2;
	private final ModelRenderer right_arm;
	private final ModelRenderer bone4;
	private final ModelRenderer left_leg_r3;
	private final ModelRenderer bone5;
	private final ModelRenderer left_leg_r4;
	private final ModelRenderer left_leg;
	private final ModelRenderer bone;
	private final ModelRenderer right_leg;
	private final ModelRenderer bone2;

	public ModelVinnie() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -15.3333F, 0.5F);
		head.setTextureOffset(24, 11).addBox(-3.5F, -3.6667F, -3.0F, 7.0F, 3.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(24, 0).addBox(-3.5F, -10.6667F, -3.0F, 7.0F, 5.0F, 6.0F, 0.0F, false);
		head.setTextureOffset(0, 17).addBox(-4.5F, -5.6667F, -3.0F, 9.0F, 2.0F, 6.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.setTextureOffset(18, 25).addBox(-3.0F, -14.0F, -1.0F, 6.0F, 8.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(0, 0).addBox(-3.5F, -15.5F, -2.0F, 7.0F, 12.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 17).addBox(-1.0F, -14.9F, -2.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(30, 20).addBox(0.7F, -15.4F, -2.5F, 3.0F, 3.0F, 1.0F, 0.0F, true);
		body.setTextureOffset(30, 20).addBox(-3.7F, -15.4F, -2.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(32, 32).addBox(-3.0F, -3.5F, -1.4F, 6.0F, 4.0F, 4.0F, 0.0F, false);
		body.setTextureOffset(44, 0).addBox(-1.5F, -14.0F, -2.05F, 3.0F, 3.0F, 3.0F, -1.0F, false);
		body.setTextureOffset(44, 0).addBox(-1.5F, -11.0F, -2.05F, 3.0F, 3.0F, 3.0F, -1.0F, false);
		body.setTextureOffset(44, 0).addBox(-1.5F, -12.5F, -2.05F, 3.0F, 3.0F, 3.0F, -1.0F, false);
		body.setTextureOffset(38, 40).addBox(-2.5F, -3.0F, -1.0F, 5.0F, 3.0F, 3.0F, 0.0F, false);
		body.setTextureOffset(19, 0).addBox(-1.0F, -17.0F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		body.setTextureOffset(52, 37).addBox(-1.0F, -6.0F, -0.5F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(2.5F, -13.5F, 0.09F);
		setRotationAngle(left_arm, 3.1416F, 0.0F, 2.7489F);
		left_arm.setTextureOffset(16, 45).addBox(-2.0412F, -0.1934F, -1.5F, 2.0F, 11.0F, 2.0F, 0.0F, true);
		left_arm.setTextureOffset(14, 36).addBox(-3.0412F, -1.3934F, -2.5F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.6585F, 23.7843F, 3.6503F);
		left_arm.addChild(bone3);
		setRotationAngle(bone3, 0.2618F, 0.0F, 0.0F);

		left_leg_r1 = new ModelRenderer(this);
		left_leg_r1.setRotationPoint(2.0F, -13.0F, 0.0F);
		bone3.addChild(left_leg_r1);
		setRotationAngle(left_leg_r1, 0.6981F, 0.0F, 0.0F);
		left_leg_r1.setTextureOffset(50, 15).addBox(-1.3827F, -1.7381F, -0.7214F, 2.0F, 10.0F, 2.0F, 0.0F, true);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(2.0F, -13.0F, 0.0F);
		bone3.addChild(bone6);

		left_leg_r2 = new ModelRenderer(this);
		left_leg_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(left_leg_r2);
		setRotationAngle(left_leg_r2, 0.6981F, 0.0F, 0.0F);
		left_leg_r2.setTextureOffset(47, 8).addBox(-1.8827F, 8.2619F, -1.1214F, 3.0F, 4.0F, 3.0F, 0.0F, true);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-2.5F, -13.5F, 0.09F);
		setRotationAngle(right_arm, 3.1416F, 0.0F, -2.7489F);
		right_arm.setTextureOffset(16, 45).addBox(0.0412F, -0.1934F, -1.5F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(14, 36).addBox(-0.9588F, -1.3934F, -2.5F, 4.0F, 5.0F, 4.0F, 0.0F, true);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(2.6585F, 23.7843F, 3.6503F);
		right_arm.addChild(bone4);
		setRotationAngle(bone4, 0.2618F, 0.0F, 0.0F);

		left_leg_r3 = new ModelRenderer(this);
		left_leg_r3.setRotationPoint(-2.0F, -13.0F, 0.0F);
		bone4.addChild(left_leg_r3);
		setRotationAngle(left_leg_r3, 0.6981F, 0.0F, 0.0F);
		left_leg_r3.setTextureOffset(50, 15).addBox(-0.6173F, -1.7381F, -0.7214F, 2.0F, 10.0F, 2.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-2.0F, -13.0F, 0.0F);
		bone4.addChild(bone5);

		left_leg_r4 = new ModelRenderer(this);
		left_leg_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(left_leg_r4);
		setRotationAngle(left_leg_r4, 0.6981F, 0.0F, 0.0F);
		left_leg_r4.setTextureOffset(47, 8).addBox(-1.1173F, 8.2619F, -1.1214F, 3.0F, 4.0F, 3.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(0.9F, -0.3377F, 0.795F);
		setRotationAngle(left_leg, -0.0418F, -0.0283F, -0.1278F);
		left_leg.setTextureOffset(46, 46).addBox(-0.5F, -0.425F, -1.2227F, 2.0F, 11.0F, 2.0F, 0.0F, false);
		left_leg.setTextureOffset(0, 25).addBox(-1.4363F, -0.9204F, -2.7453F, 4.0F, 8.0F, 5.0F, -0.5F, true);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.6274F, 24.0575F, 2.5776F);
		left_leg.addChild(bone);
		setRotationAngle(bone, 0.2618F, 0.0F, 0.0F);
		bone.setTextureOffset(33, 20).addBox(0.7274F, -2.0197F, -3.1683F, 3.0F, 2.0F, 6.0F, 0.0F, true);
		bone.setTextureOffset(0, 0).addBox(1.6765F, -2.6322F, -3.7535F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bone.setTextureOffset(0, 0).addBox(1.6765F, -3.6322F, -3.2535F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bone.setTextureOffset(30, 40).addBox(1.1274F, -14.0197F, -0.1683F, 2.0F, 14.0F, 2.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-0.9F, -0.3377F, 0.795F);
		setRotationAngle(right_leg, -0.0418F, 0.0283F, 0.1278F);
		right_leg.setTextureOffset(0, 25).addBox(-2.5637F, -0.9204F, -2.7453F, 4.0F, 8.0F, 5.0F, -0.5F, false);
		right_leg.setTextureOffset(8, 43).addBox(-1.5F, -0.425F, -1.2227F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.6274F, 24.0575F, 2.5776F);
		right_leg.addChild(bone2);
		setRotationAngle(bone2, 0.2618F, 0.0F, 0.0F);
		bone2.setTextureOffset(33, 20).addBox(-3.7274F, -2.0197F, -3.1683F, 3.0F, 2.0F, 6.0F, 0.0F, false);
		bone2.setTextureOffset(0, 0).addBox(-2.6765F, -3.6322F, -3.2535F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(0, 0).addBox(-2.6765F, -2.6322F, -3.7535F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone2.setTextureOffset(0, 38).addBox(-3.1274F, -14.0197F, -0.1683F, 2.0F, 14.0F, 2.0F, 0.0F, false);
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
	}
}