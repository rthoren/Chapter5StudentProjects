package pp1;
import java.util.Scanner;



public class Coin 
{
	private final int HEADS = 0;
	private int face;
	Scanner scan = new Scanner(System.in);
	
	public boolean choose()
	{
		int choice;
		System.out.println("Do you want to flip the coin? (1/0)");
		choice = scan.nextInt();
		if (choice == 1)
		{
			return true;
		}
		else
			return false;
	}
	public Coin()
	{
		flip();
	}
	public void flip()
	{
		face = (int) (Math.random() * 2);
	}
	public boolean isHeads()
	{
		return (face == HEADS);
	}
	public String toString()
	{
		return (face == HEADS) ? "HEADS" : "Tails";
	}

}

