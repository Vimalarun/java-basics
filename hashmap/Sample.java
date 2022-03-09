package hashmap;
import hashmap.CustomHashmap;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomHashmap<Integer,String> c = new CustomHashmap<>();
		c.put(1,"John");
		c.put(2, "Jack");
		System.out.println(c.get(2));
	}

}
