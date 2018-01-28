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
import net.minecraftforge.oredict.OreDictionary;

public class ColorPorcelain extends Block {
	protected ColorPorcelain(Material material, String Name) {
		super(material);
		this.setBlockName(Name);
		this.setBlockTextureName(Constants.TEXTURE_PREFIX + Name);
		this.setHardness(1.2F);
		this.setResistance(5.0F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHarvestLevel("pickaxe", 0);
	}
	
	public void addOreDict() {
		OreDictionary.registerOre("blockPorcelain", this);
	}

	public IIcon[] icons = new IIcon[16];
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < 16; i++) {
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
	
	public int damagedDropped(int oldmeta) {
		return oldmeta;
	}
	
	@Override
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		
		for (int i = 0; i < this.icons.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
}
