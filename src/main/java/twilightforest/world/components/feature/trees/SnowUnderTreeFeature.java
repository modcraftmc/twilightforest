package twilightforest.world.components.feature.trees;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.SnowyDirtBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import twilightforest.block.GlacialisFlowerBlock;
import twilightforest.block.SnowLoggable;
import twilightforest.init.TFBlocks;

public class SnowUnderTreeFeature extends Feature<NoneFeatureConfiguration> {

	public SnowUnderTreeFeature(Codec<NoneFeatureConfiguration> config) {
		super(config);
	}

	//[VanillaCopy] of SnowAndFreezeFeature. Edits noted.
	@Override
	public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> ctx) {
		BlockPos pos = ctx.origin();
		WorldGenLevel level = ctx.level();

		//TF - inflate affected area 2 blocks bigger than a chunk. This fixes the issue where snow sometimes doesnt cover the entire tree
		for (int xi = -2; xi < 18; xi++) {
			for (int zi = -2; zi < 18; zi++) {
				int x = pos.getX() + xi;
				int z = pos.getZ() + zi;
				BlockPos currentPos = new BlockPos(x, level.getHeight(Heightmap.Types.MOTION_BLOCKING, x, z), z);

				Biome biome = level.getBiome(currentPos).value();
				if (biome.shouldFreeze(level, currentPos.below(), false)) {
					level.setBlock(currentPos.below(), Blocks.ICE.defaultBlockState(), 2);
				}

				if (biome.shouldSnow(level, currentPos)) {
					level.setBlock(currentPos, Blocks.SNOW.defaultBlockState(), 2);
					BlockState belowState = level.getBlockState(currentPos.below());
					if (belowState.hasProperty(SnowyDirtBlock.SNOWY)) {
						level.setBlock(currentPos.below(), belowState.setValue(SnowyDirtBlock.SNOWY, true), 2);
					}

					//TF - add a system for placing snow on covered leaves and ground underneath trees
					if (level.getBlockState(currentPos.below()).getBlock() instanceof LeavesBlock) {
						//check every block between our current position and the ground
						for (int y = currentPos.getY(); y > level.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, x, z) - 1; y--) {
							BlockPos currentSnowPos = new BlockPos(x, y, z);

							if (level.getBlockState(currentSnowPos).isAir()) {
								BlockState stateBelow = level.getBlockState(currentSnowPos.below());

								if (Blocks.SNOW.defaultBlockState().canSurvive(level, currentSnowPos)) {
									int layers = level.getBlockState(currentSnowPos.above()).is(BlockTags.LEAVES) && level.getBlockState(currentSnowPos.relative(Direction.Plane.HORIZONTAL.getRandomDirection(level.getRandom()))).is(BlockTags.LEAVES) ? 2 : 1;
									level.setBlock(currentSnowPos, Blocks.SNOW.defaultBlockState().setValue(SnowLayerBlock.LAYERS, layers), 2);

									if (stateBelow.hasProperty(SnowyDirtBlock.SNOWY)) {
										level.setBlock(currentSnowPos.below(), stateBelow.setValue(SnowyDirtBlock.SNOWY, true), 2);
									}
								}
							}
						}
					}
				}
			}
		}
		return true;
	}
}