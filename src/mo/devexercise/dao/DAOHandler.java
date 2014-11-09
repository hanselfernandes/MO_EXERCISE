package mo.devexercise.dao;

/* 
 * Interface for DAO Handler. This interface will need to be implemented by all 
 * classes that need information from the DAO 
 * 
 * 
 */
public interface DAOHandler<T> {
	public T fetchResults() throws Exception;
}
