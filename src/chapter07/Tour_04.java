package chapter07;



import java.util.Scanner;

public class Tour_04 {
	
    public static void main(String[] args) {
    	
    	
    
        // ===== 입력을 받기 위한 Scanner 객체 생성 =====
        // 키보드로부터 값을 입력받기 위해 필요
        Scanner scan = new Scanner(System.in);

        // ===== 관광객 수 입력 =====
        // 몇 명의 관광객을 관리할지 먼저 입력받음
        System.out.println("관광객 수: ");
        int n = scan.nextInt();


        // ===== Guide 객체 생성 =====
        // Guide(int n) 생성자가 실행됨
        // → 관광객 수(n)만큼 Guest 배열 생성
        // → 각 배열 칸마다 Guest 객체를 미리 생성
        // ※ 이 작업이 있어야 guest[i] 사용 가능 (null 방지)
        Guide guide = new Guide(n);


        System.out.println();
        System.out.println("관광객 등록: ");
        // 여러 명의 관광객 정보를 입력해야 하므로
        // 같은 작업을 반복하기 위해 for문 사용


        // ===== 관광객 정보 입력 =====
        for(int i = 0; i < n; i++) {

            // 배열은 0번부터 시작하므로
            // i번째 관광객 정보를 입력받음
            System.out.println((i + 1) + "번 관광객 이름입력:");

            // Guest 클래스의 name은 private이므로
            // 직접 접근 불가능 → setter 메서드 사용
            guide.guest[i].setName(scan.next());

            System.out.println((i + 1) + "번 관광객 성별입력:");

            // 마찬가지로 private 변수 gender에 값을 넣기 위해
            // setter 메서드를 사용
            guide.guest[i].setGender(scan.next());
        }


        // ===== 입력된 관광객 정보 출력 =====
        System.out.println();
        System.out.println("=== 관광객 목록 ===");

        // 관광객 수만큼 반복하면서
        // 저장된 정보를 하나씩 출력
        for(int i = 0; i < n; i++) {

            // Guest 클래스의 멤버변수(name, gender)는 private
            // → 직접 접근 불가
            // → getter 메서드를 통해 값만 가져옴
            System.out.println(
                (i + 1) + "번 관광객 : " +
                guide.guest[i].getName() + " / " +
                guide.guest[i].getGender()
            );
        }


        // ===== 목적지 출력 =====
        // point는 static 변수이므로
        // 객체가 아닌 클래스명으로 접근하는 것이 정석
        System.out.println();
        System.out.println("=== 목적지 ===");
        System.out.println("목적지: " + Guide.point);
        System.out.println();
        
        outer:while(true) {
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.print("선택>> ");
			
			int select = scan.nextInt();
			
			switch(select) {
			case 1:
				for(int i = 0; i < n; i++) {
					System.out.println((i+1)+ ". 이름: " + guide.guest[i].getName());
					System.out.println((i+1)+ ". 성별: " + guide.guest[i].getGender());
					System.out.println((i+1)+ ". 목적지: " + Guide.getPoint());
		        }
				break;
			case 2:
				System.out.println("어디로 변경하시겠습니까? ");
				Guide.point=scan.next();
				System.out.println(Guide.point + "로 목적지가 변경되었습니다.");
				System.out.println("---------------------------");
				break;
			case 3:
				System.out.println("종료");
				break outer;
			}//switch
			
		}//while
    }//main
}//class
