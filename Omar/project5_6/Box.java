package project5_6;

public class Box 
{
	private boolean full;
	private int height, width, depth;
	
	public Box()
	{
		height = 1;
		width = 1;
		depth = 1;
		full = false;
	}
	
	public void setDimensions(int value1, int value2, int value3)
	{
		height = value1;
		width = value2;
		depth = value3;
		
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getDepth()
	{
		return depth;
	}
	
	public boolean fillBox()
	{
		return full = true;
	}
	
	public String toString()
	{
		return ("The box has a width of " + width + ", a height of " + height + ", and a depth of " + depth + "\nThe box is "
				+ (full ? "full." : "empty.") + "\n");
	}

}
