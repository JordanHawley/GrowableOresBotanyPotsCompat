package com.skniro.growable_ores_botanypots_compat.screen;

import com.skniro.growable_ores_botanypots_compat.GrowableOresExtension;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;

public class AlchemyScreenHandlerType <T extends AbstractContainerMenu>{
    public static final MenuType<AlchemyBlockScreenHandler> ALCHEMY =
            Registry.register(BuiltInRegistries.MENU, ResourceLocation.fromNamespaceAndPath(GrowableOresExtension.MOD_ID, "cane_converter_screen_handler"),
                    new ExtendedScreenHandlerType<>(AlchemyBlockScreenHandler::new, BlockPos.STREAM_CODEC));

    public static void registeralchemyscreenhandlertype () {

    }
}
