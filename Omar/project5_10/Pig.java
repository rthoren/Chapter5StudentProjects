package project5_10;
import java.util.Scanner;

public class Pig {

	public static void main(String[] args) 
	{
		System.out.println("Let's Play a game of PIG!\n");
		PairOfDice user = new PairOfDice();
		PairOfDice cpu = new PairOfDice();
		String userRoll = "y";
		
		int currentSumU, currentSumCPU, totalUser=0, totalCPU=0;
		
		int count = 1;
		while(totalUser < 100 && totalCPU < 100)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Do you want to roll the die this turn? (y/n)");
			userRoll = scan.next();
			
			System.out.println("Roll " + count + ":");
			currentSumU = user.sum();
			currentSumCPU = cpu.sum();	
			
			if(userRoll.equalsIgnoreCase("y"))
			{
				if(currentSumU == 0)
				{
					System.out.println("You rolled a two 1's, your points have been reset to zero.");
					totalUser *= 0;
				}
				
				else if(currentSumU == 1)
				{
					System.out.println("You rolled a one, your turn has been skipped.");
					totalUser *= 1;
				}
				
				else
				{
					System.out.println("You rolled a combined value of " + currentSumU);
					totalUser += currentSumU;
				}
			}
				
			if(currentSumCPU == 0)
			{
				System.out.println("Your opponent has rolled two 1's, your opponent's points have been reset to zero.\n");
				totalCPU *= 0;
			}
			
			else if(currentSumCPU == 1)
			{
				System.out.println("Your opponent rolled a one, his turn has been skipped.\n");
				totalCPU *= 1;
			}
			
			else
			{
				System.out.println("Your opponent rolled a combined value of " + currentSumCPU + "\n");
				totalCPU += currentSumCPU;
			}
			System.out.println("Current Score\nUser: " + totalUser + "\nOpponent: " + totalCPU + "\n");
			
			count++;	
		}
		
		if(totalUser >= 100)
			System.out.println("Congratulations, you won!");
		else if (totalCPU >= 100)
			System.out.println("You lost, you are a PIG.");
		

	}

}
