package mreyeballs29.decoblocks.block;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PorcelainPowder extends BlockFalling {

	protected PorcelainPowder(Material material, String name) {
		super(material);
		this.setBlockName(name);
		this.setBlockTextureName(Constants.TEXTURE_PREFIX + name);
		this.setHardness(0.6F);
		this.setResistance(3.0F);
		this.setStepSound(soundTypeSand);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHarvestLevel("shovel", 0);
	}
}
