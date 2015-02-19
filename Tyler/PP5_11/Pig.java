package PP5_11;

import java.util.Scanner;

public class Pig
{
	PairOfDice player = new PairOfDice();
	PairOfDice computer = new PairOfDice();
	Scanner scan1 = new Scanner(System.in);
	static int computerSumOfRolls=0;
	static int playerSumOfRolls=0;
	static boolean playerFirst=false;
	static boolean computerFirst=false;
	static boolean playerWon=false;
	static boolean computerWon=false;
	static int numOfOutputs=0;
	static int rounds=1;
	static int roundNum=1;
	public void seeWhoGoesFirst()
	{
		int sumPlayer=0;
		int sumComputer=0;
		System.out.println("We will now see who goes first.");
		while(sumPlayer==sumComputer)
		{
			sumPlayer=player.sumOfRoll();
			sumComputer=computer.sumOfRoll();
			if(sumPlayer>sumComputer)
			{
				playerFirst=true;
				System.out.println("Player goes first");
			}
			else if(sumComputer>sumPlayer)
			{
				computerFirst=true;
				System.out.println("Computer goes first");
			}
		}
	}
	public int playerRoll()
	{
			int tempCount=0;
			while(tempCount<=20 && playerFirst==true)
			{
				int rolls= player.sumOfRoll();
				if(rolls==2)
				{
					playerFirst=false;
					playerSumOfRolls-=tempCount;
					return playerSumOfRolls=0;
				}
				else if(player.rollDie1()==1)
				{
					playerFirst=false;
					playerSumOfRolls-=tempCount;
					tempCount=0;
				}
				else if(player.rollDie2()==1)
				{
					playerSumOfRolls-=tempCount;
					playerFirst=false;
					tempCount=0;
				}
				else
				{
					tempCount+=rolls;
					playerSumOfRolls+=rolls;
				}
			}
			if(playerSumOfRolls>=100)
			{
				playerWon=true;
				playerFirst=false;
				computerFirst=false;
			}
			tempCount=0;
			playerFirst=false;
			computerFirst=true;
			return playerSumOfRolls;
	}
	public int computerRoll()
	{
			int tempCount=0;
			while(tempCount<=20 && computerFirst==true)
			{
				int rolls= computer.sumOfRoll();
				if(rolls==2)
				{
					computerSumOfRolls-=tempCount;
					computerFirst=false;
					return computerSumOfRolls=0;
				}
				else if(computer.rollDie1()==1)
				{
					computerFirst=false;
					computerSumOfRolls-=tempCount;
					tempCount=0;
				}
				else if(computer.rollDie2()==1)
				{
					computerFirst=false;
					computerSumOfRolls-=tempCount;
					tempCount=0;
				}
				else
				{
					tempCount+=rolls;
					computerSumOfRolls+=rolls;
				}
			}
			if(computerSumOfRolls>=100)
			{
				computerWon=true;
				playerFirst=false;
				computerFirst=false;
			}
			tempCount=0;
			computerFirst=false;
			playerFirst=true;
			return computerSumOfRolls;
	}
	public String toString()
	{
		String tenSpaces="       ";
		String nothing="Nothing";
		if(numOfOutputs==0)
		{
			System.out.println(tenSpaces+"  |"+"Computer's Points|Player's Points");
			numOfOutputs++;
			rounds++;
		}
		else if(numOfOutputs==1)
		{
			System.out.println("---------|-----------------|---------------");
			numOfOutputs++;
			rounds++;
		}
		else if(numOfOutputs==2)
		{
			if(rounds<10)
			{
				if(computerSumOfRolls<10)
				{
					System.out.println("Round "+roundNum+"  |      "+computerSumOfRolls+"          |        "+playerSumOfRolls);
				}
				else if (computerSumOfRolls<100 && computerSumOfRolls>9)
				{
					System.out.println("Round "+roundNum+"  |      "+computerSumOfRolls+"         |        "+playerSumOfRolls);
				}
			}
			else if(rounds<100&& rounds>9)
			{ 
				if(computerSumOfRolls<10)
				{
					System.out.println("Round "+roundNum+" |      "+computerSumOfRolls+"          |        "+playerSumOfRolls);
				}
				else if (computerSumOfRolls<100 && computerSumOfRolls>9)
				{
					System.out.println("Round "+roundNum+" |      "+computerSumOfRolls+"         |        "+playerSumOfRolls);

				}
			}
			else
			{
				if(computerSumOfRolls<10)
				{
					System.out.println("Round "+roundNum+"|      "+computerSumOfRolls+"        |        "+playerSumOfRolls);
				}
				else if (computerSumOfRolls<100 && computerSumOfRolls>9)
				{
					System.out.println("Round "+roundNum+" |      "+computerSumOfRolls+"        |        "+playerSumOfRolls);

				}

			}
			rounds++;
		}
		if(playerWon==true)
		{
			System.out.println("You won!");
		}
		if(computerWon==true)
		{
			System.out.println("The computer won!");
		}
		roundNum++;
		return nothing;
		
	}
	public static void main(String[]args)
	{
		Pig pigPlay= new Pig();
		pigPlay.seeWhoGoesFirst();
		do
		{
			pigPlay.toString();
			pigPlay.computerRoll();
			pigPlay.playerRoll();
			
		}while(computerWon!=true && playerWon!=true);
	}
	
	
}
