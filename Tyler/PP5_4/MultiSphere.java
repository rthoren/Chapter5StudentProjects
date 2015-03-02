package PP5_4;

public class MultiSphere
{
	static Sphere sphere1;
	static Sphere sphere2;
	static Sphere sphere3;
	static Sphere sphere4;
	static Sphere sphere5;
	public MultiSphere(double diameter)
	{
		sphere1=new Sphere(diameter);
		sphere2=new Sphere(diameter);
		sphere3=new Sphere(diameter);
		sphere4=new Sphere(diameter);
		sphere5=new Sphere(diameter);
	}
	public static void main(String[]args)
	{
		sphere1.getter();
		sphere2.setter(4.3);
		sphere3.getVolume();
		sphere4.getSurfaceArea();
		sphere5.toString();
		
	}

}
