package mcmod.nxs.minextension.item.armor;

import mcmod.nxs.minextension.MainClass;
import mcmod.nxs.minextension.core.ArmorHandler;
import mcmod.nxs.minextension.lib.IArmor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class SapphireArmor extends IArmor {
	public SapphireArmor(ArmorMaterial material, int type, int layer) {
		super(material, type, layer);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == ArmorHandler.sapphire_leggings) {
			return MainClass.TEXTURES_PATH + "textures/models/armors/sapphire_2.png";
		} else {
			return MainClass.TEXTURES_PATH + "textures/models/armors/sapphire_1.png";
		}
	}
}
