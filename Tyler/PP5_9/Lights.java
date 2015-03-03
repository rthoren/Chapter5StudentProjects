package PP5_9;

public class Lights 
{
	static Bulb light1;
	static Bulb light2;
	static Bulb light3;
	static Bulb light4;
	public Lights()
	{
		light1= new Bulb(true);
		light2= new Bulb(true);
		light3= new Bulb(true);
		light4= new Bulb(true);
	}
	public static void main(String[]args)
	{
		Lights lights = new Lights();
		System.out.println(
		light1.on()+
		light2.toString()+
		light3.off()+
		light4.on()
		);
	}
}
