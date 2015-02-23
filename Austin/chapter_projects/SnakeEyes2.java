package chapter_projects;

public class SnakeEyes2 
{

	public static void main(String[] args) 
	{	
		final int ROLLS = 500;
		int count = 0;
		
		PairOfDice dice = new PairOfDice();
		
		for (int roll = 1; roll <= ROLLS; roll++)
		{
			dice.roll();
			
			if (dice.getFaceValue() == 2)
			{
				count++;
			}
		}
		
		System.out.println("Number of rolls: " + ROLLS);
		System.out.println("Number of snake eyes: " + count);
		System.out.println("Ratio: " + (float)count / ROLLS);
	}

}
