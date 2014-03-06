package mcmod.nxs.minextension.core;

import mcmod.nxs.minextension.lib.IAxe;
import mcmod.nxs.minextension.lib.IHoe;
import mcmod.nxs.minextension.lib.IPickaxe;
import mcmod.nxs.minextension.lib.ISpade;
import mcmod.nxs.minextension.lib.ISword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ToolHandler {

	public static ToolMaterial copper = EnumHelper.addToolMaterial("copper", 1, 550, 5, 2, 30);
	public static ToolMaterial platinum = EnumHelper.addToolMaterial("platinum", 2, 850, 6, 3, 50);
	public static ToolMaterial ruby = EnumHelper.addToolMaterial("ruby", 5, 2500, 9, 5, 64);
	public static ToolMaterial sapphire = EnumHelper.addToolMaterial("sapphire", 6, 4000, 12, 6, 64);
	public static ToolMaterial topaze = EnumHelper.addToolMaterial("topaze", 7, 5500, 14, 7, 64);
	public static ToolMaterial onyx = EnumHelper.addToolMaterial("onyx", 3, 12000, 4, 2, 64);
	public static ToolMaterial mythril = EnumHelper.addToolMaterial("mythril", 8, 6000, 16, 8, 64);
	public static ToolMaterial amethyst = EnumHelper.addToolMaterial("amethyst", 10, 10000, 20, 10, 64);

	public static ItemAxe copper_axe, platinum_axe, ruby_axe, sapphire_axe, topaze_axe, onyx_axe, mythril_axe, amethyst_axe;
	public static ItemPickaxe copper_pickaxe, platinum_pickaxe, ruby_pickaxe, sapphire_pickaxe, topaze_pickaxe, onyx_pickaxe, mythril_pickaxe, amethyst_pickaxe;
	public static ItemSpade copper_spade, platinum_spade, ruby_spade, sapphire_spade, topaze_spade, onyx_spade, mythril_spade, amethyst_spade;
	public static ItemHoe copper_hoe, platinum_hoe, ruby_hoe, sapphire_hoe, topaze_hoe, onyx_hoe, mythril_hoe, amethyst_hoe;
	public static ItemSword copper_sword, platinum_sword, ruby_sword, sapphire_sword, topaze_sword, onyx_sword, mythril_sword, amethyst_sword;

	public static void addTools() {
		copper_axe = new IAxe(copper).setNameAndTab("copperAxe", TabHandler.nxsTab);
		platinum_axe = new IAxe(platinum).setNameAndTab("platinumAxe", TabHandler.nxsTab);
		ruby_axe = new IAxe(ruby).setNameAndTab("rubyAxe", TabHandler.nxsTab);
		sapphire_axe = new IAxe(sapphire).setNameAndTab("sapphireAxe", TabHandler.nxsTab);
		topaze_axe = new IAxe(topaze).setNameAndTab("topazeAxe", TabHandler.nxsTab);
		onyx_axe = new IAxe(onyx).setNameAndTab("onyxAxe", TabHandler.nxsTab);
		mythril_axe = new IAxe(mythril).setNameAndTab("mythrilAxe", TabHandler.nxsTab);
		amethyst_axe = new IAxe(amethyst).setNameAndTab("amethystAxe", TabHandler.nxsTab);

		copper_pickaxe = new IPickaxe(copper).setNameAndTab("copperPickaxe", TabHandler.nxsTab);
		platinum_pickaxe = new IPickaxe(platinum).setNameAndTab("platinumPickaxe", TabHandler.nxsTab);
		ruby_pickaxe = new IPickaxe(ruby).setNameAndTab("rubyPickaxe", TabHandler.nxsTab);
		sapphire_pickaxe = new IPickaxe(sapphire).setNameAndTab("sapphirePickaxe", TabHandler.nxsTab);
		topaze_pickaxe = new IPickaxe(topaze).setNameAndTab("topazePickaxe", TabHandler.nxsTab);
		onyx_pickaxe = new IPickaxe(onyx).setNameAndTab("onyxPickaxe", TabHandler.nxsTab);
		mythril_pickaxe = new IPickaxe(mythril).setNameAndTab("mythrilPickaxe", TabHandler.nxsTab);
		amethyst_pickaxe = new IPickaxe(amethyst).setNameAndTab("amethystPickaxe", TabHandler.nxsTab);

		copper_spade = new ISpade(copper).setNameAndTab("copperSpade", TabHandler.nxsTab);
		platinum_spade = new ISpade(platinum).setNameAndTab("platinumSpade", TabHandler.nxsTab);
		ruby_spade = new ISpade(ruby).setNameAndTab("rubySpade", TabHandler.nxsTab);
		sapphire_spade = new ISpade(sapphire).setNameAndTab("sapphireSpade", TabHandler.nxsTab);
		topaze_spade = new ISpade(topaze).setNameAndTab("topazeSpade", TabHandler.nxsTab);
		onyx_spade = new ISpade(onyx).setNameAndTab("onyxSpade", TabHandler.nxsTab);
		mythril_spade = new ISpade(mythril).setNameAndTab("mythrilSpade", TabHandler.nxsTab);
		amethyst_spade = new ISpade(amethyst).setNameAndTab("amethystSpade", TabHandler.nxsTab);

		copper_hoe = new IHoe(copper).setNameAndTab("copperHoe", TabHandler.nxsTab);
		platinum_hoe = new IHoe(platinum).setNameAndTab("platinumHoe", TabHandler.nxsTab);
		ruby_hoe = new IHoe(ruby).setNameAndTab("rubyHoe", TabHandler.nxsTab);
		sapphire_hoe = new IHoe(sapphire).setNameAndTab("sapphireHoe", TabHandler.nxsTab);
		topaze_hoe = new IHoe(topaze).setNameAndTab("topazeHoe", TabHandler.nxsTab);
		onyx_hoe = new IHoe(onyx).setNameAndTab("onyxHoe", TabHandler.nxsTab);
		mythril_hoe = new IHoe(mythril).setNameAndTab("mythrilHoe", TabHandler.nxsTab);
		amethyst_hoe = new IHoe(amethyst).setNameAndTab("amethystHoe", TabHandler.nxsTab);

		copper_sword = new ISword(copper).setNameAndTab("copperSword", TabHandler.nxsTab);
		platinum_sword = new ISword(platinum).setNameAndTab("platinumSword", TabHandler.nxsTab);
		ruby_sword = new ISword(ruby).setNameAndTab("rubySword", TabHandler.nxsTab);
		sapphire_sword = new ISword(sapphire).setNameAndTab("sapphireSword", TabHandler.nxsTab);
		topaze_sword = new ISword(topaze).setNameAndTab("topazeSword", TabHandler.nxsTab);
		onyx_sword = new ISword(onyx).setNameAndTab("onyxSword", TabHandler.nxsTab);
		mythril_sword = new ISword(mythril).setNameAndTab("mythrilSword", TabHandler.nxsTab);
		amethyst_sword = new ISword(amethyst).setNameAndTab("amethystSword", TabHandler.nxsTab);
	}

	public static void registerTools() {
		GameRegistry.registerItem(copper_axe, "copperAxe");
		GameRegistry.registerItem(copper_pickaxe, "copperPickaxe");
		GameRegistry.registerItem(copper_spade, "copperSpade");
		GameRegistry.registerItem(copper_hoe, "copperHoe");
		GameRegistry.registerItem(copper_sword, "copperSword");

		GameRegistry.registerItem(platinum_axe, "platinumAxe");
		GameRegistry.registerItem(platinum_pickaxe, "platinumPickaxe");
		GameRegistry.registerItem(platinum_spade, "platinumSpade");
		GameRegistry.registerItem(platinum_hoe, "platinumHoe");
		GameRegistry.registerItem(platinum_sword, "platinumSword");

		GameRegistry.registerItem(ruby_axe, "rubyAxe");
		GameRegistry.registerItem(ruby_pickaxe, "rubyPickaxe");
		GameRegistry.registerItem(ruby_spade, "rubySpade");
		GameRegistry.registerItem(ruby_hoe, "rubyHoe");
		GameRegistry.registerItem(ruby_sword, "rubySword");

		GameRegistry.registerItem(sapphire_axe, "sapphireAxe");
		GameRegistry.registerItem(sapphire_pickaxe, "sapphirePickaxe");
		GameRegistry.registerItem(sapphire_spade, "sapphireSpade");
		GameRegistry.registerItem(sapphire_hoe, "sapphireHoe");
		GameRegistry.registerItem(sapphire_sword, "sapphireSword");

		GameRegistry.registerItem(topaze_axe, "topazeAxe");
		GameRegistry.registerItem(topaze_pickaxe, "topazePickaxe");
		GameRegistry.registerItem(topaze_spade, "topazeSpade");
		GameRegistry.registerItem(topaze_hoe, "topazeHoe");
		GameRegistry.registerItem(topaze_sword, "topazeSword");

		GameRegistry.registerItem(onyx_axe, "onyxAxe");
		GameRegistry.registerItem(onyx_pickaxe, "onyxPickaxe");
		GameRegistry.registerItem(onyx_spade, "onyxSpade");
		GameRegistry.registerItem(onyx_hoe, "onyxHoe");
		GameRegistry.registerItem(onyx_sword, "onyxSword");

		GameRegistry.registerItem(mythril_axe, "mythrilAxe");
		GameRegistry.registerItem(mythril_pickaxe, "mythrilPickaxe");
		GameRegistry.registerItem(mythril_spade, "mythrilSpade");
		GameRegistry.registerItem(mythril_hoe, "mythrilHoe");
		GameRegistry.registerItem(mythril_sword, "mythrilSword");

		GameRegistry.registerItem(amethyst_axe, "amethystAxe");
		GameRegistry.registerItem(amethyst_pickaxe, "amethystPickaxe");
		GameRegistry.registerItem(amethyst_spade, "amethystSpade");
		GameRegistry.registerItem(amethyst_hoe, "amethystHoe");
		GameRegistry.registerItem(amethyst_sword, "amethystSword");
	}
}