package mcmod.nxs.minextension.entity.passive.warrior;

import mcmod.nxs.minextension.entity.GenericWarrior;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityShield extends GenericWarrior {
	public EntityShield(World par1World) {
		super(par1World);
	}
	
	public void onUpdate() {
		helmetItem = new ItemStack(Items.iron_helmet);
		chestplateItem = new ItemStack(Items.iron_chestplate);
		leggingsItem = new ItemStack(Items.iron_leggings);
		bootsItem = new ItemStack(Items.iron_boots);
		this.setCurrentItemOrArmor(4, helmetItem);
		this.setCurrentItemOrArmor(3, chestplateItem);
		this.setCurrentItemOrArmor(2, leggingsItem);
		this.setCurrentItemOrArmor(1, bootsItem);
		super.onUpdate();
	}
}
