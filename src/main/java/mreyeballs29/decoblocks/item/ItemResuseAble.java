package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemResuseAble extends Item {
	public ItemResuseAble(String name) {
		this.setUnlocalizedName(name);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
		this.setContainerItem(this);
	}
	
	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
		return false;
	}
}
