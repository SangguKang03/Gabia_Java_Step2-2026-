package chapter10.Multilnterface;

import java.util.Scanner;

public class SchedulerMain_01 {
	
	public static void rou(Scheduler scheduler) {
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean ro=true;
		
		while (ro) {
			System.out.println();
			System.out.println("R or r : 한명씩 차례로 할당");
			System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println("P or p : 업무 skill 값이 높은 상담원에게 할당");
			System.out.println("S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");
			
		//toUpperCase(): 대소문자 구분하지 않음
		// 방법1(char)
		char input = scan.next().toUpperCase().charAt(0);
		int ch = (int) input;
		
		switch(input) {
		case 'R', 'r':
			rou(new RoundRobin());
		break;
		case 'L', 'l':
			rou(new LeastJob());
		break;
		case 'P','p':
			rou(new PriorityAllocation());
			break;
		case 'S','s':
			System.out.println("프로그램을 종료하겠습니다.");
			ro=false;
			break;
		default:
			System.out.println("지원하지 않는 시스템입니다.");	
		}
	}

	}
}
