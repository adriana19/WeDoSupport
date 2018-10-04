package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DbUtility {

	private static Connection connection = null;

	public static Connection getConnection() {
		try {
			if (connection != null && !connection.isClosed())
				return connection;
			else {
				try {
					Properties prop = new Properties();
					InputStream inputStream = DbUtility.class.getClassLoader().getResourceAsStream("datasource-config.properties");
					prop.load(inputStream);
					String driver = prop.getProperty("db.driver");
					String url = prop.getProperty("db.url");
					String username = prop.getProperty("db.username");
					String password = prop.getProperty("db.password");
					Class.forName(driver);
					connection = DriverManager.getConnection(url, username, password);
					System.out.println("New connection: " + connection);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}

