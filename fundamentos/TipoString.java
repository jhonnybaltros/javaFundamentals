package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Hi people".charAt(0));
		
		String s = "Good afternon";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Good"));
		System.out.println(s.toLowerCase().startsWith("good"));
		System.out.println(s.toUpperCase().endsWith("AFTERNON"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("good afternon"));
		System.out.println(s.equalsIgnoreCase("good afternon"));
	
		var name = "Pedro";
		var sobrenome = "Santos";
		var idade = "33";
		var salario = "12345.987";
		
		System.out.println("Nome: " + name + "\nSobrenome: "
				+ sobrenome + "\nIdade " + idade + 
				"\nSalario: " + salario);
		
		System.out.printf("O senhor: %s %s tem %d anos e ganha R%.2f."
				, name, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor: %s %s tem %d anos e ganha %.2f. "
				, name, sobrenome, idade, salario);
		System.out.printf(frase);
	}
}
