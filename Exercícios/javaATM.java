package Exercícios;

public class javaATM {
	public static void main(String[] args) {
		int originalAmount = 1245;
		int amount = originalAmount;
		
		System.out.println("Dividing $ " + originalAmount + " into $100 "
			+ "$ 50, $ 20, $ 10, $ 5, and $ 2 dollar bills"	);
		
		int [] billValues = {100, 50, 20, 10, 5, 2};
		int [] numberOfBills = new int[billValues.length];
		
		for (int i = 0; i < billValues.length; i++) {
			
			numberOfBills[i] = amount / billValues[i];
			amount %= billValues[i];
			
			System.out.println("Bill of " + billValues[i] + ": " +
			numberOfBills[i]);
		}
	}
}
