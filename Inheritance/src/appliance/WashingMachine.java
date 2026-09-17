package appliance;

public class WashingMachine extends Appliance {
	// Extra attribute unique to WashingMachine
	private int powerWatts;
	
	// Constructor: call super(...) first, then own fields
		public WashingMachine(String brand, String model, double capacityKg, int powerWatts) {
			super(brand, model,capacityKg); // calls Appliance constructor
			setPowerWatts(powerWatts);
		}
	
	//getter and setter
	public int getPowerWatts() {
		return powerWatts;
	}
	public void setPowerWatts(int powerWatts) {
		this.powerWatts = powerWatts;
	}
	
	// OVERRIDES Appliance.toString() to add WashingMachine-specific info
	@Override
	public String toString() {
		// Re-use Person’s formatting via super.toString()
		return super.toString() + ", powerWatts='" + powerWatts + "'";
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
