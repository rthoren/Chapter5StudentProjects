package chapter_projects;

public class Box 
{
	public int boxHeight, boxWeight, boxDepth;
	public boolean boxFull;
	
	public Box(int height, int weight, int depth, boolean full)
	{
		boxHeight = height;
		boxWeight = weight;
		boxDepth = depth;
		boxFull = false;
	}
	
	public void fillBox()
	{
		boxFull = true;
	}
	
	public int getHeight()
	{
		return boxHeight;
	}
	
	public int getWeight()
	{
		return boxWeight;
	}
	
	public int getDepth()
	{
		return boxDepth;
	}
	
	public boolean getFill()
	{
		return boxFull;
	}
	
	public String boxFill()
	{
		String fullString = "The box is full.";
		String emptyString = "The box is empty.";
		
		if (boxFull == false)
			return emptyString;
		else
			return fullString;
	}
	
	public String toString()
	{
		getHeight();
		getWeight();
		getDepth();
		
		String description = "The box's height is " + boxHeight + ". The box's weight is " + boxWeight + ". The box's depth is " + boxDepth + ". "
				+ boxFill();
	
		return description;
	}
}
