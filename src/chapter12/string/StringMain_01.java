package chapter12.string;

public class StringMain_01 {

	public static void main(String[] args) {

		// String -> 불변 객체(Immutable Object)

		String str = "";
		String str1 = "Hi everybody!";
		String str2 = " Have a nice Day!";

		// str1 주소 같음
		System.out.println(System.identityHashCode(str1)); // 1239731077
		str = str1 + str2;
		System.out.println(System.identityHashCode(str)); // 1134712904
		System.out.println(System.identityHashCode(str1)); // 1239731077
		System.out.println(str);

		// str1.concat 컴파일시 새로운 객체로 문자열이 변환됨
		str1 = str1.concat(str2);
		System.out.println(System.identityHashCode(str1)); // 985922955

		str = str1.concat(str2);
		System.out.println(System.identityHashCode(str1)); // 985922955
		
		System.out.println("str1 글자수: " + str1.length());
		System.out.println("str2 글자수: " + str2.length());

		System.out.println("str1 d글자 위치: " + str1.indexOf('d'));
		System.out.println("str2 D글자 위치: " + str2.indexOf('D'));

		System.out.println("str1 모두 소문자로: " + str1.toLowerCase());
		System.out.println("str2 모두 소문자로: " + str2.toLowerCase());

		System.out.println("str1 모두 대문자로: " + str1.toUpperCase());
		System.out.println("str2 모두 대문자로: " + str2.toUpperCase());
	}

}
