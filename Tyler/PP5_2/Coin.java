package PP5_2;

public class Coin
{
	private final String HEADS="H";
	private String face;
	public Coin()
	{
		flip();
	}
	public void flip()
	{
		int randChar=(int) (Math.random()*2);
		if(randChar==1)
		{
			face="H";
		}
		
		else
		{
			face="T";
		}
	}
	public boolean isHeads()
	{
		return (face.equals(HEADS));
	}
	public String toString()
	{
		return (face.equals(HEADS))?"Heads" : "Tails";
	}
}
