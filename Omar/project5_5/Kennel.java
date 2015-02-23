package project5_5;

public class Kennel 
{

	public static void main(String[] args) 
	{
		Dog dog1 = new Dog();
		
		//Set the dog's parameters in the following order: (Dog's Name, Dog's actual age)
		dog1.setter("Busta", 7);
		dog1.personYears();
		
		System.out.println(dog1);

	}

}
