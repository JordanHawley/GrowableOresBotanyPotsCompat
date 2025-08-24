package com.skniro.growable_ores_botanypots_compat.client;

import com.skniro.growable_ores_botanypots_compat.block.GrowableOresBlocks;
import com.skniro.growable_ores_botanypots_compat.block.entity.AlchemyBlockEntityType;
import com.skniro.growable_ores_botanypots_compat.block.renderer.AlchemyblockentityRenderer;
import com.skniro.growable_ores_botanypots_compat.client.gui.screen.ingame.AlchemyBlockScreen;
import com.skniro.growable_ores_botanypots_compat.screen.AlchemyScreenHandlerType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;

@Environment(EnvType.CLIENT)
public class GrowableOresClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MenuScreens.register(AlchemyScreenHandlerType.ALCHEMY, AlchemyBlockScreen::new);
        BlockEntityRenderers.register(AlchemyBlockEntityType.ALCHEMY_BLOCK_ENTITY, AlchemyblockentityRenderer::new);
        //BlockRenderLayerMap.INSTANCE.putBlock(GrowableOresBlocks.GrowableOres_Block, RenderLayer.getCutout());
    }
}
