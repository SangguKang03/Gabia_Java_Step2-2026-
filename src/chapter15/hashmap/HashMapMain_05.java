package chapter15.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapMain_05 {

	public static void main(String[] args) {

		// HashMap 객체 생성 및 데이터 추가
				Map<String, Integer> inventory = Collections.synchronizedMap(new HashMap<>());

				inventory.put("apple", "red");
				inventory.put("banana", "yellow");
				inventory.put("grape", "purple");
				inventory.put("orange", "orange");

				// HashMap 출력(순서가 보장되지 않음)
				System.out.println("----------------------------HashMap 출력(순서 무작위)------------");
				for (Map.Entry<String, String> entry : inventory.entrySet()) {
					System.out.println(entry.getKey() + ": " + entry.getValue());
				}

				// HashMap 객체 생성 및 데이터 추가
				Map<String, String> linkedhashMap = new LinkedHashMap<String, String>();

				linkedhashMap.put("apple", "red");
				linkedhashMap.put("banana", "yellow");
				linkedhashMap.put("grape", "purple");
				linkedhashMap.put("orange", "orange");

				// HashMap 출력(순서가 보장되지 않음)
				System.out.println("----------------------------linkedhashMap 출력(순서 무작위)------------");
				for (Map.Entry<String, String> entry : linkedhashMap.entrySet()) {
					System.out.println(entry.getKey() + ": " + entry.getValue());
				}
	}

}
