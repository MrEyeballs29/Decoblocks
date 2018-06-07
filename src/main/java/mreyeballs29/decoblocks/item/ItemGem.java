package mreyeballs29.decoblocks.item;

import java.util.List;

import mreyeballs29.decoblocks.Constants;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemGem extends Item {
	
	private String[] TEXTGEM = {
			"ruby",
			"sapphire",
			"topaz",
			"amethyst",
			"green_sapphire",
			"peridot",
			"blue_topaz",
			"yellow_sapphire"
	};
	
	private String[] UnlocalizedGEM = {
			"Ruby",
			"Sapphire",
			"Topaz",
			"Amethyst",
			"GreenSapphire",
			"Peridot",
			"BlueTopaz",
			"YellowSapphire"
	};
	
	protected IIcon[] icons = new IIcon[8];
	public ItemGem(String name) {
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setUnlocalizedName(name);
		this.setTextureName(Constants.TEXTURE_PREFIX + name);
		this.setCreativeTab(Constants.TabDecoClassic);
	}
	
	@Override
	public boolean isBeaconPayment(ItemStack stack) {
		return true;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack item) {
		return "item.gem" + UnlocalizedGEM[item.getItemDamage() < 8 ? item.getItemDamage() : 0];
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
			if (i == 0) {
				this.icons[0] = reg.registerIcon("minecraft:ruby");
				continue;
			}
			this.icons[i] = reg.registerIcon(Constants.TEXTURE_PREFIX + TEXTGEM[i]);
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
