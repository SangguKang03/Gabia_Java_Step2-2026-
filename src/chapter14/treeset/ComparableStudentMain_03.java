package chapter14.treeset;

import java.util.*;

public class ComparableStudentMain_03 {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("류태희", 1));
		students.add(new Student("서효근", 0));
		students.add(new Student("강상구", 100));
		
		Collections.sort(students);
		
		for(Student student : students) {
			System.out.println(student);
		}
	}

}
