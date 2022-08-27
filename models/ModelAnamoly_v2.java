// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelAnamoly_v2 extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer bone;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer left_arm;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer right_arm;
	private final ModelRenderer body_r4;
	private final ModelRenderer body_r5;
	private final ModelRenderer bottom;
	private final ModelRenderer tentacle;
	private final ModelRenderer body_r6;
	private final ModelRenderer body_r7;
	private final ModelRenderer tentacle2;
	private final ModelRenderer body_r8;
	private final ModelRenderer body_r9;
	private final ModelRenderer tentacle3;
	private final ModelRenderer body_r10;
	private final ModelRenderer body_r11;
	private final ModelRenderer tentacle4;
	private final ModelRenderer body_r12;
	private final ModelRenderer body_r13;

	public ModelAnamoly_v2() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -4.5202F, -2.7608F);
		head.setTextureOffset(0, 73).addBox(-5.0F, -13.6798F, -5.2392F, 10.0F, 11.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(80, 15).addBox(-5.0F, -15.6798F, -5.2392F, 10.0F, 2.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(1.0F, -12.4798F, -5.3392F, 2.0F, 2.0F, 1.0F, 0.0F, true);
		head.setTextureOffset(0, 0).addBox(-3.0F, -12.4798F, -5.3392F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(5.0F, -12.6798F, -5.2392F, 2.0F, 9.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-7.0F, -12.6798F, -5.2392F, 2.0F, 9.0F, 8.0F, 0.0F, true);
		head.setTextureOffset(0, 37).addBox(-5.0F, -21.6798F, -3.2392F, 4.0F, 6.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 37).addBox(1.0F, -21.6798F, -3.2392F, 4.0F, 6.0F, 3.0F, 0.0F, true);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(2.5F, -20.6798F, -1.7392F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.6981F, 0.0F, 0.0F);
		head_r1.setTextureOffset(0, 28).addBox(-1.5F, -7.0F, -1.1F, 4.0F, 6.0F, 3.0F, 0.0F, true);
		head_r1.setTextureOffset(0, 28).addBox(-7.5F, -7.0F, -1.1F, 4.0F, 6.0F, 3.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -5.4798F, -1.2392F);
		head.addChild(bone);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 10.0F, 3.0F);
		setRotationAngle(body, 0.5672F, 0.0F, 0.0F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, -3.729F, -2.6687F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -0.3491F, 0.0F, 0.0F);
		body_r1.setTextureOffset(91, 42).addBox(-13.0F, -15.4526F, -2.5671F, 6.0F, 5.0F, 7.0F, 0.0F, true);
		body_r1.setTextureOffset(91, 42).addBox(7.0F, -15.4526F, -2.5671F, 6.0F, 5.0F, 7.0F, 0.0F, false);
		body_r1.setTextureOffset(83, 77).addBox(-5.0F, -7.4526F, -2.5671F, 10.0F, 13.0F, 7.0F, 0.0F, false);
		body_r1.setTextureOffset(56, 0).addBox(-7.0F, -15.4526F, -2.5671F, 14.0F, 8.0F, 7.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(9.429F, -5.7163F, -3.1728F);
		left_arm.setTextureOffset(52, 66).addBox(1.571F, 21.7163F, -11.6272F, 9.0F, 8.0F, 10.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(4.8762F, 12.768F, -2.8838F);
		left_arm.addChild(body_r2);
		setRotationAngle(body_r2, -0.0138F, 0.3051F, 1.525F);
		body_r2.setTextureOffset(63, 28).addBox(-2.1973F, -4.1742F, -3.5F, 14.0F, 7.0F, 7.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(4.8762F, 12.768F, -2.8838F);
		left_arm.addChild(body_r3);
		setRotationAngle(body_r3, -0.1325F, 0.276F, 1.116F);
		body_r3.setTextureOffset(36, 84).addBox(-11.7332F, -4.5237F, -3.5F, 11.0F, 7.0F, 7.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-9.429F, -5.7163F, -3.1728F);
		right_arm.setTextureOffset(52, 66).addBox(-10.571F, 21.7163F, -11.6272F, 9.0F, 8.0F, 10.0F, 0.0F, true);

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(-4.8762F, 12.768F, -2.8838F);
		right_arm.addChild(body_r4);
		setRotationAngle(body_r4, -0.0138F, -0.3051F, -1.525F);
		body_r4.setTextureOffset(63, 28).addBox(-11.8027F, -4.1742F, -3.5F, 14.0F, 7.0F, 7.0F, 0.0F, true);

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(-4.8762F, 12.768F, -2.8838F);
		right_arm.addChild(body_r5);
		setRotationAngle(body_r5, -0.1325F, -0.276F, -1.116F);
		body_r5.setTextureOffset(36, 84).addBox(0.7332F, -4.5237F, -3.5F, 11.0F, 7.0F, 7.0F, 0.0F, true);

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(0.0F, 24.0F, 0.0F);
		bottom.setTextureOffset(0, 28).addBox(-11.0F, -4.0F, 0.5F, 22.0F, 4.0F, 19.0F, 0.0F, false);
		bottom.setTextureOffset(44, 51).addBox(-9.0F, -4.0F, -10.5F, 18.0F, 4.0F, 11.0F, 0.0F, false);
		bottom.setTextureOffset(0, 0).addBox(-8.0F, -8.0F, -7.5F, 16.0F, 4.0F, 24.0F, 0.0F, false);
		bottom.setTextureOffset(0, 51).addBox(-6.5F, -12.0F, -4.5F, 13.0F, 4.0F, 18.0F, 0.0F, false);

		tentacle = new ModelRenderer(this);
		tentacle.setRotationPoint(3.429F, 19.2837F, 12.8272F);
		setRotationAngle(tentacle, 2.9697F, 0.0302F, 0.1719F);

		body_r6 = new ModelRenderer(this);
		body_r6.setRotationPoint(4.8762F, 12.768F, -2.8838F);
		tentacle.addChild(body_r6);
		setRotationAngle(body_r6, -0.0138F, 0.3051F, 1.525F);
		body_r6.setTextureOffset(80, 66).addBox(-1.1973F, -1.1742F, -0.5F, 14.0F, 4.0F, 4.0F, 0.0F, false);

		body_r7 = new ModelRenderer(this);
		body_r7.setRotationPoint(4.8762F, 12.768F, -2.8838F);
		tentacle.addChild(body_r7);
		setRotationAngle(body_r7, -0.1325F, 0.276F, 1.116F);
		body_r7.setTextureOffset(56, 15).addBox(-11.7332F, -1.5237F, -0.5F, 11.0F, 4.0F, 4.0F, 0.0F, false);

		tentacle2 = new ModelRenderer(this);
		tentacle2.setRotationPoint(-3.429F, 19.2837F, 12.8272F);
		setRotationAngle(tentacle2, -2.7704F, 0.1313F, -0.3244F);

		body_r8 = new ModelRenderer(this);
		body_r8.setRotationPoint(-4.8762F, 12.768F, -2.8838F);
		tentacle2.addChild(body_r8);
		setRotationAngle(body_r8, -0.0138F, -0.3051F, -1.525F);
		body_r8.setTextureOffset(80, 66).addBox(-12.8027F, -1.1742F, -0.5F, 14.0F, 4.0F, 4.0F, 0.0F, true);

		body_r9 = new ModelRenderer(this);
		body_r9.setRotationPoint(-4.8762F, 12.768F, -2.8838F);
		tentacle2.addChild(body_r9);
		setRotationAngle(body_r9, -0.1325F, -0.276F, -1.116F);
		body_r9.setTextureOffset(56, 15).addBox(0.7332F, -1.5237F, -0.5F, 11.0F, 4.0F, 4.0F, 0.0F, true);

		tentacle3 = new ModelRenderer(this);
		tentacle3.setRotationPoint(0.571F, 4.2837F, 0.8272F);
		setRotationAngle(tentacle3, 2.7339F, 1.0923F, -1.0089F);

		body_r10 = new ModelRenderer(this);
		body_r10.setRotationPoint(-4.8762F, 12.768F, -2.8838F);
		tentacle3.addChild(body_r10);
		setRotationAngle(body_r10, -0.0138F, -0.3051F, -1.525F);
		body_r10.setTextureOffset(80, 66).addBox(-12.8027F, -1.1742F, -0.5F, 14.0F, 4.0F, 4.0F, 0.0F, true);

		body_r11 = new ModelRenderer(this);
		body_r11.setRotationPoint(-4.8762F, 12.768F, -2.8838F);
		tentacle3.addChild(body_r11);
		setRotationAngle(body_r11, -0.1325F, -0.276F, -1.116F);
		body_r11.setTextureOffset(56, 15).addBox(0.7332F, -1.5237F, -0.5F, 11.0F, 4.0F, 4.0F, 0.0F, true);

		tentacle4 = new ModelRenderer(this);
		tentacle4.setRotationPoint(5.9143F, 0.204F, -1.3731F);
		setRotationAngle(tentacle4, 2.9173F, -1.229F, -2.9965F);

		body_r12 = new ModelRenderer(this);
		body_r12.setRotationPoint(3.9195F, 5.0001F, -6.3562F);
		tentacle4.addChild(body_r12);
		setRotationAngle(body_r12, -0.0138F, 0.3051F, 1.525F);
		body_r12.setTextureOffset(80, 66).addBox(-1.1973F, -1.1742F, -0.5F, 14.0F, 4.0F, 4.0F, 0.0F, false);

		body_r13 = new ModelRenderer(this);
		body_r13.setRotationPoint(3.9195F, 5.0001F, -6.3562F);
		tentacle4.addChild(body_r13);
		setRotationAngle(body_r13, -0.1325F, 0.276F, 1.116F);
		body_r13.setTextureOffset(56, 15).addBox(-11.7332F, -1.5237F, -0.5F, 11.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		bottom.render(matrixStack, buffer, packedLight, packedOverlay);
		tentacle.render(matrixStack, buffer, packedLight, packedOverlay);
		tentacle2.render(matrixStack, buffer, packedLight, packedOverlay);
		tentacle3.render(matrixStack, buffer, packedLight, packedOverlay);
		tentacle4.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}