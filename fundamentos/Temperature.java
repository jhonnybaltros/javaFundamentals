package fundamentos;

public class Temperature {
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		final double AJUST = 32;
		final double DIVISION = 5/9.0;
		
		double f = 86;
		double c  = (f - AJUST) * DIVISION ;
		
		System.out.println(c);
		
		f = 150;
		c = (f - AJUST) * DIVISION;
		System.out.println("Oresultado é " + c + "C°");
	}
}
