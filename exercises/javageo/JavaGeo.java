package exercises.javageo;

public class JavaGeo {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		
		shapes[0] = new Circle(2);
		shapes[0].setColor("Blue");
		
		shapes[1] = new Square(2);
		shapes[1].setColor("black");
		
		for (Shape s:shapes) {
			System.out.println("Color: " + s.getColor() + " Area " + s.getArea());
		}
		
	}
}

