package mcmod.nxs.minextension.event;

import mcmod.nxs.minextension.core.SpecialItemHandler;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class DropEvent {
	@SubscribeEvent
	public void modifyDrops(LivingDropsEvent event) {
		if (event.entityLiving instanceof EntityDragon) {
			event.drops.add(new EntityItem(event.entityLiving.worldObj, event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ, new ItemStack(SpecialItemHandler.dragonRespawner)));
		}
	}

}
