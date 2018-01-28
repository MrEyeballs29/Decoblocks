package mreyeballs29.decoblocks.block;

import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.block.meta.PorcelainMeta;
import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static Block porcelainpowder;
	public static Block colorporcelain;
	public static Block porcelainblock;
	public static Block cream;
	
	public static final void init() {
		GameRegistry.registerBlock(porcelainpowder = new PorcelainPowder(Material.sand, Names.PORCLEAIN_DUST), Names.PORCLEAIN_DUST);
		GameRegistry.registerBlock(porcelainblock = new PorcelainBlock(Material.rock, Names.PORCLEAIN_BLOCK), Names.PORCLEAIN_BLOCK);
		GameRegistry.registerBlock(colorporcelain = new ColorPorcelain(Material.rock, Names.COLOR_PORCLEAIN), PorcelainMeta.class , Names.COLOR_PORCLEAIN);
		GameRegistry.registerBlock(cream = new Cream(Material.rock, Names.CREAM), Names.CREAM);
	}
}
