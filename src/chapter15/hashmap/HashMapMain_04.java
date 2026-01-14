package chapter15.hashmap;

import java.util.Scanner;

public class HashMapMain_04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("재고를 조회할 상품명을 입력하세요!");
		String product = scan.next();
		
		if(map.conainsKey(product)) {
			System.out.println(product + "의 재고는 : " + map.get(product) + "개 입니다.");
		}else {
			System.out.println("해당 상품은 재고에 없습니다.");
		}
		
	}

}
