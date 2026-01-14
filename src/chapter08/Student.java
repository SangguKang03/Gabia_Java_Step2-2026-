package chapter08;

public class Student extends People{ //people() x
	
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		//super(); // people() x
		super(name, ssn); // people(String name, String ssn)
		this.studentNo = studentNo;
	}
	
}
