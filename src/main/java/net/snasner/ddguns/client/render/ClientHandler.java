package net.snasner.ddguns.client.render;

import net.minecraftforge.fml.common.Mod;
import net.snasner.ddguns.client.render.gun.model.*;
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
        ModelOverrides.register((Item)ModItems.CHOPPA.get(), new ChoppaModel());
        ModelOverrides.register((Item)ModItems.FLINT_LOCKEWOOD.get(), new FlintLockewoodModel());
        ModelOverrides.register((Item)ModItems.WRINGMAN.get(), new WringmanModel());
        ModelOverrides.register((Item)ModItems.LUG.get(), new LugModel());
        ModelOverrides.register((Item)ModItems.RIVEN.get(), new RivenModel());
        ModelOverrides.register((Item)ModItems.WORMROOT_NEEDLE.get(), new WormrootNeedleModel());
        ModelOverrides.register((Item)ModItems.RAYGUN_MK2.get(), new RaygunMk2Model());
        ModelOverrides.register((Item)ModItems.MILLEND_OVERDRIVE.get(), new MillendOverdriveModel());
        ModelOverrides.register((Item)ModItems.NEBILITSA.get(), new NebilitsaModel());
    }
}
