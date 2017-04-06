package sci.koifish;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import sci.koifish.init.ModBlocks;
import sci.koifish.init.ModItems;
import sci.koifish.world.KoiFishWorldGen;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) {
		
		ModItems.init();
		ModBlocks.init();
	}
	
	public void init(FMLInitializationEvent event) {
		
		GameRegistry.registerWorldGenerator(new KoiFishWorldGen(), 0);
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
