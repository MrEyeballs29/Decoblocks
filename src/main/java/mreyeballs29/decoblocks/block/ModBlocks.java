package mreyeballs29.decoblocks.block;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.Constants;
import mreyeballs29.decoblocks.item.MetaDataBasicOre;
import mreyeballs29.decoblocks.item.MetaDataBlock;
import mreyeballs29.decoblocks.item.MetaDataColors;
import mreyeballs29.decoblocks.item.MetaDataGemStorage;
import mreyeballs29.decoblocks.item.MetaDataMars;
import mreyeballs29.decoblocks.item.MetaDataMetalStorage;
import mreyeballs29.decoblocks.item.MetaDataMoonOre;
import mreyeballs29.decoblocks.item.MetaDataRockBlock;
import mreyeballs29.decoblocks.item.MetaDataStoneBlock;
import mreyeballs29.decoblocks.libs.DCMaterial;
import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModBlocks {
	public static Block porcelainpowder;
	public static Block colorporcelain;
	public static Block porcelainblock;
	public static Block cream;
	public static Block specialstone;
	public static Block labblock;
	public static Block lablamp;
	public static Block basicore;
	public static Block gemore;
	public static Block storagemetalblock;
	public static Block storagegemblock;
	public static Block marsstone;
	public static Block moonore;
	public static Block alloysmelter;
	public static Block alloysmelter_on;

	public static void Finalize() {
		InitBlocks();
		RegisterBlocks();
		RegisterOre();
	}
	
	private static void InitBlocks() {
		porcelainpowder = new PorcelainPowder(Material.sand, Names.PORCLEAIN_DUST);             
		colorporcelain = new ColorPorcelain(Material.rock, Names.COLOR_PORCLEAIN);              
		porcelainblock = new BlockStoneMeta(Material.rock, Names.PORCLEAIN_BLOCK, "pickaxe", 0);
		cream = new BlockBasic(DCMaterial.cream, Names.CREAM, "shovel", 0);                     
		specialstone = new BlockStoneSpecial(Material.rock, Names.STONE);                       
		labblock = new BlockMetalMeta(Material.iron, Names.LAB, "pickaxe", 1);                  
		lablamp = new BlockBasic(Material.glass, Names.LAB_LAMP, "pickaxe", 1);
		basicore = new BlockBasicOre(Material.rock, "ore", new int[] {1, 1, 2, 2, 2, 2, 1, 2, 3, 2, 1});
		gemore = new BlockGemOre(Material.rock, "ore");
		storagemetalblock = new BlockStorageMetal(Material.iron, "block");                      
		storagegemblock = new BlockStorageGem(Material.iron, "block");                          
		marsstone = new BlockMarsSpecial(Material.rock, Names.MARS, "pickaxe", 1);              
		moonore = new BlockMoonOre(Material.rock, Names.MOON_ORE, "pickaxe", 2);                
		alloysmelter = new BlockAlloySmelter(Material.rock, false, "alloySmelter");                             
		alloysmelter_on = new BlockAlloySmelter(Material.rock, true, "alloySmelterOn");                           
	}
	
	private static void RegisterBlocks() {
		GameRegistry.registerBlock(porcelainpowder.setHardness(0.6F).setResistance(0.6F).setStepSound(Block.soundTypeSand).setCreativeTab(Constants.TabDecoClassic), Names.PORCLEAIN_DUST);
		GameRegistry.registerBlock(porcelainblock.setHardness(1.2F).setResistance(4.2F).setCreativeTab(Constants.TabDecoClassic), MetaDataRockBlock.class ,Names.PORCLEAIN_BLOCK);
		GameRegistry.registerBlock(colorporcelain.setHardness(1.2F).setResistance(4.2F).setCreativeTab(Constants.TabDecoClassic), MetaDataColors.class , Names.COLOR_PORCLEAIN);
		GameRegistry.registerBlock(cream.setHardness(0.4F).setResistance(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(Constants.TabDecoClassic), Names.CREAM);
		GameRegistry.registerBlock(specialstone.setHardness(1.5F).setResistance(6.0F).setCreativeTab(Constants.TabDecoClassic), MetaDataStoneBlock.class, Names.STONE);
		GameRegistry.registerBlock(labblock.setHardness(2.0F).setResistance(9.0F).setStepSound(Block.soundTypeMetal).setLightLevel(0.6F).setCreativeTab(Constants.TabDecoClassic), MetaDataBlock.class, Names.LAB);
		GameRegistry.registerBlock(lablamp.setHardness(2.0F).setResistance(9.0F).setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setCreativeTab(Constants.TabDecoClassic), Names.LAB_LAMP);
		GameRegistry.registerBlock(basicore.setCreativeTab(Constants.TabDecoClassic), MetaDataBasicOre.class ,"basic_ore");
		GameRegistry.registerBlock(gemore.setCreativeTab(Constants.TabDecoClassic), MetaDataGemStorage.class ,"gem_ore");
		GameRegistry.registerBlock(storagemetalblock.setResistance(9.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(Constants.TabDecoClassic), MetaDataMetalStorage.class, "metal_block");
		GameRegistry.registerBlock(storagegemblock.setResistance(9.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(Constants.TabDecoClassic), MetaDataGemStorage.class, "gem_block");
		GameRegistry.registerBlock(alloysmelter.setCreativeTab(Constants.TabDecoClassic), "alloysmelter");
		GameRegistry.registerBlock(alloysmelter_on, "alloysmelter_on");
		if (Loader.isModLoaded("GalacticraftMars")) {
			GameRegistry.registerBlock(marsstone.setHardness(2.2F).setResistance(10.0F).setCreativeTab(Constants.TabIntergration), MetaDataMars.class, Names.MARS);
		}
		if (Loader.isModLoaded("GalacticraftCore")) {
			GameRegistry.registerBlock(moonore.setHardness(2.5F).setResistance(1.5F).setCreativeTab(Constants.TabIntergration), MetaDataMoonOre.class , Names.MOON_ORE);
		}
	}
	
	private static final void RegisterOre() {
		if (Loader.isModLoaded("GalacticraftCore")) {
			OreDictionary.registerOre("oreIron", new ItemStack(moonore, 1, 0));
			OreDictionary.registerOre("oreGold", new ItemStack(moonore, 1, 1));
			OreDictionary.registerOre("oreLead", new ItemStack(moonore, 1, 2));
			OreDictionary.registerOre("oreNickel", new ItemStack(moonore, 1, 3));
		}
		for (int i = 0; i < 9; i++) {
			OreDictionary.registerOre("ore" + Names.TitleCase(Names.BASIC_ORES[i]), new ItemStack(basicore, 1, i));
		}
		for (int i = 0; i < 16; i++) {
			OreDictionary.registerOre("block" + Names.TitleCase(Names.METALS[i]), new ItemStack(storagemetalblock, 1, i));
		}
		for (int i = 0; i < 8; i++) {
			OreDictionary.registerOre("block" + Names.TitleCase(Names.GEMS[i]), new ItemStack(storagegemblock, 1, i));
			OreDictionary.registerOre("ore" + Names.TitleCase(Names.GEMS[i]), new ItemStack(gemore, 1, i));
		}
	}
}
