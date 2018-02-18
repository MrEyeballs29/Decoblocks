package mreyeballs29.decoblocks.block.meta;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class MetaDataStoneBlock extends ItemBlockWithMetadata {
	public static final String[] STONE_TYPES = new String[] {"smooth", "reinforced_bricks", "tiles", "small_tiles", "small_bricks", "windmill_bricks_a", "windmill_bricks_b", "square_bricks"};
	public MetaDataStoneBlock(Block block) {
		super(block, block);
		this.hasSubtypes = true;
		this.setMaxDamage(0);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getMetadata(int meta) {
		if (meta >= 8) {
			meta = 0;
		}
		return meta;
	}
	
	public String getUnlocalizedName(ItemStack item) {
		return this.getUnlocalizedName() + "_" + STONE_TYPES[(item.getItemDamage() < 8 ? item.getItemDamage() : 0)];
	};
}
