package pp8;

public class Flight 
{
	String name;
	int num;
	String origin;
	String dest;
	public Flight(String name, int num, String origin, String dest)
	{
		this.name = name;
		this.num = num;
		this.origin = origin;
		this.dest = dest;
		
	}
	public String getName()
	{
		return name;
	}
	public int getNum()
	{
		return num;
	}
	public String getOrigin()
	{
		return origin;
	}
	public String getDest()
	{
		return dest;
	}
	public String setName(String name)
	{
		this.name = name;
		return name;
	}
	public int setNum(int num)
	{
		this.num = num;
		return num;
	}
	public String getOrigin(String origin)
	{
		this.origin = origin;
		return origin;
	}
	public String setDest(String dest)
	{
		this.dest = dest;
		return dest;
	}
	public String toString()
	{
		return ("Name of airline: " +name+ " Flight number: " +num+ " Fight's origin: " +origin+ " Destination: " +dest);
	}
	

}
