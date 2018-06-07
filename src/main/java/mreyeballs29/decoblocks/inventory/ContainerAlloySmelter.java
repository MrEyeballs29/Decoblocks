package mreyeballs29.decoblocks.inventory;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mreyeballs29.decoblocks.item.ModItems;
import mreyeballs29.decoblocks.recipe.AlloyRecipes;
import mreyeballs29.decoblocks.tileentity.TileEntityAlloySmelter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;
import net.minecraft.item.ItemStack;

public class ContainerAlloySmelter extends Container {

	private TileEntityAlloySmelter alloysmeltertile;
	private int lastAlloyTime;
	private int lastBurnTime;
	private int lastItemBurnTime;
	
	public ContainerAlloySmelter(InventoryPlayer player, TileEntityAlloySmelter tilealloysmelter) {
		this.alloysmeltertile = tilealloysmelter;
		this.addSlotToContainer(new Slot(tilealloysmelter, 0, 45, 17));
		this.addSlotToContainer(new Slot(tilealloysmelter, 1, 67, 17));
		this.addSlotToContainer(new Slot(tilealloysmelter, 2, 56, 53));
		this.addSlotToContainer(new SlotFurnace(player.player, tilealloysmelter, 3, 116, 35));
		
		int i;
		
		for (i = 0; i < 3; ++i) {
			for (int j = 0; j < 9; j++) {
				this.addSlotToContainer(new Slot(player, j+i*9+9, 8+j*18, 84+i*18));
			}
		}
		
		for (i = 0; i < 9; ++i) {
			this.addSlotToContainer(new Slot(player, i, 8+i*18, 142));
		}
	}
	
	@Override
	public void addCraftingToCrafters(ICrafting crafter) {
		super.addCraftingToCrafters(crafter);
		crafter.sendProgressBarUpdate(this, 0, this.alloysmeltertile.alloyCookTime);
		crafter.sendProgressBarUpdate(this, 1, this.alloysmeltertile.furnaceBurnTime);
		crafter.sendProgressBarUpdate(this, 2, this.lastItemBurnTime);
	}
	
	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		for (int i = 0; i < this.crafters.size(); i++) {
			ICrafting craft = (ICrafting) this.crafters.get(i);
			
			if (this.lastAlloyTime != this.alloysmeltertile.alloyCookTime) {
				craft.sendProgressBarUpdate(this, 0, this.alloysmeltertile.alloyCookTime);
			}
			
			if (this.lastBurnTime != this.alloysmeltertile.furnaceBurnTime) {
				craft.sendProgressBarUpdate(this, 0, this.alloysmeltertile.furnaceBurnTime);
			}
			
			if (this.lastItemBurnTime != this.alloysmeltertile.currentItemBurnTime) {
				craft.sendProgressBarUpdate(this, 0, this.alloysmeltertile.currentItemBurnTime);
			}
			
			this.lastBurnTime = this.alloysmeltertile.furnaceBurnTime;
			this.lastAlloyTime = this.alloysmeltertile.alloyCookTime;
			this.lastItemBurnTime = this.alloysmeltertile.currentItemBurnTime;
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int par1, int par2) {
		if (par1 == 0) {
			this.alloysmeltertile.alloyCookTime = par2;
		}
		if (par1 == 1) {
			this.alloysmeltertile.furnaceBurnTime = par2;
		}
		if (par1 == 2) {
			this.alloysmeltertile.currentItemBurnTime = par2;
		}
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return this.alloysmeltertile.isUseableByPlayer(player);
	}
	
	@SuppressWarnings("unused")
	private int BasedOnAlloy(int par2) {
		Slot slot = (Slot) this.inventorySlots.get(1);
		return slot.slotNumber != par2 ? 1 : 0;
	}
	
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int par2) {
		ItemStack itemStack = null;
		Slot slot = (Slot) this.inventorySlots.get(par2);
		
		if (slot != null && slot.getHasStack()) {
			ItemStack itemStack1 = slot.getStack();
			itemStack = itemStack1.copy();
			
			if (par2 == 3) {
				if(!this.mergeItemStack(itemStack1, 4, 40, true)) {
					return null;
				};
				slot.onSlotChange(itemStack1, itemStack);
			} else if (par2 != 1 && par2 != 0 && par2 != 2) {
				if(AlloyRecipes.alloy().getOutput(itemStack1, new ItemStack(Items.iron_ingot, 1, 0)) != null) {
					if (!this.mergeItemStack(itemStack1, 0, 1, false)) {
						return null;
					};
				} else if (TileEntityAlloySmelter.isItemFuel(itemStack1)) {
					if (!this.mergeItemStack(itemStack1, 2, 2, false)) {
						return null;
					};
					
				} else if (par2 >= 4 && par2 < 31) {
					if (!this.mergeItemStack(itemStack1, 31, 40, false)) {
						return null;
					}
				} else if (par2 >= 30 && par2 < 40 && !this.mergeItemStack(itemStack1, 4, 31, false)) {
					return null;
				};
			} else if (!this.mergeItemStack(itemStack1, 4, 40, false)) {
				return null;
			}
			if (itemStack1.stackSize == 0) {
				slot.putStack((ItemStack) null);
			} else {
				slot.onSlotChanged();
			}
			if (itemStack1.stackSize == itemStack.stackSize) {
				return null;
			}
			slot.onPickupFromSlot(player, itemStack1);
		}
		return itemStack;
	}
}
