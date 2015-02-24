package pp5;

public class Dog 
{
	String name;
	String d;
	int age;
	String n;
	int doga;
	public Dog()
	{
		n = "Name";
		doga = 1;
		age = doga*2;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String dog)
	{
		name = dog;
		
	}
	public void setAge(int years)
	{
		age = years;
	}
	public int getAge()
	{
		return age;
	}
	public int dogYears()
	{
		doga = age*7;
		return doga;
	}
	public String toString()
	{
		return ("Dog name: " + name + "\n" + "Age in person years: " + age + "\n" + "Age in dog years: " + doga);
	}

}