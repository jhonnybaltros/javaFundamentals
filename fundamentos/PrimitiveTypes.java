package fundamentos;

public class PrimitiveTypes {
	public static void main(String[] args) {
		//Informa��o do funcion�rio
		
		
		// Tipos num�ricos inteiros 		
		byte anosDeEmpresa = 23; //� o menor deles usar em numeros pequenos
		short numeroDeVoos = 542; // maior um pouco que o byte
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; //L indica o tipo 
		
		//Tipos num�ricos reais
		float salario = 11_445.44F; // pode usar o _ para facilitar 
		//a vizualiza��o
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false;  //true
			
		//Tipo Caractere
		char status = 'A'; // s� aceita uma letra e precisa do ''
		System.out.println(status);
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//N�mero de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
	
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("F�rias? " + estaDeFerias);
	
	}
}
