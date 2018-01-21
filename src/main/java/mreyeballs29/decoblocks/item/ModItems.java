package mreyeballs29.decoblocks.item;

import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public final class ModItems {
	public static Item clayball;
	public static Item sand;
	
	public static final void init() {
		clayball = new Clayball().setUnlocalizedName("clayball").setTextureName(Constants.TEXTURE_PREFIX + "clayball").setCreativeTab(CreativeTabs.tabMaterials);
		sand = new Sandypowder().setUnlocalizedName("sandpowder").setTextureName(Constants.TEXTURE_PREFIX + "sandpowder").setCreativeTab(CreativeTabs.tabMaterials);
		GameRegistry.registerItem(clayball, clayball.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sand, sand.getUnlocalizedName().substring(5));
	}
}
