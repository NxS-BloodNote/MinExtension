package mcmod.nxs.minextension.lib;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class IMob extends EntityMob {
    public IMob(World par1World) {
	super(par1World);
    }

    public static void setMobParameters(EntityMob entity, float attack,
	    float health, float speed, float followRange,
	    float knockbackResistance) {
	entity.getEntityAttribute(SharedMonsterAttributes.attackDamage)
		.setBaseValue(attack);
	entity.getEntityAttribute(SharedMonsterAttributes.movementSpeed)
		.setBaseValue(speed);
	entity.getEntityAttribute(SharedMonsterAttributes.maxHealth)
		.setBaseValue(health);
	entity.getEntityAttribute(SharedMonsterAttributes.followRange)
		.setBaseValue(followRange);
	entity.getEntityAttribute(SharedMonsterAttributes.knockbackResistance)
		.setBaseValue(knockbackResistance);
    }
}
