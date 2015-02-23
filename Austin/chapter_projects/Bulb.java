package chapter_projects;

public class Bulb 
{
	String lightOn = "The light is on";
	String lightOff = "The light is off";
	public boolean onOff = false;
	
	public Bulb(boolean onOff)
	{
	
	}
	
	public boolean lightOn()
	{
		onOff = true;
		return onOff;
	}
	
	public boolean lightOff()
	{
		onOff = false;
		return onOff;
	}
	
	public String toString()
	{		
		return (onOff == true) ? lightOn : lightOff;
	}
	
}
