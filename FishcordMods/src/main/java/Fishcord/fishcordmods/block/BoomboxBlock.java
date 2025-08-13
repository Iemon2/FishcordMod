package Fishcord.fishcordmods.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class BoomboxBlock extends HorizontalFacingBlock {
    public static final MapCodec<BoomboxBlock> CODEC = Block.createCodec(BoomboxBlock::new);
    public static final EnumProperty<Direction> FACING = HorizontalFacingBlock.FACING;

    public BoomboxBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        return switch (dir) {
            case NORTH -> VoxelShapes.cuboid(0.125f, 0.0f, 0.3125f, 0.875f, 0.375f, 0.6875f);
            case SOUTH -> VoxelShapes.cuboid(0.125f, 0.0f, 0.3125f, 0.875f, 0.375f, 0.6875f);
            case EAST -> VoxelShapes.cuboid(0.3125f, 0.0f, 0.125f, 0.6875f, 0.375f, 0.875f);
            case WEST -> VoxelShapes.cuboid(0.3125f, 0.0f, 0.125f, 0.6875f, 0.375f, 0.875f);
            default -> VoxelShapes.fullCube();
        };
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return super.getPlacementState(ctx).with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }
}
