interface Car
{
	int getMileage();
}

class BrandX implements Car
{
	public int getMileage()
	{
		return 20;
	}
}

public class Interface
{
	public static void main(String[] args) {
		Car c = new BrandX();
		System.out.println(c.getMileage());
	}
}