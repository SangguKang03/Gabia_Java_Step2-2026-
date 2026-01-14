package chapter08;

import java.util.Scanner;

public class CharacterMain {
	
	public static int ottak(Character ch, int pow) {
		return ch.attack(pow);
	}

	public static void main(String[] args) {
		
		 
		Scanner scan = new Scanner(System.in);
		
		Character[]  charac = { new Mage(), new Warrior()};
		System.out.println("기본 공격력을 입력하세요: ");
		int a = scan.nextInt();
		for(Character cho : charac) {
			System.out.println(cho.getClass().getSimpleName() + " : " + ottak(cho, a));
			System.out.println(cho.getClass().getSimpleName() + " : " + cho.attack(a));
		}
		
		
	}

}
