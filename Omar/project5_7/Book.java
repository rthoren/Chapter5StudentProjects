package project5_7;

public class Book 
{
	private String title, author, publisher, copyDate;
	
	public Book()
	{
		title = "Title";
		author = "Author";
		publisher = "Publisher";
		copyDate = "Copyright Date";
	}
	
	public void setInfo(String name, String writer, String publish, String date)
	{
		title = name;
		author = writer;
		publisher = publish;
		copyDate = date;
		
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
	
	public String getDate()
	{
		return copyDate;
	}
	
	public String toString()
	{
		return("Book Title: " + title + "\n" + "Author: " + author + "\n" + "Publisher: " + publisher + "\n" + "Copyright Date: " + copyDate + "\n");
	}

}
