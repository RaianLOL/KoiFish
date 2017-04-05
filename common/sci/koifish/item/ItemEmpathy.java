package sci.koifish.item;

import javax.annotation.Nullable;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import sci.koifish.KoiFish;
import sci.koifish.lib.Names;

public class ItemEmpathy extends Item {

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item." + KoiFish.RESOURCE_PREFIX + Names.EMPATHY;
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack)
    {
        return 64;
    }
	
	@Nullable
    @SideOnly(Side.CLIENT)
    public CreativeTabs getCreativeTab()
    {
        return CreativeTabs.MATERIALS;
    }
}
