class People
{
	String name;
	int age;
	String gender;
	People(String name,int age,String gender){
		this.name = name;
		this.age  = age;
		this.gender = gender;
	}
	void getDetails(){
		System.out.println("Name="+this.name);
		System.out.println("Age="+this.age);
		System.out.println("Age="+this.gender);
	}
}

class Male extends People
{
	Male(String name,int age)
	{
		super(name,age,"Male");
	}
}

class Female extends People
{
	Female(String name,int age)
	{
		super(name,age,"Female");
	}
}

class sample{
	public static void main(String[] args) {
		Male m = new Male("John",20);
		m.getDetails();
		Female f = new Female("Jane",20);
		f.getDetails();

	}
}