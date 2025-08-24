package com.skniro.growable_ores_botanypots_compat.datagen;

import com.skniro.growable_ores_botanypots_compat.block.GrowableOresBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;

public class GrowableModelProvider extends FabricModelProvider {
    public GrowableModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {


    }
    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {

    }
}
