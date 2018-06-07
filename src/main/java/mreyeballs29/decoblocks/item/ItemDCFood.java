package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.item.ItemFood;

public class ItemDCFood extends ItemFood {

	public ItemDCFood(int i, float f, String name, String name2) {
		super(i, f, false);
		this.setUnlocalizedName(name2);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
		this.setCreativeTab(Constants.TabDecoClassic);
	}

}
