package mo.devexercise.reports;

import java.util.List;

/*
 * ProductReport service to fetch from Handler
 * 
 */
import mo.devexercise.bo.Product;
import mo.devexercise.dao.ProductsDAOHandler;

public class ProductReportService implements ReportService<List<Product>> {

	private static ProductReportService instance = new ProductReportService();

	private ProductReportService() {
	}

	public static ProductReportService getInstance() {
		return instance;
	}

	@Override
	public List<Product> execute() throws Exception {
		return new ProductsDAOHandler().fetchResults();

	}

}
