package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.Constants;
import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemTool extends Item {
	private Boolean is3D;

	public ItemTool(String name, Boolean is3d) {
		this.setUnlocalizedName("tool" + Names.TitleCase(name));
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
		this.setCreativeTab(Constants.TabDecoClassic);
		this.setMaxStackSize(1);
		this.setContainerItem(this);
		this.is3D = is3d;
		if (this.is3D) {
			this.setFull3D();
		}
	}

	@Override
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack) {
		return false;
	}
}
