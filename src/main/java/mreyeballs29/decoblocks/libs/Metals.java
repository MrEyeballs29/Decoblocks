package mreyeballs29.decoblocks.libs;

public class Metals {
	public static final String[] NAME = new String[] {"copper", "tin", "silver", "lead", "nickel", "platinum", "aluminum", "cobalt", "mithril", "zinc",
	"chromium", "invar", "steel", "bronze", "electrum", "brass"};
	
	public static final String getMaterials(String name) {
		return name + "ToolMaterial";
	}
	
	public static final int getHarvestLevels(int i) {
		int[] levels = new int[] {1, 0, 1, 2, 2, 1, 1, 3, 3, 0, 3, 2, 2, 2, 0, 1};
		return levels[i];
	}
	
	public static final int getUses(int i) {
		int[] uses = new int[] {150, 0, 125, 175, 200, 75, 150, 500, 800, 0, 300, 250, 500, 200, 75, 100};
		return uses[i];
	}
	
	public static final float getEfficiency(int i) {
		float[] speed = new float[] {5.0F, 0.0F, 7.0F, 6.0F, 6.0F, 8.0F, 5.0F, 6.0F, 6.0F, 0.0F, 7.0F, 5.0F, 6.0F, 6.0F, 9.0F, 4.0F};
		return speed[i];
	}
	
	public static final float getDamage(int i) {
		float[] damage = new float[] {1.5F, 0.0F, 1.0F, 2.0F, 2.0F, 1.0F, 1.5F, 2.5F, 3.0F, 0.0F, 2.5F, 2.5F, 2.5F, 2.0F, 0.5F, 1.5F};
		return damage[i];
	}
	
	public static final int getEnchantability(int i) {
		int[] enchant = new int[] {8, 0, 16, 10, 12, 20, 9, 10, 15, 0, 18, 10, 8, 10, 25, 21};
		return enchant[i];
	}
}