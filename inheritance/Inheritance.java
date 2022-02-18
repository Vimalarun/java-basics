class KoffeKing
{
	public String getBrandName(){
		return "KoffeKing";
	}
}

class KoffeKingPlus extends KoffeKing
{
	public String getBrandName(){
		return super.getBrandName()+"Plus";
	}
}

public class Inheritance
{
	public static void main(String[] args)
	{
		KoffeKingPlus k = new KoffeKingPlus();
		System.out.print(k.getBrandName());
	}
}
