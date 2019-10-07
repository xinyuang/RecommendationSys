package db.mysql;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLDBUtil {
	// Run this as Java application to reset db schema.
	private static final String HOSTNAME = "localhost";
	private static final String PORT_NUM = "3307"; // change it to your mysql port number
	public static final String DB_NAME = "laiproject";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	public static final String URL = "jdbc:mysql://"
			+ HOSTNAME + ":" + PORT_NUM + "/" + DB_NAME
			+ "?user=" + USERNAME + "&password=" + PASSWORD
			+ "&autoReconnect=true&serverTimezone=UTC";

}
