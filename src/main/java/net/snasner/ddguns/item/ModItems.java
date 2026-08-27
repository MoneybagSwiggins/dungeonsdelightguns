package net.snasner.ddguns.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.snasner.ddguns.dungeonsdelightguns;
import top.ribs.scguns.init.ModSounds;
import top.ribs.scguns.item.animated.AnimatedGunItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, dungeonsdelightguns.MODID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<AnimatedGunItem> GNASHER = ITEMS.register("gnasher",
            () -> new AnimatedGunItem(
                    new Item.Properties().stacksTo(1).durability(300),
                    "gnasher",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            ));
    public static final RegistryObject<AnimatedGunItem> CHOPPA = ITEMS.register("choppa",
            () -> new AnimatedGunItem(
                    new Item.Properties().stacksTo(1).durability(300),
                    "choppa",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            ));
    public static final RegistryObject<AnimatedGunItem> CHOPPA_CONVERSION = ITEMS.register("choppa_conversion",
            () -> new AnimatedGunItem(
                    new Item.Properties().stacksTo(1).durability(300),
                    "choppa_conversion",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            ));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
