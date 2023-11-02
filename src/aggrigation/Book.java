package aggrigation;

public class Book 
{
	String bookname;
	int price;
	Author Atr;
	
	
	public Book(String bookame, int price, Author atr) {
		super();
		this.bookname = bookame;
		this.price = price;
		Atr = atr;
	}
	public void display()
	{
	System.out.println("Book Name  : "+bookname+"  Price : "+price+"  Author Name : "+Atr.authorname+"  Place is "+ Atr.place+ "  Author Age : "+Atr.age);
	}
	public static void main(String args[])
	{
	Author a= new Author("Abdhulkalam", "Delhi", 65);
	Book b= new Book("Wingsoffire",1250,a);
	b.display();
	}

}
