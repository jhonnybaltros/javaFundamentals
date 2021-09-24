package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5; // declaration and inicialization
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
	/*por inferência o java consegue
	 * entender o tipo da variável que está
	 * sendo criada
	 * */
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		
		// porém não se pode declarar um inteiro e tentar adicinar um double
		// na variável, os TIPOS tem que serem respeitados.
	}
}
