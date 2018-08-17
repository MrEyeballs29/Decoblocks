package mreyeballs29.decoblocks.item.crafting;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlocks;
import mreyeballs29.decoblocks.block.ModBlocks;
import mreyeballs29.decoblocks.item.ModItems;
import mreyeballs29.decoblocks.libs.Names;
import mreyeballs29.decoblocks.libs.Patterns;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public final class ShapedCrafting {
	public static final void init() {
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.porcelainpowder), new Object[] {"ZY", "YZ", 'Z', "itemClay", 'Y', "sand"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.porcelainpowder), new Object[] {"YZ", "ZY", 'Z', "itemClay", 'Y', "sand"}));
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cream, 2), new Object[] {"AAA", "ABA", "AAA", 'A', Items.snowball, 'B', Items.milk_bucket});
		GameRegistry.addRecipe(new ItemStack(ModItems.labplating, 16), new Object[] {"ABA", "B B", "ABA", 'A', Items.iron_ingot, 'B', Items.quartz});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.labblock, 32, 0), new Object[] {"AA", "AA", 'A', ModItems.labplating});
		GameRegistry.addRecipe(new ItemStack(ModItems.forcelabplating, 4), new Object[] {"ABA", "CDC", "ABA", 'A', Items.iron_ingot, 'B', Items.quartz, 'C', ModItems.labplating, 'D', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(ModItems.hammer), new Object[] {"ABA", "ABA", " B ", 'A', Items.iron_ingot, 'B', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.polish), new Object[] {"A", "B", 'A', ModBlocks.cream, 'B', Items.bowl});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.lablamp), new Object[] {"ABA", "B B", "ABA", 'A', ModItems.labplating, 'B', Items.glowstone_dust});
		for (int i = 0; i < 16; i++) {
			GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, i), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, (~i & 15))});
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.nugget, 9, (i + 1)), new Object[] {"Z", 'Z', (Names.INGOT + Names.TitleCase(Names.METALS[i]))}));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingot, 1, i), new Object[] {"ZZZ", "ZZZ", "ZZZ", 'Z', (Names.NUGGET + Names.TitleCase(Names.METALS[i]))}));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.storagemetalblock, 1, i), new Object[] {"ZZZ", "ZZZ", "ZZZ", 'Z', (Names.INGOT + Names.TitleCase(Names.METALS[i]))}));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.ingot, 9, i), new Object[] {"Z", 'Z', ("block" + Names.TitleCase(Names.METALS[i]))}));
		}
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.nugget, 9, 0), new Object[] {"Z", 'Z', "ingotIron"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_ingot), new Object[] {"ZZZ", "ZZZ", "ZZZ", 'Z', "nuggetIron"}));
		for (int i = 0; i < 16; i++) {
			if (i == 1 || i == 9) {
				continue;
			}
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.metalpickaxe[i]), new Object[] {"ZZZ", " Y ", " Y ", 'Z', Names.MetalUnlocalizedName(Names.METALS[i], 0), 'Y', "stickWood"}));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.metalaxe[i]), new Object[] {"ZZ", "ZY", " Y", 'Z', Names.MetalUnlocalizedName(Names.METALS[i], 0), 'Y', "stickWood"}));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.metalshovel[i]), new Object[] {"Z", "Y", "Y", 'Z', Names.MetalUnlocalizedName(Names.METALS[i], 0), 'Y', "stickWood"}));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.metalhoe[i]), new Object[] {"ZZ", " Y", " Y", 'Z', Names.MetalUnlocalizedName(Names.METALS[i], 0), 'Y', "stickWood"}));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.metalsword[i]), new Object[] {"Z", "Z", "Y", 'Z', Names.MetalUnlocalizedName(Names.METALS[i], 0), 'Y', "stickWood"}));
		}
		for (int i = 0; i < 9; i++) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gempickaxe[i]), new Object[] {"ZZZ", " Y ", " Y ", 'Z', Names.GemUnlocalizedName(Names.GEMS2[i]), 'Y', "stickWood"}));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemaxe[i]), new Object[] {"ZZ", "ZY", " Y", 'Z', Names.GemUnlocalizedName(Names.GEMS2[i]), 'Y', "stickWood"}));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemshovel[i]), new Object[] {"Z", "Y", "Y", 'Z', Names.GemUnlocalizedName(Names.GEMS2[i]), 'Y', "stickWood"}));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemhoe[i]), new Object[] {"ZZ", " Y", " Y", 'Z', Names.GemUnlocalizedName(Names.GEMS2[i]), 'Y', "stickWood"}));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemsword[i]), new Object[] {"Z", "Z", "Y", 'Z', Names.GemUnlocalizedName(Names.GEMS2[i]), 'Y', "stickWood"}));
		}
		for (int i = 0; i < 8; i++) {
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.storagegemblock, 1, i), new Object[] {"ZZZ", "ZZZ", "ZZZ", 'Z', Names.GemUnlocalizedName(Names.GEMS[i])}));
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gem, 9, i), new Object[] {"Z", 'Z', Names.MetalUnlocalizedName(Names.GEMS[i], 4)}));
		}
		GameRegistry.addRecipe(new ItemStack(ModBlocks.alloysmelter), new Object[] {"AAA", "BAB", "AAA", 'A', Blocks.cobblestone, 'B', Blocks.furnace});
		Patterns.RockPatternShaper(ModBlocks.porcelainblock);
		Patterns.StonePatternShaper(ModBlocks.specialstone, Blocks.stonebrick, Blocks.stone);
		Patterns.PatternShaper(ModBlocks.labblock);
		if(Loader.isModLoaded("GalacticraftMars")) {
			Patterns.MarsPatternShaper(ModBlocks.marsstone, MarsBlocks.marsBlock);
		}
	}
}
