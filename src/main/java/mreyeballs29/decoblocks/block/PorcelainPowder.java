package mreyeballs29.decoblocks.block;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;

public class PorcelainPowder extends BlockFalling {

	protected PorcelainPowder(Material material, String name) {
		super(material);
		this.setBlockName(name);
		this.setBlockTextureName(Constants.TEXTURE_PREFIX + name);
		this.setHarvestLevel("shovel", 0);
	}
}
