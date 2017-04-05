package sci.koifish;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import sci.koifish.init.ModBlocks;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
		
		ModBlocks.init();
	}
	
	public void init(FMLInitializationEvent event) {
		
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
