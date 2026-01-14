package chapter14.stack;

import java.util.Stack;

public class CoinMain_03 {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox=new Stack<Coin>();
			
		coinBox.push(new Coin(200000));
		coinBox.push(new Coin(5000000));
		coinBox.push(new Coin(1000000));
		coinBox.push(new Coin(5000));
		coinBox.push(new Coin(300000));
		
		System.out.println(!coinBox.isEmpty());//스택안에 데이터가 비어있는지 물어보는 것 ! 쓸경우 데이터가 비어있지 않니라는 뜻
		
		while(!coinBox.isEmpty()) {
			Coin coin=coinBox.pop();
			System.out.println("꺼내온 돈: " + coin.getValue());
		}

	}

}
