package chapter_projects;

public class Dog 
{
	private int dogAge;
	private int personAge;
	private String dogName;
	
	public Dog(String name, int age)
	{
		dogAge = age;
		dogName = name;
	}
	
	public int getAge()
	{
		return dogAge;
	}
	
	public String getName()
	{
		return dogName;
	}
	
	public int getPersonAge()
	{
		return personAge;
	}
	
	public int personYears()
	{
		int peopleAge = dogAge * 7;
		personAge = peopleAge;
		
		return peopleAge;
	}
	
	public String toString()
	{
		personYears();
		
		String description = "The dog's name is " + dogName + ". The dog is " + dogAge + " years old which is " + 
				personAge + " in \"person years\"."; 
		
		return description;
	}
	
}
