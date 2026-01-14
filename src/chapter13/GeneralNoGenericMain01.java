package chapter13;

public class GeneralNoGenericMain01 {

	public static void main(String[] args) {

		// general
		GeneralNoGeneric general = new GeneralNoGeneric();

		// 정수형 배열(오토박스)
		Integer[] Arr = { 10, 20, 30, 40, 50 };
		general.printIntArr(Arr);
		// 실수형 배열(오토박스)
		Double[] dArr = { 10.1, 20.1, 30.1, 40.1, 50.1 };
		general.printDoubleArr(dArr);
		// 문자형 배열(오토박스)
		Character[] cArr = { 'A', 'B', 'C', 'D', 'E' };
		general.printCharArr(cArr);

	}

}
