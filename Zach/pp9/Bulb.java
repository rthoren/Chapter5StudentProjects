package pp9;

public class Bulb 
{
	boolean state;
	
	public Bulb(boolean state)
	{
		this.state = state;
	}
	public boolean getState()
	{
		return state;
	}
	public boolean setState(boolean state)
	{
		this.state = state;
		return state;
	}
	public String toString()
	{
		if(state == false)
			return("Light is not on");
		else
			return("Light is on");
	}

}
