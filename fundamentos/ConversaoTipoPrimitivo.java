package fundamentos;

public class ConversaoTipoPrimitivo {
	public static void main(String[] args) {
		double a = 1; //convers�o impl�cita
		System.out.println(a);
		
		float b = (float) 1.0; // esse tipo diz pro java 
		//que pode fazer a convers�o 
		System.out.println(b);
		
		int c = 4; //int suporta 4x mais em tamanho
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f);
	}
}
