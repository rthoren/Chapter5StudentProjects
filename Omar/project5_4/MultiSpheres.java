package project5_4;

public class MultiSpheres 
{

	public static void main(String[] args) 
	{
		Sphere sphere1 = new Sphere(7);
		Sphere sphere2 = new Sphere(10);
		
		sphere2.setDiameter(8);
		
		sphere2.newDimensions();
		
		System.out.println(sphere1);
		System.out.println(sphere2);
		
		
	}

}
