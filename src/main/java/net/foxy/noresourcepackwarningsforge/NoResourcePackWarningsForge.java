package net.foxy.noresourcepackwarningsforge;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod(NoResourcePackWarningsForge.MOD_ID)
public class NoResourcePackWarningsForge
{
    public static final String MOD_ID = "no_resource_pack_warnings_forge";



    public NoResourcePackWarningsForge()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }
}
