package appliance;

public class Dryer extends Appliance {
	// Extra attribute unique to Dryer
	private boolean sensorDry;

	//getter and setter
	public boolean isSensorDry() {
		return sensorDry;
	}

	public void setSensorDry(boolean sensorDry) {
		this.sensorDry = sensorDry;
	}

	public Dryer(String brand, String model, double capacityKg, boolean sensorDry) {
		super(brand,model,capacityKg);
		setSensorDry(sensorDry);
	}
	
	// OVERRIDES Appliance.toString() to add Dryer-specific info
	@Override
	public String toString() {
		// Re-use Person’s formatting via super.toString()
		return super.toString() + ", sensorDry='" + sensorDry + "'";
	}
	
	public void startDry() {
		System.out.println("Dryer is running");
	}

	public void stopDry() {
		System.out.println("Dryer cycle finished.");
	}
}
