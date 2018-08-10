package mreyeballs29.decoblocks.world;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Loader;
import micdoodle8.mods.galacticraft.core.blocks.GCBlocks;
import micdoodle8.mods.galacticraft.core.util.ConfigManagerCore;
import mreyeballs29.decoblocks.Constants;
import mreyeballs29.decoblocks.block.ModBlocks;
import mreyeballs29.decoblocks.utils.ConfigManagerIssacCore;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldGenerationOres implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		int ID = world.provider.dimensionId;
		int BiomeID = world.provider.getBiomeGenForCoords(chunkX * 16 + 1, chunkZ * 16 + 1).biomeID;
		if (Loader.isModLoaded("GalacticraftCore")) {
			if (ID == ConfigManagerCore.idDimensionMoon) {
				if (ConfigManagerIssacCore.enableMoonIronGen) {
					generateOre(ModBlocks.moonore, 0, world, random, chunkX, chunkZ, 4, 40, 6, 64, GCBlocks.blockMoon, 4);
				} if (ConfigManagerIssacCore.enableMoonGoldGen) {
					generateOre(ModBlocks.moonore, 1, world, random, chunkX, chunkZ, 4, 20, 6, 32, GCBlocks.blockMoon, 4);
				} if (ConfigManagerIssacCore.enableMoonLeadGen) {
					generateOre(ModBlocks.moonore, 2, world, random, chunkX, chunkZ, 4, 30, 6, 48, GCBlocks.blockMoon, 4);
				} if (ConfigManagerIssacCore.enableMoonNickelGen) {
					generateOre(ModBlocks.moonore, 3, world, random, chunkX, chunkZ, 4, 25, 6, 16, GCBlocks.blockMoon, 4);
				}
			}
		} if (ID == 0) {
			if (Constants.isForest(BiomeID) && ConfigManagerIssacCore.enableTemperateGemGen) {
				generateGem(ModBlocks.gemore, 4, world, random, chunkX, chunkZ, 20, 6, 32, Blocks.stone);
			} if (Constants.isDesert(BiomeID) && ConfigManagerIssacCore.enableDesertGemGen) {
				generateGem(ModBlocks.gemore, 7, world, random, chunkX, chunkZ, 20, 6, 32, Blocks.stone);
			} if (Constants.isTaiga(BiomeID) && ConfigManagerIssacCore.enableConiferousGemGen) {
				generateGem(ModBlocks.gemore, 1, world, random, chunkX, chunkZ, 20, 6, 32, Blocks.stone);
			} if (Constants.isJungle(BiomeID) && ConfigManagerIssacCore.enableTropicalGemGen) {
				generateGem(ModBlocks.gemore, 5, world, random, chunkX, chunkZ, 20, 6, 32, Blocks.stone);
			} if (Constants.isMesa(BiomeID) && ConfigManagerIssacCore.enableCanyonGemGen) {
				generateGem(ModBlocks.gemore, 2, world, random, chunkX, chunkZ, 20, 6, 32, Blocks.stone);
			} if (Constants.isFrozen(BiomeID) && ConfigManagerIssacCore.enableFrozenGemGen) {
				generateGem(ModBlocks.gemore, 6, world, random, chunkX, chunkZ, 20, 6, 32, Blocks.stone);
			}
			if (ConfigManagerIssacCore.enableCopperGen) { generateOre(ModBlocks.basicore, 0, world, random, chunkX, chunkZ, 4, 80, 5, 96, Blocks.stone, 0); };
			if (ConfigManagerIssacCore.enableTinGen) { generateOre(ModBlocks.basicore, 1, world, random, chunkX, chunkZ, 4, 50, 5, 96, Blocks.stone, 0); };
			if (ConfigManagerIssacCore.enableSilverGen) { generateOre(ModBlocks.basicore, 2, world, random, chunkX, chunkZ, 4, 20, 5, 32, Blocks.stone, 0); };
			if (ConfigManagerIssacCore.enableLeadGen) { generateOre(ModBlocks.basicore, 3, world, random, chunkX, chunkZ, 4, 25, 5, 32, Blocks.stone, 0);}
			if (ConfigManagerIssacCore.enableNickelGen) { generateOre(ModBlocks.basicore, 4, world, random, chunkX, chunkZ, 4, 20, 5, 24, Blocks.stone, 0); };
			if (ConfigManagerIssacCore.enablePlatinumGen) { generateOre(ModBlocks.basicore, 5, world, random, chunkX, chunkZ, 4, 10, 5, 16, Blocks.stone, 0); };
			if (ConfigManagerIssacCore.enableAluminumGen) { generateOre(ModBlocks.basicore, 6, world, random, chunkX, chunkZ, 4, 40, 5, 80, Blocks.stone, 0); };
			if (ConfigManagerIssacCore.enableCobaltGen) { generateOre(ModBlocks.basicore, 7, world, random, chunkX, chunkZ, 4, 20, 5, 16, Blocks.stone, 0); };
			if (ConfigManagerIssacCore.enableMithrilGen) { generateOre(ModBlocks.basicore, 8, world, random, chunkX, chunkZ, 4, 2, 5, 16, Blocks.stone, 0);};
			if (ConfigManagerIssacCore.enableChromiumGem) { generateOre(ModBlocks.basicore, 9, world, random, chunkX, chunkZ, 4, 6, 5, 32, Blocks.stone, 0);}
			if (ConfigManagerIssacCore.enableZincGen) { generateOre(ModBlocks.basicore, 10, world, random, chunkX, chunkZ, 4, 15, 5, 96, Blocks.stone, 0);}
		} if (ConfigManagerIssacCore.enableHellishGemGen && ID == -1) {
			generateGem(ModBlocks.gemore, 0, world, random, chunkX, chunkZ, 30, 5, 64, Blocks.netherrack);
		} if (ConfigManagerIssacCore.enableVoidGemGen && ID == 1) {
			generateGem(ModBlocks.gemore, 3, world, random, chunkX, chunkZ, 40, 10, 70, Blocks.end_stone);
		}
	}

	public void generateOre(Block block, int meta, World world, Random random, int chunkX, int chunkZ, int min, int chance, int minY, int maxY, Block target, int meta2) {
		int height = maxY - minY;
		WorldGenMinable2 generator = new WorldGenMinable2(block, meta, min, target, meta2);
		for (int i = 0; i < chance; i++) {
			int xRand = chunkX * 16 + random.nextInt(16);
			int yRand = random.nextInt(height) + minY;
			int zRand = chunkZ * 16 + random.nextInt(16);
			
			generator.generate(world, random, xRand, yRand, zRand);
		}
	}
	
	public void generateGem(Block block, int meta, World world, Random random, int chunkX, int chunkZ, int chance, int minY, int maxY, Block target) {
		int height = maxY - minY;
		for (int i = 0; i < chance; i++) {
			int xRand = chunkX * 16 + random.nextInt(16);
			int yRand = random.nextInt(height) + minY;
			int zRand = chunkZ * 16 + random.nextInt(16);
			
			if (world.getBlock(xRand, yRand, zRand) == target) {
				world.setBlock(xRand, yRand, zRand, block, meta, 2);
			}
		}
	}
}
