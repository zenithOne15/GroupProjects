package groupMonday27;

import java.util.Scanner;

public class TipAPP {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double totalToPay;
		double totalTip;
		double totalPerPerson;
		double tipPerPerson;
		int numberOfPerson;
		int rate;
		double bill;

	

		System.out.println("How was our service? \n please rate from 1 to 5 (1=poor and 5=Excellent!) ");
		rate = input.nextInt();

		System.out.println("Your total bill amount is: " );
		bill=input.nextDouble();
		
		switch (rate) {
		case 5:
			totalToPay = bill + bill * 0.25;
			break;
		case 4:
			totalToPay = bill + bill * 0.20;
			break;
		case 3:
			totalToPay = bill + bill * 0.15;
			break;
		case 2:
			totalToPay = bill + bill * 0.10;
			break;
		case 1:
			totalToPay = bill + bill * 0.25;
			break;
		default:
			System.out.println("Please choose from 1 to 5");
		}
		
		System.out.println("Would you like to split your bill? (yes=1, no=0) ");
		int answer = input.nextInt();

		System.out.println("Please, enter the number of the person you want to split");
		numberOfPerson = input.nextInt();
		
		System.out.println();

		if (answer == 1) {
			
			totalTip=bill*0.25;
			tipPerPerson=totalTip/numberOfPerson;
			
			totalToPay = bill / numberOfPerson;
		} else {
			totalToPay = bill / 1;
		}

		

		//

	}

}
