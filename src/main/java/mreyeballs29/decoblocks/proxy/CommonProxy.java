package mreyeballs29.decoblocks.proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import mreyeballs29.decoblocks.block.ModBlocks;
import mreyeballs29.decoblocks.item.ModItems;
import mreyeballs29.decoblocks.recipes.ShapedCrafting;
import mreyeballs29.decoblocks.recipes.ShapelessCrafting;
import mreyeballs29.decoblocks.recipes.Smelting;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
    	ModItems.init();
    	ModBlocks.init();
    	ModBlocks.RegisterOre();
    	ModItems.ItemRegisterOre();
    }

    public void init(FMLInitializationEvent event) {
    	ShapedCrafting.init();
    	ShapelessCrafting.init();
    	Smelting.init();
    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
