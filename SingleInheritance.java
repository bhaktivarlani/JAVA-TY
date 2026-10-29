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

    void show()
    {
        Scanner sc = new Scanner(System.in);

        getBookData();

        System.out.print("Enter price: ");
        price = sc.nextDouble();

        System.out.println("\nAuthor = " + author + "\nTitle = " + title + "\nPublisher = " + publisher + "\nPrice = " + price);
    }
}

public class SingleInheritance
{
    public static void main(String args[])
    {
        BookInfo b[] = new BookInfo[3];

        for(int i = 0; i < 3; i++)
        {
            b[i] = new BookInfo();

            System.out.println("\nEnter details of Book " + (i + 1));
            b[i].show();
        }
    }
}