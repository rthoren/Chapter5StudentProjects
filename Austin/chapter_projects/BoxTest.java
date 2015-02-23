package chapter_projects;

public class BoxTest {

	public static void main(String[] args) 
	{
		Box box1 = new Box(5, 7, 6, false);
		Box box2 = new Box(7, 8 ,9, false);
		Box box3 = new Box(9, 5, 3, true);
		
		box1.fillBox();
		
		System.out.println(box1.toString());
		System.out.println(box2.toString());
		System.out.println(box3.toString());
		
	}

}
