package net.snasner.ddguns.mixin.client;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import software.bernie.geckolib.core.keyframe.event.SoundKeyframeEvent;
import top.ribs.scguns.item.animated.AnimatedGunItem;

@OnlyIn(Dist.CLIENT)
@Mixin(value = AnimatedGunItem.class, remap = false)
public class AnimatedGunItemMixin {

    @Inject(method = "soundListener", at = @At("HEAD"), cancellable = true)
    private void onSoundListener(SoundKeyframeEvent<AnimatedGunItem> event, CallbackInfo ci) {
        Player player = Minecraft.getInstance().player;
        if (player == null) return;

        ItemStack mainHand = player.getMainHandItem();
        ItemStack offHand = player.getOffhandItem();

        AnimatedGunItem instance = (AnimatedGunItem) (Object) this;

        boolean isMainHand = mainHand.getItem() == instance && !mainHand.getOrCreateTag().getBoolean("IsDroppedItem");
        boolean isOffHand = offHand.getItem() == instance && !offHand.getOrCreateTag().getBoolean("IsDroppedItem");

        if (!isMainHand && !isOffHand) return;

        ItemStack heldStack = isMainHand ? mainHand : offHand;
        if (!heldStack.getOrCreateTag().getBoolean("IsDrawn")) return;

        String soundPath = event.getKeyframeData().getSound();
        if (soundPath == null || soundPath.isEmpty()) return;

        ResourceLocation soundLocation = soundPath.contains(":")
                ? new ResourceLocation(soundPath)
                : new ResourceLocation("scguns", soundPath);

        if (ForgeRegistries.SOUND_EVENTS.containsKey(soundLocation)) {
            SoundEvent soundEvent = ForgeRegistries.SOUND_EVENTS.getValue(soundLocation);
            if (soundEvent != null) {
                float volume = "jam".equals(soundPath) ? 0.2F : 1.0F;
                player.playSound(soundEvent, volume, 1.0F);

                ci.cancel();
            }
        }
    }
}
