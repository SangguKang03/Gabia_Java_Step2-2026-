package chapter15.hashmap;

public class Student {

	public int sno;
	public String name;

	public Student(int sno, String nama) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student));
		}
		
		return false;
	}

	@Override
	public String toString() {

		return "Student [sno=" + sno + ", name=" + name + "]";
	}

}
