package mreyeballs29.decoblocks.block;

import java.util.List;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class Stone extends Block {

	protected Stone(Material material, String name) {
		super(material);
		this.setBlockName(name);
		this.setBlockTextureName(Constants.TEXTURE_PREFIX + name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHarvestLevel("pickaxe", 0);
	}
	
	public static final String[] STONE_TYPES = new String[] {"smooth", "reinforced_bricks", "tiles", "small_tiles", "small_bricks", "windmill_bricks_a", "windmill_bricks_b", "square_bricks"};
	public IIcon[] icons = new IIcon[8];
	/*
	 * Returns if the block hardness is set to 1.5F else it is reinforced as 3.0F
	 */
    @Override
    public float getBlockHardness(World world, int par2, int par3, int par4)
    {
        final int meta = world.getBlockMetadata(par2, par3, par4);
        if (meta != 1) {
            return 1.5F;
        } else if (meta == 1) {
        	return 3.0F;
        }
        return this.blockHardness;
    }
    
	@Override
    public float getExplosionResistance(Entity par1Entity, World world, int x, int y, int z, double explosionX, double explosionY, double explosionZ)
    {
        int meta = world.getBlockMetadata(x, y, z);
        if (meta != 1) {
            return 10.0F;
        } else if (meta == 1) {
        	return 20.0F;
        }
        return blockResistance / 5.0F;
    }
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < this.icons.length; i++) {
			this.icons[i] = reg.registerIcon(this.textureName + "_" + STONE_TYPES[i]);
		}
	}
	
	@Override
	public IIcon getIcon (int side, int meta) {
		if (meta >= 0 && meta < 8) {
			return icons[meta];
		}
		return null;
	}
	
	@Override
	public int damageDropped(int meta) {
		if (meta >= 8) {
			meta = 0;
		}
		return meta;
	}
	
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < this.icons.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
}
