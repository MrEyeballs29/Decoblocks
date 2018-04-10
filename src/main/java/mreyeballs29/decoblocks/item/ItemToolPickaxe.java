package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.item.ItemPickaxe;

public class ItemToolPickaxe extends ItemPickaxe {

	public ItemToolPickaxe(ToolMaterial toolmaterial, String name, String name2) {
		super(toolmaterial);
		this.setUnlocalizedName(name2);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
	}

}
