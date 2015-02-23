package project5_6;

public class BoxTest 
{

	public static void main(String[] args) 
	{
		Box box1 = new Box();
		Box box2 = new Box();
	
		//Set dimensions in the following order: (height, width, depth)
		box1.setDimensions(4,2,6);
		
		box2.setDimensions(5,6,9);
		box2.fillBox();
		
		System.out.println(box1);
		System.out.println(box2);
	
	}

}
