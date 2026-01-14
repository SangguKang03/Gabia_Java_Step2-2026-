package chapter12.clone;

public class Circle implements Cloneable{
	
	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		
		point = new Point(x, y);
		this.radius = radius;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + "]";
	}

}
