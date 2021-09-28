package exercises.javageo;

public class Circle extends Shape {
	
	protected double r;
	
	Circle(double radius) {
		r = radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(1,  2);
	}
}
