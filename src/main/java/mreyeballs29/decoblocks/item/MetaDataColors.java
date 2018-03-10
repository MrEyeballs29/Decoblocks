package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class MetaDataColors extends ItemBlockWithMetadata {

	public MetaDataColors(Block block) {
		super(block, block);
		this.hasSubtypes = true;
		this.setMaxDamage(0);
	}

	@Override
	public int getMetadata(int meta) {
		return meta;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack item) {
		return this.getUnlocalizedName() + "_" + Names.COLORS[(item.getItemDamage() < 16 ? item.getItemDamage() : 0)];
	};
}
