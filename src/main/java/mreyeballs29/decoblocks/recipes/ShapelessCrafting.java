package mreyeballs29.decoblocks.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.block.ModBlocks;
import mreyeballs29.decoblocks.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public final class ShapelessCrafting {
	public static final Block[] ArrayIt2 = {ModBlocks.porcelainblock, ModBlocks.labblock};
	
	public static final void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sand, 4), new Object[] {Blocks.sand});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.nutrientbar, 8), new Object[] {ModBlocks.cream, Items.cooked_chicken});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.nutrientbar, 8), new Object[] {ModBlocks.cream, Items.cooked_beef});
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.nutrientbar, 8), new Object[] {ModBlocks.cream, Items.cooked_porkchop});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.wheat_seeds, 1), new Object[] {Items.wheat});
		for (int i = 0; i < 16; ++i) {
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.colorporcelain, 1, i), new Object[] {ModBlocks.porcelainblock, new ItemStack(Items.dye, 1, (~i & 15))});
		}
		for (int i = 0; i < ArrayIt2.length; ++i) {
			GameRegistry.addShapelessRecipe(new ItemStack(ArrayIt2[i], 1, 1), new Object[] {new ItemStack(ArrayIt2[i], 1, 0), ModItems.hammer});
			GameRegistry.addShapelessRecipe(new ItemStack(ArrayIt2[i], 1, 3), new Object[] {new ItemStack(ArrayIt2[i], 1, 2), ModItems.hammer});
			GameRegistry.addShapelessRecipe(new ItemStack(ArrayIt2[i], 1, 13), new Object[] {new ItemStack(ArrayIt2[i], 1, 5), ModItems.polish});
			GameRegistry.addShapelessRecipe(new ItemStack(ArrayIt2[i], 1, 4), new Object[] {new ItemStack(ArrayIt2[i], 1, 13), ModItems.polish});
		}
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stonebrick, 1, 2), new Object[] {new ItemStack(Blocks.stonebrick, 1, 0), ModItems.hammer});
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.specialstone, 1, 8), new Object[] {new ItemStack(ModBlocks.specialstone, 1, 0), ModItems.polish});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stonebrick, 1, 3), new Object[] {new ItemStack(ModBlocks.specialstone, 1, 8), ModItems.polish});
	}
}
