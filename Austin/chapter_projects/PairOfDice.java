package chapter_projects;

public class PairOfDice 
{
	private final int MAX = 6;
	private int faceValue1, faceValue2;
	
	
	//------------------------------------------------------------------------------//
	// Sets the starting value of each dice to 1                                    // 
	//------------------------------------------------------------------------------//
	public PairOfDice()
	{
		faceValue1 = 1;
		faceValue2 = 1;
	}
	
	//------------------------------------------------------------------------------//
	// Rolls both dice and returns the value of the two added together              //
	//------------------------------------------------------------------------------//
	public int roll()
	{
		faceValue1 = (int) (Math.random() * MAX) + 1;
		faceValue2 = (int) (Math.random() * MAX) + 1;
		
		return faceValue1 + faceValue2;
	}
	
	//------------------------------------------------------------------------------//
	// Returns the value of the two dice added together                             //
	//------------------------------------------------------------------------------//
	public int getFaceValue()
	{
		return faceValue1 + faceValue2;
	}
	
	//------------------------------------------------------------------------------//
	// Returns the value of the first dice                                          //
	//------------------------------------------------------------------------------//
	public int getFaceValue1()
	{
		return faceValue1;
	}
	
	//------------------------------------------------------------------------------//
	// Returns the value of the second dice                                         //
	//------------------------------------------------------------------------------//
	public int getFaceValue2()
	{
		return faceValue2;
	}
	
	//------------------------------------------------------------------------------//
	// Converts the sum of the dice into a string                                   //
	//------------------------------------------------------------------------------//
	public String toString()
	{
		String result = Integer.toString(faceValue1 + faceValue2);
		
		return result;
	}

}
