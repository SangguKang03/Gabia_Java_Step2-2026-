package chapter07;

public class Company {
	private static Company instance = new Company();
	
	// 일반적인 객체생성
	public Company() {
		
	}
	public static Company getIntance() {
		
		// 예외처리 -> 생성됨 객체가 없으면 객체 생성
		if(instance == null) {
			instance = new Company();
		}
		return instance;
			
	}
}
