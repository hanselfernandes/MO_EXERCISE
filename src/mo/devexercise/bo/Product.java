package mo.devexercise.bo;

/*
 * 
 * Business object definition
 */
public class Product {

	private String productName;
	private int noOfUnitsSold;
	private int totalAmount;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getNoOfUnitsSold() {
		return noOfUnitsSold;
	}

	public void setNoOfUnitsSold(int noOfUnitsSold) {
		this.noOfUnitsSold = noOfUnitsSold;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noOfUnitsSold;
		result = prime * result
				+ ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + totalAmount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (noOfUnitsSold != other.noOfUnitsSold)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (totalAmount != other.totalAmount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", noOfUnitsSold="
				+ noOfUnitsSold + ", totalAmount=" + totalAmount + "]";
	}
}
