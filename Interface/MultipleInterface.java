public class MultipleInterface
{
	public static void main(String[] args) {
		Gym g = new Gym();
		System.out.println(g.getTreadMillCount
			());
		System.out.println(g.getDumbbellCount());
	}
}

interface Aerobics
{
	int getTreadMillCount();
}

interface WeightTraining
{
	int getDumbbellCount();
}

class Gym implements Aerobics,WeightTraining
{
	@Override
	public int getTreadMillCount()
	{
		return 10;
	}

	@Override
	public int getDumbbellCount()
	{
		return 50;
	}
}

