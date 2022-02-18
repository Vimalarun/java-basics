class Calculator
{
	public static class Distance
	{
		private int x1,x2,y1,y2;
		
		public Distance(int x1,int y1,int x2,int y2)
		{
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}

		public double calculate()
		{
			return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		}
	}
}

public class Nested{
	public static void main(String[] args)
	{
		Calculator.Distance d = new Calculator.Distance(1,1,2,2);
		System.out.println(d.calculate());
	}
}