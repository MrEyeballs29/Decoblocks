package mreyeballs29.decoblocks.item;

import java.util.List;

import mreyeballs29.decoblocks.Constants;
import mreyeballs29.decoblocks.libs.Names;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemIngot extends Item {

	public IIcon[] icons = new IIcon[Names.METALS.length];

	public ItemIngot(String name) {
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setUnlocalizedName(name);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
	}

	@Override
	public boolean isBeaconPayment(ItemStack stack) {
		return true;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack item) {
		return "item." + Names.INGOT + Names.TitleCase(Names.METALS[item.getItemDamage() < Names.METALS.length ? item.getItemDamage() : 0]);
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
			this.icons[i] = reg.registerIcon(Constants.TEXTURE_PREFIX + Names.METALS[i] + "_" + Names.INGOT);
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
