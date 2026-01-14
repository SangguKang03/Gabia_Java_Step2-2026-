package chapter08;

public class CompanyMain_09 {

	public static void main(String[] args) {
		
		// Employee 객체 생성후 메서드 사용
		Employee emp = new Employee("류태희", 10);
		emp.work();
		emp.getInfo();
		
		// Manager 객체 생성후 메서드 사용
		Manager man = new Manager("강상구", 123, "아니여");
		man.work();
		man.approveLeave("강상구");
		
		// 상속개념이 보이게 객체 생성후 메서드 사용
		Employee man2 = new Manager("서효근", 1, "뭐여");
		man2.work();
		man2.getInfo();
	}

}
