package mreyeballs29.decoblocks.libs;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class DCMaterial extends Material {
	 public DCMaterial(MapColor mapcolor) {
		super(mapcolor);
	}

	public static final Material plastic = (new DCMaterial(MapColor.silverColor)).setBurning();
	public static final Material cream = (new DCMaterial(MapColor.snowColor)).setRequiresTool();
}
