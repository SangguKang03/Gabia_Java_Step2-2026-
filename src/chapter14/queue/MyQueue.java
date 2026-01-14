package chapter14.queue;  
// 이 클래스가 chapter14.queue 폴더에 속한다는 뜻
// 같은 패키지에 있는 클래스들이 서로 쉽게 사용할 수 있게 하기 위해 필요함

import java.util.LinkedList;  
// 우리가 직접 큐를 처음부터 만들기 귀찮기 때문에
// 자바가 이미 만들어 놓은 LinkedList를 빌려서 사용함
// LinkedList는 앞에서 빼고, 뒤에 넣기가 쉬워서 Queue에 딱 맞음

public class MyQueue {
    // MyQueue라는 이름으로 "큐" 기능을 가진 클래스를 만들기 위해 선언

    private LinkedList<String> queue = new LinkedList<String>();
    // 실제로 데이터가 저장될 공간
    // Queue는 직접 눈에 보이는 구조가 없기 때문에
    // 내부적으로 LinkedList를 사용해서 줄 서는 공간을 만들어 줌
    // String만 저장하도록 한 이유는 이 예제에서 문자만 다루기 때문

    public void enQueue(String data) {
        // 큐에 데이터를 넣기 위한 기능
        // Main에서 queue.enQueue("A") 같은 식으로 쓰기 위해 필요함
        
        queue.add(data);
        // add는 LinkedList의 맨 뒤에 데이터를 추가함
        // 큐는 "뒤에 넣기" 구조이므로 add를 사용
    }

    public String deQueue() {
        // 큐에서 데이터를 하나 꺼내기 위한 기능
        // Main에서 queue.deQueue()를 쓰기 위해 반드시 필요함
    	
    	/*
    		public String deQueue(){
    		int len = arrayQueue.size();
    	* if(len == 0){
    	* System.out.println("큐가 비어 있습니다.")
    	* return null;
    	* }
    	* return (arrayQueue.remove(0));
    	*/
    	
    	
        if(queue.isEmpty()) {
            // 만약 큐 안에 아무것도 없는데 꺼내려고 하면
            // 프로그램이 에러 날 수 있으므로 미리 검사함
            
            return "큐가 비어있음";
            // 에러 대신 사람이 이해할 수 있는 메시지를 돌려줌
        }

        return queue.removeFirst();
        // 큐는 맨 앞에 있는 것이 가장 오래된 데이터이므로
        // removeFirst()로 맨 앞 데이터를 꺼내는 것이 FIFO 규칙에 맞음
    }

    @Override
    public String toString() {
        // System.out.println(queue); 했을 때
        // queue 안에 뭐가 들어있는지 보기 좋게 출력하기 위해 필요함

        return "MyQueue [queue=" + queue + "]";
        // 현재 큐에 들어있는 모든 데이터를 문자열로 만들어 반환
    }
}
