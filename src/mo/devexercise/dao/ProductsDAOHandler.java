package mo.devexercise.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * Class used to interface the DAO with the population of the business object from the DB
 * 
 */
import mo.devexercise.bo.Product;

public final class ProductsDAOHandler implements DAOHandler<List<Product>> {

	private static final String PRODUCT_NAME = "ProductName";
	private static final String NO_OF_UNITS = "NoOfUnits";
	private static final String TOTAL_AMOUNT = "TotalAmount";

	private static final String SELECT_STATEMENT = "select pt.ProductName as \"ProductName\", count(*) as \"NoOfUnits\", sum(SaleAmount) as \"TotalAmount\" from SalesEntry s, ProductTable pt where s.ProductId =pt.ProductId group by s.ProductId;";

	@Override
	public List<Product> fetchResults() throws Exception {
		List<Product> productsList = null;
		ResultSet rs = null;

		try {

			rs = DAOFactory.INSTANCE.getDaoReference().executeStatement(
					SELECT_STATEMENT);
			productsList = new ArrayList<Product>();

			while (rs.next()) {

				Product prod = new Product();
				prod.setProductName(rs.getString(PRODUCT_NAME));
				prod.setNoOfUnitsSold(rs.getInt(NO_OF_UNITS));
				prod.setTotalAmount(rs.getInt(TOTAL_AMOUNT));

				productsList.add(prod);

			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;

		} finally {
			// lets free resources, for GC
			if (rs != null) {
				rs.close();
			}
		}

		return productsList;
	}

}
