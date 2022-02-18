class Reference
{
	int a,b;
	Reference(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
}

class PassRefer
{
	public static void addValue(Reference r)
	{
		r.a+=10;
		r.b+=10;
	}

	public static void main(String[] args)
	{
		Reference r = new Reference(3,4);
		addValue(r);
		System.out.println(r.a+" "+r.b);
	}
}