package exercises.javageo;

public abstract class Shape {
	String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public abstract double getArea();
}
