package twilightforest.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.ParticleUtils;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.HitResult;
import twilightforest.init.TFParticleType;

public class SnowyLeavesBlock extends LeavesBlock {

	public static final BooleanProperty SNOWY = BooleanProperty.create("snowy");

	public SnowyLeavesBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.defaultBlockState().setValue(SNOWY, false));
	}

	@Override
	public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean moving) {
		super.neighborChanged(state, level, pos, block, fromPos, moving);
		if (!level.isClientSide()) {
			level.setBlockAndUpdate(pos, state.setValue(SNOWY, level.getBlockState(pos.above()).is(Blocks.SNOW)));
		}
	}

	@Override
	public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
		if (random.nextInt(150) == 0) {
			BlockPos blockpos = pos.below();
			BlockState blockstate = level.getBlockState(blockpos);
			if (blockstate.isAir() || blockstate.canBeReplaced()) {
				ParticleUtils.spawnParticleBelow(level, pos, random, TFParticleType.FALLING_SNOW.get());
			}
		}
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder.add(SNOWY));
	}

	@Override
	public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter level, BlockPos pos, Player player) {
		return new ItemStack(Items.SPRUCE_LEAVES);
	}
}
