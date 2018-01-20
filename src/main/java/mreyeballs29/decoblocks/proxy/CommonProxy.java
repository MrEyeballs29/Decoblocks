package mreyeballs29.decoblocks.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import mreyeballs29.decoblocks.item.ModItems;
import mreyeballs29.decoblocks.recipes.ShapedCrafting;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
    	ModItems.init();
    	ShapedCrafting.Init();
    }

    public void init(FMLInitializationEvent event) {
    	
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
