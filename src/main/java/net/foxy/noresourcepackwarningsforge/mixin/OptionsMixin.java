package net.foxy.noresourcepackwarningsforge.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import net.minecraft.client.Options;
import net.minecraft.server.packs.repository.PackCompatibility;

@Mixin(Options.class)
public class OptionsMixin {

	@WrapOperation(
		method = "updateResourcePacks",
		at = @At(
			value = "INVOKE",
			target = "Lnet/minecraft/server/packs/repository/PackCompatibility;isCompatible()Z"
		)
	)
	private boolean onUpdateResourcePacksRedirectIsCompatible(PackCompatibility instance, Operation<Boolean> original) {
		return true;
	}

	@WrapOperation(
		method = "loadSelectedResourcePacks",
		at = @At(
			value = "INVOKE",
			target = "Lnet/minecraft/server/packs/repository/PackCompatibility;isCompatible()Z"
		)
	)
	private boolean onLoadSelectedResourcePacksRedirectIsCompatible(PackCompatibility instance, Operation<Boolean> original) {
		return true;
	}
}
