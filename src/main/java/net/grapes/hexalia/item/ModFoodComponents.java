package net.grapes.hexalia.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CHILLBERRY = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 200), 1f).build();
    public static final FoodComponent CHILLBERRY_CUPCAKE = new FoodComponent.Builder().hunger(6).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1200, 1), 1f).build();
}
