package cn.apisium.example.mixin;

import cn.apisium.example.Data;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = MinecraftServer.class)
public abstract class MinecraftServerMixin {
    @Inject(method = "getServerModName", at = @At("RETURN"), cancellable = true, remap = false)
    public void getServerModName(CallbackInfoReturnable<String> cir) {
        Data.modName = cir.getReturnValue();
        cir.setReturnValue("PaperShelled");
    }
}
