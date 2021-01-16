package me.discens.fbftclient;

import me.discens.fbftclient.managers.ModuleManager;
import me.zero.alpine.bus.EventBus;
import me.zero.alpine.bus.EventManager;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FbftClient implements ModInitializer {

	public static FbftClient INSTANCE;
	public static final String NAME = "4b4t Client";
	public static final String VERSION = "1.0.0";

	public static Logger logger;
	public static EventBus eventBus;
	public static ModuleManager moduleManager;

	@Override
	public void onInitialize() {
		logger = LogManager.getLogger("4b4t");
		eventBus = new EventManager();
		moduleManager = new ModuleManager();

		logger.info("initializing client");

	}
}
