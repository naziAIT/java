public class BookLib {
    private String title;
    private String author;
    private int yearPublished;

    public BookLib(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public String getBookInfo() {
        return title + " - " + author + " (" + yearPublished + ")";
    }

    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
    }

    public void printBook() {
        System.out.println("This is a book.");
    }

    public String BookType() {
        return "Unknown Type";
    }
}

class PrintedBook extends BookLib {
    private int numberOfPages;
    private String publisher;
    private int price;

    public PrintedBook(String title, String author, int yearPublished, int numberOfPages, String publisher, int price) {
        super(title, author, yearPublished);
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
        this.price = price;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBookInfo() {
        return super.getBookInfo() + ", Pages: " + numberOfPages + ", Publisher: " + publisher + ", Price: $" + price;
    }

    public void printBookDetails() {
        System.out.println("Printed Book Information:");
        super.printBookDetails();
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: $" + price);
    }

    public void printBook() {
        System.out.println("This is a printed book.");
    }

    public String BookType() {
        return "Printed";
    }
}

class EBook extends BookLib {
    private String fileSizeMB;
    private String fileFormat;
    private int price;

    public EBook(String title, String author, int yearPublished, String fileSizeMB, String fileFormat, int price) {
        super(title, author, yearPublished);
        this.fileSizeMB = fileSizeMB;
        this.fileFormat = fileFormat;
        this.price = price;
    }

    public String getFileSizeMB() {
        return fileSizeMB;
    }

    public void setFileSizeMB(String fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBookInfo() {
        return super.getBookInfo() + ", File Size: " + fileSizeMB + ", Format: " + fileFormat + ", Price: $" + price;
    }

    public void printBookDetails() {
        System.out.println("E-Book Information:");
        super.printBookDetails();
        System.out.println("File Size: " + fileSizeMB);
        System.out.println("Format: " + fileFormat);
        System.out.println("Price: $" + price);
    }

    public void printBook() {
        System.out.println("This is an e-book.");
    }

    public String BookType() {
        return "E-Book";
    }
}

class BookMain {
    public static void main(String[] args) {
        BookLib printedBook = new PrintedBook("Python", "Jaina", 2005, 210, "Naz", 600);
        printedBook.printBook();
        printedBook.printBookDetails();
        System.out.println("Book Type: " + printedBook.BookType());

        BookLib ebook = new EBook("JavaScript", "Bermet", 2000, "4.5 MB", "PDF", 890);
        ebook.printBook();
        ebook.printBookDetails();
        System.out.println("Book Type: " + ebook.BookType());
    }
}
