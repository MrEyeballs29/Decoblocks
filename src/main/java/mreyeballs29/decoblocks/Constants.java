package mreyeballs29.decoblocks;

import mreyeballs29.decoblocks.block.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Constants {
	public static final String modID = "decoblock";
	public static final String version = "1.3.0 Final";
	public static final String modName = "Decoblocks";
	public static final String TEXTURE_PREFIX = "decoblock:";
	
	public static final String Intergration = "after:";
	public static final String Dependency = "required-after:";
	
	public static final CreativeTabs TabDecoClassic = new CreativeTabs("decoblockstab") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(Blocks.stonebrick);
		}
	};
	
	public static final CreativeTabs TabIntergration = new CreativeTabs("decointergrationtab") {
		public Item getTabIconItem() {
		return new ItemStack(ModBlocks.labblock, 1, 3).getItem();
		}
	};
}
