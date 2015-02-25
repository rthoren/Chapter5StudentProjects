package pp11;
import java.util.Scanner;
public class Methods 
{
	int player;
	int computer;
	int compround;
	int playround;
	boolean turn;
	Scanner scan = new Scanner(System.in);
	public void playerTurn()
	{
		PairOfDice dice = new PairOfDice();
		dice.rollD1();
		dice.rollD2();
		if (dice.rollD1() == 1 || dice.rollD2() == 1)
		{
			System.out.println("You rolled a 1. You lost all your points.");
			computerTurn();
		}
		else
		{
			player = player + dice.rollD1() + dice.rollD2();
			System.out.println("You have " + player+ " points.\n The computer has " +computer + " points.");
		}
		System.out.println("Would you like to turn the dice over to the computer? (True/False)");
		if(scan.nextBoolean() == true)
		{
			computerTurn();
		}
		else
			playerTurn();
	}
	public void computerTurn()
	{
		PairOfDice dice = new PairOfDice();
		dice.rollD1();
		dice.rollD2();
		if (dice.rollD1() == 1 || dice.rollD2() == 1)
		{
			computer = 0;
			playerTurn();
		}
		else
		{
			compround = dice.rollD1() + dice.rollD2();
			System.out.println("You have " + player+ " points.\n The computer has " +computer + " points.");
		}
		if (compround <= 20)
		{
			computer = compround + computer;
			compround = 0;
			playerTurn();
		}
	}
	public void play()
	{
		playerTurn();
	}
	

}
