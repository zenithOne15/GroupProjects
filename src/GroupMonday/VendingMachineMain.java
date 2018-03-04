package GroupMonday;

import java.util.Scanner;

public class VendingMachineMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("What is the price of the item");
		int price1 = input.nextInt();

		VendingMachine abc = new VendingMachine();

		abc.getChange(abc.price = price1);
	}
}
