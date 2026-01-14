package chapter08;

public class InheritanceMain_01 {

	public static void main(String[] args) {
		StrawBerry berry = new StrawBerry();
		
		berry.Set1("berry", "여름");
		berry.Set2("딸기", "중");
		berry.Set3("빨간색", 12000);
		
		berry.Disp1();
		System.out.println("--------------------------");
		berry.Disp2();
		System.out.println("--------------------------");
		berry.Disp3();
		System.out.println("--------------------------");
		
	}

}
