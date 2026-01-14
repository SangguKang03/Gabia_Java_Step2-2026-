package chapter08;

import java.util.Scanner;

public class Example_03 {
	
	public static int useSkill(Character ch, int pow) {
		return ch.attack(pow);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("기본 공격력을 입력하세요: ");
		int a = scan.nextInt();
		
		
		System.out.println("마법사 스킬: " + useSkill(new Mage(), a));
		System.out.println("전사의 스탯: " + useSkill(new Warrior(), a));
		

	}

}
