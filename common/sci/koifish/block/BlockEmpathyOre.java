package sci.koifish.block;

import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import sci.koifish.KoiFish;
import sci.koifish.lib.Names;

public class BlockEmpathyOre extends BlockOre {

	public BlockEmpathyOre() {
		super();
		setHardness(4.0f);
		setResistance(10.0f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public String getUnlocalizedName() {
		
		return "tile." + KoiFish.RESOURCE_PREFIX + Names.EMPATHY_ORE;
	}

}
