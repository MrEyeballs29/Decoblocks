package mreyeballs29.decoblocks.item;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemDCArmor extends ItemArmor {

	private String pathname1;
	private String pathname2;
	
	private String SetFileName(String name, int i) {
		return Constants.TEXTURE_PREFIX + "textures/models/armor/" + name + "_layer_" + i;
	}	
	public ItemDCArmor(ArmorMaterial material, int index, int slot, String folder1 , String folder2) {
		super(material, index, slot);
		this.pathname1 = SetFileName(folder1, 1);
		this.pathname2 = SetFileName(folder2, 2);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (this.armorType == 2) {
			return this.pathname2;
		}
		return this.pathname1;
	}
}
