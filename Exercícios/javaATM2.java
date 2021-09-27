package Exercícios;

public class javaATM2 {
	public static void main(String[] args) {
		
		int amount = 53;
		
		int[] billValues = {100, 50,  20 , 10 , 5 , 2};
		
		int[] numberOfBills = getBillDistribution(amount, billValues);
		printOutput(amount, billValues, numberOfBills);
	}

	public static void printOutput(int amount, int[] billValues, int[] numberOfBills) {
		System.out.println("Dividing $ " + amount + " into $100 "
				+ "$ 50, $ 20, $ 10, $ 5, and $ 2 dollar bills"	);
		
		for (int i = 0; i < numberOfBills.length; i++) {
			System.out.println("Bills of " + billValues[i] + ": "
					+ numberOfBills[i]);
		}
	};
	
	public static int[] getBillDistribution (int amount, int[] billValues) {
		int [] numberOfBills = new int[billValues.length];
		
		for (int i = 0; i< numberOfBills.length; i++) {
			numberOfBills[i] = amount / billValues[i];
			amount %= billValues[i];
		}
		
		return numberOfBills;
	}
}

