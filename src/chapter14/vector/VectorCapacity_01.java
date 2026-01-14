package chapter14.vector;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;
import java.util.List;

public class VectorCapacity_01 {

	public static void main(String[] args) {
		// Vector 방식: 동기화 즉 멀티스레드에서 사용
		// 최근에는 ArrayList를 기본으로 사용하고 synchronizedList를 추가하여 사용
		// List<String> sysList = Collections.synchronizedList(new ArrayList<>());

		// 구버전(기본용량 10)
		Vector<String> vector = new Vector<String>();

		System.out.println("----------크기----------");
		System.out.println("초기 크기: " + vector.size()); // 현재 들어있는 실제 데이터 개수
		System.out.println("초기 용량: " + vector.capacity());// 메모리에 확보된 저장 공간의 크기

		// 데이터 추가
		vector.add("Apple");
		vector.add("Banana");
		vector.add("Cherry");

		System.out.println("----------데이터 3개 증가 후 크기----------");
		System.out.println("초기 크기: " + vector.size()); // 현재 들어있는 실제 데이터 개수
		System.out.println("초기 용량: " + vector.capacity());// 메모리에 확보된 저장 공간의 크기

		// 10개이상의 데이터 추가
		for (int i = 0; i < 8; i++) {
			vector.add("Fruit" + (i + 1));
		}

		// 용량 초과 시 기존 크기 2배 증가
		System.out.println("------------데이터 11개 증가 후 크기------------");
		System.out.println("초기 크기: " + vector.size());
		System.out.println("초기 용량: " + vector.capacity());

	}

}
