package chapter14.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_01 {

	public static void main(String[] args) {
		
		
		ArrayList<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime1;
		long endTime1;
		
		//ArrayList의 작업
		startTime1 = System.nanoTime();
		for(int i=0; i<10000;i++) {
			list1.add(0, String.valueOf(i));//ArrayList
		}
		endTime1 = System.nanoTime();
		
		System.out.println("ArrayList 작업시간: " + (endTime1-startTime1) + "ns");
		System.out.println();
		
		long startTime2;
		long endTime2;
		
		//LinkedListList의 작업
		startTime1 = System.nanoTime(); //실행 시간, 성능 측정
		for(int i=0; i<10000;i++) {
			list2.add(0, String.valueOf(i));//LinkedList
		endTime2 = System.nanoTime();
		
		System.out.println("LinkedList 작업시간: " + (endTime2+startTime2) + "ns");
	}
	}
}



