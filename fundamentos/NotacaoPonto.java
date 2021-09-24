package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
		s = s.replace("x" , "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia x".replace("x", "Gui")
				.toUpperCase()
				.concat("!!!"); //pra dar certo o metodo do . tem que ser
		System.out.println(y);	//do mesmo tipo
		
		// Tipos primitivos não tem o operador ponto
	}	
}
