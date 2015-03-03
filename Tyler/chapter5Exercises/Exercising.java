package chapter5Exercises;


//************************
//Chapter 5
//Excersies
//************************
public class Exercising
{
	//Ex 5.1
	/*
	A) Superhero is the class, Superman is the object
	B) Person is the class, Justin is the object
	C)Pet is the class, Rover is the object
	D) Magazine is the class, Time is the object
	E) Holiday is the class, Christmas is the object
	*/
	//5.2
	/*
	getLength() might be a method that return the length of the frame
	getWidth()  might be a method that returns the width of the frame
	getParameter() might be a method that returns that parameter
	getPicture() might be a method that returns what picture is in the frame
	setLength() might be a method to set the length
	setWidth() might be a method to set the width
	*/
	//5.3
	/*
	whatPeople() might be a method to find out how many people are in the meeting
	scheduler() might be a method to schedule people for the meeting
	whatRoom() might be a method to find what room the meeting is in 
	*/
	//5.4
	/*
	courseNumber() might return the class number
	roomNumber() might display the room where the class is held
	whatProfessor() might display the name of the professor
	whatCategory() might display the category that the class is under 
	*/
	//5.5
	/*
	for(int roll=1; roll<=ROLLS;roll++)
	{
	  if((die1.roll()==1)&&(die2.roll()==1))
	  {
	  	count++;
	  }
	 }
	*/
	//5.6
	/*
	public void lyrics()
	{
		System.out.println("This is a song");
	}
	public static void main(String[] args)
	{
		Exercising test = new Exercising();
		test.lyrics();
		
	}
	*/
	//5.7
	/*
	 public int cube(int x )
	{
		double taskDone = Math.pow(x,3);
		return x;
	}
	*/
	//5.8
	/*
	public int randomNum()
 	{
		Random rand = new Random();
 		int whatNum=rand.nextInt(99)+1;
 		return whatNum;
 	}
	*/
	//5.9
	/*
	public int rangeVal(int x, int y)
	{
		System.out.println("Enter a range where the first number you enter is greater than the second.");
		Random rand = new Random();
		x = x-y;
		int randomNumber= rand.nextInt(x)+y;
		return randomNumber;
		
		
	}
	*/
	//5.10
	/*
	public void printPower()
	{ 
		int numTimes=1;
		int x=2;
		double two=2;
		while(numTimes<10)
		{
			System.out.println(two);
			numTimes++;
			two=Math.pow(two, x);
		}
	}
	public static void main(String [] args)
	{
		Exercising ex = new Exercising();
		
		ex.printPower();
	}
	*/
	//5.11
	/*
	  public void alarm(int numTimes)
	{

		int start=1;
		if(numTimes<1)
		{
			System.out.println("You cannot do that.");
		}
		else
		{
			while(start<numTimes)
			{
				System.out.println("Alarm!");
				start++;
			}
		}
	}
	public static void main(String[]args)
	{
		Exercising ex = new Exercising();
		ex.alarm();
	}
	*/
	//5.12
	/*
	public int sum100()
	{
		int beginning=1;
		int start = 0;
		int times=1;
		while(times<=100)
		{
			times++;
			start +=beginning;
			beginning+;
		}
		System.out.println(start);
		return start;
	}
	public static void main(String[]args)
	{
		Exercising ex = new Exercising();
		ex.sum100();
	} 
	*/
	//5.13
	/*
	 public int maxOfTwo(int num1, int num2)
	{
		if(num1>num2)
		{
			return num1;
		}
		else
		{
			return num2;
		}
	}
	public static void main(String[]args)
	{
		Exercising ex = new Exercising();
		ex.maxOfTwo();
		
	}
	*/
	//5.14
	/*
	 public int sumOfRange(int lowest, int highest)
	{
		int sum=0;
		if(lowest>highest)
		{
			System.out.println("Error.");
			return 0;
		}
		else 
		{
			while(lowest<=highest)
			{
				sum +=lowest;
				lowest++;
				
			}
			return sum;
		}
	}
	*/
	//5.15
	/*
		public boolean larger(double first, double second)
	{
		if(first>second)
		{
			return true;
		}
		else
		{
			return false;
		}
	} 
	*/
	//5.16
	/*
	  public int countA(String countingA)
	{
		int numOfA=0;
		for(int i=0; i<=countingA.length(); i++)
		{
			if(countingA.charAt(i) =='A')
			{
				numOfA++;
			}
		}
		System.out.println(numOfA);
		return numOfA;

	*/
	//5.17
	/*
		public boolean evenlyDivisible(int firstNum, int secondNum)
	{
		if(firstNum%secondNum==0)
		{
			return true;
		}
		else if(secondNum%firstNum==0)
		{
			return true;
		}
		else if(firstNum==0)
		{
			return false;
		}
		else if(secondNum==0)
		{
			return false;
		}
		else
		{
			return false;
		}
	} 
	*/
	//5.18
	/*
	public boolean isAlpha(char testingAlphabet)
	{
		
		if(Character.isLetter(testingAlphabet))
		{
			return true;
		}
		else
		{
			return false;
		}
	} 
	*/
	//5.19
	/*
		public boolean reverse(float firstNum, float secondNum, float tolerance)
	{
		if((firstNum+tolerance)>=secondNum)
		{
			return true;
		}
		else if((secondNum+tolerance)>=firstNum)
		{
			return true;
		}
		else
		{
			return false;
		}
	} 
	*/
	public static void main(String[]args)
	{
		
		
	}
	
}