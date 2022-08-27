// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelDJMM extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body;
	private final ModelRenderer body_r3;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg_r1;
	private final ModelRenderer left_leg2;
	private final ModelRenderer right_leg_r2;
	private final ModelRenderer left_leg3;
	private final ModelRenderer right_leg_r3;
	private final ModelRenderer right_leg;
	private final ModelRenderer right_leg_r4;
	private final ModelRenderer right_leg2;
	private final ModelRenderer right_leg_r5;
	private final ModelRenderer right_leg3;
	private final ModelRenderer right_leg_r6;

	public ModelDJMM() {
		textureWidth = 256;
		textureHeight = 256;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -32.6036F, -30.6F);
		head.setTextureOffset(92, 0).addBox(-13.5F, -6.3964F, -17.9F, 27.0F, 12.0F, 18.0F, 0.0F, false);
		head.setTextureOffset(120, 102).addBox(-10.5F, -17.3964F, -17.9F, 21.0F, 11.0F, 18.0F, 0.0F, false);
		head.setTextureOffset(170, 158).addBox(10.5F, -16.3964F, -14.9F, 4.0F, 10.0F, 11.0F, 0.0F, false);
		head.setTextureOffset(80, 183).addBox(14.5F, -15.3964F, -13.9F, 2.0F, 8.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(82, 91).addBox(-1.5F, -11.3964F, -20.9F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(92, 12).addBox(-1.5F, -13.3964F, -19.9F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(20, 87).addBox(-1.5F, -9.3964F, -21.9F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(18, 0).addBox(-3.5F, -7.3964F, -21.9F, 7.0F, 2.0F, 4.0F, 0.0F, false);
		head.setTextureOffset(24, 15).addBox(1.5F, -14.3964F, -18.3F, 7.0F, 7.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(24, 6).addBox(-8.5F, -14.3964F, -18.3F, 7.0F, 7.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(24, 24).addBox(1.5F, -16.3964F, -18.3F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(92, 6).addBox(9.4F, -6.2964F, -18.2F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(92, 6).addBox(-13.4F, -6.2964F, -18.2F, 4.0F, 4.0F, 2.0F, 0.0F, true);
		head.setTextureOffset(0, 91).addBox(-8.5F, -16.3964F, -18.3F, 7.0F, 2.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(0, 31).addBox(-7.5F, -5.3964F, -18.3F, 15.0F, 9.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(24, 99).addBox(7.5F, -5.3964F, -18.3F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(34, 28).addBox(-9.5F, -5.3964F, -18.3F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		head.setTextureOffset(168, 131).addBox(-14.5F, -16.3964F, -14.9F, 4.0F, 10.0F, 11.0F, 0.0F, false);
		head.setTextureOffset(89, 120).addBox(-16.5F, -15.3964F, -13.9F, 2.0F, 8.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(92, 30).addBox(-10.0F, -25.7964F, -10.9F, 20.0F, 3.0F, 3.0F, 0.0F, false);
		head.setTextureOffset(182, 48).addBox(-4.0F, -18.3964F, -13.9F, 8.0F, 1.0F, 9.0F, 0.0F, false);
		head.setTextureOffset(84, 102).addBox(-3.0F, -21.8964F, -12.9F, 6.0F, 5.0F, 7.0F, 0.0F, false);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(-12.0F, -15.3964F, -9.4F);
		head.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, 0.0F, 0.3491F);
		body_r1.setTextureOffset(24, 60).addBox(-1.7F, -10.4F, -1.5F, 3.0F, 10.0F, 3.0F, 0.0F, false);

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(12.0F, -15.3964F, -9.4F);
		head.addChild(body_r2);
		setRotationAngle(body_r2, 0.0F, 0.0F, -0.3491F);
		body_r2.setTextureOffset(24, 73).addBox(-1.3F, -10.4F, -1.5F, 3.0F, 10.0F, 3.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 8.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-12.5F, -37.0F, -20.5F, 25.0F, 18.0F, 42.0F, 0.0F, false);
		body.setTextureOffset(0, 149).addBox(-8.5F, -32.0F, 21.5F, 17.0F, 11.0F, 8.0F, 0.0F, false);
		body.setTextureOffset(82, 63).addBox(-11.5F, -19.0F, -17.5F, 23.0F, 3.0F, 36.0F, 0.0F, false);
		body.setTextureOffset(0, 60).addBox(-11.5F, -40.0F, -17.5F, 23.0F, 3.0F, 36.0F, 0.0F, false);
		body.setTextureOffset(78, 102).addBox(12.5F, -35.0F, -17.5F, 3.0F, 14.0F, 36.0F, 0.0F, false);
		body.setTextureOffset(0, 99).addBox(-15.5F, -35.0F, -17.5F, 3.0F, 14.0F, 36.0F, 0.0F, false);

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(0.0F, -36.0F, -18.5F);
		body.addChild(body_r3);
		setRotationAngle(body_r3, -0.5672F, 0.0F, 0.0F);
		body_r3.setTextureOffset(138, 134).addBox(-3.0F, -1.3F, -16.6F, 6.0F, 6.0F, 18.0F, 0.0F, false);

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(14.1101F, -19.8731F, -11.6068F);
		setRotationAngle(left_leg, 0.0F, 0.5672F, 0.0F);
		left_leg.setTextureOffset(24, 168).addBox(15.9587F, 6.2193F, -2.1993F, 6.0F, 25.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(134, 30).addBox(11.9587F, 30.8731F, -6.1993F, 14.0F, 13.0F, 14.0F, 0.0F, false);
		left_leg.setTextureOffset(198, 118).addBox(25.9587F, 39.8731F, -6.1993F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(200, 20).addBox(16.9587F, 39.8731F, -12.1993F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		left_leg.setTextureOffset(124, 197).addBox(25.9587F, 39.8731F, 3.8007F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(98, 197).addBox(25.9587F, 39.8731F, -1.1993F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		left_leg.setTextureOffset(180, 102).addBox(14.9587F, 2.2193F, -3.1993F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		right_leg_r1 = new ModelRenderer(this);
		right_leg_r1.setRotationPoint(24.496F, 17.7193F, -0.0427F);
		left_leg.addChild(right_leg_r1);
		setRotationAngle(right_leg_r1, 0.0F, 0.0F, -1.1781F);
		right_leg_r1.setTextureOffset(0, 168).addBox(4.1944F, -32.6964F, -2.1566F, 6.0F, 22.0F, 6.0F, 0.0F, false);

		left_leg2 = new ModelRenderer(this);
		left_leg2.setRotationPoint(14.1101F, -19.8731F, 1.6068F);
		left_leg2.setTextureOffset(122, 158).addBox(16.496F, 6.2193F, -3.9573F, 6.0F, 25.0F, 6.0F, 0.0F, false);
		left_leg2.setTextureOffset(134, 30).addBox(12.496F, 30.8731F, -7.9573F, 14.0F, 13.0F, 14.0F, 0.0F, false);
		left_leg2.setTextureOffset(194, 179).addBox(26.496F, 39.8731F, 2.0427F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		left_leg2.setTextureOffset(20, 199).addBox(17.496F, 39.8731F, -13.9573F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		left_leg2.setTextureOffset(192, 12).addBox(26.496F, 39.8731F, -7.9573F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		left_leg2.setTextureOffset(190, 38).addBox(26.496F, 39.8731F, -2.9573F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		left_leg2.setTextureOffset(48, 180).addBox(15.496F, 2.2193F, -4.9573F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		right_leg_r2 = new ModelRenderer(this);
		right_leg_r2.setRotationPoint(33.0928F, 17.7193F, 12.537F);
		left_leg2.addChild(right_leg_r2);
		setRotationAngle(right_leg_r2, 0.0F, 0.0F, -1.1781F);
		right_leg_r2.setTextureOffset(98, 152).addBox(1.1101F, -39.1424F, -16.4943F, 6.0F, 21.0F, 6.0F, 0.0F, false);

		left_leg3 = new ModelRenderer(this);
		left_leg3.setRotationPoint(14.1101F, -19.8731F, 12.6068F);
		setRotationAngle(left_leg3, 0.0F, -0.5672F, 0.0F);
		left_leg3.setTextureOffset(164, 57).addBox(15.9587F, 6.2193F, -3.8007F, 6.0F, 25.0F, 6.0F, 0.0F, false);
		left_leg3.setTextureOffset(134, 30).addBox(11.9587F, 30.8731F, -7.8007F, 14.0F, 13.0F, 14.0F, 0.0F, false);
		left_leg3.setTextureOffset(44, 196).addBox(25.9587F, 39.8731F, 2.1993F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		left_leg3.setTextureOffset(144, 199).addBox(16.9587F, 39.8731F, -13.8007F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		left_leg3.setTextureOffset(189, 195).addBox(25.9587F, 39.8731F, -7.8007F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		left_leg3.setTextureOffset(163, 195).addBox(25.9587F, 39.8731F, -2.8007F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		left_leg3.setTextureOffset(180, 80).addBox(14.9587F, 2.2193F, -4.8007F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		right_leg_r3 = new ModelRenderer(this);
		right_leg_r3.setRotationPoint(40.615F, 17.7193F, 25.3444F);
		left_leg3.addChild(right_leg_r3);
		setRotationAngle(right_leg_r3, 0.0F, 0.0F, -1.1781F);
		right_leg_r3.setTextureOffset(146, 158).addBox(-1.9741F, -47.5884F, -29.1451F, 6.0F, 22.0F, 6.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(-14.1101F, -19.8731F, -11.6068F);
		setRotationAngle(right_leg, 0.0F, -0.5672F, 0.0F);
		right_leg.setTextureOffset(74, 152).addBox(-21.9587F, 6.2193F, -2.1993F, 6.0F, 25.0F, 6.0F, 0.0F, false);
		right_leg.setTextureOffset(42, 102).addBox(-25.9587F, 30.8731F, -6.1993F, 14.0F, 13.0F, 14.0F, 0.0F, false);
		right_leg.setTextureOffset(189, 160).addBox(-34.9587F, 39.8731F, -6.1993F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(0, 199).addBox(-20.9587F, 39.8731F, -12.1993F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		right_leg.setTextureOffset(189, 152).addBox(-34.9587F, 39.8731F, 3.8007F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(141, 189).addBox(-34.9587F, 39.8731F, -1.1993F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		right_leg.setTextureOffset(170, 179).addBox(-22.9587F, 2.2193F, -3.1993F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		right_leg_r4 = new ModelRenderer(this);
		right_leg_r4.setRotationPoint(-24.496F, 17.7193F, -0.0427F);
		right_leg.addChild(right_leg_r4);
		setRotationAngle(right_leg_r4, 0.0F, 0.0F, 1.1781F);
		right_leg_r4.setTextureOffset(50, 149).addBox(-10.1944F, -35.6964F, -2.1566F, 6.0F, 25.0F, 6.0F, 0.0F, false);

		right_leg2 = new ModelRenderer(this);
		right_leg2.setRotationPoint(-14.1101F, -19.8731F, 1.6068F);
		right_leg2.setTextureOffset(0, 99).addBox(-22.496F, 6.2193F, -3.9573F, 6.0F, 25.0F, 6.0F, 0.0F, false);
		right_leg2.setTextureOffset(42, 102).addBox(-26.496F, 30.8731F, -7.9573F, 14.0F, 13.0F, 14.0F, 0.0F, false);
		right_leg2.setTextureOffset(115, 189).addBox(-35.496F, 39.8731F, 2.0427F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		right_leg2.setTextureOffset(198, 139).addBox(-21.496F, 39.8731F, -13.9573F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		right_leg2.setTextureOffset(188, 66).addBox(-35.496F, 39.8731F, -7.9573F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		right_leg2.setTextureOffset(188, 58).addBox(-35.496F, 39.8731F, -2.9573F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		right_leg2.setTextureOffset(176, 22).addBox(-23.496F, 2.2193F, -4.9573F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		right_leg_r5 = new ModelRenderer(this);
		right_leg_r5.setRotationPoint(-33.0928F, 17.7193F, 12.537F);
		right_leg2.addChild(right_leg_r5);
		setRotationAngle(right_leg_r5, 0.0F, 0.0F, 1.1781F);
		right_leg_r5.setTextureOffset(82, 60).addBox(-7.1101F, -43.1424F, -16.4943F, 6.0F, 25.0F, 6.0F, 0.0F, false);

		right_leg3 = new ModelRenderer(this);
		right_leg3.setRotationPoint(-14.1101F, -19.8731F, 12.6068F);
		setRotationAngle(right_leg3, 0.0F, 0.5672F, 0.0F);
		right_leg3.setTextureOffset(0, 60).addBox(-21.9587F, 6.2193F, -3.8007F, 6.0F, 25.0F, 6.0F, 0.0F, false);
		right_leg3.setTextureOffset(42, 102).addBox(-25.9587F, 30.8731F, -7.8007F, 14.0F, 13.0F, 14.0F, 0.0F, false);
		right_leg3.setTextureOffset(188, 0).addBox(-34.9587F, 39.8731F, 2.1993F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		right_leg3.setTextureOffset(64, 198).addBox(-20.9587F, 39.8731F, -13.8007F, 4.0F, 4.0F, 6.0F, 0.0F, false);
		right_leg3.setTextureOffset(187, 131).addBox(-34.9587F, 39.8731F, -7.8007F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		right_leg3.setTextureOffset(93, 183).addBox(-34.9587F, 39.8731F, -2.8007F, 9.0F, 4.0F, 4.0F, 0.0F, false);
		right_leg3.setTextureOffset(164, 0).addBox(-22.9587F, 2.2193F, -4.8007F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		right_leg_r6 = new ModelRenderer(this);
		right_leg_r6.setRotationPoint(-40.615F, 17.7193F, 25.3444F);
		right_leg3.addChild(right_leg_r6);
		setRotationAngle(right_leg_r6, 0.0F, 0.0F, 1.1781F);
		right_leg_r6.setTextureOffset(0, 0).addBox(-4.0259F, -50.5884F, -29.1451F, 6.0F, 25.0F, 6.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg3.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg3.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.right_leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.left_leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.left_leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}