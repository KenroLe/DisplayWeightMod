
package com.kenro.injuredmodulesmod.mixin;

import com.zarkonnen.airships.MissionsScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MissionsScreen.class)
public class MissionsScreenMixin {
    @Inject(
            at = @At("RETURN"),
            method = "<init>(Lcom/zarkonnen/airships/AirshipGame;)V"
    )
   public void  MissionsScreen(CallbackInfo g) {
      System.out.println("MissionScreen opened!");
    }
}
