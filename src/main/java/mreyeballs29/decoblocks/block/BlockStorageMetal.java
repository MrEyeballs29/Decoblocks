package mreyeballs29.decoblocks.block;

import java.util.List;

import mreyeballs29.decoblocks.Constants;
import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockStorageMetal extends Block {

	protected BlockStorageMetal(Material material, String Name) {
		super(material);
		this.setBlockName(Name);
		this.setBlockTextureName(Constants.TEXTURE_PREFIX + Name);
		for (int i = 0; i < Names.METALS.length; i++) {
			this.setHarvestLevel("pickaxe", LEVELS[i], i);
		}
	}

	public static final int[] LEVELS = new int[] {1, 1, 2, 2, 2, 2, 1, 2, 3, 1, 2, 2, 2, 2, 2, 2};
	public static final float[] HARDNESSVALUE = new float[] {4.0F, 4.0F, 6.0F, 5.5F, 6.0F, 3.5F, 4.5F, 6.0F, 7.5F, 4.5F, 6.0F, 6.0F, 6.5F, 5.0F, 3.0F, 5.0F};
	public IIcon[] icons = new IIcon[Names.METALS.length];

	@Override
	public boolean isBeaconBase(IBlockAccess worldObj, int x, int y, int z, int beaconX, int beaconY, int beaconZ) {
		return true;
	}
	
	@Override
    public float getBlockHardness(World world, int par2, int par3, int par4)
    {
        final int meta = world.getBlockMetadata(par2, par3, par4);
        if (meta < HARDNESSVALUE.length) {
        	return HARDNESSVALUE[meta];
        }
        return 5.0F;
    }
		
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < icons.length; i++) {
			this.icons[i] = reg.registerIcon(Constants.TEXTURE_PREFIX + Names.METALS[i] + "_block");
		}
	}
	
	@Override
	public IIcon getIcon (int side, int meta) {
		if (meta >= 0 && meta < icons.length) {
			return icons[meta];
		}
		return icons[0];
	}
	
	@Override
	public int damageDropped(int meta) {
		return meta;
	}
	
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		
		for (int i = 0; i < icons.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
}
