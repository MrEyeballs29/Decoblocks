package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class MetaDataGemStorage extends ItemBlockWithMetadata {
	public MetaDataGemStorage(Block block) {
		super(block, block);
		this.hasSubtypes = true;
		this.setMaxDamage(0);
	}
		
	@Override
	public int getMetadata(int meta) {
		if (meta >= 8) {
			meta = 0;
		}
		return meta;
	}
		
	public String getUnlocalizedName(ItemStack item) {
		return this.getUnlocalizedName() + Names.TitleCase(Names.GEMS[(item.getItemDamage() < Names.GEMS.length ? item.getItemDamage() : 0)]);
	};
}
