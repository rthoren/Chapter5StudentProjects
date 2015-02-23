package PP5_11;
public class PairOfDice
{
	Die die1=new Die();
	Die die2=new Die();
	public int rollDie1()
	{
		return die1.roll();
	}
	public int rollDie2()
	{
		return die2.roll();
	}
	public int sumOfRoll()
	{
		return die1.getFaceValue()+die2.getFaceValue();
	}
	public int getDie1Val()
	{
		return die1.getFaceValue();
	}
	public int getDie2Val()
	{
		return die2.getFaceValue();
	}
	public void setDie1(int value)
	{
		die1.setFaceValue(value);
	}
	public void setDie2(int value)
	{
		die2.setFaceValue(value);
	}
	public void rollBoth()
	{
		rollDie1();
		rollDie2();
	}
	
}
