package chapter10.Interface;

public class MyClassMain_04 {

	public static void main(String[] args) {
		
		MyClass mClass = new MyClass();W
		
		//X클래스 타입
		X x = mClass;
		x.x();
		// y클래스 타입
		Y y = mClass;
		y.y();
		//MyInterface클래스 타입
		MyInterface my = mClass;
		my.myMethod();
		my.x();
		my.y();
	}

}
