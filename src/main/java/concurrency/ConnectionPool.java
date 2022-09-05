package concurrency;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class ConnectionPool {
    final Logger logger = LogManager.getLogger(ConnectionPool.class.getName());

    protected int size;
    protected List<Connection> connections;

    public ConnectionPool(int size) {
        this.size = size;
        connections = new ArrayList<>(size) {
        };
    }

    private void innitConnection(Connection connection) {
        connections.add(connection);
    }

    public void releaseConnection(Connection connection) {
        connections.remove(connection);
    }

    public synchronized Connection getConnection() {

        Connection connection;

        if (connections.size() < size) {
            connection = new Connection("Thread#" + (connections.size() + 1));
            innitConnection(connection);
            return connection;

        } else {
            logger.info("There are no free slots, connection requests will get to queue...");
            int maxAttemptsCount = 10;
            while (maxAttemptsCount-- > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


                if (connections.size() < size) {
                    connection = new Connection("Thread#" + (connections.size() + 1));
                    innitConnection(connection);
                    return connection;
                }
            }
            throw new RuntimeException("No connections available after 10 seconds");

        }
    }

}