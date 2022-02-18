class Constructor
{
	int number,number1;
	double number2;
	Constructor(int number)
	{
		this.number = number;
	}
	Constructor(int number1,double number2)
	{
		this(number1);
		this.number1 = number1;
		this.number2 = number2;
	}
}

class Overloaded_constructor
{
	public static void main(String[] args)
	{
		Constructor c = new Constructor(10,10.5);
	}
}