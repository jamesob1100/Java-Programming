package Week4;

public class Dryer {

	private String brand;
	private String model;
	private double capacityKg;
	private boolean sensorDry;
	

	@Override
	public String toString() {
		return "Dryer [isSensorDry()=" + isSensorDry() + ", getBrand()=" + getBrand() + ", getModel()=" + getModel()
				+ ", getCapacityKg()=" + getCapacityKg() + "]";
	}

	public boolean isSensorDry() {
		return sensorDry;
	}

	public void setSensorDry(boolean sensorDry) {
		this.sensorDry = sensorDry;
	}

	public Dryer(String brand, String model, double capacityKg, boolean sensorDry) {
		setBrand(brand);
		setModel(model);
		setCapacityKg(capacityKg);

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {

		if (brand.isBlank()) {
			this.brand = "Unknown";
		} else {
			this.brand = brand;
		}

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {

		if (model.isBlank()) {
			this.model = "Unknown";
		} else {
			this.model = model;
		}
	}

	public double getCapacityKg() {
		return capacityKg;
	}

	public void setCapacityKg(double capacityKg) {
		this.capacityKg = capacityKg;
	}



	public void startDry() {
		System.out.println("Dryer is running");
	}

	public void stopDry() {
		System.out.println("Dryer cycle finished.");
	}
}
