package project5_4;

public class Sphere 
{
	private double area, volume, diameter;

	public Sphere(double value)
	{
		this.diameter = value;
		surfaceArea();
		volume();
	}
	
	public void setDiameter(double value)
	{
		this.diameter=value;
	}
	
	public double getDiameter()
	{
		return diameter;
	}

	public double surfaceArea()
	{
		area = (double)4*Math.PI*Math.pow((diameter/2), 2);
		return area;
	}
	
	public double volume()
	{
		volume = (4.0/3.0)*Math.PI*Math.pow((diameter/2), 3);
		return volume;
	}
	
	public void newDimensions()
	{
		volume();
		surfaceArea();
	}
	
	public String toString()
	{
		System.out.println();
		if(volume==0)
			return ("Diameter: " + diameter + "\n"+ "Surface Area: " + area + "\n");
		else if(area==0)
			return ("Diameter: " + diameter + "\n" + "Volume: " + volume + "\n");
		else
			return ("Diameter: " + diameter + "\n" + "Volume: " + volume + "\n" + "Surface Area: " + area + "\n");
	}

}
