package com.skniro.growable_ores_botanypots_compat;


import com.skniro.growable_ores_botanypots_compat.block.GrowableOresBlocks;
import com.skniro.growable_ores_botanypots_compat.block.entity.AlchemyBlockEntityType;
import com.skniro.growable_ores_botanypots_compat.item.GrowableOresItems;
import com.skniro.growable_ores_botanypots_compat.recipe.AlchemyRecipeType;
import com.skniro.growable_ores_botanypots_compat.screen.AlchemyScreenHandlerType;


public class ModContent {


    public static void registerItem(){
        GrowableOresItems.shield_item();
    }
    public static void registerBlock(){
        GrowableOresBlocks.registerGrowableOresBlocks();
        AlchemyRecipeType.registerRecipes();
        AlchemyBlockEntityType.registerMapleBlockEntityType();
        AlchemyScreenHandlerType.registeralchemyscreenhandlertype();
    }

}
