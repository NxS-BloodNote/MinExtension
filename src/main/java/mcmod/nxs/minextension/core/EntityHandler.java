package mcmod.nxs.minextension.core;

import java.awt.Color;

import mcmod.nxs.minextension.entity.hostile.EntityEnderCreeper;
import mcmod.nxs.minextension.entity.hostile.EntityNetherCreeper;
import mcmod.nxs.minextension.entity.hostile.EntityNetherman;
import mcmod.nxs.minextension.entity.passive.golem.EntityDiamondGolem;
import mcmod.nxs.minextension.entity.passive.golem.EntityGoldGolem;
import mcmod.nxs.minextension.entity.passive.warrior.EntityArcher;
import mcmod.nxs.minextension.entity.passive.warrior.EntityFemaleWarrior;
import mcmod.nxs.minextension.entity.passive.warrior.EntityMaleWarrior;
import mcmod.nxs.minextension.entity.passive.warrior.EntityShield;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityHandler {
	public static void addEntities() {
		EntityRegistry.registerGlobalEntityID(EntityMaleWarrior.class, "warrior", EntityRegistry.findGlobalUniqueEntityId(), new Color(128, 35, 255).getRGB(), new Color(147, 59, 128).getRGB());
		EntityRegistry.addSpawn("warrior", 25, 1, 1, EnumCreatureType.creature, BiomeGenBase.plains, BiomeGenBase.river);
		EntityRegistry.registerGlobalEntityID(EntityFemaleWarrior.class, "femaleWarrior", EntityRegistry.findGlobalUniqueEntityId(), new Color(55, 128, 255).getRGB(), new Color(59, 138, 128).getRGB());
		EntityRegistry.addSpawn("femaleWarrior", 25, 1, 1, EnumCreatureType.creature, BiomeGenBase.plains, BiomeGenBase.river);
		EntityRegistry.registerGlobalEntityID(EntityShield.class, "shieldWarrior", EntityRegistry.findGlobalUniqueEntityId(), new Color(236, 56, 255).getRGB(), new Color(98, 59, 128).getRGB());
		EntityRegistry.addSpawn("shieldWarrior", 25, 1, 1, EnumCreatureType.creature, BiomeGenBase.plains, BiomeGenBase.river);
		EntityRegistry.registerGlobalEntityID(EntityArcher.class, "archerWarrior", EntityRegistry.findGlobalUniqueEntityId(), new Color(10, 83, 255).getRGB(), new Color(63, 05, 128).getRGB());
		EntityRegistry.addSpawn("archerWarrior", 25, 1, 1, EnumCreatureType.creature, BiomeGenBase.plains, BiomeGenBase.river);
		EntityRegistry.registerGlobalEntityID(EntityNetherCreeper.class, "netherCreeper", EntityRegistry.findGlobalUniqueEntityId(), 0XEC0128, 0X0F7304);
		EntityRegistry.addSpawn("netherCreeper", 100, 1, 4, EnumCreatureType.monster, BiomeGenBase.hell);
		EntityRegistry.registerGlobalEntityID(EntityNetherman.class, "netherMan", EntityRegistry.findGlobalUniqueEntityId(), 0X1E0B4A, 0XEA0120);
		EntityRegistry.addSpawn("netherCreeper", 100, 1, 4, EnumCreatureType.monster, BiomeGenBase.hell);
		EntityRegistry.registerGlobalEntityID(EntityEnderCreeper.class, "enderCreeper", EntityRegistry.findGlobalUniqueEntityId(), 0X654D9E, 0X0F7304);
		EntityRegistry.addSpawn("enderCreeper", 50, 1, 1, EnumCreatureType.monster, BiomeGenBase.sky);
		EntityRegistry.registerGlobalEntityID(EntityGoldGolem.class, "goldGolem", EntityRegistry.findGlobalUniqueEntityId());
		EntityRegistry.registerGlobalEntityID(EntityDiamondGolem.class, "diamondGolem", EntityRegistry.findGlobalUniqueEntityId());
	}
}
