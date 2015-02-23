package project5_123;

public class Coin2
{
	public boolean heads;
	private String faceHeads="Heads", faceTails="Tails";
	
	public Coin2()
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
		return heads ? faceHeads : faceTails;
	}

}