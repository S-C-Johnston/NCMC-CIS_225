public void printTicket()
{
	int amountLeftToPay = (price - balance);
	if(0 >= amountLeftToPay) {
		// Simulate the printing of a ticket.
		// Update the total collected with the price.
		total = total + price;
		// Reduce the balance by the price.
		balance = balance - price;
	}
	else {
		System.out.println("You must insert at least: " +
				amountLeftToPay + " more cents.");

	}
}
