package project5_123;
import java.util.Scanner;

public class CountFlips 
{

	public static void main(String[] args) 
	{
		final int FLIPS = 1000;
		int heads = 0, tails = 0;
		
		Coin3 myCoin = new Coin3();
		
		for (int count=1; count <= FLIPS; count++)
		{
			myCoin.flip();
			
			if (myCoin.isHeads())
				heads++;
			else
				tails++;
		}
		
		System.out.println("Number of flips " + FLIPS);
		System.out.println("Number of heads: " + heads);
		System.out.println("Number of tails: " + tails);

	}

}
