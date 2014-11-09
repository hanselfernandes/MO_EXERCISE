package mo.devexercise.dao;

/*
 * Interface for the DAO that all DAO implementations need to implement.
 * 
 */
import java.sql.ResultSet;
import java.util.List;

public interface DAOReference {

	public String getUsername();

	public String getPassword();

	public String getUrl();

	public String getDriverName();

	public ResultSet executeStatement(String statement) throws Exception;

	public ResultSet executeParameterizedStatement(String statement,
			List<Object> list) throws Exception;

	public void executeStoredProc(String spName) throws Exception;

}
