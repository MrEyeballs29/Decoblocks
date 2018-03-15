package mreyeballs29.decoblocks.item;

import java.util.List;

import mreyeballs29.decoblocks.Constants;
import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemNugget extends Item {

	public IIcon[] icons = new IIcon[Names.METALS2.length];
	
	public ItemNugget(String name) {
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setUnlocalizedName(name);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
	}

	@Override
	public String getUnlocalizedName(ItemStack item) {
		return "item." + Names.METALS2[item.getItemDamage() < Names.METALS2.length ? item.getItemDamage() : 0] + "_" + Names.NUGGET;
	}
	
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		
		for (int i = 0; i < icons.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}
	
	@Override
	public void registerIcons(IIconRegister reg) {
		for (int i = 0; i < icons.length; i++) {
			this.icons[i] = reg.registerIcon(Constants.TEXTURE_PREFIX + Names.METALS2[i] + "_" + Names.NUGGET);
		}
	}
	
	@Override
	public IIcon getIconFromDamage(int meta) {
		if (meta >= 0 && meta < icons.length) {
			return icons[meta];
		}
		return icons[0];
	}
}
