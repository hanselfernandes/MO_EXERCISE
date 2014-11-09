package mo.devexercise.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/*
 * MySQL DAO implementation, this will extend the Abstract DAO Reference.
 * 
 */

class MySqlDAOReference extends AbstractDAOReference {

	public MySqlDAOReference() {
	}

	private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/EXERCISE";

	// Database credentials
	private static final String USERNAME = "hansel";
	private static final String PASSWORD = "hansel123";

	@Override
	public ResultSet executeStatement(String statement) throws Exception {
		Connection conn = getConnection();

		if (conn == null) {
			throw new Exception(
					"Issue getting Database Connection, please check DB parameters, Aborting..");
		}

		ResultSet rs = null;
		Statement stmt = null;

		try {

			stmt = conn.createStatement();
			rs = stmt.executeQuery(statement);

		} catch (Exception ex) {
			ex.printStackTrace();// would be good to have logging in place,
									// instead of printing on console
			throw ex;

		} finally {
			freeResources(conn, stmt);
		}

		return rs;

	}

	/*
	 * Method to execute SPs(callable), if need be.
	 * 
	 * @see mo.devexercise.dao.DAOReference#executeStoredProc(java.lang.String)
	 */
	@Override
	public void executeStoredProc(String spName) throws Exception {
		// TODO

	}

	/*
	 * Method to execute Parameterized statement
	 * 
	 * @see
	 * mo.devexercise.dao.DAOReference#executeParameterizedStatement(java.lang
	 * .String, java.util.List)
	 */
	@Override
	public ResultSet executeParameterizedStatement(String statement,
			List<Object> list) throws Exception {
		// TODO
		return null;

	}

	@Override
	public String getUsername() {

		return USERNAME;
	}

	@Override
	public String getPassword() {

		return PASSWORD;
	}

	@Override
	public String getUrl() {

		return DB_URL;
	}

	@Override
	public String getDriverName() {

		return DRIVER_NAME;
	}

}
