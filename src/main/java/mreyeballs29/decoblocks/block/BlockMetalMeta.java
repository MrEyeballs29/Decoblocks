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

public class BlockMetalMeta extends Block {
	protected BlockMetalMeta(Material material, String name, String toolClass, int level) {
		super(material);
		this.setBlockName(name);
		this.setBlockTextureName(Constants.TEXTURE_PREFIX + name);
		this.setHarvestLevel(toolClass, level);
	}

	public IIcon[] icons = new IIcon[Names.ALL_TYPES.length];
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < icons.length; i++) {
			this.icons[i] = reg.registerIcon(this.textureName + "_" + Names.ALL_TYPES[i]);
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
