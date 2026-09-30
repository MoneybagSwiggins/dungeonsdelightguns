package net.snasner.ddguns.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.snasner.ddguns.dungeonsdelightguns;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, dungeonsdelightguns.MODID);

        public static final RegistryObject<CreativeModeTab> DDGUNS_TAB = CREATIVE_MODE_TABS.register("gungeons_delight",
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GNASHER.get()))
                        .title(Component.translatable("creativetab.ddguns_tab"))
                        .displayItems((pParameters, pOutput) -> {
                            pOutput.accept(ModItems.DDGUNS_BLUEPRINT.get());
                            pOutput.accept(ModItems.GNASHER.get());
                            pOutput.accept(ModItems.CHOPPA.get());
                            pOutput.accept(ModItems.CHOPPA_CONVERSION.get());
                            pOutput.accept(ModItems.NEBILITSA.get());
                            pOutput.accept(ModItems.WRINGMAN.get());
                            pOutput.accept(ModItems.GRUB_FRAME.get());
                            pOutput.accept(ModItems.MILLEND_OVERDRIVE.get());
                            pOutput.accept(ModItems.RAYGUN_MK2.get());
                            pOutput.accept(ModItems.LUG.get());
                            pOutput.accept(ModItems.WORMROOT_NEEDLE.get());

                        })
                        .build());

        public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TABS.register(eventBus);
        }


}
