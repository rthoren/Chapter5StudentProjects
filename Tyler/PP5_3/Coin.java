package PP5_3;


public class Coin
{
	enum Face{Heads, Tails};
	Face currentFace;
	public Coin()
	{
		flip();
	}
	public void flip()
	{
		int randNum=(int) (Math.random()*2);
		if(randNum==0)
		{
			currentFace=Face.Heads;
		}
		else
		{
			currentFace=Face.Tails;
		}
	}
	public Face isHeads()
	{
		return (currentFace=Face.Heads);
	}
	public String toString()
	{
		return (currentFace=Face.Heads) != null?"Heads": "Tails";
		
	}
}

