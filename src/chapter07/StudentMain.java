package chapter07;

public class StudentMain {

	public static void main(String[] args) {

		// studentLee에 이수정으로 설정후 serialNum과 StudentName 출력

		Student_03 studentLee = new Student_03(); // studentID =10001;
		studentLee.setStudentName("이수정 이제 26살이래여 ㅋ");
		System.out.println(studentLee.StudentName);
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentID);
	//	studentLee.serialNum++;
		//studentLee.studentID++;
		System.out.println();

		
		Student_03 studentkim = new Student_03(); // studentID =10002;
		studentkim.setStudentName("김은성 이제 24살이래여 ㅋ");
		System.out.println(studentkim.StudentName);
		System.out.println(studentkim.serialNum);
		System.out.println(studentkim.studentID);
		System.out.println();
		
		Student_03 studentPark = new Student_03(); // studentID =10002;
		studentPark.setStudentName("박쥐쉣");
		System.out.println(studentPark.StudentName);
		System.out.println(studentPark.serialNum);
		System.out.println(studentPark.studentID);
		System.out.println();
	}

}
