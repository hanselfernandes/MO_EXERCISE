package mo.devexercise.reports;

import java.util.List;

import mo.devexercise.bo.Product;

/*
 * Locator service for all reports. 
 * This will be used by clients to get all reports information
 * 
 */
public enum ReportsServiceLocator {

	INSTANCE;

	@SuppressWarnings("unchecked")
	public List<Product> getProductSummary() throws Exception {
		return (List<Product>) ReportFactory.INSTANCE.getProductReportService()
				.execute();
	}
}
