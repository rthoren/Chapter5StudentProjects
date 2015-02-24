package pp11;

public class PairOfDice 
{
	private int value = 1;
	private final int MAX = 6;
	private int faceValueD1;
	private int faceValueD2;
	Die d1 = new Die();
	Die d2 = new Die();
	public int getValueD1()
	{
		return d1.getFaceValue();
	}
	public int getValueD2()
	{
		return d2.getFaceValue();
	}
	
	public int rollD1()
	{
		faceValueD1 = (int) (Math.random() * MAX) +1;
		return faceValueD1;
	}
	public int rollD2()
	{
		faceValueD2 = (int) (Math.random() * MAX) +1;
		return faceValueD2;
	}

}
