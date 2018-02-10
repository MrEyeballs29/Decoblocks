package mreyeballs29.decoblocks.block;

import java.util.List;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class Stone extends Block {

	protected Stone(Material material, String name) {
		super(material);
		this.setBlockName(name);
		this.setBlockTextureName(Constants.TEXTURE_PREFIX + name);
		this.setHardness(1.5F);
		this.setResistance(10.0F);
		this.setHarvestLevel("pickaxe", 0);
	}
	
	public IIcon[] icons = new IIcon[5];
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < 5; i++) {
			this.icons[i] = reg.registerIcon(this.textureName + "_" + i);
		}
	}
	
	@Override
	public IIcon getIcon (int side, int meta) {
		if (meta < 0 || meta >= icons.length) {
			meta = 0;
		}
		return this.icons[meta];
	}
	
	@Override
	public int damageDropped(int oldmeta) {
		return oldmeta;
	}
	
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < this.icons.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
}
