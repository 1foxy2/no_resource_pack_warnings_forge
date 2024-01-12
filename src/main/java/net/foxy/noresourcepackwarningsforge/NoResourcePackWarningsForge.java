package net.foxy.noresourcepackwarningsforge;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(NoResourcePackWarningsForge.MOD_ID)
public class NoResourcePackWarningsForge {
    public static final String MOD_ID = "no_resource_pack_warnings_forge";

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
}
