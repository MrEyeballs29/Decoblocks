package mreyeballs29.decoblocks.libs;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMaterial {
	/**
	 * A name of that material
	 */
	private String name;
	/**
	 * The level of that material has set to.
	 */
	private int level;
	/**
	 * To tell whether it is shiny.
	 */
	private boolean shiny;
	/**
	 * The amount of durability that goes onto the material
	 */
	private int durability;
	private int[] defense;
	/**
	 * The amount of speed that goes onto that material
	 */
	private float efficiency;
	/**
	 * The amount of damage dealt to entities who are not invincible
	 */
	private float damage;
	/**
	 * The amount of enchantment power can be applied to that tool material
	 */
	private int enchantability;
	/** 
	 * The amount of uses can do.
	 */
	private int uses;

	public ItemMaterial(String name, int level, int uses, float efficiency, float damage, int enchantability) {
		this.name = name;
		this.level = level;
		this.uses = uses;
		this.shiny = false;
		this.damage = damage;
		this.efficiency = efficiency;
		this.enchantability = enchantability;
	}

	public ItemMaterial(String name, int durability, int[] defense, int enchantability) {
		this.name = name;
		this.shiny = false;
		this.durability = durability;
		this.defense = defense;
		this.enchantability = enchantability;
	}
	/**
	 * Gets the name of that existing material
	 * @return Name of that material
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name of that material
	 * @param name A name of that material
	 */
	public ItemMaterial setName(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Checks to see whether or not the material is shiny
	 * @return Whether it is shiny or not.
	 */
	public boolean isShiny() {
		return this.shiny;
	}
	
	/**
	 * Makes the material shiny. 
	 */
	public ItemMaterial makeShiny() {
		this.shiny = true;
		return this;
	}
	
	/**
	 * Makes the material not shiny
	 */
	public ItemMaterial makeNotShiny() {
		this.shiny = false;
		return this;
	}
	
	/**
	 * Gets the tool level of the existing material
	 * @return The level of that material
	 */
	public int getLevel() {
		return this.level;
	}

	/**
	 * Sets the tool level of the existing material
	 * @param level The level of that material
	 */
	public ItemMaterial setLevel(int level) {
		this.level = level;
		return this;
	}

	public int getUses() {
		return uses;
	}

	public ItemMaterial setUses(int uses) {
		this.uses = uses;
		return this;
	}

	/**
	 * Gets the amount of durability in that material
	 * @return Amount of durability
	 */
	public int getDurability() {
		return this.durability;
	}

	/**
	 * Sets the amount of durability in that material
	 * @param durability The amount of that material
	 */
	public ItemMaterial setDurability(int durability) {
		this.durability = durability;
		return this;
	}

	public int[] getDefense() {
		return defense;
	}

	public ItemMaterial setDefense(int[] defense) {
		this.defense = defense;
		return this;
	}

	/**
	 * Gets the amount of speed that goes into that material
	 * @return The efficiency of that material property
	 */
	public float getEfficiency() {
		return this.efficiency;
	}

	/**
	 * Sets the amount of speed of that material.
	 * @param efficiency The speed amount of that material
	 */
	public ItemMaterial setEfficiency(float efficiency) {
		this.efficiency = efficiency;
		return this;
	}

	/**
	 * Gets the amount of the damage dealt to entities who are not invincible
	 * @return the amount of damage
	 */
	public float getDamage() {
		return this.damage;
	}
	/**
	 * Sets the amount of the damage dealt to entities who are not invincible
	 */
	public ItemMaterial setDamage(float damage) {
		this.damage = damage;
		return this;
	}

	public int getEnchantability() {
		return this.enchantability;
	}

	public ItemMaterial setEnchantability(int enchantability) {
		this.enchantability = enchantability;
		return this;
	}
	
	public static ToolMaterial setToolMaterial(ItemMaterial material) {
		return EnumHelper.addToolMaterial(material.getName(), material.getLevel(), material.getUses(), material.getEfficiency(), material.getDamage(), material.getEnchantability());
	}
	
	public static ItemMaterial getMaterial(ToolMaterial toolMaterial) {
		String name = toolMaterial.name() == "emerald".toUpperCase() ? "diamond" : toolMaterial.name().toLowerCase();
		return new ItemMaterial(name, toolMaterial.getHarvestLevel(), toolMaterial.getMaxUses(), toolMaterial.getEfficiencyOnProperMaterial(), toolMaterial.getDamageVsEntity(), toolMaterial.getEnchantability());
	}
	
	public static ArmorMaterial setArmorMaterial(ItemMaterial material) {
		return EnumHelper.addArmorMaterial(material.getName(), material.getDurability(), material.getDefense(), material.getEnchantability());
	}
	
	public static ItemMaterial getMaterial(ArmorMaterial armorMaterial, int type) {
		int[] defense = new int[] {armorMaterial.getDamageReductionAmount(0), armorMaterial.getDamageReductionAmount(1), armorMaterial.getDamageReductionAmount(2), armorMaterial.getDamageReductionAmount(3)};
		return new ItemMaterial(armorMaterial.name().toLowerCase(), armorMaterial.getDurability(type), defense, armorMaterial.getEnchantability());
	}
	
	public static ItemMaterial[] toolmaterialsets = new ItemMaterial[25];
	public static ItemMaterial[] armormaterialsets = new ItemMaterial[26];
	
	public static void addSets() {
		toolmaterialsets[0] = new ItemMaterial("copper", 1, 145, 5.0F, 1.5F, 8);
		// toolmaterialsets[1] = null;
		toolmaterialsets[2] = new ItemMaterial("silver", 1, 70, 10.0F, 1.0F, 21);
		toolmaterialsets[3] = new ItemMaterial("lead", 2, 180, 5.5F, 2.0F, 12);
		toolmaterialsets[4] = new ItemMaterial("nickel", 2, 200, 6.0F, 2.0F, 9);
		toolmaterialsets[5] = new ItemMaterial("platinum", 2, 400, 7.0F, 2.5F, 19);
		toolmaterialsets[6] = new ItemMaterial("aluminum", 1, 140, 4.5F, 1.0F, 12);
		toolmaterialsets[7] = new ItemMaterial("cobalt", 2, 250, 6.0F, 2.0F, 13);
		toolmaterialsets[8] = new ItemMaterial("mithril", 3, 800, 7.5F, 3.0F, 21);
		// toolmaterialsets[9] = null;
		toolmaterialsets[10] = new ItemMaterial("chromium", 2, 300, 6.5F, 2.5F, 16);
		toolmaterialsets[11] = new ItemMaterial("invar", 2, 230, 5.5F, 2.0F, 10);
		toolmaterialsets[12] = new ItemMaterial("steel", 2, 500, 6.5F, 2.5F, 15);
		toolmaterialsets[13] = new ItemMaterial("bronze", 2, 180, 6.0F, 2.0F, 13);
		toolmaterialsets[14] = new ItemMaterial("brass", 1, 170, 9.0F, 1.0F, 18);
		toolmaterialsets[15] = new ItemMaterial("electrum", 1, 90, 11.0F, 0.5F, 20);
		toolmaterialsets[16] = new ItemMaterial("emerald", 2, (int)ToolMaterial.EMERALD.getMaxUses()/4, 7.0F, 2.0F, 15);
		toolmaterialsets[17] = new ItemMaterial("ruby", 3, (int)ToolMaterial.EMERALD.getMaxUses()/3, 9.0F, 3.0F, 10);
		toolmaterialsets[18] = new ItemMaterial("sapphire", 3, 943, 8.0F, 3.0F, 7);
		toolmaterialsets[19] = new ItemMaterial("topaz", 2, 424, 7.0F, 2.0F, 17);
		toolmaterialsets[20] = new ItemMaterial("amethyst", 2, 1029, 9.0F, 3.0F, 15);
		toolmaterialsets[21] = new ItemMaterial("greenSapphire", 3, 943, 8.0F, 3.0F, 14);
		toolmaterialsets[22] = new ItemMaterial("peridot", 3, 1103, 8.0F, 3.0F, 14);
		toolmaterialsets[23] = new ItemMaterial("blueTopaz", 2, 424, 7.0F, 2.0F, 17);
		toolmaterialsets[24] = new ItemMaterial("yellowSapphire", 3, 943, 8.0F, 3.0F, 7);
		
		armormaterialsets[0] = new ItemMaterial("cloth", 3, new int[] {1, 2, 1, 0}, 18);
		armormaterialsets[1] = new ItemMaterial("copper", 6, new int[] {1, 5, 3, 1}, 15);
		// armormaterialsets[2] = null;
		armormaterialsets[3] = new ItemMaterial("silver", 4, new int[] {2, 6, 4, 1}, 16);
		armormaterialsets[4] = new ItemMaterial("lead", 10, new int[] {2, 6, 3, 1}, 7);
		armormaterialsets[5] = new ItemMaterial("nickel", 12, new int[] {2, 5, 5, 2}, 14);
		armormaterialsets[6] = new ItemMaterial("platinum", 25, new int[] {2, 7, 6, 2}, 8);
		armormaterialsets[7] = new ItemMaterial("aluminum", 5, new int[] {1, 2, 2, 1}, 13);
		armormaterialsets[8] = new ItemMaterial("cobalt", 3, new int[] {1, 2, 1, 0}, 18);
		armormaterialsets[9] = new ItemMaterial("mithril", 6, new int[] {1, 5, 3, 1}, 15);
		// armormaterialsets[10] = null;
		armormaterialsets[11] = new ItemMaterial("chromium", 10, new int[] {2, 6, 3, 1}, 7);
		armormaterialsets[12] = new ItemMaterial("invar", 12, new int[] {2, 5, 5, 2}, 14);
		armormaterialsets[13] = new ItemMaterial("steel", 25, new int[] {2, 7, 6, 2}, 8);
		armormaterialsets[14] = new ItemMaterial("bronze", 5, new int[] {1, 2, 2, 1}, 13);
		armormaterialsets[15] = new ItemMaterial("brass", 3, new int[] {1, 2, 1, 0}, 18);
		armormaterialsets[16] = new ItemMaterial("electrum", 6, new int[] {1, 5, 3, 1}, 15);
		armormaterialsets[17] = new ItemMaterial("emerald", 4, new int[] {2, 6, 4, 1}, 16);
		armormaterialsets[18] = new ItemMaterial("ruby", 10, new int[] {2, 6, 3, 1}, 7);
		armormaterialsets[19] = new ItemMaterial("sapphire", 12, new int[] {2, 5, 5, 2}, 14);
		armormaterialsets[20] = new ItemMaterial("topaz", 25, new int[] {2, 7, 6, 2}, 8);
		armormaterialsets[21] = new ItemMaterial("amethyst", 5, new int[] {1, 2, 2, 1}, 13);
		armormaterialsets[22] = new ItemMaterial("greenSapphire", 5, new int[] {1, 2, 2, 1}, 13);
		armormaterialsets[23] = new ItemMaterial("peridot", 25, new int[] {2, 7, 6, 2}, 8);
		armormaterialsets[24] = new ItemMaterial("blueTopaz", 5, new int[] {1, 2, 2, 1}, 13);
		armormaterialsets[25] = new ItemMaterial("yellowSapphire", 5, new int[] {1, 2, 2, 1}, 13);
	}
}