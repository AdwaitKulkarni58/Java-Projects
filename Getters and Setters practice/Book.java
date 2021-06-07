public class Book{
  private String bookName;
  private int isbnNumber;
  private String authorName;
  private String publisher;

  public Book(){
    bookName = "";
    isbnNumber = 0;
    authorName = "";
    publisher = "";
  }
  
  public Book(String b, int i, String a, String p){
    bookName = b;
    isbnNumber = i;
    authorName = a;
    publisher = p;
  }

  public void setbookName(String bookName){
    this.bookName = bookName;
  }

  public String getbookName(){
    return bookName;
  }

  public void setISBNNumber(int isbnNumber){
    this.isbnNumber = isbnNumber;
  }

  public int getISBNNumber(){
    return isbnNumber;
  }

  public void setauthorName(String authorName){
    this.authorName = authorName;
  }

  public String getauthorName(){
    return authorName;
  }

  public void setPublisher(String publisher){
    this.publisher = publisher;
  }

  public String getPublisher(){
    return publisher;
  }
}