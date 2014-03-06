package mcmod.nxs.minextension.item.armor;

import mcmod.nxs.minextension.MainClass;
import mcmod.nxs.minextension.core.ArmorHandler;
import mcmod.nxs.minextension.lib.IArmor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;

public class AmethystArmor extends IArmor {
	public AmethystArmor(ArmorMaterial material, int type, int layer) {
		super(material, type, layer);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == ArmorHandler.amethyst_leggings) {
			return MainClass.TEXTURES_PATH + "textures/models/armors/amethyst_2.png";
		} else {
			return MainClass.TEXTURES_PATH + "textures/models/armors/amethyst_1.png";
		}
	}
}
