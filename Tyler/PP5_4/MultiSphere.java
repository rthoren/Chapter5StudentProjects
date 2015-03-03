package PP5_4;

public class MultiSphere
{
	static Sphere sphere1;
	static Sphere sphere2;
	static Sphere sphere3;
	static Sphere sphere4;
	static Sphere sphere5;
	public MultiSphere()
	{
		sphere1=new Sphere(12);
		sphere2=new Sphere(54);
		sphere3=new Sphere(2);
		sphere4=new Sphere(786);
		sphere5=new Sphere(23);
	}
	public static void main(String[]args)
	{
		MultiSphere sphere=new MultiSphere();
		sphere1.getter();
		sphere2.setter(4.3);
		sphere3.getVolume();
		sphere4.getSurfaceArea();
		sphere5.toString();
		
	}

}
