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
	public static Item clayball;
	public static Item sand;
	public static Item labplating;
	public static Item forcelabplating;
	public static Item nutrientbar;
	public static Item hammer;
	public static Item polish;
	public static Item ingot = new ItemIngot(Names.INGOT).setCreativeTab(ModBlocks.TabDecoClassic);
	public static Item nugget;

	public static ItemToolPickaxe[] metalpickaxe = new ItemToolPickaxe[16];
	public static ItemToolAxe[] metalaxe = new ItemToolAxe[16];
	public static ItemToolSpade[] metalshovel = new ItemToolSpade[16];
	public static ItemToolHoe[] metalhoe = new ItemToolHoe[16];
	public static ItemToolSword[] metalsword = new ItemToolSword[16];

	public static final ToolMaterial[] toolMaterial = new Item.ToolMaterial[16];

	public static final void init() {
		ItemMaterial.addSets();
		for (int i = 0; i < 16; i++) {
			if (i == 1 || i == 9) {
				continue;
			}
			toolMaterial[i] = ItemMaterial.setToolMaterial(ItemMaterial.toolmaterialsets[i])
					.setRepairItem(new ItemStack(ingot, 1, i));
			metalpickaxe[i] = new ItemToolPickaxe(toolMaterial[i], Names.MetalRegname(Names.METALS[i], 7),
					Names.MetalUnlocalizedName(Names.METALS[i], 7));
			metalaxe[i] = new ItemToolAxe(toolMaterial[i], Names.MetalRegname(Names.METALS[i], 8),
					Names.MetalUnlocalizedName(Names.METALS[i], 8));
			metalshovel[i] = new ItemToolSpade(toolMaterial[i], Names.MetalRegname(Names.METALS[i], 9),
					Names.MetalUnlocalizedName(Names.METALS[i], 9));
			metalhoe[i] = new ItemToolHoe(toolMaterial[i], Names.MetalRegname(Names.METALS[i], 10),
					Names.MetalUnlocalizedName(Names.METALS[i], 10));
			metalsword[i] = new ItemToolSword(toolMaterial[i], Names.MetalRegname(Names.METALS[i], 11),
					Names.MetalUnlocalizedName(Names.METALS[i], 11));
		}
		GameRegistry.registerItem(clayball = new BasicItem(Names.CLAY_ROUND).setCreativeTab(ModBlocks.TabDecoClassic),
				Names.CLAY_ROUND);
		GameRegistry.registerItem(sand = new BasicItem(Names.SAND_DUST).setCreativeTab(ModBlocks.TabDecoClassic),
				Names.SAND_DUST);
		GameRegistry.registerItem(
				labplating = new BasicItem(Names.LAB_PLATING).setCreativeTab(ModBlocks.TabDecoClassic),
				Names.LAB_PLATING);
		GameRegistry.registerItem(
				forcelabplating = new BasicItem(Names.FORCE_LAB_PLATING).setCreativeTab(ModBlocks.TabDecoClassic),
				Names.FORCE_LAB_PLATING);
		GameRegistry.registerItem(ingot, Names.INGOT);
		GameRegistry.registerItem(nugget = new ItemNugget(Names.NUGGET).setCreativeTab(ModBlocks.TabDecoClassic),
				Names.NUGGET);
		GameRegistry.registerItem(hammer = new ItemResuseAble(Names.HAMMER).setCreativeTab(ModBlocks.TabDecoClassic)
				.setFull3D().setMaxStackSize(1), Names.HAMMER);
		GameRegistry.registerItem(polish = new ItemResuseAble(Names.POLISH).setCreativeTab(ModBlocks.TabDecoClassic)
				.setContainerItem(Items.bowl).setMaxStackSize(1), Names.POLISH);
		GameRegistry.registerItem(nutrientbar = new NutrientBar(7, 0.25F, false, Names.NUTRIENT_BAR),
				Names.NUTRIENT_BAR);
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
	}
}
