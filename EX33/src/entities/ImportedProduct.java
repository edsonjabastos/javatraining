package entities;

public class ImportedProduct extends Product {
	Double customFee;

	public ImportedProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}

	public Double totalPrice() {
		return price + customFee;
	}

	@Override
	public String priceTag() {
		return name + " $" + totalPrice() + " (Customs fee: $" + customFee + ")";
	}
}
