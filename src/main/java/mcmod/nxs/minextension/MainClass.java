package mcmod.nxs.minextension;

import mcmod.nxs.minextension.core.ArmorHandler;
import mcmod.nxs.minextension.core.BlockHandler;
import mcmod.nxs.minextension.core.CraftingHandler;
import mcmod.nxs.minextension.core.EnchantmentHandler;
import mcmod.nxs.minextension.core.EntityHandler;
import mcmod.nxs.minextension.core.ItemHandler;
import mcmod.nxs.minextension.core.SpecialItemHandler;
import mcmod.nxs.minextension.core.ToolHandler;
import mcmod.nxs.minextension.event.DropEvent;
import mcmod.nxs.minextension.event.UpdateEvent;
import mcmod.nxs.minextension.gen.WorldGenHandler;
import mcmod.nxs.minextension.lib.ITexturePath;
import mcmod.nxs.minextension.proxy.CommonProxy;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = MainClass.MODID, name = MainClass.NAME, version = MainClass.VERSION)
public class MainClass {
	public static final String MODID = "minextension";
	public static final String NAME = "MinExtension";
	public static final String VERSION = "0.1";
	public static final String TEXTURES_PATH = "minextension:";
	public static final String CLIENT_PROXY_PATH = "mcmod.nxs.minextension.proxy.ClientProxy";
	public static final String COMMON_PROXY_PATH = "mcmod.nxs.minextension.proxy.CommonProxy";
	@SidedProxy(clientSide = MainClass.CLIENT_PROXY_PATH, serverSide = MainClass.COMMON_PROXY_PATH)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ITexturePath.setTexturesPath(TEXTURES_PATH);
		MinecraftForge.EVENT_BUS.register(new DropEvent());
		proxy.registerEntityRender();
		BlockHandler.addBlocks();
		BlockHandler.registerBlocks();
		ItemHandler.addItems();
		ItemHandler.registerItems();
		SpecialItemHandler.addSpecialItems();
		SpecialItemHandler.registerSpecialItems();
		ToolHandler.addTools();
		ToolHandler.registerTools();
		ArmorHandler.addArmors();
		ArmorHandler.registerArmors();
		EntityHandler.addEntities();
		EnchantmentHandler.addEnchantments();
		GameRegistry.registerWorldGenerator(new WorldGenHandler(), 0);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		CraftingHandler.addRecipes();
		CraftingHandler.addSmeltings();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}
