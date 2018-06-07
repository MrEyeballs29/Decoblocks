package mreyeballs29.decoblocks.tileentity;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mreyeballs29.decoblocks.block.BlockAlloySmelter;
import mreyeballs29.decoblocks.item.ModItems;
import mreyeballs29.decoblocks.recipe.AlloyRecipes;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

public class TileEntityAlloySmelter extends TileEntity implements ISidedInventory {
    private static final int[] alloyOutput = new int[] {3};
    private static final int[] alloyInput = new int[] {0};
    private static final int[] alloyInput2 = new int[] {1};
    private static final int[] fuelInput = new int[] {2, 2};
    
    private ItemStack[] itemstacks = new ItemStack[4];

    public int furnaceBurnTime;
    public int currentItemBurnTime;
    public int alloyCookTime;
    
    private String varit;
    
    public void VaritName(String name) {
    	this.varit = name;
    }
	@Override
	public int getSizeInventory() {
		return this.itemstacks.length;
	}

	@Override
	public ItemStack getStackInSlot(int p_70301_1_) {
		return this.itemstacks[p_70301_1_];
	}

	@Override
	public ItemStack decrStackSize(int par1, int par2) {
        if (this.itemstacks[par1] != null)
        {
            ItemStack itemstack;

            if (this.itemstacks[par1].stackSize <= par2)
            {
                itemstack = this.itemstacks[par1];
                this.itemstacks[par1] = null;
                return itemstack;
            }
            else
            {
                itemstack = this.itemstacks[par1].splitStack(par2);

                if (this.itemstacks[par1].stackSize == 0)
                {
                    this.itemstacks[par1] = null;
                }

                return itemstack;
            }
        }
        else
        {
            return null;
        }
    }

	@Override
	public ItemStack getStackInSlotOnClosing(int par) {
		if (this.itemstacks[par] != null) {
			ItemStack itemstack = this.itemstacks[par];
			this.itemstacks[par] = null;
			return itemstack;
		} else {
			return null;
		}
	}

	@Override
	public void setInventorySlotContents(int par, ItemStack itemStack) {
		this.itemstacks[par] = itemStack;
		
		if (itemStack != null && itemStack.stackSize > this.getInventoryStackLimit()) {
			itemStack.stackSize = this.getInventoryStackLimit();
		}
	}

	@Override
	public String getInventoryName() {
		return this.hasCustomInventoryName() ? this.varit : "container.alloysmelter";
	}

	@Override
	public boolean hasCustomInventoryName() {
		return this.varit != null && this.varit.length() > 0;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		NBTTagList nbtTagList = compound.getTagList("Items", 10);
		this.itemstacks = new ItemStack [this.getSizeInventory()];
		
		for (int i = 0; i < nbtTagList.tagCount(); i++) {
			NBTTagCompound tagCompound1 = nbtTagList.getCompoundTagAt(i);
			byte bt0 = tagCompound1.getByte("Slot");
			
			if (bt0 >= 0 && bt0 < this.itemstacks.length) {
				this.itemstacks[bt0] = ItemStack.loadItemStackFromNBT(tagCompound1);
			}
		}
		
		this.furnaceBurnTime = compound.getShort("BurnTime");
		this.alloyCookTime = compound.getShort("CookTime");
		this.currentItemBurnTime = getItemBurnTime(this.itemstacks[1]);
		
		if (compound.hasKey("CustomName", 8)) {
			this.varit = compound.getString("CustomName");
		}
	}

