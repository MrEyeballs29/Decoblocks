package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.item.ItemHoe;

public class ItemToolHoe extends ItemHoe {

		public ItemToolHoe(ToolMaterial toolmaterial, String name, String string) {
			super(toolmaterial);
			this.setUnlocalizedName(string);
			this.setTextureName(Constants.TEXTURE_PREFIX + name);
		}

}
