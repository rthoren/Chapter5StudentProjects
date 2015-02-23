package chapter_projects;

public class Kennel 
{

	public static void main(String[] args) 
	{
		Dog dog1 = new Dog("Bob", 2);
		Dog dog2 = new Dog("Annie", 4);
		Dog dog3 = new Dog("Gus", 7);
		
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());
		System.out.println(dog3.toString());
		
	}

}
