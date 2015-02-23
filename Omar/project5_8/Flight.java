package project5_8;

public class Flight 
{
	private String airName, fltOrigin, fltDestination;
	private String flightNum;
	
	public Flight()
	{
		airName="Name of Airline";
		flightNum="Flight Number";
		fltOrigin="Flight Origin";
		fltDestination="Flight Destination";
	}
	
	public void setFlightInfo(String name, String num, String origin, String destination)
	{
		airName = name;
		flightNum = num;
		fltOrigin = origin;
		fltDestination = destination;
	}
	
	public String getFlightName()
	{
		return airName;
	}
	
	public String getFlightNumber()
	{
		return flightNum;
	}
	
	public String getFlightOrigin()
	{
		return fltOrigin;
	}
	
	public String getFlightDestination()
	{
		return fltDestination;
	}
	
	public String toString()
	{
		return ("Flight Name: " + airName + "\n" + "Flight Number: " + flightNum + "\n" + "Flight Origin: " + fltOrigin + "\n" + "Flight Destination: " + fltDestination + "\n");
	}

}
