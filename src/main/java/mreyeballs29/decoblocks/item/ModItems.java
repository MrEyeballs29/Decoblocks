package mreyeballs29.decoblocks.item;

import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.block.ModBlocks;
import mreyeballs29.decoblocks.libs.ItemMaterial;
import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public final class ModItems {
	public static Item labplating = new BasicItem("lab_plating", "itemLabPlate");
	public static Item forcelabplating = new BasicItem("force_lab_plating", "itemForceLabPlate");
	public static Item nutrientbar = new NutrientBar(7, 0.25F, false, "nutrient_bar", "foodNutrientBar");
	public static Item hammer = new ItemTool("hammer", true);
	public static Item polish = new ItemTool("polish", false).setContainerItem(Items.bowl);
	public static Item ingot = new ItemIngot("ingot").setCreativeTab(ModBlocks.TabDecoClassic);
	public static Item nugget = new ItemNugget("nugget").setCreativeTab(ModBlocks.TabDecoClassic);
	public static Item chain = new BasicItem("chain", "itemChain");
	public static Item gem = new ItemGem("gem");

	public static ItemToolPickaxe[] metalpickaxe = new ItemToolPickaxe[16];
	public static ItemToolAxe[] metalaxe = new ItemToolAxe[16];
	public static ItemToolSpade[] metalshovel = new ItemToolSpade[16];
	public static ItemToolHoe[] metalhoe = new ItemToolHoe[16];
	public static ItemToolSword[] metalsword = new ItemToolSword[16];
	
	public static ItemToolPickaxe[] gempickaxe = new ItemToolPickaxe[9];
	public static ItemToolAxe[] gemaxe = new ItemToolAxe[9];
	public static ItemToolSpade[] gemshovel = new ItemToolSpade[9];
	public static ItemToolHoe[] gemhoe = new ItemToolHoe[9];
	public static ItemToolSword[] gemsword = new ItemToolSword[9];

	public static final ToolMaterial[] toolmetalMaterial = new Item.ToolMaterial[16];
	public static final ToolMaterial[] toolgemMaterial = new Item.ToolMaterial[9];

	public static final void init() {
		ItemMaterial.addSets();
		for (int i = 0; i < 16; i++) {
			if (i == 1 || i == 9) {
				continue;
			}
			toolmetalMaterial[i] = ItemMaterial.setToolMaterial(ItemMaterial.toolmaterialsets[i])
					.setRepairItem(new ItemStack(ingot, 1, i));
			metalpickaxe[i] = new ItemToolPickaxe(toolmetalMaterial[i], Names.MetalRegname(Names.METALS[i], 7),
					Names.MetalUnlocalizedName(Names.METALS[i], 7));
			metalaxe[i] = new ItemToolAxe(toolmetalMaterial[i], Names.MetalRegname(Names.METALS[i], 8),
					Names.MetalUnlocalizedName(Names.METALS[i], 8));
			metalshovel[i] = new ItemToolSpade(toolmetalMaterial[i], Names.MetalRegname(Names.METALS[i], 9),
					Names.MetalUnlocalizedName(Names.METALS[i], 9));
			metalhoe[i] = new ItemToolHoe(toolmetalMaterial[i], Names.MetalRegname(Names.METALS[i], 10),
					Names.MetalUnlocalizedName(Names.METALS[i], 10));
			metalsword[i] = new ItemToolSword(toolmetalMaterial[i], Names.MetalRegname(Names.METALS[i], 11),
					Names.MetalUnlocalizedName(Names.METALS[i], 11));
		}
		for (int i = 0; i < 9; i++) {
			toolgemMaterial[i] = ItemMaterial.setToolMaterial(ItemMaterial.toolmaterialsets[(i+16)]);
			if (i < 1) {
				toolgemMaterial[i].setRepairItem(new ItemStack(Items.emerald, 1, 0));
			} else {
				toolgemMaterial[i].setRepairItem(new ItemStack(ModItems.gem, 1, (i-1)));
			}
			gempickaxe[i] = new ItemToolPickaxe(toolgemMaterial[i], Names.MetalRegname(Names.REGGEMS[i], 7),
					Names.MetalUnlocalizedName(Names.GEMS2[i], 7));
			gemaxe[i] = new ItemToolAxe(toolgemMaterial[i], Names.MetalRegname(Names.REGGEMS[i], 8),
					Names.MetalUnlocalizedName(Names.GEMS2[i], 8));
			gemshovel[i] = new ItemToolSpade(toolgemMaterial[i], Names.MetalRegname(Names.REGGEMS[i], 9),
					Names.MetalUnlocalizedName(Names.GEMS2[i], 9));
			gemhoe[i] = new ItemToolHoe(toolgemMaterial[i], Names.MetalRegname(Names.REGGEMS[i], 10),
					Names.MetalUnlocalizedName(Names.GEMS2[i], 10));
			gemsword[i] = new ItemToolSword(toolgemMaterial[i], Names.MetalRegname(Names.REGGEMS[i], 11),
					Names.MetalUnlocalizedName(Names.GEMS2[i], 11));
		}
		GameRegistry.registerItem(labplating, "lab_plating");
		GameRegistry.registerItem(forcelabplating, "force_lab_plating");
		GameRegistry.registerItem(ingot, "ingot");
		GameRegistry.registerItem(nugget, "nugget");
		GameRegistry.registerItem(chain, "chain");
		GameRegistry.registerItem(gem, "gem");
		GameRegistry.registerItem(hammer, Names.HAMMER);
		GameRegistry.registerItem(polish, Names.POLISH);
		GameRegistry.registerItem(nutrientbar, Names.NUTRIENT_BAR);
		for (int i = 0; i < 16; i++) {
			if (i == 1 || i == 9) {
				continue;
			}
			GameRegistry.registerItem(metalpickaxe[i].setCreativeTab(ModBlocks.TabDecoClassic),
					Names.MetalRegname(Names.METALS[i], 7));
			GameRegistry.registerItem(metalaxe[i].setCreativeTab(ModBlocks.TabDecoClassic),
					Names.MetalRegname(Names.METALS[i], 8));
			GameRegistry.registerItem(metalshovel[i].setCreativeTab(ModBlocks.TabDecoClassic),
					Names.MetalRegname(Names.METALS[i], 9));
			GameRegistry.registerItem(metalhoe[i].setCreativeTab(ModBlocks.TabDecoClassic),
					Names.MetalRegname(Names.METALS[i], 10));
			GameRegistry.registerItem(metalsword[i].setCreativeTab(ModBlocks.TabDecoClassic),
					Names.MetalRegname(Names.METALS[i], 11));
		}
		for (int i = 0; i < 9; i++) {
			GameRegistry.registerItem(gempickaxe[i].setCreativeTab(ModBlocks.TabDecoClassic), Names.MetalRegname(Names.REGGEMS[i], 7));
			GameRegistry.registerItem(gemaxe[i].setCreativeTab(ModBlocks.TabDecoClassic), Names.MetalRegname(Names.REGGEMS[i], 8));
			GameRegistry.registerItem(gemshovel[i].setCreativeTab(ModBlocks.TabDecoClassic), Names.MetalRegname(Names.REGGEMS[i], 9));
			GameRegistry.registerItem(gemhoe[i].setCreativeTab(ModBlocks.TabDecoClassic), Names.MetalRegname(Names.REGGEMS[i], 10));
			GameRegistry.registerItem(gemsword[i].setCreativeTab(ModBlocks.TabDecoClassic), Names.MetalRegname(Names.REGGEMS[i], 11));
		}
	}

	public static void ItemRegisterOre() {
		for (int i = 0; i < Names.METALS.length; i++) {
			OreDictionary.registerOre((Names.MetalUnlocalizedName(Names.METALS[i], 0)),
					new ItemStack(ModItems.ingot, 1, i));
		}
		for (int i = 0; i < Names.METALS2.length; i++) {
			OreDictionary.registerOre(Names.MetalUnlocalizedName(Names.METALS2[i], 2),
					new ItemStack(ModItems.nugget, 1, i));
		}
		for (int i = 0; i < 8; i++) {
			OreDictionary.registerOre(Names.GemUnlocalizedName(Names.GEMS[i]), new ItemStack(ModItems.gem, 1, i));
		}
	}
}
