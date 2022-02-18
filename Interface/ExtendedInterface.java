public class ExtendedInterface
{
	public static void main(String[] args) {
		Ubuntu u = new Ubuntu();
		System.out.println(u.getName());
		System.out.println(u.getPrice());
		System.out.println(u.getVersion());
	}
}

interface Software{
	String getName();
}

interface Product{
	double getPrice();
}

interface OperatingSystem extends Software,Product{
	double getVersion();
}

class Ubuntu implements OperatingSystem{
	public String getName(){
		return "Ubuntu";
	}
	
	public double getPrice(){
		return 0.00;
	}

	public double getVersion(){
		return 18.04;
	}
}