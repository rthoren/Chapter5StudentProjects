package PP5_5;

public class Kennel
{
	static Dog dog1;
	static Dog dog2;
	static Dog dog3;
	static Dog dog4;
	static Dog dog5;
	public Kennel(String dogName, int dogAge)
	{
		dog1=new Dog(dogName, dogAge);
		dog2=new Dog(dogName, dogAge);
		dog3=new Dog(dogName, dogAge);
		dog4=new Dog(dogName, dogAge);
		dog5=new Dog(dogName, dogAge);
	}
	public static void main(String[]args)
	{
		Kennel kennel = new Kennel("Sampson", 12);
		dog1.ageGetter();
		dog2.humanAge();
		dog3.nameGetter();
		dog4.nameSetter("Todd");
		dog4.toString();
	}
}
