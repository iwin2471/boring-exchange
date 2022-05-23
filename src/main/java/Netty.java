import config.ServerConfiguration;

import java.io.IOException;

public class Netty {
	public static final int MAX_RECEIVE_SIZE = 2048;

	public static void run(String configFile) throws IOException, InterruptedException {
		run(configFile, null);
	}

	public static void run(String configFile, Runnable initializedCallback) throws IOException, InterruptedException {
		ServerConfiguration configuration;
	}
}