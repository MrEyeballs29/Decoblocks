package mreyeballs29.decoblocks.block;

import java.util.List;

import mreyeballs29.decoblocks.Constants;
import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockStoneMeta extends Block {

	protected BlockStoneMeta(Material material, String name, String toolClass, int level) {
		super(material);
		this.setBlockName(name);
		this.setBlockTextureName(Constants.TEXTURE_PREFIX + name);
		this.setHarvestLevel(toolClass, level);
	}
	
	public IIcon[] icons = new IIcon[Names.ROCK_TYPES.length];
	
    @Override
    public float getBlockHardness(World world, int par2, int par3, int par4)
    {
        final int meta = world.getBlockMetadata(par2, par3, par4);
        return meta == 5 ? (this.blockHardness * 2.0F) : this.blockHardness;
    }
    
	@Override
    public float getExplosionResistance(Entity par1Entity, World world, int x, int y, int z, double explosionX, double explosionY, double explosionZ)
    {
        final int meta = world.getBlockMetadata(x, y, z);
        return (meta == 5 ? (this.blockResistance * 2.0F) : this.blockResistance) / 2.0F;
    }
	
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < icons.length; i++) {
			this.icons[i] = reg.registerIcon(this.textureName + "_" + Names.ROCK_TYPES[i]);
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
