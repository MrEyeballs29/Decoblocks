package mreyeballs29.decoblocks.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.block.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public final class Smelting {
	public static final void init() {
		GameRegistry.addSmelting(ModBlocks.porcelainpowder, new ItemStack(ModBlocks.porcelainblock, 1), 0.1F);
		GameRegistry.addSmelting(new ItemStack(Blocks.stonebrick, 1, 0), new ItemStack(ModBlocks.specialstone, 1, 0), 0.1F);
	}
}
