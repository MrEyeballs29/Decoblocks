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
	
	public static boolean isForest(int par) {
		return par == 1 || par == 129 || par == 4 || par == 18 || par == 132;
	}
	
	public static boolean isDesert(int par1) {
		return par1 == 2 || par1 == 130 || par1 == 17;
	}
	
	public static boolean isTaiga(int par) {
		return par == 5 || par == 32 || par == 135 || par == 160 || par == 161 || par == 19 || par == 33;
	}
	
	public static boolean isJungle(int par) {
		return (par >= 21 && par <= 23) || par == 149 || par == 151;
	}
	
	public static boolean isMesa(int par) {
		return (par >= 35 && par <= 39) || (par >= 163 && par <= 167);
	}
	
	public static boolean isFrozen(int par) {
		return (par >= 10 && par <= 13) || par == 30 || par == 31 || par == 140 || par == 158;
	}
}
