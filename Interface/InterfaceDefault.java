/*Suppose in an existing project code N classes implements a certain interface.
If we were to add an additional method in theinterface these N classes will not compile.
In that case the method is defined as default method in interface
 */

interface Product{
	double getPrice();
	default int getId(){
		return 1;
	}
}


class Coffee implements Product{
	@Override
	public double getPrice(){
		return 40.00;
	}
}

public class InterfaceDefault
{
	public static void main(String[] args) {
		Coffee c = new Coffee();
		System.out.println(c.getId());
		System.out.println(c.getPrice());
	}
}