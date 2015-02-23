package chapter_projects;

public class PP52 
{
	private String heads = "Heads";
	private String tails = "Tails";
	
	public PP52()
	{
	
	}
	
	public void flip()
	{
		int coinHeads = ((int) (Math.random() * 2));
		
		if (coinHeads == 1)
			System.out.println(heads);
		else
			System.out.println(tails);
	}	
	
	public String isHeads()
	{
		return heads;
	}
	
	public String isTails()
	{
		return tails;
	}
	
	public static void main(String[]args)
	{
		PP52 coin = new PP52();
		
		coin.flip();
	}
}



