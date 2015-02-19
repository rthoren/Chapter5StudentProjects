package PP5_5;

public class Kennel
{
	Dog Dog1;
	Dog Dog2;
	Dog Dog3;
	Dog Dog4;
	Dog Dog5;
	public Kennel(String dogName, int dogAge)
	{
		Dog1=new Dog(dogName, dogAge);
		Dog2=new Dog(dogName, dogAge);
		Dog3=new Dog(dogName, dogAge);
		Dog4=new Dog(dogName, dogAge);
		Dog5=new Dog(dogName, dogAge);
	}
}
