package mcmod.nxs.minextension.core;

import mcmod.nxs.minextension.lib.IItem;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemHandler {

	public static Item copper_ingot;
	public static Item platinum_ingot;
	public static Item ruby_gem;
	public static Item sapphire_nugget;
	public static Item onyx_ingot;
	public static Item topaze_gem;
	public static Item mythril_piece;
	public static Item amethyst_piece;

	public static void addItems() {
		copper_ingot = new IItem().setNameAndTab("copperIngot", TabHandler.nxsTab);
		platinum_ingot = new IItem().setNameAndTab("platinumIngot", TabHandler.nxsTab);
		ruby_gem = new IItem().setNameAndTab("rubyGem", TabHandler.nxsTab);
		sapphire_nugget = new IItem().setNameAndTab("sapphireNugget", TabHandler.nxsTab);
		onyx_ingot = new IItem().setNameAndTab("onyxIngot", TabHandler.nxsTab);
		topaze_gem = new IItem().setNameAndTab("topazeGem", TabHandler.nxsTab);
		mythril_piece = new IItem().setNameAndTab("mythrilPiece", TabHandler.nxsTab);
		amethyst_piece = new IItem().setNameAndTab("amethystPiece", TabHandler.nxsTab);
	}

	public static void registerItems() {
		GameRegistry.registerItem(copper_ingot, "copperIngot");
		GameRegistry.registerItem(platinum_ingot, "platinumIngot");
		GameRegistry.registerItem(ruby_gem, "rubyGem");
		GameRegistry.registerItem(sapphire_nugget, "sapphireNugget");
		GameRegistry.registerItem(onyx_ingot, "onyxIngot");
		GameRegistry.registerItem(topaze_gem, "topazeGem");
		GameRegistry.registerItem(mythril_piece, "mythrilPiece");
		GameRegistry.registerItem(amethyst_piece, "amethystPiece");
	}
}
