package mreyeballs29.decoblocks.item;

import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.block.ModBlocks;
import mreyeballs29.decoblocks.libs.Metals;
import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

public final class ModItems {
	public static Item clayball;
	public static Item sand;
	public static Item labplating;
	public static Item forcelabplating;
	public static Item nutrientbar;
	public static Item hammer;
	public static Item polish;
	public static Item ingot = new ItemIngot(Names.INGOT).setCreativeTab(ModBlocks.TabDecoClassic);
	public static Item nugget;
	
	public static Item copperpick;
	public static Item copperaxe;
	public static Item copperspade;
	public static Item copperhoe;
	public static Item coppersword;
	
	public static Item silverpick;
	public static Item silveraxe;
	public static Item silverspade;
	public static Item silverhoe;
	public static Item silversword;
	
	public static Item leadpick;
	public static Item leadaxe;
	public static Item leadspade;
	public static Item leadhoe;
	public static Item leadsword;
	
	public static Item nickelpick;
	public static Item nickelaxe;
	public static Item nickelspade;
	public static Item nickelhoe;
	public static Item nickelsword;
	
	public static final Item.ToolMaterial[] toolMaterial = new Item.ToolMaterial[16];
	
	public static final void init() {
		for (int i = 0; i < 16; i++) {
			if (i == 1) {continue;}
			if (i == 9) {continue;}
			toolMaterial[i] = EnumHelper.addToolMaterial(Metals.getMaterials(Metals.NAME[i]), Metals.getHarvestLevels(i), Metals.getUses(i), Metals.getEfficiency(i), Metals.getDamage(i), Metals.getEnchantability(i)).setRepairItem(new ItemStack(ModItems.ingot, 1, i));
		}
		GameRegistry.registerItem(clayball = new BasicItem(Names.CLAY_ROUND).setCreativeTab(ModBlocks.TabDecoClassic), Names.CLAY_ROUND);
		GameRegistry.registerItem(sand = new BasicItem(Names.SAND_DUST).setCreativeTab(ModBlocks.TabDecoClassic), Names.SAND_DUST);
		GameRegistry.registerItem(labplating = new BasicItem(Names.LAB_PLATING).setCreativeTab(ModBlocks.TabDecoClassic), Names.LAB_PLATING);
		GameRegistry.registerItem(forcelabplating = new BasicItem(Names.FORCE_LAB_PLATING).setCreativeTab(ModBlocks.TabDecoClassic), Names.FORCE_LAB_PLATING);
		GameRegistry.registerItem(ingot, Names.INGOT);
		GameRegistry.registerItem(nugget = new ItemNugget(Names.NUGGET).setCreativeTab(ModBlocks.TabDecoClassic), Names.NUGGET);
		GameRegistry.registerItem(hammer = new ItemResuseAble(Names.HAMMER).setCreativeTab(ModBlocks.TabDecoClassic).setFull3D().setMaxStackSize(1), Names.HAMMER);
		GameRegistry.registerItem(polish = new ItemResuseAble(Names.POLISH).setCreativeTab(ModBlocks.TabDecoClassic).setContainerItem(Items.bowl).setMaxStackSize(1), Names.POLISH);
		GameRegistry.registerItem(copperpick = new ItemToolPickaxe(toolMaterial[0], "copper_pickaxe", "pickaxeCopper").setCreativeTab(ModBlocks.TabDecoClassic), "copper_pickaxe");
		GameRegistry.registerItem(copperaxe = new ItemToolAxe(toolMaterial[0], "copper_axe", "hachetCopper").setCreativeTab(ModBlocks.TabDecoClassic), "copper_axe");
		GameRegistry.registerItem(copperspade = new ItemToolSpade(toolMaterial[0], "copper_shovel", "shovelCopper").setCreativeTab(ModBlocks.TabDecoClassic), "copper_shovel");
		GameRegistry.registerItem(copperhoe = new ItemToolHoe(toolMaterial[0], "copper_hoe", "hoeCopper").setCreativeTab(ModBlocks.TabDecoClassic), "copper_hoe");
		GameRegistry.registerItem(coppersword = new ItemToolSword(toolMaterial[0], "copper_sword", "swordCopper").setCreativeTab(ModBlocks.TabDecoClassic), "copper_sword");
		GameRegistry.registerItem(silverpick = new ItemToolPickaxe(toolMaterial[2], "silver_pickaxe", "pickaxeSilver").setCreativeTab(ModBlocks.TabDecoClassic), "silver_pickaxe");
		GameRegistry.registerItem(silveraxe = new ItemToolAxe(toolMaterial[2], "silver_axe", "hachetSilver").setCreativeTab(ModBlocks.TabDecoClassic), "silver_axe");
		GameRegistry.registerItem(silverspade = new ItemToolSpade(toolMaterial[2], "silver_shovel", "shovelSilver").setCreativeTab(ModBlocks.TabDecoClassic), "silver_shovel");
		GameRegistry.registerItem(silverhoe = new ItemToolHoe(toolMaterial[2], "silver_hoe", "hoeSilver").setCreativeTab(ModBlocks.TabDecoClassic), "silver_hoe");
		GameRegistry.registerItem(silversword = new ItemToolSword(toolMaterial[2], "silver_sword", "swordSilver").setCreativeTab(ModBlocks.TabDecoClassic), "silver_sword");
		GameRegistry.registerItem(leadpick = new ItemToolPickaxe(toolMaterial[3], "lead_pickaxe", "pickaxeLead").setCreativeTab(ModBlocks.TabDecoClassic), "lead_pickaxe");
		GameRegistry.registerItem(leadaxe = new ItemToolAxe(toolMaterial[3], "lead_axe", "hachetLead").setCreativeTab(ModBlocks.TabDecoClassic), "lead_axe");
		GameRegistry.registerItem(leadspade = new ItemToolSpade(toolMaterial[3], "lead_shovel", "shovelLead").setCreativeTab(ModBlocks.TabDecoClassic), "lead_shovel");
		GameRegistry.registerItem(leadhoe = new ItemToolHoe(toolMaterial[3], "lead_hoe", "hoeLead").setCreativeTab(ModBlocks.TabDecoClassic), "lead_hoe");
		GameRegistry.registerItem(leadsword = new ItemToolSword(toolMaterial[3], "lead_sword", "swordLead").setCreativeTab(ModBlocks.TabDecoClassic), "lead_sword");
		GameRegistry.registerItem(nickelpick = new ItemToolPickaxe(toolMaterial[4], "nickel_pickaxe", "pickaxeNickel").setCreativeTab(ModBlocks.TabDecoClassic), "nickel_pickaxe");
		GameRegistry.registerItem(nickelaxe = new ItemToolAxe(toolMaterial[4], "nickel_axe", "hachetNickel").setCreativeTab(ModBlocks.TabDecoClassic), "nickel_axe");
		GameRegistry.registerItem(nickelspade = new ItemToolSpade(toolMaterial[4], "nickel_shovel", "shovelNickel").setCreativeTab(ModBlocks.TabDecoClassic), "nickel_shovel");
		GameRegistry.registerItem(nickelhoe = new ItemToolHoe(toolMaterial[4], "nickel_hoe", "hoeNickel").setCreativeTab(ModBlocks.TabDecoClassic), "nickel_hoe");
		GameRegistry.registerItem(nickelsword = new ItemToolSword(toolMaterial[4], "nickel_sword", "swordNickel").setCreativeTab(ModBlocks.TabDecoClassic), "nickel_sword");
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
