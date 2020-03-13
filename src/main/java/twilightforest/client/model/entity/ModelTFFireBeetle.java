// Date: 11/5/2012 7:35:56 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package twilightforest.client.model.entity;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.renderer.entity.model.SegmentedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;
import twilightforest.entity.EntityTFFireBeetle;

public class ModelTFFireBeetle<T extends EntityTFFireBeetle> extends SegmentedModel<T> {
	//fields
	ModelRenderer thorax;
	ModelRenderer head;
	ModelRenderer connector2;
	ModelRenderer RearEnd;
	ModelRenderer Leg6;
	ModelRenderer Leg4;
	ModelRenderer Leg2;
	ModelRenderer Leg5;
	ModelRenderer Leg3;
	ModelRenderer Leg1;
	ModelRenderer connector1;
	ModelRenderer jaw1a;
	ModelRenderer jaw1b;
	ModelRenderer jaw2a;
	ModelRenderer jaw2b;
	ModelRenderer antenna1;
	ModelRenderer antenna2;
	ModelRenderer eye1;
	ModelRenderer eye2;

	public ModelTFFireBeetle() {
		textureWidth = 64;
		textureHeight = 32;

		thorax = new ModelRenderer(this, 0, 22);
		thorax.addCuboid(-4.5F, -4F, 0F, 9, 8, 2);
		thorax.setRotationPoint(0F, 18F, -4.5F);

		connector1 = new ModelRenderer(this, 0, 12);
		connector1.addCuboid(-3F, -3F, 0F, 6, 6, 1);
		connector1.setRotationPoint(0F, 18F, -3F);

		connector2 = new ModelRenderer(this, 0, 12);
		connector2.addCuboid(-3F, -3F, -1F, 6, 6, 1);
		connector2.setRotationPoint(0F, 18F, -4F);

		RearEnd = new ModelRenderer(this, 22, 9);
		RearEnd.addCuboid(-6F, -9F, -4F, 12, 14, 9);
		RearEnd.setRotationPoint(0F, 18F, 7F);
		setRotation(RearEnd, 1.570796F, 0F, 0F);

		Leg6 = new ModelRenderer(this, 40, 0);
		Leg6.addCuboid(-1F, -1F, -1F, 10, 2, 2);
		Leg6.setRotationPoint(4F, 21F, -4F);
		setRotation(Leg6, 0F, 0.2792527F, 0.3490659F);

		Leg5 = new ModelRenderer(this, 40, 0);
		Leg5.mirror = true;
		Leg5.addCuboid(-9F, -1F, -1F, 10, 2, 2);
		Leg5.setRotationPoint(-4F, 21F, -4F);
		setRotation(Leg5, 0F, -0.2792527F, -0.3490659F);

		Leg4 = new ModelRenderer(this, 40, 0);
		Leg4.addCuboid(-1F, -1F, -1F, 10, 2, 2);
		Leg4.setRotationPoint(4F, 21F, -1F);
		setRotation(Leg4, 0F, -0.2792527F, 0.3490659F);

		Leg2 = new ModelRenderer(this, 40, 0);
		Leg2.addCuboid(-1F, -1F, -1F, 10, 2, 2);
		Leg2.setRotationPoint(4F, 21F, 4F);
		setRotation(Leg2, 0F, -0.6981317F, 0.3490659F);

		Leg3 = new ModelRenderer(this, 40, 0);
		Leg3.mirror = true;
		Leg3.addCuboid(-9F, -1F, -1F, 10, 2, 2);
		Leg3.setRotationPoint(-4F, 21F, -1F);
		setRotation(Leg3, 0F, 0.2792527F, -0.3490659F);

		Leg1 = new ModelRenderer(this, 40, 0);
		Leg1.mirror = true;
		Leg1.addCuboid(-9F, -1F, -1F, 10, 2, 2);
		Leg1.setRotationPoint(-4F, 21F, 4F);
		Leg1.setTextureSize(64, 32);
		setRotation(Leg1, 0F, 0.6981317F, -0.3490659F);

		head = new ModelRenderer(this, 0, 0);
		head.addCuboid(-4F, -4F, -6F, 8, 6, 6);
		head.setRotationPoint(0F, 19F, -5F);

		jaw1a = new ModelRenderer(this, 0, 0);
		jaw1a.addCuboid(0F, 0F, -2F, 1, 1, 2);
		jaw1a.setRotationPoint(-3F, 0F, -6F);
		setRotation(jaw1a, 0.3490659F, 0F, 0F);

		jaw1b = new ModelRenderer(this, 0, 0);
		jaw1b.addCuboid(0F, 0F, 0F, 1, 1, 2);
		jaw1b.setRotationPoint(0F, 0F, -2F);
		setRotation(jaw1b, 0F, 1.570796F, 0F);

		jaw2a = new ModelRenderer(this, 0, 0);
		jaw2a.addCuboid(-1F, 0F, -2F, 1, 1, 2);
		jaw2a.setRotationPoint(3F, 0F, -6F);
		setRotation(jaw2a, 0.3490659F, 0F, 0F);

		jaw2b = new ModelRenderer(this, 0, 0);
		jaw2b.addCuboid(0F, 0F, -2F, 1, 1, 2);
		jaw2b.setRotationPoint(0F, 0F, -2F);
		setRotation(jaw2b, 0F, 1.570796F, 0F);

		antenna1 = new ModelRenderer(this, 42, 4);
		antenna1.addCuboid(0F, -0.5F, -0.5F, 10, 1, 1);
		antenna1.setRotationPoint(1F, -3F, -5F);
		setRotation(antenna1, 0F, 1.047198F, -0.296706F);

		antenna2 = new ModelRenderer(this, 42, 4);
		antenna2.addCuboid(0F, -0.5F, -0.5F, 10, 1, 1);
		antenna2.setRotationPoint(-1F, -3F, -5F);
		setRotation(antenna2, 0F, 2.094395F, 0.296706F);

		eye1 = new ModelRenderer(this, 15, 12);
		eye1.addCuboid(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		eye1.setRotationPoint(-3F, -2F, -5F);

		eye2 = new ModelRenderer(this, 15, 12);
		eye2.addCuboid(-1.5F, -1.5F, -1.5F, 3, 3, 3);
		eye2.setRotationPoint(3F, -2F, -5F);


		head.addChild(jaw1a);
		jaw1a.addChild(jaw1b);
		head.addChild(jaw2a);
		jaw2a.addChild(jaw2b);
		head.addChild(antenna1);
		head.addChild(antenna2);
		head.addChild(eye1);
		head.addChild(eye2);

	}

//	@Override
//	public void render(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
//		super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
//		setRotationAngles(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
//	}

	@Override
	public Iterable<ModelRenderer> getParts() {
		return ImmutableList.of(
				thorax,
				head,
				connector2,
				RearEnd,
				Leg6,
				Leg4,
				Leg2,
				Leg5,
				Leg3,
				Leg1,
				connector1
		);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	/**
	 * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
	 * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
	 * "far" arms and legs can swing at most.
	 */
	@Override
	public void setAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.rotateAngleY = netHeadYaw / (180F / (float) Math.PI);
		this.head.rotateAngleX = headPitch / (180F / (float) Math.PI);

		float legZ = ((float) Math.PI / 11F);
		this.Leg1.rotateAngleZ = -legZ;
		this.Leg2.rotateAngleZ = legZ;
		this.Leg3.rotateAngleZ = -legZ * 0.74F;
		this.Leg4.rotateAngleZ = legZ * 0.74F;
		this.Leg5.rotateAngleZ = -legZ;
		this.Leg6.rotateAngleZ = legZ;

		float var9 = -0.0F;
		float var10 = 0.3926991F;
		this.Leg1.rotateAngleY = var10 * 2.0F + var9;
		this.Leg2.rotateAngleY = -var10 * 2.0F - var9;
		this.Leg3.rotateAngleY = var10 * 1.0F + var9;
		this.Leg4.rotateAngleY = -var10 * 1.0F - var9;
		this.Leg5.rotateAngleY = -var10 * 2.0F + var9;
		this.Leg6.rotateAngleY = var10 * 2.0F - var9;

		float var11 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + 0.0F) * 0.4F) * limbSwingAmount;
		float var12 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + (float) Math.PI) * 0.4F) * limbSwingAmount;
		float var14 = -(MathHelper.cos(limbSwing * 0.6662F * 2.0F + ((float) Math.PI * 3F / 2F)) * 0.4F) * limbSwingAmount;

		float var15 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + 0.0F) * 0.4F) * limbSwingAmount;
		float var16 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + (float) Math.PI) * 0.4F) * limbSwingAmount;
		float var18 = Math.abs(MathHelper.sin(limbSwing * 0.6662F + ((float) Math.PI * 3F / 2F)) * 0.4F) * limbSwingAmount;

		this.Leg1.rotateAngleY += var11;
		this.Leg2.rotateAngleY += -var11;
		this.Leg3.rotateAngleY += var12;
		this.Leg4.rotateAngleY += -var12;
		this.Leg5.rotateAngleY += var14;
		this.Leg6.rotateAngleY += -var14;

		this.Leg1.rotateAngleZ += var15;
		this.Leg2.rotateAngleZ += -var15;

		this.Leg3.rotateAngleZ += var16;
		this.Leg4.rotateAngleZ += -var16;

		this.Leg5.rotateAngleZ += var18;
		this.Leg6.rotateAngleZ += -var18;
	}
}
