package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.item.ItemSpade;

public class ItemToolSpade extends ItemSpade {

	public ItemToolSpade(ToolMaterial toolmaterial, String name, String string) {
		super(toolmaterial);
		this.setUnlocalizedName(string);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
	}

}
