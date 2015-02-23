package project5_9;

public class Bulb 
{
	private boolean lightSwitch;
	
	public Bulb()
	{
		lightSwitch = false;
	}
	
	public boolean turnOn()
	{
		return this.lightSwitch = true;
	}
	
	public boolean turnOff()
	{
		return this.lightSwitch = true;
	}
	
	public String toString()
	{
		return "The light bulb is currently " + (lightSwitch ? "on.\n" : "off.\n");
	}

}
