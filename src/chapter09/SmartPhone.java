package chapter09;

public class SmartPhone extends Phone{ // new Phone()

	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void intersearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
}
