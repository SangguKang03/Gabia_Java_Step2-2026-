package chapter08;

public class DmbCellPhoneMain_07 {

	public static void main(String[] args) {
		
		//11 Java폰 검정
		DmbCellPhone dmbcellphone = new DmbCellPhone("Java폰", "검정", 11);
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(12);
		dmbcellphone.turnOffDmb();
		
		//상속받은 필드
		System.out.println("모델: " + dmbcellphone.model);
		System.out.println("색상: " + dmbcellphone.color);
		
		//자식클래스 필드
		System.out.println("채널: " + dmbcellphone.channel);
		
		//전화통화 구현
		dmbcellphone.powerOn();
		dmbcellphone.powerOff();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("안녕");
		dmbcellphone.receiveVoice("뭐");
		dmbcellphone.hangUp();
	}

}
