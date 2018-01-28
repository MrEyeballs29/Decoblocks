package mreyeballs29.decoblocks.item;

import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.item.Item;

public final class ModItems {
	public static Item clayball;
	public static Item sand;
	
	public static final void init() {
		GameRegistry.registerItem(clayball = new Clayball(Names.CLAY_ROUND), Names.CLAY_ROUND);
		GameRegistry.registerItem(sand = new Sandypowder(Names.SAND_DUST), Names.SAND_DUST);
	}
}
