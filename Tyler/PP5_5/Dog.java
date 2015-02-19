package PP5_5;

public class Dog
{
	String name;
	int age;
	int humanAge;
	String toString;
	public Dog(String dogName, int dogAge)
	{
		name=dogName;
		age=dogAge;
	}
	public String nameGetter()
	{
		return name;
	}
	public int ageGetter()
	{
		return age;
	}
	public String nameSetter(String newName)
	{
		name=newName;
		return name;
	}
	public int ageSetter(int newAge)
	{
		age=newAge;
		return age;
	}
	public double humanAge()
	{
		humanAge=age*7;
		return humanAge;
	}
	public String toString()
	{
		toString="The dog's name is: "+name+" the dogs age is: " +age+" "+name+"\'s age in human years is"+humanAge;
		return toString;
	}
}
