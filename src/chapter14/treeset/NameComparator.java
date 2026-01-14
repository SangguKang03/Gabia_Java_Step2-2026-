package chapter14.treeset;

import java.util.*;

public class NameComparator implements Comparator<Employee>{
	

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return  e1.name().compareToIgnoreCase(e2.name());
	}
	
}
