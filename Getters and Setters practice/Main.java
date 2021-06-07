import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Book b = new Book();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the name of the book.\n");
    String name = sc.next();
    b.setbookName(name);

    System.out.println("Enter the ISBN number of the book.\n");
    int isbn = sc.nextInt();
    b.setISBNNumber(isbn);

    System.out.println("Enter the name of the author.\n");
    String auth = sc.next();
    b.setauthorName(auth);

    System.out.println("Enter the name of the publisher.\n");
    String publish = sc.next();
    b.setPublisher(publish);

    System.out.println("You entered:");
    System.out.println("Name of the book is: " + b.getbookName()); 
    System.out.println("ISBN number of the book is: " + b.getISBNNumber());
    System.out.println("Author of the book is: " + b.getauthorName());
    System.out.println("Publisher of the book is: " + b.getPublisher());
  }
}