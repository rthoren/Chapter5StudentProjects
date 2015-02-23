package chapter_projects;

public class FlightTest 
{

	public static void main(String[] args) 
	{
		Flight flight1 = new Flight("United Airlines", 345, "Boise, ID", "Denver, CO");
		Flight flight2 = new Flight("Northwest Airlines", 157, "Washington DC", "Denver, CO");
		Flight flight3 = new Flight("American Airlines", 286, "Miami, FL", "New York City, NY");
		
		System.out.println(flight1.toString());
		System.out.println();
		System.out.println(flight2.toString());
		System.out.println();
		System.out.println(flight3.toString());
	}

}
