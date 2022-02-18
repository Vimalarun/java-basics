/*A class which is defined with abstract is abstract class.It have abstract method and non-abstract method.
 */

abstract class Calci1{
	public void add(){
		System.out.println(20+30);	
	}
	public abstract void sub();

}

class Calci2 extends Calci1{
	public void sub(){
		System.out.println(30-20);
	}
}

public class Main{
	public static void main(String[] args) {
		Calci2 c = new Calci2();
		c.add();
		c.sub();
	}
}