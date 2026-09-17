package Week4;

public class WashingMachine {

	//attributes
	
	private String brand;
	private String model;
	private double capacityKg;
	private int powerWatts;
	
	//getters and setters for attributes

	//brand getter/setter
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
	
	//power getter/setter
	public int getPowerWatts() {
		return powerWatts;
	}
	public void setPowerWatts(int powerWatts) {
		this.powerWatts = powerWatts;
	}
	
	//constructor which calls setters for attributes
	
	public WashingMachine(String brand, String model, double capacityKg, int powerWatts) {
		setBrand(brand);
		setModel(model);
		setCapacityKg(capacityKg);
		setPowerWatts(powerWatts);
	}
	
	//toString() method
	
	@Override
	public String toString() {
		return "WashingMachine [getBrand()=" + getBrand() + ", getModel()=" + getModel() + ", getCapacityKg()="
				+ getCapacityKg() + ", getPowerWatts()=" + getPowerWatts() + "]";
	}
	
	//startWash method
	public void startWash() {
		System.out.println("The washing machine has started washing");
	}
	
	//stopWash method
	public void stopWash() {
		System.out.println("The washing machine has stopped.");
	}
	
}
