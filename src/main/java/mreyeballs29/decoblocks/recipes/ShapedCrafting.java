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
		GameRegistry.addRecipe(new ItemStack(ModBlocks.cream, 2), new Object[] {"AAA", "ABA", "AAA", 'A', Items.snowball, 'B', Items.milk_bucket});
		for (int i = 0; i < 16; ++i) {
			GameRegistry.addRecipe(new ItemStack(ModBlocks.colorporcelain, 8, i), new Object[] {"AAA", "ABA", "AAA", 'A', ModBlocks.porcelainblock, 'B', new ItemStack(Items.dye, 1, (~i & 15))});
		}
		GameRegistry.addRecipe(new ItemStack(ModBlocks.specialstone, 1, 1), new Object[] {" A ", "ABA", " A ", 'A', Items.iron_ingot, 'B', new ItemStack(Blocks.stonebrick, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.specialstone, 4, 2), new Object[] {"AB", "BA", 'A', new ItemStack(Blocks.stonebrick, 1, 0), 'B', new ItemStack(ModBlocks.specialstone, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.specialstone, 4, 3), new Object[] {"AA", "AA", 'A', new ItemStack(ModBlocks.specialstone, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.specialstone, 4, 4), new Object[] {"AA", "AA", 'A', new ItemStack(Blocks.stonebrick, 1, 0)});
	}
}
