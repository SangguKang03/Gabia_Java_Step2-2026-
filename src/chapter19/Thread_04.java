package chapter19;

class Counter {
	
	private int count = 0;
	
	//synchronized: 공유 자원에 대해 한번에 하나의 스레드만 접근하게 함
	synchronized void increment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
	
}


public class Thread_04 {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		Runnable task =() -> {
			for(int i=0; i<1000;i++) {
				counter.increment();
			}
		};
		
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);
		
		thread1.start();
		thread2.start();
		
		
		
		try {
			thread1.join();// thread1 이 끝날때까지 기다림
			thread2.join();
			
			System.out.println(counter.getCount());
			
		} catch (Exception e) {
			e.getClass().getSimpleName();
		}
	}//main

}
