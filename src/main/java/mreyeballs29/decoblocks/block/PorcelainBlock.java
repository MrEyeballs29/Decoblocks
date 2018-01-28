package mreyeballs29.decoblocks.block;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.oredict.OreDictionary;

public class PorcelainBlock extends Block {

	protected PorcelainBlock(Material material, String Name) {
		super(material);
		this.setBlockTextureName(Constants.TEXTURE_PREFIX + Name);
		this.setBlockName(Name);
		this.setHardness(1.2F);
		this.setResistance(5.0F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHarvestLevel("pickaxe", 0);
	}
	
	public void addOreDict() {
		OreDictionary.registerOre("blockPorcelain", this);
	}
}
