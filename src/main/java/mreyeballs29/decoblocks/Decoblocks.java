package mreyeballs29.decoblocks;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import mreyeballs29.decoblocks.proxy.CommonProxy;
import mreyeballs29.decoblocks.Constants;

@Mod(modid = Constants.modID, name = Constants.modName, version = Constants.version)
public class Decoblocks {
	
	@SidedProxy(clientSide="mreyeballs29.decoblocks.proxy.ClientProxy", serverSide="mreyeballs29.decoblocks.proxy.ServerProxy")
	public static CommonProxy proxy;
	
    @Instance
    public static Decoblocks instance = new Decoblocks();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
