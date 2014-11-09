package mo.devexercise.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/*
 * Abstract class that implements some common functionality which 
 * can be shared by all implementations of DAOs
 */
public abstract class AbstractDAOReference implements DAOReference {

	public abstract ResultSet executeStatement(String statement)
			throws Exception;

	public abstract ResultSet executeParameterizedStatement(String statement,
			List<Object> list) throws Exception;

	public abstract void executeStoredProc(String spName) throws Exception;

	/*
	 * Free all resources so these can be GCed..
	 */
	protected void freeResources(Connection conn, Statement stmt)
			throws SQLException {

		if (stmt != null) {
			stmt.close();
		}

		if (conn != null) {
			conn.close();
		}
	}

	/*
	 * Method to get the connection for the relevent DAO implementation. The
	 * url,username,password and drivername need to be provided by the subclass
	 */
	protected Connection getConnection() throws Exception {
		Connection conn = null;

		try {
			Class.forName(getDriverName());
			conn = DriverManager.getConnection(getUrl(), getUsername(),
					getPassword());

		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}

		return conn;
	}

}
