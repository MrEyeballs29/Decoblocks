package mreyeballs29.decoblocks.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.block.ModBlocks;
import mreyeballs29.decoblocks.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public final class ShapelessCrafting {
	public static final void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sand, 4), new Object[] {Blocks.sand});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.colorporcelain, 1, 0), new Object[] {ModBlocks.porcelainblock, new ItemStack(Items.dye, 1, 15)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.colorporcelain, 1, 1), new Object[] {ModBlocks.porcelainblock, new ItemStack(Items.dye, 1, 14)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.colorporcelain, 1, 2), new Object[] {ModBlocks.porcelainblock, new ItemStack(Items.dye, 1, 13)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.colorporcelain, 1, 3), new Object[] {ModBlocks.porcelainblock, new ItemStack(Items.dye, 1, 12)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.colorporcelain, 1, 4), new Object[] {ModBlocks.porcelainblock, new ItemStack(Items.dye, 1, 11)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.colorporcelain, 1, 5), new Object[] {ModBlocks.porcelainblock, new ItemStack(Items.dye, 1, 10)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.colorporcelain, 1, 6), new Object[] {ModBlocks.porcelainblock, new ItemStack(Items.dye, 1, 9)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.colorporcelain, 1, 7), new Object[] {ModBlocks.porcelainblock, new ItemStack(Items.dye, 1, 8)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.colorporcelain, 1, 8), new Object[] {ModBlocks.porcelainblock, new ItemStack(Items.dye, 1, 7)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.colorporcelain, 1, 9), new Object[] {ModBlocks.porcelainblock, new ItemStack(Items.dye, 1, 6)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.colorporcelain, 1, 10), new Object[] {ModBlocks.porcelainblock, new ItemStack(Items.dye, 1, 5)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.colorporcelain, 1, 11), new Object[] {ModBlocks.porcelainblock, new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.colorporcelain, 1, 12), new Object[] {ModBlocks.porcelainblock, new ItemStack(Items.dye, 1, 3)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.colorporcelain, 1, 13), new Object[] {ModBlocks.porcelainblock, new ItemStack(Items.dye, 1, 2)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.colorporcelain, 1, 14), new Object[] {ModBlocks.porcelainblock, new ItemStack(Items.dye, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.colorporcelain, 1, 15), new Object[] {ModBlocks.porcelainblock, new ItemStack(Items.dye, 1, 0)});
	}
}
