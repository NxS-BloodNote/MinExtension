package mcmod.nxs.minextension.lib;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class IBlock extends Block {
    public IBlock(Material material) {
	super(material);
    }

    public Block setBlockParameters(String name, float hardness,
	    float resistance, SoundType sound, CreativeTabs tab) {
	this.setBlockName(name);
	this.setBlockTextureName(ITexturePath.getTexturesPath() + name);
	this.setHardness(hardness);
	this.setResistance(resistance);
	this.setStepSound(sound);
	this.setCreativeTab(tab);
	return this;
    }
}
