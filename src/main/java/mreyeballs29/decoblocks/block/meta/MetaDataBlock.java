package mreyeballs29.decoblocks.block.meta;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class MetaDataBlock extends ItemBlockWithMetadata {

	public MetaDataBlock(Block block) {
		super(block, block);
	}
	
	public String getUnlocalizedName(ItemStack item) {
		return this.getUnlocalizedName() + "_" + item.getItemDamage();
	};
}
