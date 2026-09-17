package appliance;

public class Appliance {

	//core attributes
	private String brand;
	private String model;
	private double capacityKg;
	
	// Full constructor — uses setters (so validation runs in one place)
	public Appliance(String brand, String model, double capacityKg) {
		setBrand(brand);
		setModel(model);
		setCapacityKg(capacityKg);
	}
	
	// -------- Getters & Setters (simple gatekeeping) --------
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		//validation for brand
		
		this.brand = (brand == null || brand.isBlank()) ? "Undeclared" : brand.trim();
	}
	
	//model getter/setter
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		//validation for model
		
		this.model = (model == null || model.isBlank()) ? "Undeclared" : model.trim();
	}
	
	//capacity getter/setter
	public double getCapacityKg() {
		return capacityKg;
	}
	public void setCapacityKg(double capacityKg) {
		this.capacityKg = capacityKg;
	}

	@Override
	public String toString() {
		return "Appliance [getBrand()=" + getBrand() + ", getModel()=" + getModel() + ", getCapacityKg()="
				+ getCapacityKg() + "]";
	}
	
	
}
