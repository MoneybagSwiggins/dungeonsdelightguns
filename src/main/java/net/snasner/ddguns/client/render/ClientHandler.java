package net.snasner.ddguns.client.render;

import net.minecraftforge.fml.common.Mod;
import net.snasner.ddguns.client.render.gun.model.ChoppaConversionModel;
import net.snasner.ddguns.client.render.gun.model.GnasherModel;
import net.snasner.ddguns.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import top.ribs.scguns.client.render.gun.ModelOverrides;

import static net.snasner.ddguns.dungeonsdelightguns.MODID;

@Mod.EventBusSubscriber(
        modid = MODID,
        value = {Dist.CLIENT}
)
public class ClientHandler {

    public ClientHandler() {
        super();
    }

    public static void registerClientHandlers(IEventBus bus) {
        bus.addListener(ClientHandler::onClientSetup);
    }

    private static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(ClientHandler::setup);
    }

    public static void setup() {
        registerModelOverrides();
    }

    private static void registerModelOverrides() {
        ModelOverrides.register((Item)ModItems.GNASHER.get(), new GnasherModel());
        ModelOverrides.register((Item)ModItems.CHOPPA_CONVERSION.get(), new ChoppaConversionModel());
    }
}
