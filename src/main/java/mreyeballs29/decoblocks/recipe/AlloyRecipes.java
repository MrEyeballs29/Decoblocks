package mreyeballs29.decoblocks.recipe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import mreyeballs29.decoblocks.item.ModItems;
import mreyeballs29.decoblocks.utils.AlloyHelper;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AlloyRecipes {

	private static final AlloyRecipes alloyBase = new AlloyRecipes();
	
	private HashMap<AlloyHelper, ItemStack> field_h_1 = new HashMap();
	public static AlloyRecipes alloy() {
		return alloyBase;
	}

	private AlloyRecipes() {
		this.func_1_a(new ItemStack(ModItems.ingot, 3, 0), new ItemStack(ModItems.ingot, 1, 1), new ItemStack(ModItems.ingot, 4, 13));
		this.func_1_a(new ItemStack(ModItems.ingot, 3, 0), new ItemStack(ModItems.ingot, 1, 9), new ItemStack(ModItems.ingot, 4, 15));
		this.func_1_a(new ItemStack(ModItems.ingot, 1, 4), new ItemStack(Items.iron_ingot, 2, 0), new ItemStack(ModItems.ingot, 3, 11));
		this.func_1_a(new ItemStack(ModItems.ingot, 1, 2), new ItemStack(Items.gold_ingot, 1, 0), new ItemStack(ModItems.ingot, 2, 14));
	}
	
	public void func_3_a(Item par1, int qu, ItemStack par2, ItemStack par3) {
		this.func_1_a(new ItemStack(par1, qu, 32767), par2, par3);
	}
	
	public void func_2_a(Item par1, int qu, Item par2, int qu1, ItemStack par3) {
		this.func_1_a(new ItemStack(par1, qu, 32767), new ItemStack(par2, qu1, 32767), par3);
	}
	
	public void func_1_a(ItemStack par1, ItemStack par2, ItemStack par3) {
		this.field_h_1.put(new AlloyHelper(par1, par2), par3);
	}


	public ItemStack getOutput(ItemStack itemStack, ItemStack itemStack2) {
		Iterator iterator = this.field_h_1.entrySet().iterator();
		Entry entry;
		
		do {
			if (!iterator.hasNext()) {
				return null;
			}
			entry = (Entry)iterator.next();
		}
		while (!this.func_1_b(itemStack, itemStack2, ((AlloyHelper)entry.getKey()).GetFirstSlot(), ((AlloyHelper)entry.getKey()).GetSecondSlot()));
		return (ItemStack) entry.getValue();
	}
	
	public int getInputQuanity(ItemStack itemStack) {
		Iterator iterator = this.field_h_1.entrySet().iterator();
		Entry entry;
		
		do {
			if (!iterator.hasNext()) {
				return 0;
			}
			entry = (Entry) iterator.next();
		} while (!this.func_2_b(itemStack, ((AlloyHelper)entry.getKey()).GetFirstSlot()));
		return ((AlloyHelper) entry.getKey()).itemStackinput1.stackSize;
	}
	
	public int getInputQuanity2(ItemStack itemStack) {
		Iterator iterator = this.field_h_1.entrySet().iterator();
		Entry entry;
		
		do {
			if (!iterator.hasNext()) {
				return 0;
			}
			entry = (Entry) iterator.next();
		} while (!this.func_2_b(itemStack, ((AlloyHelper)entry.getKey()).GetSecondSlot()));
		return ((AlloyHelper) entry.getKey()).itemStackinput2.stackSize;
	}
	
	public ItemStack FindOutput(ItemStack itemStack) {
		Iterator iterator = this.field_h_1.entrySet().iterator();
		Entry entry;
		do {
			if (!iterator.hasNext()) {
				return null;
			}
			entry = (Entry)iterator.next();
		}
		while(!this.func_2_b(itemStack, ((AlloyHelper)entry.getKey()).GetFirstSlot()));
		return (ItemStack) entry.getValue();
	}
	
	public ItemStack FindOutput2(ItemStack itemStack) {
		Iterator iterator = this.field_h_1.entrySet().iterator();
		Entry entry;
		do {
			if (!iterator.hasNext()) {
				return null;
			}
			entry = (Entry) iterator.next();
		}
		while (!this.func_2_b(itemStack, ((AlloyHelper) entry.getKey()).GetSecondSlot()));
		return (ItemStack) entry.getValue();
	}
	
	private boolean func_2_b(ItemStack par1, ItemStack par2) {
		boolean flag = (par1.getItem() == par2.getItem());
		boolean flag1 = par2.getItemDamage() == 32767;
		boolean flag2 = par1.getItemDamage() == par2.getItemDamage();
		return flag && (flag1 || flag2);
	}

	private boolean func_1_b(ItemStack par1, ItemStack par2, ItemStack par3, ItemStack par4) {
		boolean flag = (par1.getItem() == par3.getItem()) && (par2.getItem() == par4.getItem());
		boolean flag1 = par3.getItemDamage() == 32767;
		boolean flag2 = par4.getItemDamage() == 32767;
		boolean flag3 = (par1.getItemDamage() == par3.getItemDamage()) && (par2.getItemDamage() == par4.getItemDamage());
		boolean flag4 = (par1.stackSize >= par3.stackSize) && (par2.stackSize >= par4.stackSize);
		return flag && flag4 && ((flag1 && flag2) || flag3);
	}
}
