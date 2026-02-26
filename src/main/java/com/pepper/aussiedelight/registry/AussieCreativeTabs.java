package com.pepper.aussiedelight.registry;

import com.pepper.aussiedelight.AussieDelight;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class AussieCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AussieDelight.MODID);

    public static final RegistryObject<CreativeModeTab> AUSSIEDELIGHT_TAB = CREATIVE_MODE_TABS.register("creative_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(AussieItems.MEAT_PIE.get()))
                    .title(Component.translatable("aussiedelight.creative_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(AussieItems.BREAD_SLICE.get());
                        pOutput.accept(AussieItems.UNCOOKED_MEAT_PIE.get());
                        pOutput.accept(AussieItems.MEAT_PIE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}