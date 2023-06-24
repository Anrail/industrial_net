package com.anrail.industrial_net.item;

import com.anrail.industrial_net.IndustrialNet;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IndustrialNet.MOD_ID);
    public static final RegistryObject<Item> CUTTER = ITEMS.register("cutter",
            () -> new Item( new Item.Properties().tab(CreativeModeTab.TAB_TOOLS) ));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
