package chapter09;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행할게");
		System.out.println("자동차가 스스로 방향을 전환 할거래");
	}

	@Override
	public void stop() {
		System.out.println("멈춰 새갸야");
	}

}
