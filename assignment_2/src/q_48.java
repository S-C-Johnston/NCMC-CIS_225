public void insertMoney(int amount)
{
	if(0 >= amount) {
		system.out.println("Use a positive amount rather than: "
				+ amount);
	}
	else {
		balance = balance + amount;
	}
} 
