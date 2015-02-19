package bookExamples;

public class RationalTester 
{
	private int numerator, denominator;
	
	public RationalTester (int numer, int denom)
	{
		if (denom == 0)
			denom = 1;
		if (denom < 0)
		{
			numer = numer * -1;
			denom = denom * -1;
		}
		numerator = numer;
		denominator = denom;
		
		reduce();
	}
	public int getNumerator()
	{
		return numerator;
	}
	public int getDenominator()
	{
		return denominator;
	}
	public RationalTester reciprocal()
	{
		return new RationalTester(denominator, numerator);
	}
	public RationalTester add(RationalTester op2)
	{
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int sum = numerator1 + numerator2;
		return new RationalTester(sum, commonDenominator);
	}
	public RationalTester subtract(RationalTester op2)
	{
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int difference = numerator1 - numerator2;
		
		return new RationalTester(difference, commonDenominator);
	}
	public RationalTester multiply(RationalTester op2)
	{
		int numer = numerator * op2.getNumerator();
		int denom = denominator * op2.getDenominator();
		
		return new RationalTester(numer, denom);
	}
	public RationalTester divide(RationalTester op2)
	{
		return multiply(op2.reciprocal());
	}
	public boolean isLike(RationalTester op2)
	{
		return (numerator == op2.getNumerator() && denominator == op2.getDenominator());
	}
	public String toString()
	{
		String result;
		if (numerator == 0)
			result = "0";
		else
			if(denominator == 1)
				result = numerator + "";
			else
				result = numerator + "/" + denominator;
		return result;
	}
	private void reduce()
	{
		if (numerator != 0)
		{
			int common = gcd(Math.abs(numerator), denominator);
			numerator = numerator/common;
			denominator = denominator/common;
		}
	}
	private int gcd (int num1, int num2)
	{
		while (num1 != num2)
			if (num1 > num2)
				num1 = num2 - num1;
		return num1;
	}

}
