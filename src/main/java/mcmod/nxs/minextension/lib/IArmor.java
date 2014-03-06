package mcmod.nxs.minextension.lib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;

public class IArmor extends ItemArmor {
    public IArmor(ArmorMaterial material, int type, int layer) {
	super(material, type, layer);
    }

    public ItemArmor setNameAndTab(String name, CreativeTabs tab) {
	this.setTextureName(ITexturePath.getTexturesPath() + name);
	this.setUnlocalizedName(name);
	this.setCreativeTab(tab);
	return this;
    }
}
