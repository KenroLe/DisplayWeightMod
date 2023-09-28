package com.kenro.injuredmodulesmod.mixin;

import com.zarkonnen.airships.AGame;
import com.zarkonnen.airships.MainMenu;
import com.zarkonnen.airships.MyDraw;
import com.zarkonnen.catengine.Hooks;
import com.zarkonnen.catengine.util.Pt;
import com.zarkonnen.catengine.util.ScreenMode;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MainMenu.class)
public class InjuredModules {
    @Inject(
            at = @At(
                    value = "INVOKE",
                    ordinal = 0,
                    target = "Lcom/zarkonnen/airships/MyDraw;resetTransforms()V",
                    shift = At.Shift.AFTER

            ),
            method = "render(Lcom/zarkonnen/airships/MyDraw;Lcom/zarkonnen/catengine/util/ScreenMode;Lcom/zarkonnen/catengine/Hooks;Lcom/zarkonnen/catengine/util/Pt;)V"
    )
    private void render(MyDraw d, final ScreenMode sm, Hooks hs, Pt cursor, CallbackInfo info) {
        int y = MyDraw.TOP_BAR_H + MyDraw.UI_SPACING;
        y+=64;
        d.text("[ff0000]AMOGUS", AGame.HUGE_FOUNT, (double)250, (double)y);
    }
}
