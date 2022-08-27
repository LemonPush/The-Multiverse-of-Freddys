// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports

public static class ModelAnamoly extends ModelBase {
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

	public ModelAnamoly() {
		textureWidth = 128;
		textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 4.4798F, -3.7608F);
		head.cubeList.add(new ModelBox(head, 46, 0, -4.0F, -9.6798F, -4.2392F, 8, 10, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 48, 25, -4.0F, -11.6798F, -4.2392F, 8, 2, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 3, 1.0F, -6.9798F, -4.4392F, 1, 1, 1, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 0, 0, 0.5F, -7.4798F, -4.3392F, 2, 2, 1, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 0, 0, -2.5F, -7.4798F, -4.3392F, 2, 2, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 3, -2.0F, -6.9798F, -4.4392F, 1, 1, 1, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, 4.0F, -8.6798F, -4.2392F, 2, 8, 8, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 0, 0, -6.0F, -8.6798F, -4.2392F, 2, 8, 8, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 34, 43, -4.0F, -17.6798F, -2.2392F, 3, 6, 3, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 34, 43, 1.0F, -17.6798F, -2.2392F, 3, 6, 3, 0.0F, true));

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(2.5F, -16.6798F, -0.7392F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.6981F, 0.0F, 0.0F);
		head_r1.cubeList.add(new ModelBox(head_r1, 0, 43, -1.5F, -7.0F, -1.1F, 3, 6, 3, 0.0F, true));
		head_r1.cubeList.add(new ModelBox(head_r1, 0, 43, -6.5F, -7.0F, -1.1F, 3, 6, 3, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -4.4798F, -0.2392F);
		head.addChild(bone);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 15.0F, 3.0F);
		setRotationAngle(body, 0.5672F, 0.0F, 0.0F);

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, -3.729F, -2.6687F);
		body.addChild(body_r1);
		setRotationAngle(body_r1, -0.3491F, 0.0F, 0.0F);
		body_r1.cubeList.add(new ModelBox(body_r1, 0, 25, 4.0F, -9.5F, -2.0F, 2, 4, 6, 0.0F, false));
		body_r1.cubeList.add(new ModelBox(body_r1, 0, 25, -6.0F, -9.5F, -2.0F, 2, 4, 6, 0.0F, false));
		body_r1.cubeList.add(new ModelBox(body_r1, 44, 57, -4.0F, -9.5F, -2.0F, 8, 17, 6, 0.0F, false));

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(4.7035F, 6.0345F, -2.1711F);
		left_arm.cubeList.add(new ModelBox(left_arm, 0, 62, 2.2965F, 11.9655F, -11.3289F, 7, 6, 7, 0.0F, true));

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(4.6017F, 6.0173F, -3.5856F);
		left_arm.addChild(body_r2);
		setRotationAngle(body_r2, -0.0252F, 0.523F, 1.5204F);
		body_r2.cubeList.add(new ModelBox(body_r2, 70, 35, -0.1973F, -3.1742F, -2.5F, 9, 5, 5, 0.0F, true));

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(4.6017F, 6.0173F, -3.5856F);
		left_arm.addChild(body_r3);
		setRotationAngle(body_r3, -0.2393F, 0.4703F, 1.0769F);
		body_r3.cubeList.add(new ModelBox(body_r3, 70, 35, -8.7332F, -3.5237F, -2.5F, 9, 5, 5, 0.0F, true));

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(-4.7035F, 6.0345F, -2.1711F);
		right_arm.cubeList.add(new ModelBox(right_arm, 0, 62, -9.2965F, 11.9655F, -11.3289F, 7, 6, 7, 0.0F, false));

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(-4.6017F, 6.0173F, -3.5856F);
		right_arm.addChild(body_r4);
		setRotationAngle(body_r4, -0.0252F, -0.523F, -1.5204F);
		body_r4.cubeList.add(new ModelBox(body_r4, 70, 35, -8.8027F, -3.1742F, -2.5F, 9, 5, 5, 0.0F, false));

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(-4.6017F, 6.0173F, -3.5856F);
		right_arm.addChild(body_r5);
		setRotationAngle(body_r5, -0.2393F, -0.4703F, -1.0769F);
		body_r5.cubeList.add(new ModelBox(body_r5, 70, 35, -0.2668F, -3.5237F, -2.5F, 9, 5, 5, 0.0F, false));

		bottom = new ModelRenderer(this);
		bottom.setRotationPoint(0.0F, 24.0F, 0.0F);
		bottom.cubeList.add(new ModelBox(bottom, 0, 25, -8.0F, -2.0F, 2.5F, 16, 2, 16, 0.0F, false));
		bottom.cubeList.add(new ModelBox(bottom, 34, 43, -6.0F, -2.0F, -9.5F, 12, 2, 12, 0.0F, false));
		bottom.cubeList.add(new ModelBox(bottom, 0, 0, -6.0F, -5.0F, -7.5F, 12, 3, 22, 0.0F, false));
		bottom.cubeList.add(new ModelBox(bottom, 0, 43, -4.5F, -8.0F, -4.5F, 9, 3, 16, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		left_arm.render(f5);
		right_arm.render(f5);
		bottom.render(f5);
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
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}