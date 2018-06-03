package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.Constants;
import mreyeballs29.decoblocks.block.ModBlocks;
import net.minecraft.item.ItemFood;

public class NutrientBar extends ItemFood {

	public NutrientBar(int i, float f, boolean b, String name, String name2) {
		super(i, f, b);
		this.setUnlocalizedName(name2);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
		this.setCreativeTab(ModBlocks.TabDecoClassic);
	}

}
