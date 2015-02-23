package chapter_projects;

import java.util.Scanner;

public class PigTwo 
{
	//------------------------------------------------------------//
	// Methods found in the class "PigMethods".                   //                       
	//------------------------------------------------------------//
	public static void main(String[] args) 
	{
		PigMethods game1 = new PigMethods();
		Scanner scan = new Scanner(System.in);
		String startGame = "y";
		String rollDice = "y";
		
		System.out.println("Would you like to play a game of Pig? (y/n)");
		startGame = scan.nextLine();
		
		while (startGame.equalsIgnoreCase("y"))
		{	
			while (rollDice.equalsIgnoreCase("y"))
			{
				game1.yourTurn();
				System.out.println("Roll the dice? (y/n)");
				rollDice = scan.nextLine();
			}
			
			game1.computerTurn();
			System.out.println("Roll the dice? (y/n)");
			rollDice = scan.nextLine();
		}
	
		scan.close();
	}

}
