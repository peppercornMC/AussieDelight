package com.pepper.aussiedelight;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class FoodValues
{
	public static final int BRIEF_DURATION = 600;    // 30 seconds
	public static final int SHORT_DURATION = 1200;    // 1 minute
	public static final int MEDIUM_DURATION = 3600;    // 3 minutes
	public static final int LONG_DURATION = 6000;    // 5 minutes

    public static final FoodProperties BREAD_SLICE = (new FoodProperties.Builder())
            .nutrition(1).saturationMod(0.5f).build();

    public static final FoodProperties UNCOOKED_MEAT_PIE = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.5f).build();
    public static final FoodProperties MEAT_PIE = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(2.5f)
            .effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), BRIEF_DURATION, 0), 1.0F).build();
}