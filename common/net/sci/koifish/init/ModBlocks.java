package net.sci.koifish.init;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.IForgeRegistryEntry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.sci.koifish.KoiFish;
import net.sci.koifish.block.BlockEmpathyOre;
import net.sci.koifish.lib.Names;

public class ModBlocks {
	
	public static BlockEmpathyOre empathyBlock;

	public static void init() {
		
		ResourceLocation location = new ResourceLocation(KoiFish.MOD_ID, Names.EMPATHY_ORE);
		empathyBlock = new BlockEmpathyOre(ModItems.empathy, null);
		empathyBlock.setRegistryName(location);
		GameRegistry.register(empathyBlock);
		GameRegistry.register(new ItemBlock(empathyBlock), location);
	}
	
	@SideOnly(Side.CLIENT)
	public static void initClient(ItemModelMesher mesher) {
		
		Item item = Item.getItemFromBlock(empathyBlock);
		ModelResourceLocation model = new ModelResourceLocation(KoiFish.RESOURCE_PREFIX + Names.EMPATHY_ORE, "inventory");
		ModelLoader.registerItemVariants(item, model);
		mesher.register(item, 0, model);
	}
	

}
