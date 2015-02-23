package chapter_projects;

public class Lights 
{

	public static void main(String[] args) 
	{
		Bulb bulb1 = new Bulb(true);
		Bulb bulb2 = new Bulb(true);
		
		bulb1.lightOff();
		bulb2.lightOn();
		
		System.out.println(bulb1.toString());
		System.out.println(bulb2.toString());
	}

}
