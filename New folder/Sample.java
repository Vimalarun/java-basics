/*
class variable - A variables that belongs to class rather than instance 
and it is qualified using the keyword static

class method - A method that belongs to class rather than an instance.It is qualified with static keyword.

Constructor - constructor in java is invoked when an object was created.It is similar to method but witout return type.
By default all classes will have a default no argument constructor.2 types of constructor(no argument,parametarized)

Instance variable -  A variable that belongs to particular object.

Instance method - A method that belongs to particular object.
*/
//Example
public class Sample
{
	public static String name = "Vimal";//class variable
	
	int number;							//instance variable

	public static void sayWelcome()     //class method
	{
		System.out.println("Welcome");
	}

	public void changeNumber(int value)	//instance method
	{
		number = value;
	}

	Sample() //default constructor
	{
		System.out.println("Constructor called");
	}

	Sample(String para) //parameterized constructor
	{
		System.out.print(para+" called");
	}

	public static void main(String args[])//main method
	{
		System.out.println("Hello"+Sample.name);
		Sample.sayWelcome();
		Sample s1 = new Sample();
		Sample s2 = new Sample("Parameterized");
		Sample s3 = new Sample();
		s3.number = 7;
		Sample s4 = new Sample();
		s4.changeNumber(12);
	}





}