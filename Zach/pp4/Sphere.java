package pp4;

public class Sphere 
{
	public static int diameter;
	public static int getDiameter(int diameter)
	{
		return diameter;
	}
	public static double volume()
	{
		double rad = diameter/2;
		double vol = 4/3*Math.PI*Math.pow(3, rad);
		return vol;
	}

	public static void main(String[] args) 
	{
		

	}

}
