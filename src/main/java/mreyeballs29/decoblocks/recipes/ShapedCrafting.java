package mreyeballs29.decoblocks.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.block.ModBlocks;
import mreyeballs29.decoblocks.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public final class ShapedCrafting {
	public static final void init() {
		GameRegistry.addRecipe(new ItemStack(ModItems.clayball, 4), new Object[]{"AB", "BA", 'A', Items.clay_ball, 'B', Blocks.dirt});
		GameRegistry.addRecipe(new ItemStack(Blocks.sand), new Object[]{"AA", "AA", 'A', ModItems.sand});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.porcelainpowder), new Object[]{"AB", "BA", 'A', ModItems.sand, 'B', ModItems.clayball});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cream), new Object[] {"AAA", "ABA", "AAA", 'A', Items.snowball, 'B', Items.milk_bucket});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, 0), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, 15)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, 1), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, 14)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, 2), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, 13)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, 3), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, 12)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, 4), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, 11)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, 5), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, 10)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, 6), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, 9)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, 7), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, 8)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, 8), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, 7)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, 9), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, 6)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, 10), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, 11), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, 12), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, 13), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, 14), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, 15), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, 0)});
	}
}
