package PP5_7;

public class Bookshelf 
{
	static Book book1;
	static Book book2;
	static Book book3;
	static Book book4;
	public Bookshelf()
	{
		book1=new Book("Stuff", "moreStuff", "EvenMoreStuff", null);
		book2=new Book("Stuff", "moreStuff", "EvenMoreStuff", null);
		book3=new Book("Stuff", "moreStuff", "EvenMoreStuff", null);
		book4=new Book("Stuff", "moreStuff", "EvenMoreStuff", null);
		
	}
	public static void main(String[]args)
	{
		Bookshelf bookshelf= new Bookshelf();
		book1.getCopyright();
		book2.getPublisher();
		book3.getAuthor();
		book4.getTitle();
	}
}
