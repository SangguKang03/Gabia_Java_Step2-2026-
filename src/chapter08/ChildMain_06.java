package chapter08;

public class ChildMain_06 {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.method1();//부모
		child.method2();//자식
		child.method3();//자식
		System.out.println();
		
		Parent parent1=child;
		parent1.method1();//부모
		parent1.method2();//자식
		System.out.println();
		
		Parent parent2 = new Parent();
		parent2.method1();//부모
		parent2.method2();//부모

	}

}
