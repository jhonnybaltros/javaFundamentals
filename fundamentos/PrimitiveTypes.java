package fundamentos;

public class PrimitiveTypes {
	public static void main(String[] args) {
		//Informação do funcionário
		
		
		// Tipos numéricos inteiros 		
		byte anosDeEmpresa = 23; //é o menor deles usar em numeros pequenos
		short numeroDeVoos = 542; // maior um pouco que o byte
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; //L indica o tipo 
		
		//Tipos numéricos reais
		float salario = 11_445.44F; // pode usar o _ para facilitar 
		//a vizualização
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false;  //true
			
		//Tipo Caractere
		char status = 'A'; // só aceita uma letra e precisa do ''
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
	
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("Férias? " + estaDeFerias);
	
	}
}
