package mreyeballs29.decoblocks.block;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PorcelainPowder extends Block {

	protected PorcelainPowder(String unlocalizedName, Material material) {
		super(material);
		this.setBlockName(unlocalizedName);
		this.setBlockTextureName(Constants.TEXTURE_PREFIX + unlocalizedName);
		this.setHardness(0.6F);
		this.setResistance(3.0F);
		this.setStepSound(soundTypeSand);
		this.setHarvestLevel("shovel", 0);
	}

}
