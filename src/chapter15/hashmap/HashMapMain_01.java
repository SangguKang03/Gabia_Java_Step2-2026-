package chapter15.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain_01 {

	public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("류태희", 10);
		map.put("서효근", 5);
		map.put("강상구", 100);
		map.put("고경수", 1);
		System.out.println("총 Entry 수: " + map.size());
		
		
		// 객체 찾기
		System.out.println("\n서효근: " + map.get("서효근"));
		System.out.println();
		
		//객체 키 모두 받기
		Set<String> KeySet = map.keySet();
		//iterator 라는 반복구조로 형변환
		Iterator<String> KeyIterator= KeySet.iterator();
		while(KeyIterator.hasNext()) {
			String key = KeyIterator.next();
			Integer value = map.get(key);
			
			System.out.println("\t" + key + ": " + value);
		}
		
		map.clear();
	}

}
