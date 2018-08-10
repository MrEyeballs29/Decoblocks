package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class MetaDataBasicOre extends ItemBlockWithMetadata {

	public MetaDataBasicOre(Block block) {
		super(block, block);
		this.setMaxDamage(0);
}

@Override
public int getMetadata(int meta) {
	return meta;
}

public String getUnlocalizedName(ItemStack item) {
	return this.getUnlocalizedName() + Names.TitleCase(Names.BASIC_ORES[(item.getItemDamage() < Names.BASIC_ORES.length ? item.getItemDamage() : 0)]);
};
}
