package net.foxy.noresourcepackwarningsforge.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import net.minecraft.client.gui.screens.packs.TransferableSelectionList.PackEntry;
import net.minecraft.server.packs.repository.PackCompatibility;

@Mixin(PackEntry.class)
public class PackEntryMixin {

	@WrapOperation(
		method = "extractContent",
		at = @At(
			value = "INVOKE",
			target = "Lnet/minecraft/server/packs/repository/PackCompatibility;isCompatible()Z"
		)
	)
	private boolean onRenderRedirectIsCompatible(PackCompatibility instance, Operation<Boolean> original) {
		return true;
	}

	@WrapOperation(
		method = "handlePackSelection",
		at = @At(
			value = "INVOKE",
			target = "Lnet/minecraft/server/packs/repository/PackCompatibility;isCompatible()Z"
		)
	)
	private boolean onMouseClickedRedirectIsCompatible(PackCompatibility instance, Operation<Boolean> original) {
		return true;
	}
}
