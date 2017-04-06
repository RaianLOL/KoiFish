package net.sci.koifish.block;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.sci.koifish.KoiFish;
import net.sci.koifish.init.ModItems;
import net.sci.koifish.item.ItemEmpathy;
import net.sci.koifish.lib.Names;

public class BlockEmpathyOre extends BlockOre {

	private Item drop;
	private IBlockState state;
	public BlockEmpathyOre(Item drop, IBlockState state) {
		super();
		this.drop = drop;
		this.state = state;
		setHardness(4.0f);
		setResistance(10.0f);
		setSoundType(SoundType.STONE);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return drop;
    }

	@Override
	public int quantityDropped(Random random)
    {
        return 4 + random.nextInt(5);
    }
	
	@Override
	public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0)
            {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
	
	@Override
	public String getUnlocalizedName() {
		
		return "tile." + KoiFish.RESOURCE_PREFIX + Names.EMPATHY_ORE;
	}

}
