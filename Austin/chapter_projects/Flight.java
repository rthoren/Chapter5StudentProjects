package chapter_projects;

public class Flight 
{
	String flightAirline, flightOrigin, flightDestination;
	int flightNumber;
	
	public Flight(String airline, int flightNum, String origin, String destination)
	{
		flightAirline = airline;
		flightNumber = flightNum;
		flightOrigin = origin;
		flightDestination = destination;
	}
	
	public String getAirline()
	{
		return flightAirline;
	}
	
	public int getFlightNumber()
	{
		return flightNumber;
	}
	
	public String getOrigin()
	{
		return flightOrigin;
	}
	
	public String getDestination()
	{
		return flightDestination;
	}
	
	public String toString()
	{
		getAirline();
		getFlightNumber();
		getOrigin();
		getDestination();
		
		String description = "The flight airline is " + flightAirline + " and the flight number is " + flightNumber + ". The origin is " + flightOrigin + " and the destination is " + flightDestination + ".";
		return description;
	}
}
