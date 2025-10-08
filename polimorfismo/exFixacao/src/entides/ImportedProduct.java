package entides;

public class ImportedProduct extends Product{
	
	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	} 
	
	public double priceTotal() {
		return super.getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return super.getName() + " $ " + String.format("%.2f", priceTotal()) 
					+ " (Taxa alfandegária: $ " 
					+ String.format("%.2f", customsFee) + ")";
	}
	
	
}
