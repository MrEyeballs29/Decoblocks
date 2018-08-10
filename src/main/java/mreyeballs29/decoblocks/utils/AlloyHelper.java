package mreyeballs29.decoblocks.utils;

import net.minecraft.item.ItemStack;

public class AlloyHelper {
	public ItemStack itemStackinput1;
	public ItemStack itemStackinput2; 
	
	public AlloyHelper(ItemStack itemStack, ItemStack itemStack2) {
		this.itemStackinput1 = itemStack;
		this.itemStackinput2 = itemStack2;
	}
	
	public ItemStack GetFirstSlot() {
		return this.itemStackinput1;
	}
	
	public ItemStack GetSecondSlot() {
		return this.itemStackinput2;
	}
}
