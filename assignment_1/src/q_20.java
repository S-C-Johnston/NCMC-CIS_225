//In global
{
	private Person schmuck;
}

//In Picture() constructor
{
	schmuck = new Person();
}

//In draw() method
{
	schmuck.moveHorizontal(200);
}

//In oDarkThirty() method
{
	sun.slowMoveVertical(400);
	//Order is important, here
	schmuck.slowMoveHorizontal(200);
}
