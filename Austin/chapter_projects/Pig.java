package chapter_projects;

import java.util.Scanner;

public class Pig 
{
//---------------------------------------------------------------------------------------//
//	I decided to not use this program and instead use the one in the class "PigTwo".	 //																				 
//																						 //
//---------------------------------------------------------------------------------------//
	public static void main(String[] args) 
	{
		String startGame = "y";
		final int WIN = 100;
		
		int yourScore = 0;       // The scores of the two
		int computerScore = 0;   // players
		
		Scanner scan = new Scanner(System.in);   // Instantiating the scanner
		PairOfDice dice = new PairOfDice();      // and dice objects
		
		System.out.println("Do you want to play a game of Pig? (y/n)");
		startGame = scan.nextLine();
		
		while (startGame.equalsIgnoreCase("Y"))
		{
			while (yourScore <= WIN || computerScore <= WIN)
			{	
				int yourRoll = 0;
				int computerRoll = 0;
				int whoseTurn = 1;   // If it is your turn whoseTurn will equal 1. If it is the computers, it will equal 2.
				
				while (whoseTurn == 1)
				{
					yourRoll = dice.roll();
					String rollAgain = "y";
					
						if (dice.getFaceValue1() == 1 || dice.getFaceValue2() == 1 && dice.getFaceValue() != 2)
						{
							System.out.println("You rolled a 1. Sorry! You lose your points this round and it is now the computers turn.");
							System.out.println();
							
							whoseTurn = 2;
						}
						else
						{
							if (dice.getFaceValue() == 2)
							{
								System.out.println("You rolled snake eyes. Isn't that just too bad. You lose all your points!");
								yourScore = 0;
								whoseTurn = 2;
							}
							else
							{
								while (rollAgain.equalsIgnoreCase("y"))
								{	
									if (dice.getFaceValue1() == 1 || dice.getFaceValue2() == 1 && dice.getFaceValue() != 2)
									{
										System.out.println("You rolled a 1. Sorry! You lose your points this round and it is now the computers turn.");
										System.out.println();
										
										whoseTurn = 2;
										rollAgain = "n";
									}
									else
									{
										if (dice.getFaceValue() == 2)
										{
											System.out.println("You rolled snake eyes. Isn't that just too bad. You lose all your points!");
											yourScore = 0;
											whoseTurn = 2;
										}
									
									
										yourScore = yourRoll + yourScore;
										
										System.out.println("You rolled " + yourRoll +".");
										System.out.println("Your total is " + yourScore + ". Roll again? (y/n)");
										rollAgain = scan.nextLine();
										
										yourRoll = dice.roll();
									}
								}
							}
						}
				}
				
				while (whoseTurn == 2)
				{
					computerRoll = dice.roll();
					int pointsGained = 0;
					
					while (whoseTurn == 2)
					{
						if (dice.getFaceValue1() == 1 || dice.getFaceValue2() == 1 && dice.getFaceValue() != 2)
						{
							System.out.println("The computer rolled a 1. It is now your turn");
							System.out.println();
							whoseTurn = 1;
						}
						else
						{
							if (dice.getFaceValue() == 2)
							{
								System.out.println("The computer rolled snake eyes. They lose all their points. It is now your turn.");
								computerScore = 0;
								whoseTurn = 1;
							}
							else
							{
								while (pointsGained <= 20)
								{
									computerScore = computerRoll + computerScore;
									
									System.out.println("The computer rolled " + computerRoll + ". Their total is " + computerScore + ". They role again.");
									System.out.println();
									
									pointsGained = pointsGained + computerRoll;
									
									computerRoll = dice.roll();
								}
								
								System.out.println("The computer gives you the dice.");
								System.out.println();
								whoseTurn = 1;
							}
						}	
					}
				}
			}		
			
			System.out.println("Play again? (y/n)");
			startGame = scan.nextLine();
		}
		
		scan.close();
	}

}
