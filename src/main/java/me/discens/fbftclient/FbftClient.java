package me.discens.fbftclient;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FbftClient implements ModInitializer {

	public static final String NAME = "4b4t Client";
	public static final String VERSION = "1.0.0";

	public static Logger logger;

	@Override
	public void onInitialize() {
		logger = LogManager.getLogger("4b4t");

		logger.info("initializing client");
	}
}
