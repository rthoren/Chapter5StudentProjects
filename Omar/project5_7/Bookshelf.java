package project5_7;

public class Bookshelf 
{

	public static void main(String[] args)
	{
		//Set the book information in the following order: Title, Author (Last Name, FirstName), Publisher, Copyright Date (Month Day, Year)
		Book book1 = new Book();
		book1.setInfo("MockingJay", "Collins, Suzanne", "Men Overflow Publishing Co.", "September 7, 1992");
		System.out.println(book1);

	}

}
