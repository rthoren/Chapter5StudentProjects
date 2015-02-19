package PP5_6;

public class Box 
{
	double height;
	double width;
	double depth;
	boolean full;
	String toString;
	public Box(double height, double width, double depth, boolean full)
	{
		this.height=height;
		this.width=width;
		this.depth=depth;
		full=false;
		this.full=full;
	}
	public double getHeight()
	{
		return height;
	}
	public double getWidth()
	{
		return width;
	}
	
	public double getDepth()
	{
		return depth;
	}
	public boolean getFull()
	{
		return full;
	}
	public double setHeight(double height)
	{
		this.height=height;
		return this.height;
	}
	public double setWidth(double width)
	{
		this.width=width;
		return this.width;
	}
	public double setDepth(double depth)
	{
		this.depth=depth;
		return this.depth;
	}
	public String toString()
	{
		toString="The box is: "+height+" heigh "+width+"wide"+depth+"deep, Is the box full"+full;
		return toString;
	}
	
	
	
}
