package PP5_11;

import java.util.LinkedList;
import java.util.Scanner;

public class Pig 
{
	PairOfDice computer = new PairOfDice();
	PairOfDice player = new PairOfDice();
	Scanner scan=new Scanner(System.in);
	static boolean playerTurn=false;
	static boolean computerTurn=false;
	static int accumulativeComputerPoints=0;
	static int accumulativePlayerPoints=0;
	static int tempComputerPoints=0;
	static int tempPlayerPoints=0;
	static int roundNum=1;
	static int numTimesStringRun=0;
	static LinkedList<Integer> computerPointArray=new LinkedList<Integer>();
	static LinkedList<Integer> playerPointArray=new LinkedList<Integer>();
	static String keepRolling;
	static int i=0;
	public void seeWhoGoesFirst()
	{
		System.out.println("Roll dice to see who goes first.");
		System.out.println("After each roll you must press 'y' to keep rolling or press anything else to turn the dice over.");
		
		while(computer.sumOfRoll()==player.sumOfRoll())
		{
			computer.rollBoth();
			player.rollBoth();
		}
		if(computer.sumOfRoll()>player.sumOfRoll())
		{
			System.out.println("The computer goes first.");
			computerTurn=true;
		}
		else
		{
			System.out.println("The player goes first.");
			playerTurn=true;
		}
	}
	public void computerRoll()
	{
		System.out.println("The computer is rolling now");
		while(tempComputerPoints<20 &&computerTurn!=false)
		{
			computer.rollBoth();
			if(computer.sumOfRoll()==2)
			{
				tempComputerPoints=25;
				accumulativeComputerPoints=0;
			}
			else if(computer.getDie1Val()==1)
			{
				tempComputerPoints=25;
			}
			else if(computer.getDie2Val()==1)
			{
				tempComputerPoints=25;
			}
			else
			{
				tempComputerPoints+=computer.sumOfRoll();
				accumulativeComputerPoints+=computer.sumOfRoll();
			}
		}
		System.out.println("The computer's has "+accumulativeComputerPoints+" points");
		computerPointArray.addLast(accumulativeComputerPoints);
		tempComputerPoints=0;
		computerTurn=false;
		playerTurn=true;
	}
	public void playerRoll()
	{
		do
		{
			player.rollBoth();
			if(player.sumOfRoll()==2)
			{
				tempPlayerPoints=25;
				accumulativePlayerPoints=0;
			}
			else if(player.getDie1Val()==1)
			{
				tempPlayerPoints=25;
			}
			else if(player.getDie2Val()==1)
			{
				tempPlayerPoints=25;
			}
			else
			{
				tempPlayerPoints+=player.sumOfRoll();
				accumulativePlayerPoints+=player.sumOfRoll();
			}
			System.out.println("This roll you rolled "+ player.sumOfRoll()+" if you would like to roll again press 'y'");
			keepRolling = scan.nextLine();
		}while(tempPlayerPoints<20 &&playerTurn!=false&&keepRolling.equalsIgnoreCase("y"));
		System.out.println("Your round is over, your total score is "+accumulativePlayerPoints);
		playerPointArray.addLast(accumulativePlayerPoints);
		tempPlayerPoints=0;
		computerTurn=true;
		playerTurn=false;
	}
	public void getResults()
	{
		if(numTimesStringRun==0)
		{
			System.out.println("         |Computer Points|Player Points");
			numTimesStringRun++;
		}
		else if(numTimesStringRun==1)
		{ 
			System.out.println("---------|---------------|---------");
			numTimesStringRun++;
		}
		else if(numTimesStringRun==2)
		{
			do
			{
				if(roundNum<=9&&computerPointArray.get(i)<=9)
				{
				System.out.println("Round "+roundNum+"  |       "+computerPointArray.get(i)+"       |      "+playerPointArray.get(i));
				}
				else if(roundNum<=9&&computerPointArray.get(i)<=99)
				{
				System.out.println("Round "+roundNum+"  |       "+computerPointArray.get(i)+"      |      "+playerPointArray.get(i));
				}
				else if(roundNum<=9&&computerPointArray.get(i)<=999)
				{
				System.out.println("Round "+roundNum+"  |       "+computerPointArray.get(i)+"     |      "+playerPointArray.get(i));
				}
				else if(roundNum<=99&&computerPointArray.get(i)<=9)
				{
				System.out.println("Round "+roundNum+" |       "+computerPointArray.get(i)+"       |      "+playerPointArray.get(i));
				}
				else if(roundNum<=99&&computerPointArray.get(i)<=99)
				{
				System.out.println("Round "+roundNum+" |       "+computerPointArray.get(i)+"      |      "+playerPointArray.get(i));
				}
				else if(roundNum<=99&&computerPointArray.get(i)<=999)
				{
				System.out.println("Round "+roundNum+" |       "+computerPointArray.get(i)+"     |      "+playerPointArray.get(i));
				}
				roundNum++;
				i++;
			}while(i<=computerPointArray.size());
		}
	}
	public void winner()
	{
		if(accumulativeComputerPoints>=100)
		{
			System.out.println("The computer won");
		}	
		if(accumulativePlayerPoints>=100)
		{
			System.out.println("The player won");
		}
	}
	public static void main(String[] args)
	{
		Pig playGame=new Pig();
		playGame.seeWhoGoesFirst();
		while(accumulativeComputerPoints<100&&accumulativePlayerPoints<100)
		{
			if(accumulativePlayerPoints<=100)
			{
			playGame.computerRoll();
			}
			if(accumulativeComputerPoints<=100)
			{
			playGame.playerRoll();
			}
		}
		System.out.println("Outputting scoreboard.");
		playGame.getResults();
		playGame.getResults();
		try
		{
			playGame.getResults();
		}
		catch(IndexOutOfBoundsException e)
		{
			
		}
		finally
		{
			if(roundNum<=9&&accumulativeComputerPoints<=9)
			{
			System.out.println("Round "+roundNum+"  |       "+accumulativeComputerPoints+"       |      "+accumulativePlayerPoints);
			}
			else if(roundNum<=9&&accumulativeComputerPoints<=99)
			{
			System.out.println("Round "+roundNum+"  |       "+accumulativeComputerPoints+"      |      "+accumulativePlayerPoints);
			}
			else if(roundNum<=9&&accumulativeComputerPoints<=999)
			{
			System.out.println("Round "+roundNum+"  |       "+accumulativeComputerPoints+"     |      "+accumulativePlayerPoints);
			}
			else if(roundNum<=99&&accumulativeComputerPoints<=9)
			{ 
			System.out.println("Round "+roundNum+" |       "+accumulativeComputerPoints+"       |     "+accumulativePlayerPoints);
			}
			else if(roundNum<=99&&accumulativeComputerPoints<=99)
			{
			System.out.println("Round "+roundNum+" |       "+accumulativeComputerPoints+"      |      "+accumulativePlayerPoints);
			}
			else if(roundNum<=99&&accumulativeComputerPoints<=999)
			{
			System.out.println("Round "+roundNum+" |       "+accumulativeComputerPoints+"     |      "+accumulativePlayerPoints);
			}
		}
		playGame.winner();
	}

}
