package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class MetaDataRockBlock extends ItemBlockWithMetadata {

	public MetaDataRockBlock(Block block) {
		super(block, block);
		this.hasSubtypes = true;
		this.setMaxDamage(0);
	}
	
	@Override
	public int getMetadata(int meta) {
		return meta;
	}
	
	public String getUnlocalizedName(ItemStack item) {
		return this.getUnlocalizedName() + "_" + Names.ROCK_TYPES[(item.getItemDamage() < Names.ROCK_TYPES.length ? item.getItemDamage() : 0)];
	};
}
