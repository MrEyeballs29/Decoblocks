package mreyeballs29.decoblocks.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static Block porcelainpowder;
	
	public static final void init() {
		GameRegistry.registerBlock(porcelainpowder = new PorcelainPowder("porcelainpowder", Material.sand), porcelainpowder.getUnlocalizedName().substring(5));
	}
}
