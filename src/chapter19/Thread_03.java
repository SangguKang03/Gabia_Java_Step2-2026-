package chapter19;

class MyThread extends Thread{

	@Override
	public void run() {
		for(int i =0; i< 5; i++) {
			System.out.println("Thread" + Thread.currentThread());
			try {
				Thread.sleep(1000); //1초
			} catch (Exception e) {
				e.printStackTrace();
			}//try
		}
	}
	
	
	
}


public class Thread_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
