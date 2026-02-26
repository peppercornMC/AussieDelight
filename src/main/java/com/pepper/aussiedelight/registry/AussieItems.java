package com.pepper.aussiedelight.registry;

import com.pepper.aussiedelight.AussieDelight;
import com.pepper.aussiedelight.FoodValues;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.ConsumableItem;

public class AussieItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AussieDelight.MODID);

    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food);
    }

    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16);
    }

    public static final RegistryObject<Item> BREAD_SLICE = ITEMS.register("bread_slice",
            () -> new Item(foodItem(FoodValues.BREAD_SLICE)));

    public static final RegistryObject<Item> UNCOOKED_MEAT_PIE = ITEMS.register("uncooked_meat_pie",
            () -> new Item(foodItem(FoodValues.UNCOOKED_MEAT_PIE)));
    public static final RegistryObject<Item> MEAT_PIE = ITEMS.register("meat_pie",
            () -> new ConsumableItem(foodItem(FoodValues.MEAT_PIE), true));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}