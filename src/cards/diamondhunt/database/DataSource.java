package cards.diamondhunt.database;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import cards.diamondhunt.configuration.Config;

public class DataSource {

	private static DataSource datasource;
	private ComboPooledDataSource cpds;

	private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private final String DB_URL = Config.DATABASE_HOST;
	private final String DB_USER= Config.DATABASE_USERNAME;
	private final String DB_PASS= Config.DATABASE_PASSWORD;
	
	private DataSource() throws IOException, SQLException, PropertyVetoException 
	{
		cpds = new ComboPooledDataSource();
		cpds.setDriverClass(JDBC_DRIVER); // loads the jdbc driver
		cpds.setJdbcUrl(DB_URL);
		cpds.setUser(DB_USER);
		cpds.setPassword(DB_PASS);
	}

	public void getPoolSize() {
	}

	public static DataSource getInstance() throws IOException, SQLException, PropertyVetoException 
	{
		if (datasource == null) {
			datasource = new DataSource();
		}
		
		return datasource;
	}

	public Connection getConnection()
	{
		try {
			return this.cpds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}