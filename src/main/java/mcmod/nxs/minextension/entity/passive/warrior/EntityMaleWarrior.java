package mcmod.nxs.minextension.entity.passive.warrior;

import mcmod.nxs.minextension.entity.GenericWarrior;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityMaleWarrior extends GenericWarrior {
	public EntityMaleWarrior(World par1World) {
		super(par1World);
	}

	public void onUpdate() {
		heldItem = new ItemStack(Items.iron_sword);
		this.setCurrentItemOrArmor(0, heldItem);
		super.onUpdate();
	}
}
