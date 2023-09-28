

package com.kenro.showweight.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.zarkonnen.airships.Airship;
import com.zarkonnen.airships.ShipEditorUtils;
import com.zarkonnen.catengine.util.Utils;
import com.zarkonnen.catengine.util.Utils.Pair;

import java.util.ArrayList;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShipEditorUtils.class)
public abstract class ShowWeightMixin {
	@Inject(
    at = @At("RETURN"),
    method = "getStats"
  )
  private static void getStats(Airship ship, int budget, 
    Airship original,CallbackInfoReturnable cb, @Local 
    LocalRef<ArrayList<Pair<String, String>>> ret) {
    System.out.println("Ship weight is:" +ship.weight);
    ArrayList<Pair<String, String>> val= ret.get();
    val.add(Utils.p("Weight_", "" + ship.weight));
  }
}
