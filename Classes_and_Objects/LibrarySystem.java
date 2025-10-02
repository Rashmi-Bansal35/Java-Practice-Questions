package Classes_and_Objects;


class Book{
    static int totalBooks;
    String title, author, isbn;
    boolean isBorrowed;

    static{
        totalBooks = 0;
    }

    {
        totalBooks++;
    }

    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn){
        this("Unknown", "Unknown", isbn);
    }

    static int getTotalBooks(){
        return totalBooks;
    }

    void borrowBook(){
        if(isBorrowed == true){
            System.out.println(this.title+ " Book is already borrowed.");
        }
        else{
            System.out.println(this.title +" Book Check-out");
            isBorrowed = true;
        }
    }

    void returnBook(){
        System.out.println(this.title+ " Book check-in");
        isBorrowed = false;
    }
}

public class LibrarySystem {
    public static void main(String[] args){
        Book book1 = new Book("Physics", "HC Verma", "IHCV678");
        Book book2 = new Book("Mathematics", "RD Sharma", "MRD846");
        book1.borrowBook();
        book2.borrowBook();
        System.out.println(Book.getTotalBooks());
        book1.borrowBook();
        book1.returnBook();
    }
}
