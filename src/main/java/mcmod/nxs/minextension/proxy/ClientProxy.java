package mcmod.nxs.minextension.proxy;

import mcmod.nxs.minextension.entity.hostile.EntityEnderCreeper;
import mcmod.nxs.minextension.entity.hostile.EntityNetherCreeper;
import mcmod.nxs.minextension.entity.hostile.EntityNetherman;
import mcmod.nxs.minextension.entity.passive.golem.EntityDiamondGolem;
import mcmod.nxs.minextension.entity.passive.golem.EntityGoldGolem;
import mcmod.nxs.minextension.entity.passive.warrior.EntityArcher;
import mcmod.nxs.minextension.entity.passive.warrior.EntityFemaleWarrior;
import mcmod.nxs.minextension.entity.passive.warrior.EntityMaleWarrior;
import mcmod.nxs.minextension.entity.passive.warrior.EntityShield;
import mcmod.nxs.minextension.render.RenderArcher;
import mcmod.nxs.minextension.render.RenderDiamondGolem;
import mcmod.nxs.minextension.render.RenderEnderCreeper;
import mcmod.nxs.minextension.render.RenderFemaleWarrior;
import mcmod.nxs.minextension.render.RenderGoldGolem;
import mcmod.nxs.minextension.render.RenderMaleWarrior;
import mcmod.nxs.minextension.render.RenderNetherCreeper;
import mcmod.nxs.minextension.render.RenderNetherman;
import mcmod.nxs.minextension.render.RenderShield;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerEntityRender() {
		RenderingRegistry.registerEntityRenderingHandler(EntityMaleWarrior.class, new RenderMaleWarrior());
		RenderingRegistry.registerEntityRenderingHandler(EntityFemaleWarrior.class, new RenderFemaleWarrior());
		RenderingRegistry.registerEntityRenderingHandler(EntityShield.class, new RenderShield());
		RenderingRegistry.registerEntityRenderingHandler(EntityArcher.class, new RenderArcher());
		RenderingRegistry.registerEntityRenderingHandler(EntityNetherCreeper.class, new RenderNetherCreeper());
		RenderingRegistry.registerEntityRenderingHandler(EntityNetherman.class, new RenderNetherman());
		RenderingRegistry.registerEntityRenderingHandler(EntityEnderCreeper.class, new RenderEnderCreeper());
		RenderingRegistry.registerEntityRenderingHandler(EntityGoldGolem.class, new RenderGoldGolem());
		RenderingRegistry.registerEntityRenderingHandler(EntityDiamondGolem.class, new RenderDiamondGolem());
	}
}
