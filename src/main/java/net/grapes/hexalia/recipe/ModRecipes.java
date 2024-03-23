package net.grapes.hexalia.recipe;

import net.grapes.hexalia.HexaliaMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(HexaliaMod.MOD_ID, SmallCauldronRecipe.Serializer.ID),
                SmallCauldronRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(HexaliaMod.MOD_ID, SmallCauldronRecipe.Type.ID),
                SmallCauldronRecipe.Type.INSTANCE);
    }
}
