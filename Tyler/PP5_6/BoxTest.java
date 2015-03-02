package PP5_6;

public class BoxTest
{
	static Box box1;
	static Box box2;
	static Box box3;
	static Box box4;
	public BoxTest()
	{
		box1=new Box(4, 5, 6, false);
		box2=new Box(3,9,7,true);
		box3=new Box(5,9,3,false);
		box4=new Box(4,90,3,true);	
	}
	public static void main(String[]args)
	{
		box1.getDepth();
		box2.getFull();
		box3.getWidth();
		box4.toString();
	}
}
