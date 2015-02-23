package chapter_projects;

public class Sphere 
{
	private double sphereDiameter;
	private double volume;
	private double sphereSurfaceArea;
	
	public Sphere(int diameter)
	{
		if (diameter <= 0)
			System.out.println("Error: the diameter is less than or equal to 0.");
		
		sphereDiameter = diameter;	
	}
	
	public double getDiameter()
	{
		return sphereDiameter;
	}
	
	public double getSurfaceArea()
	{
		return sphereSurfaceArea;
	}
	
	public double volume()
	{
		double radius = sphereDiameter / 2;
		double sphereVolume = (4 * Math.pow(radius, 3) * Math.PI) / 3;
		
		volume = sphereVolume;
		
		return sphereVolume;
	}
	
	public double surfaceArea()
	{
		double radius = sphereDiameter / 2;
		double sphereSA = (4 * Math.pow(radius, 2) * Math.PI);
		
		sphereSurfaceArea = sphereSA;
		
		return sphereSA;
	}
	
	public String toString()
	{	
		volume();
		surfaceArea();
		
		String description = "The diameter of the sphere is " + sphereDiameter + ". The volume of the sphere is "
		+ volume + ". The surface area of the sphere is " + sphereSurfaceArea + ".";
		
		return description;
	}
}
