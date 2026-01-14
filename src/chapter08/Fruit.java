package chapter08;

public class Fruit {
	
	private String sort;//분류
	private String season;//계절과일
	
	//초기화 메소드
	public void Set1(String a, String b) {
		sort=a;
		season=b;
	}
	
	//출력 
	public void Disp1() {
		System.out.println("분류: " + sort);
		System.out.println("계절: " + season);
	}
}
