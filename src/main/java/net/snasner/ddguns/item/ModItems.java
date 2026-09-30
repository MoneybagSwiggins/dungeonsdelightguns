package net.snasner.ddguns.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.snasner.ddguns.dungeonsdelightguns;
import top.ribs.scguns.init.ModSounds;
import top.ribs.scguns.item.BlueprintItem;
import top.ribs.scguns.item.animated.AnimatedGunItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, dungeonsdelightguns.MODID);

    public static final RegistryObject<Item> GRUB_FRAME = ITEMS.register("grub_frame",
            () -> new Item(new Item.Properties().food(ModFoods.GRUB_FRAME)));
    public static final RegistryObject<Item> NOTI = ITEMS.register("noti",
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
    public static final RegistryObject<AnimatedGunItem> NEBILITSA = ITEMS.register("nebilitsa",
            () -> new AnimatedGunItem(
                    new Item.Properties().stacksTo(1).durability(300),
                    "nebilitsa",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            ));
    public static final RegistryObject<AnimatedGunItem> LUG = ITEMS.register("lug",
            () -> new AnimatedGunItem(
                    new Item.Properties().stacksTo(1).durability(300),
                    "lug",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            ));
    public static final RegistryObject<AnimatedGunItem> WORMROOT_NEEDLE = ITEMS.register("wormroot_needle",
            () -> new AnimatedGunItem(
                    new Item.Properties().stacksTo(1).durability(300),
                    "wormroot_needle",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            ));
    public static final RegistryObject<AnimatedGunItem> FLINT_LOCKEWOOD = ITEMS.register("flint_lockewood",
            () -> new AnimatedGunItem(
                    new Item.Properties().stacksTo(1).durability(256),
                    "flint_lockewood",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            ));
    public static final RegistryObject<AnimatedGunItem> MILLEND_OVERDRIVE = ITEMS.register("millend_overdrive",
            () -> new AnimatedGunItem(
                    new Item.Properties().stacksTo(1).durability(300),
                    "millend_overdrive",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            ));
    public static final RegistryObject<AnimatedGunItem> RAYGUN_MK2 = ITEMS.register("raygun_mk2",
            () -> new AnimatedGunItem(
                    new Item.Properties().stacksTo(1).durability(300),
                    "raygun_mk2",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            ));
    public static final RegistryObject<AnimatedGunItem> WRINGMAN = ITEMS.register("wringman",
            () -> new AnimatedGunItem(
                    new Item.Properties().stacksTo(1).durability(300),
                    "wringman",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            ));
    public static final RegistryObject<AnimatedGunItem> PLASMA_PISTOL = ITEMS.register("plasma_pistol",
            () -> new AnimatedGunItem(
                    new Item.Properties().stacksTo(1).durability(300),
                    "plasma_pistol",
                    ModSounds.MAG_OUT.get(),
                    ModSounds.MAG_IN.get(),
                    ModSounds.RELOAD_END.get(),
                    ModSounds.COPPER_GUN_JAM.get(),
                    ModSounds.COPPER_GUN_JAM.get()
            ));
    public static final RegistryObject<Item> DDGUNS_BLUEPRINT = ITEMS.register("ddguns_blueprint", () -> new BlueprintItem(new Item.Properties().stacksTo(1)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
