package chapter07;

import java.util.Scanner;

public class Guide {

    // ===== 멤버 변수(필드) =====

    // 모든 Guide 객체가 공통으로 사용하는 변수
    // 여행 목적지 (static → 클래스 변수)
    static String point;

    // 관광객(Guest) 객체들을 저장하는 배열
    // 아직 배열만 선언된 상태 (메모리 할당은 생성자에서 함)
    Guest[] guest;

    // 입력을 받기 위한 Scanner 객체
    Scanner scan;


    // ===== 생성자 =====

    // 기본 생성자
    // Guide 객체를 만들 때 아무 값도 안 넘기면 이 생성자가 실행됨
    public Guide() {
        // 현재는 아무 작업도 안 함
    }

    // 매개변수가 있는 생성자
    // Guide g = new Guide(5); 처럼 사용할 때 실행됨
    public Guide(int n) {

        // 여행 목적지를 "발리"로 설정
        // static 변수라 모든 Guide 객체가 같은 목적지를 공유
        point = "발리";
        
        //관광객수 만큼 메모리 참조공간 확보
        // 관광객 수(n)만큼 Guest 객체를 담을 배열 생성
        // 예: n이 3이면 Guest[3] 배열 생성
        guest = new Guest[n];
        
        //초기화
        // 배열의 각 칸에 Guest 객체를 하나씩 생성해서 넣어줌
        // ★ 이걸 안 하면 guest[i]는 null 상태라서 에러 발생
        for(int i = 0; i < n; i++) {
            guest[i] = new Guest();
        }
    }
    
    public static String getPoint() {
    	return "발리";
    }

	public static int getPoint() {
		// TODO Auto-generated method stub
		return 0;
	}
}
