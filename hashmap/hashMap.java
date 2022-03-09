package hashmap;
import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> empDet = new HashMap<>();
		empDet.put(1, "John");
		empDet.put(2, "jack");
		empDet.put(3, "Nick");
		System.out.print(empDet);
		System.out.print(empDet.containsKey(2));
		System.out.print(empDet.containsValue(3));
	}

}
