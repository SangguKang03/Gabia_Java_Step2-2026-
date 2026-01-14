package chapter14.treeset;

import java.util.*;

public class CompartorEmployeeMain_04 {

	public static void main(String[] args) {
		
		List<Employee> empl = new ArrayList<Employee>();
		
		empl.add(new Employee("뭐여", 18));
		empl.add(new Employee("뭐", 19));
		empl.add(new Employee("여", 20));
		
		Collections.sort(empl, new NameComparator());
		System.out.println("무엇인가를 출력하세요");
			for(Employee emp: empl) {
				System.out.println(emp);
			}
		
			Collections.sort(empl, new AgeComparator());
			
			System.out.println("무엇인가를 출력하세요");{
				for(Employee emp: empl) {
					System.out.println(emp);
				}
	}

}
