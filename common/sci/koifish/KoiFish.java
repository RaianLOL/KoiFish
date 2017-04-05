package sci.koifish;

import java.util.Random;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = KoiFish.MOD_ID, name = KoiFish.MOD_NAME, version = KoiFish.VERSION, dependencies = KoiFish.DEPENDENCIES)
public class KoiFish {

	public static final String MOD_ID = "koi_fish";
	public static final String MOD_NAME = "Koi Fish Mod";
	public static final String VERSION = "@VERSION@";
	public static final String DEPENDENCIES = "required-after:forge@[13.20.0.2262,)";
	public static final String RESOURCE_PREFIX = MOD_ID.toLowerCase() + ":";
	
	public static Random random = new Random();
	
	@Instance(MOD_ID)
	public static KoiFish instance;
	
	@SidedProxy(clientSide = "main.java.com.sci.koifish.ClientProxy", serverSide = "main.java.com.sci.koifish.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		proxy.postInit(event);
	}
}
