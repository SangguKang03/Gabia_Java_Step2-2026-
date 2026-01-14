package chapter08;

public class Washer extends Appliance{
	public Washer(String brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		super.turnOn();
		System.out.println(brand + " 전원을 켭니다.");
	}

	
	
}
