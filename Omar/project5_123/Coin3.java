package project5_123;

public class Coin3 
{
	enum Side{FaceUp,FaceDown}
	private boolean faceHeads;
	
	Side heads = Side.FaceUp, tails = Side.FaceDown;
	
	public Coin3()
	{
		flip();
	}
	
	public void flip()
	{
		if(heads.ordinal() == (int) (Math.random() * 2))
			faceHeads = true;
		else
			faceHeads = false;
	}
	
	public boolean isHeads()
	{
			return faceHeads;
	}
	
	public String toString()
	{
		return faceHeads ? "Heads" : "Tails";
	}

}
