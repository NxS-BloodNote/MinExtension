package mcmod.nxs.minextension.lib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IItem extends Item {
    public Item setNameAndTab(String name, CreativeTabs tab) {
	this.setTextureName(ITexturePath.getTexturesPath() + name);
	this.setUnlocalizedName(name);
	this.setCreativeTab(tab);
	return this;
    }
}
