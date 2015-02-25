package pp10;

public class SnakeEyes {

	public static void main(String[] args) 
	{
		final int ROLLS = 500;
		int num1, num2, count = 0;
		
		PairOfDice dice = new PairOfDice();
		
		for(int roll=1; roll <= ROLLS; roll++)
		{
			num1 = dice.rollD1();
			num2 = dice.rollD2();
			
			
			if (dice.rollD1() == dice.rollD2())
				count++;
		}
		System.out.println("Number of rolls: " +ROLLS);
		System.out.println("Number of snake eyes: " +count);
		System.out.println("Ratio: " + (float)count/ROLLS);
		

	}

}
