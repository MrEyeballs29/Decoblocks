package mreyeballs29.decoblocks.block;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Cream extends Block {

	protected Cream(Material Material, String Name) {
		super(Material);
		this.setBlockName(Name);
		this.setBlockTextureName(Constants.TEXTURE_PREFIX + Name);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(0.4F);
		this.setResistance(2.0F);
		this.setStepSound(soundTypeSnow);
		this.setHarvestLevel("shovel", 1);
	}
}
