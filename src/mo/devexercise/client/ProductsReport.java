package mo.devexercise.client;

import java.util.List;

import mo.devexercise.bo.Product;
import mo.devexercise.reports.ReportsServiceLocator;

/*
 * Class used by client to display the report
 * 
 */
public class ProductsReport {

	public static void main(String[] args) {
		try {

			List<Product> listProducts = ReportsServiceLocator.INSTANCE
					.getProductSummary();

			System.out.println("Product Name,\t Total # sold,\t Total Amount");

			for (Product product : listProducts) {
				System.out.println(product.getProductName() + "\t\t\t"
						+ product.getNoOfUnitsSold() + "\t\t"
						+ product.getTotalAmount());
			}

		} catch (Exception ex) {
			System.out.println("Exception occured - " + ex + " , Aborting..");
		}

	}

}
