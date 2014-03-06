package mcmod.nxs.minextension.lib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class IAxe extends ItemAxe {
    public IAxe(ToolMaterial p_i45356_1_) {
	super(p_i45356_1_);
    }

    public ItemAxe setNameAndTab(String name, CreativeTabs tab) {
	this.setTextureName(ITexturePath.getTexturesPath() + name);
	this.setUnlocalizedName(name);
	this.setCreativeTab(tab);
	return this;
    }
}
