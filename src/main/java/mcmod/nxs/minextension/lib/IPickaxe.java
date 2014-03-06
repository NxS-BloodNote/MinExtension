package mcmod.nxs.minextension.lib;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class IPickaxe extends ItemPickaxe {
    public IPickaxe(ToolMaterial p_i45356_1_) {
	super(p_i45356_1_);
    }

    public ItemPickaxe setNameAndTab(String name, CreativeTabs tab) {
	this.setTextureName(ITexturePath.getTexturesPath() + name);
	this.setUnlocalizedName(name);
	this.setCreativeTab(tab);
	return this;
    }
}
