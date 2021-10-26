class Book
{
    public void display(String name, String author)
    {
        System.out.println("The name of the book is :"+name);
        System.out.println("The author is :"+author);
    }
}

class Reference_Book extends Book
{
    public void display(String name, String author)
    {
        System.out.println("The name of the reference book is: "+name);
        System.out.println("The author of the reference book is: "+author);
    }
}

class Magazine extends Book
{
    public void display(String name, String author)
    {
        System.out.println("The name of the Magazine is: "+name);
        System.out.println("The author of the Magazine is: "+author);
    }
}

public class MultipleInheritance
{
    public static void main(String args[])
    {
        Book book = new Book();
        book.display("BookName","BookAuthor");
        Reference_Book rbook = new Reference_Book();
        rbook.display("RefName","RefAuthor");
        Magazine mg = new Magazine();
        mg.display("MagName","MagAuthor");
    }

}

