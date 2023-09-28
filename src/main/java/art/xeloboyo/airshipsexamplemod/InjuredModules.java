package art.xeloboyo.airshipsexamplemod;

import net.fabricmc.api.ModInitializer;

public class InjuredModules implements ModInitializer {
    public static final String MODID = "airships-example-mod";

    // This logger is used to write text to the console and the log file.
    //todo because we dont have a logger, we can't use the logger to write to the console
    //public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        // This code runs as soon as Airships is in a mod-load-ready state.
        System.out.println("Hello Fabric world!" );
    }
}
