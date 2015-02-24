package pp2;

public class Coin 
{
	private final int HEADS = 0;
	private String heads = "Heads", tails = "Tails";
	private boolean head;
	
	
	public Coin()
	{
		
		flip();
		
	}
	public void flip()
	{
		
		head = ((int) (Math.random() * 2)) == 1;
		
		
	}
	public boolean isHeads()
	{
		return head;
	}
	public String toString()
	{
		return head ? heads : tails;
	}

}
