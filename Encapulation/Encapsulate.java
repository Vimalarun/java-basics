class Encaps
{
	private String name;
	private int id_no=0;
	Encaps(String name,int id_no)
	{
		this.name = name;
		this.id_no = id_no;
	}
	int getId()
	{
		return id_no;
	}
	String getName(){
		return name;
	}
}

class Encapsulate
{
	public static void main(String[] args) {
		Encaps e1 = new Encaps("John",1);
		Encaps e2 = new Encaps("Sam",2);
		System.out.println("IdNo = "+e1.getId()+" "+"Name = "+e1.getName());
		System.out.println("IdNo = "+e2.getId()+" "+"Name = "+e2.getName());
	}
}