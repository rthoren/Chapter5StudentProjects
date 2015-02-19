package PP5_9;

public class Bulb
{
	boolean onOrOff;
	public Bulb(boolean onOrOff)
	{
		this.onOrOff=onOrOff;
	}
	public boolean on()
	{
		return onOrOff==true;
	}
	public boolean off()
	{
		return onOrOff=false;
	}
}
