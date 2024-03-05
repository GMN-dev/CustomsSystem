package entities;

public class ImportedProduct extends Product{

	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price+customsFee);
		this.customsFee = customsFee;
	}
	
	public Double getCustomsFee() {
		return customsFee;
	}
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return String.format("%s (Customs fee: %.2f)", super.priceTag() , this.customsFee);
	}
}
