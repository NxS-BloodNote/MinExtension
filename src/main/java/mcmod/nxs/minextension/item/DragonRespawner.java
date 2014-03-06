package mcmod.nxs.minextension.item;

import java.util.List;

import mcmod.nxs.minextension.lib.IItem;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class DragonRespawner extends IItem {
	public DragonRespawner() {
	}

	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List list, boolean par4) {
		list.add("Right click to re-summon the EnderDragon !");
		super.addInformation(par1ItemStack, par2EntityPlayer, list, par4);
	}

	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		if (!world.isRemote) {
			EntityDragon dragon = new EntityDragon(world);
			dragon.setLocationAndAngles(par4, par5, par6, MathHelper.wrapAngleTo180_float(world.rand.nextFloat() * 360.0F), 0.0F);
			world.spawnEntityInWorld(dragon);
			player.setCurrentItemOrArmor(0, null);
			return true;
		}
		return super.onItemUse(stack, player, world, par4, par5, par6, par7, par8, par9, par10);
	}

}
