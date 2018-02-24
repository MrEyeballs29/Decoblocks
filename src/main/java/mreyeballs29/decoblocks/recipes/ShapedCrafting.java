package mreyeballs29.decoblocks.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.block.ModBlocks;
import mreyeballs29.decoblocks.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public final class ShapedCrafting {
	public static final Block[] ArrayIt = {ModBlocks.porcelainblock, ModBlocks.labblock};
	
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
		for (int i = 0; i < ArrayIt.length; ++i) {
			GameRegistry.addRecipe(new ItemStack(ArrayIt[i], 1, 2), new Object[] {"AA", "AA", 'A', new ItemStack(ArrayIt[i], 1, 0)});
			GameRegistry.addRecipe(new ItemStack(ArrayIt[i], 4, 7), new Object[] {"AB", "BA", 'A', new ItemStack(ArrayIt[i], 1, 2), 'B', new ItemStack(ArrayIt[i], 1, 0)});
			GameRegistry.addRecipe(new ItemStack(ArrayIt[i], 4, 7), new Object[] {"BA", "AB", 'A', new ItemStack(ArrayIt[i], 1, 2), 'B', new ItemStack(ArrayIt[i], 1, 0)});
			GameRegistry.addRecipe(new ItemStack(ArrayIt[i], 4, 8), new Object[] {"AA", "AA", 'A', new ItemStack(ArrayIt[i], 1, 5)});
			GameRegistry.addRecipe(new ItemStack(ArrayIt[i], 4, 9), new Object[] {"AA", "AA", 'A', new ItemStack(ArrayIt[i], 1, 2)});
			GameRegistry.addRecipe(new ItemStack(ArrayIt[i], 2, 10), new Object[] {"A ", " A", 'A', new ItemStack(ArrayIt[i], 1, 5)});
			GameRegistry.addRecipe(new ItemStack(ArrayIt[i], 2, 11), new Object[] {" A", "A ", 'A', new ItemStack(ArrayIt[i], 1, 5)});
			GameRegistry.addRecipe(new ItemStack(ArrayIt[i], 4, 12), new Object[] {"AB", "BA", 'A', new ItemStack(ArrayIt[i], 1, 2), 'B', new ItemStack(ArrayIt[i], 1, 8)});
			GameRegistry.addRecipe(new ItemStack(ArrayIt[i], 4, 12), new Object[] {"BA", "AB", 'A', new ItemStack(ArrayIt[i], 1, 2), 'B', new ItemStack(ArrayIt[i], 1, 8)});
			GameRegistry.addRecipe(new ItemStack(ArrayIt[i], 2, 14), new Object[] {"A ", " A", 'A', new ItemStack(ArrayIt[i], 1, 8)});
			GameRegistry.addRecipe(new ItemStack(ArrayIt[i], 2, 15), new Object[] {" A", "A ", 'A', new ItemStack(ArrayIt[i], 1, 8)});
			GameRegistry.addRecipe(new ItemStack(ArrayIt[i], 1, 0), new Object[] {"A", 'A', new ItemStack(ArrayIt[i], 0, 1)});
		}
		for (int i = 2; i < 16; ++i) {
			GameRegistry.addRecipe(new ItemStack(ModBlocks.labblock, 1, 0), new Object[] {"A", 'A', new ItemStack(ModBlocks.labblock, 0, i)});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.porcelainblock, 1, 0), new Object[] {"A", 'A', new ItemStack(ModBlocks.porcelainblock, 0, i)});
		}
		GameRegistry.addRecipe(new ItemStack(ModBlocks.specialstone, 4, 1), new Object[] {"BAB", "A A", "BAB", 'A', Items.iron_ingot, 'B', new ItemStack(Blocks.stonebrick, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.specialstone, 4, 2), new Object[] {"AB", "BA", 'A', new ItemStack(Blocks.stonebrick, 1, 0), 'B', Blocks.stone});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.specialstone, 4, 2), new Object[] {"BA", "AB", 'A', new ItemStack(Blocks.stonebrick, 1, 0), 'B', Blocks.stone});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.specialstone, 4, 3), new Object[] {"AA", "AA", 'A', new ItemStack(ModBlocks.specialstone, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.specialstone, 4, 4), new Object[] {"AA", "AA", 'A', new ItemStack(Blocks.stonebrick, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.specialstone, 2, 5), new Object[] {"A ", " A", 'A', new ItemStack(ModBlocks.specialstone, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.specialstone, 2, 6), new Object[] {" A", "A ", 'A', new ItemStack(ModBlocks.specialstone, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.specialstone, 4, 7), new Object[] {"AB", "BA", 'A', new ItemStack(Blocks.stonebrick, 1, 0), 'B', new ItemStack(ModBlocks.specialstone, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.specialstone, 4, 7), new Object[] {"BA", "AB", 'A', new ItemStack(Blocks.stonebrick, 1, 0), 'B', new ItemStack(ModBlocks.specialstone, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.specialstone, 4, 9), new Object[] {"A ", " A", 'A', new ItemStack(ModBlocks.specialstone, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.specialstone, 4, 10), new Object[] {" A", "A ", 'A', new ItemStack(ModBlocks.specialstone, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.porcelainblock, 4, 6), new Object[] {"BAB", "A A", "BAB", 'A', Items.iron_ingot, 'B', new ItemStack(ModBlocks.porcelainblock, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.labblock, 1, 6), new Object[] {"BAB", "A A", "BAB", 'A', ModItems.forcelabplating, 'B', new ItemStack(ModBlocks.labblock, 1, 2)});
	}
}
