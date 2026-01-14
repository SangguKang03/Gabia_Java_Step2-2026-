package chapter08;

public class Car {
	
	public int speed;
	
	//생성자

	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("자동차가 멈춥니다.");
		speed = 0;
	}
	
	
}
