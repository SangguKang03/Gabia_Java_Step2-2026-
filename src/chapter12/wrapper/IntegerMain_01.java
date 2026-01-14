package chapter12.wrapper;

public class IntegerMain_01 {

	public static void main(String[] args) {
		
		//int: 기본형 | Integer:참조형
		Integer i = new Integer(100); // int i = 100;
		
		Integer num = 100; // 참조형 변수(autoboxing오토박싱)
		
		int iNum = num.intValue();
		
		int jNum = 200;
		
		// 언박싱(Integer -> int)
		int sum = iNum+jNum;
		System.out.println(sum);
		int total = num.intValue()+jNum;
		System.out.println(total);
		
		// 오토박싱(int -> Integer)
		Integer x = jNum;
		Integer y = Integer.valueOf(iNum);
		System.out.println(x);
		System.out.println(y);
	}

	

}
