package mo.devexercise.reports;

/*
 * Class to get the results for the report type. 
 * Currently, implemented only 1 method to fetch ProductReport.
 * 
 */
public enum ReportFactory {

	INSTANCE;

	@SuppressWarnings("rawtypes")
	public ReportService getProductReportService() {
		return ProductReportService.getInstance();
	}
}
