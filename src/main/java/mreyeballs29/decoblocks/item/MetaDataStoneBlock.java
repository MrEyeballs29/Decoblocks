package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class MetaDataStoneBlock extends ItemBlockWithMetadata {
	public MetaDataStoneBlock(Block block) {
		super(block, block);
		this.hasSubtypes = true;
		this.setMaxDamage(0);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getMetadata(int meta) {
		if (meta >= 11) {
			meta = 0;
		}
		return meta;
	}
	
	public String getUnlocalizedName(ItemStack item) {
		return this.getUnlocalizedName() + "_" + Names.STONE_TYPES[(item.getItemDamage() < 11 ? item.getItemDamage() : 0)];
	};
}
