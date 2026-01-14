package chapter14.treeset;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		
		return  Integer.compare(o1, o2)* -1;
	}
}
