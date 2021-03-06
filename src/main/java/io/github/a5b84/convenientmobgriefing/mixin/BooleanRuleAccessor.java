package io.github.a5b84.convenientmobgriefing.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.world.GameRules.BooleanRule;
import net.minecraft.world.GameRules.RuleType;

/**
 * Mixin qui permet de récupérer la méthode pour créer la gamerule
 */
@Mixin(BooleanRule.class)
public interface BooleanRuleAccessor {

    @Invoker
    static RuleType<BooleanRule> callCreate(boolean initialValue) {
        throw new UnsupportedOperationException("Mixin `BooleanRuleAccessor` has not been applied");
    }

}
