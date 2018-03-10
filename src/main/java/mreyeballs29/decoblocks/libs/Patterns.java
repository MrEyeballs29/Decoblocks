package mreyeballs29.decoblocks.libs;

import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Patterns {
	public static void RockPatternShaper(Block block) {
		for (int i = 1; i < 15; i++) {
		if (i == 5) { continue; };
		GameRegistry.addRecipe(new ItemStack(block, 1, 0), new Object[] {"A", 'A', new ItemStack(block, 1, i)});
		}
		GameRegistry.addRecipe(new ItemStack(block, 1, 5), new Object[] {" B ", "BAB", " B ", 'A', new ItemStack(block, 1, 0), 'B', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(block, 4, 1), new Object[] {"AA", "AA", 'A', new ItemStack(block, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 6), new Object[] {"AB", "BA", 'A', new ItemStack(block, 1, 1), 'B', new ItemStack(block, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 6), new Object[] {"BA", "AB", 'A', new ItemStack(block, 1, 1), 'B', new ItemStack(block, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 7), new Object[] {"AA", "AA", 'A', new ItemStack(block, 1, 6)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 8), new Object[] {"AA", "AA", 'A', new ItemStack(block, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(block, 2, 9), new Object[] {"A ", " A", 'A', new ItemStack(block, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(block, 2, 10), new Object[] {" A", "A ", 'A', new ItemStack(block, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 11), new Object[] {"AB", "BA", 'A', new ItemStack(block, 1, 1), 'B', new ItemStack(block, 1, 6)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 11), new Object[] {"BA", "AB", 'A', new ItemStack(block, 1, 1), 'B', new ItemStack(block, 1, 6)});
		GameRegistry.addRecipe(new ItemStack(block, 2, 13), new Object[] {"A ", " A", 'A', new ItemStack(block, 1, 4)});
		GameRegistry.addRecipe(new ItemStack(block, 2, 14), new Object[] {" A", "A ", 'A', new ItemStack(block, 1, 4)});
		GameRegistry.addShapelessRecipe(new ItemStack(block, 1, 2), new Object[] {new ItemStack(block, 1, 1), ModItems.hammer});
		GameRegistry.addShapelessRecipe(new ItemStack(block, 1, 12), new Object[] {new ItemStack(block, 1, 4), ModItems.polish});
		GameRegistry.addShapelessRecipe(new ItemStack(block, 1, 3), new Object[] {new ItemStack(block, 1, 12), ModItems.polish});
		GameRegistry.addSmelting(new ItemStack(block, 1, 0), new ItemStack(block, 1, 4), 0.1F);
	}
	public static void PatternShaper(Block block) {
		for (int i = 1; i < 13; i++) {
		GameRegistry.addRecipe(new ItemStack(block, 1, 0), new Object[] {"A", 'A', new ItemStack(block, 1, i)});
		}
		GameRegistry.addRecipe(new ItemStack(block, 4, 1), new Object[] {"AA", "AA", 'A', new ItemStack(block, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 4), new Object[] {"AB", "BA", 'A', new ItemStack(block, 1, 1), 'B', new ItemStack(block, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 4), new Object[] {"BA", "AB", 'A', new ItemStack(block, 1, 1), 'B', new ItemStack(block, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 5), new Object[] {"AA", "AA", 'A', new ItemStack(block, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 6), new Object[] {"AA", "AA", 'A', new ItemStack(block, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(block, 2, 7), new Object[] {"A ", " A", 'A', new ItemStack(block, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(block, 2, 8), new Object[] {" A", "A ", 'A', new ItemStack(block, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 9), new Object[] {"AB", "BA", 'A', new ItemStack(block, 1, 1), 'B', new ItemStack(block, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 9), new Object[] {"BA", "AB", 'A', new ItemStack(block, 1, 1), 'B', new ItemStack(block, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(block, 2, 11), new Object[] {"A ", " A", 'A', new ItemStack(block, 1, 3)});
		GameRegistry.addRecipe(new ItemStack(block, 2, 12), new Object[] {" A", "A ", 'A', new ItemStack(block, 1, 3)});
		GameRegistry.addShapelessRecipe(new ItemStack(block, 1, 10), new Object[] {new ItemStack(block, 1, 3), ModItems.polish});
		GameRegistry.addShapelessRecipe(new ItemStack(block, 1, 2), new Object[] {new ItemStack(block, 1, 11), ModItems.polish});
		GameRegistry.addSmelting(new ItemStack(block, 1, 0), new ItemStack(block, 1, 3), 0.1F);
	}
	public static void StonePatternShaper(Block block, Block block2, Block block3) {
		for (int i = 2; i < 11; i++) {
			GameRegistry.addRecipe(new ItemStack(block3), new Object[] {"A", 'A', new ItemStack(block, 1, i)});
		}
		GameRegistry.addRecipe(new ItemStack(block, 1, 1), new Object[] {" B ", "BAB", " B ", 'A', new ItemStack(block2, 1, 0), 'B', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(block, 4, 2), new Object[] {"AB", "BA", 'A', new ItemStack(block2, 1, 0), 'B', new ItemStack(block3)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 2), new Object[] {"BA", "AB", 'A', new ItemStack(block2, 1, 0), 'B', new ItemStack(block3)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 3), new Object[] {"AA", "AA", 'A', new ItemStack(block, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 4), new Object[] {"AA", "AA", 'A', new ItemStack(block2, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(block, 2, 5), new Object[] {"A ", " A", 'A', new ItemStack(block3)});
		GameRegistry.addRecipe(new ItemStack(block, 2, 6), new Object[] {" A", "A ", 'A', new ItemStack(block3)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 7), new Object[] {"AB", "BA", 'A', new ItemStack(block2, 1, 0), 'B', new ItemStack(block, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 7), new Object[] {"BA", "AB", 'A', new ItemStack(block2, 1, 0), 'B', new ItemStack(block, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(block, 2, 13), new Object[] {"A ", " A", 'A', new ItemStack(block, 1, 0)});
		GameRegistry.addRecipe(new ItemStack(block, 2, 14), new Object[] {" A", "A ", 'A', new ItemStack(block, 1, 0)});
		GameRegistry.addShapelessRecipe(new ItemStack(block2, 1, 2), new Object[] {new ItemStack(block2, 1, 0), ModItems.hammer});
		GameRegistry.addShapelessRecipe(new ItemStack(block, 1, 8), new Object[] {new ItemStack(block, 1, 0), ModItems.polish});
		GameRegistry.addShapelessRecipe(new ItemStack(block2, 1, 3), new Object[] {new ItemStack(block, 1, 8), ModItems.polish});
		GameRegistry.addSmelting(new ItemStack(block3, 1, 0), new ItemStack(block, 1, 0), 0.1F);
	}
	
	public static void MarsPatternShaper(Block block, Block block2) {
		GameRegistry.addRecipe(new ItemStack(block, 1, 6), new Object[] {" B ", "BAB", " B ", 'A', new ItemStack(block, 1, 1), 'B', Items.iron_ingot});
		GameRegistry.addRecipe(new ItemStack(block, 4, 1), new Object[] {"AA", "AA", 'A', new ItemStack(block2, 1, 8)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 7), new Object[] {"AB", "BA", 'A', new ItemStack(block, 1, 1), 'B', new ItemStack(block2, 1, 8)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 7), new Object[] {"BA", "AB", 'A', new ItemStack(block, 1, 1), 'B', new ItemStack(block2, 1, 8)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 8), new Object[] {"AA", "AA", 'A', new ItemStack(block, 1, 7)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 9), new Object[] {"AA", "AA", 'A', new ItemStack(block, 1, 1)});
		GameRegistry.addRecipe(new ItemStack(block, 2, 10), new Object[] {"A ", " A", 'A', new ItemStack(block2, 1, 8)});
		GameRegistry.addRecipe(new ItemStack(block, 2, 11), new Object[] {" A", "A ", 'A', new ItemStack(block2, 1, 8)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 12), new Object[] {"AB", "BA", 'A', new ItemStack(block, 1, 0), 'B', new ItemStack(block, 1, 2)});
		GameRegistry.addRecipe(new ItemStack(block, 4, 12), new Object[] {"BA", "AB", 'A', new ItemStack(block, 1, 0), 'B', new ItemStack(block, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(block, 2, 14), new Object[] {"A ", " A", 'A', new ItemStack(block, 1, 5)});
		GameRegistry.addRecipe(new ItemStack(block, 2, 15), new Object[] {" A", "A ", 'A', new ItemStack(block, 1, 5)});
		GameRegistry.addShapelessRecipe(new ItemStack(block, 1, 3), new Object[] {new ItemStack(block, 1, 1), ModItems.hammer});
		GameRegistry.addShapelessRecipe(new ItemStack(block, 1, 13), new Object[] {new ItemStack(block, 1, 5), ModItems.polish});
		GameRegistry.addShapelessRecipe(new ItemStack(block, 1, 4), new Object[] {new ItemStack(block, 1, 13), ModItems.polish});
		GameRegistry.addSmelting(new ItemStack(block2, 1, 8), new ItemStack(block, 1, 5), 0.1F);
	}
}
