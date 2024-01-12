package net.foxy.noresourcepackwarningsforge.mixin;

import net.minecraft.client.Options;
import net.minecraft.server.packs.repository.PackCompatibility;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Options.class)
public class OptionsMixin {

	@Redirect(
		method = "loadSelectedResourcePacks",
		at = @At(
			value = "INVOKE",
			target = "Lnet/minecraft/server/packs/repository/PackCompatibility;isCompatible()Z"
		)
	)
	private boolean onLoadSelectedResourcePacksRedirectIsCompatible(PackCompatibility compatibility) {
		return true;
	}
}
