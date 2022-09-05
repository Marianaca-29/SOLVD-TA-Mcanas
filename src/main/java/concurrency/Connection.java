package concurrency;
//import homework2.Main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Connection {

    final Logger logger = LogManager.getLogger(Connection.class.getName());

    protected final String name;
    protected boolean isAvailable;

    public Connection(String name) {
        this.name = name;
        logger.info("Connection was created: " + name);
    }

    void connect() {
        logger.info("Connecting " + name);
        isAvailable = false;
    }

    void disconnect() {
        logger.info("Disconnecting " + name);
        isAvailable = true;
    }
}