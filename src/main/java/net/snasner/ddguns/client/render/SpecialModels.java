package net.snasner.ddguns.client.render;


@net.minecraftforge.fml.common.Mod.EventBusSubscriber(modid = "ddguns", value = {net.minecraftforge.api.distmarker.Dist.CLIENT}, bus = net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD)

public enum SpecialModels {
    GNASHER_MAIN("gnasher/main"), GNASHER_STAN_MAG("gnasher/stan_mag"), GNASHER_EXT_MAG("gnasher/ext_mag"), GNASHER_SPEED_MAG("gnasher/speed_mag");

    private final net.minecraft.resources.ResourceLocation modelLocation;
    private net.minecraft.client.resources.model.BakedModel cachedModel;

    private SpecialModels(java.lang.String modelName) { /* compiled code */ }

    public net.minecraft.client.resources.model.BakedModel getModel() { /* compiled code */ };

    @net.minecraftforge.eventbus.api.SubscribeEvent
    public static void registerAdditional(net.minecraftforge.client.event.ModelEvent.RegisterAdditional event) { /* compiled code */ }

    @net.minecraftforge.eventbus.api.SubscribeEvent
    public static void onBake(net.minecraftforge.client.event.ModelEvent.BakingCompleted event) { /* compiled code */ }

}
