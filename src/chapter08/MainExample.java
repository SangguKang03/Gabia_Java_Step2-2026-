package chapter08;

import java.util.Scanner;

public class MainExample{

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		Example[] calculators = { new Calplus(), new Calminus() };
		System.out.println("정수 A를 입력하세요: ");
		int a = s.nextInt();
		System.out.println("정수 B를 입력하세요: ");
		int b = s.nextInt();
		
		
		
		for(Example ca : calculators) {
			System.out.println(ca.getClass().getSimpleName() + ": " + ca.getResult(a, b));
		}
		System.out.println();
		
		int plus = calc(new Calplus(),a,b);
		System.out.println("두 수의 합: " + plus);
		int minus = calc(new Calminus(),a,b);
		System.out.println("두 수의 차: " + minus);
	}
	
		
	/*Example ex = new Calplus();
	System.out.println("CalPlus: " + ex.getResult(n1, n2));
	
	Example ex2 = new Calminus();
	System.out.println("Calminus: " + ex2.getResult(n1, n2));
*/
	
	public static int calc(Example exam, int a, int b) {
		return exam.getResult(a, b);
	}
}
