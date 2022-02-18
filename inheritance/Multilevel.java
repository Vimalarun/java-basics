class First
{
	public void welcomeMsg()
	{
		System.out.print("Welcome ");
	}
}

class Second extends First
{
	public void toMsg()
	{
		System.out.print("to ");
	}
}

class Third extends Second
{
	public void kafeMsg()
	{
		System.out.print("Kafee");
	}
}

class Multiple
{
	public static void main(String[] args)
	{
		Third t = new Third();
		t.welcomeMsg();
		t.toMsg();
		t.kafeMsg();
	}
}