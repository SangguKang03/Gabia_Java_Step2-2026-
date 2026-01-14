package chapter14.queue;

import java.util.*;

public class MessageMain_02 {

	public static void main(String[] args) {
		
		Queue<Message> messageQueue = new LinkedList<Message>();
	
		Message lee = new Message("sendMail", "이호준");
		messageQueue.offer(lee);//qu는 offer가 넣어주는 ㄱ밧이다
		messageQueue.offer(new Message("sendSnS", "서고구"));
		messageQueue.offer(new Message("sendKaKaotalk", "서세구"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll(); // 출력 Queue -> 선입선출
		
		switch(message.command) {
		case "sendMain":{
			System.out.println(message.to + "님에게 메일을 보냈습니다");
			break;
		}
		case "SendSNS":{
			System.out.println(message.to + "님에게 SNS을 보냈습니다");
			break;
		}
		case "sendKaKaotalk":{
			System.out.println(message.to + "님에게 카카오톡을 보냈습니다");
			break;
		}
	
		}//switch
			
		}//while
			
	
	}//class
	

}//main
