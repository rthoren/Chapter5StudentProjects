package chapter_projects;

public class Transactions {

	public static void main(String[] args) 
	{
		Account acct1 = new Account ("Ted Murphy", 72345, 25.59);
		Account acct2 = new Account ("Angelica Adams", 69713, 500.00);
		Account acct3 = new Account ("Edward Demsey", 93757);
		Account acct4 = new Account ("Joe Smith", 80473);
		
		acct1.deposit (44.10);
		
		double adamsBalance = acct2.deposit (75.25);
		System.out.println("Adams balance after deposit: " + adamsBalance);
		
		System.out.println("Adams balance after withdrawal: " + acct2.withdraw (480, 1.50));
		
		acct3.withdraw(-100.00, 1.50);
		
		acct1.addInterest();
		acct2.addInterest();
		acct3.addInterest();
		
		acct4.deposit(78.95);
		acct3.deposit(769.32);
		
		System.out.println();
		System.out.println(acct1);
		System.out.println(acct2);
		System.out.println(acct3);
		System.out.println(acct4);

	}

}
