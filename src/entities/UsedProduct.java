package entities;

import java.time.LocalDate;

public class UsedProduct extends Product{

	private LocalDate manufacturerDate;
	
	public UsedProduct(String name, Double price, LocalDate manufacturerDate) {
		super(name, price);
		this.manufacturerDate = manufacturerDate;
	}
	
	public LocalDate getManufacturerDate() {
		return this.manufacturerDate;
	}
	
	@Override
	public String priceTag() {
		return String.format("%s (used) $ %.2f (Manufacture date (DD/MM/YYYY): %s", this.getName(), this.getPrice(), this.manufacturerDate);
		
	}
	
}
