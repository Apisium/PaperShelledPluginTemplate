package cn.apisium.example.mixin;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.OverworldBiomeSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(OverworldBiomeSource.class)
public interface AccessorTest {
    @Accessor
    static List<ResourceKey<Biome>> getPOSSIBLE_BIOMES() {
        throw new AssertionError("mixin");
    }
}
