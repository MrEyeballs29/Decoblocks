package mreyeballs29.decoblocks.handler;

import cpw.mods.fml.common.network.IGuiHandler;
import mreyeballs29.decoblocks.gui.GUIAlloySmelter;
import mreyeballs29.decoblocks.inventory.ContainerAlloySmelter;
import mreyeballs29.decoblocks.tileentity.TileEntityAlloySmelter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GUIHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == 0) {
			TileEntityAlloySmelter alloySmeltertile = (TileEntityAlloySmelter) world.getTileEntity(x, y, z);
			return new ContainerAlloySmelter(player.inventory, alloySmeltertile);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == 0) {
			TileEntityAlloySmelter alloySmeltertile = (TileEntityAlloySmelter) world.getTileEntity(x, y, z);
			return new GUIAlloySmelter(player.inventory, alloySmeltertile);
		}
		return null;
	}

}
