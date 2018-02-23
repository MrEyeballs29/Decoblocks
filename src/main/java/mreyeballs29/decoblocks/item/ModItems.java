package mreyeballs29.decoblocks.item;

import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public final class ModItems {
	public static Item clayball;
	public static Item sand;
	public static Item labplating;
	public static Item forcelabplating;
	public static Item nutrientbar;
	public static Item hammer;
	public static Item polish;
	
	public static final void init() {
		GameRegistry.registerItem(clayball = new BasicItem(Names.CLAY_ROUND).setCreativeTab(CreativeTabs.tabMaterials), Names.CLAY_ROUND);
		GameRegistry.registerItem(sand = new BasicItem(Names.SAND_DUST).setCreativeTab(CreativeTabs.tabMaterials), Names.SAND_DUST);
		GameRegistry.registerItem(labplating = new BasicItem(Names.LAB_PLATING).setCreativeTab(CreativeTabs.tabMaterials), Names.LAB_PLATING);
		GameRegistry.registerItem(forcelabplating = new BasicItem(Names.FORCE_LAB_PLATING).setCreativeTab(CreativeTabs.tabMaterials), Names.FORCE_LAB_PLATING);
		GameRegistry.registerItem(hammer = new Hammer(Names.HAMMER).setCreativeTab(CreativeTabs.tabMisc).setFull3D().setMaxStackSize(1), Names.HAMMER);
		GameRegistry.registerItem(polish = new BasicItem(Names.POLISH).setCreativeTab(CreativeTabs.tabMisc).setContainerItem(Items.bowl).setMaxStackSize(8), Names.POLISH);
		GameRegistry.registerItem(nutrientbar = new NutrientBar(6, 0.5F, false, Names.NUTRIENT_BAR), Names.NUTRIENT_BAR);
	}
}
