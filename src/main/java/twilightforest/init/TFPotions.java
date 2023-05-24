package twilightforest.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import twilightforest.TwilightForestMod;

public class TFPotions {

	public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(Registries.POTION, TwilightForestMod.ID);

	public static final RegistryObject<Potion> FROSTED = POTIONS.register("frosted", () -> new Potion(new MobEffectInstance(TFMobEffects.FROSTY.get(), 1800)));
	public static final RegistryObject<Potion> LONG_FROSTED = POTIONS.register("long_frosted", () -> new Potion("frosted", new MobEffectInstance(TFMobEffects.FROSTY.get(), 4800)));
	public static final RegistryObject<Potion> STRONG_FROSTED = POTIONS.register("strong_frosted", () -> new Potion("frosted", new MobEffectInstance(TFMobEffects.FROSTY.get(), 600, 1)));
}
