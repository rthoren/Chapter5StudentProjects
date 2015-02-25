package pp7;

public class Book 
{
	String title;
	String author;
	String publisher;
	int copywright;
	public Book (String title, String author, String publisher, int copywright)
	{
		this.title = title;
		this.author = author; 
		this.publisher = publisher;
		this.copywright = copywright;
	}
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public String getPublisher()
	{
		return publisher;
	}
	public int getCopywright()
	{
		return copywright;
	}
	public String setTitle(String title)
	{
		this.title = title;
		return title;
	}
	public String setAuthor(String author)
	{
		this.author = author;
		return author;
	}
	public String setPublisher(String publisher)
	{
		this.publisher = publisher;
		return publisher;
	}
	public int setCopywright(int copywright)
	{
		this.copywright = copywright;
		return copywright;
	}
	public String toString()
	{
		return("Title: " +title+ "\nAuthor: " +author+ "\nPublisher: " +publisher+ "\nCopywright Date: " +copywright);
	}

}
