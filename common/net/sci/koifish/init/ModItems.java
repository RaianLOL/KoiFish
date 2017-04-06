package net.sci.koifish.init;

import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.sci.koifish.KoiFish;
import net.sci.koifish.block.BlockEmpathyOre;
import net.sci.koifish.item.ItemEmpathy;
import net.sci.koifish.lib.Names;

public class ModItems {
	
	public static ItemEmpathy empathy;

	public static void init() {
		
		ResourceLocation location = new ResourceLocation(KoiFish.MOD_ID, Names.EMPATHY);
		empathy = new ItemEmpathy();
		empathy.setRegistryName(location);
		GameRegistry.register(empathy);
	}
	
	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {
		
		ModelResourceLocation model = new ModelResourceLocation(KoiFish.RESOURCE_PREFIX + Names.EMPATHY, "inventory");
		ModelLoader.registerItemVariants(empathy, model);
		mesher.register(empathy, 0, model);
	}
	

}
