package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class MetaDataMetalStorage extends ItemBlockWithMetadata {
	public MetaDataMetalStorage(Block block) {
		super(block, block);
		this.hasSubtypes = true;
		this.setMaxDamage(0);
	}
		
	@Override
	public int getMetadata(int meta) {
		if (meta >= 16) {
			meta = 0;
		}
		return meta;
	}
		
	public String getUnlocalizedName(ItemStack item) {
		return this.getUnlocalizedName() + Names.TitleCase(Names.METALS[(item.getItemDamage() < Names.METALS.length ? item.getItemDamage() : 0)]);
	};
}
