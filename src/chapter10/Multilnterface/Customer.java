package chapter10.Multilnterface;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}
	
	//추상은 아니지만 같은메서드명이 존재하면 반드시 오버라이드 가능(모호성에 빠짐)
	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}
}
