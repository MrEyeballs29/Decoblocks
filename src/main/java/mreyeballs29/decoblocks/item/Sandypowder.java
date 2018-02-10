package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Sandypowder extends Item {
	public Sandypowder(String name) {
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
	}
}
