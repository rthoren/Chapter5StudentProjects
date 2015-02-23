package project5_123;

public class Coin1
{
	public boolean heads;
	
	public Coin1()
	{
		flip();
	}
	
	public void flip()
	{
		heads = (int) (Math.random() * 2) == 1;
	}
	
	public boolean isHeads()
	{
		return heads;
	}
	
	public String toString()
	{
		return heads ? "Heads" : "Tails";
	}

}