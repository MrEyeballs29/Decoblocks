package mreyeballs29.decoblocks.libs;

public class Names {
	// Blocks
	public static final String PORCLEAIN_DUST = "porcelain_dust";
	public static final String PORCLEAIN_BLOCK = "porcelain_block";
	public static final String CREAM = "cream";
	public static final String COLOR_PORCLEAIN = "color_porcelain";
	public static final String STONE = "stone_special";
	public static final String LAB = "laboratory_block";
	public static final String MARS = "mars_stone";
	public static final String MOON_ORE = "moonore2";
	
	// Block Arrays
	public static final String[] COLORS = new String[] {
			"white", 
			"orange", 
			"magenta", 
			"light_blue", 
			"yellow", 
			"lime", 
			"pink", 
			"gray", 
			"silver", 
			"cyan", 
			"purple", 
			"blue", 
			"brown", 
			"green", 
			"red", 
			"black"
	};
	public static final String[] STONE_TYPES = new String[] {
			"smooth", 
			"reinforced_bricks", 
			"tiles", 
			"small_tiles", 
			"small_bricks", 
			"windmill_bricks_a", 
			"windmill_bricks_b", 
			"square_bricks",
			"embossed",
			"diagonal_a",
			"diagonal_b"
	};
	public static final String[] SANDSTONE_TYPES = new String [] {
			"rough",
			"bricks",
			"cracked_bricks",
			"chiseled_bricks",
			"smooth", 
			"reinforced_bricks", 
			"tiles", 
			"small_tiles", 
			"small_bricks", 
			"windmill_bricks_a", 
			"windmill_bricks_b", 
			"square_bricks",
			"embossed",
			"diagonal_a",
			"diagonal_b"
	};
	public static final String[] OBSIDIAN_TYPES = new String[] {
			"cobblestone",
			"lava",
			"bricks",
			"lava_bricks",
			"cracked_bricks",
			"chiseled_bricks",
			"smooth",  
			"tiles", 
			"small_tiles", 
			"small_bricks", 
			"windmill_bricks_a", 
			"windmill_bricks_b", 
			"square_bricks",
			"embossed",
			"diagonal_a",
			"diagonal_b"
	};
	public static final String[] ROCK_TYPES = new String[] {
			"normal", // 0
			"bricks", // 1
			"cracked_bricks", // 2
			"chiseled_bricks", // 3
			"smooth",  // 4
			"reinforced_bricks", // 5
			"tiles", // 6
			"small_tiles", // 7 
			"small_bricks", // 8
			"windmill_bricks_a", // 9 
			"windmill_bricks_b", // 10
			"square_bricks", // 11
			"embossed", // 12
			"diagonal_a", // 13
			"diagonal_b" // 14
	};
	public static final String[] ROCK_TYPES2 = new String[] {
			"bricks",
			"cracked_bricks",
			"chiseled_bricks",
			"smooth", 
			"reinforced_bricks", 
			"tiles", 
			"small_tiles", 
			"small_bricks", 
			"windmill_bricks_a", 
			"windmill_bricks_b", 
			"square_bricks",
			"embossed",
			"diagonal_a",
			"diagonal_b"
	};
	public static final String[] MARS_TYPES = new String[] {
			"mossy", // 0
			"bricks", // 1
			"mossy_bricks", // 2
			"cracked_bricks", // 3
			"chiseled_bricks", // 4
			"smooth", // 5
			"reinforced_bricks", // 6
			"tiles", // 7 
			"small_tiles", // 8
			"small_bricks", // 9
			"windmill_bricks_a", // 10 
			"windmill_bricks_b", // 11
			"square_bricks", // 12
			"embossed", // 13
			"diagonal_a", // 14
			"diagonal_b" // 15
	};
	public static final String[] ALL_TYPES = new String[] {
			"normal", // 0
			"bricks", // 1
			"chiseled_bricks", //2
			"smooth",  // 3
			"tiles", // 4
			"small_tiles", // 5 
			"small_bricks", // 6
			"windmill_bricks_a", // 7 
			"windmill_bricks_b", // 8
			"square_bricks", // 9
			"embossed", //10
			"diagonal_a", //11
			"diagonal_b" //12
	};
	public static final String[] ORES = new String[] {
			"iron",
			"gold",
			"lead",
			"nickel"
	};
	
	// Items
	public static final String CLAY_ROUND = "clay_round";
	public static final String SAND_DUST = "sand_dust";
	public static final String LAB_PLATING = "laboratory_plate";
	public static final String FORCE_LAB_PLATING = "reinforced_laboratory_plate";
	public static final String NUTRIENT_BAR ="nutrient_bar";
	public static final String HAMMER = "hammer";
	public static final String POLISH = "polisher";
	public static final String LAB_LAMP = "laboratory_lamp";
	public static final String INGOT = "ingot";
	public static final String NUGGET = "nugget";
	
	// Item Array
	public static final String[] METALS = new String[] {
			"lead",
			"nickel",
			"steel",
			"bronze",
			"copper",
			"tin",
			"silver",
			"aluminium",
			"cobalt",
			"tungsten",
			"zinc",
			"brass",
			"invar",
			"electrum",
			"constantan",
			"chromium"
	};
	
	public static final String[] METALS2 = new String[] {
			"iron",
			"lead",
			"nickel",
			"steel",
			"bronze",
			"copper",
			"tin",
			"silver",
			"aluminium",
			"cobalt",
			"tungsten",
			"zinc",
			"brass",
			"invar",
			"electrum",
			"constantan",
			"chromium"
	};
	
	// String Method
	public static String TitleCase(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}
}
