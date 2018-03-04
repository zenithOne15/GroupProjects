package GroupMonday;

import java.util.Scanner;

public class RevenueMethod {

	public static void main(String[] args) {

		Revenue Janara = new Revenue();

		Scanner input = new Scanner(System.in);

		System.out.println("What is the price of the good?");
		Janara.price = input.nextDouble();
		System.out.println("What is the total quantity?");
		Janara.quantity = input.nextDouble();

		// double revenueWithDisc=Janara.getRevenue();

		// System.out.println("Revenue with discount is "+revenueWithDisc);

		Janara.getRevenue();

	}

}
