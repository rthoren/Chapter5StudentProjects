package PP5_4;
public class Sphere 
{
	
	double diameter;
	double volume;
	double surfaceArea;
	String toString;
	public Sphere(double diameter)
	{	
		this.diameter=diameter;
	}
	public double getter()
	{
		return diameter;
	}
	public double setter(double setDiameter)
	{
		return diameter=setDiameter;
	}
	public double getVolume()
	{
		
		double radius=(diameter/2);
		volume=(double)(4.0/3.0)*(Math.PI)*Math.pow(radius, 3);
		return volume;
	}
	public double getSurfaceArea()
	{
		double radius=(diameter/2);
		surfaceArea=4*(Math.PI)*(Math.pow(radius, 2));
		return surfaceArea;
	}
	public String toString()
	{
		toString="The diameter is: "+diameter+" the volume is: "+volume+" the suface area is: "+surfaceArea;
		return toString;
	}
	
}
