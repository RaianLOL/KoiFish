package sci.koifish.init;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;
import sci.koifish.block.BlockEmpathyOre;

public class ModBlocks {
	
	public static Block empathy_block;

	public static void init() {
		
		empathy_block = new BlockEmpathyOre().setUnlocalizedName("empathy_block");
		
	}
	
	public static void register() {
		
		GameRegistry.register(empathy_block);
		
	}
}
