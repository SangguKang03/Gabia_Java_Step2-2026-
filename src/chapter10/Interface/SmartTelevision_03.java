package chapter10.Interface;
	
public class SmartTelevision_03 {
	public static void main(String[] args) {
	
		SmartTelevision sma = new SmartTelevision();
		
		sma.turnOn();
		sma.setVolume(10);
		sma.search("www.naver.com");
		System.out.println();
		
		// Remote 클래스에 정의 되어 있는 메서드만 오버라이딩된 메소드 대입
		Remote rc = sma;
		rc.turnOn();
		rc.setVolume(-7);
		rc.turnOff();
		// rc.searh();
		System.out.println();
		
		
		Searchable sea  = sma;
		sea.search("google");
	
		}
}
