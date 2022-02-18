class Aircraft
{
	public void land()
	{
		System.out.println("Landing");
	}
}

class Helicop extends Aircraft
{
	@Override
	public void land()
	{
		System.out.println("Helicopter landing");
	}
}

class Overriding
{
	public static void main(String[] args) {
		Aircraft a = new Aircraft();//Runtime polymorphism
		a.land();
	}
}