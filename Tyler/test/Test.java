package test;

import java.util.LinkedList;
import java.util.Random;

public class Test 
{
	//Question 1
	public boolean threeOfAKind(int first, int second, int third)
	{
		if(first== second&& first==third)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//Question 5
	public int maxOfThree(int first, int second, int third)
	{
		if(first>=second && first>=third)
		{
			return first;
		}
		else if(second>=first && second>=third)
		{
			return second;
		}
		else
		{
			return third;
		}
	}
	//Question 6
	public int randomInRange(int first, int second)
	{
		int rangeSet=second-first;
		Random rand =new Random();
		if(first>=second)
		{
			System.out.println("Error");
			return 0;
		}
		else
		{
			int randomInRange=rand.nextInt(rangeSet)+(first+1);
			return randomInRange;
		}
	}
	//Question 7
	public boolean isPalindrome(String testPalindrome)
	{
		LinkedList<Character> palindrome=new LinkedList<Character>();
		int stringLength=testPalindrome.length();
		int numSpaces=0;
		int i=0;
		boolean keepGoing=true;
		while(i<stringLength&&keepGoing!=false)
		{
			if(testPalindrome.charAt(i)==' ')
			{
				numSpaces++;
				keepGoing=false;
			}
			i++;
		}
		if(numSpaces>0&&keepGoing!=false)
		{
			return false;
		}
		else if(numSpaces==0&&keepGoing!=false)
		{
			i=0;
			while(i<stringLength)
			{
				palindrome.addLast(testPalindrome.charAt(i));
				i++;
			}
			i=0;
			while(keepGoing!=false&&palindrome.isEmpty()!=true)
			{
				if(palindrome.getLast()==palindrome.getFirst())
				{
					keepGoing=true;
				}
				else
				{
					keepGoing=false;
				}
				palindrome.removeLast();
				palindrome.removeFirst();
			}
		}
		return keepGoing;
	}
	//Question 8
	public int countSpaces(String userInput)
	{
		int stringLength=userInput.length();
		int i=0;
		int numOfSpaces=0;
		while(i<stringLength)
		{
			if(userInput.charAt(i)==' ')
			{
				numOfSpaces++;
			}
			i++;
		}
		return numOfSpaces;
		
	}
	//Question 9
	public boolean containsPair(int first, int second, int third)
	{
		if(first==second)
		{
			return true;
		}
		else if(first==third)
		{
			return true;
		}
		else if(second==third)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//Question 10
	public double randomAverage()
	{
		Random rand = new Random();
		int i=1;
		int sumOf=0;
		int newNumber;
		while(i<=100)
		{
			newNumber=rand.nextInt(99)+1;
			sumOf+=newNumber;
		}
		double average = (double)(sumOf/100.0);
		return average;
	}
	//Question 12
	public void allAboutTyler()
	{
		System.out.println("Name: Tyler");
		System.out.println("Age: 16");
		System.out.println("Possible College Major: Applied Mathematics");
	}
	//Question 15
	public int square(int toBeSquared)
	{
		int squared=(int) Math.pow(toBeSquared, 2);
		return squared;
	}
	public static void main(String[] args)
	{
		Test test= new Test();
		if(test.isPalindrome("Not"))
		{
			System.out.println("congrats.");
		}
	}
}
