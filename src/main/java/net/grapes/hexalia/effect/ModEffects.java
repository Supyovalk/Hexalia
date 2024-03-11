package net.grapes.hexalia.effect;

import net.grapes.hexalia.HexaliaMod;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final StatusEffect EFFECT_A = registerStatusEffect("effect_a",
            new EffectA(StatusEffectCategory.BENEFICIAL, 0xFFFF00, 3.0)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 0.0,
                            EntityAttributeModifier.Operation.ADDITION));

    public static final StatusEffect STUNNED = registerStatusEffect("stunned",
            new StunnedEffect(StatusEffectCategory.HARMFUL, 0xFFFFDD)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "648D7064-6A60-4F59-8ABE-C2C23A6DD79A", -0.0,
                            EntityAttributeModifier.Operation.MULTIPLY_TOTAL));

    private static StatusEffect registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(HexaliaMod.MOD_ID, name), statusEffect);
    }
    public static void registerEffects() {
        HexaliaMod.LOGGER.info("Registering Potion Effects for " + HexaliaMod.MOD_ID);
    }
}

