package project5_8;

public class FlightTest 
{

	public static void main(String[] args) 
	{
		Flight flight1 = new Flight();
		
		//Set flight info in the following order: (Flight Name, Flight Number, Flight Origin, Flight Destination)
		flight1.setFlightInfo("Boeing", "AT737", "Milwaukee, NY", "Ft. Lauderdale, Florida");
		
		System.out.println(flight1);
	
	}

}
