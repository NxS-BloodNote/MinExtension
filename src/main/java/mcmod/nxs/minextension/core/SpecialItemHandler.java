package mcmod.nxs.minextension.core;

import mcmod.nxs.minextension.item.DragonRespawner;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class SpecialItemHandler {
	public static Item dragonRespawner;

	public static void addSpecialItems() {
		dragonRespawner = new DragonRespawner().setNameAndTab("dragonRespawner", TabHandler.nxsTab);
	}

	public static void registerSpecialItems() {
		GameRegistry.registerItem(dragonRespawner, "dragonRespawner");
	}
}
