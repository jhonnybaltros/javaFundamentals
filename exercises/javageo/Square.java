package exercises.javageo;

public class Square extends Shape {
	
	protected double l;
	
	Square (double sideLength) {
		l = sideLength;
	}
	
	@Override
	public double getArea() {
		return Math.pow(1,  2);
	}
}
