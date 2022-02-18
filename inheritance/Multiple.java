interface first
{
	int a = 10;
}

interface second
{
	int b = 20;
}

interface three extends first,second
{
	int sum = a+b;
}

class Inheritance implements three
{
	public void printSum(){
		System.out.print("Sum = "+sum);
	}
}

class Multiple
{
	public static void main(String args[])
	{
		Inheritance i = new Inheritance();
		i.printSum();
	}
}