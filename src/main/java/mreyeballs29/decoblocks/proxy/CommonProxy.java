package mreyeballs29.decoblocks.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import mreyeballs29.decoblocks.Constants;
import mreyeballs29.decoblocks.Decoblocks;
import mreyeballs29.decoblocks.block.ModBlocks;
import mreyeballs29.decoblocks.handler.GUIHandler;
import mreyeballs29.decoblocks.item.ModItems;
import mreyeballs29.decoblocks.item.crafting.ShapedCrafting;
import mreyeballs29.decoblocks.item.crafting.ShapelessCrafting;
import mreyeballs29.decoblocks.item.crafting.Smelting;
import mreyeballs29.decoblocks.tileentity.TileEntityAlloySmelter;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
    	ModItems.Finalize();
    	ModBlocks.Finalize();
    	GameRegistry.registerTileEntity(TileEntityAlloySmelter.class, Constants.modID + ":tileEntityAlloySmelter");
    }

    public void init(FMLInitializationEvent event) {
    	NetworkRegistry.INSTANCE.registerGuiHandler(Decoblocks.instance, new GUIHandler());
    	ShapedCrafting.init();
    	ShapelessCrafting.init();
    	Smelting.init();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
