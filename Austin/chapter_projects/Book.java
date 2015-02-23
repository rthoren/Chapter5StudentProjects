package chapter_projects;

public class Book 
{
	String bookTitle, bookAuthor, bookPublisher, copyrightDate;
	
	public Book (String title, String author, String publisher, String copyright)
	{
		bookTitle = title;
		bookAuthor = author;
		bookPublisher = publisher;
		copyrightDate = copyright;
	}
	
	public String getTitle()
	{
		return bookTitle;
	}
	
	public String getAuthor()
	{
		return bookAuthor;
	}
	
	public String getPublisher()
	{
		return bookPublisher;
	}
	
	public String getCopyright()
	{
		return copyrightDate;
	}
	
	public String toString()
	{
		getTitle();
		getAuthor();
		getPublisher();
		getCopyright();
		
		String description = "Title: " + getTitle() + " \nAuthor: " + getAuthor() + " \nPublisher: " + getPublisher() + "\nCopyright Date: " + getCopyright();
		return description;
	}
}
