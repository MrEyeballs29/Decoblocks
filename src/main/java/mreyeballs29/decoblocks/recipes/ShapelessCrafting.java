package mreyeballs29.decoblocks.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public final class ShapelessCrafting {
	public static final void init() {
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.sand, 4), new Object[] {Blocks.sand});
	}
}
