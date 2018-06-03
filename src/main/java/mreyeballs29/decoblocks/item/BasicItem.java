package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.Constants;
import mreyeballs29.decoblocks.block.ModBlocks;
import net.minecraft.item.Item;

public class BasicItem extends Item {

	public BasicItem(String name, String name2) {
		this.setUnlocalizedName(name2);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
		this.setCreativeTab(ModBlocks.TabDecoClassic);
	}
}
