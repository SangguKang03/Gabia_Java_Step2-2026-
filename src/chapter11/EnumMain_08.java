package chapter11;

import java.util.Scanner;

public class EnumMain_08 {
	
	public enum Item{ // final
		Start, pause, Exit // Start:0, Pause:1, Exit:2
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.print("숫자를 입력하세요[0:게임시작, 1:일시정지, 2:게임종료] :  ");
		
		int n = scan.nextInt();// 0,1,2
		
		Item start = Item.Start;//0
		Item pause = Item.pause;//1
		Item exit = Item.Exit;//2
		
		if(n == start.ordinal()) {
			System.out.println("게임을 시작함");
		}else if(n == pause.ordinal()) {
			System.out.println("게임을 일시정지함");
		}else if(n == exit.ordinal()) {
			System.out.println("게임 종료");
			return;
		}else {
			System.out.println("서비스 지원이 없는 번호입니다.");
		}//if
		
		}//while
	}

}
