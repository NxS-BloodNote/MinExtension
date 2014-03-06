package mcmod.nxs.minextension.render;

import mcmod.nxs.minextension.entity.passive.warrior.EntityArcher;
import mcmod.nxs.minextension.lib.ITexturePath;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderArcher extends RenderBiped {

	protected static final ResourceLocation texture = new ResourceLocation(ITexturePath.getTexturesPath() + "textures/entity/archer.png");

	public RenderArcher() {
		super(new ModelBiped(), 0.5f);
	}

	protected ResourceLocation getSteveTexture(EntityArcher entity) {
		return texture;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity par1Entity) {
		return this.getSteveTexture((EntityArcher) par1Entity);
	}
}