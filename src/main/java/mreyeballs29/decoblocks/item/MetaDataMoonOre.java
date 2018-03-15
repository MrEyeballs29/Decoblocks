package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class MetaDataMoonOre extends ItemBlockWithMetadata {

	public MetaDataMoonOre(Block block) {
		super(block, block);
		this.setMaxDamage(0);
}

@Override
public int getMetadata(int meta) {
	return meta;
}

public String getUnlocalizedName(ItemStack item) {
	return this.getUnlocalizedName() + "_" + Names.ORES[(item.getItemDamage() < Names.ORES.length ? item.getItemDamage() : 0)];
};
}
