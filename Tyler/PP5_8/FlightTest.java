package PP5_8;

public class FlightTest
{
	static Flight flight1;
	static Flight flight2;
	static Flight flight3;
	static Flight flight4;
	public FlightTest()
	{
		flight1 = new Flight(null, 0, null, null);
		flight2 = new Flight(null, 0, null, null);
		flight3 = new Flight(null, 0, null, null);
		flight4 = new Flight(null, 0, null, null);
		
	}
	public static void main(String[]args)
	{
		flight1.getAirlineName();
		flight2.getFlightNum();
		flight3.getFlightOrigin();
		flight4.getFlightDestination();
	}
	
	
}
