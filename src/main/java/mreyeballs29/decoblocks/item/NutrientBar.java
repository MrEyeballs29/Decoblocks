package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.Constants;
import mreyeballs29.decoblocks.block.ModBlocks;
import net.minecraft.item.ItemFood;

public class NutrientBar extends ItemFood {

	public NutrientBar(int i, float f, boolean b, String name) {
		super(i, f, b);
		this.setUnlocalizedName(name);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
		this.setCreativeTab(ModBlocks.TabDecoClassic);
	}

}
