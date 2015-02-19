package PP5_8;

public class Flight
{
	String airlineName;
	int flightNum;
	String flightOrigin;
	String flightDestination;
	String toString;
	public Flight(String airlineName, int flightNum, String flightOrigin, String flightDestination)
	{
		this.airlineName=airlineName;
		this.flightNum=flightNum;
		this.flightOrigin=flightOrigin;
		this.flightDestination=flightDestination;
		
	}
	public String getAirlineName()
	{
		return airlineName;
	}
	public int getFlightNum()
	{
		return flightNum;
	}
	public String getFlightOrigin()
	{
		return flightOrigin;
	}
	public String getFlightDestination()
	{
		return flightDestination;
	}
	public String setAirlineName(String airlineName)
	{
		this.airlineName=airlineName;
		return this.airlineName;
	}
	public int setFlightNum(int flightNum)
	{
		this.flightNum=flightNum;
		return this.flightNum;
	}
	public String setFlightOrigin(String flightOrigin)
	{
		this.flightOrigin=flightOrigin;
		return this.flightOrigin;
	}
	public String setFlightDestination(String flightDestination)
	{
		this.flightDestination=flightDestination;
		return this.flightDestination;
	}	
	public String toString()
	{
		this.toString="The airline name is: "+airlineName+" the flight number is "+flightNum+" the origin of the flight is "+flightOrigin+" the flight destination is "+flightDestination;
		return this.toString;
	}
}
