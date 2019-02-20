public void printTicket()
{
	if(balance >= price) {
		// Simulate the printing of a ticket.
		System.out.println("##################");
		System.out.println("# The BlueJ Line");
		System.out.println("# Ticket");
		System.out.println("# " + price + " cents.");
		System.out.println("##################");
		System.out.println();

		// Update the total collected with the price.
		total = total + price;
		// Reduce the balance by the price.
		balance = balance - price;
	}
	else {
		System.out.println("You must insert at least: " +
				(price - balance) + " more cents.");

	}
}
