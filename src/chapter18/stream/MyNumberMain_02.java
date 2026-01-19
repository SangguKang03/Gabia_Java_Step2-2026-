package chapter18.stream;

import chapter18.lambda.MyNumber;

public class MyNumberMain_02 {

	public static void main(String[] args) {

		// Lambda 활용
		MyNumber max=(x, y) -> (x>=y) ? x:y;
		System.out.println(max.getMax(10, 20));
		
		// 일반적인 활용
		MyNumber aa = MyNumber();

	@Override
	public int getMax(int x, int y) {
		int max = (x >= y) ? x : y;
		return max;
	}
	}
