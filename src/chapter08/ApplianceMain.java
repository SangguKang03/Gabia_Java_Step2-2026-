package chapter08;

public class ApplianceMain {

	public static void main(String[] args) {
	 
		TV tv = new TV("Lg");
		Washer washer = new Washer("Lg");
		tv.turnOn();
		System.out.println("-----------");
		washer.turnOn();
		
		
		Appliance[] list = new Appliance[3];
		list[0] = new Washer("LG");
		list[1] = new Washer("Samsung");
		list[2] = new Washer("LG");
		
		for(Appliance a:list) {
			a.turnOff();
		}
	}

}
