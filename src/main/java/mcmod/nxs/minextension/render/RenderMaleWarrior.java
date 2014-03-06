package mcmod.nxs.minextension.render;

import mcmod.nxs.minextension.entity.passive.warrior.EntityMaleWarrior;
import mcmod.nxs.minextension.lib.ITexturePath;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderMaleWarrior extends RenderBiped {
	private static final ResourceLocation warriorTextures = new ResourceLocation(ITexturePath.getTexturesPath() + "textures/entity/warrior_male.png");

	public RenderMaleWarrior() {
		super(new ModelBiped(), 0.5F);
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called
	 * unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(EntityMaleWarrior warrior) {
		return warriorTextures;
	}

	/**
	 * Returns the location of an entity's texture. Doesn't seem to be called
	 * unless you call Render.bindEntityTexture.
	 */
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return this.getEntityTexture((EntityMaleWarrior) par1Entity);
	}
}