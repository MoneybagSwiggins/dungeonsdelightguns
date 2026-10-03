package net.snasner.ddguns.client.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import static net.snasner.ddguns.dungeonsdelightguns.MODID;

@net.minecraftforge.fml.common.Mod.EventBusSubscriber(modid = MODID, value = {net.minecraftforge.api.distmarker.Dist.CLIENT}, bus = net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD)

public enum SpecialModels {
    GNASHER_MAIN("gnasher/main"), GNASHER_STAN_MAG("gnasher/stan_mag"), GNASHER_EXT_MAG("gnasher/ext_mag"), GNASHER_SPEED_MAG("gnasher/speed_mag"), GNASHER_STA_BARREL("gnasher/sta_barrel"), GNASHER_EXT_BARREL("gnasher/ext_barrel"), GNASHER_MUZZLE_BRAKE("gnasher/muzzle_brake"), GNASHER_SILENCER("gnasher/silencer"), GNASHER_ADVANCED_SILENCER("gnasher/advanced_silencer"),
    CHOPPA_CONVERSION_MAIN("choppa_conversion/main"), CHOPPA_CONVERSION_STAN_MAG("choppa_conversion/stan_mag"), CHOPPA_CONVERSION_EXT_MAG("choppa_conversion/ext_mag"), CHOPPA_CONVERSION_SPEED_MAG("choppa_conversion/speed_mag"),
    CHOPPA_MAIN("choppa/main"),CHOPPA_STA_BARREL("choppa/sta_barrel"),CHOPPA_EXT_BARREL("choppa/ext_barrel"),CHOPPA_SILENCER("choppa/silencer"),CHOPPA_ADVANCED_SILENCER("choppa/advanced_silencer"),CHOPPA_MUZZLE_BRAKE("choppa/muzzle_brake"),
    WRINGMAN_MAIN("wringman/main"),
    LUG_MAIN("lug/main"),
    RIVEN_MAIN("riven/main"),
    WORMROOT_NEEDLE_MAIN("wormroot_needle/main"),
    NEBILITSA_MAIN("nebilitsa/main"),
    MILLEND_OVERDRIVE_MAIN("millend_overdrive/main"),
    RAYGUN_MK2_MAIN("raygun_mk2/main"),
    FLINT_LOCKEWOOD_MAIN("flint_lockewood/main"),
    FLINT_LOCKEWOOD_STOCK_LIGHT("flint_lockewood/light_stock"),
    FLINT_LOCKEWOOD_STOCK_HEAVY("flint_lockewood/heavy_stock"),
    FLINT_LOCKEWOOD_STOCK_WOODEN("flint_lockewood/wooden_stock"),
    FLINT_LOCKEWOOD_SILENCER("flint_lockewood/silencer"),
    FLINT_LOCKEWOOD_ADVANCED_SILENCER("flint_lockewood/advanced_silencer"),
    FLINT_LOCKEWOOD_MUZZLE_BRAKE("flint_lockewood/muzzle_brake"),
    FLINT_LOCKEWOOD_STAN_BARREL("flint_lockewood/stan_barrel"),
    FLINT_LOCKEWOOD_EXT_BARREL("flint_lockewood/ext_barrel"),
    FLINT_LOCKEWOOD_GRIP_LIGHT("flint_lockewood/light_grip"),
    FLINT_LOCKEWOOD_GRIP_VERTICAL("flint_lockewood/tact_grip"),
    FLINT_LOCKEWOOD_IRON_BAYONET("flint_lockewood/iron_bayonet"),
    FLINT_LOCKEWOOD_ANTHRALITE_BAYONET("flint_lockewood/anthralite_bayonet"),
    FLINT_LOCKEWOOD_DIAMOND_BAYONET("flint_lockewood/diamond_bayonet"),
    FLINT_LOCKEWOOD_NETHERITE_BAYONET("flint_lockewood/netherite_bayonet"),
    FLINT_LOCKEWOOD_STANDARD_MAG("flint_lockewood/stan_mag"),
    FLINT_LOCKEWOOD_EXTENDED_MAG("flint_lockewood/ext_mag"),
    FLINT_LOCKEWOOD_SPEED_MAG("flint_lockewood/speed_mag");
    private final ResourceLocation modelLocation;

    /**
     * Cached model
     */
    private BakedModel cachedModel;

    /**
     * Sets the model's location
     *
     * @param modelName name of the model file
     */
    SpecialModels(String modelName) {
        this.modelLocation = new ResourceLocation(MODID, "special/" + modelName);
    }

    /**
     * Registers the special models into the Forge Model Bakery. This is only called once on the
     * load of the game.
     */
    @SubscribeEvent
    public static void registerAdditional(ModelEvent.RegisterAdditional event) {
        for (SpecialModels model : values()) {
            event.register(model.modelLocation);
        }
    }

    /**
     * Clears the cached BakedModel since it's been rebuilt. This is needed since the models may
     * have changed when a resource pack was applied, or if resources are reloaded.
     */
    @SubscribeEvent
    public static void onBake(ModelEvent.BakingCompleted event) {
        for (SpecialModels model : values()) {
            model.cachedModel = null;
        }
    }

    /**
     * Gets the model
     *
     * @return isolated model
     */
    public BakedModel getModel() {
        if (this.cachedModel == null) {
            this.cachedModel = Minecraft.getInstance().getModelManager().getModel(this.modelLocation);
        }
        return this.cachedModel;
    }
}