package chapter_projects;

public class PP53 
{
	enum HeadsTails {heads, tails}
	
	public PP53()
	{
	
	}
	
	public void flip()
	{
		HeadsTails heads1, tails1;
		
		heads1 = HeadsTails.heads;
		tails1 = HeadsTails.tails;
		
		int coinHeads = ((int) (Math.random() * 2));
		
		if (coinHeads == heads1.ordinal())
			System.out.println(heads1.name());
		else
			System.out.println(tails1.name());
	}
	
	public HeadsTails isHeads()
	{
		return HeadsTails.heads;	
	}
}
