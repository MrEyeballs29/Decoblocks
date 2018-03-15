package mreyeballs29.decoblocks.item;

import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.block.ModBlocks;
import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ModItems {
	public static Item clayball;
	public static Item sand;
	public static Item labplating;
	public static Item forcelabplating;
	public static Item nutrientbar;
	public static Item hammer;
	public static Item polish;
	public static Item ingot;
	public static Item nugget;
	
	public static final void init() {
		GameRegistry.registerItem(clayball = new BasicItem(Names.CLAY_ROUND).setCreativeTab(ModBlocks.TabDecoClassic), Names.CLAY_ROUND);
		GameRegistry.registerItem(sand = new BasicItem(Names.SAND_DUST).setCreativeTab(ModBlocks.TabDecoClassic), Names.SAND_DUST);
		GameRegistry.registerItem(labplating = new BasicItem(Names.LAB_PLATING).setCreativeTab(ModBlocks.TabDecoClassic), Names.LAB_PLATING);
		GameRegistry.registerItem(forcelabplating = new BasicItem(Names.FORCE_LAB_PLATING).setCreativeTab(ModBlocks.TabDecoClassic), Names.FORCE_LAB_PLATING);
		GameRegistry.registerItem(ingot = new ItemIngot(Names.INGOT).setCreativeTab(ModBlocks.TabDecoClassic), Names.INGOT);
		GameRegistry.registerItem(nugget = new ItemNugget(Names.NUGGET).setCreativeTab(ModBlocks.TabDecoClassic), Names.NUGGET);
		GameRegistry.registerItem(hammer = new ItemResuseAble(Names.HAMMER).setCreativeTab(ModBlocks.TabDecoClassic).setFull3D().setMaxStackSize(1), Names.HAMMER);
		GameRegistry.registerItem(polish = new ItemResuseAble(Names.POLISH).setCreativeTab(ModBlocks.TabDecoClassic).setContainerItem(Items.bowl).setMaxStackSize(1), Names.POLISH);
		GameRegistry.registerItem(nutrientbar = new NutrientBar(6, 0.5F, false, Names.NUTRIENT_BAR), Names.NUTRIENT_BAR);
	}
	
	public static void ItemRegisterOre() {
		for (int i = 0; i < Names.METALS.length; i++) {
			OreDictionary.registerOre(("ingot" + Names.TitleCase(Names.METALS[i])), new ItemStack(ModItems.ingot, 1, i));
		}
		for (int i = 0; i < Names.METALS2.length; i++) {
			OreDictionary.registerOre(("nugget" + Names.TitleCase(Names.METALS2[i])), new ItemStack(ModItems.nugget, 1, i));
		}
	}
}
