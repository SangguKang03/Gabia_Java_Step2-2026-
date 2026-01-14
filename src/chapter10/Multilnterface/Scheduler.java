package chapter10.Multilnterface;

public interface Scheduler {

	// 다음 고객의 곧 가져오기
	public void getNextCall();
	
	// 상담원에게 콜 전달
	public void sendCallToAgent();
}
