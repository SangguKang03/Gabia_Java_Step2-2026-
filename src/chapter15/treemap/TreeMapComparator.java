package chapter15.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapComparator {

	public static void main(String[] args) {
		
		
		//Comparator 사용: key내림차순
		TreeMap<Integer, Integer> scoreMap =  new TreeMap<>(Comparator.reverseOrder()); //reverseOrder 내림차순
		
		scoreMap.put(1003, 85);
		scoreMap.put(1001, 88);
		scoreMap.put(1002, 95);
		
		System.out.println("전체 출력: " + scoreMap);
		
		//TreeMap 메서드
		System.out.println("가장 큰 학생 번호: " + scoreMap.firstKey());
		System.out.println("가장 작은ㅌ` 학생 번호: " + scoreMap.lastKey());
	}

}
