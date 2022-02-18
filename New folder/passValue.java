class PassByValue
{
	void addNum(int no1,int no2)
	{
		no1+=10;
		no2+=10;
	}
	public static void main(String[] args)
	{
		int no1=3,no2=4;
		System.out.println(no1);
		System.out.println(no2);
	}
}