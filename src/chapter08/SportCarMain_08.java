package chapter08;

public class SportCarMain_08 extends Car{

	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("speed: " + speed);
	}
	
	/*
	public void stop() {
		System.out.println("스포츠카가 멈춥니다.");
		speed = 0;
	}*/
	
	public static void main(String[] args) {
		SportCarMain_08 ac = new SportCarMain_08();
		ac.speedUp();
		ac.stop(); //부모 클래스 에서 가져오는 메소드
	}

	

}
