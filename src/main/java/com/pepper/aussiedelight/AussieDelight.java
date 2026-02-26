package com.pepper.aussiedelight;

import com.pepper.aussiedelight.registry.AussieCreativeTabs;
import com.pepper.aussiedelight.registry.AussieItems;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AussieDelight.MODID)
public class AussieDelight {
    public static final String MODID = "aussiedelight";

    public AussieDelight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        AussieCreativeTabs.register(modEventBus);
        AussieItems.register(modEventBus);
        
        MinecraftForge.EVENT_BUS.register(this);
        
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}