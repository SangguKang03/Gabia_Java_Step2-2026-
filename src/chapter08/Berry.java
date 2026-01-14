package chapter08;

//상속 키워드: Extends
public class Berry extends Fruit{
	
	
	private String name;//과일 이름
	private String size;//크기
	
	
	
	//초기화 메소드
		public void Set2(String a, String b) {
			name=a;
			size=b;
		}
		
		//출력 
		public void Disp2() {
			System.out.println("과일이름: " + name);
			System.out.println("크기: " + size);
		}
		
}
