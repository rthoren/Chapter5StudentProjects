package PP5_7;

public class Book
{
	String title;
	String author;
	String publisher;
	String copyright;
	String toString;
	public Book(String title, String author, String publisher, String copyright)
	{
		this.title=title;
		this.author=author;
		this.publisher=publisher;
		this.copyright=copyright;
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
	public String getCopyright()
	{
		return copyright;
	}
	public String setTitle(String title)
	{
		this.title=title;
		return this.title;
	}
	public String setAuthor(String author)
	{
		this.author=author;
		return this.author;
	}
	public String setPublisher(String publisher)
	{
		this.publisher=publisher;
		return this.publisher;
	}
	public String setCopyright(String copyright)
	{
		this.copyright=copyright;
		return this.copyright;
	}
	public String toString()
	{
		this.toString="Title: "+title+"\n"+"Author: "+author+"\n"+"publisher: "+publisher+"\n"+"Copyright: "+copyright;
		return this.toString;
	}

	
}
