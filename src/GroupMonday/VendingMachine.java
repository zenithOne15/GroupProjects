package GroupMonday;

public class VendingMachine {

	int change;
	int dollar = 100;
	int quarters;
	int dime;
	int nickel;
	int price;
	int leftCents;
	int leftCents2;

	public void getChange(int price) {

		change = dollar - price;
		quarters = change / 25;
		leftCents = change % 25;
		dime = leftCents / 10;
		leftCents2 = leftCents % 10;
		nickel = leftCents2 / 5;

		System.out.println("Your change is " + quarters + " quarters " + dime + " dime " + nickel + " nickel");

	}
}
