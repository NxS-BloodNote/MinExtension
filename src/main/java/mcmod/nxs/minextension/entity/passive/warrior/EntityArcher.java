package mcmod.nxs.minextension.entity.passive.warrior;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class EntityArcher extends EntityMob implements IRangedAttackMob {

	public EntityArcher(World par1World) {
		super(par1World);
		this.setHealth(this.getMaxHealth());
		this.isImmuneToFire = false;
		this.getNavigator().setCanSwim(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIArrowAttack(this, 1.0D, 40, 20.0F));
		this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(7, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		this.experienceValue = 75;

		if (par1World != null && !par1World.isRemote) {
			this.setCombatTask();
		}
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
	}

	@Override
	protected void entityInit() {
		super.entityInit();
	}

	@Override
	public boolean isAIEnabled() {
		return true;
	}

	@Override
	public void onLivingUpdate() {
		this.setCurrentItemOrArmor(0, new ItemStack(Items.bow));
		super.onLivingUpdate();
	}

	@Override
	protected void addRandomArmor() {
		super.addRandomArmor();
		this.setCurrentItemOrArmor(0, new ItemStack(Items.bow));
	}

	public void setCombatTask() {
		ItemStack itemstack = this.getHeldItem();

		if (itemstack != null && itemstack.getItem() == Items.bow) {
		} else {
		}
	}

	public void attackEntityWithRangedAttack(EntityLivingBase par1EntityLivingBase, float par2) {
		EntityArrow entityarrow = new EntityArrow(this.worldObj, this, par1EntityLivingBase, 1.6F, (float) (14 - this.worldObj.difficultySetting.getDifficultyId() * 4));
		int i = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, this.getHeldItem());
		int j = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, this.getHeldItem());
		entityarrow.setDamage((double) (par2 * 2.0F) + this.rand.nextGaussian() * 0.25D + (double) ((float) this.worldObj.difficultySetting.getDifficultyId() * 0.11F));

		if (i > 0) {
			entityarrow.setDamage(entityarrow.getDamage() + (double) i * 0.5D + 0.5D);
		}

		if (j > 0) {
			entityarrow.setKnockbackStrength(j);
		}

		if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, this.getHeldItem()) > 0) {
			entityarrow.setFire(100);
		}

		this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
		this.worldObj.spawnEntityInWorld(entityarrow);
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
		super.readEntityFromNBT(par1NBTTagCompound);
	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	@Override
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
		super.writeEntityToNBT(par1NBTTagCompound);
	}

	@Override
	public void setCurrentItemOrArmor(int par1, ItemStack par2ItemStack) {
		super.setCurrentItemOrArmor(par1, par2ItemStack);

		if (!this.worldObj.isRemote && par1 == 0) {
			this.setCombatTask();
		}
	}

	@Override
	public double getYOffset() {
		return super.getYOffset() - 0.5D;
	}

	@Override
	protected boolean interact(EntityPlayer Player) {
		ItemStack handItem = Player.inventory.getCurrentItem();
		if (handItem != null) {
			if (Player.getHeldItem().getItem() instanceof ItemBow) {
				this.setCurrentItemOrArmor(0, handItem);
				Player.setCurrentItemOrArmor(0, null);
				return true;
			}
		}
		return false;
	}

	protected void dropEquipment(boolean par1, int par2) {
		super.dropEquipment(true, 100);
	}

	public void updateRidden() {
		super.updateRidden();

		if (this.ridingEntity instanceof EntityHorse) {
			EntityHorse entitycreature = (EntityHorse) this.ridingEntity;
			this.renderYawOffset = entitycreature.renderYawOffset;
		}
	}
}
