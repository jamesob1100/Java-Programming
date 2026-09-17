package appliance;

public class Control {

	public static void main(String args[]) {
		/*
		//Test Code
		WashingMachine wm = new WashingMachine("Bosch","EcoClean",7.0,1800);
		wm.startWash();
		wm.stopWash();
		System.out.println(wm);

		//Test Code
		Dryer d = new Dryer("Samsung","QuickDry",8.0,true);
		d.startDry();
		d.stopDry();
		System.out.println(d);
		*/
		
	Appliance[] appliances = {
			new WashingMachine("Bosch","EcoClean",7.0,1800),
			new Dryer("Samsung","QuickDry",8.0,true),
			new WashingMachine("LG","TurboWash",9.0,2000),
			new WashingMachine("", "",6.0,1900),
			new Dryer("", "", 9.1,false)
		};
	
		for (Appliance a : appliances) {
			System.out.println(a); // calls the correct overridden toString() method
		}
	}
}
