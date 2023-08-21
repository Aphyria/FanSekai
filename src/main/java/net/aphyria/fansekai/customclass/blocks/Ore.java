package net.aphyria.fansekai.customclass.blocks;

import com.mojang.math.Vector3f;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.Vec3;

public class Ore extends Block {
    private int rgb24code;

    public Ore(int x) {
        super(BlockBehaviour.Properties.of(Material.STONE).explosionResistance(100f).strength(80f));
        this.rgb24code = x;
    }


    public void animateTick(BlockState p_220827_, Level p_220828_, BlockPos p_220829_, RandomSource p_220830_) {
        spawnParticles(p_220828_, p_220829_);
    }

    private void spawnParticles(Level p_55455_, BlockPos p_55456_) {
        double d0 = 0.5625D;
        RandomSource randomsource = p_55455_.random;

        for(Direction direction : Direction.values()) {
            BlockPos blockpos = p_55456_.relative(direction);
            if (!p_55455_.getBlockState(blockpos).isSolidRender(p_55455_, blockpos)) {
                Direction.Axis direction$axis = direction.getAxis();
                double d1 = direction$axis == Direction.Axis.X ? 0.5D + 0.5625D * (double)direction.getStepX() : (double)randomsource.nextFloat();
                double d2 = direction$axis == Direction.Axis.Y ? 0.5D + 0.5625D * (double)direction.getStepY() : (double)randomsource.nextFloat();
                double d3 = direction$axis == Direction.Axis.Z ? 0.5D + 0.5625D * (double)direction.getStepZ() : (double)randomsource.nextFloat();
                p_55455_.addParticle(new DustParticleOptions(new Vector3f(Vec3.fromRGB24(this.rgb24code)), 1.0F), (double)p_55456_.getX() + d1, (double)p_55456_.getY() + d2, (double)p_55456_.getZ() + d3, 0.0D, 0.0D, 0.0D);
            }
        }

    }

}
