package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.item.ItemAxe;

public class ItemToolAxe extends ItemAxe {

	public ItemToolAxe(ToolMaterial toolmaterial, String name, String name2) {
		super(toolmaterial);
		this.setUnlocalizedName(name2);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
	}

}