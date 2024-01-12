package net.foxy.noresourcepackwarningsforge.mixin;

import net.minecraft.client.gui.screens.OptionsScreen;
import net.minecraft.server.packs.repository.PackCompatibility;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(OptionsScreen.class)
public class OptionsScreenMixin {

	@Redirect(
		method = "updatePackList",
		at = @At(
			value = "INVOKE",
			target = "Lnet/minecraft/server/packs/repository/PackCompatibility;isCompatible()Z"
		)
	)
	private boolean onUpdatePackListRedirectIsCompatible(PackCompatibility compatibility) {
		return true;
	}
}
