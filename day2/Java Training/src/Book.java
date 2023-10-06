public class Book {
    private String isbnNo;
    private String bookName;
    private double price;

    public String toString() {
        return "Book [isbnNo=" + isbnNo + ", bookName=" + bookName + " , price=" + price + " ]";

    }

    public Book(String isbnNo, String bookName, double price) {
        super();
        // base ref first then derived
        // internally it is always called by java
        this.isbnNo = isbnNo;
        this.bookName = bookName;
        this.price = price;
    }

    public Book() {
        super();
    }

}
