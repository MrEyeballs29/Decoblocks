package mreyeballs29.decoblocks.block;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block {

	protected BlockBasic(Material material, String Name, String toolClass, int level) {
		super(material);
		this.setBlockName(Name);
		this.setBlockTextureName(Constants.TEXTURE_PREFIX + Name);
		this.setHarvestLevel(toolClass, level);
	}
}
