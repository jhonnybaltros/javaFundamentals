package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5; // declaration and inicialization
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
	/*por infer�ncia o java consegue
	 * entender o tipo da vari�vel que est�
	 * sendo criada
	 * */
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		
		// por�m n�o se pode declarar um inteiro e tentar adicinar um double
		// na vari�vel, os TIPOS tem que serem respeitados.
	}
}
