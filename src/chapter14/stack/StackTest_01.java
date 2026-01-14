package chapter14.stack;

import java.util.Stack;

public class StackTest_01 {

	public static void main(String[] args) {
		
		Object obj;
		
		Stack<Object> st = new Stack<Object>();
		
		if(st.empty()) {// empty(): Stack이 비어 있으면 true, 안 비어 있으면 false를 반환하는 메서드
		    // 즉, 지금 스택에 아무 데이터도 없는지 확인하는 용도
			for(int i=0; i<3;i++) {
				st.push(new String("Hi" + i));// push(): Stack에 데이터를 넣는 메서드 (위에서 차곡차곡 쌓임)
				System.out.println("입력 " + i + "번째: " + st.peek()); //peek는 현재 위치를 보여줄때 쓰인다
			}
		}//if
		
		
		//하나 출력
		System.out.println();
		System.out.println("현재 출력 데이터: " + st.pop());
		System.out.println("현재 Top의 위치(peek): " + st.peek());
		System.out.println();
		System.out.println("현재 출력 데이터: " + st.pop());
		System.out.println("현재 Top의 위치(peek): " + st.peek());
		st.push(new String("everybody"));
		System.out.println("현재 Top의 위치(peek): " + st.peek());
		System.out.println();
		st.push(new String("Happy Day"));
		System.out.println("현재 Top의 위치(peek)");

	}

}
