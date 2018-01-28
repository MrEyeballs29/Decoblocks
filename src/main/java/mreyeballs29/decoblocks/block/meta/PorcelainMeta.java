package mreyeballs29.decoblocks.block.meta;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class PorcelainMeta extends ItemBlockWithMetadata {

	public PorcelainMeta(Block block) {
		super(block, block);
	}
	
	public String getUnlocalizedName(ItemStack item) {
		return this.getUnlocalizedName() + "_" + item.getItemDamage();
	};
}
