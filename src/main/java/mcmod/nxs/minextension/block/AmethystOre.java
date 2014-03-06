package mcmod.nxs.minextension.block;

import java.util.Random;

import mcmod.nxs.minextension.core.ItemHandler;
import mcmod.nxs.minextension.lib.IBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class AmethystOre extends IBlock {
	public AmethystOre(Material material) {
		super(material);
	}

	public int quantityDropped(Random rand) {
		return 2 + rand.nextInt(1);
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return ItemHandler.amethyst_piece;
	}
}