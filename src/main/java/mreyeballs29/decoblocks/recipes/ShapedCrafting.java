package mreyeballs29.decoblocks.recipes;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlocks;
import mreyeballs29.decoblocks.block.ModBlocks;
import mreyeballs29.decoblocks.item.ModItems;
import mreyeballs29.decoblocks.libs.Patterns;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public final class ShapedCrafting {
	public static final void init() {
		GameRegistry.addRecipe(new ItemStack(ModItems.clayball, 4), new Object[]{"AB", "BA", 'A', Items.clay_ball, 'B', Blocks.dirt});
		GameRegistry.addRecipe(new ItemStack(Blocks.sand), new Object[]{"AA", "AA", 'A', ModItems.sand});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.porcelainpowder), new Object[]{"AB", "BA", 'A', ModItems.sand, 'B', ModItems.clayball});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cream, 2), new Object[] {"AAA", "ABA", "AAA", 'A', Items.snowball, 'B', Items.milk_bucket});
		GameRegistry.addRecipe(new ItemStack(ModItems.labplating, 16), new Object[] {"ABA", "B B", "ABA", 'A', Items.iron_ingot, 'B', Items.quartz});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.labblock, 32, 0), new Object[] {"AA", "AA", 'A', ModItems.labplating});
		GameRegistry.addRecipe(new ItemStack(ModItems.forcelabplating, 4), new Object[] {"ABA", "CDC", "ABA", 'A', Items.iron_ingot, 'B', Items.quartz, 'C', ModItems.labplating, 'D', Items.diamond});
		GameRegistry.addRecipe(new ItemStack(ModItems.hammer), new Object[] {"ABA", "ABA", " B ", 'A', Items.iron_ingot, 'B', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.polish), new Object[] {"A", "B", 'A', ModBlocks.cream, 'B', Items.bowl});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.lablamp), new Object[] {"ABA", "B B", "ABA", 'A', ModItems.labplating, 'B', Items.glowstone_dust});
		for (int i = 0; i < 16; ++i) {
			GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, i), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, (~i & 15))});
		}
		Patterns.RockPatternShaper(ModBlocks.porcelainblock);
		Patterns.StonePatternShaper(ModBlocks.specialstone, Blocks.stonebrick, Blocks.stone);
		Patterns.PatternShaper(ModBlocks.labblock);
		if(Loader.isModLoaded("GalacticraftMars")) {
			Patterns.MarsPatternShaper(ModBlocks.marsstone, MarsBlocks.marsBlock);
		}
	}
}
