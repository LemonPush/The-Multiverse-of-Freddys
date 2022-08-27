// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelAnomalysuit extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Body;
	private final ModelRenderer Waist;
	private final ModelRenderer arms;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer body_r5;
	private final ModelRenderer body_r6;
	private final ModelRenderer body_r7;
	private final ModelRenderer body_r8;
	private final ModelRenderer body_r9;
	private final ModelRenderer body_r10;
	private final ModelRenderer body_r11;
	private final ModelRenderer body_r12;
	private final ModelRenderer body_r13;
	private final ModelRenderer body_r14;
	private final ModelRenderer body_r15;
	private final ModelRenderer body_r16;
	private final ModelRenderer body_r17;
	private final ModelRenderer body_r18;
	private final ModelRenderer body_r19;
	private final ModelRenderer body_r20;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftBoot;
	private final ModelRenderer RightBoot;

	public ModelAnomalysuit() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		Head.setTextureOffset(26, 44).addBox(-3.5F, -12.0F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);
		Head.setTextureOffset(16, 44).addBox(0.5F, -12.0F, -1.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(2.0F, -11.5F, 0.0F);
		Head.addChild(Head_r1);
		setRotationAngle(Head_r1, 0.6545F, 0.0F, 0.0F);
		Head_r1.setTextureOffset(44, 28).addBox(-1.5F, -2.8F, -0.9F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		Head_r1.setTextureOffset(0, 0).addBox(-1.0F, -3.8F, -0.9F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Head_r1.setTextureOffset(0, 3).addBox(-5.0F, -3.8F, -0.9F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Head_r1.setTextureOffset(36, 44).addBox(-5.5F, -2.8F, -0.9F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 9.0F, 4.0F, 0.0F, false);

		Waist = new ModelRenderer(this);
		Waist.setRotationPoint(0.0F, 10.5F, -1.0F);
		Body.addChild(Waist);
		Waist.setTextureOffset(24, 0).addBox(-4.0F, -1.5F, -1.0F, 8.0F, 3.0F, 4.0F, 0.0F, false);

		arms = new ModelRenderer(this);
		arms.setRotationPoint(0.0F, 0.0F, -0.7F);
		Body.addChild(arms);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(9.6557F, 13.6557F, 3.5048F);
		arms.addChild(body_r1);
		setRotationAngle(body_r1, 3.1416F, 0.0F, -2.3562F);
		body_r1.setTextureOffset(16, 54).addBox(-1.1457F, -0.2929F, 0.7808F, 2.0F, 2.0F, 10.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(7.8273F, 12.8273F, 6.654F);
		arms.addChild(body_r2);
		setRotationAngle(body_r2, 3.1416F, 0.2618F, -2.3562F);
		body_r2.setTextureOffset(0, 58).addBox(-1.906F, -1.0F, -1.3912F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(5.1524F, 10.1524F, 10.7668F);
		arms.addChild(body_r3);
		setRotationAngle(body_r3, 3.1416F, 1.0908F, -2.3562F);
		body_r3.setTextureOffset(0, 58).addBox(-0.4047F, -1.0F, -0.2366F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(2.0F, 7.0F, 5.7F);
		arms.addChild(body_r4);
		setRotationAngle(body_r4, 0.0F, 0.0F, -0.7854F);
		body_r4.setTextureOffset(0, 58).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(2.0F, 7.0F, 7.7F);
		arms.addChild(body_r5);
		setRotationAngle(body_r5, 0.0F, 1.1345F, 0.7854F);
		body_r5.setTextureOffset(0, 58).addBox(-1.3F, -1.0F, -0.5F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		body_r6 = new ModelRenderer(this);
		body_r6.setRotationPoint(-9.6557F, 13.6557F, 3.5048F);
		arms.addChild(body_r6);
		setRotationAngle(body_r6, 3.1416F, 0.0F, 2.3562F);
		body_r6.setTextureOffset(16, 54).addBox(-0.8543F, -0.2929F, 0.7808F, 2.0F, 2.0F, 10.0F, 0.0F, true);

		body_r7 = new ModelRenderer(this);
		body_r7.setRotationPoint(-7.8273F, 12.8273F, 6.654F);
		arms.addChild(body_r7);
		setRotationAngle(body_r7, 3.1416F, -0.2618F, 2.3562F);
		body_r7.setTextureOffset(0, 58).addBox(-0.094F, -1.0F, -1.3912F, 2.0F, 2.0F, 6.0F, 0.0F, true);

		body_r8 = new ModelRenderer(this);
		body_r8.setRotationPoint(-5.1524F, 10.1524F, 10.7668F);
		arms.addChild(body_r8);
		setRotationAngle(body_r8, 3.1416F, -1.0908F, 2.3562F);
		body_r8.setTextureOffset(0, 58).addBox(-1.5953F, -1.0F, -0.2366F, 2.0F, 2.0F, 6.0F, 0.0F, true);

		body_r9 = new ModelRenderer(this);
		body_r9.setRotationPoint(-2.0F, 7.0F, 5.7F);
		arms.addChild(body_r9);
		setRotationAngle(body_r9, 0.0F, 0.0F, 0.7854F);
		body_r9.setTextureOffset(0, 58).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 6.0F, 0.0F, true);

		body_r10 = new ModelRenderer(this);
		body_r10.setRotationPoint(-2.0F, 7.0F, 7.7F);
		arms.addChild(body_r10);
		setRotationAngle(body_r10, 0.0F, -1.1345F, -0.7854F);
		body_r10.setTextureOffset(0, 58).addBox(-0.7F, -1.0F, -0.5F, 2.0F, 2.0F, 6.0F, 0.0F, true);

		body_r11 = new ModelRenderer(this);
		body_r11.setRotationPoint(-9.6557F, -2.6557F, 3.5048F);
		arms.addChild(body_r11);
		setRotationAngle(body_r11, -3.1416F, 0.0F, -2.3562F);
		body_r11.setTextureOffset(16, 54).addBox(-0.8543F, -1.7071F, 0.7808F, 2.0F, 2.0F, 10.0F, 0.0F, true);

		body_r12 = new ModelRenderer(this);
		body_r12.setRotationPoint(-7.8273F, -1.8273F, 6.654F);
		arms.addChild(body_r12);
		setRotationAngle(body_r12, -3.1416F, -0.2618F, -2.3562F);
		body_r12.setTextureOffset(0, 58).addBox(-0.094F, -1.0F, -1.3912F, 2.0F, 2.0F, 6.0F, 0.0F, true);

		body_r13 = new ModelRenderer(this);
		body_r13.setRotationPoint(-5.1524F, 0.8476F, 10.7668F);
		arms.addChild(body_r13);
		setRotationAngle(body_r13, -3.1416F, -1.0908F, -2.3562F);
		body_r13.setTextureOffset(0, 58).addBox(-1.5953F, -1.0F, -0.2366F, 2.0F, 2.0F, 6.0F, 0.0F, true);

		body_r14 = new ModelRenderer(this);
		body_r14.setRotationPoint(-2.0F, 4.0F, 5.7F);
		arms.addChild(body_r14);
		setRotationAngle(body_r14, 0.0F, 0.0F, -0.7854F);
		body_r14.setTextureOffset(0, 58).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 6.0F, 0.0F, true);

		body_r15 = new ModelRenderer(this);
		body_r15.setRotationPoint(-2.0F, 4.0F, 7.7F);
		arms.addChild(body_r15);
		setRotationAngle(body_r15, 0.0F, -1.1345F, 0.7854F);
		body_r15.setTextureOffset(0, 58).addBox(-0.7F, -1.0F, -0.5F, 2.0F, 2.0F, 6.0F, 0.0F, true);

		body_r16 = new ModelRenderer(this);
		body_r16.setRotationPoint(9.6557F, -2.6557F, 3.5048F);
		arms.addChild(body_r16);
		setRotationAngle(body_r16, -3.1416F, 0.0F, 2.3562F);
		body_r16.setTextureOffset(16, 54).addBox(-1.1457F, -1.7071F, 0.7808F, 2.0F, 2.0F, 10.0F, 0.0F, false);

		body_r17 = new ModelRenderer(this);
		body_r17.setRotationPoint(7.8273F, -1.8273F, 6.654F);
		arms.addChild(body_r17);
		setRotationAngle(body_r17, -3.1416F, 0.2618F, 2.3562F);
		body_r17.setTextureOffset(0, 58).addBox(-1.906F, -1.0F, -1.3912F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		body_r18 = new ModelRenderer(this);
		body_r18.setRotationPoint(5.1524F, 0.8476F, 10.7668F);
		arms.addChild(body_r18);
		setRotationAngle(body_r18, -3.1416F, 1.0908F, 2.3562F);
		body_r18.setTextureOffset(0, 58).addBox(-0.4047F, -1.0F, -0.2366F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		body_r19 = new ModelRenderer(this);
		body_r19.setRotationPoint(2.0F, 4.0F, 7.7F);
		arms.addChild(body_r19);
		setRotationAngle(body_r19, 0.0F, 1.1345F, -0.7854F);
		body_r19.setTextureOffset(0, 58).addBox(-1.3F, -1.0F, -0.5F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		body_r20 = new ModelRenderer(this);
		body_r20.setRotationPoint(2.0F, 4.0F, 5.7F);
		arms.addChild(body_r20);
		setRotationAngle(body_r20, 0.0F, 0.0F, 0.7854F);
		body_r20.setTextureOffset(0, 58).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(24, 16).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(0, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(16, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(32, 32).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setRotationPoint(1.9F, 12.0F, 0.0F);
		LeftBoot.setTextureOffset(40, 15).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		RightBoot = new ModelRenderer(this);
		RightBoot.setRotationPoint(-1.9F, 12.0F, 0.0F);
		RightBoot.setTextureOffset(32, 7).addBox(-2.0F, 8.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftBoot.render(matrixStack, buffer, packedLight, packedOverlay);
		RightBoot.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}