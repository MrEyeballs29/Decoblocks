package mreyeballs29.decoblocks.block;

import java.util.List;
import java.util.Random;

import mreyeballs29.decoblocks.item.ModItems;
import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class BlockGemOre extends Block {
	protected BlockGemOre(Material material, String name) {
		super(material);
		this.setBlockName(name);
		this.setHardness(3.0F);
		this.setResistance(3.0F);
		this.setHarvestLevel("pickaxe", 2);
	}
	 
	public IIcon[] icons = new IIcon[8];
	private static Random random = new Random();
	
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		for (int i = 0; i < icons.length; i++) {
			this.icons[i] = reg.registerIcon("decoblock:" + Names.REGGEMS2[i] + "_ore");
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
	public Item getItemDropped(int par1, Random random, int par3) {
		return new ItemStack(ModItems.gem, 1, par1).getItem();
	}
	
	
	@Override
	public int getExpDrop(IBlockAccess world, int metadata, int fortune) {
		return MathHelper.getRandomIntegerInRange(random, 3, 7);
	}
	
	@Override
	public int quantityDroppedWithBonus(int i, Random random) {
		int j = random.nextInt(i + 2) - 1;

        if (j < 0)
        {
            j = 0;
        }

        return this.quantityDropped(random) * (j + 1);
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
