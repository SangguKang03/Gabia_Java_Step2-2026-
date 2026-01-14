package chapter08;

public class C extends A_03{
	
	public C() {
		super(); // A클래스, 생성자
		this.field="value";
		this.method();
	}
	
	public static void main(String[] args) {
		C c = new C();//자식 클래스
		c.method(); //부모클래스
	}


}
