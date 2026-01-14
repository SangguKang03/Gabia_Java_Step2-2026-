package chapter09;

public abstract class NoteBook extends Computer{
	
	// 상속받은 두개의 추상메서드중 하나만 정의할 경루 아직도 추상 클래스로 
	@Override
	public void display() {
		System.out.println("NoteBook Display()");
	}

}
