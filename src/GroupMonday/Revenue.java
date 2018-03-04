package GroupMonday;

public class Revenue {

	double price;
	double quantity;
	double rate10 = 0.10;
	double rate15 = 0.15;
	double rate0 = 0;
	double revenue;
	double revenueWithDisc;
	double discAmount;

	public void getRevenue() {
		if ((quantity >= 100 && quantity <= 119)) {
			revenue = price * quantity;
			discAmount = revenue * rate10;
			revenueWithDisc = revenue - discAmount;
			// System.out.println("Revenue from this transactions: " + revenue);

		} else if (quantity >= 120) {
			revenue = price * quantity;
			discAmount = revenue * rate15;
			revenueWithDisc = revenue - discAmount;
			// System.out.println("Revenue from this transactions: " + revenue);

		} else {
			revenue = price * quantity;
			discAmount = revenue * rate0;
			revenueWithDisc = revenue - discAmount;
		}
		System.out.println(
				"Revenue from this transactions: " + revenue + "" + " \n Revenue with discount " + revenueWithDisc);
		// return revenueWithDisc;

	}
}
