package project5_10;

public class PairOfDice
{
		public Die die1 = new Die();
		public Die die2 = new Die();
		
		public int sum, firstDie, secondDie;
		
		public int sum()
		{
			firstDie = die1.roll();
			secondDie = die2.roll();
			if(firstDie == 1 && secondDie==1)
				sum = 0;
			
			else if(firstDie == 1 || secondDie==1)
				sum = 1;
				
			else
				sum = firstDie + secondDie;
			
			return sum;
		}

}
