package mreyeballs29.decoblocks.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.item.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public final class ShapedCrafting {
	public static final void init() {
		GameRegistry.addRecipe(new ItemStack(ModItems.clayball, 4), new Object[]{"AB", "BA", 'A', Items.clay_ball, 'B', Blocks.dirt});
	}
}
