package pp1;
//

public class PP1 
{
	private final boolean HEADS = true;
	private double face;
	
	public void Coin()
	{
		flip();
	}
	public void flip()
	{
		face = (Math.random() * 2);
	}
	public boolean isHeads()
	{
		return HEADS;
	}
	



	
	public static void main(String[] args) 
	{
		
		
		

	}

}
