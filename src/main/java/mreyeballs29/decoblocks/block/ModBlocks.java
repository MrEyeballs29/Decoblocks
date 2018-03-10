package mreyeballs29.decoblocks.block;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.item.MetaDataBlock;
import mreyeballs29.decoblocks.item.MetaDataColors;
import mreyeballs29.decoblocks.item.MetaDataMars;
import mreyeballs29.decoblocks.item.MetaDataRockBlock;
import mreyeballs29.decoblocks.item.MetaDataStoneBlock;
import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlocks {
	public static Block porcelainpowder = new PorcelainPowder(Material.sand, Names.PORCLEAIN_DUST);
	public static Block colorporcelain = new ColorPorcelain(Material.rock, Names.COLOR_PORCLEAIN);
	public static Block porcelainblock = new BlockStoneMeta(Material.rock, Names.PORCLEAIN_BLOCK, "pickaxe", 0);
	public static Block cream = new BlockBasic(Material.craftedSnow, Names.CREAM, "shovel", 1);
	public static Block specialstone = new BlockStoneSpecial(Material.rock, Names.STONE);
	public static Block labblock = new BlockMetalMeta(Material.iron, Names.LAB, "pickaxe", 1);
	public static Block lablamp = new BlockBasic(Material.glass, Names.LAB_LAMP, "pickaxe", 1);
	public static Block marsstone = new BlockMarsSpecial(Material.rock, Names.MARS, "pickaxe", 1);
	
	public static final void init() {
		GameRegistry.registerBlock(porcelainpowder.setHardness(0.6F).setResistance(0.6F).setStepSound(Block.soundTypeSand).setCreativeTab(CreativeTabs.tabBlock), Names.PORCLEAIN_DUST);
		GameRegistry.registerBlock(porcelainblock.setHardness(1.2F).setResistance(4.2F).setCreativeTab(CreativeTabs.tabBlock), MetaDataRockBlock.class ,Names.PORCLEAIN_BLOCK);
		GameRegistry.registerBlock(colorporcelain.setHardness(1.2F).setResistance(4.2F).setCreativeTab(CreativeTabs.tabBlock), MetaDataColors.class , Names.COLOR_PORCLEAIN);
		GameRegistry.registerBlock(cream.setHardness(0.4F).setResistance(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(CreativeTabs.tabBlock), Names.CREAM);
		GameRegistry.registerBlock(specialstone.setHardness(1.5F).setResistance(6.0F).setCreativeTab(CreativeTabs.tabBlock), MetaDataStoneBlock.class, Names.STONE);
		GameRegistry.registerBlock(labblock.setHardness(2.0F).setResistance(9.0F).setStepSound(Block.soundTypeMetal).setLightLevel(0.6F).setCreativeTab(CreativeTabs.tabBlock), MetaDataBlock.class, Names.LAB);
		GameRegistry.registerBlock(lablamp.setHardness(2.0F).setResistance(9.0F).setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setCreativeTab(CreativeTabs.tabBlock), Names.LAB_LAMP);
		if (Loader.isModLoaded("GalacticraftMars")) {
			GameRegistry.registerBlock(marsstone.setHardness(2.2F).setResistance(10.0F).setCreativeTab(CreativeTabs.tabBlock), MetaDataMars.class, Names.MARS);
		}
	}
}
