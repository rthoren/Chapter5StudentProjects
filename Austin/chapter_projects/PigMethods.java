package chapter_projects;

public class PigMethods 
{
	
	public int yourScore = 0;
	final public int WIN = 100;
	public int pointsThisTurn = 0;
	public int totalPointsThisTurn = 0;
	public int computerTotalPointsThisTurn = 0;
	public int pointsGained = 0;
	public int computerScore = 0; 
	public boolean turn = true;
	public boolean yourTurn = true;

	public void yourTurn()
	{
		PairOfDice dice = new PairOfDice();
		
		dice.roll();
		
		turn = true;

		if (dice.getFaceValue1() == 1 || dice.getFaceValue2() == 1)
		{
			if (dice.getFaceValue() == 2)
			{
				System.out.println("You rolled snake eyes. You lose all of your points and give the dice to the computer!");
				System.out.println();
				
				yourScore = 0;
			}
			else
			{
				yourScore = yourScore - totalPointsThisTurn;
				
				System.out.println("You rolled a one. You lose the points you gained this turn and give the dice to the computer.");
				System.out.println("Your total score is " + yourScore +".");
				System.out.println();
		
				totalPointsThisTurn = 0;
			}
		}
		else
		{
			pointsThisTurn = dice.getFaceValue();
			yourScore = pointsThisTurn + yourScore;
			totalPointsThisTurn = pointsThisTurn + totalPointsThisTurn;
			
			System.out.println("You rolled " + dice.getFaceValue() + ".");
			System.out.println("Your total score is " + yourScore + ".");
			System.out.println();
			pointsThisTurn = 0;
		}
		
	
	}

	public void computerTurn()
	{
		PairOfDice dice = new PairOfDice();
	
			while (computerTotalPointsThisTurn <= 20 && turn == true)
			{
				dice.roll();
				
				if (dice.getFaceValue1() == 1 || dice.getFaceValue2() == 1)
				{
					if (dice.getFaceValue() == 2)
					{
						System.out.println("The computer rolled snake eyes. They lose all of their points and give you the dice.");
						System.out.println();
						
						computerScore = 0;
						turn = false;
					}
					else
					{
						computerScore = computerScore - computerTotalPointsThisTurn;
						
						System.out.println("The computer rolled a one. They lose the points they gained this turn and give you the dice.");
						System.out.println("Their total score is " + computerScore +".");
						System.out.println();
						
						pointsGained = 0;
						turn = false;
					}
				}
				else
				{
					pointsGained = dice.getFaceValue();
					computerScore = pointsGained + computerScore;
					computerTotalPointsThisTurn = pointsGained + computerTotalPointsThisTurn;
					
					System.out.println("They rolled " + dice.getFaceValue() + ". They have " + computerTotalPointsThisTurn + " points this round.");
					System.out.println("Their total score is " + computerScore + ".");
					System.out.println();
					
					if (computerScore >= WIN)
					{
						System.out.println("The computer wins.");
						turn = false;
					}
				
				}
			}
			
			computerTotalPointsThisTurn = 0;
			System.out.println("The computer gives you the dice");
			System.out.println();
		}


}

