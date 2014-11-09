package mo.devexercise.dao;

/*
 * Class to get a reference to the DAO object. This abstracts the actual implementation of the DAO
 * 
 */
public enum DAOFactory {
	INSTANCE;

	public DAOReference getDaoReference() {
		return new MySqlDAOReference();
	}
}
