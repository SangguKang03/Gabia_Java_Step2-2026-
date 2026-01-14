package chapter13;

public class GenericContainerMain04 {

	public static void main(String[] args) {
		
		// 문자열 아이템을 저장하는 객체(StringContainer)
		GenericContainer<String> stringContainer = new GenericContainer<String>(5);
		stringContainer.addItem("Apple");
		stringContainer.addItem("Banana");
		stringContainer.addItem("Cherry ");
		stringContainer.printItems();
		
		// 타입제한 사용 불가능
		//String[] stringArray = { 1, 2, 3, 4, 5 };
		//System.out.println("Sum of int array: " + stringContainer.sum(stringArray));
		
		// 정수형 아이템을 저장하는 객체
		GenericContainer<Integer> integerContainer = new GenericContainer<Integer>(5);
		integerContainer.addItem(40);
		integerContainer.addItem(50);
		integerContainer.addItem(60);
		integerContainer.printItems();
		
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println("Sum of int array: " + integerContainer.sum(intArray));
		
		// 실수형 아이템을 저장하는 객체
		GenericContainer<Double> doubleContainer = new GenericContainer<Double>(5);
		doubleContainer.addItem(40.0);
		doubleContainer.addItem(50.0);
		doubleContainer.addItem(60.0);
		doubleContainer.printItems();
		
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		System.out.println("Sum of int array: " + doubleContainer.sum(doubleArray));
	}

}
