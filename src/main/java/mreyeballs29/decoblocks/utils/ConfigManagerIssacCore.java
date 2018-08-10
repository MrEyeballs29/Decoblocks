package mreyeballs29.decoblocks.utils;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigManagerIssacCore {
	public static String CATERGORY_WORLD = "world";
	public static String CATERGORY_INTREGRATED_WORLD = "worldIntergation";
	public static String CATERGORY_BIOME_GEMS = "biomeGems";
	
	// World Generator
	public static boolean enableCopperGen;
	public static boolean enableTinGen;
	public static boolean enableSilverGen;
	public static boolean enableLeadGen;
	public static boolean enableNickelGen;
	public static boolean enablePlatinumGen;
	public static boolean enableAluminumGen;
	public static boolean enableCobaltGen;
	public static boolean enableMithrilGen;
	public static boolean enableChromiumGem;
	public static boolean enableZincGen;
	
	public static boolean enableEndIslands;
	
	public static boolean enableMoonGoldGen;
	public static boolean enableMoonLeadGen;
	public static boolean enableMoonIronGen;
	public static boolean enableMoonNickelGen;
	
	public static boolean enableTemperateGemGen;
	public static boolean enableConiferousGemGen;
	public static boolean enableDesertGemGen;
	public static boolean enableTropicalGemGen;
	public static boolean enableCanyonGemGen;
	public static boolean enableFrozenGemGen;
	public static boolean enableHellishGemGen;
	public static boolean enableVoidGemGen;
	
	public static void Main(File file) {
		Configuration config = new Configuration(file);
	
		try {
		enableCopperGen = config.getBoolean("copperWorldGen", CATERGORY_WORLD, true, "Should Copper Be Generated");
		enableTinGen = config.getBoolean("tinWorldGen", CATERGORY_WORLD, true, "Should Tin Be Generated");
		enableSilverGen = config.getBoolean("silverWorldGen", CATERGORY_WORLD, true, "Should Silver Be Generated");
		enableLeadGen = config.getBoolean("leadWorldGen", CATERGORY_WORLD, true, "Should Lead Be Generated");
		enableNickelGen = config.getBoolean("nickelWorldGen", CATERGORY_WORLD, true, "Should Nickel Be Generated");
		enablePlatinumGen = config.getBoolean("platinumWorldGen", CATERGORY_WORLD, true, "Should Platinum Be Generated");
		enableAluminumGen = config.getBoolean("aluminumWorldGen", CATERGORY_WORLD, true, "Should Aluminum Be Generated");
		enableCobaltGen = config.getBoolean("cobaltWorldGen", CATERGORY_WORLD, true, "Should Cobalt Be Generated");  
		enableMithrilGen = config.getBoolean("mithrilWorldGen", CATERGORY_WORLD, true, "Should Mithril Be Generated"); 
		enableChromiumGem = config.getBoolean("chromiumWorldGen", CATERGORY_WORLD, true, "Should Chrome/Chromium Be Generated");
		enableZincGen = config.getBoolean("zincWorldGen", CATERGORY_WORLD, true, "Should Zinc Be Generated"); 
		enableEndIslands = config.getBoolean("endIslandWorldGen", CATERGORY_WORLD, true, "Should End Islands Be Generated");
		
		enableMoonIronGen = config.getBoolean("moonIronWorldGen", CATERGORY_INTREGRATED_WORLD, true, "Should Moon Iron Be Generated");
		enableMoonGoldGen = config.getBoolean("moonGoldWorldGen", CATERGORY_INTREGRATED_WORLD, true, "Should Moon Gold Be Generated");
		enableMoonLeadGen = config.getBoolean("moonLeadWorldGen", CATERGORY_INTREGRATED_WORLD, true, "Should Moon Lead Be Generated");
		enableMoonNickelGen = config.getBoolean("moonNickelWorldGen", CATERGORY_INTREGRATED_WORLD, true, "Should Moon Nickel Be Generated");
		
		enableDesertGemGen = config.getBoolean("yellowSapphireWorldGen", CATERGORY_BIOME_GEMS, true, "Should Yellow Sapphire Be Generated on Deserts");
		enableTemperateGemGen = config.getBoolean("greenSapphireWorldGen", CATERGORY_BIOME_GEMS, true, "Should Green Sapphire Be Generated on Forests");
		enableConiferousGemGen = config.getBoolean("sapphireWorldGen", CATERGORY_BIOME_GEMS, true, "Should Sapphire Be Generated on Taiga");
		enableTropicalGemGen = config.getBoolean("peridotWorldGen", CATERGORY_BIOME_GEMS, true, "Should Peridot Be Generated on Jungle");
		enableCanyonGemGen = config.getBoolean("topazWorldGen", CATERGORY_BIOME_GEMS, true, "Should Topaz Be Generated on Both Savanna and Badlands");
		enableFrozenGemGen = config.getBoolean("blueTopazWorldGen", CATERGORY_BIOME_GEMS, true, "Should Blue Topaz Be Generated on Frozen Biomes");
		enableHellishGemGen = config.getBoolean("rubyWorldGen", CATERGORY_BIOME_GEMS, true, "Should Ruby Be Generated on Nether");
		enableVoidGemGen = config.getBoolean("amethystWorldGen", CATERGORY_BIOME_GEMS, true, "Should Amethyst Be Generated on End");
		
		} catch (Exception e) {
			System.err.print("Oh noes: " + e.getClass().getName());
		} finally {
			config.save();
		}
	}
}
