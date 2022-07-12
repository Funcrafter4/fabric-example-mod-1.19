package net.fabricmc.example.recipe;

import net.fabricmc.example.ExampleMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void registerRecipes(){
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(ExampleMod.MOD_ID, MythrilBlockRecipe.Serializer.ID),
                MythrilBlockRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(ExampleMod.MOD_ID, MythrilBlockRecipe.Type.ID),
                MythrilBlockRecipe.Type.INSTANCE);
    }
}
