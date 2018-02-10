package mreyeballs29.decoblocks.block;

import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.block.meta.MetaDataBlock;
import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
	public static Block porcelainpowder;
	public static Block colorporcelain;
	public static Block porcelainblock;
	public static Block cream;
	public static Block specialstone;
	
	public static final void init() {
		GameRegistry.registerBlock(porcelainpowder = new PorcelainPowder(Material.sand, Names.PORCLEAIN_DUST), Names.PORCLEAIN_DUST);
		GameRegistry.registerBlock(porcelainblock = new PorcelainBlock(Material.rock, Names.PORCLEAIN_BLOCK), Names.PORCLEAIN_BLOCK);
		GameRegistry.registerBlock(colorporcelain = new ColorPorcelain(Material.rock, Names.COLOR_PORCLEAIN), MetaDataBlock.class , Names.COLOR_PORCLEAIN);
		GameRegistry.registerBlock(cream = new Cream(Material.craftedSnow, Names.CREAM), Names.CREAM);
		GameRegistry.registerBlock(specialstone = new Stone(Material.rock, Names.STONE), MetaDataBlock.class, Names.STONE);
	}
}
