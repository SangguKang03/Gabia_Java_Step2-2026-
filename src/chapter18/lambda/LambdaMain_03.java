package chapter18.lambda;

@FunctionalInterface
interface MyFunctionInterfaec {

	void showMsg(String message);
}

public class LambdaMain_03 {

	public static void main(String[] args) {

		MyFunctionInterfaec f = s -> System.out.println(s);

		// #1
		f.showMsg("오라클 못하는 류태희");

		// #2
		showMyMsg(f);

	}// main

	public static void showMyMsg(MyFunctionInterfaec f) {

		f.showMsg("또 멈췄데여!~~ and 매개변수로 사용되는 람다식");

	}
}
