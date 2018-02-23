package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.item.Item;

public class Hammer extends Item {
	public Hammer(String name) {
		this.setUnlocalizedName(name);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
		this.setContainerItem(this);
	}
}
