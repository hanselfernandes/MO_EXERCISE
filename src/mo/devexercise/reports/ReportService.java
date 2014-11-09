package mo.devexercise.reports;

/*
 * Interface that forms a basis for all reporting service implementations
 * 
 */
public interface ReportService<T> {
	public T execute() throws Exception;
}
