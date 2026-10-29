import java.util.Scanner;

class Book
{
    String author, title, publisher;

    void getBookData()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter author: ");
        author = sc.nextLine();

        System.out.print("Enter title: ");
        title = sc.nextLine();

        System.out.print("Enter publisher: ");
        publisher = sc.nextLine();
    }
}

class BookInfo extends Book
{
    double price;

    void getBookInfo()
    {
        Scanner sc = new Scanner(System.in);

        getBookData();

        System.out.print("Enter price: ");
        price = sc.nextDouble();
    }
}

class BookSales extends BookInfo
{
    int copies;

    void show()
    {
        Scanner sc = new Scanner(System.in);

        getBookInfo();

        System.out.print("Enter copies sold: ");
        copies = sc.nextInt();

        System.out.println("\nAuthor = " + author);
        System.out.println("Title = " + title);
        System.out.println("Publisher = " + publisher);
        System.out.println("Price = " + price);
        System.out.println("Copies Sold = " + copies);
        System.out.println("Revenue = " + (price * copies));
    }
}

public class MultilevelI

{
    public static void main(String args[])
    {
        BookSales b = new BookSales();

        b.show();
    }
}