package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("Bom");
		
		System.out.println();// pula a linha
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n"
				, 1, 2 , 3 , 4 , 5, 6); 
		// %n ou \ pra quebrar a linha
		System.out.printf("Salário: %.1f%n", 1234.56778);
		System.out.printf("Nome : %s%n", "João");
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		//System.out.println("Nome = " + nome);
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.println("Digite a sua idade: ");
		String idade = entrada.nextLine();
		
		System.out.printf("%s %s tem %s anos. %n", 
				nome, sobrenome, idade);
		
		entrada.close();
	}
}

