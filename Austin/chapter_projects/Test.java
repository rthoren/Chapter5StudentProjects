package chapter_projects;

public class Test 
{
	public int sumRange(int num1, int num2)
	{
			int rangeSum = 0;
		
			if (num2 < num1)
			System.out.println("Error: the second number is less than the first");
			System.out.println("Range:");
			
			while (num2 >= num1)
			{
				System.out.print(num1 + " ");
				
				rangeSum = num1 + rangeSum;
				
				num1++;
				
			}
			
			System.out.println();
			System.out.println();
			System.out.println("Sum of the integers in the range: ");
			return rangeSum;
		}


public static void main (String[]args)
{
	PairOfDice Dice = new PairOfDice();
	Dice.roll();
	
	System.out.println(Dice.getFaceValue());
	
	
}

}
