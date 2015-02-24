package pp4;
import java.text.DecimalFormat;

public class Sphere 
{
	private double diameter;
	private double radius;
	private double volume;
	private double surface;
	DecimalFormat fmt = new DecimalFormat("0.###");
	
	
	
	public Sphere(double d) 
	{
		this.diameter = d;
		volume();
		surfaceArea();
	}
	public void setDiameter(double d)
	{
		this.diameter = d;
		
	}
	public double getDiameter()
	{
		
		return diameter;
	}
	
	public double radius()
	{
		radius = diameter/2;
		return radius;
	}
	public double volume()
	{
		volume = 4.0/3.0*Math.PI*Math.pow(radius, 3);
		fmt.format(volume);
		return volume;
	}
	public double surfaceArea()
	{
		surface = (double) 4*Math.PI*Math.pow(radius, 2);
		fmt.format(surface);
		return surface;
		
	}
	public void dimensions()
	{
		volume();
		surfaceArea();
	}
	public String toString()
	{
		return ("Diameter: " + diameter + "\n" + "Surface Area: " + surface + "\nVolume: " +volume);
	}
	

	


}
