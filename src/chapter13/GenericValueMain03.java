package chapter13;

public class GenericValueMain03 {

	public static void main(String[] args) {
		
		GenericValue<String> v1 = new GenericValue<String>();
		v1.setValue("100");
		System.out.println(v1.getvalue());
		
		GenericValue<Character> v2 = new GenericValue<Character>();
		v2.setValue('A');
		System.out.println(v2.getvalue());
		
		GenericValue<Integer> v3 = new GenericValue<Integer>();
		v3.setValue(100);
		System.out.println(v3.getvalue());

		GenericValue<Double> v4 = new GenericValue<Double>();
		v4.setValue(3.141592);
		System.out.println(v4.getvalue());
	}

}
