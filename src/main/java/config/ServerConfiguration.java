package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

public class ServerConfiguration {
	private static ServerConfiguration instance;

	public static void initialize(File f) throws FileNotFoundException, IOException {
		instance = new ServerConfiguration();
		Properties p = new Properties();
		p.load(new FileInputStream(f));
	}

	private static int getPropInt(Properties p, String key, int defaultValue) {
		return Optional.ofNullable(p.getProperty(key)).map(Integer::parseInt).orElse(defaultValue);
	}

	private static boolean getPropBoolean(Properties p, String key, boolean defaultValue) {
		return Optional.ofNullable(p.getProperty(key)).map(Boolean::parseBoolean).orElse(defaultValue);
	}
}
