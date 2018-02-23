package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.item.Item;

public class BasicItem extends Item {

	public BasicItem(String name) {
		this.setUnlocalizedName(name);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
	}
}
