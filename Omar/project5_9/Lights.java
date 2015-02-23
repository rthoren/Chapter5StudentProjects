package project5_9;

public class Lights 
{

	public static void main(String[] args) 
	{
		//The light bulb is initially set to off
		Bulb light1 = new Bulb();
		Bulb light2 = new Bulb();
		
		light2.turnOn();
		
		System.out.println("Light one: " + light1);
		System.out.println("Light two: " + light2);

	}

}
