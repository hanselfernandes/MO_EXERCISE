package mo.devexercise.tests;

import static org.junit.Assert.*;

import java.util.List;

import mo.devexercise.bo.Product;
import mo.devexercise.reports.ReportFactory;

import org.junit.Test;

/*
 * Lets start testing..
 * I have created this test class so we can test the ProductReportService. 
 * Once we have more, we can add suites. Another good thing to have is some mocking 
 * framework integrate with junit - a TODO!
 */

public class ProductsDAOHandlerTest {

	@SuppressWarnings("unchecked")
	@Test
	public void testProductsAreReturnedFromDatabase() {

		List<Product> listProducts = null;

		try {
			listProducts = (List<Product>) ReportFactory.INSTANCE
					.getProductReportService().execute();

		} catch (Exception ex) {
			ex.printStackTrace();
			fail("Something bad has happened... Time to investigate.. - " + ex);
		}

		assertNotNull(listProducts);

		System.out.println("Products - " + listProducts.size());

	}

}
