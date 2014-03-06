package mcmod.nxs.minextension.core;

import mcmod.nxs.minextension.block.AmethystOre;
import mcmod.nxs.minextension.block.GolemSummoner;
import mcmod.nxs.minextension.block.MythrilOre;
import mcmod.nxs.minextension.block.RubyOre;
import mcmod.nxs.minextension.block.TopazeOre;
import mcmod.nxs.minextension.lib.IBlock;
import mcmod.nxs.minextension.lib.ITexturePath;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockHandler {

	public static Block copper_ore;
	public static Block platinum_ore;
	public static Block ruby_ore;
	public static Block sapphire_ore;
	public static Block onyx_ore;
	public static Block topaze_ore;
	public static Block mythril_ore;
	public static Block amethyst_ore;

	public static Block copper_block;
	public static Block platinum_block;
	public static Block ruby_block;
	public static Block sapphire_block;
	public static Block onyx_block;
	public static Block topaze_block;
	public static Block mythril_block;
	public static Block amethyst_block;

	public static Block golem_summoner;

	public static void addBlocks() {
		copper_ore = new IBlock(Material.rock).setBlockParameters("copperOre", 5, 5, Block.soundTypeStone, TabHandler.nxsTab);
		platinum_ore = new IBlock(Material.rock).setBlockParameters("platinumOre", 5, 5, Block.soundTypeStone, TabHandler.nxsTab);
		ruby_ore = new RubyOre(Material.rock).setBlockParameters("rubyOre", 5, 5, Block.soundTypeStone, TabHandler.nxsTab);
		onyx_ore = new IBlock(Material.rock).setBlockParameters("onyxOre", 5, 5, Block.soundTypeStone, TabHandler.nxsTab);
		topaze_ore = new TopazeOre(Material.rock).setBlockParameters("topazeOre", 5, 5, Block.soundTypeStone, TabHandler.nxsTab);
		mythril_ore = new MythrilOre(Material.rock).setBlockParameters("mythrilOre", 5, 5, Block.soundTypeStone, TabHandler.nxsTab);
		amethyst_ore = new AmethystOre(Material.rock).setBlockParameters("amethystOre", 5, 5, Block.soundTypeStone, TabHandler.nxsTab);

		copper_block = new IBlock(Material.iron).setBlockParameters("copperBlock", 5, 5, Block.soundTypeMetal, TabHandler.nxsTab);
		platinum_block = new IBlock(Material.iron).setBlockParameters("platinumBlock", 5, 5, Block.soundTypeMetal, TabHandler.nxsTab);
		ruby_block = new IBlock(Material.iron).setBlockParameters("rubyBlock", 5, 5, Block.soundTypeMetal, TabHandler.nxsTab);
		onyx_block = new IBlock(Material.iron).setBlockParameters("onyxBlock", 5, 5, Block.soundTypeMetal, TabHandler.nxsTab);
		topaze_block = new IBlock(Material.iron).setBlockParameters("topazeBlock", 5, 5, Block.soundTypeMetal, TabHandler.nxsTab);
		mythril_block = new IBlock(Material.iron).setBlockParameters("mythrilBlock", 5, 5, Block.soundTypeMetal, TabHandler.nxsTab);
		amethyst_block = new IBlock(Material.iron).setBlockParameters("amethystBlock", 5, 5, Block.soundTypeMetal, TabHandler.nxsTab);

		golem_summoner = new GolemSummoner(false).setBlockName("golemSummoner").setBlockTextureName(ITexturePath.getTexturesPath() + "golemSummoner").setCreativeTab(TabHandler.nxsTab);
	}

	public static void registerBlocks() {
		GameRegistry.registerBlock(copper_ore, "copperOre");
		GameRegistry.registerBlock(platinum_ore, "platinumOre");
		GameRegistry.registerBlock(ruby_ore, "rubyOre");
		GameRegistry.registerBlock(onyx_ore, "onyxOre");
		GameRegistry.registerBlock(topaze_ore, "topazeOre");
		GameRegistry.registerBlock(mythril_ore, "mythrilOre");
		GameRegistry.registerBlock(amethyst_ore, "amethystOre");

		GameRegistry.registerBlock(copper_block, "copperBlock");
		GameRegistry.registerBlock(platinum_block, "platinumBlock");
		GameRegistry.registerBlock(ruby_block, "rubyBlock");
		GameRegistry.registerBlock(onyx_block, "onyxBlock");
		GameRegistry.registerBlock(topaze_block, "topazeBlock");
		GameRegistry.registerBlock(mythril_block, "mythrilBlock");
		GameRegistry.registerBlock(amethyst_block, "amethystBlock");

		GameRegistry.registerBlock(golem_summoner, "golemSummoner");
	}
}
