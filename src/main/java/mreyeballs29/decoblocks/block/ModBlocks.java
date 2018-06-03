package mreyeballs29.decoblocks.block;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
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
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModBlocks {
	public static final CreativeTabs TabDecoClassic = new CreativeTabs("decoblockstab") {
		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(Blocks.stonebrick);
		}
	};
	
	public static final CreativeTabs TabIntergration = new CreativeTabs("decointergrationtab") {
		public Item getTabIconItem() {
		return new ItemStack(labblock, 1, 1).getItem();
		}
	};
	
	public static Block porcelainpowder = new PorcelainPowder(Material.sand, Names.PORCLEAIN_DUST);
	public static Block colorporcelain = new ColorPorcelain(Material.rock, Names.COLOR_PORCLEAIN);
	public static Block porcelainblock = new BlockStoneMeta(Material.rock, Names.PORCLEAIN_BLOCK, "pickaxe", 0);
	public static Block cream = new BlockBasic(DCMaterial.cream, Names.CREAM, "shovel", 0);
	public static Block specialstone = new BlockStoneSpecial(Material.rock, Names.STONE);
	public static Block labblock = new BlockMetalMeta(Material.iron, Names.LAB, "pickaxe", 1);
	public static Block lablamp = new BlockBasic(Material.glass, Names.LAB_LAMP, "pickaxe", 1);
	public static Block storagemetalblock = new BlockStorageMetal(Material.iron, "block");
	public static Block storagegemblock = new BlockStorageGem(Material.iron, "block");
	public static Block marsstone = new BlockMarsSpecial(Material.rock, Names.MARS, "pickaxe", 1);
	public static Block moonore = new BlockMoonOre(Material.rock, Names.MOON_ORE, "pickaxe", 2);

	
	public static final void init() {
		GameRegistry.registerBlock(porcelainpowder.setHardness(0.6F).setResistance(0.6F).setStepSound(Block.soundTypeSand).setCreativeTab(TabDecoClassic), Names.PORCLEAIN_DUST);
		GameRegistry.registerBlock(porcelainblock.setHardness(1.2F).setResistance(4.2F).setCreativeTab(TabDecoClassic), MetaDataRockBlock.class ,Names.PORCLEAIN_BLOCK);
		GameRegistry.registerBlock(colorporcelain.setHardness(1.2F).setResistance(4.2F).setCreativeTab(TabDecoClassic), MetaDataColors.class , Names.COLOR_PORCLEAIN);
		GameRegistry.registerBlock(cream.setHardness(0.4F).setResistance(0.5F).setStepSound(Block.soundTypeSnow).setCreativeTab(TabDecoClassic), Names.CREAM);
		GameRegistry.registerBlock(specialstone.setHardness(1.5F).setResistance(6.0F).setCreativeTab(TabDecoClassic), MetaDataStoneBlock.class, Names.STONE);
		GameRegistry.registerBlock(labblock.setHardness(2.0F).setResistance(9.0F).setStepSound(Block.soundTypeMetal).setLightLevel(0.6F).setCreativeTab(TabDecoClassic), MetaDataBlock.class, Names.LAB);
		GameRegistry.registerBlock(lablamp.setHardness(2.0F).setResistance(9.0F).setStepSound(Block.soundTypeGlass).setLightLevel(1.0F).setCreativeTab(TabDecoClassic), Names.LAB_LAMP);
		GameRegistry.registerBlock(storagemetalblock.setResistance(9.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(TabDecoClassic), MetaDataMetalStorage.class, "metal_block");
		GameRegistry.registerBlock(storagegemblock.setResistance(9.0F).setStepSound(Block.soundTypeMetal).setCreativeTab(TabDecoClassic), MetaDataGemStorage.class, "gem_block");
		if (Loader.isModLoaded("GalacticraftMars")) {
			GameRegistry.registerBlock(marsstone.setHardness(2.2F).setResistance(10.0F).setCreativeTab(TabIntergration), MetaDataMars.class, Names.MARS);
		}
		if (Loader.isModLoaded("GalacticraftCore")) {
			GameRegistry.registerBlock(moonore.setHardness(2.5F).setResistance(1.5F).setCreativeTab(TabIntergration), MetaDataMoonOre.class , Names.MOON_ORE);
		}
	}
	
	public static final void RegisterOre() {
		if (Loader.isModLoaded("GalacticraftCore")) {
			OreDictionary.registerOre("oreIron", new ItemStack(moonore, 1, 0));
			OreDictionary.registerOre("oreGold", new ItemStack(moonore, 1, 1));
			OreDictionary.registerOre("oreLead", new ItemStack(moonore, 1, 2));
			OreDictionary.registerOre("oreNickel", new ItemStack(moonore, 1, 3));
		}
		for (int i = 0; i < 16; i++) {
			OreDictionary.registerOre("block" + Names.TitleCase(Names.METALS[i]), new ItemStack(storagemetalblock, 1, i));
		}
		for (int i = 0; i < 8; i++) {
			OreDictionary.registerOre("block" + Names.TitleCase(Names.GEMS2[i]), new ItemStack(storagegemblock, 1, i));
		}
	}
}
