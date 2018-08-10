package mreyeballs29.decoblocks.item.crafting;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.block.ModBlocks;
import mreyeballs29.decoblocks.item.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public final class Smelting {
	public static final ItemStack[] Metal = { new ItemStack(Items.iron_ingot), new ItemStack(Items.gold_ingot),
			new ItemStack(ModItems.ingot, 1, 3), new ItemStack(ModItems.ingot, 1, 4) };

	public static final void init() {
		GameRegistry.addSmelting(ModBlocks.porcelainpowder, new ItemStack(ModBlocks.porcelainblock, 1, 0), 0.1F);
		if (Loader.isModLoaded("GalacticraftCore")) {
			for (int i = 0; i < Metal.length; i++) {
				GameRegistry.addSmelting(new ItemStack(ModBlocks.moonore, 1, i), Metal[i], 0.5F);
			}
		}
		for (int i = 0; i < 8; i++) {
			GameRegistry.addSmelting(new ItemStack(ModBlocks.gemore, 1, i), new ItemStack(ModItems.gem, 1, i), 0.8F);
		}
		for (int i = 0; i < 11; i++) {
			GameRegistry.addSmelting(new ItemStack(ModBlocks.basicore, 1, i), new ItemStack(ModItems.ingot, 1, i), 0.5F);
		}
	}
}
