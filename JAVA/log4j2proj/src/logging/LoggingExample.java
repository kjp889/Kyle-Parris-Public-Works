package logging;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingExample {
	private static final Logger Logger = LogManager.getLogger(LoggingExample.class);
	
	public static void main(String[] args) {
		Logger.info("Test INFO Message");
		Logger.debug("Test DEBUG Message");
		Logger.error("Test ERROR Message");
		Logger.trace("Test TRACE Message");
		Logger.fatal("Test FATAL Message");
		Logger.warn("Test WARNING Message");
		
		
		
	}

}
