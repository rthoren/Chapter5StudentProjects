package pp6;

public class Box 
{
	double height;
	double width;
	double depth;
	boolean full;
	
	public Box(double height, double width, double depth, boolean full)
	{
		this.height = height;
		this.width = width;
		this.depth = depth;
		full = false;
		this.full = full;
		
	}
	public double getWidth()
	{
		return width;
	}
	public double getDepth()
	{
		return depth;
	}
	public double getHeight()
	{
		return height;
	}
	public boolean getSpace()
	{
		return full;
	}
	public double setWidth(double width)
	{
		this.width = width;
		return width;
	}
	public double setDebth(double depth)
	{
		this.depth = depth;
		return depth;
	}
	public double setHeight(double height)
	{
		this.height = height;
		return height;
	}
	public boolean setSpace(boolean full)
	{
		this.full = full;
		return full;
	}
	public String toString()
	{
		return ("Height: " + height + "\n Width: " +width + "\n Depth: " + depth + "\n Space: " +full);
	}

}
