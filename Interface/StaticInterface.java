interface City
{
	static String getCity(){
		return "Chennai";
	}
}
public class StaticInterface{
	public static void main(String[] args) {
		System.out.println(City.getCity());
	}
}