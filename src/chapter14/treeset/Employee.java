package chapter14.treeset;


// record: 멤버변수 선언, 생성자 오버로딩, getter/setter
public record Employee(String name, int age) {

	@Override
	public String toString() {
		
		return name + ": " + age;
	}
	
	
	
}
