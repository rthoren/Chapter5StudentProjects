package PP5_10;

public class SnakeEyes extends PairOfDice
{
	public static int numOfRolls=0;
	public static int numOfSnakeEyes=0;
	double ratio;
	public void roll()
	{
		super.rollBoth();
		if(super.sumOfRoll()==2)
		{
			numOfSnakeEyes++;
			numOfRolls++;
		}
		else
		{
			numOfRolls++;
		}
		
	}
	public double ratio()
	{
		ratio =(double)(numOfRolls)/(numOfSnakeEyes);
		return ratio;
	}
	public static void main(String[]args)
	{
		SnakeEyes snake = new SnakeEyes();
		int x=0;
		while(x<=100)
		{
			snake.roll();
			x++;
		}
		System.out.println(snake.ratio());
	}
}
