package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class Clayball extends Item {

	public Clayball(String name) {
		this.setUnlocalizedName(name);
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
	}
	
	public void addOreDict() {
		OreDictionary.registerOre("itemClay", this);
	}
}