	@Override
	public void writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);
		compound.setShort("BurnTime", (short) this.furnaceBurnTime);
		compound.setShort("CookTime", (short) this.alloyCookTime);
		NBTTagList tagList = new NBTTagList();
		
		for (int i = 0; i < this.itemstacks.length; i++) {
			if (this.itemstacks[i] != null) {
				NBTTagCompound tagCompound1 = new NBTTagCompound();
				tagCompound1.setByte("Slot", (byte) i);
				this.itemstacks[i].writeToNBT(tagCompound1);
				tagList.appendTag(tagCompound1);
			}
		}
		
		compound.setTag("Items", tagList);
		
		if(this.hasCustomInventoryName()) {
			compound.setString("CustomName", this.varit);
		}
	}
	
	@SideOnly(Side.CLIENT)
	public int getProgressScaled(int par1) {
		return this.alloyCookTime * par1 / 400;
	}
	
	@SideOnly(Side.CLIENT)
	public int getRemainingBurnTime(int par1) {
		if(this.furnaceBurnTime == 200) {
			this.furnaceBurnTime = 0;
		}
		return this.furnaceBurnTime * par1 / this.currentItemBurnTime;
	}
	
	public boolean isBurning() {
		return this.furnaceBurnTime > 0;
	}
	
	@Override
	public void updateEntity() {
		boolean flag = this.furnaceBurnTime > 0;
		boolean flag1 = false;
		
		if (this.furnaceBurnTime > 0) {
			--this.furnaceBurnTime;
		}
		
		if (!this.worldObj.isRemote) {
			if (this.furnaceBurnTime == 0 && this.canAlloy()) {
				this.currentItemBurnTime = this.furnaceBurnTime = getItemBurnTime(this.itemstacks[2]);
				
				if (this.furnaceBurnTime > 0) {
					flag1 = true;
					if (this.itemstacks[2] != null) {
						--this.itemstacks[2].stackSize;
						
						if (this.itemstacks[2].stackSize == 0) {
							this.itemstacks[2] = this.itemstacks[2].getItem().getContainerItem(this.itemstacks[2]);
						}
					}
				}
			}
			
			if (this.isBurning() && this.canAlloy()) {
				++this.alloyCookTime;
				if (this.alloyCookTime == 400) {
					this.alloyCookTime = 0;
					this.produceAlloy();
					flag1 = true;
				}
			} else {
				this.alloyCookTime = 0;
			}
		}
		
		if (flag != this.furnaceBurnTime > 0) {
			flag1 = true;
			BlockAlloySmelter.updateBlockState(this.furnaceBurnTime > 0, this.worldObj, this.xCoord, this.yCoord, this.zCoord);
		}
		
		if (flag1) {
			this.markDirty();
		}
	}
	
	private void produceAlloy() {
		if (this.canAlloy()) {
			ItemStack itemStack = AlloyRecipes.alloy().getOutput(this.itemstacks[0], this.itemstacks[1]);
			
			if (this.itemstacks[3] == null) {
				this.itemstacks[3] = itemStack.copy();
			} else if (this.itemstacks[3].getItem() == itemStack.getItem()) {
				this.itemstacks[3].stackSize += itemStack.stackSize;
			}
			if (Consumable(ModItems.ingot, 0, 0)) {
				if (Consumable(ModItems.ingot, 1, 1)) {
					this.itemstacks[0].stackSize -= 3;
					this.itemstacks[1].stackSize -= 1;
				} else if (Consumable(ModItems.ingot, 1, 9)) {
					this.itemstacks[0].stackSize -= 3;
					this.itemstacks[1].stackSize -= 1;
				}
			} else if (Consumable(ModItems.ingot, 0, 3)) {
				if (Consumable(Items.iron_ingot, 1, 2)) {
					this.itemstacks[0].stackSize -= 1;
					this.itemstacks[1].stackSize -= 2;
				}
			} else {
				this.itemstacks[0].stackSize -= 1;
				this.itemstacks[1].stackSize -= 1;
			}
			if (this.itemstacks[0].stackSize == 0) {
				this.itemstacks[0] = null;
			}
			if (this.itemstacks[1].stackSize == 0) {
				this.itemstacks[1] = null;
			}
		}
	}

	private boolean Consumable(Item item, int par2, int par3) {
		return this.itemstacks[par2].getItem() == item && this.itemstacks[par2].getItemDamage() == par3;
	}
	
	private boolean canAlloy() {
		if (this.itemstacks[0] == null || this.itemstacks[1] == null) {
			return false;
		} else {
			ItemStack itemStack = AlloyRecipes.alloy().getOutput(this.itemstacks[0], this.itemstacks[1]);
			if (itemStack == null) {
				return false;
			}
			if (this.itemstacks[3] == null) {
				return true;
			}
			if (!this.itemstacks[3].isItemEqual(itemStack)) {
				return false;
			}
			int result = itemstacks[3].stackSize + itemStack.stackSize;
			return result <= getInventoryStackLimit() && result <= this.itemstacks[3].getMaxStackSize();
		}
	}
	
	private static int getItemBurnTime(ItemStack itemStack) {
		if (itemStack == null) {
			return 0;
		} else {
        	int moddedBurnTime = net.minecraftforge.event.ForgeEventFactory.getFuelBurnTime(itemStack);
        	if (moddedBurnTime >= 0) return moddedBurnTime;
			
			Item item = itemStack.getItem();
			
			if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.air) {
				Block block = Block.getBlockFromItem(item);

                if (block == Blocks.wooden_slab)
                {
                    return 150;
                }

                if (block.getMaterial() == Material.wood)
                {
                    return 300;
                }

                if (block == Blocks.coal_block)
                {
                    return 16000;
                }
			}
			
            if (item instanceof ItemTool && ((ItemTool)item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemSword && ((ItemSword)item).getToolMaterialName().equals("WOOD")) return 200;
            if (item instanceof ItemHoe && ((ItemHoe)item).getToolMaterialName().equals("WOOD")) return 200;
            if (item == Items.stick) return 100;
            if (item == Items.coal) return 1600;
            if (item == Items.lava_bucket) return 20000;
            if (item == Item.getItemFromBlock(Blocks.sapling)) return 100;
            if (item == Items.blaze_rod) return 2400;
            
            return GameRegistry.getFuelValue(itemStack);
		}
	}

	public static boolean isItemFuel(ItemStack itemStack) {
		return getItemBurnTime(itemStack) > 0;
	}
	
	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : player.getDistanceSq((double) this.xCoord + 0.5, (double) this.yCoord + 0.5, (double) this.zCoord + 0.5) < 64.0;
	}

	@Override
	public void openInventory() {
		
	}

	@Override
	public void closeInventory() {
		
	}

	@Override
	public boolean isItemValidForSlot(int par1, ItemStack par2) {
		return par1 == 3 ? false : (par1 == 1 ? isItemFuel(par2) : true);
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int par1) {
		return par1 == 0 ? alloyOutput : ((par1 == 1 || par1 == 4) ? fuelInput : (par1 == 2 ? alloyInput : alloyInput2));
	}

	@Override
	public boolean canInsertItem(int par1, ItemStack itemStack, int par2) {
		// TODO Auto-generated method stub
		return this.isItemValidForSlot(par1, itemStack);
	}

	@Override
	public boolean canExtractItem(int par1, ItemStack itemStack, int par2) {
		// TODO Auto-generated method stub
		return par2 != 0 || par1 != 1 || itemStack.getItem() == Items.bucket;
	}

}
