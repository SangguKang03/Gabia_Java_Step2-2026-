package chapter09;

public class GameMain_06 {
	
	public static void game(GameCharacter g) {
		g.fight();
	}
	
	public static void main(String[] args) {
		
		System.out.println("====마법사 전투====");
		game(new Mage());
		System.out.println();
		
		System.out.println("====전사 전투====");
		game(new Warrior());
		
		/*System.out.println("====전사 전투====");
		GameCharacter warrir = new Warrior();
		warrir.fight();
		System.out.println("\n====마법사 전투====");
		GameCharacter wizard = new Wizard();
	wizard.fight();
		*/
	}

}
