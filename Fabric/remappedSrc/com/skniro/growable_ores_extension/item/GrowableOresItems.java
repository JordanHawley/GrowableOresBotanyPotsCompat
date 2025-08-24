package com.skniro.growable_ores_botanypots_compat.item;

import com.skniro.growable_ores_botanypots_compat.GrowableOresExtension;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class GrowableOresItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(GrowableOresExtension.MOD_ID, name), item);
    }

    public static void shield_item(){
      GrowableOresExtension.LOGGER.debug("register shield item.");
    }
}
