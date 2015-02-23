package project5_123;

public class FlipRace 
{

	public static void main(String[] args) 
	{
		final int GOAL = 3;
		int count1 = 0, count2 = 0;
		Coin1 coin1 = new Coin1();
		Coin1 coin2 = new Coin1();
		
		while (count1 < GOAL && count2 < GOAL)
		{
			coin1.flip();
			coin2.flip();
			
			System.out.println("Coin 1: " + coin1 + "\tCoin 2: " + coin2);
			
			count1 = (coin1.isHeads()) ? count1+1 : 0;
			count2 = (coin2.isHeads()) ? count2+1 : 0;
		}
		
		if(count1 < GOAL)
			System.out.println("Coin 2 Wins!");
		else
		{
			if(count2 < GOAL)
				System.out.println("Coin 1 Wins!");
			else
				System.out.println("It's a TIE!");
		}

	}

}