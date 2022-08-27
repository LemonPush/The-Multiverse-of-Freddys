// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelStuffed_Suit extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer skull;
	private final ModelRenderer body;
	private final ModelRenderer body2;
	private final ModelRenderer flesh_body;
	private final ModelRenderer left_arm;
	private final ModelRenderer left_arm2;
	private final ModelRenderer flesh_left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer right_arm4;
	private final ModelRenderer flesh_right_arm;
	private final ModelRenderer left_leg;
	private final ModelRenderer left_leg2;
	private final ModelRenderer flesh_left_leg;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_leg4;
	private final ModelRenderer flesh_right_leg;

	public ModelStuffed_Suit() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(-0.7285F, -6.5295F, -0.2422F);
		setRotationAngle(head, 0.2093F, 0.0073F, -0.1389F);
		head.setTextureOffset(0, 16).addBox(-3.1899F, -9.5107F, -4.6328F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-3.1899F, -9.5107F, -4.6328F, 8.0F, 8.0F, 8.0F, -0.01F, false);
		head.setTextureOffset(49, 0).addBox(-3.1899F, -1.5107F, -6.6328F, 8.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(52, 29).addBox(-3.1899F, -2.5107F, -6.6328F, 8.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(29, 43).addBox(-3.1899F, -5.0107F, -7.4328F, 8.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(54, 4).addBox(-2.1899F, -5.5107F, -7.1328F, 6.0F, 1.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(0, 21).addBox(-0.1899F, -6.5107F, -7.1328F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(38, 48).addBox(1.5101F, -9.0107F, -4.8328F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(38, 48).addBox(-1.8899F, -9.0107F, -4.8328F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		head.setTextureOffset(0, 42).addBox(-4.1899F, -5.0107F, -4.6328F, 1.0F, 3.0F, 8.0F, 0.0F, false);
		head.setTextureOffset(14, 35).addBox(4.8101F, -5.0107F, -4.6328F, 1.0F, 3.0F, 8.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(-2.7764F, -9.746F, -5.5235F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, -0.5411F, 0.6109F);
		head_r1.setTextureOffset(0, 46).addBox(-0.8885F, -0.8737F, 3.4006F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head_r1.setTextureOffset(24, 2).addBox(2.1115F, 0.1263F, 3.4006F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(4.4692F, -9.746F, -5.5235F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.192F, -0.2618F);
		head_r2.setTextureOffset(30, 48).addBox(-0.3388F, -0.7514F, 4.2429F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		head_r2.setTextureOffset(22, 32).addBox(-1.3388F, 0.2486F, 4.2429F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(0.8101F, -9.0107F, -0.6328F);
		head.addChild(head_r3);
		setRotationAngle(head_r3, -0.0857F, -0.0166F, -0.1913F);
		head_r3.setTextureOffset(32, 18).addBox(-3.0F, -1.5F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		head_r3.setTextureOffset(57, 32).addBox(-2.0F, -4.5F, -2.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		skull = new ModelRenderer(this);
		skull.setRotationPoint(-18.1536F, 27.6504F, -5.5235F);
		head.addChild(skull);
		skull.setTextureOffset(52, 22).addBox(16.9637F, -31.4611F, 1.8907F, 4.0F, 2.0F, 5.0F, 0.25F, false);
		skull.setTextureOffset(0, 32).addBox(16.4637F, -35.9611F, 1.8907F, 5.0F, 4.0F, 6.0F, 0.25F, false);
		skull.setTextureOffset(57, 39).addBox(17.8137F, -30.9611F, 1.8407F, 2.0F, 2.0F, 1.0F, 0.25F, false);
		skull.setTextureOffset(24, 0).addBox(16.9637F, -35.0111F, 1.0407F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		skull.setTextureOffset(24, 0).addBox(20.1637F, -34.2111F, 0.3407F, 1.0F, 1.0F, 1.0F, 0.0F, true);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.0F, -3.0F);
		setRotationAngle(body, 0.3927F, 0.0F, 0.0F);
		body.setTextureOffset(24, 0).addBox(-5.0F, 7.9134F, 2.1194F, 10.0F, 3.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(27, 27).addBox(-5.0F, -4.0866F, 2.1194F, 10.0F, 11.0F, 5.0F, 0.0F, false);
		body.setTextureOffset(0, 53).addBox(-4.0F, -1.0866F, 1.2194F, 8.0F, 7.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(10, 46).addBox(-3.5F, -2.0866F, 1.2194F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(32, 25).addBox(-3.5F, 5.9134F, 1.2194F, 7.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(24, 22).addBox(-3.0F, -3.0866F, 1.2194F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(34, 59).addBox(-1.0F, -3.5866F, 0.2194F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(16, 32).addBox(1.0F, -4.0866F, 0.2194F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		body.setTextureOffset(0, 32).addBox(-3.0F, -4.0866F, 0.2194F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(-19.0F, 1.0F, 0.0F);
		body.addChild(body2);
		body2.setTextureOffset(0, 0).addBox(18.0F, 0.9134F, 3.6194F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		body2.setTextureOffset(0, 0).addBox(18.0F, -0.8866F, 3.6194F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		body2.setTextureOffset(48, 25).addBox(16.0F, -2.5866F, 4.1194F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body2.setTextureOffset(16, 48).addBox(16.0F, -1.0866F, 4.1194F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body2.setTextureOffset(10, 48).addBox(16.0F, 0.4134F, 4.1194F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body2.setTextureOffset(0, 6).addBox(20.0F, 0.4134F, 4.1194F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body2.setTextureOffset(0, 36).addBox(20.0F, -1.0866F, 4.1194F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body2.setTextureOffset(16, 36).addBox(20.0F, -2.5866F, 4.1194F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		body2.setTextureOffset(42, 8).addBox(11.0F, -4.1366F, 3.6194F, 10.0F, 2.0F, 2.0F, 0.0F, false);
		body2.setTextureOffset(42, 8).addBox(17.0F, -4.1366F, 3.6194F, 10.0F, 2.0F, 2.0F, 0.0F, false);
		body2.setTextureOffset(0, 16).addBox(18.0F, -7.5866F, 3.6194F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		body2.setTextureOffset(0, 16).addBox(18.0F, 5.4134F, 3.6194F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		flesh_body = new ModelRenderer(this);
		flesh_body.setRotationPoint(0.0F, 22.0F, 0.0F);
		body2.addChild(flesh_body);
		flesh_body.setTextureOffset(24, 18).addBox(16.5F, -19.0866F, 3.6194F, 5.0F, 2.0F, 2.0F, 0.25F, false);
		flesh_body.setTextureOffset(42, 12).addBox(17.5F, -21.0866F, 3.6194F, 3.0F, 2.0F, 2.0F, 0.25F, false);
		flesh_body.setTextureOffset(42, 12).addBox(17.5F, -24.0866F, 3.6194F, 3.0F, 2.0F, 2.0F, 0.25F, false);
		flesh_body.setTextureOffset(24, 18).addBox(16.5F, -26.7866F, 3.6194F, 5.0F, 2.0F, 2.0F, 0.25F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(5.0F, -4.8333F, 0.5F);
		left_arm.setTextureOffset(47, 44).addBox(1.0F, -2.1667F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(34, 50).addBox(1.0F, 4.8333F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		left_arm.setTextureOffset(50, 54).addBox(1.0F, 10.8333F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		left_arm2 = new ModelRenderer(this);
		left_arm2.setRotationPoint(-18.1F, 5.6833F, -0.5F);
		left_arm.addChild(left_arm2);
		left_arm2.setTextureOffset(0, 42).addBox(20.1F, 2.15F, -0.5F, 2.0F, 2.0F, 2.0F, 0.25F, false);
		left_arm2.setTextureOffset(0, 42).addBox(20.1F, 4.15F, -0.5F, 2.0F, 2.0F, 2.0F, 0.25F, false);

		flesh_left_arm = new ModelRenderer(this);
		flesh_left_arm.setRotationPoint(-0.5F, 21.15F, 0.0F);
		left_arm2.addChild(flesh_left_arm);
		flesh_left_arm.setTextureOffset(26, 58).addBox(20.6F, -28.5F, -0.5F, 2.0F, 10.0F, 2.0F, 0.2F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-5.0F, -4.8333F, 0.5F);
		right_arm.setTextureOffset(47, 44).addBox(-5.0F, -2.1667F, -2.0F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		right_arm.setTextureOffset(34, 50).addBox(-5.0F, 4.8333F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, true);
		right_arm.setTextureOffset(50, 54).addBox(-5.0F, 10.8333F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, true);

		right_arm4 = new ModelRenderer(this);
		right_arm4.setRotationPoint(18.1F, 5.6833F, -0.5F);
		right_arm.addChild(right_arm4);
		right_arm4.setTextureOffset(0, 42).addBox(-22.1F, 2.15F, -0.5F, 2.0F, 2.0F, 2.0F, 0.25F, true);
		right_arm4.setTextureOffset(0, 42).addBox(-22.1F, 4.15F, -0.5F, 2.0F, 2.0F, 2.0F, 0.25F, true);

		flesh_right_arm = new ModelRenderer(this);
		flesh_right_arm.setRotationPoint(0.5F, 21.15F, 0.0F);
		right_arm4.addChild(flesh_right_arm);
		flesh_right_arm.setTextureOffset(26, 58).addBox(-22.6F, -28.5F, -0.5F, 2.0F, 10.0F, 2.0F, 0.2F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(3.0F, 7.0F, 4.6667F);
		left_leg.setTextureOffset(50, 12).addBox(-2.0F, 9.0F, -1.6667F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(18, 48).addBox(-2.0F, 2.0F, -1.6667F, 4.0F, 6.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(24, 8).addBox(-2.5F, 15.0F, -4.6667F, 5.0F, 2.0F, 8.0F, 0.0F, false);

		left_leg2 = new ModelRenderer(this);
		left_leg2.setRotationPoint(-19.0F, 8.2917F, -4.8333F);
		left_leg.addChild(left_leg2);

		flesh_left_leg = new ModelRenderer(this);
		flesh_left_leg.setRotationPoint(-2.0F, 10.7083F, 0.1667F);
		left_leg2.addChild(flesh_left_leg);
		flesh_left_leg.setTextureOffset(18, 58).addBox(20.0F, -18.75F, 4.0F, 2.0F, 11.0F, 2.0F, 0.2F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-3.0F, 7.0F, 4.6667F);
		right_leg.setTextureOffset(50, 12).addBox(-2.0F, 9.0F, -1.6667F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		right_leg.setTextureOffset(18, 48).addBox(-2.0F, 2.0F, -1.6667F, 4.0F, 6.0F, 4.0F, 0.0F, true);
		right_leg.setTextureOffset(24, 8).addBox(-2.5F, 15.0F, -4.6667F, 5.0F, 2.0F, 8.0F, 0.0F, true);

		right_leg4 = new ModelRenderer(this);
		right_leg4.setRotationPoint(19.0F, 8.2917F, -4.8333F);
		right_leg.addChild(right_leg4);

		flesh_right_leg = new ModelRenderer(this);
		flesh_right_leg.setRotationPoint(2.0F, 10.7083F, 0.1667F);
		right_leg4.addChild(flesh_right_leg);
		flesh_right_leg.setTextureOffset(18, 58).addBox(-22.0F, -18.75F, 4.0F, 2.0F, 11.0F, 2.0F, 0.2F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}