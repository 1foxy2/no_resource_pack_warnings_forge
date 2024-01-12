package net.foxy.noresourcepackwarningsforge.mixin;

import net.minecraft.client.gui.widget.list.ResourcePackList.ResourcePackEntry;
import net.minecraft.resources.PackCompatibility;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ResourcePackEntry.class)
public class PackEntryMixin {

	@Redirect(
		method = "render",
		at = @At(
			value = "INVOKE",
			target = "Lnet/minecraft/resources/PackCompatibility;isCompatible()Z"
		)
	)
	private boolean onRenderRedirectIsCompatible(PackCompatibility compatibility) {
		return true;
	}

	@Redirect(
		method = "mouseClicked",
		at = @At(
			value = "INVOKE",
			target = "Lnet/minecraft/resources/PackCompatibility;isCompatible()Z"
		)
	)
	private boolean onMouseClickedRedirectIsCompatible(PackCompatibility compatibility) {
		return true;
	}
}
