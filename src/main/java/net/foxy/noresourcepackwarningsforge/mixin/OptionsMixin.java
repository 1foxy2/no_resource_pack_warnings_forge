package net.foxy.noresourcepackwarningsforge.mixin;

import net.minecraft.client.GameSettings;
import net.minecraft.resources.PackCompatibility;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(GameSettings.class)
public class OptionsMixin {

	@Redirect(
			method = "loadSelectedResourcePacks",
			at = @At(
					value = "INVOKE",
					target = "Lnet/minecraft/resources/PackCompatibility;isCompatible()Z"
			)
	)
	private boolean onLoadSelectedResourcePacksRedirectIsCompatible(PackCompatibility compatibility) {
		return true;
	}
}