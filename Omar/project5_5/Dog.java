package project5_5;

public class Dog 
{
	private String name;
	private int age,dogAge;
	
	public Dog()
	{
		name = "Dog";
		dogAge=1;
		age = dogAge*2;
	}
	
	public void setter(String puppy, int years)
	{
		name = puppy;
		dogAge = years;
	}
	
	public int getAge()
	{
		return dogAge;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int personYears()
	{
		age = 7*dogAge;
		return age;
	}
	
	public String toString()
	{
		return("Name of dog: " + name + "\n" + "Age in actual years: " + dogAge + "\n" +  "Age in person years: " + age);
	}

}
