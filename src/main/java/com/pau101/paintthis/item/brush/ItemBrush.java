package com.pau101.paintthis.item.brush;

import java.util.List;
import java.util.Optional;

import javax.vecmath.Point3f;

import org.apache.commons.lang3.tuple.Pair;

import com.pau101.paintthis.PaintThis;
import com.pau101.paintthis.dye.Dye;
import com.pau101.paintthis.entity.item.EntityCanvas;
import com.pau101.paintthis.util.Mth;
import com.pau101.paintthis.util.matrix.Matrix;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.translation.I18n;

public abstract class ItemBrush extends Item {
	public static final double REACH = 3;

	private static final Matrix MATRIX = new Matrix(4);

	public ItemBrush() {
		setHasSubtypes(true);
	}

	@Override
	public boolean isFull3D() {
		return true;
	}

	@Override
	public String getItemStackDisplayName(ItemStack stack) {
		String paintbrush = super.getItemStackDisplayName(stack);
		if (stack.getMetadata() > 0) {
			Dye dye = Dye.getDyeFromDamage(stack.getMetadata() - 1);
			String dyeName = I18n.translateToLocal(dye.getCompleteUnlocalizedName());
			paintbrush = I18n.translateToLocalFormatted("item.brushDyed", paintbrush, dyeName);
		}
		return paintbrush;
	}

	@Override
	public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
		return !(newStack.getItem() instanceof ItemBrush);
	}

	protected static boolean useClientPalette(ItemStack stack, EntityPlayer player, EnumHand hand) {
		EnumHand opposite = hand == EnumHand.MAIN_HAND ? EnumHand.OFF_HAND : EnumHand.MAIN_HAND;
		ItemStack other = player.getHeldItem(opposite);
		if (other != null && other.getItem() == PaintThis.palette) {
			return PaintThis.proxy.usePalette(hand, opposite);
		}
		return false;
	}

	protected static Optional<Pair<EntityCanvas, Vec3d>> findHitCanvas(EntityPlayer player) {
		List<EntityCanvas> canvases = player.worldObj.getEntitiesWithinAABB(EntityCanvas.class, player.getEntityBoundingBox().expand(REACH * 2, REACH * 2, REACH * 2));
		Optional<EntityCanvas> hitCanvas = Optional.<EntityCanvas> empty();
		Optional<Vec3d> hitVec = Optional.of(new Vec3d(-1, -1, REACH));
		Vec3d origin = player.getPositionEyes(1);
		Vec3d look = player.getLookVec();
		for (EntityCanvas canvas : canvases) {
			if (player.getDistanceToEntity(canvas) > REACH * 2) {
				continue;
			}
			MATRIX.setIdentity();
			MATRIX.rotate(-canvas.rotationYaw, 0, 1, 0);
			MATRIX.rotate((canvas.rotationPitch + 90), 1, 0, 0);
			float w = canvas.getWidth() / 2F, h = canvas.getHeight() / 2F;
			Point3f v1 = new Point3f(-w, 0.0625F, -h);
			Point3f v2 = new Point3f(w, 0.0625F, -h);
			Point3f v3 = new Point3f(w, 0.0625F, h);
			Point3f v4 = new Point3f(-w, 0.0625F, h);
			MATRIX.transform(v1);
			MATRIX.transform(v2);
			MATRIX.transform(v3);
			MATRIX.transform(v4);
			Point3f pos = new Point3f((float) canvas.posX, (float) canvas.posY, (float) canvas.posZ);
			v1.add(pos);
			v2.add(pos);
			v3.add(pos);
			v4.add(pos);
			Optional<Vec3d> result = Mth.intersect(origin, look, getVec3(v1), getVec3(v2), getVec3(v3), getVec3(v4), true);
			if (result.isPresent() && result.get().zCoord < hitVec.get().zCoord) {
				hitCanvas = Optional.of(canvas);
				hitVec = result;
			}
		}
		if (hitCanvas.isPresent()) {
			return Optional.of(Pair.of(hitCanvas.get(), hitVec.get()));
		}
		return Optional.empty();
	}

	private static Vec3d getVec3(Point3f p) {
		return new Vec3d(p.x, p.y, p.z);
	}

	public static void setDyeIndex(ItemStack brush, int dyeIndex) {
		brush.setTagInfo("dyeIndex", new NBTTagInt(dyeIndex));
	}

	public static int getDyeIndex(ItemStack brush) {
		if (brush == null) {
			return -1;
		}
		if (brush.getItem() instanceof ItemBrush) {
			NBTTagCompound compound = brush.getTagCompound();
			if (compound == null || !compound.hasKey("dyeIndex", 3)) {
				return -1;
			}
			return compound.getInteger("dyeIndex");
		}
		return -1;
	}
}
