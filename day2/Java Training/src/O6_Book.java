public class O6_Book
{
private  String isbnNo;
private String bookName;
private  double price;

public String toString()
{
    return "Book [isbnNo=" +isbnNo+", bookName=" +bookName + " , price=" +price +" ]";

}

public O6_Book(String isbnNo, String bookName, double price)
{
    super();
    this.isbnNo = isbnNo;
    this.bookName = bookName;
    this.price = price;
}

public O6_Book()
{
    super();
}

}
