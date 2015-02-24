package pp3;

public class Coin 
{
	private final int HEADS = 0;
	enum FACE {Heads, Tails};
	private boolean head;
	
	
	public Coin()
	{
		
		flip();
		
	}
	public void flip()
	{
		FACE side1, side2;
		side1 = FACE.Heads;
		side2 = FACE.Tails;
		head = ((int) (Math.random() * 2)) == 1;
		
		
	}
	public FACE isHeads()
	{
		return FACE.Heads;
	}
	public String toString()
	{
		return (HEADS == HEADS) ? "HEADS" : "Tails";
	}

}
