package chapter_projects;

public class PP51 
{
	private boolean heads;
	
	public PP51()
	{
		flip();
	}
	
	public void flip()
	{
		heads = ((int) (Math.random() * 2)) == 1;
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
