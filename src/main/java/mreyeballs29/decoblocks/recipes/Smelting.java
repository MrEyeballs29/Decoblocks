package mreyeballs29.decoblocks.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public final class Smelting {
	public static final void init() {
		GameRegistry.addSmelting(ModBlocks.porcelainpowder, new ItemStack(ModBlocks.porcelainblock, 1, 0), 0.1F);
		GameRegistry.addSmelting(new ItemStack(Blocks.stone, 1, 0), new ItemStack(ModBlocks.specialstone, 1, 0), 0.1F);
		for (int i = 2; i < 11; i++) {
			GameRegistry.addSmelting(new ItemStack(ModBlocks.specialstone, 1, i), new ItemStack(ModBlocks.specialstone, 1, 0), 0.1F);
		}
		for (int i = 2; i < 16; i++) {
			if (i == 5) { continue; };
			if (i == 6) { continue; };
			GameRegistry.addSmelting(new ItemStack(ModBlocks.labblock, 1, i), new ItemStack(ModBlocks.labblock, 1, 5), 0.1F);
			GameRegistry.addSmelting(new ItemStack(ModBlocks.porcelainblock, 1, i), new ItemStack(ModBlocks.porcelainblock, 1, 5), 0.1F);
		}
		GameRegistry.addSmelting(new ItemStack(ModBlocks.labblock, 1, 1), new ItemStack(ModBlocks.labblock, 1, 0), 0.1F);
		GameRegistry.addSmelting(new ItemStack(ModBlocks.porcelainblock, 1, 1), new ItemStack(ModBlocks.porcelainblock, 1, 0), 0.1F);
	}
}
