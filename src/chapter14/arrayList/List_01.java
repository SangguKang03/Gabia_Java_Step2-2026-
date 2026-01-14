package chapter14.arrayList;

import java.util.*;

import chapter08.Student;


public class List_01 {
	
	public static void main(String[] args) {
		
		//ArrayList<String> student = new ArrayList<String>();
		List<String> students = new ArrayList<String>();
		
		students.add("Alice");
		students.add("Bob");
		students.add("Charlie");
		students.add("Diana");
		
		//학생출력
		System.out.println("--------students List---------");
		for(String student : students) {
			System.out.println(student);
		}
		
		//특정 학생을 제거
		students.remove("Bob");
		
		//제거 후 학생 출력
		System.out.println("--------students List---------");
		for(String student : students) {
			System.out.println(student);
		}
		
	}
	
	
	
}
