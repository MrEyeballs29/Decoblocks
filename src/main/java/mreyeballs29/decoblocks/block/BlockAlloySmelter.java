package mreyeballs29.decoblocks.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mreyeballs29.decoblocks.Constants;
import mreyeballs29.decoblocks.Decoblocks;
import mreyeballs29.decoblocks.libs.Names;
import mreyeballs29.decoblocks.tileentity.TileEntityAlloySmelter;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlockAlloySmelter extends BlockContainer {
	
	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;
	
	private static boolean field_b_1;
	private boolean field_b_2;
	private Random field_r_1 = new Random();
	
	protected BlockAlloySmelter(Material material, boolean par2, String name) {
		super(material);
		this.field_b_2 = par2;
		this.setBlockName("block" + Names.TitleCase(name));
		this.setHardness(3.0F);
		this.setResistance(6.0F);
		this.setLightLevel(this.field_b_2 ? 0.875F : 0.0F);
	}
	
	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, x, y, z);
		this.direction(world, x, y, z);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta) {
		if (meta == 0) {
			meta = 3;
		}
		return side == 0 ? this.top : (side == 1 ? this.top : (side == meta ? this.front : this.blockIcon));
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister par1) {
		this.blockIcon = par1.registerIcon("minecraft:furnace_side");
		this.front = par1.registerIcon(this.field_b_2 ? Constants.TEXTURE_PREFIX + "alloysmelter_front_on" : Constants.TEXTURE_PREFIX + "alloysmelter_front_off");
		this.top = par1.registerIcon("minecraft:furnace_top");
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par5, float par6, float par7, float par8) {
		if (world.isRemote) {
		return true;
		} else {
			TileEntityAlloySmelter alloysmelter = (TileEntityAlloySmelter) world.getTileEntity(x, y, z);
			
			if (alloysmelter != null) {
				player.openGui(Decoblocks.instance, 0, world, x, y, z);
			}
			
			return true;
		}
	}
	
	@Override
	public Item getItemDropped(int par1, Random random, int par3) {
		return Item.getItemFromBlock(ModBlocks.alloysmelter);
	}
	
	@Override
	public Item getItem(World par1, int par2, int par3, int par4) {
		return Item.getItemFromBlock(ModBlocks.alloysmelter);
	}
	
	private void direction(World world, int x, int y, int z) {
		if (!world.isRemote) {
			Block direction = world.getBlock(x, y, z - 1);
			Block direction1 = world.getBlock(x, y, z + 1);
			Block direction2 = world.getBlock(x - 1, y, z);
			Block direction3 = world.getBlock(x + 1, y, z);
			byte byte0 = 3;

			if (direction.func_149730_j() && !direction1.func_149730_j()) {
				byte0 = 3;
			}

			if (direction1.func_149730_j() && !direction.func_149730_j()) {
				byte0 = 2;
			}

			if (direction2.func_149730_j() && !direction3.func_149730_j()) {
				byte0 = 5;
			}

			if (direction3.func_149730_j() && !direction2.func_149730_j()) {
				byte0 = 4;
			}

			world.setBlockMetadataWithNotify(x, y, z, byte0, 2);
		}
	}
	
	
    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLiving, ItemStack itemStack)
    {
        int angle = MathHelper.floor_double( (double) (entityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (angle == 0) {
        	world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }
        if (angle == 1)
        {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }

        if (angle == 2)
        {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }

        if (angle == 3)
        {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }
        
        if (itemStack.hasDisplayName()) {
        	((TileEntityAlloySmelter) world.getTileEntity(x, y, z)).VaritName(itemStack.getDisplayName());
        }
    }
    
    public static void updateBlockState(boolean lighted, World world, int x, int y, int z) {
    	int direction = world.getBlockMetadata(x, y, z);
    	TileEntity tile = world.getTileEntity(x, y, z);
    	field_b_1 = true;
    	
    	if(lighted) {
    		world.setBlock(x, y, z, ModBlocks.alloysmelter_on);
    	} else {
    		world.setBlock(x, y, z, ModBlocks.alloysmelter);
    	}
    	
    	field_b_1 = false;
    	world.setBlockMetadataWithNotify(x, y, z, direction, 3);
    	
    	if (tile != null) {
			tile.validate();
			world.setTileEntity(x, y, z, tile);
		}
	}
    
    @Override
    public void breakBlock(World world, int x, int y, int z, Block block, int meta) {
    	if (!field_b_1) {
    		TileEntityAlloySmelter tileEntitySmelter = (TileEntityAlloySmelter) world.getTileEntity(x, y, z);
    		if (tileEntitySmelter != null) {
				for (int i = 0; i < tileEntitySmelter.getSizeInventory(); i++) {
					ItemStack itemStack = tileEntitySmelter.getStackInSlot(i);
					
					if (itemStack != null) {
						float f = this.field_r_1.nextFloat() * 0.6F + 0.1F;
						float f1 = this.field_r_1.nextFloat() * 0.6F + 0.1F;
						float f2 = this.field_r_1.nextFloat() * 0.6F + 0.1F;
						
						while (itemStack.stackSize > 0) {
							int j = this.field_r_1.nextInt(21) + 10;
							
							if (j > itemStack.stackSize) {
								j = itemStack.stackSize;
							}
							
							itemStack.stackSize -= j;
							
							EntityItem entityItem = new EntityItem(world, (double) ((float) x + f), (double) ((float) y + f1), (double) ((float) z + f2), new ItemStack(itemStack.getItem(), j, itemStack.getItemDamage()));
							
							if (itemStack.hasTagCompound()) {
								entityItem.getEntityItem().setTagCompound((NBTTagCompound) itemStack.getTagCompound().copy());
							}
							
							float f3 = 0.05F;
							entityItem.motionX = (double) ((float) this.field_r_1.nextGaussian() * f3);
							entityItem.motionY = (double) ((float) this.field_r_1.nextGaussian() * f3 + 0.2F);
							entityItem.motionZ = (double) ((float) this.field_r_1.nextGaussian() * f3);
							
							world.spawnEntityInWorld(entityItem);
						}
					}
				}
				world.func_147453_f(x, y, z, block);
			}
    	}
    	super.breakBlock(world, x, y, z, block, meta);
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void randomDisplayTick(World world, int x, int y, int z, Random random) {
    	if (this.field_b_2) {
    		int direction = world.getBlockMetadata(x, y, z);
    		
    		float xx = (float) x + 0.5F, 
    			  yy = (float) y + 0.0F + random.nextFloat() * 6.0F / 16.0F, 
    			  zz = (float) z + 0.5F,
    			  xx2 = 0.52F,
    			  zz2 = random.nextFloat() * 0.6F - 0.3F;
            if (direction == 4)
            {
                world.spawnParticle("smoke", (double)(xx - xx2), (double)yy, (double)(zz + zz2), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(xx - xx2), (double)yy, (double)(zz + zz2), 0.0D, 0.0D, 0.0D);
            }
            else if (direction == 5)
            {
            	world.spawnParticle("smoke", (double)(xx + xx2), (double)yy, (double)(zz + zz2), 0.0D, 0.0D, 0.0D);
            	world.spawnParticle("flame", (double)(xx + xx2), (double)yy, (double)(zz + zz2), 0.0D, 0.0D, 0.0D);
            }
            else if (direction == 2)
            {
            	world.spawnParticle("smoke", (double)(xx + zz2), (double)yy, (double)(zz - xx2), 0.0D, 0.0D, 0.0D);
            	world.spawnParticle("flame", (double)(xx + zz2), (double)yy, (double)(zz - xx2), 0.0D, 0.0D, 0.0D);
            }
            else if (direction == 3)
            {
            	world.spawnParticle("smoke", (double)(xx + zz2), (double)yy, (double)(zz + xx2), 0.0D, 0.0D, 0.0D);
            	world.spawnParticle("flame", (double)(xx + zz2), (double)yy, (double)(zz + xx2), 0.0D, 0.0D, 0.0D);
            }
    	}
    }
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityAlloySmelter();
	}
}
