package mreyeballs29.decoblocks.recipe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import mreyeballs29.decoblocks.item.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AlloyRecipes {

	private static final AlloyRecipes alloyBase = new AlloyRecipes();
	
	private Map field_h_1 = new HashMap();
	private Map field_h_2 = new HashMap();
	public static AlloyRecipes alloy() {
		return alloyBase;
	}

	private AlloyRecipes() {
		this.func_1_a(new ItemStack(ModItems.ingot, 3, 0), new ItemStack(ModItems.ingot, 1, 1), new ItemStack(ModItems.ingot, 4, 13));
		this.func_1_a(new ItemStack(ModItems.ingot, 3, 0), new ItemStack(ModItems.ingot, 1, 9), new ItemStack(ModItems.ingot, 4, 15));
		this.func_1_a(new ItemStack(ModItems.ingot, 1, 3), new ItemStack(Items.iron_ingot, 2, 0), new ItemStack(ModItems.ingot, 3, 11));
		this.func_1_a(new ItemStack(ModItems.ingot, 1, 2), new ItemStack(Items.gold_ingot, 1, 0), new ItemStack(ModItems.ingot, 2, 14));
	}

	public void func_1_a(ItemStack par1, ItemStack par2, ItemStack par3) {
		this.field_h_1.put(par1, par3);
		this.field_h_2.put(par2, par3);
	}


	public ItemStack getOutput(ItemStack itemStack, ItemStack itemStack2) {
		Iterator iterator = this.field_h_1.entrySet().iterator();
		Iterator iterator1 = this.field_h_2.entrySet().iterator();
		Entry entry;
		Entry entry2;
		
		do {
			if (!iterator.hasNext()) {
				return null;
			}
			entry = (Entry)iterator.next();
			entry2 = (Entry)iterator1.next();
		}
		while (!this.func_1_b(itemStack, itemStack2, (ItemStack)entry.getKey(), (ItemStack)entry2.getKey()));
		return (ItemStack) entry.getValue();
	}
	
	private boolean func_1_b(ItemStack par1, ItemStack par2, ItemStack par3, ItemStack par4) {
		boolean flag = (par1.getItem() == par3.getItem()) && (par2.getItem() == par4.getItem());
		boolean flag1 = par3.getItemDamage() == 32767;
		boolean flag2 = par4.getItemDamage() == 32767;
		boolean flag3 = (par1.getItemDamage() == par3.getItemDamage()) && (par2.getItemDamage() == par4.getItemDamage());
		boolean flag4 = (par1.stackSize >= par3.stackSize) && (par2.stackSize >= par4.stackSize);
		return flag && ((flag1 && flag2) || flag3) && flag4 ;
	}
}
