package chapter12.string;

public class StringObjectMain_02 {

	public static void main(String[] args) {
	
		StringObject v1= new StringObject();
		v1.setVlaue(v1);
		System.out.println(v1.getVlaue());
		System.out.println();
		
		StringObject v2= new StringObject();
		//AutoBoxing
		// Integer v2 = new Integer(100);
		v2.setVlaue(100);
		System.out.println(v2.getVlaue());
		
		
		//----------------------------------
		int i = (int)v2.getVlaue();
		System.out.println(i+2);
	}

}
