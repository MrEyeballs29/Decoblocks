package mreyeballs29.decoblocks.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static Block procelainpowder;
	
	public static final void init() {
		GameRegistry.registerBlock(procelainpowder = new ProcelainPowder("procelainpowder", Material.sand), procelainpowder.getUnlocalizedName().substring(5));
	}
}
