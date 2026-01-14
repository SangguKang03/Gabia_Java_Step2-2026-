package chapter09;

public class PhoneMain_04 {

	public static void main(String[] args) {
		
		//추상클래스이므로 객체생성 절대 불가능 그냥 개 쓰래기임 객체생성도 안되고
		//Phone p = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("김자반");
		System.out.println(smartPhone.owner);
		smartPhone.turnOn();
		smartPhone.intersearch();
		smartPhone.turnOff();
		
	}

}
