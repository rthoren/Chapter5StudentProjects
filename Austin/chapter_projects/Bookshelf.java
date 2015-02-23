package chapter_projects;

public class Bookshelf 
{

	public static void main(String[] args) 
	{
		Book book1 = new Book("Of Mice and Men", "John Steinbeck", "Penguin Books", "1965");
		Book book2 = new Book("Adventures of Huckleberry Finn", "Mark Twain", "Dover Publications, Inc.", "1994");
		Book book3 = new Book("This One Isn't Even a Book", "There is no author", "No one", "2450");
		
		System.out.println(book1.toString());
		System.out.println();
		System.out.println(book2.toString());
		System.out.println();
		System.out.println(book3.toString());

	}

}
